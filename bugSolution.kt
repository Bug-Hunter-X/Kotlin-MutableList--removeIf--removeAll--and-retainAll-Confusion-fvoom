fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    // removeIf: Removes elements that satisfy the predicate.
    list.removeIf { it % 2 == 0 }
    println("removeIf: " + list) // Output: [1, 3, 5]

    val list2 = mutableListOf<Int>(1, 2, 3, 4, 5)
    // removeAll: Removes all elements matching any element from the given collection.
    list2.removeAll { it % 2 == 0 }
    println("removeAll: " + list2) // Output: [1, 3, 5]

    val list3 = mutableListOf<Int>(1, 2, 3, 4, 5)
    // retainAll: Retains only elements that satisfy the predicate.
    list3.retainAll { it % 2 != 0 }
    println("retainAll: " + list3) // Output: [1, 3, 5]

    // Safer approach using filter and toMutableList to avoid side-effects
    val numbers = mutableListOf(1, 2, 3, 4, 5)
    val oddNumbers = numbers.filter { it % 2 != 0 }.toMutableList() 
    println("Safe approach: " + oddNumbers) //Output [1,3,5]
    println("Original list: " + numbers) // Output: [1, 2, 3, 4, 5] 
} 