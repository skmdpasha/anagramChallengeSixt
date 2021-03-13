package com.sixt.java.coding.challenge;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

/**
 * @author Pasha Shaik
 * This class is created to test the AnagramTask.
 */

public class AnagramTaskUnitTest {

  private static Stream<Arguments> provideValidAnagramTexts() {
    return Stream.of(
        Arguments.of("Dormitory", "Dirtyroom"),
        Arguments.of("Astronomer", "Moon starer"),
        Arguments.of("The eyes", "They see"),
        Arguments.of("Fourth of July", "Joyful Fourth"),
        Arguments.of("Eleven plus two", "Twelve plus one"),
        Arguments.of("Mother in law", "Hitler woman"),
        Arguments.of("The    Morse    Code", "Here    come    dots"),
        Arguments.of("A gentleman", "Elegant man"),
        Arguments.of("          Slot machines", "Cash lost in me                 "),
        Arguments.of("Sc h  oo l m aster", "The cl  a  ssroo  m"),
        Arguments.of("++", "++"));
  }

  @ParameterizedTest
  @MethodSource("provideValidAnagramTexts")
  public void testAllValidAnagrams(String text1, String text2) {
    assertTrue(AnagramTask.areTextsAnagrams(text1, text2));
  }


  private static Stream<Arguments> provideInValidAnagramTexts() {
    return Stream.of(
        Arguments.of("silenced", "hello"),
        Arguments.of("bye admire", "Moon Byer"),
        Arguments.of(null, "cab"),
        Arguments.of("banana", null),
        Arguments.of(null, null),
        Arguments.of("1", "2"),
        Arguments.of("Banana", "3"));
  }

  @ParameterizedTest
  @MethodSource("provideInValidAnagramTexts")
  public void testAllNotAnagrams(String text1, String text2) {
    assertFalse(AnagramTask.areTextsAnagrams(text1, text2));
  }
}
