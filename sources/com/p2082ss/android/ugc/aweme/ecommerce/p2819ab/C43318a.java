package com.p2082ss.android.ugc.aweme.ecommerce.p2819ab;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.ab.a */
public final class C43318a {
    @AbstractC27891c(mo46611a = "enable_fast_edit")

    /* renamed from: a */
    public boolean f101093a;
    @AbstractC27891c(mo46611a = "enable_check")

    /* renamed from: b */
    public boolean f101094b;
    @AbstractC27891c(mo46611a = "enable_lynx")

    /* renamed from: c */
    public boolean f101095c;

    static {
        Covode.recordClassIndex(51532);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43318a)) {
            return false;
        }
        C43318a aVar = (C43318a) obj;
        return this.f101093a == aVar.f101093a && this.f101094b == aVar.f101094b && this.f101095c == aVar.f101095c;
    }

    public final int hashCode() {
        boolean z = this.f101093a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.f101094b;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        if (!this.f101095c) {
            i = 0;
        }
        return i9 + i;
    }

    public final String toString() {
        return "AddressEditConfig(enableFastEdit=" + this.f101093a + ", enableCheck=" + this.f101094b + ", enableLynx=" + this.f101095c + ")";
    }

    public /* synthetic */ C43318a() {
        this(C89219l.m154714a((Object) "GB", (Object) C58071d.m104907a()));
    }

    private C43318a(boolean z) {
        this.f101093a = z;
        this.f101094b = true;
        this.f101095c = true;
    }
}
