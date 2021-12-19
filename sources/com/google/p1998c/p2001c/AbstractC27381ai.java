package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27245k;
import com.google.p1998c.p2001c.AbstractC27536x;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: com.google.c.c.ai */
public abstract class AbstractC27381ai<E> extends AbstractC27536x<E> implements Set<E> {

    /* renamed from: a */
    private transient AbstractC27540z<E> f64679a;

    static {
        Covode.recordClassIndex(32961);
    }

    public static boolean shouldTrim(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo45579c() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, com.google.p1998c.p2001c.AbstractC27536x, com.google.p1998c.p2001c.AbstractC27536x, java.lang.Iterable
    public abstract AbstractC27479br<E> iterator();

    /* renamed from: com.google.c.c.ai$b */
    static abstract class AbstractC27383b<E> extends AbstractC27381ai<E> {
        static {
            Covode.recordClassIndex(32963);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract E mo45585a(int i);

        AbstractC27383b() {
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2001c.AbstractC27381ai
        /* renamed from: d */
        public final AbstractC27540z<E> mo45656d() {
            return new AbstractC27540z<E>() {
                /* class com.google.p1998c.p2001c.AbstractC27381ai.AbstractC27383b.C273841 */

                static {
                    Covode.recordClassIndex(32964);
                }

                /* access modifiers changed from: package-private */
                @Override // com.google.p1998c.p2001c.AbstractC27536x
                /* renamed from: a */
                public final boolean mo45578a() {
                    return AbstractC27383b.this.mo45578a();
                }

                public final int size() {
                    return AbstractC27383b.this.size();
                }

                @Override // java.util.List
                public final E get(int i) {
                    return (E) AbstractC27383b.this.mo45585a(i);
                }
            };
        }

        @Override // com.google.p1998c.p2001c.AbstractC27381ai, com.google.p1998c.p2001c.AbstractC27381ai, java.util.AbstractCollection, java.util.Collection, java.util.Set, com.google.p1998c.p2001c.AbstractC27536x, com.google.p1998c.p2001c.AbstractC27536x, java.lang.Iterable
        public AbstractC27479br<E> iterator() {
            return asList().iterator();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2001c.AbstractC27536x
        /* renamed from: a */
        public final int mo45633a(Object[] objArr, int i) {
            return asList().mo45633a(objArr, i);
        }
    }

    AbstractC27381ai() {
    }

    /* renamed from: of */
    public static <E> AbstractC27381ai<E> m54718of() {
        return C27464be.f64790a;
    }

    /* renamed from: com.google.c.c.ai$a */
    public static class C27382a<E> extends AbstractC27536x.AbstractC27537a<E> {

        /* renamed from: d */
        Object[] f64680d;

        /* renamed from: e */
        private int f64681e;

        static {
            Covode.recordClassIndex(32962);
        }

        public C27382a() {
            super(4);
        }

        /* renamed from: a */
        public AbstractC27381ai<E> mo45658a() {
            AbstractC27381ai<E> construct;
            Object[] objArr;
            int i = this.f64904b;
            if (i == 0) {
                return AbstractC27381ai.m54718of();
            }
            if (i == 1) {
                return AbstractC27381ai.m54719of(this.f64903a[0]);
            }
            if (this.f64680d == null || AbstractC27381ai.m54717b(this.f64904b) != this.f64680d.length) {
                construct = AbstractC27381ai.construct(this.f64904b, this.f64903a);
                this.f64904b = construct.size();
            } else {
                if (AbstractC27381ai.shouldTrim(this.f64904b, this.f64903a.length)) {
                    objArr = Arrays.copyOf(this.f64903a, this.f64904b);
                } else {
                    objArr = this.f64903a;
                }
                int i2 = this.f64681e;
                Object[] objArr2 = this.f64680d;
                construct = new C27464be<>(objArr, i2, objArr2, objArr2.length - 1, this.f64904b);
            }
            this.f64905c = true;
            this.f64680d = null;
            return construct;
        }

        C27382a(int i) {
            super(i);
            this.f64680d = new Object[AbstractC27381ai.m54717b(i)];
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.google.c.c.ai$a<E> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        public C27382a<E> mo45647a(Iterable<? extends E> iterable) {
            C27245k.m54229a(iterable);
            if (this.f64680d != null) {
                Iterator<? extends E> it = iterable.iterator();
                while (it.hasNext()) {
                    mo45653b(it.next());
                }
            } else {
                super.mo45647a((Iterable) iterable);
            }
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.c.c.ai$a<E> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        public C27382a<E> mo45648a(Iterator<? extends E> it) {
            C27245k.m54229a(it);
            while (it.hasNext()) {
                mo45653b(it.next());
            }
            return this;
        }

        /* renamed from: c */
        public C27382a<E> mo45653b(E e) {
            C27245k.m54229a(e);
            if (this.f64680d != null) {
                int b = AbstractC27381ai.m54717b(this.f64904b);
                Object[] objArr = this.f64680d;
                if (b <= objArr.length) {
                    int length = objArr.length - 1;
                    int hashCode = e.hashCode();
                    int a = C27535w.m55046a(hashCode);
                    while (true) {
                        int i = a & length;
                        Object[] objArr2 = this.f64680d;
                        Object obj = objArr2[i];
                        if (obj != null) {
                            if (obj.equals(e)) {
                                break;
                            }
                            a = i + 1;
                        } else {
                            objArr2[i] = e;
                            this.f64681e += hashCode;
                            super.mo45653b((Object) e);
                            break;
                        }
                    }
                    return this;
                }
            }
            this.f64680d = null;
            super.mo45653b((Object) e);
            return this;
        }

        /* renamed from: b */
        public C27382a<E> mo45649a(E... eArr) {
            if (this.f64680d != null) {
                for (E e : eArr) {
                    mo45653b(e);
                }
            } else {
                super.mo45649a((Object[]) eArr);
            }
            return this;
        }
    }

    /* renamed from: com.google.c.c.ai$c */
    static class C27385c implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final Object[] f64683a;

        static {
            Covode.recordClassIndex(32965);
        }

        /* access modifiers changed from: package-private */
        public final Object readResolve() {
            return AbstractC27381ai.copyOf(this.f64683a);
        }

        C27385c(Object[] objArr) {
            this.f64683a = objArr;
        }
    }

    public static <E> C27382a<E> builder() {
        return new C27382a<>();
    }

    public int hashCode() {
        return C27471bk.m54928a(this);
    }

    @Override // com.google.p1998c.p2001c.AbstractC27536x
    public AbstractC27540z<E> asList() {
        AbstractC27540z<E> zVar = this.f64679a;
        if (zVar != null) {
            return zVar;
        }
        AbstractC27540z<E> d = mo45656d();
        this.f64679a = d;
        return d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public AbstractC27540z<E> mo45656d() {
        Object[] array = toArray();
        return AbstractC27540z.m55061b(array, array.length);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27536x
    public Object writeReplace() {
        return new C27385c(toArray());
    }

    /* renamed from: of */
    public static <E> AbstractC27381ai<E> m54719of(E e) {
        return new C27473bl(e);
    }

    public static <E> C27382a<E> builderWithExpectedSize(int i) {
        C27511k.m54993a(i, "expectedSize");
        return new C27382a<>(i);
    }

    public static <E> AbstractC27381ai<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    /* renamed from: b */
    static int m54717b(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (true) {
                double d = (double) highestOneBit;
                Double.isNaN(d);
                if (d * 0.7d >= ((double) max)) {
                    return highestOneBit;
                }
                highestOneBit <<= 1;
            }
        } else {
            if (max >= 1073741824) {
                z = false;
            }
            C27245k.m54236a(z, "collection too large");
            return 1073741824;
        }
    }

    public static <E> AbstractC27381ai<E> copyOf(Collection<? extends E> collection) {
        if ((collection instanceof AbstractC27381ai) && !(collection instanceof SortedSet)) {
            AbstractC27381ai<E> aiVar = (AbstractC27381ai) collection;
            if (!aiVar.mo45578a()) {
                return aiVar;
            }
        }
        Object[] array = collection.toArray();
        return construct(array.length, array);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC27381ai) || !mo45579c() || !((AbstractC27381ai) obj).mo45579c() || hashCode() == obj.hashCode()) {
            return C27471bk.m54930a(this, obj);
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.google.c.c.ai$a */
    /* JADX WARN: Multi-variable type inference failed */
    public static <E> AbstractC27381ai<E> copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return m54718of();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return m54719of(next);
        }
        return new C27382a().mo45653b(next).mo45648a((Iterator) it).mo45658a();
    }

    public static <E> AbstractC27381ai<E> copyOf(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return m54718of();
        }
        if (length != 1) {
            return construct(eArr.length, (Object[]) eArr.clone());
        }
        return m54719of(eArr[0]);
    }

    /* renamed from: of */
    public static <E> AbstractC27381ai<E> m54720of(E e, E e2) {
        return construct(2, e, e2);
    }

    public static <E> AbstractC27381ai<E> construct(int i, Object... objArr) {
        Object[] objArr2 = objArr;
        while (i != 0) {
            if (i == 1) {
                return m54719of(objArr2[0]);
            }
            int b = m54717b(i);
            Object[] objArr3 = new Object[b];
            int i2 = b - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object a = C27447ax.m54859a(objArr2[i5], i5);
                int hashCode = a.hashCode();
                int a2 = C27535w.m55046a(hashCode);
                while (true) {
                    int i6 = a2 & i2;
                    Object obj = objArr3[i6];
                    if (obj == null) {
                        objArr2[i4] = a;
                        objArr3[i6] = a;
                        i3 += hashCode;
                        i4++;
                        break;
                    }
                    if (obj.equals(a)) {
                        break;
                    }
                    a2++;
                }
            }
            Arrays.fill(objArr2, i4, i, (Object) null);
            if (i4 == 1) {
                return new C27473bl(objArr2[0], i3);
            }
            if (m54717b(i4) < b / 2) {
                i = i4;
            } else {
                if (shouldTrim(i4, objArr2.length)) {
                    objArr2 = Arrays.copyOf(objArr2, i4);
                }
                return new C27464be(objArr2, i3, objArr3, i2, i4);
            }
        }
        return m54718of();
    }

    /* renamed from: of */
    public static <E> AbstractC27381ai<E> m54721of(E e, E e2, E e3) {
        return construct(3, e, e2, e3);
    }

    /* renamed from: of */
    public static <E> AbstractC27381ai<E> m54722of(E e, E e2, E e3, E e4) {
        return construct(4, e, e2, e3, e4);
    }

    /* renamed from: of */
    public static <E> AbstractC27381ai<E> m54723of(E e, E e2, E e3, E e4, E e5) {
        return construct(5, e, e2, e3, e4, e5);
    }

    /* renamed from: of */
    public static <E> AbstractC27381ai<E> m54724of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        boolean z;
        if (eArr.length <= 2147483641) {
            z = true;
        } else {
            z = false;
        }
        C27245k.m54236a(z, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return construct(length, objArr);
    }
}
