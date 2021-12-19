package com.p2082ss.android.ugc.gamora.recorder.p4294b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.b.d */
public final class C83409d {

    /* renamed from: a */
    public int f186281a;

    /* renamed from: b */
    public final String f186282b;

    /* renamed from: c */
    public final String f186283c;

    /* renamed from: d */
    public final String f186284d;

    /* renamed from: e */
    public final boolean f186285e;

    /* renamed from: f */
    public final AbstractC83468l f186286f;

    static {
        Covode.recordClassIndex(97295);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C83409d)) {
            return false;
        }
        C83409d dVar = (C83409d) obj;
        return C89219l.m154714a(this.f186282b, dVar.f186282b) && C89219l.m154714a(this.f186283c, dVar.f186283c) && C89219l.m154714a(this.f186284d, dVar.f186284d) && this.f186285e == dVar.f186285e && C89219l.m154714a(this.f186286f, dVar.f186286f);
    }

    public final int hashCode() {
        String str = this.f186282b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f186283c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f186284d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.f186285e;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode3 + i2) * 31;
        AbstractC83468l lVar = this.f186286f;
        if (lVar != null) {
            i = lVar.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        return "BottomTabItem(text=" + this.f186282b + ", tag=" + this.f186283c + ", shootMode=" + this.f186284d + ", defaultSelected=" + this.f186285e + ", listener=" + this.f186286f + ")";
    }

    public C83409d(String str, String str2, String str3, boolean z, AbstractC83468l lVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f186282b = str;
        this.f186283c = str2;
        this.f186284d = str3;
        this.f186285e = z;
        this.f186286f = lVar;
    }
}
