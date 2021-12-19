package com.p2082ss.android.ugc.aweme.editSticker.text.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.g */
public final class C46090g {
    @AbstractC27891c(mo46611a = "ifstandard")

    /* renamed from: a */
    public final boolean f107334a;

    /* renamed from: b */
    public final boolean f107335b;

    static {
        Covode.recordClassIndex(54648);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46090g)) {
            return false;
        }
        C46090g gVar = (C46090g) obj;
        return this.f107334a == gVar.f107334a && this.f107335b == gVar.f107335b;
    }

    public final int hashCode() {
        boolean z = this.f107334a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        if (!this.f107335b) {
            i = 0;
        }
        return i5 + i;
    }

    public final String toString() {
        return "EffectTextEffectExtra(ifStandard=" + this.f107334a + ", ifNone=" + this.f107335b + ")";
    }

    public /* synthetic */ C46090g() {
        this(false, false);
    }

    public C46090g(boolean z, boolean z2) {
        this.f107334a = z;
        this.f107335b = z2;
    }
}
