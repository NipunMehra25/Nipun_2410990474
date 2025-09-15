import java.util.Scanner;

class UpdateValues{
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5};

        Scanner sc = new Scanner(System.in);

        System.out.println("This is the arr , Which index you want to change.");

        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        System.out.print("Enter the idx : ");
        int idx = sc.nextInt();

        System.out.print("What do you to replace it with : ");
        arr[idx] = sc.nextInt();

        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
