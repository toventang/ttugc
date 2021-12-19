package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4571c.AbstractC88471d;
import p4560f.p4561a.p4568e.p4571c.AbstractC88476i;
import p4560f.p4561a.p4568e.p4580f.C88851c;
import p4560f.p4561a.p4568e.p4584j.C88901c;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.e.bf */
public final class C88712bf<T, R> extends AbstractC88637a<T, R> {

    /* renamed from: b */
    final AbstractC88434g<? super T, ? extends AbstractC88984x<? extends R>> f201305b;

    /* renamed from: c */
    final int f201306c;

    /* renamed from: d */
    final boolean f201307d = false;

    static {
        Covode.recordClassIndex(104754);
    }

    /* renamed from: f.a.e.e.e.bf$b */
    static final class C88714b<T, R> extends AtomicInteger implements AbstractC88412b, AbstractC88986z<T> {

        /* renamed from: j */
        static final C88713a<Object, Object> f201313j;
        private static final long serialVersionUID = -3491074160481096299L;

        /* renamed from: a */
        final AbstractC88986z<? super R> f201314a;

        /* renamed from: b */
        final AbstractC88434g<? super T, ? extends AbstractC88984x<? extends R>> f201315b;

        /* renamed from: c */
        final int f201316c;

        /* renamed from: d */
        final boolean f201317d;

        /* renamed from: e */
        final C88901c f201318e;

        /* renamed from: f */
        volatile boolean f201319f;

        /* renamed from: g */
        volatile boolean f201320g;

        /* renamed from: h */
        AbstractC88412b f201321h;

        /* renamed from: i */
        final AtomicReference<C88713a<T, R>> f201322i = new AtomicReference<>();

        /* renamed from: k */
        volatile long f201323k;

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201320g;
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            if (!this.f201320g) {
                this.f201320g = true;
                this.f201321h.dispose();
                m153929b();
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            if (!this.f201319f) {
                this.f201319f = true;
                mo143087a();
            }
        }

        static {
            Covode.recordClassIndex(104756);
            C88713a<Object, Object> aVar = new C88713a<>(null, -1, 1);
            f201313j = aVar;
            EnumC88441b.dispose(aVar);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.util.concurrent.atomic.AtomicReference<f.a.e.e.e.bf$a<T, R>> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        private void m153929b() {
            AtomicReference atomicReference;
            C88713a<T, R> aVar = this.f201322i.get();
            C88713a<Object, Object> aVar2 = f201313j;
            if (aVar != aVar2 && (atomicReference = (AtomicReference) this.f201322i.getAndSet(aVar2)) != aVar2 && atomicReference != null) {
                EnumC88441b.dispose(atomicReference);
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x00ca  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x00d5  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo143087a() {
            /*
            // Method dump skipped, instructions count: 233
            */
            throw new UnsupportedOperationException("Method not decompiled: p4560f.p4561a.p4568e.p4573e.p4578e.C88712bf.C88714b.mo143087a():void");
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201321h, bVar)) {
                this.f201321h = bVar;
                this.f201314a.onSubscribe(this);
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            if (this.f201319f || !this.f201318e.addThrowable(th)) {
                C88925a.m154178a(th);
                return;
            }
            if (!this.f201317d) {
                m153929b();
            }
            this.f201319f = true;
            mo143087a();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            C88713a<T, R> aVar;
            long j = this.f201323k + 1;
            this.f201323k = j;
            C88713a<T, R> aVar2 = this.f201322i.get();
            if (aVar2 != null) {
                EnumC88441b.dispose(aVar2);
            }
            try {
                AbstractC88984x xVar = (AbstractC88984x) C88466b.m153697a(this.f201315b.apply(t), "The ObservableSource returned is null");
                C88713a<T, R> aVar3 = new C88713a<>(this, j, this.f201316c);
                do {
                    aVar = this.f201322i.get();
                    if (aVar == f201313j) {
                        return;
                    }
                } while (!this.f201322i.compareAndSet(aVar, aVar3));
                xVar.mo143062b(aVar3);
            } catch (Throwable th) {
                C88422b.m153670a(th);
                this.f201321h.dispose();
                onError(th);
            }
        }

        C88714b(AbstractC88986z<? super R> zVar, AbstractC88434g<? super T, ? extends AbstractC88984x<? extends R>> gVar, int i, boolean z) {
            this.f201314a = zVar;
            this.f201315b = gVar;
            this.f201316c = i;
            this.f201317d = z;
            this.f201318e = new C88901c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.e.e.e.bf$a */
    public static final class C88713a<T, R> extends AtomicReference<AbstractC88412b> implements AbstractC88986z<R> {
        private static final long serialVersionUID = 3837284832786408377L;

        /* renamed from: a */
        final C88714b<T, R> f201308a;

        /* renamed from: b */
        final long f201309b;

        /* renamed from: c */
        final int f201310c;

        /* renamed from: d */
        volatile AbstractC88476i<R> f201311d;

        /* renamed from: e */
        volatile boolean f201312e;

        static {
            Covode.recordClassIndex(104755);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            if (this.f201309b == this.f201308a.f201323k) {
                this.f201312e = true;
                this.f201308a.mo143087a();
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(R r) {
            if (this.f201309b == this.f201308a.f201323k) {
                if (r != null) {
                    this.f201311d.offer(r);
                }
                this.f201308a.mo143087a();
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C88714b<T, R> bVar = this.f201308a;
            if (this.f201309b != bVar.f201323k || !bVar.f201318e.addThrowable(th)) {
                C88925a.m154178a(th);
                return;
            }
            if (!bVar.f201317d) {
                bVar.f201321h.dispose();
            }
            this.f201312e = true;
            bVar.mo143087a();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.setOnce(this, bVar)) {
                if (bVar instanceof AbstractC88471d) {
                    AbstractC88471d dVar = (AbstractC88471d) bVar;
                    int requestFusion = dVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.f201311d = dVar;
                        this.f201312e = true;
                        this.f201308a.mo143087a();
                        return;
                    } else if (requestFusion == 2) {
                        this.f201311d = dVar;
                        return;
                    }
                }
                this.f201311d = new C88851c(this.f201310c);
            }
        }

        C88713a(C88714b<T, R> bVar, long j, int i) {
            this.f201308a = bVar;
            this.f201309b = j;
            this.f201310c = i;
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super R> zVar) {
        if (!C88695ay.m153919a(this.f201095a, zVar, this.f201305b)) {
            this.f201095a.mo143062b(new C88714b(zVar, this.f201305b, this.f201306c, this.f201307d));
        }
    }

    public C88712bf(AbstractC88984x<T> xVar, AbstractC88434g<? super T, ? extends AbstractC88984x<? extends R>> gVar, int i) {
        super(xVar);
        this.f201305b = gVar;
        this.f201306c = i;
    }
}
