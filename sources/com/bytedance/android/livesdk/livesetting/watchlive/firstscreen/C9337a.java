package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.a */
public final class C9337a {
    @AbstractC27891c(mo46611a = "score_high")

    /* renamed from: a */
    public final float f22810a;
    @AbstractC27891c(mo46611a = "score_low")

    /* renamed from: b */
    public final float f22811b;

    static {
        Covode.recordClassIndex(10840);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9337a)) {
            return false;
        }
        C9337a aVar = (C9337a) obj;
        return Float.compare(this.f22810a, aVar.f22810a) == 0 && Float.compare(this.f22811b, aVar.f22811b) == 0;
    }

    public final String toString() {
        return "MultiPlayerScoreLimit(scoreHigh=" + this.f22810a + ", scoreLow=" + this.f22811b + ")";
    }

    private C9337a() {
        this.f22810a = -1.0f;
        this.f22811b = -1.0f;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f22810a) * 31) + Float.floatToIntBits(this.f22811b);
    }

    public /* synthetic */ C9337a(byte b) {
        this();
    }
}
