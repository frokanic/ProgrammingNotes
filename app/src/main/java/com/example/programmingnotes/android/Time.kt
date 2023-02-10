package com.example.programmingnotes.android




const val getCurrentTimeInAndroid = """
    In android, to get the current time, I use the System.currentTimeMillis() method.
        This method returns a Long. Down below, you will find an example of getting 
        the current time, as well as Converting it to seconds, minutes and hours.
        
    The System.currentTimeMillis method in Android returns the number of milliseconds 
        that have passed since the Unix epoch (January 1, 1970, at 00:00:00 UTC), so 
        it does not take into account the time zone. The time zone is not considered 
        because the Unix epoch is defined as a global, standardized time that is 
        independent of any specific time zone.
        
    Taking the remainder when divided by 60 using the modulo operator (% 60f), ensures 
        that the values of seconds and minutes are always between 0 and 59
        
    Also, we can see below, 2f, or 2.0, is added to the hours parameter. This is done 
        to take the timezone into consideration
"""

val currentTime = System.currentTimeMillis()
val seconds = ((currentTime / 1000f) % 60f)
val minutes = (((currentTime / 1000f) / 60) % 60f)
val hours = ((currentTime / 1000f) / 3600f + 2f)


const val millisecondsToSeconds = """
    1 millisecond = 0.001 seconds, or 1 second = 1000 milliseconds.
"""

const val furtherExplainingTheSecondsVariable = """
    The System.currentTimeMillis() method returns a Long, for example 1675994900979.
        By dividing it by 1000, we get the seconds passed from January 1, 1970, 
        at 00:00:00 UTC, instead of the milliseconds. The modulo operator removes 
        from that all the full 60 seconds cycles, and leaves us with the unfinished one, 
        that sits somewhere between 0 and 59.
"""