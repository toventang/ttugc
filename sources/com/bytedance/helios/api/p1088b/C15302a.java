package com.bytedance.helios.api.p1088b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.api.b.a */
public final class C15302a {

    /* renamed from: a */
    public int f37318a;

    /* renamed from: b */
    public long f37319b;

    /* renamed from: c */
    public final String f37320c;

    static {
        Covode.recordClassIndex(17532);
    }

    public C15302a() {
        this(null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15302a)) {
            return false;
        }
        C15302a aVar = (C15302a) obj;
        return this.f37318a == aVar.f37318a && this.f37319b == aVar.f37319b && C89219l.m154714a(this.f37320c, aVar.f37320c);
    }

    public final int hashCode() {
        long j = this.f37319b;
        int i = ((this.f37318a * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.f37320c;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AnchorExtra(anchorCheckCount=" + this.f37318a + ", lastAnchorCheckTime=" + this.f37319b + ", checkType=" + this.f37320c + ")";
    }

    public C15302a(String str) {
        C89219l.m154719c(str, "");
        this.f37318a = 0;
        this.f37319b = 0;
        this.f37320c = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15302a(String str, int i) {
        this((i & 4) != 0 ? "" : str);
    }
}
