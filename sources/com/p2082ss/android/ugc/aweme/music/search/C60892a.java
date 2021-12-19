package com.p2082ss.android.ugc.aweme.music.search;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.search.a */
public final class C60892a {

    /* renamed from: a */
    public final int f138372a;

    /* renamed from: b */
    public final String f138373b;

    /* renamed from: c */
    public final String f138374c;

    /* renamed from: d */
    public final int f138375d;

    /* renamed from: e */
    public final int f138376e = 20;

    /* renamed from: f */
    public final boolean f138377f;

    static {
        Covode.recordClassIndex(71483);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60892a)) {
            return false;
        }
        C60892a aVar = (C60892a) obj;
        return this.f138372a == aVar.f138372a && C89219l.m154714a(this.f138373b, aVar.f138373b) && C89219l.m154714a(this.f138374c, aVar.f138374c) && this.f138375d == aVar.f138375d && this.f138376e == aVar.f138376e && this.f138377f == aVar.f138377f;
    }

    public final int hashCode() {
        int i = this.f138372a * 31;
        String str = this.f138373b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f138374c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i3 = (((((hashCode + i2) * 31) + this.f138375d) * 31) + this.f138376e) * 31;
        boolean z = this.f138377f;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "CursorData(requestUUID=" + this.f138372a + ", secUid=" + this.f138373b + ", keyword=" + this.f138374c + ", cursor=" + this.f138375d + ", count=" + this.f138376e + ", isFirst=" + this.f138377f + ")";
    }

    public C60892a(int i, String str, String str2, int i2, boolean z) {
        this.f138372a = i;
        this.f138373b = str;
        this.f138374c = str2;
        this.f138375d = i2;
        this.f138377f = z;
    }
}
