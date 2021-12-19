package com.google.p1998c.p1999a;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* renamed from: com.google.c.a.d */
public abstract class AbstractC27231d<T> {
    static {
        Covode.recordClassIndex(32811);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo45317b(T t);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo45318b(T t, T t2);

    /* renamed from: com.google.c.a.d$a */
    public static final class C27232a extends AbstractC27231d<Object> implements Serializable {

        /* renamed from: a */
        public static final C27232a f64394a = new C27232a();
        private static final long serialVersionUID = 1;

        C27232a() {
        }

        private Object readResolve() {
            return f64394a;
        }

        static {
            Covode.recordClassIndex(32812);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.p1998c.p1999a.AbstractC27231d
        /* renamed from: b */
        public final int mo45317b(Object obj) {
            return obj.hashCode();
        }

        /* access modifiers changed from: protected */
        @Override // com.google.p1998c.p1999a.AbstractC27231d
        /* renamed from: b */
        public final boolean mo45318b(Object obj, Object obj2) {
            return obj.equals(obj2);
        }
    }

    /* renamed from: com.google.c.a.d$b */
    public static final class C27233b extends AbstractC27231d<Object> implements Serializable {

        /* renamed from: a */
        public static final C27233b f64395a = new C27233b();
        private static final long serialVersionUID = 1;

        /* access modifiers changed from: protected */
        @Override // com.google.p1998c.p1999a.AbstractC27231d
        /* renamed from: b */
        public final boolean mo45318b(Object obj, Object obj2) {
            return false;
        }

        C27233b() {
        }

        private Object readResolve() {
            return f64395a;
        }

        static {
            Covode.recordClassIndex(32813);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.p1998c.p1999a.AbstractC27231d
        /* renamed from: b */
        public final int mo45317b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    protected AbstractC27231d() {
    }

    /* renamed from: a */
    public final int mo45315a(T t) {
        if (t == null) {
            return 0;
        }
        return mo45317b(t);
    }

    /* renamed from: a */
    public final boolean mo45316a(T t, T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return mo45318b(t, t2);
    }
}
