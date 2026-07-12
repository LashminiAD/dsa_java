# Largest K Elements

## Problem
Given an array of priorities, return the **largest `K` elements** in descending order.

## Approach
- Sort the array in ascending order.
- The largest elements are located at the end of the sorted array.
- Start iterating from the last index (`N - 1`).
- Continue until index (`N - K`).
- Add each element to the result list.

## Why `N - K` Instead of `K`?
After sorting:

```text
Index : 0 1 2 3 4
Value : 1 2 4 6 8
```

For `N = 5` and `K = 2`:

- Start from index `N - 1 = 4` → `8`
- Stop at index `N - K = 3` → `6`

Visited indices:

```text
4 → 3
```

Output:

```text
8 6
```

If we used `i >= K`:

```text
i = 4 → 3 → 2
```

Output:

```text
8 6 4
```

This returns **3 elements** instead of **2**, which is incorrect.

## Time Complexity
- Sorting: **O(N log N)**
- Traversing `K` elements: **O(K)**
- Overall: **O(N log N)**

## Space Complexity
**O(K)** (for storing the result)

## Learning
- `Collections.sort()`
- Sorting Lists in Java
- Accessing the largest elements after sorting
- Understanding why the last `K` elements start from index `N - K`
- Difference between `K` (count of elements) and `N - K` (starting index of the largest `K` elements)
```
