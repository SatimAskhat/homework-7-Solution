# homework-7-Solution
# Streaming Service Iterator

This project is a simulation of a simple Netflix-like episode player. It demonstrates how to use the **Iterator Design Pattern** in Java to navigate through episodes and seasons of a TV series in different orders (normal, reverse, and shuffle).

## 📌 What It Does

- Each `Season` contains a list of `Episode` objects.
- The UI (or player) can loop through episodes without knowing how they’re stored.
- Different iterator classes allow you to go through the season:
  - In regular order
  - In reverse order
  - In random (but repeatable) order
- There's also a `BingeIterator` that connects all seasons together, so you can watch the whole series straight through.

##  Why Not Just Use List<Episode>?

Good question! Instead of exposing the internal list of episodes, we use iterators to:
- Hide how episodes are stored (could be `ArrayList`, `LinkedList`, or even streamed from disk).
- Give the flexibility to change the order of traversal without changing the core logic.
- Follow the **Single Responsibility Principle** – UI doesn't need to worry about data structures.

##  What I Learned

This project helped me understand:
- The difference between external and internal iterators.
- How to create multiple iterator strategies.
- Why the Iterator Pattern is useful when working with collections you don’t want to expose directly.

##  How to Run

Just compile and run the `Main` class. It prints out episode titles using each traversal strategy.

```bash
javac *.java
java Main
