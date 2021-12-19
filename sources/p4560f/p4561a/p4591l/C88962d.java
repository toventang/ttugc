package p4560f.p4561a.p4591l;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4584j.EnumC88909j;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.l.d */
public final class C88962d<T> extends AbstractC88969g<T> {

    /* renamed from: c */
    static final C88964b[] f202028c = new C88964b[0];

    /* renamed from: d */
    static final C88964b[] f202029d = new C88964b[0];

    /* renamed from: f */
    private static final Object[] f202030f = new Object[0];

    /* renamed from: a */
    final AbstractC88963a<T> f202031a;

    /* renamed from: b */
    final AtomicReference<C88964b<T>[]> f202032b = new AtomicReference<>(f202028c);

    /* renamed from: e */
    boolean f202033e;

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.l.d$a */
    public interface AbstractC88963a<T> {
        static {
            Covode.recordClassIndex(105005);
        }

        /* renamed from: a */
        void mo143225a(C88964b<T> bVar);

        /* renamed from: a */
        void mo143226a(T t);

        /* renamed from: b */
        void mo143227b(Object obj);

        boolean compareAndSet(Object obj, Object obj2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.l.d$b */
    public static final class C88964b<T> extends AtomicInteger implements AbstractC88412b {
        private static final long serialVersionUID = 466549804534799122L;

        /* renamed from: a */
        final AbstractC88986z<? super T> f202034a;

        /* renamed from: b */
        final C88962d<T> f202035b;

        /* renamed from: c */
        Object f202036c;

        /* renamed from: d */
        volatile boolean f202037d;

        static {
            Covode.recordClassIndex(105006);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f202037d;
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            if (!this.f202037d) {
                this.f202037d = true;
                this.f202035b.mo143224a((C88964b) this);
            }
        }

        C88964b(AbstractC88986z<? super T> zVar, C88962d<T> dVar) {
            this.f202034a = zVar;
            this.f202035b = dVar;
        }
    }

    /* renamed from: i */
    public static <T> C88962d<T> m154225i() {
        return new C88962d<>(new C88965c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.l.d$c */
    public static final class C88965c<T> extends AtomicReference<Object> implements AbstractC88963a<T> {
        private static final long serialVersionUID = -733876083048047795L;

        /* renamed from: a */
        final List<Object> f202038a = new ArrayList(C88466b.m153696a(16, "capacityHint"));

        /* renamed from: b */
        volatile boolean f202039b;

        /* renamed from: c */
        volatile int f202040c;

        static {
            Covode.recordClassIndex(105007);
        }

        C88965c() {
        }

        @Override // p4560f.p4561a.p4591l.C88962d.AbstractC88963a
        /* renamed from: a */
        public final void mo143226a(T t) {
            this.f202038a.add(t);
            this.f202040c++;
        }

        @Override // p4560f.p4561a.p4591l.C88962d.AbstractC88963a
        /* renamed from: b */
        public final void mo143227b(Object obj) {
            this.f202038a.add(obj);
            this.f202040c++;
            this.f202039b = true;
        }

        @Override // p4560f.p4561a.p4591l.C88962d.AbstractC88963a
        /* renamed from: a */
        public final void mo143225a(C88964b<T> bVar) {
            int i;
            if (bVar.getAndIncrement() == 0) {
                List<Object> list = this.f202038a;
                AbstractC88986z<? super T> zVar = bVar.f202034a;
                Integer num = (Integer) bVar.f202036c;
                int i2 = 0;
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    bVar.f202036c = 0;
                }
                int i3 = 1;
                while (!bVar.f202037d) {
                    int i4 = this.f202040c;
                    while (i4 != i2) {
                        if (bVar.f202037d) {
                            bVar.f202036c = null;
                            return;
                        }
                        Object obj = list.get(i2);
                        if (this.f202039b && (i = i2 + 1) == i4 && i == (i4 = this.f202040c)) {
                            if (EnumC88909j.isComplete(obj)) {
                                zVar.onComplete();
                            } else {
                                zVar.onError(EnumC88909j.getError(obj));
                            }
                            bVar.f202036c = null;
                            bVar.f202037d = true;
                            return;
                        }
                        zVar.onNext(obj);
                        i2++;
                    }
                    if (i2 == this.f202040c) {
                        bVar.f202036c = Integer.valueOf(i2);
                        i3 = bVar.addAndGet(-i3);
                        if (i3 == 0) {
                            return;
                        }
                    }
                }
                bVar.f202036c = null;
            }
        }
    }

    static {
        Covode.recordClassIndex(105004);
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onComplete() {
        if (!this.f202033e) {
            this.f202033e = true;
            Object complete = EnumC88909j.complete();
            AbstractC88963a<T> aVar = this.f202031a;
            aVar.mo143227b(complete);
            for (C88964b<T> bVar : m154224a(complete)) {
                aVar.mo143225a((C88964b) bVar);
            }
        }
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onSubscribe(AbstractC88412b bVar) {
        if (this.f202033e) {
            bVar.dispose();
        }
    }

    private C88962d(AbstractC88963a<T> aVar) {
        this.f202031a = aVar;
    }

    /* renamed from: a */
    private C88964b<T>[] m154224a(Object obj) {
        if (this.f202031a.compareAndSet(null, obj)) {
            return this.f202032b.getAndSet(f202029d);
        }
        return f202029d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo143224a(C88964b<T> bVar) {
        C88964b<T>[] bVarArr;
        C88964b<T>[] bVarArr2;
        do {
            bVarArr = this.f202032b.get();
            if (!(bVarArr == f202029d || bVarArr == f202028c)) {
                int length = bVarArr.length;
                for (int i = 0; i < length; i++) {
                    if (bVarArr[i] == bVar) {
                        if (i < 0) {
                            return;
                        } else {
                            if (length == 1) {
                                bVarArr2 = f202028c;
                            } else {
                                bVarArr2 = new C88964b[(length - 1)];
                                System.arraycopy(bVarArr, 0, bVarArr2, 0, i);
                                System.arraycopy(bVarArr, i + 1, bVarArr2, i, (length - i) - 1);
                            }
                        }
                    }
                }
                return;
            }
            return;
        } while (!this.f202032b.compareAndSet(bVarArr, bVarArr2));
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onError(Throwable th) {
        C88466b.m153697a((Object) th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f202033e) {
            C88925a.m154178a(th);
            return;
        }
        this.f202033e = true;
        Object error = EnumC88909j.error(th);
        AbstractC88963a<T> aVar = this.f202031a;
        aVar.mo143227b(error);
        for (C88964b<T> bVar : m154224a(error)) {
            aVar.mo143225a((C88964b) bVar);
        }
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onNext(T t) {
        C88466b.m153697a((Object) t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f202033e) {
            AbstractC88963a<T> aVar = this.f202031a;
            aVar.mo143226a((Object) t);
            for (C88964b<T> bVar : this.f202032b.get()) {
                aVar.mo143225a((C88964b) bVar);
            }
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        C88964b<T> bVar = new C88964b<>(zVar, this);
        zVar.onSubscribe(bVar);
        if (!bVar.f202037d) {
            while (true) {
                C88964b<T>[] bVarArr = this.f202032b.get();
                if (bVarArr == f202029d) {
                    break;
                }
                int length = bVarArr.length;
                C88964b<T>[] bVarArr2 = new C88964b[(length + 1)];
                System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                bVarArr2[length] = bVar;
                if (this.f202032b.compareAndSet(bVarArr, bVarArr2)) {
                    if (bVar.f202037d) {
                        mo143224a((C88964b) bVar);
                        return;
                    }
                }
            }
            this.f202031a.mo143225a((C88964b) bVar);
        }
    }
}
