class ClassA extends Thread{
    public void run() {
    System.out.println("Start Thread A ....");
    for(int i = 1; i <= 5; i++) {
    System.out.println("From Thread A: i = "+ i);
    }
    System.out.println("... Exit Thread A");
    }
    }
    class ClassB extends Thread{
    public void run() {
    System.out.println("Start Thread B ....");
    for(int j = 1; j <= 5; j++) {
    System.out.println("From Thread B: j = "+ j);
    }
    System.out.println("... Exit Thread B");
    }
    }
    class ClassC extends Thread{
    public void run() {
    System.out.println("Start Thread C ....");
    for(int k = 1; k <= 5; k++) {
    System.out.println("From Thread C: j = "+ k);
    }
    System.out.println("... Exit Thread C");
    }
    }
    class ClassD extends Thread{
    public void run() {
    System.out.println("Start Thread C ....");
    for(int l = 1; l <= 5; l++) {
    System.out.println("From Thread D: l = "+ l);
    }
    System.out.println("... Exit Thread D");
    }
    }
    class Twelve{
    public static void main (String args[]) {
    ClassA t1 = new ClassA();
    ClassB t2 = new ClassB();
    ClassC t3 = new ClassC();
    ClassD t4 = new ClassD();
    t1.setPriority(1);
    t2.setPriority(3);
    t3.setPriority(5);
    t4.setPriority(7);
    t1.start(); 
    t2.start(); 
    t3.start();
    t4.start();
    }
    }