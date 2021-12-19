package com.p2082ss.android.ugc.aweme.shortvideo.cut;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.y */
public final class C70581y<DATA> {

    /* renamed from: a */
    public final int f157921a;

    /* renamed from: b */
    public final int f157922b;

    /* renamed from: c */
    public final DATA f157923c;

    static {
        Covode.recordClassIndex(83045);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C70581y)) {
            return false;
        }
        C70581y yVar = (C70581y) obj;
        return this.f157921a == yVar.f157921a && this.f157922b == yVar.f157922b && C89219l.m154714a(this.f157923c, yVar.f157923c);
    }

    public final int hashCode() {
        int i = ((this.f157921a * 31) + this.f157922b) * 31;
        DATA data = this.f157923c;
        return i + (data != null ? data.hashCode() : 0);
    }

    public final String toString() {
        return "VideoFrameData(width=" + this.f157921a + ", height=" + this.f157922b + ", data=" + ((Object) this.f157923c) + ")";
    }

    public C70581y(int i, int i2, DATA data) {
        this.f157921a = i;
        this.f157922b = i2;
        this.f157923c = data;
    }
}
