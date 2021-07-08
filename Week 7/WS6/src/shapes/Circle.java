/*
Name: Davinder Verma
Section: NBB
Student Number: 121802201
Email: dverma22@myseneca.ca
Date: 07/07/2021
Workshop: 6
*/

package shapes;

import java.text.DecimalFormat;

public class Circle implements Shape{
    double r;

    public Circle(double radius) throws Exception{
        if(radius> 0){
            this.r = radius;
        }
        else
        {
            throw new Exception("Invalid radius!");
        }
    }

    public void setR(double r) throws Exception {
        if(r > 0)
        {
            this.r = r;
        }
        else
        {
            throw new Exception("Invalid Radius!!!");
        }
    }

    public double getR() {
        return r;
    }

    private ShapeArea circleArea = () -> Math.PI * getR() * getR();

    @Override
    public double perimeter() {
        return 2 * Math.PI * getR();
    }

    public String toString(){
        DecimalFormat temp = new DecimalFormat("##0.0000");
        return String.format(this.getClass().getSimpleName()+" {r=" + getR() + "} perimeter = " + temp.format(perimeter()) + "\n" + "Area = " + temp.format(circleArea.area()) + "\n" );
    }

}
