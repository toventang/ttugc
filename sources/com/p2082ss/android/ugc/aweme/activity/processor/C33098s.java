package com.p2082ss.android.ugc.aweme.activity.processor;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.AbstractC17362a;

/* renamed from: com.ss.android.ugc.aweme.activity.processor.s */
public final class C33098s implements AbstractC17362a {

    /* renamed from: a */
    public final boolean f78665a;

    static {
        Covode.recordClassIndex(39910);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C33098s) && this.f78665a == ((C33098s) obj).f78665a;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f78665a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "AudioConfig(disable=" + this.f78665a + ")";
    }

    private /* synthetic */ C33098s() {
        this(false);
    }

    public C33098s(boolean z) {
        this.f78665a = z;
    }
}
