package com.bytedance.lottie.p1499c.p1500a;

import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.p1506g.C21089a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.lottie.c.a.n */
public abstract class AbstractC20990n<V, O> implements AbstractC20989m<V, O> {

    /* renamed from: a */
    public final List<C21089a<V>> f49726a;

    static {
        Covode.recordClassIndex(24606);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f49726a.isEmpty()) {
            sb.append("values=").append(Arrays.toString(this.f49726a.toArray()));
        }
        return sb.toString();
    }

    AbstractC20990n(List<C21089a<V>> list) {
        this.f49726a = list;
    }

    AbstractC20990n(V v) {
        this(Collections.singletonList(new C21089a(v)));
    }
}
