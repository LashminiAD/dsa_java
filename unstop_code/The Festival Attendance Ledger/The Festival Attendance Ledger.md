# The Festival Attendance Ledger

## Problem Statement

Given a sequence of Visitor IDs recorded in a festival attendance ledger, determine:

- The Visitor ID that appears the maximum number of times.
- Its frequency.
- If multiple Visitor IDs have the same highest frequency, return the **smallest Visitor ID**.

---

## Approach

1. Create a `HashMap` to store the frequency of each Visitor ID.
2. Traverse the array and update the frequency of every ID.
3. Traverse the `HashMap` entries:
   - If the current frequency is greater than the maximum frequency, update the answer.
   - If the frequency is equal to the maximum frequency, choose the smaller Visitor ID.
4. Return the Visitor ID with the highest frequency and its count.

---

## Algorithm

- Initialize a `HashMap<Integer, Integer>`.
- Count the frequency of each Visitor ID.
- Initialize:
  - `maxFreq = 0`
  - `answer = Integer.MAX_VALUE`
- Traverse all entries in the map:
  - If `freq > maxFreq`
    - Update `maxFreq`
    - Update `answer`
  - Else if `freq == maxFreq` and `id < answer`
    - Update `answer`
- Return `{answer, maxFreq}`.

---

## Time Complexity

**O(N)**

- One traversal to count frequencies.
- One traversal through the HashMap.

---

## Space Complexity

**O(N)**

A HashMap is used to store the frequency of each unique Visitor ID.

---

## Java Concepts Used

- HashMap
- Arrays
- Loops
- Functions
- Map.Entry
- Conditional statements

---

## Key Learning

- Efficient frequency counting using a `HashMap`.
- Using `getOrDefault()` to simplify frequency updates.
- Handling tie cases by comparing Visitor IDs.
- Returning multiple values using an integer array.

---

## Why HashMap?

A `HashMap` provides average **O(1)** time complexity for insertion and lookup operations, making it ideal for counting frequencies efficiently.

Without a `HashMap`, counting frequencies would require nested loops, resulting in **O(N²)** time complexity.

---

## Example

### Input

```
7
101 205 101 310 205 101 205
```

### Frequency Table

```
101 → 3
205 → 3
310 → 1
```

### Output

```
101 3
```

Since both `101` and `205` appear three times, the smaller Visitor ID (`101`) is returned.
