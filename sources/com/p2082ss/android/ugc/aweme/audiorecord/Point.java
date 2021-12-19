package com.p2082ss.android.ugc.aweme.audiorecord;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.audiorecord.Point */
public final class Point implements Serializable {
    @AbstractC27891c(mo46611a = "time")

    /* renamed from: t */
    private long f80360t;
    @AbstractC27891c(mo46611a = "x")

    /* renamed from: x */
    private int f80361x;
    @AbstractC27891c(mo46611a = "y")

    /* renamed from: y */
    private int f80362y;

    static {
        Covode.recordClassIndex(40905);
    }

    public final long getT() {
        return this.f80360t;
    }

    public final int getX() {
        return this.f80361x;
    }

    public final int getY() {
        return this.f80362y;
    }

    public final void setT(long j) {
        this.f80360t = j;
    }

    public final void setX(int i) {
        this.f80361x = i;
    }

    public final void setY(int i) {
        this.f80362y = i;
    }

    public final boolean isEqual(Point point) {
        C89219l.m154721d(point, "");
        if (this.f80361x == point.f80361x && this.f80362y == point.f80362y && this.f80360t == point.f80360t) {
            return true;
        }
        return false;
    }

    public Point(int i, int i2, long j) {
        this.f80361x = i;
        this.f80362y = i2;
        this.f80360t = j;
    }
}
