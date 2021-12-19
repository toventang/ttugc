package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3245ui.textbox;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.b */
public final class C56144b {

    /* renamed from: a */
    public final int f128067a;

    /* renamed from: b */
    public final int f128068b;

    static {
        Covode.recordClassIndex(65945);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56144b)) {
            return false;
        }
        C56144b bVar = (C56144b) obj;
        return this.f128067a == bVar.f128067a && this.f128068b == bVar.f128068b;
    }

    public final int hashCode() {
        return (this.f128067a * 31) + this.f128068b;
    }

    public final String toString() {
        return "SendButtonText(resId=" + this.f128067a + ", selectedSize=" + this.f128068b + ")";
    }

    public /* synthetic */ C56144b(int i) {
        this(i, 0);
    }

    public C56144b(int i, int i2) {
        this.f128067a = i;
        this.f128068b = i2;
    }
}
