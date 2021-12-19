package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4569a.AbstractC88444e;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4584j.C88906h;
import p4560f.p4561a.p4568e.p4584j.EnumC88909j;
import p4560f.p4561a.p4585f.AbstractC88918a;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.e.au */
public final class C88678au<T> extends AbstractC88918a<T> implements AbstractC88444e {

    /* renamed from: e */
    public static final AbstractC88679a f201220e = new C88684f();

    /* renamed from: a */
    final AbstractC88984x<T> f201221a;

    /* renamed from: b */
    final AtomicReference<C88682d<T>> f201222b;

    /* renamed from: c */
    final AbstractC88679a<T> f201223c;

    /* renamed from: d */
    final AbstractC88984x<T> f201224d;

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.e.e.e.au$a */
    public interface AbstractC88679a<T> {
        static {
            Covode.recordClassIndex(104721);
        }

        /* renamed from: a */
        AbstractC88681c<T> mo143072a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.e.e.e.au$c */
    public interface AbstractC88681c<T> {
        static {
            Covode.recordClassIndex(104723);
        }

        /* renamed from: a */
        void mo143073a();

        /* renamed from: a */
        void mo143074a(C88680b<T> bVar);

        /* renamed from: a */
        void mo143075a(T t);

        /* renamed from: a */
        void mo143076a(Throwable th);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.e.e.e.au$b */
    public static final class C88680b<T> extends AtomicInteger implements AbstractC88412b {
        private static final long serialVersionUID = 2728361546769921047L;

        /* renamed from: a */
        final C88682d<T> f201225a;

        /* renamed from: b */
        final AbstractC88986z<? super T> f201226b;

        /* renamed from: c */
        public Object f201227c;

        /* renamed from: d */
        volatile boolean f201228d;

        static {
            Covode.recordClassIndex(104722);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201228d;
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            if (!this.f201228d) {
                this.f201228d = true;
                this.f201225a.mo143077a(this);
                this.f201227c = null;
            }
        }

        C88680b(C88682d<T> dVar, AbstractC88986z<? super T> zVar) {
            this.f201225a = dVar;
            this.f201226b = zVar;
        }
    }

    /* renamed from: f.a.e.e.e.au$f */
    static final class C88684f implements AbstractC88679a<Object> {
        static {
            Covode.recordClassIndex(104726);
        }

        C88684f() {
        }

        @Override // p4560f.p4561a.p4568e.p4573e.p4578e.C88678au.AbstractC88679a
        /* renamed from: a */
        public final AbstractC88681c<Object> mo143072a() {
            return new C88685g();
        }
    }

    /* renamed from: f.a.e.e.e.au$g */
    static final class C88685g<T> extends ArrayList<Object> implements AbstractC88681c<T> {
        private static final long serialVersionUID = 7063189396499112664L;

        /* renamed from: a */
        volatile int f201237a;

        static {
            Covode.recordClassIndex(104727);
        }

        C88685g() {
            super(16);
        }

        @Override // p4560f.p4561a.p4568e.p4573e.p4578e.C88678au.AbstractC88681c
        /* renamed from: a */
        public final void mo143073a() {
            add(EnumC88909j.complete());
            this.f201237a++;
        }

        @Override // p4560f.p4561a.p4568e.p4573e.p4578e.C88678au.AbstractC88681c
        /* renamed from: a */
        public final void mo143075a(T t) {
            add(EnumC88909j.next(t));
            this.f201237a++;
        }

        @Override // p4560f.p4561a.p4568e.p4573e.p4578e.C88678au.AbstractC88681c
        /* renamed from: a */
        public final void mo143076a(Throwable th) {
            add(EnumC88909j.error(th));
            this.f201237a++;
        }

