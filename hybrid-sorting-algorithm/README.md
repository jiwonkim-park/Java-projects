# Hybrid Sorting Algorithm
This project makes a hybrid sorting algorithm combining merge sort and insertion sort algorithm, to boost the performance of merge sort algorithm.

## What is Hybrid Sorting Algorithm?

How can we make the mergesort algorithm have better performance? One of the possible solutions is a hybrid sorting algorithm which combines the mergesort with insertion sorting algorithm. The hybrid sorting algorithm begins with the mergesort and switches to the insertion sorting algorithm when the size of subarray is equal to 32 (The size of the last subarray can be less than 32). This algorithm takes the advantages of both algorithms achieving practical performance on typical data sets. Especially, the hybrid sorting algorithm is better performance than the basic mergesort in the best case.

The goal is to implement a program that sorts the given key-value pairs in lexicographic order using the hybrid sorting algorithm, in *HybridSorter.java*, *InsertionSorter.java*. Several rules that this project follows are as follows:
- The program runs through Main class. The main class should handle inputs and outputs using standard I/O in JAVA.
- The number of given key-value pair doesn’t exceed 1,000,000.
- All keys are distinct.
- The program is finished within 7 seconds.
- The hybrid sorting algorithm and the level to switch the sorting algorithm are important to ensure 𝑂(𝑛 log 𝑛) time complexity in the worst case, and better performance in the best case.
