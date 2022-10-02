/*Author: Krishna Thakar
 *Date: 9/18/2021
 *Purpose: To make a triangle and get area and perimeter of it and colouring it
 */
public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(1.0, 1.5, 1.0);        // object of triangle class
        triangle.setColor("yellow");
        triangle.setFilled(true);

        System.out.println(triangle);
        System.out.printf("The area is :",triangle.getArea());                     // to get area of the triangle
        System.out.printf("The perimeter is :",triangle.getPerimeter());        // to get the perimeter of the triangle
        System.out.println("The color is:"+triangle.getColor());                   // to get the color
        System.out.println("The triangle is filled? "+triangle.isFilled());         // to see if the triangle is filled

    }
} 
