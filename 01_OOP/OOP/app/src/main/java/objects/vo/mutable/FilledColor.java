package objects.vo.mutable;

import lombok.Getter;

@Getter
public class FilledColor {
    private final int r;
    private final int g;
    private final int b;

    /*
     * 이렇게 모든 멤버변수가 final로 선언되어도,
     * Shape(참조객체)의 멤버변수가 final로 선언x -> 불변성이 깨질 수 있음.
     */
    private final Shape shape;

    public FilledColor(int r, int g, int b, Shape shape) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.shape = shape;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        FilledColor filledColor = new FilledColor(1, 0, 0, rectangle);

        // * 이 때, 불변성이 깨짐. */
        filledColor.getShape().setWidht(20);
    }
}
