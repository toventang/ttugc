package p4560f.p4561a.p4568e.p4573e.p4579f;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88408ag;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4573e.p4579f.C88824o;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.f.y */
public final class C88844y<T, R> extends AbstractC88403ab<R> {

    /* renamed from: a */
    final AbstractC88408ag<? extends T>[] f201742a;

    /* renamed from: b */
    final AbstractC88434g<? super Object[], ? extends R> f201743b;

    static {
        Covode.recordClassIndex(104886);
    }

    /* renamed from: f.a.e.e.f.y$b */
    static final class C88846b<T, R> extends AtomicInteger implements AbstractC88412b {
        private static final long serialVersionUID = -5556924161382950569L;

        /* renamed from: a */
        final AbstractC88406ae<? super R> f201745a;

        /* renamed from: b */
        final AbstractC88434g<? super Object[], ? extends R> f201746b;

        /* renamed from: c */
        final C88847c<T>[] f201747c;

        /* renamed from: d */
        final Object[] f201748d;

        static {
            Covode.recordClassIndex(104888);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            if (get() <= 0) {
                return true;
            }
            return false;
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            if (getAndSet(0) > 0) {
                for (C88847c<T> cVar : this.f201747c) {
                    EnumC88441b.dispose(cVar);
                }
            }
        }

        /* renamed from: a */
        private void m154034a(int i) {
            C88847c<T>[] cVarArr = this.f201747c;
            int length = cVarArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                EnumC88441b.dispose(cVarArr[i2]);
            }
            while (true) {
                i++;
                if (i < length) {
                    EnumC88441b.dispose(cVarArr[i]);
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo143118a(Throwable th, int i) {
            if (getAndSet(0) > 0) {
                m154034a(i);
                this.f201745a.onError(th);
                return;
            }
            C88925a.m154178a(th);
        }

        C88846b(AbstractC88406ae<? super R> aeVar, int i, AbstractC88434g<? super Object[], ? extends R> gVar) {
            super(i);
            this.f201745a = aeVar;
            this.f201746b = gVar;
            C88847c<T>[] cVarArr = new C88847c[i];
            for (int i2 = 0; i2 < i; i2++) {
                cVarArr[i2] = new C88847c<>(this, i2);
            }
            this.f201747c = cVarArr;
            this.f201748d = new Object[i];
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.e.e.f.y$c */
    public static final class C88847c<T> extends AtomicReference<AbstractC88412b> implements AbstractC88406ae<T> {
        private static final long serialVersionUID = 3323743579927613702L;

        /* renamed from: a */
        final C88846b<T, ?> f201749a;

        /* renamed from: b */
        final int f201750b;

        static {
            Covode.recordClassIndex(104889);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSubscribe(AbstractC88412b bVar) {
            EnumC88441b.setOnce(this, bVar);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onError(Throwable th) {
            this.f201749a.mo143118a(th, this.f201750b);
        }

        /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: ? super java.lang.Object[] */
        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSuccess(T t) {
            C88846b<T, ?> bVar = this.f201749a;
            bVar.f201748d[this.f201750b] = t;
            if (bVar.decrementAndGet() == 0) {
                try {
                    bVar.f201745a.onSuccess(C88466b.m153697a(bVar.f201746b.apply(bVar.f201748d), "The zipper returned a null value"));
                } catch (Throwable th) {
                    C88422b.m153670a(th);
                    bVar.f201745a.onError(th);
                }
            }
        }

        C88847c(C88846b<T, ?> bVar, int i) {
            this.f201749a = bVar;
            this.f201750b = i;
        }
    }

    /* renamed from: f.a.e.e.f.y$a */
    final class C88845a implements AbstractC88434g<T, R> {
        static {
            Covode.recordClassIndex(104887);
        }

        C88845a() {
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object[], java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final R apply(T r4) {
            /*
                r3 = this;
                f.a.e.e.f.y r0 = p4560f.p4561a.p4568e.p4573e.p4579f.C88844y.this
                f.a.d.g<? super java.lang.Object[], ? extends R> r2 = r0.f201743b
                r0 = 1
                java.lang.Object[] r1 = new java.lang.Object[r0]
                r0 = 0
                r1[r0] = r4
                java.lang.Object r1 = r2.apply(r1)
                java.lang.String r0 = "The zipper returned a null value"
                java.lang.Object r0 = p4560f.p4561a.p4568e.p4570b.C88466b.m153697a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p4560f.p4561a.p4568e.p4573e.p4579f.C88844y.C88845a.apply(java.lang.Object):java.lang.Object");
        }
    }

    @Override // p4560f.p4561a.AbstractC88403ab
    /* renamed from: a */
    public final void mo17955a(AbstractC88406ae<? super R> aeVar) {
        AbstractC88408ag<? extends T>[] agVarArr = this.f201742a;
        int length = agVarArr.length;
        if (length == 1) {
            agVarArr[0].mo116431a_(new C88824o.C88825a(aeVar, new C88845a()));
            return;
        }
        C88846b bVar = new C88846b(aeVar, length, this.f201743b);
        aeVar.onSubscribe(bVar);
        for (int i = 0; i < length && !bVar.isDisposed(); i++) {
            AbstractC88408ag<? extends T> agVar = agVarArr[i];
            if (agVar == null) {
                bVar.mo143118a(new NullPointerException("One of the sources is null"), i);
                return;
            } else {
                agVar.mo116431a_(bVar.f201747c[i]);
            }
        }
    }

    public C88844y(AbstractC88408ag<? extends T>[] agVarArr, AbstractC88434g<? super Object[], ? extends R> gVar) {
        this.f201742a = agVarArr;
        this.f201743b = gVar;
    }
}
