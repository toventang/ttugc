package com.bytedance.common.utility.collection;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.common.utility.collection.e */
public final class C13606e<T> extends WeakReference<T> {

    /* renamed from: a */
    int f33083a;

    static {
        Covode.recordClassIndex(15633);
    }

    public final int hashCode() {
        return this.f33083a;
    }

    public C13606e(T t) {
        super(t);
        int hashCode;
        if (t == null) {
            hashCode = 0;
        } else {
            hashCode = t.hashCode();
        }
        this.f33083a = hashCode;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13606e)) {
            return false;
        }
        Object obj2 = super.get();
        Object obj3 = ((C13606e) obj).get();
        if (obj2 != null) {
            return obj2.equals(obj3);
        }
        if (obj2 == obj3) {
            return true;
        }
        return false;
    }
}
