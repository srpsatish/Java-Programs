class Volume {
    double vol(double l, double w, double h){
        return l*w*h;
    }
    double vol(double r, double h){
        return 3.14*r*r*h;
    }
    double vol(double r){
        return 4/3*3.14*r*r*r;
    }
}
class VolMethodOverloading {
    public static void main (String args[])
    {
        Volume cuboid = new Volume();
        double volCuboid = cuboid.vol(5, 7, 9);
        System.out.println(volCuboid);
        Volume cylinder = new Volume();
        double volCylinder = cylinder.vol(10, 20);
        System.out.println(volCylinder);
        Volume sphere = new Volume();
        double volSphere = sphere.vol(15);
        System.out.println(volCuboid);
    }
}
