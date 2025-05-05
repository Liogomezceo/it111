public class LitersToGallonsConverter {
    public static void main(String[] args) {
        int counter = 0;

        for (double gallon = (double) 1.0F; gallon <= (double) 100.0F; gallon += (double) 4.0F) {
            double liter = gallon * 3.79;
            ++counter;
            System.out.printf("%.2f", liter);
            if (gallon == (double) 1.0F) {
                System.out.println(" liters = " + gallon + " gallon");
            } else {
                System.out.println(" liters = " + gallon + " gallons");
            }

            if (counter == 5) {
                System.out.println();
                counter = 0;
            }
        }
        System.out.println("We are done!!!");

    }
}
