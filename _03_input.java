import java.util.Scanner;

public class _03_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = sc.next();
        sc.nextLine(); // to consume the newline character
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        sc.nextLine(); // to consume the newline character
        System.out.println("Enter your favourite anime : ");
        String anime = sc.nextLine(); // taking whole line as input

        System.out.println(
                "Entered name is : " + name + "\nEntered number is : " + num + "\nFavorite anime is : " + anime);
        sc.close();
    }
}
/*
 * OUTPUT
 * 
 * Enter your name :
 * Aman Kumar Gupta
 * Enter number :
 * 89
 * Enter your favourite anime :
 * Demon Slayer
 * Entered name is : Aman
 * Entered number is : 89
 * Favorite anime is : Demon Slayer
 */

// Adding two integer numbers

import java.util.Scanner;

public class _03_1_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println(a + " + " + b + " is : " + sum);
        sc.close();
    }
}
/*
 * OUTPUT
 * 
 * Enter a :
 * 78
 * Enter b :
 * 9
 * 78 + 9 is : 87
 */

// Calculating simple interest

import java.util.Scanner;

public class _03_2_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount : ");
        float principal = sc.nextFloat();
        System.out.print("Enter rate of interest : ");
        float rate = sc.nextFloat();
        System.out.print("Enter time : ");
        float time = sc.nextFloat();

        float simple_interest = (principal * rate * time) / 100;
        System.out.println("Simple interest is : " + simple_interest);

        sc.close();
    }
}
/*
 * OUTPUT
 * 
 * Enter principal amount : 2000.5
 * Enter rate of interest : 5.56
 * Enter time : 4
 * Simple interest is : 444.91122
 */

// Reading character

import java.util.Scanner;

public class charRead {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Reading only first character of a string\n");
        System.out.print("Enter character : ");
        char ch = sc.next().charAt(0);
        System.out.println("Character : " + ch);

        sc.close();
    }
}
/*
 * OUTPUT
 * 
 * Enter character : Amana
 * Character : A
 */