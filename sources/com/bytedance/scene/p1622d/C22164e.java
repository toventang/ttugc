package com.bytedance.scene.p1622d;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.scene.d.e */
public final class C22164e<F, S> {

    /* renamed from: a */
    public final F f52402a;

    /* renamed from: b */
    public final S f52403b;

    static {
        Covode.recordClassIndex(25968);
    }

    public final int hashCode() {
        return this.f52402a.hashCode() ^ this.f52403b.hashCode();
    }

    public final String toString() {
        return "Pair{" + String.valueOf(this.f52402a) + " " + String.valueOf(this.f52403b) + "}";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22164e)) {
            return false;
        }
        C22164e eVar = (C22164e) obj;
        if (!m41647b(eVar.f52402a, this.f52402a) || !m41647b(eVar.f52403b, this.f52403b)) {
            return false;
        }
        return true;
    }

    private C22164e(F f, S s) {
        this.f52402a = f;
        this.f52403b = s;
    }

    /* renamed from: a */
    public static <A, B> C22164e<A, B> m41646a(A a, B b) {
        return new C22164e<>(a, b);
    }

    /* renamed from: b */
    private static boolean m41647b(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }
}
