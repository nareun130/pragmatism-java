package com.nareun130.pragmatism.object.vo;

import java.util.Objects;

//* VO : 객체지만 동시에 값 
//* 불변성& 동등성& 자가 검증 -> 값 객체
public class Color {
    public final int r;
    public final int g;
    public final int b;

    public Color(int r, int g, int b) {
        if (r < 0 || r > 255 || g < 0 || g > 255 || b < 0 || b > 255) {
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
        return Objects.hash(r, g, b);
    }
}
