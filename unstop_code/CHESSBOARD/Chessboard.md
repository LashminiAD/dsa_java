# Chessboard

## Problem
Determine whether the given chessboard cell is Black or White.

## Approach
- Convert column ('a' to 'h') into numbers (1 to 8).
- Convert row character to integer.
- If (row + column) is even → Black.
- Otherwise → White.

## Time Complexity
O(1)

## Space Complexity
O(1)

## Learning
- charAt()
- Character to integer conversion
- ASCII arithmetic
- Modulo (%)
