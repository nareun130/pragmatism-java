package objects.vo.immutable;

import java.util.Objects;

//* 아예 final로 고정 -> 상속 불가 */
public final class Color {

    public final int r;
    public final int g;
    public final int b;

    public Color(int r, int g, int b) {
        if (r < 0 || r > 255 ||
                g < 0 || g > 255 ||
                b < 0 || b > 255) {
            throw new IllegalArgumentException("RGB should be 0 to 255");
        }
        this.r = r;
        this.g = g;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final Color color = (Color) o;
        return r == color.r && g == color.g && b == color.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(r,g,b);
    }

    public String toHex(){
        // int 값을 16진수로 
        //%02 : 숫자를 최소 2자리의 16진수로 출력
        return String.format("#%02x%02x%02x", r,g,b);
    }
    
}
