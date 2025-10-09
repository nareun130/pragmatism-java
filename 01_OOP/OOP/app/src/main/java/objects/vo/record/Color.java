package objects.vo.record;


/*
 *  JDK 16부터 record 사용 가능
 * final선언한 것 같이 동작
 * getter 자동 생성
 * 자동으로 equals(), hashcode(), toString()생성
*/
public record Color(int r, int g, int b) {
    public Color {
        if (r < 0 || r > 255 ||
                g < 0 || g > 255 ||
                b < 0 || b > 255) {
            throw new IllegalArgumentException("RGB should be 0 to 255");
        }
    }
    public static void main(String[] args) {
        Color color = new Color(2, 4, 8);
        System.out.println(color.r());
        System.out.println(color.g());
        System.out.println(color.b());
        System.out.println(color);
    }
}
