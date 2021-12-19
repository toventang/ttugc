package com.p2082ss.android.ugc.aweme.activity.processor;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.AbstractC17362a;

/* renamed from: com.ss.android.ugc.aweme.activity.processor.aa */
public final class C33071aa implements AbstractC17362a {

    /* renamed from: a */
    public final int f78631a;

    static {
        Covode.recordClassIndex(39883);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C33071aa) && this.f78631a == ((C33071aa) obj).f78631a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f78631a;
    }

    public final String toString() {
        return "TransitionConfig(type=" + this.f78631a + ")";
    }

    public C33071aa(int i) {
        this.f78631a = i;
    }
}
