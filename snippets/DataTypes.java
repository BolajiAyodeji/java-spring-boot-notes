/*
 * Testing different types
 */

import java.util.Arrays;

public class DataTypes {
    public static void main(String args[]) {
        Primitive();
        NonPrimitive();
        Arrays();
    }

    public static void Primitive() {
        // byte is for small whole numbers (8-bit)
        byte $byteValue = 1;

        // short is for small whole numbers (16-bit)
        short short_Value = 2;

        // int is for whole numbers (32-bit)
        int intValue = 3;

        int randomNum = (int) (Math.random() * 101);

        // long is for long whole numbers (64-bit)
        long _longValue = 6000000000L;

        // float is for floating point numbers (32-bit)
        float floatValue = 1.0f;

        // double is for floating point numbers (64-bit)
        double doubleValue = 1.0d;

        // char is for single characters (16-bit)
        char charValue = 'a';

        // boolean is for true/false values (1-bit)
        boolean booleanValue = true;

        System.out.println("PRIMITIVE DATA TYPES");
        System.out.println($byteValue);
        System.out.println(short_Value);
        System.out.println(intValue);
        System.out.println(_longValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
        System.out.println(charValue);
        System.out.println(booleanValue);
    }

    public static void NonPrimitive() {
        // String is for text
        String stringValue = "Hello World!";

        // Integer is for whole numbers
        Integer integerObject = 1;

        // Double is for floating point numbers
        Double doubleObject = 1.0d;

        // Character is for single characters
        Character characterObject = 'a';

        // Boolean is for true/false values
        Boolean booleanObject = true;

        // Byte is for small whole numbers
        Byte byteObject = 1;

        // Short is for small whole numbers
        Short shortObject = 1;

        // Long is for long whole numbers
        Long longObject = 1L;

        // Float is for floating point numbers
        Float floatObject = 1.0f;

        System.out.println("NON-PRIMITIVE DATA TYPES");
        System.out.println(stringValue);
        System.out.println(integerObject);
        System.out.println(doubleObject);
        System.out.println(characterObject);
        System.out.println(booleanObject);
        System.out.println(byteObject);
        System.out.println(shortObject);
        System.out.println(longObject);
        System.out.println(floatObject);
    }

    public static void Arrays() {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int[][] numbers2 = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        String[] names = { "John", "Doe" };
        String[][] names2 = { { "John", "Doe" }, { "Jane", "Doe" } };

        System.out.println("ARRAYS");

        System.out.println(numbers);
        System.out.println(numbers2);
        System.out.println(names);
        System.out.println(names2);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.deepToString(numbers2));
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.deepToString(names2));

        // return numbers.length;
    }
}