# Contribution and Commit Guidelines

This document outlines the contribution and commit message conventions for this repository. Following these guidelines helps maintain a clean, readable, and logical commit history.

## The Golden Rule: One Problem, One Commit

To maintain a clean and logical history, each new LeetCode problem solved (including both the Java code and the Markdown explanation) should be contained in a single, atomic commit.

## Commit Message Format

This project follows the **Conventional Commits** specification. It provides a structured format that makes the commit history easy to read and navigate.

The basic format is:

```

<type>(<scope>): <subject>
<BLANK LINE>

<body>
<BLANK LINE>
<footer>

```

-----

### Component Explanations

#### `type`

This describes the kind of change the commit is providing. The following are the allowed types:

* **feat**: A new feature (used for **solving a new problem**).
* **docs**: Changes to documentation or explanation files only.
* **refactor**: A code change that neither fixes a bug nor adds a feature (e.g., optimizing an existing solution).
* **fix**: A bug fix in a previous solution.
* **perf**: A code change that improves performance.
* **style**: Changes that do not affect the meaning of the code (white-space, formatting, etc.).
* **chore**: Other changes that don't modify source or test files (e.g., updating build scripts).

#### `scope`

(Optional) The scope can be used to specify the section of the codebase affected. For this project, you can use `leetcode` or `problem` for consistency.

#### `subject`

A short, imperative summary of the change, written in the present tense.

* **Do:** `Solve 1. Two Sum`
* **Don't:** `Solved 1. Two Sum` or `Solving 1. Two Sum`
* **MUST** include the problem number and title.

#### `body`

(Optional) A more detailed, multi-line explanation of the changes. This is a great place to note the:

* Reasoning behind the approach.
* Time and Space Complexity analysis.

#### `footer`

(Optional) Contains any meta-data about the commit, such as a link to the problem on LeetCode.

-----

## Practical Examples

### 1\. Committing a New Solution

When you solve a new problem with both code and documentation.

```

feat(leetcode): Solve 217. Contains Duplicate

Implement solution using a HashSet for efficient O(1) average time
complexity lookups.

- Time Complexity: O(n)
- Space Complexity: O(n)

Problem: [https://leetcode.com/problems/contains-duplicate/](https://leetcode.com/problems/contains-duplicate/)

```

### 2\. Refactoring an Existing Solution

When you optimize the code for a previously solved problem.

```

refactor(leetcode): Optimize 1. Two Sum with HashMap

Improve the previous brute-force O(n^2) solution to use a HashMap.
The new approach achieves a linear time complexity.

- Time Complexity: O(n)
- Space Complexity: O(n)

```

### 3\. Updating Documentation Only

When you only change the `.md` explanation file for a problem.

```

docs(leetcode): Improve explanation for 125. Valid Palindrome

Add a detailed step-by-step walkthrough of the two-pointer approach and clarify how non-alphanumeric characters are handled.

```