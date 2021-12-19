package com.p2082ss.android.ugc.aweme.commercialize.preview.p2611d.p2612a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.preview.d.a.a */
public final class C38316a {

    /* renamed from: a */
    public final String f90546a;

    /* renamed from: b */
    public final int f90547b;

    /* renamed from: c */
    public final float f90548c;

    /* renamed from: d */
    public final float f90549d = -15.0f;

    /* renamed from: e */
    public final int f90550e = 3;

    /* renamed from: f */
    public final int f90551f = 10;

    static {
        Covode.recordClassIndex(45804);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38316a)) {
            return false;
        }
        C38316a aVar = (C38316a) obj;
        return C89219l.m154714a(this.f90546a, aVar.f90546a) && this.f90547b == aVar.f90547b && Float.compare(this.f90548c, aVar.f90548c) == 0 && Float.compare(this.f90549d, aVar.f90549d) == 0 && this.f90550e == aVar.f90550e && this.f90551f == aVar.f90551f;
    }

    public final String toString() {
        return "AdsPreviewWaterMarkConfig(text=" + this.f90546a + ", textColor=" + this.f90547b + ", textSize=" + this.f90548c + ", rotation=" + this.f90549d + ", marksInRow=" + this.f90550e + ", marksInColumn=" + this.f90551f + ")";
    }

    public final int hashCode() {
        int i;
        String str = this.f90546a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return (((((((((i * 31) + this.f90547b) * 31) + Float.floatToIntBits(this.f90548c)) * 31) + Float.floatToIntBits(this.f90549d)) * 31) + this.f90550e) * 31) + this.f90551f;
    }

    public C38316a(String str, int i, float f) {
        C89219l.m154721d(str, "");
        this.f90546a = str;
        this.f90547b = i;
        this.f90548c = f;
    }
}
