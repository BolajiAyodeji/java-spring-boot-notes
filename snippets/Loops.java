public class Loops {
    public static void main(String args[]) {
        // While loop
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // Do-while loop
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 5);

        // For loop
        for (int k = 0; k < 5; k++) {
            System.out.println(k);
        }

        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        for (int l = 0; l < cars.length; l++) {
            System.out.println(cars[l]);
        }

        // For-each loop
        int[] arrNums = { 1, 2, 3, 4, 5 };
        for (int m : arrNums) {
            System.out.println(m);
        }
    }
}
