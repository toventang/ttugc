package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4569a.EnumC88442c;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4580f.C88851c;

/* renamed from: f.a.e.e.e.bp */
public final class C88739bp<T, R> extends AbstractC88979t<R> {

    /* renamed from: a */
    final AbstractC88984x<? extends T>[] f201393a;

    /* renamed from: b */
    final Iterable<? extends AbstractC88984x<? extends T>> f201394b;

    /* renamed from: c */
    final AbstractC88434g<? super Object[], ? extends R> f201395c;

    /* renamed from: d */
    final int f201396d;

    /* renamed from: e */
    final boolean f201397e = false;

    static {
        Covode.recordClassIndex(104781);
    }

    /* renamed from: f.a.e.e.e.bp$a */
    static final class C88740a<T, R> extends AtomicInteger implements AbstractC88412b {
        private static final long serialVersionUID = 2983708048395377667L;

        /* renamed from: a */
        final AbstractC88986z<? super R> f201398a;

        /* renamed from: b */
        final AbstractC88434g<? super Object[], ? extends R> f201399b;

        /* renamed from: c */
        final C88741b<T, R>[] f201400c;

        /* renamed from: d */
        final T[] f201401d;

        /* renamed from: e */
        final boolean f201402e;

        /* renamed from: f */
        volatile boolean f201403f;

        static {
            Covode.recordClassIndex(104782);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201403f;
        }

        /* renamed from: b */
        private void m153948b() {
            m153950d();
            m153949c();
        }

        /* renamed from: c */
        private void m153949c() {
            for (C88741b<T, R> bVar : this.f201400c) {
                bVar.mo143096a();
            }
        }

        /* renamed from: d */
        private void m153950d() {
            for (C88741b<T, R> bVar : this.f201400c) {
                bVar.f201405b.clear();
            }
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            if (!this.f201403f) {
                this.f201403f = true;
                m153949c();
                if (getAndIncrement() == 0) {
                    m153950d();
                }
            }
        }

        /* renamed from: a */
        public final void mo143095a() {
            Throwable th;
            boolean z;
            if (getAndIncrement() == 0) {
                C88741b<T, R>[] bVarArr = this.f201400c;
                AbstractC88986z<? super R> zVar = this.f201398a;
                T[] tArr = this.f201401d;
                boolean z2 = this.f201402e;
                int i = 1;
                while (true) {
                    int i2 = 0;
                    int i3 = 0;
                    for (C88741b<T, R> bVar : bVarArr) {
                        if (tArr[i3] == null) {
                            boolean z3 = bVar.f201406c;
                            T poll = bVar.f201405b.poll();
                            if (poll == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (this.f201403f) {
                                m153948b();
                                return;
                            }
                            if (z3) {
                                if (!z2) {
                                    Throwable th2 = bVar.f201407d;
                                    if (th2 != null) {
                                        m153948b();
                                        zVar.onError(th2);
                                        return;
                                    } else if (z) {
                                        m153948b();
                                        zVar.onComplete();
                                        return;
                                    }
                                } else if (z) {
                                    Throwable th3 = bVar.f201407d;
                                    m153948b();
                                    if (th3 != null) {
                                        zVar.onError(th3);
                                        return;
                                    } else {
                                        zVar.onComplete();
                                        return;
                                    }
                                }
                            } else if (z) {
                                i2++;
                            }
                            tArr[i3] = poll;
                        } else if (bVar.f201406c && !z2 && (th = bVar.f201407d) != null) {
                            m153948b();
                            zVar.onError(th);
                            return;
                        }
                        i3++;
                    }
                    if (i2 == 0) {
                        try {
                            zVar.onNext((Object) C88466b.m153697a(this.f201399b.apply(tArr.clone()), "The zipper returned a null value"));
                            Arrays.fill(tArr, (Object) null);
                        } catch (Throwable th4) {
                            C88422b.m153670a(th4);
                            m153948b();
                            zVar.onError(th4);
                            return;
                        }
                    } else {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                }
            }
        }

        C88740a(AbstractC88986z<? super R> zVar, AbstractC88434g<? super Object[], ? extends R> gVar, int i, boolean z) {
            this.f201398a = zVar;
            this.f201399b = gVar;
            this.f201400c = new C88741b[i];
            this.f201401d = (T[]) new Object[i];
            this.f201402e = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.e.e.e.bp$b */
    public static final class C88741b<T, R> implements AbstractC88986z<T> {

        /* renamed from: a */
        final C88740a<T, R> f201404a;

        /* renamed from: b */
        final C88851c<T> f201405b;

        /* renamed from: c */
        volatile boolean f201406c;

        /* renamed from: d */
        Throwable f201407d;

        /* renamed from: e */
        final AtomicReference<AbstractC88412b> f201408e = new AtomicReference<>();

        static {
            Covode.recordClassIndex(104783);
        }

        /* renamed from: a */
        public final void mo143096a() {
            EnumC88441b.dispose(this.f201408e);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            this.f201406c = true;
            this.f201404a.mo143095a();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            EnumC88441b.setOnce(this.f201408e, bVar);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            this.f201407d = th;
            this.f201406c = true;
            this.f201404a.mo143095a();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            this.f201405b.offer(t);
            this.f201404a.mo143095a();
        }

        C88741b(C88740a<T, R> aVar, int i) {
            this.f201404a = aVar;
            this.f201405b = new C88851c<>(i);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v6, resolved type: f.a.x<? extends T>[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super R> zVar) {
        int i;
        AbstractC88984x<? extends T>[] xVarArr = this.f201393a;
        if (xVarArr == null) {
            xVarArr = new AbstractC88979t[8];
            i = 0;
            for (Object obj : this.f201394b) {
                if (i == xVarArr.length) {
                    AbstractC88984x<? extends T>[] xVarArr2 = new AbstractC88984x[((i >> 2) + i)];
                    System.arraycopy(xVarArr, 0, xVarArr2, 0, i);
                    xVarArr = xVarArr2;
                }
                xVarArr[i] = obj;
                i++;
            }
        } else {
            i = xVarArr.length;
        }
        if (i == 0) {
            EnumC88442c.complete(zVar);
            return;
        }
        C88740a aVar = new C88740a(zVar, this.f201395c, i, this.f201397e);
        int i2 = this.f201396d;
        C88741b<T, R>[] bVarArr = aVar.f201400c;
        int length = bVarArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            bVarArr[i3] = new C88741b<>(aVar, i2);
        }
        aVar.lazySet(0);
        aVar.f201398a.onSubscribe(aVar);
        for (int i4 = 0; i4 < length && !aVar.f201403f; i4++) {
            xVarArr[i4].mo143062b(bVarArr[i4]);
        }
    }

    public C88739bp(AbstractC88984x<? extends T>[] xVarArr, Iterable<? extends AbstractC88984x<? extends T>> iterable, AbstractC88434g<? super Object[], ? extends R> gVar, int i) {
        this.f201393a = xVarArr;
        this.f201394b = iterable;
        this.f201395c = gVar;
        this.f201396d = i;
    }
}
