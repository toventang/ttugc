package com.facebook.imagepipeline.common;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1839k.C24128b;

/* renamed from: com.facebook.imagepipeline.common.d */
public class C24363d {

    /* renamed from: a */
    public final int f57779a;

    /* renamed from: b */
    public final int f57780b;

    /* renamed from: c */
    public final float f57781c;

    /* renamed from: d */
    public final float f57782d;

    static {
        Covode.recordClassIndex(28506);
    }

    public int hashCode() {
        return C24128b.m45730a(this.f57779a, this.f57780b);
    }

    public String toString() {
        return C1764a.m5929a(null, "%dx%d", new Object[]{Integer.valueOf(this.f57779a), Integer.valueOf(this.f57780b)});
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C24363d)) {
            return false;
        }
        C24363d dVar = (C24363d) obj;
        if (this.f57779a == dVar.f57779a && this.f57780b == dVar.f57780b) {
            return true;
        }
        return false;
    }

    public C24363d(int i, int i2) {
        this(i, i2, (byte) 0);
    }

    private C24363d(int i, int i2, byte b) {
        this(i, i2, (char) 0);
    }

    private C24363d(int i, int i2, char c) {
        boolean z;
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45620a(z);
        C24091i.m45620a(i2 <= 0 ? false : z2);
        this.f57779a = i;
        this.f57780b = i2;
        this.f57781c = 2048.0f;
        this.f57782d = 0.6666667f;
    }
}
