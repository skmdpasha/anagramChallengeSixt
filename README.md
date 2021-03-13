# AnagramChallengeSixt
This repository is to create a codebase for the challenge given by Sixt on Anagrams. I had used Gradle to build the project.

The following files will be part of this project.

#### build.gradle
* consists of Dependencies of Junit 5 for unit testing using Paramterized testing
* consists of Guava but never used.
* consists of commons-math3

#### AnagramTask.java
* This is a class containing static method to check if the texts are Anagrams
* The logic uses the time complexity of o(n) - linear which I feel to be best for consideration.
* The logic uses space complexity of o(1)
* Algorithm: It uses a map which counts the frequency of each character and equals to other character
* Validations were introduced to handle the null values, String upper and lower cases, Length of the strings, whitespace characters etc.

#### AnagramTaskUnitTest.java
* Uses JUNIT 5 for unit testing. Please make sure you have the setup for Junit 5 or compile the project using Gradle. The dependencies will be compiled.
* Run the tests using Junit 5.
* Uses Parametrized Test for comparing two strings so that different inputs can be given at a time.
* Tests valid Anagram Texts
* Tests invalid Anagram Texts
* Tests null values
* Tests with whitespaces in between the words, in between the characters, at the start and at the end.
