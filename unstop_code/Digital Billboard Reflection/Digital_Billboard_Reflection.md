# Digital Billboard Reflection

## Problem Statement

Given a matrix of size **R × C**, reflect it horizontally by reversing the elements of each row while keeping the row order unchanged.

### Example

**Input**
```
2 3
1 2 3
4 5 6
```

**Output**
```
3 2 1
6 5 4
```

---

## Approach

- Traverse each row of the matrix.
- Use two pointers:
  - Left pointer starts from the beginning of the row.
  - Right pointer starts from the end of the row.
- Swap the elements at the left and right pointers.
- Move the pointers towards the center until they meet.
- Repeat for every row.

---

## Algorithm

1. Read the matrix.
2. For each row:
   - Initialize:
     - `left = 0`
     - `right = C - 1`
   - While `left < right`:
     - Swap `matrix[row][left]` and `matrix[row][right]`.
     - Increment `left`.
     - Decrement `right`.
3. Print the modified matrix.

---

## Java Solution

```java
public static int[][] reflectMatrix(int[][] matrix, int r, int c) {

    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c / 2; j++) {

            int temp = matrix[i][j];
            matrix[i][j] = matrix[i][c - 1 - j];
            matrix[i][c - 1 - j] = temp;
        }
    }

    return matrix;
}
```

---

## Dry Run

Input Row:

```
1 2 3 4 5
```

### Swap 1

```
5 2 3 4 1
```

### Swap 2

```
5 4 3 2 1
```

Final Row:

```
5 4 3 2 1
```

---

## Time Complexity

- **O(R × C)**

Each element is visited at most once during swapping.

## Space Complexity

- **O(1)**

The reflection is performed in-place without using any extra matrix.

---

## Key Concept

To find the mirrored element of column `j`, use:

```java
c - 1 - j
```

For example, if `c = 5`:

| Left Index (`j`) | Right Index (`c - 1 - j`) |
|-----------------:|--------------------------:|
| 0 | 4 |
| 1 | 3 |
| 2 | 2 |

Only iterate until `c / 2` because each swap correctly places two elements.
