import java.util.Scanner;
class Fact{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter the number : ");

        long num = sc.nextInt();

        System.out.print(fac(num));
    }
    public static long fac(long num){
        if (num <= 1) return 1;
        return num*fac(num - 1);
    }
}



//import java.util.Scanner;
//class fact{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a number : ");
//        int num = sc.nextInt();
//        long  ans = 1;
//
//        for (int i = 1 ; i <= num ; i++){
//            ans *= i;
//        }
//
//        System.out.println(ans);
//    }
//}
