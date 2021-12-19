package com.airbnb.lottie.p099e.p100a;

import com.airbnb.lottie.p107j.C2202a;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.lottie.e.a.n */
public abstract class AbstractC2061n<V, O> implements AbstractC2060m<V, O> {

    /* renamed from: a */
    final List<C2202a<V>> f6169a;

    static {
        Covode.recordClassIndex(2256);
    }

    /* renamed from: b */
    public List<C2202a<V>> mo5948b() {
        return this.f6169a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f6169a.isEmpty()) {
            sb.append("values=").append(Arrays.toString(this.f6169a.toArray()));
        }
        return sb.toString();
    }

    AbstractC2061n(List<C2202a<V>> list) {
        this.f6169a = list;
    }

    AbstractC2061n(V v) {
        this(Collections.singletonList(new C2202a(v)));
    }
}
