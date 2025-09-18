import java.util.Scanner;

class Fibo{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter the number elements you want : ");
       int size = sc.nextInt();

       int num1 = 0 , num2 = 1 , temp ;
       System.out.print(num1+" "+num2+" ");

       for(int i = 0 ; i < size - 2 ; i++){
           temp = num1 + num2;
           num1 = num2;
           num2 = temp;
           System.out.print(temp+" ");
       }

   }
}


// import java.util.Scanner;

// class Fibo {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of elements: ");
//         int n = sc.nextInt();

//         for (int i = 0; i < n; i++) {
//             System.out.print(fib(i) + " ");
//         }
//         sc.close();
//     }
//     static int fib(int num) {
//         if (num <= 1) return num;
//         return fib(num - 1) + fib(num - 2);
//     }
// }
