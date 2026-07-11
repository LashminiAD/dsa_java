# The Archive Room

## Problem Statement

Given a list of operations on a stack:

- `ADD X` → Push the integer `X` onto the stack.
- `REMOVE` → Remove the top element from the stack.

After performing all operations, return the value at the top of the stack. If the stack is empty, return `-1`.

---

## Approach

1. Create a `Stack<Integer>`.
2. Traverse all operations.
3. Split each operation using `split(" ")`.
4. If the operation is `ADD`, parse the integer and push it onto the stack.
5. If the operation is `REMOVE`, pop the top element if the stack is not empty.
6. After processing all operations:
   - Return `stack.peek()` if the stack is not empty.
   - Otherwise, return `-1`.

---

## Algorithm

- Initialize an empty stack.
- For each operation:
  - Split the string by space.
  - If the first part is `"ADD"`:
    - Convert the second part to an integer.
    - Push it onto the stack.
  - Else:
    - Pop the top element if the stack is not empty.
- Return the top element or `-1` if the stack is empty.

---

## Time Complexity

**O(N)**

Each operation is processed exactly once.

---

## Space Complexity

**O(N)**

In the worst case, all `ADD` operations remain in the stack.

---

## Java Concepts Used

- Stack
- List
- split()
- parseInt()
- peek()
- push()
- pop()
- String comparison using `equals()`

---

## Key Learning

- `split(" ")` divides a string whenever a space is encountered.
- `parts[0]` stores the operation (`ADD` or `REMOVE`).
- `parts[1]` stores the integer value for `ADD`.
- Always use `equals()` instead of `==` for comparing strings in Java.
