public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; i++){
            Square s = new Square((int)(Math.random() * 10));
            System.out.println("The Are of the Square number " + (i+1) + " is: " + s.calcArea());
            s.draw();
            sum += s.calcArea();
        }
        System.out.println("The sum of all areas is: " + sum);
    }
}