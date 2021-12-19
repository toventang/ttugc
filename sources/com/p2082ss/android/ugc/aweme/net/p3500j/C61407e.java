package com.p2082ss.android.ugc.aweme.net.p3500j;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.net.j.e */
public final class C61407e {
    @AbstractC27891c(mo46611a = "enableNetworkMonitor")

    /* renamed from: a */
    public boolean f139412a;
    @AbstractC27891c(mo46611a = "enableTTNetMonitor")

    /* renamed from: b */
    public boolean f139413b;
    @AbstractC27891c(mo46611a = "enableOkHttpMonitor")

    /* renamed from: c */
    public boolean f139414c;
    @AbstractC27891c(mo46611a = "enableUrlConnectionMonitor")

    /* renamed from: d */
    public boolean f139415d;
    @AbstractC27891c(mo46611a = "enableHttpClientMonitor")

    /* renamed from: e */
    public boolean f139416e;
    @AbstractC27891c(mo46611a = "enableWebMonitor")

    /* renamed from: f */
    public boolean f139417f;

    static {
        Covode.recordClassIndex(72057);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61407e)) {
            return false;
        }
        C61407e eVar = (C61407e) obj;
        return this.f139412a == eVar.f139412a && this.f139413b == eVar.f139413b && this.f139414c == eVar.f139414c && this.f139415d == eVar.f139415d && this.f139416e == eVar.f139416e && this.f139417f == eVar.f139417f;
    }

    public final int hashCode() {
        boolean z = this.f139412a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.f139413b;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        boolean z3 = this.f139414c;
        if (z3) {
            z3 = true;
        }
        int i10 = z3 ? 1 : 0;
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = (i9 + i10) * 31;
        boolean z4 = this.f139415d;
        if (z4) {
            z4 = true;
        }
        int i14 = z4 ? 1 : 0;
        int i15 = z4 ? 1 : 0;
        int i16 = z4 ? 1 : 0;
        int i17 = (i13 + i14) * 31;
        boolean z5 = this.f139416e;
        if (z5) {
            z5 = true;
        }
        int i18 = z5 ? 1 : 0;
        int i19 = z5 ? 1 : 0;
        int i20 = z5 ? 1 : 0;
        int i21 = (i17 + i18) * 31;
        if (!this.f139417f) {
            i = 0;
        }
        return i21 + i;
    }

    public final String toString() {
        return "NetworkMonitorConfig(enableNetworkMonitor=" + this.f139412a + ", enableTTNetMonitor=" + this.f139413b + ", enableOkHttpMonitor=" + this.f139414c + ", enableUrlConnectionMonitor=" + this.f139415d + ", enableHttpClientMonitor=" + this.f139416e + ", enableWebMonitor=" + this.f139417f + ")";
    }

    private C61407e() {
        this.f139412a = true;
        this.f139413b = true;
        this.f139414c = true;
        this.f139415d = true;
        this.f139416e = true;
        this.f139417f = true;
    }

    public /* synthetic */ C61407e(byte b) {
        this();
    }
}
