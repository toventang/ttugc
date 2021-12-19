package com.p2082ss.android.ugc.aweme.following.p3002a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.following.a.f */
public final class C51107f {

    /* renamed from: a */
    public final int f117931a;

    /* renamed from: b */
    public final String f117932b;

    static {
        Covode.recordClassIndex(60304);
    }

    public C51107f() {
        this(0, null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C51107f)) {
            return false;
        }
        C51107f fVar = (C51107f) obj;
        return this.f117931a == fVar.f117931a && C89219l.m154714a(this.f117932b, fVar.f117932b);
    }

    public final int hashCode() {
        int i = this.f117931a * 31;
        String str = this.f117932b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "RelationTitle(type=" + this.f117931a + ", title=" + this.f117932b + ")";
    }

    public C51107f(int i, String str) {
        C89219l.m154721d(str, "");
        this.f117931a = i;
        this.f117932b = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C51107f(int i, String str, int i2) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str);
    }
}
