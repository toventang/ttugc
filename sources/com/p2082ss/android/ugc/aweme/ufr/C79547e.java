package com.p2082ss.android.ugc.aweme.ufr;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ufr.e */
public final class C79547e {

    /* renamed from: a */
    public final boolean f178518a;

    /* renamed from: b */
    public int f178519b;

    /* renamed from: c */
    public final int f178520c;

    /* renamed from: d */
    public final String f178521d;

    static {
        Covode.recordClassIndex(92751);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C79547e)) {
            return false;
        }
        C79547e eVar = (C79547e) obj;
        return this.f178518a == eVar.f178518a && this.f178519b == eVar.f178519b && this.f178520c == eVar.f178520c && C89219l.m154714a(this.f178521d, eVar.f178521d);
    }

    public final int hashCode() {
        boolean z = this.f178518a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = ((((i * 31) + this.f178519b) * 31) + this.f178520c) * 31;
        String str = this.f178521d;
        return i4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "UFRResult(status=" + this.f178518a + ", syncFrom=" + this.f178519b + ", requestStatusCode=" + this.f178520c + ", message=" + this.f178521d + ")";
    }

    private C79547e(boolean z, int i, int i2, String str) {
        C89219l.m154719c(str, "");
        this.f178518a = z;
        this.f178519b = i;
        this.f178520c = i2;
        this.f178521d = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C79547e(boolean z, int i, int i2, String str, int i3) {
        this(z, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? "" : str);
    }
}
