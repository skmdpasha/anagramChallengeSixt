package com.sixt.java.coding.challenge;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 * @author Pasha Shaik
 * This class is created to check if the strings are Anagrams.
 */
public class AnagramTask {
  private static final Logger log = Logger.getLogger(AnagramTask.class.getName());

  private AnagramTask() {
    // added private constructor to hide the implicit public one
  }

  public static boolean areTextsAnagrams(String text1, String text2) {

    if (text1 == null || text2 == null) {
      log.info("Either or both the texts are null and hence it could not be Anagrams");
      return false;
    }

    String linksWort = text1.replaceAll("\\s", "");
    String rechtsWort = text2.replaceAll("\\s", "");

    if (linksWort.length() != rechtsWort.length()) {
      log.info("Length of the strings do not match and hence it could not be Anagrams");
      return false;
    }
    return characterFrequencyInASentence(linksWort.toLowerCase()).equals(characterFrequencyInASentence(rechtsWort.toLowerCase()));
  }

  private static Map<Character, Integer> characterFrequencyInASentence(String str) {
    Map<Character, Integer> map = new HashMap<>();
    for (char c : str.toLowerCase().toCharArray()) {
      Integer frequency = map.get(c);
      map.put(c, frequency == null ? 1 : frequency + 1);
    }
    return map;
  }
}