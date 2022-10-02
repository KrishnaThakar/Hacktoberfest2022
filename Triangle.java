class Triangle extends GeometricObject {
    private double side1,side2,side3;    //initializing the variables

    public Triangle(){
        side1=1.0;
        side2=1.0;
        side3=1.0;
    }    //setting default values for the sides

    public Triangle(double side1, double side2, double side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }    //constructor method

    public void setSide1(double side1){
        this.side1=side1;
    }    //setter method for side1

    public double getSide1(){
        return side1;
    }    //getter for side1

    public void setSide2(double side2){
        this.side2=side2;
    }    //setter method for side2

    public double getSide2(){
        return side2;
    }    //getter for side1

    public void setSide3(double side3){
        this.side3=side3;
    }    //setter method for side3

    public double getSide3(){
        return side3;    //getter for side3

    }
    public double getArea(){
        double s=(side1+side2+side3)/2;
        double area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area;
    }    //method to get the area

    public double getPerimeter(){
        return(side1+side2+side3);
    }    //method to get the perimeter

    public String toString(){
        return "side1 = "+side1 +", side2 = "+side2 + ", side3 = "+side3;
    }    //method to return String description for the triangle


}