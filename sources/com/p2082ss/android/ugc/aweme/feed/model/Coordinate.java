package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.Coordinate */
public final class Coordinate implements Serializable {
    @AbstractC27891c(mo46611a = "centerX")
    private final Float centerX;
    @AbstractC27891c(mo46611a = "centerY")
    private final Float centerY;

    static {
        Covode.recordClassIndex(58671);
    }

    public Coordinate() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ Coordinate copy$default(Coordinate coordinate, Float f, Float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = coordinate.centerX;
        }
        if ((i & 2) != 0) {
            f2 = coordinate.centerY;
        }
        return coordinate.copy(f, f2);
    }

    public final Float component1() {
        return this.centerX;
    }

    public final Float component2() {
        return this.centerY;
    }

    public final Coordinate copy(Float f, Float f2) {
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
        return C89219l.m154714a(this.centerX, coordinate.centerX) && C89219l.m154714a(this.centerY, coordinate.centerY);
    }

    public final int hashCode() {
        Float f = this.centerX;
        int i = 0;
        int hashCode = (f != null ? f.hashCode() : 0) * 31;
        Float f2 = this.centerY;
        if (f2 != null) {
            i = f2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Coordinate(centerX=" + this.centerX + ", centerY=" + this.centerY + ")";
    }

    public final Float getCenterX() {
        return this.centerX;
    }

    public final Float getCenterY() {
        return this.centerY;
    }

    public Coordinate(Float f, Float f2) {
        this.centerX = f;
        this.centerY = f2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Coordinate(java.lang.Float r4, java.lang.Float r5, int r6, p4600h.p4611f.p4613b.C89214g r7) {
        /*
            r3 = this;
            r2 = r6 & 1
            r0 = 0
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            if (r2 == 0) goto L_0x000a
            r4 = r1
        L_0x000a:
            r0 = r6 & 2
            if (r0 == 0) goto L_0x000f
            r5 = r1
        L_0x000f:
            r3.<init>(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.model.Coordinate.<init>(java.lang.Float, java.lang.Float, int, h.f.b.g):void");
    }
}
