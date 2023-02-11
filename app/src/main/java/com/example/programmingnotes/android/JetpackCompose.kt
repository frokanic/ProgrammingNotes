package com.example.programmingnotes.android

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import kotlin.random.Random



const val arrangementAndAlignment = """
    Columns and rows have a main and a cross axis. 
    
    In Columns, we have the verticalArrangement and horizontalAlignment properties.
        Arrangement is responsible for how the items are distributed in the main axis, 
        alignment for where the main axis sits in the cross axis. If the modifier is 
        not set to .fillMaxSize() or .fillMaxWidth, the cross axis is smaller than the
        x-axis.
        
    In Rows, we have the horizontalArrangement and verticalAlignment properties.
    
    Boxes have contentAlignment
"""


const val measurementUnits = """
    dp: Stands for "density-independent pixels". Used to specify the size of UI elements 
        that should scale proportionally based on the screen density.
    
    sp: Stands for "scale-independent pixels". Used to specify the size of text that 
        should also scale based on the user's preferred font size setting. Used almost 
        exclusively for text (So for fontSize).
        
    Density refers to the number of pixels within a physical area of the screen. It is a 
        measure of the resolution of a display and is expressed as dots per inch (dpi).
"""


const val weightProperty = """
    Used only in rows and columns, to give an assigned space to the items of out rows or 
        columns.
"""

const val stackingInCompose = """
    In Compose, what we put first, goes to the bottom of a stack. Useful for Box composables
"""


const val fonts = """
    To create a fontFamily for my texts, I first create a fontFamily variable, that is an 
        object of the FontFamily class, and takes Font(R.font.<font name>, FontWeight.<font weight>
        as parameters. This is created outside my composable functions, so it has a global 
        scope, and is not affected by recompositions.
        
    Then, I pass the object to the fontFamily property, in the Text()'s constructor.
    
    Fonts can be found and downloaded here: https://fonts.google.com/
"""


const val stateExplained = """
    In Jetpack Compose, the state refers to the variables or data that are kept track of 
        and can change during the lifetime of a composable. When the state changes, the 
        composable is recomposed, which means that the updated state is used to generate 
        new UI content. The state is defined using the state or mutableStateOf functions, 
        and can be updated using the set function.
        
    MutableState is a special type of state in Jetpack Compose that is designed to hold 
        values that may change during the lifetime of a composable. As the name suggests, 
        the values stored in a MutableState object can be mutated (modified) dynamically, 
        as opposed to the state object in Jetpack Compose which holds values that are set 
        once and cannot be changed afterwards.

    When the value of a MutableState object changes, Jetpack Compose will automatically 
        detect the change and redraw the user interface to reflect the updated value. This 
        makes it easier to manage UI state, as you can simply update the values stored in a 
        MutableState object and Jetpack Compose will take care of the rest. This can greatly 
        simplify the process of building dynamic and responsive user interfaces in Android.
    
    Simply put, in Jetpack Compose, state refers to how a given UI looks at a given moment.
    
    Usually, mutableStateOf is used, to create variables. To change them, we use the .value 
        property.
"""

const val rememberKeyword = """
    By using the remember keyword, as shown below, when a function is recomposed, the latest
        value that was assigned to the variable, remains stored to it. So, the variable is not 
        being reset to its initial value.
"""

@Composable
fun rememberExample(modifier: Modifier = Modifier) {
    val color = remember { mutableStateOf(Color.Cyan) }

    Box(modifier = modifier
        .background(color.value)
        .clickable {
            color.value = Color(
                Random.nextFloat(),
                Random.nextFloat(),
                Random.nextFloat(),
                1f
            )
        }
    )
}

