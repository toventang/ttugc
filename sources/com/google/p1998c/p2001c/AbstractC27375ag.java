package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27245k;
import com.google.p1998c.p2001c.AbstractC27381ai;
import com.google.p1998c.p2001c.AbstractC27438au;
import com.google.p1998c.p2001c.AbstractC27536x;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.google.c.c.ag */
public abstract class AbstractC27375ag<E> extends AbstractC27380ah<E> implements AbstractC27438au<E> {

    /* renamed from: a */
    private transient AbstractC27540z<E> f64668a;

    /* renamed from: b */
    private transient AbstractC27381ai<AbstractC27438au.AbstractC27439a<E>> f64669b;

    static {
        Covode.recordClassIndex(32955);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract AbstractC27438au.AbstractC27439a<E> mo45628a(int i);

    @Override // com.google.p1998c.p2001c.AbstractC27438au
    public abstract AbstractC27381ai<E> elementSet();

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27536x
    public abstract Object writeReplace();

    AbstractC27375ag() {
    }

    /* renamed from: of */
    public static <E> AbstractC27375ag<E> m54697of() {
        return C27461bd.f64783a;
    }

    /* renamed from: com.google.c.c.ag$a */
    public static class C27377a<E> extends AbstractC27536x.AbstractC27538b<E> {

        /* renamed from: a */
        C27448ay<E> f64674a;

        /* renamed from: b */
        boolean f64675b;

        /* renamed from: c */
        boolean f64676c;

        static {
            Covode.recordClassIndex(32957);
        }

        public C27377a() {
            this(4);
        }

        /* renamed from: a */
        public final AbstractC27375ag<E> mo45646a() {
            if (this.f64674a.f64749c == 0) {
                return AbstractC27375ag.m54697of();
            }
            if (this.f64676c) {
                this.f64674a = new C27448ay<>(this.f64674a);
                this.f64676c = false;
            }
            this.f64675b = true;
            return new C27461bd(this.f64674a);
        }

        @Override // com.google.p1998c.p2001c.AbstractC27536x.AbstractC27538b
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ AbstractC27536x.AbstractC27538b mo45648a(Iterator it) {
            super.mo45648a(it);
            return this;
        }

        /* renamed from: b */
        public final C27377a<E> mo45651b(Iterator<? extends E> it) {
            super.mo45648a(it);
            return this;
        }

        /* renamed from: b */
        public final C27377a<E> mo45652b(E... eArr) {
            super.mo45649a(eArr);
            return this;
        }

        C27377a(int i) {
            this.f64674a = new C27448ay<>(i);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object[] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.p1998c.p2001c.AbstractC27536x.AbstractC27538b
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ AbstractC27536x.AbstractC27538b mo45649a(Object[] objArr) {
            super.mo45649a(objArr);
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.p1998c.p2001c.AbstractC27536x.AbstractC27538b
        /* renamed from: b */
        public final /* synthetic */ AbstractC27536x.AbstractC27538b mo45653b(Object obj) {
            return mo45645a(obj, 1);
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x005f A[LOOP:1: B:13:0x0059->B:15:0x005f, LOOP_END] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.google.p1998c.p2001c.AbstractC27375ag.C27377a<E> mo45647a(java.lang.Iterable<? extends E> r5) {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.p1998c.p2001c.AbstractC27375ag.C27377a.mo45647a(java.lang.Iterable):com.google.c.c.ag$a");
        }

        /* renamed from: a */
        public final C27377a<E> mo45645a(E e, int i) {
            if (i == 0) {
                return this;
            }
            if (this.f64675b) {
                this.f64674a = new C27448ay<>(this.f64674a);
                this.f64676c = false;
            }
            this.f64675b = false;
            C27245k.m54229a(e);
            C27448ay<E> ayVar = this.f64674a;
            ayVar.mo45805a(e, i + ayVar.mo45807b(e));
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.c.ag$b */
    public final class C27378b extends AbstractC27381ai.AbstractC27383b<AbstractC27438au.AbstractC27439a<E>> {
        private static final long serialVersionUID = 0;

        static {
            Covode.recordClassIndex(32958);
        }

        @Override // com.google.p1998c.p2001c.AbstractC27381ai
        public final int hashCode() {
            return AbstractC27375ag.this.hashCode();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2001c.AbstractC27381ai, com.google.p1998c.p2001c.AbstractC27536x
        public final Object writeReplace() {
            return new C27379c(AbstractC27375ag.this);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2001c.AbstractC27536x
        /* renamed from: a */
        public final boolean mo45578a() {
            return AbstractC27375ag.this.mo45578a();
        }

        public final int size() {
            return AbstractC27375ag.this.elementSet().size();
        }

        private C27378b() {
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2001c.AbstractC27381ai.AbstractC27383b
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo45585a(int i) {
            return AbstractC27375ag.this.mo45628a(i);
        }

        @Override // com.google.p1998c.p2001c.AbstractC27536x
        public final boolean contains(Object obj) {
            if (obj instanceof AbstractC27438au.AbstractC27439a) {
                AbstractC27438au.AbstractC27439a aVar = (AbstractC27438au.AbstractC27439a) obj;
                if (aVar.mo45779b() > 0 && AbstractC27375ag.this.count(aVar.mo45778a()) == aVar.mo45779b()) {
                    return true;
                }
            }
            return false;
        }

        /* synthetic */ C27378b(AbstractC27375ag agVar, byte b) {
            this();
        }
    }

    /* renamed from: com.google.c.c.ag$c */
    static class C27379c<E> implements Serializable {

        /* renamed from: a */
        final AbstractC27375ag<E> f64678a;

        static {
            Covode.recordClassIndex(32959);
        }

        /* access modifiers changed from: package-private */
        public final Object readResolve() {
            return this.f64678a.entrySet();
        }

        C27379c(AbstractC27375ag<E> agVar) {
            this.f64678a = agVar;
        }
    }

    public static <E> C27377a<E> builder() {
        return new C27377a<>();
    }

    @Override // com.google.p1998c.p2001c.AbstractC27536x
    public AbstractC27540z<E> asList() {
        AbstractC27540z<E> zVar = this.f64668a;
        if (zVar != null) {
            return zVar;
        }
        AbstractC27540z<E> asList = super.asList();
        this.f64668a = asList;
        return asList;
    }

    public int hashCode() {
        return C27471bk.m54928a(entrySet());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.p1998c.p2001c.AbstractC27536x, com.google.p1998c.p2001c.AbstractC27536x, java.lang.Iterable
    public AbstractC27479br<E> iterator() {
        final AbstractC27479br<AbstractC27438au.AbstractC27439a<E>> it = entrySet().iterator();
        return new AbstractC27479br<E>() {
            /* class com.google.p1998c.p2001c.AbstractC27375ag.C273761 */

            /* renamed from: a */
            int f64670a;

            /* renamed from: b */
            E f64671b;

            static {
                Covode.recordClassIndex(32956);
            }

            public final boolean hasNext() {
                if (this.f64670a > 0 || it.hasNext()) {
                    return true;
                }
                return false;
            }

            @Override // java.util.Iterator
            public final E next() {
                if (this.f64670a <= 0) {
                    AbstractC27438au.AbstractC27439a aVar = (AbstractC27438au.AbstractC27439a) it.next();
                    this.f64671b = (E) aVar.mo45778a();
                    this.f64670a = aVar.mo45779b();
                }
                this.f64670a--;
                return this.f64671b;
            }
        };
    }

    public String toString() {
        return entrySet().toString();
    }

    @Override // com.google.p1998c.p2001c.AbstractC27438au
    public AbstractC27381ai<AbstractC27438au.AbstractC27439a<E>> entrySet() {
        AbstractC27381ai<AbstractC27438au.AbstractC27439a<E>> aiVar = this.f64669b;
        if (aiVar == null) {
            if (isEmpty()) {
                aiVar = AbstractC27381ai.m54718of();
            } else {
                aiVar = new C27378b(this, (byte) 0);
            }
            this.f64669b = aiVar;
        }
        return aiVar;
    }

    public static <E> AbstractC27375ag<E> copyOf(E[] eArr) {
        return m54696a(eArr);
    }

    public boolean equals(Object obj) {
        return C27440av.m54853a(this, obj);
    }

    /* renamed from: a */
    private static <E> AbstractC27375ag<E> m54696a(E... eArr) {
        return new C27377a().mo45652b((Object[]) eArr).mo45646a();
    }

    public static <E> AbstractC27375ag<E> copyOf(Iterator<? extends E> it) {
        return new C27377a().mo45651b((Iterator) it).mo45646a();
    }

    /* renamed from: of */
    public static <E> AbstractC27375ag<E> m54698of(E e) {
        return m54696a(e);
    }

    @Override // com.google.p1998c.p2001c.AbstractC27438au, com.google.p1998c.p2001c.AbstractC27536x
    public boolean contains(Object obj) {
        if (count(obj) > 0) {
            return true;
        }
        return false;
    }

    public static <E> AbstractC27375ag<E> copyOf(Iterable<? extends E> iterable) {
        int i;
        if (iterable instanceof AbstractC27375ag) {
            AbstractC27375ag<E> agVar = (AbstractC27375ag) iterable;
            if (!agVar.mo45578a()) {
                return agVar;
            }
        }
        if (iterable instanceof AbstractC27438au) {
            i = ((AbstractC27438au) iterable).elementSet().size();
        } else {
            i = 11;
        }
        C27377a aVar = new C27377a(i);
        aVar.mo45647a((Iterable) iterable);
        return aVar.mo45646a();
    }

    @Override // com.google.p1998c.p2001c.AbstractC27438au
    public final int add(E e, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.p1998c.p2001c.AbstractC27438au
    public final int remove(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.p1998c.p2001c.AbstractC27438au
    public final int setCount(E e, int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: of */
    public static <E> AbstractC27375ag<E> m54699of(E e, E e2) {
        return m54696a(e, e2);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27536x
    /* renamed from: a */
    public final int mo45633a(Object[] objArr, int i) {
        AbstractC27479br<AbstractC27438au.AbstractC27439a<E>> it = entrySet().iterator();
        while (it.hasNext()) {
            AbstractC27438au.AbstractC27439a<E> next = it.next();
            Arrays.fill(objArr, i, next.mo45779b() + i, next.mo45778a());
            i += next.mo45779b();
        }
        return i;
    }

    @Override // com.google.p1998c.p2001c.AbstractC27438au
    public final boolean setCount(E e, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: of */
    public static <E> AbstractC27375ag<E> m54700of(E e, E e2, E e3) {
        return m54696a(e, e2, e3);
    }

    /* renamed from: of */
    public static <E> AbstractC27375ag<E> m54701of(E e, E e2, E e3, E e4) {
        return m54696a(e, e2, e3, e4);
    }

    /* renamed from: of */
    public static <E> AbstractC27375ag<E> m54702of(E e, E e2, E e3, E e4, E e5) {
        return m54696a(e, e2, e3, e4, e5);
    }

    /* renamed from: of */
    public static <E> AbstractC27375ag<E> m54703of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        return new C27377a().mo45645a(e, 1).mo45645a(e2, 1).mo45645a(e3, 1).mo45645a(e4, 1).mo45645a(e5, 1).mo45645a(e6, 1).mo45652b((Object[]) eArr).mo45646a();
    }
}
