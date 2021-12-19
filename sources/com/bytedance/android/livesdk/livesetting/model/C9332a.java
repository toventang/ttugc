package com.bytedance.android.livesdk.livesetting.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.bytedance.android.livesdk.livesetting.model.a */
public final class C9332a implements Serializable {
    @AbstractC27891c(mo46611a = "enable_new_banner")

    /* renamed from: a */
    private final boolean f22786a;

    static {
        Covode.recordClassIndex(10560);
    }

    public C9332a() {
        this(false, 1, null);
    }

    public static /* synthetic */ C9332a copy$default(C9332a aVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = aVar.f22786a;
        }
        return aVar.copy(z);
    }

    public final boolean component1() {
        return this.f22786a;
    }

    public final C9332a copy(boolean z) {
        return new C9332a(z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C9332a) && this.f22786a == ((C9332a) obj).f22786a;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f22786a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "LiveBannerSettings(enableNewBanner=" + this.f22786a + ")";
    }

    public final boolean getEnableNewBanner() {
        return this.f22786a;
    }

    public C9332a(boolean z) {
        this.f22786a = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9332a(boolean z, int i, C89214g gVar) {
        this((i & 1) != 0 ? true : z);
    }
}
