package com.p2082ss.android.ugc.aweme.infoSticker.customsticker.helper;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.helper.Coordinate */
public final class Coordinate {
    @AbstractC27891c(mo46611a = "x")

    /* renamed from: x */
    private float f129261x;
    @AbstractC27891c(mo46611a = "y")

    /* renamed from: y */
    private float f129262y;

    static {
        Covode.recordClassIndex(66570);
    }

    public static /* synthetic */ Coordinate copy$default(Coordinate coordinate, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = coordinate.f129261x;
        }
        if ((i & 2) != 0) {
            f2 = coordinate.f129262y;
        }
        return coordinate.copy(f, f2);
    }

    public final float component1() {
        return this.f129261x;
    }

    public final float component2() {
        return this.f129262y;
    }

    public final Coordinate copy(float f, float f2) {
        return new Coordinate(f, f2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Coordinate)) {
            return false;
        }
        Coordinate coordinate = (Coordinate) obj;
        return Float.compare(this.f129261x, coordinate.f129261x) == 0 && Float.compare(this.f129262y, coordinate.f129262y) == 0;
    }

    public final int hashCode() {
        return (m102714x50600527(this.f129261x) * 31) + m102714x50600527(this.f129262y);
    }

    public final float getX() {
        return this.f129261x;
    }

    public final float getY() {
        return this.f129262y;
    }

    public final String toString() {
        return "[" + this.f129261x + ", " + this.f129262y + ']';
    }

    public final void setX(float f) {
        this.f129261x = f;
    }

    public final void setY(float f) {
        this.f129262y = f;
    }

    /* renamed from: com_ss_android_ugc_aweme_infoSticker_customsticker_helper_Coordinate_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m102714x50600527(float f) {
        return Float.floatToIntBits(f);
    }

    public Coordinate(float f, float f2) {
        this.f129261x = f;
        this.f129262y = f2;
    }
}
