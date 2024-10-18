public class Rectangle {
    public double width;
    public double height;

    public double area(){

        double area = width*height;
        return area;
    }

    public double perimeter(){

        double perimeter = (width*2) + (height*2);
        return perimeter;
    }

    public double diagonal(){

        double diagonal = Math.sqrt( (width*width) + (height*height) );
        return diagonal;
    }
}
