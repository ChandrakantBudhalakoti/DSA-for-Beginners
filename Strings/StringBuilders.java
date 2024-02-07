package Strings;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("");
        for (char ch = 'a'; ch<= 'z'; ch++){
            str.append(ch);
        }
        System.out.println("Final  string: " + str);

        // Insert a char at specific position
        str.insert(5, '_');
        System.out.println("\nAfter inserting _ at 5th pos :" +str);

        // Delete a char from specific position
        str.deleteCharAt(2);
        System.out.println("\nAfter deleting char at 2nd pos :"+str);

        // Append another string to existing stringbuilder object
        StringBuilder sb = new StringBuilder("Hello ");
        sb.append("World!");
        System.out.println("\nAppending Hello World : "+sb);

        // Reverse the string using StringBuilder's reverse() method
        System.out.println("\nReversed string : "+ str.reverse());

        // Convert StringBuilder Object to String and print it
        String s = str.toString();
        System.out.println("\nConverting StringBuilder to String : "+s);
    }
}   