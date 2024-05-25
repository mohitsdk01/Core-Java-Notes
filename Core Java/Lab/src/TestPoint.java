public class TestPoint {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Point2D p1 = new Point2D(sc.nextINt(), sc.nextInt());
        Point2D p2 = new Point2D(sc.nextINt(), sc.nextInt());
        System.out.println(p1.show());
        System.out.println(p2.show());

        // Point2D p1 = new Point2D();
        // p1.AcceptPoints();
        // Point2D p2 = new Point2D();
        // p2.AcceptPoints();
        
        if(p1.isEqual(p2)){ //p1=5,6   p2=8,9
            System.out.println("Equal Points.");
        }
        else{
            System.out.println("Different Points.");
            System.out.println("Distance: " + p1.calculateDistance(p2));
        }
    }
}


