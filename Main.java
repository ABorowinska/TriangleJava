package englishVersion.Trojkat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first side length of the triangle:");
        int a = scan.nextInt();
        System.out.println("Enter the second side length of the triangle:");
        int b = scan.nextInt();
        System.out.println("Enter the third side length of the triangle:");
        int c = scan.nextInt();

        Triangle triangle=new Triangle(a,b,c);

        if(!triangle.IsTriangle()){
            return;
        }

        int o;

        do {
            System.out.println("Select the operations you wish to perform on the triangle:");
            System.out.println("1 -> Area of a triangle");
            System.out.println("2 -> Perimeter of a triangle");
            System.out.println("3 -> What kind of triangle is it?");
            System.out.println("4 -> New triangle");
            System.out.println("0 -> If you no longer want to choose");

            o = scan.nextInt();

            switch (o) {
                case 1 -> System.out.println("The area of the triangle is:"+triangle.AreaOfTriangle());
                case 2 -> System.out.println("The perimeter of the triangle is:"+triangle.PerimeterOfTriangle());
                case 3 -> triangle.WhatKindofTriangle();
                case 4 -> {

                    System.out.println("Enter the first side length of the triangle:");
                    a = scan.nextInt();
                    System.out.println("Enter the second side length of the triangle:");
                    b = scan.nextInt();
                    System.out.println("Enter the third side length of the triangle:");
                    c = scan.nextInt();

                    Triangle newTriangle = new Triangle(a, b, c);

                    if (newTriangle.IsTriangle()) {
                        triangle = newTriangle;
                        System.out.println("A new triangle has been created!");
                    } else {
                        System.out.println("A triangle cannot be formed from these sides.");
                    }
                }
                case 0 -> System.out.println("Exiting positions based on a triangle pattern....");
                default -> System.out.println("There is no such option!");
            }

        }while (o!=0);

    }}