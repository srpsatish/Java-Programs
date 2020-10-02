// Topic - Nesting of Methods
// find out the largest value among two numbers and display it in a different method called display()
class Nest{
    int x;
    int y;
    Nest(int a, int b){
        x=a;
        y=b;
    }
    int large(){
        if(x>y){
            return(x);
        }
        else{
            return(y);
        }
    }
    void display(){
        int largest = large();
        System.out.println(largest);
    }
}
class NestingMethod{
    public static void main (String args[])
    {
        Nest obj = new Nest(5,29);
        obj.display();
    }
}