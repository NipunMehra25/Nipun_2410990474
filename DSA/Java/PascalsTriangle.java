import java.util.Scanner;

class PascalsTriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Enter a number : ");
        num = sc.nextInt();

        for(int i = 0 ; i < num ; i ++){
            int digit = 1;
            for(int k = 0 ; k < num - i ; k++){
                System.out.print(" ");
            }
            for(int j = 0 ; j < i + 1; j++){
                System.out.print(digit+" ");
                digit = digit*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
