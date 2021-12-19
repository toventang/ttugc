package com.airbnb.lottie.p099e;

import androidx.core.p036g.C0692e;
import com.bytedance.covode.number.Covode;

/* renamed from: com.airbnb.lottie.e.h */
public final class C2107h<T> {

    /* renamed from: a */
    public T f6362a;

    /* renamed from: b */
    public T f6363b;

    static {
        Covode.recordClassIndex(2302);
    }

    public final int hashCode() {
        int hashCode;
        T t = this.f6362a;
        int i = 0;
        if (t == null) {
            hashCode = 0;
        } else {
            hashCode = t.hashCode();
        }
        T t2 = this.f6363b;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return "Pair{" + String.valueOf(this.f6362a) + " " + String.valueOf(this.f6363b) + "}";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0692e)) {
            return false;
        }
        C0692e eVar = (C0692e) obj;
        if (!m6586a(eVar.f2750a, this.f6362a) || !m6586a(eVar.f2751b, this.f6363b)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m6586a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }
}
