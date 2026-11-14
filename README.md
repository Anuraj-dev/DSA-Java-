<h1 align="center">DSA Java</h1>

<p align="center">
  Java practice for data structures and algorithms, one folder per topic.<br />
  Open a file, compile it, run it. No build tool, no tests, no dependencies.
</p>

This repo follows the Apna College DSA track in Java. Each folder covers one topic. It starts with a main walkthrough file that shows the language feature or algorithm, then practice files with questions to solve. Some files keep earlier examples commented out, so uncomment a block to run it.

You need a JDK 8 or newer on your `PATH`. Some programs read input with `Scanner`, so they stop and wait for you to type values.

## What you get

- **Walkthrough first, then practice.** Each folder has a main walkthrough file, and the practice files sit next to it. Comments call out the gotchas, such as `Strings` being immutable and `==` comparing object references instead of text in `Strings/Strings.java`.
- **Arrays from search to subarray sums.** `Arrays/Array_imp1.java` has linear and binary search, and it notes that binary search needs a sorted array. `Arrays_II/Arrays_Imp.java` covers prefix sums, Kadane's max subarray sum and trapping rain water, each with an optimised version.
- **Sorting written out by hand.** `BasicSorting/Sorting.java` implements bubble, selection, insertion and counting sort. Each returns the sorted `int[]`, and bubble sort stops early when a pass makes no swap.
- **Bit tricks on `int` values.** `BitManipulation/BitManipulation.java` runs the `&`, `|`, `^`, `~`, `<<` and `>>` operators. `BitManipulationPQ.java` builds on them to check odd or even, get, set, clear and update the ith bit, clear a range of bits, and test for a power of two.
- **Matrix problems on 2D arrays.** `2D-Arrays/MatricesPQ.java` prints a matrix in spiral order, sums the diagonals, and searches a sorted matrix in staircase order.
- **Pattern printing with nested loops.** `Patterns/PatternsAdv.java` prints hollow rectangles, Floyd's triangle, butterflies, solid and hollow rhombuses, and inverted pyramids.
- **Terminal input with `Scanner`.** Fourteen files read from `System.in` through `Scanner`, so they wait until you type the values they ask for.

## Topics

| Folder | What is in it |
| --- | --- |
| `Variables & Data Types` | Variables, reading input with `Scanner`, first practice set |
| `Operators` | Increment, relational and logical operators. Includes `Operator Precedence_V1.1.pdf` |
| `Conditionals` | `if` / `else` and the ternary operator |
| `Loops` | `while` and `for` loops, sum of natural numbers, factorial |
| `Patterns` | Star and number patterns, plus the advanced set in `PatternsAdv.java` |
| `Function` | Methods, overloading, factorial, nCr, primes, binary and decimal conversion |
| `Arrays` | 1D arrays, passing arrays to methods, linear and binary search, reverse, subarray sums. Includes a Space and Time Complexity PDF |
| `Arrays_II` | Prefix sums, Kadane's algorithm, trapping rain water, buy and sell stocks, search in a rotated sorted array |
| `2D-Arrays` | Min and max, search, transpose, spiral print, diagonal sum, staircase search |
| `Strings` | Immutability, `==` versus `equals`, `StringBuilder`, palindromes, anagrams, compression, substrings |
| `BitManipulation` | Bitwise and shift operators, get, set and clear bits, power of two |
| `BasicSorting` | Bubble, selection, insertion and counting sort |
| `OOPS` | Classes with fields and setter methods, and a `private` password field |

## Running a file

From the repo root, compile one file into `out/` and run its class:

```sh
javac -d out Arrays/Array.java
java -cp out Arrays.Array
```

`-d out` keeps the `.class` files out of the source folders. The name you pass to `java` is the class name. If the file has a `package` line, put the package in front. `Arrays/Array.java` declares `package Arrays;`, so it runs as `Arrays.Array`. `2D-Arrays/Matrices.java` has no package, so it runs as `Matrices`:

```sh
javac -d out 2D-Arrays/Matrices.java
java -cp out Matrices
```

Quote paths that contain spaces or `&`:

```sh
javac -d out "Variables & Data Types/Input_in_jv.java"
java -cp out Input_in_jv
```

Type the input when the program asks, or pipe it in:

```sh
printf '90 80 70\n' | java -cp out Arrays.Array
```

Two files are both named `JavaBasics`, in `Operators` and `Variables & Data Types`. A new build replaces the `.class` file with the same name in `out/`, so compile and run one file at a time.
