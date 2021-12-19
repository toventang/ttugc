package com.google.p1998c.p1999a;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.google.c.a.m */
public final class C27247m {
    static {
        Covode.recordClassIndex(32827);
    }

    /* renamed from: com.google.c.a.m$b */
    public static class C27249b<T> implements AbstractC27246l<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final T f64410a;

        static {
            Covode.recordClassIndex(32829);
        }

        public final int hashCode() {
            return this.f64410a.hashCode();
        }

        public final String toString() {
            return "Predicates.equalTo(" + ((Object) this.f64410a) + ")";
        }

        private C27249b(T t) {
            this.f64410a = t;
        }

        @Override // com.google.p1998c.p1999a.AbstractC27246l
        /* renamed from: a */
        public final boolean mo45331a(T t) {
            return this.f64410a.equals(t);
        }

        @Override // com.google.p1998c.p1999a.AbstractC27246l
        public final boolean equals(Object obj) {
            if (obj instanceof C27249b) {
                return this.f64410a.equals(((C27249b) obj).f64410a);
            }
            return false;
        }

        public /* synthetic */ C27249b(Object obj, byte b) {
            this(obj);
        }
    }

    /* renamed from: com.google.c.a.m$a */
    public static class C27248a<T> implements AbstractC27246l<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final List<? extends AbstractC27246l<? super T>> f64409a;

        static {
            Covode.recordClassIndex(32828);
        }

        public final int hashCode() {
            return this.f64409a.hashCode() + 306654252;
        }

        public final String toString() {
            List<? extends AbstractC27246l<? super T>> list = this.f64409a;
            StringBuilder append = new StringBuilder("Predicates.").append("and").append('(');
            boolean z = true;
            for (T t : list) {
                if (!z) {
                    append.append(',');
                }
                append.append((Object) t);
                z = false;
            }
            return append.append(')').toString();
        }

        private C27248a(List<? extends AbstractC27246l<? super T>> list) {
            this.f64409a = list;
        }

        @Override // com.google.p1998c.p1999a.AbstractC27246l
        /* renamed from: a */
        public final boolean mo45331a(T t) {
            for (int i = 0; i < this.f64409a.size(); i++) {
                if (!((AbstractC27246l) this.f64409a.get(i)).mo45331a(t)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.p1998c.p1999a.AbstractC27246l
        public final boolean equals(Object obj) {
            if (obj instanceof C27248a) {
                return this.f64409a.equals(((C27248a) obj).f64409a);
            }
            return false;
        }

        public /* synthetic */ C27248a(List list, byte b) {
            this(list);
        }
    }

    /* renamed from: com.google.c.a.m$c */
    public static class C27250c<T> implements AbstractC27246l<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final AbstractC27246l<T> f64411a;

        static {
            Covode.recordClassIndex(32830);
        }

        public final int hashCode() {
            return this.f64411a.hashCode() ^ -1;
        }

        public final String toString() {
            return "Predicates.not(" + this.f64411a + ")";
        }

        public C27250c(AbstractC27246l<T> lVar) {
            this.f64411a = (AbstractC27246l) C27245k.m54229a(lVar);
        }

        @Override // com.google.p1998c.p1999a.AbstractC27246l
        /* renamed from: a */
        public final boolean mo45331a(T t) {
            if (!this.f64411a.mo45331a(t)) {
                return true;
            }
            return false;
        }

        @Override // com.google.p1998c.p1999a.AbstractC27246l
        public final boolean equals(Object obj) {
            if (obj instanceof C27250c) {
                return this.f64411a.equals(((C27250c) obj).f64411a);
            }
            return false;
        }
    }
}
