package com.p2082ss.android.ugc.tools.p4346h.p4349b.p4351b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.h.b.b.k */
public final class C84519k {

    /* renamed from: a */
    public final int f188904a;

    /* renamed from: b */
    public final int f188905b;

    /* renamed from: c */
    public final String f188906c;

    /* renamed from: d */
    public final boolean f188907d;

    /* renamed from: e */
    public final String f188908e;

    static {
        Covode.recordClassIndex(98484);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C84519k)) {
            return false;
        }
        C84519k kVar = (C84519k) obj;
        return this.f188904a == kVar.f188904a && this.f188905b == kVar.f188905b && C89219l.m154714a(this.f188906c, kVar.f188906c) && this.f188907d == kVar.f188907d && C89219l.m154714a(this.f188908e, kVar.f188908e);
    }

    public final int hashCode() {
        int i = ((this.f188904a * 31) + this.f188905b) * 31;
        String str = this.f188906c;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.f188907d;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        String str2 = this.f188908e;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i6 + i2;
    }

    public final String toString() {
        return "EpCategoryCursorData(cursor=" + this.f188904a + ", sortingPosting=" + this.f188905b + ", version=" + this.f188906c + ", hasMore=" + this.f188907d + ", category=" + this.f188908e + ")";
    }

    public C84519k(int i, int i2, String str, boolean z, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f188904a = i;
        this.f188905b = i2;
        this.f188906c = str;
        this.f188907d = z;
        this.f188908e = str2;
    }
}
