# anagramChallengeSixt
This repository is to create a codebase for the challenge given by Sixt on Anagrams. I had used Gradle to build the project.

The following files will be part of this project.

1. build.gradle
   a. consists of Dependencies of Junit 5 for unit testing using Paramterized testing+
   b. consists of Guava but never used.
   c. consists of commons-math3
   
2. AnagramTask.java
   a. This is a class containing static method to check if the texts are Anagrams
   b. The logic uses the time complexity of o(n) - linear which I feel to be best for consideration.
   c. The logic uses space complexity of o(1)
   d. Algorithm: It uses a map which counts the frequency of each character and equals to other character
   e. Validations were introduced to handle the null values, String upper and lower cases, Length of the strings, whitespace characters etc.
   
3. AnagramTaskUnitTest.java
   a. Uses JUNIT 5 for unit testing. Please make sure you have the setup for Junit 5 or compile the project using Gradle. The dependencies will be compiled.
   b. Run the tests using Junit 5.
   c. Uses Parametrized Test for comparing two strings so that different inputs can be given at a time.
   d. Tests valid Anagram Texts
   e. Tests invalid Anagram Texts
   f. Tests null values
   g. Tests with whitespaces in between the words, in between the characters, at the start and at the end.

