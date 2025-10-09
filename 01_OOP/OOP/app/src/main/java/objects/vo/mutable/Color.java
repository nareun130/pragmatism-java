package objects.vo.mutable;

import java.util.Objects;
import java.util.Random;

public class Color {

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

    //* 불변성이 깨짐. -> 매번 다른 값을 리턴 */
    public Color randColor() {
        Random random = new Random();

        int r = random.nextInt();
        int g = random.nextInt();
        int b = random.nextInt();
        return new Color(r, g, b);
    }
    
}
