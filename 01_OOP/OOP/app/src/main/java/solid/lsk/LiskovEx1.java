package solid.lsk;

public class LiskovEx1 {

    public static void main(String[] args) {
        Rectangle rectangle = new Squre(10);
        rectangle.setHeight(5);
        System.out.println(rectangle.calculateArea());//* 50이 나옴. 25
    }
}
