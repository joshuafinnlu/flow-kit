package com.zeoflow.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER})
@Documented
public @interface Colour
{
    //format 6 digits - HEX without '#'
}
