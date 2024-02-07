package Strings;

public class ConvertFirstletterToUppercase {
    public static void main(String[] args) {
        // Original string
        String str = "hi we are learning dsa with java";
        System.out.println("Original string : " + str);
        System.out.println("Desired Output -> " + toUppercase(str));
    }

    // Convert first letter of each word to uppercase using StringBuilder
    public static String toUppercase(String str) {
        StringBuilder strg = new StringBuilder("");// Create a StringBuilder object
        char ch = Character.toUpperCase(str.charAt(0));// Convert the first character to uppercase
        strg.append(ch); // Add the uppercase character to the StringBuilder

        // Loop through the rest of the string
        for (int i = 1; i < str.length(); i++) {

            // If the current character is a space and there is at least one character left
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                strg.append(str.charAt(i)); // Add the space to the StringBuilder
                i++; // Move to the next character
                strg.append(Character.toUpperCase(str.charAt(i)));// Convert the next character to uppercase and add it to the StringBuilder
            } else {
                strg.append(str.charAt(i));// Otherwise, just add the current character to the StringBuilder
            }
        }
        return strg.toString();
    }

}
