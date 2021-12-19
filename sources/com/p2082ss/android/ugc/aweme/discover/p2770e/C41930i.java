package com.p2082ss.android.ugc.aweme.discover.p2770e;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.e.i */
public final class C41930i implements AbstractC81914b {

    /* renamed from: a */
    public final Bundle f97809a;

    static {
        Covode.recordClassIndex(49856);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C41930i) && C89219l.m154714a(this.f97809a, ((C41930i) obj).f97809a);
        }
        return true;
    }

    public final int hashCode() {
        Bundle bundle = this.f97809a;
        if (bundle != null) {
            return bundle.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "OpenHotSpotEvent(toDetailBundle=" + this.f97809a + ")";
    }

    public C41930i(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        this.f97809a = bundle;
    }
}
