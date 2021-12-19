package com.p2082ss.android.ugc.aweme.feed.assem.addiction;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.addiction.a */
public final class C48360a {

    /* renamed from: a */
    public final boolean f112064a;

    /* renamed from: b */
    public final boolean f112065b;

    /* renamed from: c */
    public final String f112066c;

    static {
        Covode.recordClassIndex(57133);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48360a)) {
            return false;
        }
        C48360a aVar = (C48360a) obj;
        return this.f112064a == aVar.f112064a && this.f112065b == aVar.f112065b && C89219l.m154714a(this.f112066c, aVar.f112066c);
    }

    public final int hashCode() {
        boolean z = this.f112064a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        if (!this.f112065b) {
            i = 0;
        }
        int i6 = (i5 + i) * 31;
        String str = this.f112066c;
        return i6 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "VideoAntiAddicationData(priState=" + this.f112064a + ", relieveState=" + this.f112065b + ", miniteState=" + this.f112066c + ")";
    }

    public /* synthetic */ C48360a() {
        this(false, false, "");
    }

    private C48360a(boolean z, boolean z2, String str) {
        C89219l.m154721d(str, "");
        this.f112064a = z;
        this.f112065b = z2;
        this.f112066c = str;
    }

    /* renamed from: a */
    public static /* synthetic */ C48360a m91813a(C48360a aVar, boolean z, boolean z2, String str, int i) {
        if ((i & 1) != 0) {
            z = aVar.f112064a;
        }
        if ((i & 2) != 0) {
            z2 = aVar.f112065b;
        }
        if ((i & 4) != 0) {
            str = aVar.f112066c;
        }
        C89219l.m154721d(str, "");
        return new C48360a(z, z2, str);
    }
}
