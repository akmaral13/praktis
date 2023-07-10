public class Trigolniky {
    double a;
    double b;
    double c;
    public double area(double a,double b,double c){
        double uno=(a+b+c)/2;
        double san=uno*(uno-a)*(uno-b)*(uno-c);
        return Math.sqrt(uno);
    }
}
