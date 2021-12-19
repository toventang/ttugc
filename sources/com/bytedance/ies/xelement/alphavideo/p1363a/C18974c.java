package com.bytedance.ies.xelement.alphavideo.p1363a;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;

/* renamed from: com.bytedance.ies.xelement.alphavideo.a.c */
public final class C18974c<V> {

    /* renamed from: a */
    public final V f44904a;

    /* renamed from: b */
    public final Throwable f44905b;

    static {
        Covode.recordClassIndex(21723);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44904a, this.f44905b});
    }

    public C18974c(V v) {
        this.f44904a = v;
    }

    public C18974c(Throwable th) {
        this.f44905b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18974c)) {
            return false;
        }
        C18974c cVar = (C18974c) obj;
        V v = this.f44904a;
        if (v != null && v.equals(cVar.f44904a)) {
            return true;
        }
        Throwable th = this.f44905b;
        if (th == null || cVar.f44905b == null) {
            return false;
        }
        return th.toString().equals(this.f44905b.toString());
    }
}
