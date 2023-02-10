package com.example.programmingnotes.kotlin




val delegationExplained = """
    In programming, delegation is a design pattern that allows one object to 
        delegate some of its responsibilities to another object. Delegation 
        is used to simplify the implementation of complex objects by breaking 
        down a complex task into smaller and more manageable components.

    Here's how it works:

    An object, known as the delegate, is defined to handle specific tasks or operations.
        Another object, known as the delegator, holds a reference to the delegate and 
        uses it to perform certain tasks.
        
    Since the reference is held to the memory address of the referenced object, not the 
        actual value of it, when the referenced object (delegate) changes, so does the 
        object that holds the reference (delegator).

    The delegator delegates a task or operation to the delegate, who is responsible 
        for performing the task.

    The key advantage of using delegation is that it promotes separation of concerns 
        and makes it easier to maintain and extend complex applications. It allows the 
        delegator to focus on its core responsibilities while delegating specific tasks 
        to the delegate, which is specifically designed to handle those tasks.

    Let's take the following example from Jetpack Compose
        var curTime by remember { mutableStateOf(time) }
     
    This is an example of a property delegate in Kotlin. The curTime is a delegated property 
        that uses the remember delegate, which is a delegate provided by the Jetpack Compose 
        library. The remember delegate allows you to store a value in a mutable state and 
        retrieve it later.

    Here, curTime is a delegate property that is backed by a mutable state object provided 
        by the mutableStateOf function. This function takes an initial value for the mutable 
        state, which in this case is the time variable. The curTime property is assigned the
        value of the mutable state and every time the value of curTime is changed, the 
        change is reflected in the mutable state.

    In this case, the curTime delegate property acts as a wrapper around the mutable 
        state, allowing you to use it like any other property in your code. You can 
        get or set the value of curTime just like you would with any other property. 
        When you do, the underlying mutable state is updated and any component that 
        is observing the state will be notified of the change.
"""

val delegationTranslationToGreek = """
        delegate: αναθέτω,
                  εξουσιοδοτώ,
                  απεσταλμένος, εκπρόσωπος, αντιπρόσωπος
                  
        Για τον παραπάνω ορισμό, θα χρησιμοποιήσω τις μεταφράσεις εκπρόσωπος κι 
            εκπροσωπουμενος αντίστοιχα
        
"""

val rememberKeywordExplainer = """
    The remember keyword in Jetpack Compose is a function that helps to manage state 
        in a composable function. It is used to store a value and persist it across 
        multiple invocations of the composable function. When remember is used, it 
        creates a delegate object that holds the state value and a reference to it is 
        stored in the curTime variable in the example you provided.

    The remember function is often used when you want to store a value that you want 
        to persist across different invocations of a composable function. For example, 
        when you have a value that you want to persist across screen transitions, you 
        can use the remember function to store it. The value will be kept in memory 
        even if the composable function is not currently being executed. When the function 
        is executed again, it will retrieve the value from memory and use it, rather 
        than recalculating it each time.

    In summary, the remember keyword is used to manage state in Jetpack Compose, it helps 
        to persist a value across multiple invocations of a composable function and can be 
        used to store values that you want to persist across different instances of a 
        composable function.
"""