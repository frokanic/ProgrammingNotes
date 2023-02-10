package com.example.programmingnotes.android

import android.graphics.Color
import android.graphics.Paint
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


const val needed_knowledge = """
    1. Lambdas  
    2. Delegates (mainly "by remember")
    3. State
    4.
    5.  6.
    7.  8.
    9.  10.
    11. 12.
    13. 14.
    15. 16.
    17. 18.
    19. 20.
"""


const val canvas_definition = """
    Canvas is the main class for drawing 2D graphics.
"""

const val using_canvas = """
    There are 2 ways to use Canvas. The first way, is to create a Canvas
        composable. The second one is by applying .drawBehind{} to a 
        composable's modifier. Usually, we'll go for the first option.
"""


const val offset_definition = """
    A point in the object's cartesian coordinate system. For example, the 
        val "offset" down below, is the point sitting at (5, 5) of the 
        cartesian coordinate system, that starts from the upper left 
        corner of the object's constraints. It is immutable.
        
    Offset.Zero represents the (0,0) point in the coordinate system.
"""

val offset = Offset(5f, 5f)


const val stroke_definition = """
    Stroke can be defined as the outline around a shape. Sometimes you want 
        an outline around your shape and to do that you can use the stroke 
        tag. You can specify the width and color of the outline using width 
        and color 
"""


const val brush_definition = """
    Brush in the Android Compose UI library is used to define how a shape or 
        an area should be filled or drawn. It can be a solid color, a gradient, 
        or a pattern. It works like paint in art, you choose a brush to fill or 
        outline a shape, and the brush determines the color and style of the fill 
        or outline. The Brush is then passed as an argument to a drawing function, 
        such as DrawRect, to specify how the shape should be filled or stroked
"""

const val apply_explained = """
    .apply{} in a scope function. It returns the class it is used in, with all the 
        changes applied
"""


const val drawing_shapes = """
    The Canvas composable gives us a drawscope. Think of it as a list of option you have 
        to draw on a physical canvas. Two important options are center, which is of type 
        Offset, and size. Other than that, I have drawLine, drawRect ect functions
"""


const val detecting_clicks = """
    To detect clicks, I use the .pointerInput function of the Modifier class. This 
        function takes as a parameter a boolean value. In its body, I can use functions, 
        such as detectTapGestures, to detect taps, dragging ect
"""


const val drawing_text = """
    Canvas does not contain a function to draw text. So we'll have to resort to the native
        Canvas. This is done by drawContext.canvas.nativeCanvas, inside the Canvas 
        composable, as shown in the example down below
"""

@Composable
fun CustomText(
    text: String,
    modifier: Modifier
) {
    Canvas(
        modifier = Modifier.fillMaxSize()
    ) {
        drawContext.canvas.nativeCanvas.apply {
            drawText(
                text,
                100f,
                100f,
                Paint().apply {
                    color = Color.RED
                    textSize = 50f
                }

            )
        }
    }
}


const val styleTip = """
    Instead of passing a plethora of arguments to the style parameter, you can create
        a data class, containing them, as shown below
"""


// ...
//      style = ScaleStyle(scaleWidth = 150.dp)
// ...

data class ScaleStyle(
    val scaleWidth: Dp = 100.dp,
    val radius: Dp = 550.dp,
    val normalLineLength: Dp = 15.dp,
    val fiveStepLineLength: Dp = 25.dp,
    val tenStepLineLength: Dp = 35.dp
)


const val drawing_shadows = """
    Canvas does not contain a function to draw shadows. So we'll have to resort to the native
        Canvas. This is done by drawContext.canvas.nativeCanvas, inside the Canvas 
        composable, same as texts. It works as in xml
"""


const val colorsARGB = """
    In Jetpack Compose, Color.argb is a function that creates a color from a combination 
        of red, green, blue, and alpha values. The alpha value represents the transparency of 
        the color.

    The value of the alpha channel is an integer between 0 and 255, where 0 means fully 
        transparent and 255 means fully opaque. An alpha value of 127, for example, means that 
        the color is 50% transparent. An example is shown down below
        
    A good tool for testing argb colors is the: https://color.adobe.com/create/color-wheel
"""

val color = Color.argb(255, 0, 128, 255)























const val sources =     //Including but not limited to
    """
    1. 
    2. 
    3.  
    4. 
    5.  
    6. 
    7.  
    8. 
    9.  
    10. 
    11. 
    12. 
    13. 
    14. 
    15. 
    16. 
    17. 
    18. 
    19. 
    20. 
"""