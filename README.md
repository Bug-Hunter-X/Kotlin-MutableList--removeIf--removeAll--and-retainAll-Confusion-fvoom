# Kotlin MutableList: removeIf, removeAll, and retainAll Clarification

This example demonstrates potential confusion surrounding the use of `removeIf`, `removeAll`, and `retainAll` functions when working with `MutableList` in Kotlin.  These functions all modify the list in place, but with slight distinctions that can lead to unexpected results if not thoroughly understood.

The `bug.kt` file shows example usage of each function. The `bugSolution.kt` file provides explanations and potentially safer alternatives where confusion is likely to occur.