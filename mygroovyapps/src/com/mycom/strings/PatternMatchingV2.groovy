package com.mycom.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//pattern matching
System.out.println("Regular expression using java");
String mydata = /hey;\$ hello 0 1 , how are you subramanian ,7m3/
//extract nos from the string.
//compile the pattern
Pattern compiledPattern = ~/\d+/
//verify the String against data.
Matcher digitMatcher = compiledPattern.matcher(mydata);
//extract data from the Matcher
while (digitMatcher.find()) {
    System.out.println(digitMatcher.group());
}

