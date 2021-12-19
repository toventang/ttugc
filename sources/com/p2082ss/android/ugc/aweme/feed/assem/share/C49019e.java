package com.p2082ss.android.ugc.aweme.feed.assem.share;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.share.e */
public final class C49019e {

    /* renamed from: a */
    public final boolean f112946a;

    /* renamed from: b */
    public final Float f112947b;

    /* renamed from: c */
    public final String f112948c;

    static {
        Covode.recordClassIndex(57810);
    }

    public C49019e() {
        this(false, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49019e)) {
            return false;
        }
        C49019e eVar = (C49019e) obj;
        return this.f112946a == eVar.f112946a && C89219l.m154714a(this.f112947b, eVar.f112947b) && C89219l.m154714a(this.f112948c, eVar.f112948c);
    }

    public final int hashCode() {
        boolean z = this.f112946a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        Float f = this.f112947b;
        int i5 = 0;
        int hashCode = (i4 + (f != null ? f.hashCode() : 0)) * 31;
        String str = this.f112948c;
        if (str != null) {
            i5 = str.hashCode();
        }
        return hashCode + i5;
    }

    public final String toString() {
        return "ShareCountState(visible=" + this.f112946a + ", size=" + this.f112947b + ", text=" + this.f112948c + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C49019e(boolean z, int i) {
        this((i & 1) != 0 ? true : z, null, null);
    }

    /* renamed from: a */
    public static /* synthetic */ C49019e m92184a(C49019e eVar, String str) {
        return new C49019e(eVar.f112946a, eVar.f112947b, str);
    }

    public C49019e(boolean z, Float f, String str) {
        this.f112946a = z;
        this.f112947b = f;
        this.f112948c = str;
    }
}
