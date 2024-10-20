public class Variant23 {
    public static void main(String[] args) {
        double lambda = 0.1;
        double b = 0.6;
        double c = 2.4 * Math.pow(10, -4);
        double t = 15;
        double x = Math.pow(lambda, 2) + Math.sqrt(b) - Math.log(t + c);
        double y = Math.sin(b * t) + Math.exp(lambda * c);
        System.out.println("Calculated x: " + x);
        System.out.println("Calculated y: " + y);
    }
}
