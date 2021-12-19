package com.bytedance.jedi.p1445a.p1454g.p1455a;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* renamed from: com.bytedance.jedi.a.g.a.a */
public abstract class AbstractC20192a<T> {
    static {
        Covode.recordClassIndex(23700);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo33490b(T t);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo33491b(T t, T t2);

    /* renamed from: com.bytedance.jedi.a.g.a.a$a */
    public static final class C20193a extends AbstractC20192a<Object> implements Serializable {

        /* renamed from: a */
        public static final C20193a f47965a = new C20193a();
        private static final long serialVersionUID = 1;

        C20193a() {
        }

        private Object readResolve() {
            return f47965a;
        }

        static {
            Covode.recordClassIndex(23701);
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.jedi.p1445a.p1454g.p1455a.AbstractC20192a
        /* renamed from: b */
        public final int mo33490b(Object obj) {
            return obj.hashCode();
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.jedi.p1445a.p1454g.p1455a.AbstractC20192a
        /* renamed from: b */
        public final boolean mo33491b(Object obj, Object obj2) {
            return obj.equals(obj2);
        }
    }

    /* renamed from: com.bytedance.jedi.a.g.a.a$b */
    public static final class C20194b extends AbstractC20192a<Object> implements Serializable {

        /* renamed from: a */
        public static final C20194b f47966a = new C20194b();
        private static final long serialVersionUID = 1;

        /* access modifiers changed from: protected */
        @Override // com.bytedance.jedi.p1445a.p1454g.p1455a.AbstractC20192a
        /* renamed from: b */
        public final boolean mo33491b(Object obj, Object obj2) {
            return false;
        }

        C20194b() {
        }

        private Object readResolve() {
            return f47966a;
        }

        static {
            Covode.recordClassIndex(23702);
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.jedi.p1445a.p1454g.p1455a.AbstractC20192a
        /* renamed from: b */
        public final int mo33490b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    protected AbstractC20192a() {
    }

    /* renamed from: a */
    public final int mo33488a(T t) {
        if (t == null) {
            return 0;
        }
        return mo33490b(t);
    }

    /* renamed from: a */
    public final boolean mo33489a(T t, T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return mo33491b(t, t2);
    }
}
