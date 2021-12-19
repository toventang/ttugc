package com.bytedance.android.live.broadcast.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.model.k */
public final class C3267k {

    /* renamed from: a */
    public final int f9353a;

    /* renamed from: b */
    public final EnumC3268l f9354b;

    /* renamed from: c */
    public final CharSequence f9355c;

    /* renamed from: d */
    public final int f9356d;

    static {
        Covode.recordClassIndex(3749);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3267k)) {
            return false;
        }
        C3267k kVar = (C3267k) obj;
        return this.f9353a == kVar.f9353a && C89219l.m154714a(this.f9354b, kVar.f9354b) && C89219l.m154714a(this.f9355c, kVar.f9355c) && this.f9356d == kVar.f9356d;
    }

    public final int hashCode() {
        int i = this.f9353a * 31;
        EnumC3268l lVar = this.f9354b;
        int i2 = 0;
        int hashCode = (i + (lVar != null ? lVar.hashCode() : 0)) * 31;
        CharSequence charSequence = this.f9355c;
        if (charSequence != null) {
            i2 = charSequence.hashCode();
        }
        return ((hashCode + i2) * 31) + this.f9356d;
    }

    public final String toString() {
        return "NotifyInfo(viewVisibility=" + this.f9353a + ", notifyType=" + this.f9354b + ", text=" + this.f9355c + ", arrowVisibility=" + this.f9356d + ")";
    }

    public /* synthetic */ C3267k(EnumC3268l lVar) {
        this(8, lVar, "");
    }

    public C3267k(int i, EnumC3268l lVar, CharSequence charSequence) {
        C89219l.m154721d(lVar, "");
        C89219l.m154721d(charSequence, "");
        this.f9353a = i;
        this.f9354b = lVar;
        this.f9355c = charSequence;
        this.f9356d = 8;
    }
}
