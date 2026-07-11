# Mary and Flowers

## Problem Statement

Given a sorted array of flower values and a target value `t`, find the indices of the two flowers whose sum equals `t`.

- Exactly one valid pair always exists.
- If multiple pairs exist, return the first occurrence.
- Indices are **0-based**.

---

## Approach

1. Traverse the array using two nested loops.
2. For each element, check every element after it.
3. If the sum of two elements equals the target:
   - Store their indices in the result array.
   - Return immediately to ensure the first valid pair is selected.

---

## Algorithm

- Iterate `i` from `0` to `n-2`.
- Iterate `j` from `i+1` to `n-1`.
- If `arr[i] + arr[j] == t`:
  - `result[0] = i`
  - `result[1] = j`
  - Return.

---

## Time Complexity

**O(N²)**

Two nested loops are used.

---

## Space Complexity

**O(1)**

No extra data structures are used.

---

## Java Concepts Used

- Arrays
- Nested loops
- Functions
- Conditional statements

---

## Key Learning

- Brute-force approach for the Two Sum problem.
- Returning immediately ensures the first valid pair is selected.
- Since exactly one valid pair exists, no additional checks are required.

---

## Optimized Approach

Since the array is already sorted, this problem can also be solved using the **Two Pointer** technique.

### Time Complexity
**O(N)**

### Space Complexity
**O(1)**

This is a more efficient solution than the brute-force approach.
