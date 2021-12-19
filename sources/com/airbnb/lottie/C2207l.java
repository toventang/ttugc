package com.airbnb.lottie;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;

/* renamed from: com.airbnb.lottie.l */
public final class C2207l<V> {

    /* renamed from: a */
    public final V f6621a;

    /* renamed from: b */
    public final Throwable f6622b;

    static {
        Covode.recordClassIndex(2402);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6621a, this.f6622b});
    }

    public C2207l(V v) {
        this.f6621a = v;
    }

    public C2207l(Throwable th) {
        this.f6622b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2207l)) {
            return false;
        }
        C2207l lVar = (C2207l) obj;
        V v = this.f6621a;
        if (v != null && v.equals(lVar.f6621a)) {
            return true;
        }
        Throwable th = this.f6622b;
        if (th == null || lVar.f6622b == null) {
            return false;
        }
        return th.toString().equals(this.f6622b.toString());
    }
}
