package com.p2082ss.android.ugc.aweme.activity.processor;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.AbstractC17362a;

/* renamed from: com.ss.android.ugc.aweme.activity.processor.t */
public final class C33099t implements AbstractC17362a {

    /* renamed from: a */
    public final boolean f78666a = true;

    static {
        Covode.recordClassIndex(39911);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C33099t) && this.f78666a == ((C33099t) obj).f78666a;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f78666a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "EventBusConfig(enable=" + this.f78666a + ")";
    }
}
