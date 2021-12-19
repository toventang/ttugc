package com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4087b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.b.b.a */
public final class C77869a {

    /* renamed from: a */
    public final int f174719a;

    /* renamed from: b */
    public final String f174720b;

    /* renamed from: c */
    public final String f174721c;

    /* renamed from: d */
    public final String f174722d;

    /* renamed from: e */
    public final String f174723e;

    /* renamed from: f */
    public final int f174724f;

    /* renamed from: g */
    public final int f174725g;

    /* renamed from: h */
    public final int f174726h;

    /* renamed from: i */
    public final String f174727i;

    static {
        Covode.recordClassIndex(90956);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C77869a)) {
            return false;
        }
        C77869a aVar = (C77869a) obj;
        return this.f174719a == aVar.f174719a && C89219l.m154714a(this.f174720b, aVar.f174720b) && C89219l.m154714a(this.f174721c, aVar.f174721c) && C89219l.m154714a(this.f174722d, aVar.f174722d) && C89219l.m154714a(this.f174723e, aVar.f174723e) && this.f174724f == aVar.f174724f && this.f174725g == aVar.f174725g && this.f174726h == aVar.f174726h && C89219l.m154714a(this.f174727i, aVar.f174727i);
    }

    public final int hashCode() {
        int i = this.f174719a * 31;
        String str = this.f174720b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f174721c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f174722d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f174723e;
        int hashCode4 = (((((((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f174724f) * 31) + this.f174725g) * 31) + this.f174726h) * 31;
        String str5 = this.f174727i;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "LocalBeauty(iconResId=" + this.f174719a + ", effectId=" + this.f174720b + ", resourceId=" + this.f174721c + ", name=" + this.f174722d + ", unzipPath=" + this.f174723e + ", min=" + this.f174724f + ", default=" + this.f174725g + ", max=" + this.f174726h + ", tag=" + this.f174727i + ")";
    }

    private C77869a(int i, String str, String str2, String str3, String str4, int i2, String str5) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        this.f174719a = i;
        this.f174720b = str;
        this.f174721c = str2;
        this.f174722d = str3;
        this.f174723e = str4;
        this.f174724f = 0;
        this.f174725g = i2;
        this.f174726h = 100;
        this.f174727i = str5;
    }

    public /* synthetic */ C77869a(int i, String str, String str2, String str3, String str4, int i2, String str5, byte b) {
        this(i, str, str2, str3, str4, i2, str5);
    }
}
