package com.bytedance.ies.bullet.service.base;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.base.d */
public final class C16630d {

    /* renamed from: a */
    public String f39786a;

    /* renamed from: b */
    public String f39787b;

    /* renamed from: c */
    public boolean f39788c = false;

    static {
        Covode.recordClassIndex(19067);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16630d)) {
            return false;
        }
        C16630d dVar = (C16630d) obj;
        return C89219l.m154714a(this.f39786a, dVar.f39786a) && C89219l.m154714a(this.f39787b, dVar.f39787b) && this.f39788c == dVar.f39788c;
    }

    public final int hashCode() {
        String str = this.f39786a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f39787b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f39788c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public final String toString() {
        return "ChannelBundleModel(channel=" + this.f39786a + ", bundlePath=" + this.f39787b + ", valid=" + this.f39788c + ")";
    }

    /* renamed from: a */
    public final String mo26389a() {
        if (this.f39788c) {
            return this.f39786a;
        }
        return null;
    }

    /* renamed from: b */
    public final String mo26391b() {
        if (this.f39788c) {
            return this.f39787b;
        }
        return null;
    }

    /* renamed from: a */
    public final void mo26390a(String str) {
        C89219l.m154719c(str, "");
        this.f39786a = str;
    }

    /* renamed from: b */
    public final void mo26392b(String str) {
        C89219l.m154719c(str, "");
        this.f39787b = str;
    }

    public C16630d(String str, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        this.f39786a = str;
        this.f39787b = str2;
    }
}
