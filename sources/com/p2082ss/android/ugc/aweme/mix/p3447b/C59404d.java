package com.p2082ss.android.ugc.aweme.mix.p3447b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mix.b.d */
public final class C59404d implements AbstractC81914b {

    /* renamed from: a */
    public final boolean f135697a = true;

    /* renamed from: b */
    public final String f135698b;

    /* renamed from: c */
    public final String f135699c;

    /* renamed from: d */
    public final Aweme f135700d;

    /* renamed from: e */
    public final boolean f135701e;

    /* renamed from: f */
    public final String f135702f;

    static {
        Covode.recordClassIndex(69796);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59404d)) {
            return false;
        }
        C59404d dVar = (C59404d) obj;
        return this.f135697a == dVar.f135697a && C89219l.m154714a(this.f135698b, dVar.f135698b) && C89219l.m154714a(this.f135699c, dVar.f135699c) && C89219l.m154714a(this.f135700d, dVar.f135700d) && this.f135701e == dVar.f135701e && C89219l.m154714a(this.f135702f, dVar.f135702f);
    }

    public final int hashCode() {
        boolean z = this.f135697a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        String str = this.f135698b;
        int i6 = 0;
        int hashCode = (i5 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f135699c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Aweme aweme = this.f135700d;
        int hashCode3 = (hashCode2 + (aweme != null ? aweme.hashCode() : 0)) * 31;
        if (!this.f135701e) {
            i = 0;
        }
        int i7 = (hashCode3 + i) * 31;
        String str3 = this.f135702f;
        if (str3 != null) {
            i6 = str3.hashCode();
        }
        return i7 + i6;
    }

    public final String toString() {
        return "CreateMixListInFeedEvent(success=" + this.f135697a + ", name=" + this.f135698b + ", id=" + this.f135699c + ", aweme=" + this.f135700d + ", needOpenDialog=" + this.f135701e + ", enterMethod=" + this.f135702f + ")";
    }

    public C59404d(String str, String str2, Aweme aweme, boolean z, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f135698b = str;
        this.f135699c = str2;
        this.f135700d = aweme;
        this.f135701e = z;
        this.f135702f = str3;
    }
}
