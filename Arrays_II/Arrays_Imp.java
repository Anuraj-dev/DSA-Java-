package Arrays_II;

public class Arrays_Imp {
        public static void optimisedMaxSubArrSum(int num[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];
        
        //?Calculate prefix array
        prefix[0] = num[0];
        for(int i = 1; i<num.length; i++){
            prefix[i] = prefix[i-1] + num[i];
        }

        for(int i = 0; i<num.length; i++){
            for(int j = i; j<num.length; j++){
                //? Cal Prefix sum
                currSum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
        
                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
        }
         System.out.println("MaxSum: " + maxSum);
    }

    //? Kadans algorithm of max subarray sum this is the most optimised approach O(n)
    public static void kadansAlgoMaxSubArraySum(int num[]){
        int currSum = num[0], maxSum = num[0];    //! This is just best practice u can also init the currsum to 0 and maxsum to -infinity that will  work too
        for(int i = 1; i<num.length; i++){
            if(currSum<0){
                currSum = num[i];
            } else{
                currSum += num[i];
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Max SubArray Sum using Kadans algo: " + maxSum);
    }

    //? Tapping rainwater problem
    public static void trappingRainWater(int height[]){
        int trappedWater = 0;
        int totalTrappedWater = 0;
        for(int i= 1; i<height.length-1; i++){
            int maxLeft = 0, maxRight=0;
            for(int j = i-1; j>=0; j--){
                if(maxLeft < height[j]){
                    maxLeft = height[j];
                }
            }
            for(int j = i+1; j<height.length; j++){
                if(maxRight < height[j]){
                    maxRight = height[j];
                }
            }
            trappedWater = Math.min(maxLeft, maxRight) - height[i];    //! The actual formula is (min(maxL,MaxR) - height[i]) * width || But here wid = 1 so not writing that
            if(trappedWater < 0){
                trappedWater =0;
            }
            System.out.println("Trapped watter in " + i + " is: " + trappedWater);
            totalTrappedWater += trappedWater;
        }
        System.out.println("Total trapped water is: " + totalTrappedWater);
    }

    //! Optimised version of trapped rain water problem
    public static void optimisedTrappedRainWater(int height[]){
        // calculate maxLeft boundary array
        int leftMax[] = new int[height.length];     //! Don't make silly mistake by write like new int[height.length-1] it will create 6 means upto 5 :(
        leftMax[0] = height[0];
        for(int i = 1; i<height.length; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        // calculate maxRight boundary array
        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int i = height.length-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        //loop
        int totalTrappedWater = 0;
        for(int i = 1; i<height.length-1; i++){
            //waterlevel = min(maxLeft bound, maxRight bound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            //trapped water = waterlevel - height[i]
            int trappedWater = waterLevel - height[i];
            totalTrappedWater+= trappedWater;
            System.out.println("Trapped watter in " + i + " is: " + trappedWater);
        }
        System.out.println("Total trapped water is: " + totalTrappedWater);
    }

    //? Solving another problem called Buy & sell stocks
    public static void buyAndSellStocks(int price[]){
        int buyPrice = price[0], maxProfit = 0;
        for(int i = 1; i< price.length; i++){
            if(buyPrice < price[i]){ //Profit
                int profit = price[i] - buyPrice;  //todays profit profit
                maxProfit = Math.max(maxProfit, profit);
            } else{                       
                buyPrice = price[i];
            }
        }
        System.out.println("Max Profit u can make from stock is: " + maxProfit);

    }

    public static void main(String[] args) {
        int num[] = {-1, 3, -5, 8};
        int height[] = {4,2,0,6,3,2,5};
        int prices[] = {7,1,5,3,6,4};

        //? Optimised maxSUM
        // optimisedMaxSubArrSum(num);       

        //? Kadans algorithm of calculating Max sub array sum
        // kadansAlgoMaxSubArraySum(num);

        //? Trapping rain water problem solved (Brute force) -  Tried by me
        // trappingRainWater(height);

        //? Optimised to O(n) with the help of mams logic Trapping rainwater problem
        // optimisedTrappedRainWater(height);

        //? Calculating max profit we can make
        buyAndSellStocks(prices);
    }
}
