package com.bytedance.lottie.p1499c;

import androidx.core.p036g.C0692e;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.lottie.c.h */
public final class C21036h<T> {

    /* renamed from: a */
    public T f49918a;

    /* renamed from: b */
    public T f49919b;

    static {
        Covode.recordClassIndex(24652);
    }

    public final int hashCode() {
        int hashCode;
        T t = this.f49918a;
        int i = 0;
        if (t == null) {
            hashCode = 0;
        } else {
            hashCode = t.hashCode();
        }
        T t2 = this.f49919b;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return "Pair{" + String.valueOf(this.f49918a) + " " + String.valueOf(this.f49919b) + "}";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0692e)) {
            return false;
        }
        C0692e eVar = (C0692e) obj;
        if (!m39612a(eVar.f2750a, this.f49918a) || !m39612a(eVar.f2751b, this.f49919b)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m39612a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }
}
