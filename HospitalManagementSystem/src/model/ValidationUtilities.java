/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author aravind
 */

public class ValidationUtilities {

    public static boolean isValidString(String string) {
        return string != null && !string.isEmpty();
    }
    
    public static boolean isValidDate(String string) {
        return string != null && !string.isEmpty();
    }
    
    public static boolean isValidSelection(String string) {
        return string != null && !string.isEmpty() && (!string.equals("Select"));
    }

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX
            = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static final Pattern VALID_PHONE_NUMBER = Pattern.compile("^((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$");

    public static boolean validateEmail(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }

    public static boolean validatePhoneNumber(String number) {
        Matcher matcher = VALID_PHONE_NUMBER.matcher(number);
        return matcher.find();
    }

    public static boolean isNumeric(String str) {
        try {
            Double.valueOf(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
