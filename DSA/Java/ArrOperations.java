import java.util.Scanner;

class ArrOperations{
    public static void main(String[] args){
        int Size;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements : ");
        Size = sc.nextInt();

        int [] arr = new int[Size];

        for(int i = 0 ; i < Size ; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0 ; i < Size ; i++){
            System.out.print(arr[i]);
        }

    }
}
