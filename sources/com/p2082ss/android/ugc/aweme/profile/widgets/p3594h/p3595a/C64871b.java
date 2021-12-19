package com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a;

import com.bytedance.assem.arch.extensions.AbstractC12779c;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.widgets.follow.C64715b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.h.a.b */
public final class C64871b implements AbstractC12779c {

    /* renamed from: a */
    public final String f146663a;

    /* renamed from: b */
    public final boolean f146664b;

    /* renamed from: c */
    public final String f146665c;

    /* renamed from: d */
    public final String f146666d;

    /* renamed from: e */
    public final boolean f146667e;

    /* renamed from: f */
    public final C64715b f146668f;

    /* renamed from: g */
    public final int f146669g;

    /* renamed from: h */
    public final String f146670h;

    static {
        Covode.recordClassIndex(76338);
    }

    public C64871b() {
        this(null, null, null, null, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C64871b)) {
            return false;
        }
        C64871b bVar = (C64871b) obj;
        return C89219l.m154714a(this.f146663a, bVar.f146663a) && this.f146664b == bVar.f146664b && C89219l.m154714a(this.f146665c, bVar.f146665c) && C89219l.m154714a(this.f146666d, bVar.f146666d) && this.f146667e == bVar.f146667e && C89219l.m154714a(this.f146668f, bVar.f146668f) && this.f146669g == bVar.f146669g && C89219l.m154714a(this.f146670h, bVar.f146670h);
    }

    public final int hashCode() {
        String str = this.f146663a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f146664b;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        String str2 = this.f146665c;
        int hashCode2 = (i6 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f146666d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        if (!this.f146667e) {
            i2 = 0;
        }
        int i7 = (hashCode3 + i2) * 31;
        C64715b bVar = this.f146668f;
        int hashCode4 = (((i7 + (bVar != null ? bVar.hashCode() : 0)) * 31) + this.f146669g) * 31;
        String str4 = this.f146670h;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "UserProfileInitData(from=" + this.f146663a + ", isFromFeed=" + this.f146664b + ", enterFrom=" + this.f146665c + ", profileFrom=" + this.f146666d + ", fromMutual=" + this.f146667e + ", followLogEvenParams=" + this.f146668f + ", generalSearchCardType=" + this.f146669g + ", eventKeys=" + this.f146670h + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C64871b(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14) {
        /*
            r9 = this;
            r3 = r11
            r1 = r10
            r0 = r14 & 1
            r4 = 0
            if (r0 == 0) goto L_0x0008
            r1 = r4
        L_0x0008:
            r0 = r14 & 4
            java.lang.String r8 = ""
            if (r0 == 0) goto L_0x000f
            r3 = r8
        L_0x000f:
            r0 = r14 & 8
            if (r0 == 0) goto L_0x0022
        L_0x0013:
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0020
        L_0x0017:
            r2 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0020:
            r8 = r13
            goto L_0x0017
        L_0x0022:
            r4 = r12
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64871b.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    public C64871b(String str, boolean z, String str2, String str3, boolean z2, C64715b bVar, int i, String str4) {
        C89219l.m154721d(str4, "");
        this.f146663a = str;
        this.f146664b = z;
        this.f146665c = str2;
        this.f146666d = str3;
        this.f146667e = z2;
        this.f146668f = bVar;
        this.f146669g = i;
        this.f146670h = str4;
    }
}
