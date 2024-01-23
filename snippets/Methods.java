public class Methods {
    static void myMethod(String name, int count) {
        System.out.println(name + " just got executed " + count + " times!");
    }

    static int myMethod(int x, int y) {
        return x + y;
    }

    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");
        } else {
            System.out.println("Access granted - You are old enough!");
        }

    }

    public static void main(String[] args) {
        myMethod("Bolaji", 5);
        myMethod("John", 6);
        myMethod("Doe", 89);

        int sum = myMethod(12, 76);
        System.out.println(sum);

        checkAge(17);
    }
}
