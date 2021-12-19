package com.p2082ss.android.ugc.aweme.commercialize.feed.timegap;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.timegap.a */
public final class C37990a implements Serializable {
    @AbstractC27891c(mo46611a = "delta_gap")

    /* renamed from: a */
    private final int f89793a;
    @AbstractC27891c(mo46611a = "source")

    /* renamed from: b */
    private final int f89794b;

    static {
        Covode.recordClassIndex(45451);
    }

    /* renamed from: com_ss_android_ugc_aweme_commercialize_feed_timegap_AdAdjustInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m77046x5f6efa23(int i) {
        return i;
    }

    public static /* synthetic */ C37990a copy$default(C37990a aVar, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = aVar.f89793a;
        }
        if ((i3 & 2) != 0) {
            i2 = aVar.f89794b;
        }
        return aVar.copy(i, i2);
    }

    public final int component1() {
        return this.f89793a;
    }

    public final int component2() {
        return this.f89794b;
    }

    public final C37990a copy(int i, int i2) {
        return new C37990a(i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37990a)) {
            return false;
        }
        C37990a aVar = (C37990a) obj;
        return this.f89793a == aVar.f89793a && this.f89794b == aVar.f89794b;
    }

    public final int hashCode() {
        return (m77046x5f6efa23(this.f89793a) * 31) + m77046x5f6efa23(this.f89794b);
    }

    public final String toString() {
        return "AdAdjustInfo(deltaGap=" + this.f89793a + ", adjustSource=" + this.f89794b + ")";
    }

    public final int getAdjustSource() {
        return this.f89794b;
    }

    public final int getDeltaGap() {
        return this.f89793a;
    }

    public C37990a(int i, int i2) {
        this.f89793a = i;
        this.f89794b = i2;
    }
}
