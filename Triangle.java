package englishVersion.Trojkat;

public class Triangle {

    public int side1;
    public int side2;
    public int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double AreaOfTriangle(){
        int z=(side1+side2+side3)/2;
        double heron= z*(z-side1)*(z-side2)*(z-side3);
        return Math.sqrt(heron);
    }

    public int PerimeterOfTriangle(){
        return side1+side2+side3;
    }

    public void WhatKindofTriangle(){
        if(side1==side2 && side2==side3 && side1==side3){
            System.out.println("The triangle is equilateral.");
        }
        else if ((side1==side2 && side1!=side3) || (side2==side3 && side2!=side1)||(side1==side3 && side1!=side2)) {
            System.out.println("The triangle is isosceles.");
        }
        else{
            System.out.println("The triangle is scalene.");
        }
    }

    public boolean IsTriangle(){
        if(side1+side2>side3 && side1+side3>side2 && side2+side3>side1){
            System.out.println("This is a triangle!");
            return true;
        }
        else{
            System.out.println("This is not a triangle!");
            return false;
        }
    }
}
