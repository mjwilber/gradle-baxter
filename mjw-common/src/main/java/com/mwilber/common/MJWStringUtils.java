package com.mwilber.common;

import org.apache.commons.lang3.StringUtils;

public class MJWStringUtils {
  /** Prevent public construction for this utility class */
  private MJWStringUtils() {}

  public static boolean isBlank(String s) {
    return StringUtils.isBlank(s);
  }

}
