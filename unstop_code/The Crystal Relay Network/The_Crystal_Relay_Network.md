# The Crystal Relay Network

## Problem Statement

Given `N` relay towers arranged in a line, each tower has an energy value.

A messenger starts at the first tower and must reach the last tower.

The messenger can jump from tower `i` to any tower `j` (`j > i`).

The energy cost of a jump is:

```
|Energy[i] - Energy[j]| × (j - i)
```

Find the minimum total energy required to reach the last tower.

---

## Approach

This problem is solved using **Dynamic Programming**.

- Let `dp[i]` represent the minimum energy required to reach tower `i`.
- Initialize:
  - `dp[0] = 0`
  - All other values as infinity.
- For every tower `i`, check every previous tower `j`.
- Calculate the jump cost from `j` to `i`.
- Update the minimum cost.

Transition:

```
dp[i] = min(dp[i], dp[j] + |energy[j] - energy[i]| × (i - j))
```

---

## Algorithm

1. Create a DP array of size `N`.
2. Initialize all values with `Integer.MAX_VALUE`.
3. Set `dp[0] = 0`.
4. For every tower:
   - Try jumping from every previous tower.
   - Compute the jump cost.
   - Update the minimum cost.
5. Return `dp[N-1]`.

---

## Time Complexity

```
O(N²)
```

Two nested loops.

---

## Space Complexity

```
O(N)
```

Used for the DP array.

---

## Learning

- Dynamic Programming (DP)
- Bottom-Up DP (Tabulation)
- State Transition
- Absolute Difference
- Minimum Cost Path
