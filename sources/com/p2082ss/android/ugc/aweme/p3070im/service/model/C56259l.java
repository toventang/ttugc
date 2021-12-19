package com.p2082ss.android.ugc.aweme.p3070im.service.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.service.model.l */
public final class C56259l implements AbstractC81914b {

    /* renamed from: a */
    public final String f128329a;

    /* renamed from: b */
    public final String f128330b;

    /* renamed from: c */
    public final long f128331c = 3000;

    /* renamed from: d */
    public final IMContact f128332d;

    /* renamed from: e */
    public final boolean f128333e;

    /* renamed from: f */
    public final AbstractC56258k f128334f;

    /* renamed from: g */
    public final String f128335g;

    /* renamed from: h */
    public final String f128336h;

    static {
        Covode.recordClassIndex(66072);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56259l)) {
            return false;
        }
        C56259l lVar = (C56259l) obj;
        return C89219l.m154714a(this.f128329a, lVar.f128329a) && C89219l.m154714a(this.f128330b, lVar.f128330b) && this.f128331c == lVar.f128331c && C89219l.m154714a(this.f128332d, lVar.f128332d) && this.f128333e == lVar.f128333e && C89219l.m154714a(this.f128334f, lVar.f128334f) && C89219l.m154714a(this.f128335g, lVar.f128335g) && C89219l.m154714a(this.f128336h, lVar.f128336h);
    }

    public final String toString() {
        return "ShareSendingEvent(awemeId=" + this.f128329a + ", identity=" + this.f128330b + ", duration=" + this.f128331c + ", contact=" + this.f128332d + ", isMulti=" + this.f128333e + ", undoCallback=" + this.f128334f + ", enterFrom=" + this.f128335g + ", enterMethod=" + this.f128336h + ")";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str = this.f128329a;
        int i6 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i7 = i * 31;
        String str2 = this.f128330b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        long j = this.f128331c;
        int i8 = (((i7 + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        IMContact iMContact = this.f128332d;
        if (iMContact != null) {
            i3 = iMContact.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        boolean z = this.f128333e;
        if (z) {
            z = true;
        }
        int i10 = z ? 1 : 0;
        int i11 = z ? 1 : 0;
        int i12 = z ? 1 : 0;
        int i13 = (i9 + i10) * 31;
        AbstractC56258k kVar = this.f128334f;
        if (kVar != null) {
            i4 = kVar.hashCode();
        } else {
            i4 = 0;
        }
        int i14 = (i13 + i4) * 31;
        String str3 = this.f128335g;
        if (str3 != null) {
            i5 = str3.hashCode();
        } else {
            i5 = 0;
        }
        int i15 = (i14 + i5) * 31;
        String str4 = this.f128336h;
        if (str4 != null) {
            i6 = str4.hashCode();
        }
        return i15 + i6;
    }

    public C56259l(String str, String str2, IMContact iMContact, boolean z, AbstractC56258k kVar, String str3, String str4) {
        C89219l.m154721d(str2, "");
        C89219l.m154721d(iMContact, "");
        C89219l.m154721d(kVar, "");
        this.f128329a = str;
        this.f128330b = str2;
        this.f128332d = iMContact;
        this.f128333e = z;
        this.f128334f = kVar;
        this.f128335g = str3;
        this.f128336h = str4;
    }
}
