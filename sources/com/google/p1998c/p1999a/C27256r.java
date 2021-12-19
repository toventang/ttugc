package com.google.p1998c.p1999a;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.Arrays;

/* renamed from: com.google.c.a.r */
public final class C27256r {
    static {
        Covode.recordClassIndex(32836);
    }

    /* renamed from: com.google.c.a.r$a */
    public static class C27257a<T> implements AbstractC27255q<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final T f64418a;

        static {
            Covode.recordClassIndex(32837);
        }

        @Override // com.google.p1998c.p1999a.AbstractC27255q
        /* renamed from: b */
        public final T mo5560b() {
            return this.f64418a;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f64418a});
        }

        public final String toString() {
            return "Suppliers.ofInstance(" + ((Object) this.f64418a) + ")";
        }

        public C27257a(T t) {
            this.f64418a = t;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C27257a) {
                return C27241i.m54222a(this.f64418a, ((C27257a) obj).f64418a);
            }
            return false;
        }
    }
}
