package shapes;

import java.text.DecimalFormat;
import java.util.concurrent.ExecutionException;

public class Rectangle implements Shape{

    double w;
    double h;

    public double getW() {return w;}

    public void setW(double width) throws Exception{
        if(width > 0)this.w = width;
        else throw new Exception("Invalid side!");
    }

    public double getH() {return h;}

    public void setH(double height) throws Exception{
        if(height > 0)this.h = height;
        else throw new Exception("Invalid side!");
    }

    public Rectangle(double width, double height) throws Exception{

        if(width > 0 && height > 0){
            this.w = width;
            this.h = height;
        }
        else
        {
            throw new Exception("Invalid side!");
        }


    }

    @Override
    public double perimeter() {return 2 * getH() + getW();}

    @Override
    public String toString() {

        DecimalFormat temp = new DecimalFormat("##0.0000");

        return String.format( this.getClass().getSimpleName() +
                " {w=" + getW() +
                ", h=" + getH() +
                "} perimeter = " + temp.format(perimeter()) + "\n");
    }
}
