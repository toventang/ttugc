package com.bytedance.lottie;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;

/* renamed from: com.bytedance.lottie.n */
public final class C21122n<V> {

    /* renamed from: a */
    public final V f50100a;

    /* renamed from: b */
    public final Throwable f50101b;

    static {
        Covode.recordClassIndex(24738);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50100a, this.f50101b});
    }

    public C21122n(V v) {
        this.f50100a = v;
    }

    public C21122n(Throwable th) {
        this.f50101b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21122n)) {
            return false;
        }
        C21122n nVar = (C21122n) obj;
        V v = this.f50100a;
        if (v != null && v.equals(nVar.f50100a)) {
            return true;
        }
        Throwable th = this.f50101b;
        if (th == null || nVar.f50101b == null) {
            return false;
        }
        return th.toString().equals(this.f50101b.toString());
    }
}
