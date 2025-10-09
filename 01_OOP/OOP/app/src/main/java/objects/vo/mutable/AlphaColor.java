package objects.vo.mutable;

//* Color가 final로 되면서 상속이 불가능 */
public class AlphaColor extends Color {

    //* 상송된 클래스의 멤버변수가 불변이 아닐 수 있다.
    public int a;

    public AlphaColor(int r, int g, int b, int a) {
        super(r, g, b);
        this.a = a;
    }

}
