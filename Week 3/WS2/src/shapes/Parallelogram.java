package shapes;

import java.text.DecimalFormat;

public class Parallelogram extends Rectangle{

    public Parallelogram(double w, double h) throws Exception{
        super(w, h);
    }

    @Override
    public String toString() {
        DecimalFormat temp = new DecimalFormat("##0.0000##");
        return String.format(this.getClass().getSimpleName() + " {w=" + getH() + ", h=" + getH() + "} perimeter = " + temp.format(perimeter()) + "\n");
    }
}
