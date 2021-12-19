package com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.layout;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.e */
public final class C50397e {

    /* renamed from: a */
    public final int f116354a;

    /* renamed from: b */
    public final int f116355b;

    static {
        Covode.recordClassIndex(59529);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50397e)) {
            return false;
        }
        C50397e eVar = (C50397e) obj;
        return this.f116354a == eVar.f116354a && this.f116355b == eVar.f116355b;
    }

    public final int hashCode() {
        return (this.f116354a * 31) + this.f116355b;
    }

    public final String toString() {
        return "OptionDescVO(imageResId=" + this.f116354a + ", textResId=" + this.f116355b + ")";
    }

    public C50397e(int i, int i2) {
        this.f116354a = i;
        this.f116355b = i2;
    }
}
