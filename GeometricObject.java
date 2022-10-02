class GeometricObject {
    private String color;
    private boolean filled;
    public GeometricObject(){

    }    //default function

    public GeometricObject(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }    //Constructor function

    public String getColor(){
        return color;
    }    //getter function for color

    public void setColor(String color){
        this.color=color;
    }    //setter method for color

    public boolean isFilled(){
        return filled;
    }    //getter method for boolean function

    public void setFilled(boolean filled){
        this.filled=filled;
    }    //setter function for boolean method

    public double getArea(){
        return 0;
    } // getter for area
    public double getPerimeter(){
        return 0;
    }  // getter for perimeter

    public void display(){
        System.out.println("The Geometric object color: "+ color + " and filled: "+filled);
    }    //returns a string representation of this object


}