        @Override // p4560f.p4561a.p4568e.p4573e.p4578e.C88678au.AbstractC88681c
        /* renamed from: a */
        public final void mo143074a(C88680b<T> bVar) {
            int i;
            if (bVar.getAndIncrement() == 0) {
                AbstractC88986z<? super T> zVar = bVar.f201226b;
                int i2 = 1;
                while (!bVar.isDisposed()) {
                    int i3 = this.f201237a;
                    Integer num = (Integer) bVar.f201227c;
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = 0;
                    }
                    while (i < i3) {
                        if (!EnumC88909j.accept(get(i), zVar) && !bVar.isDisposed()) {
                            i++;
                        } else {
                            return;
                        }
                    }
                    bVar.f201227c = Integer.valueOf(i);
                    i2 = bVar.addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: f.a.e.e.e.au$d */
    static final class C88682d<T> extends AtomicReference<AbstractC88412b> implements AbstractC88412b, AbstractC88986z<T> {

        /* renamed from: c */
        static final C88680b[] f201229c = new C88680b[0];

        /* renamed from: d */
        static final C88680b[] f201230d = new C88680b[0];
        private static final long serialVersionUID = -533785617179540163L;

        /* renamed from: a */
        final AbstractC88681c<T> f201231a;

        /* renamed from: b */
        boolean f201232b;

        /* renamed from: e */
        final AtomicReference<C88680b[]> f201233e = new AtomicReference<>(f201229c);

        /* renamed from: f */
        final AtomicBoolean f201234f = new AtomicBoolean();

        static {
            Covode.recordClassIndex(104724);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f201233e.set(f201230d);
            EnumC88441b.dispose(this);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            if (this.f201233e.get() == f201230d) {
                return true;
            }
            return false;
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            if (!this.f201232b) {
                this.f201232b = true;
                this.f201231a.mo143073a();
                m153900b();
            }
        }

        /* renamed from: a */
        private void m153899a() {
            for (C88680b<T> bVar : this.f201233e.get()) {
                this.f201231a.mo143074a((C88680b) bVar);
            }
        }

        /* renamed from: b */
        private void m153900b() {
            for (C88680b<T> bVar : this.f201233e.getAndSet(f201230d)) {
                this.f201231a.mo143074a((C88680b) bVar);
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            if (!this.f201232b) {
                this.f201231a.mo143075a((Object) t);
                m153899a();
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.setOnce(this, bVar)) {
                m153899a();
            }
        }

        C88682d(AbstractC88681c<T> cVar) {
            this.f201231a = cVar;
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            if (!this.f201232b) {
                this.f201232b = true;
                this.f201231a.mo143076a(th);
                m153900b();
                return;
            }
            C88925a.m154178a(th);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo143077a(C88680b<T> bVar) {
            C88680b[] bVarArr;
            C88680b[] bVarArr2;
            do {
                bVarArr = this.f201233e.get();
                int length = bVarArr.length;
                if (length != 0) {
                    int i = 0;
                    while (!bVarArr[i].equals(bVar)) {
                        i++;
                        if (i >= length) {
                            return;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            bVarArr2 = f201229c;
                        } else {
                            bVarArr2 = new C88680b[(length - 1)];
                            System.arraycopy(bVarArr, 0, bVarArr2, 0, i);
                            System.arraycopy(bVarArr, i + 1, bVarArr2, i, (length - i) - 1);
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.f201233e.compareAndSet(bVarArr, bVarArr2));
        }
    }

    static {
        Covode.recordClassIndex(104720);
    }

    @Override // p4560f.p4561a.p4568e.p4569a.AbstractC88444e
    /* renamed from: a */
    public final void mo142968a(AbstractC88412b bVar) {
        this.f201222b.compareAndSet(bVar, null);
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        this.f201224d.mo143062b(zVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.e.e.e.au$e */
    public static final class C88683e<T> implements AbstractC88984x<T> {

        /* renamed from: a */
        private final AtomicReference<C88682d<T>> f201235a;

        /* renamed from: b */
        private final AbstractC88679a<T> f201236b;

        static {
            Covode.recordClassIndex(104725);
        }

        @Override // p4560f.p4561a.AbstractC88984x
        /* renamed from: b */
        public final void mo143062b(AbstractC88986z<? super T> zVar) {
            C88682d<T> dVar;
            C88680b[] bVarArr;
            C88680b[] bVarArr2;
            do {
                dVar = this.f201235a.get();
                if (dVar != null) {
                    break;
                }
                dVar = new C88682d<>(this.f201236b.mo143072a());
            } while (!this.f201235a.compareAndSet(null, dVar));
            C88680b<T> bVar = new C88680b<>(dVar, zVar);
            zVar.onSubscribe(bVar);
            do {
                bVarArr = dVar.f201233e.get();
                if (bVarArr == C88682d.f201230d) {
                    break;
                }
                int length = bVarArr.length;
                bVarArr2 = new C88680b[(length + 1)];
                System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                bVarArr2[length] = bVar;
            } while (!dVar.f201233e.compareAndSet(bVarArr, bVarArr2));
            if (bVar.isDisposed()) {
                dVar.mo143077a(bVar);
            } else {
                dVar.f201231a.mo143074a((C88680b) bVar);
            }
        }

        C88683e(AtomicReference<C88682d<T>> atomicReference, AbstractC88679a<T> aVar) {
            this.f201235a = atomicReference;
            this.f201236b = aVar;
        }
    }

    @Override // p4560f.p4561a.p4585f.AbstractC88918a
    /* renamed from: e */
    public final void mo143066e(AbstractC88433f<? super AbstractC88412b> fVar) {
        C88682d<T> dVar;
        boolean z;
        while (true) {
            dVar = this.f201222b.get();
            if (dVar != null && !dVar.isDisposed()) {
                break;
            }
            C88682d<T> dVar2 = new C88682d<>(this.f201223c.mo143072a());
            if (this.f201222b.compareAndSet(dVar, dVar2)) {
                dVar = dVar2;
                break;
            }
        }
        if (dVar.f201234f.get() || !dVar.f201234f.compareAndSet(false, true)) {
            z = false;
        } else {
            z = true;
        }
        try {
            fVar.accept(dVar);
            if (z) {
                this.f201221a.mo143062b(dVar);
            }
        } catch (Throwable th) {
            if (z) {
                dVar.f201234f.compareAndSet(true, false);
            }
            C88422b.m153670a(th);
            throw C88906h.m154104a(th);
        }
    }

    /* renamed from: a */
    public static <T> AbstractC88918a<T> m153890a(AbstractC88984x<T> xVar, AbstractC88679a<T> aVar) {
        AtomicReference atomicReference = new AtomicReference();
        return C88925a.m154167a((AbstractC88918a) new C88678au(new C88683e(atomicReference, aVar), xVar, atomicReference, aVar));
    }

    private C88678au(AbstractC88984x<T> xVar, AbstractC88984x<T> xVar2, AtomicReference<C88682d<T>> atomicReference, AbstractC88679a<T> aVar) {
        this.f201224d = xVar;
        this.f201221a = xVar2;
        this.f201222b = atomicReference;
        this.f201223c = aVar;
    }
}
