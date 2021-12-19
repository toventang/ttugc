package com.p2082ss.android.ugc.aweme.activity;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;

/* renamed from: com.ss.android.ugc.aweme.activity.b */
public final class C33069b implements AbstractC81914b {

    /* renamed from: a */
    public final boolean f78626a;

    static {
        Covode.recordClassIndex(39880);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C33069b) && this.f78626a == ((C33069b) obj).f78626a;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f78626a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "SkyLightShownEvent(shown=" + this.f78626a + ")";
    }

    public C33069b(boolean z) {
        this.f78626a = z;
    }
}
