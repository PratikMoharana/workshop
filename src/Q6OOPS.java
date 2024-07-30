
abstract class Shape{
    abstract double area();
    abstract double peri();
}
 class Circle extends Shape{
        double r;
        public Circle(double r){
            this.r=r;
        }
         @Override public double area(){
            return 3.14*r*r;
         }
         public double peri(){
            return 2*3.14*r;
         }
}

 class Rectangle extends Shape{
    double len;
    double wid;
    public Rectangle(double len ,double wid){
        this.len=len;
        this.wid=wid;
    }
    public double area(){
        return len*wid;
    }
    public double peri(){
        return 2*(len+wid);
    }
}

 class Triangle extends Shape{
    double base;
    double height;
    double side1, side2, side3;
    public Triangle(double base, double height, double side1, double side2, double side3){
        this.base=base;
        this.height=height;
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    public double area(){
        return 0.5*base*height;
    }
    public double peri(){
        return side1+side2+side3;
    }
}

public class Q6OOPS {
    public static void main(String[] args) {
        Shape circle = new Circle(1.0);
            System.out.println(circle.peri());
        }
    }
