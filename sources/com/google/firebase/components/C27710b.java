package com.google.firebase.components;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.components.b */
public final class C27710b<T> {

    /* renamed from: a */
    public final Set<Class<? super T>> f65126a;

    /* renamed from: b */
    public final Set<C27727n> f65127b;

    /* renamed from: c */
    public final AbstractC27718g<T> f65128c;

    /* renamed from: d */
    public final Set<Class<?>> f65129d;

    /* renamed from: e */
    private final int f65130e;

    /* renamed from: f */
    private final int f65131f;

    static {
        Covode.recordClassIndex(33293);
    }

    /* renamed from: c */
    public final boolean mo46352c() {
        if (this.f65131f == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo46351b() {
        if (this.f65130e == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo46350a() {
        if (this.f65130e == 1) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f65126a.toArray()) + ">{" + this.f65130e + ", type=" + this.f65131f + ", deps=" + Arrays.toString(this.f65127b.toArray()) + "}";
    }

    /* renamed from: com.google.firebase.components.b$a */
    public static class C27711a<T> {

        /* renamed from: a */
        int f65132a;

        /* renamed from: b */
        private final Set<Class<? super T>> f65133b;

        /* renamed from: c */
        private final Set<C27727n> f65134c;

        /* renamed from: d */
        private int f65135d;

        /* renamed from: e */
        private AbstractC27718g<T> f65136e;

        /* renamed from: f */
        private Set<Class<?>> f65137f;

        static {
            Covode.recordClassIndex(33294);
        }

        /* renamed from: a */
        public final C27710b<T> mo46357a() {
            boolean z;
            if (this.f65136e != null) {
                z = true;
            } else {
                z = false;
            }
            C27734u.m55454b(z, "Missing required property: factory.");
            return new C27710b<>(new HashSet(this.f65133b), new HashSet(this.f65134c), this.f65135d, this.f65132a, this.f65136e, this.f65137f, (byte) 0);
        }

        /* renamed from: a */
        private void m55411a(Class<?> cls) {
            C27734u.m55453a(!this.f65133b.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        /* renamed from: a */
        public final C27711a<T> mo46354a(int i) {
            boolean z;
            if (this.f65135d == 0) {
                z = true;
            } else {
                z = false;
            }
            C27734u.m55454b(z, "Instantiation type has already been set.");
            this.f65135d = i;
            return this;
        }

        /* renamed from: a */
        public final C27711a<T> mo46355a(AbstractC27718g<T> gVar) {
            this.f65136e = (AbstractC27718g) C27734u.m55452a(gVar, "Null factory");
            return this;
        }

        /* renamed from: a */
        public final C27711a<T> mo46356a(C27727n nVar) {
            C27734u.m55452a(nVar, "Null dependency");
            m55411a(nVar.f65157a);
            this.f65134c.add(nVar);
            return this;
        }

        private C27711a(Class<T> cls, Class<? super T>... clsArr) {
            HashSet hashSet = new HashSet();
            this.f65133b = hashSet;
            this.f65134c = new HashSet();
            this.f65135d = 0;
            this.f65132a = 0;
            this.f65137f = new HashSet();
            C27734u.m55452a(cls, "Null interface");
            hashSet.add(cls);
            for (Class<? super T> cls2 : clsArr) {
                C27734u.m55452a(cls2, "Null interface");
            }
            Collections.addAll(this.f65133b, clsArr);
        }

        /* synthetic */ C27711a(Class cls, Class[] clsArr, byte b) {
            this(cls, clsArr);
        }
    }

    /* renamed from: a */
    public static <T> C27711a<T> m55404a(Class<T> cls) {
        return new C27711a<>(cls, new Class[0], (byte) 0);
    }

    /* renamed from: a */
    private static <T> C27711a<T> m55405a(Class<T> cls, Class<? super T>... clsArr) {
        return new C27711a<>(cls, clsArr, (byte) 0);
    }

    /* renamed from: a */
    public static <T> C27710b<T> m55406a(T t, Class<T> cls) {
        C27711a a = m55404a(cls);
        a.f65132a = 1;
        return a.mo46355a(new C27713d(t)).mo46357a();
    }

    /* renamed from: a */
    public static <T> C27710b<T> m55407a(T t, Class<T> cls, Class<? super T>... clsArr) {
        return m55405a(cls, clsArr).mo46355a(C27712c.m55416a((Object) t)).mo46357a();
    }

    private C27710b(Set<Class<? super T>> set, Set<C27727n> set2, int i, int i2, AbstractC27718g<T> gVar, Set<Class<?>> set3) {
        this.f65126a = Collections.unmodifiableSet(set);
        this.f65127b = Collections.unmodifiableSet(set2);
        this.f65130e = i;
        this.f65131f = i2;
        this.f65128c = gVar;
        this.f65129d = Collections.unmodifiableSet(set3);
    }

    /* synthetic */ C27710b(Set set, Set set2, int i, int i2, AbstractC27718g gVar, Set set3, byte b) {
        this(set, set2, i, i2, gVar, set3);
    }
}
