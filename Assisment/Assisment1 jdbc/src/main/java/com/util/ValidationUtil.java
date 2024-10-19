package com.util;

import java.util.regex.Pattern;

public class ValidationUtil {
    public static boolean isValidContactNumber(String contact) {
        return Pattern.matches("\\d{10}", contact);
    }

    public static boolean isValidName(String name) {
        return name != null && !name.trim().isEmpty();
    }
}
