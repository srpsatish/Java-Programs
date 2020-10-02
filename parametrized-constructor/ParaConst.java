class Rectangle{
    int perimeter, area, len, br;
    Rectangle(int x, int y){
        len=x;
        br=y;
    }
    int Area(){
        return area=len*br;
    }
    int Perimeter(){
        return perimeter =2*(len+br);
    }
}
class Square{
    int perimeter, area, side;
    Square(int x){
        side=x;
    }
    int Area(){
        return area=side*side;
    }
    int Perimeter(){
        return perimeter =4*side;
    }
}
class Circle{
    double perimeter, area, radius;
    Circle(double x){
        radius=x;
    }
    double Area(){
        return area=3.14*radius*radius;
    }
    double Perimeter(){
        return perimeter =2*3.14*radius;
    }
}
class ParaConst{
    public static void main (String args[])
    {
        Rectangle rectOb = new Rectangle(10, 20);
        int rectArea = rectOb.Area();
        int rectPeri = rectOb.Perimeter();
        System.out.println(rectArea);
        System.out.println(rectPeri);
        Square squareOb = new Square(15);
        int squreArea = squareOb.Area();
        int squarePeri = squareOb.Perimeter();
        System.out.println(squreArea);
        System.out.println(squarePeri);
        Circle cirleOb = new Circle(30);
        double circleArea = cirleOb.Area();
        double circlePeri = cirleOb.Perimeter();
        System.out.println(circleArea);
        System.out.println(circlePeri);
    }
}