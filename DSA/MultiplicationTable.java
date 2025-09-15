import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        do {

            System.out.print("Enter the number (0 to exit): ");
            num = sc.nextInt();

            if (num == 0) {
                System.out.println("Exiting program...");
                break; // exit the loop
            }

            int sizeOfTable;
            do {
                System.out.print("Enter the size of the table (positive number): ");
                sizeOfTable = sc.nextInt();
                if (sizeOfTable <= 0) {
                    System.out.println("Size must be a positive number. Try again.");
                }
            } while (sizeOfTable <= 0);

            for (int i = 1; i <= sizeOfTable; i++) {
                System.out.println(num + " * " + i + " = " + (num * i));
            }

            System.out.println();
        } while (true);

        sc.close();
    }
}
