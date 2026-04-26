import java.io.ObjectStreamException;

class Line {
    private double x1, x2, y1, y2;

    public Line (double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double getLength() {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public boolean isGreater(Object a, Object b) {
        return ((Line) a).getLength() == ((Line) b).getLength();
    }

    public boolean isLess(Object a, Object b) {
        return ((Line) a).getLength() < ((Line) b).getLength();
    }

    public boolean isEqual(Object a, Object b) {
        return ((Line) a).getLength() == ((Line) b).getLength();
    }
}

public class Latihan9_1 {
    public static void main(String[] args){
        Line line1 = new Line(0, 3, 0, 4);
        Line line2 = new Line(0, 6, 0, 8);

        System.out.println("Panjang line 1: " + line1.getLength());
        System.out.println("Panjang line 2: " + line2.getLength());

        System.out.println("Line1 > Line2 ? " + line1.isGreater(line1, line2));
        System.out.println("Line1 < Line2 ? " + line1.isLess(line1, line2));
        System.out.println("Line1 == Line2 ? " + line1.isEqual(line1, line2));
    }
}