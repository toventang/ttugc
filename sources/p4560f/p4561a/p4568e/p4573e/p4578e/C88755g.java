package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4571c.AbstractC88471d;
import p4560f.p4561a.p4568e.p4571c.AbstractC88476i;
import p4560f.p4561a.p4568e.p4580f.C88851c;
import p4560f.p4561a.p4568e.p4584j.C88901c;
import p4560f.p4561a.p4568e.p4584j.EnumC88905g;
import p4560f.p4561a.p4586g.C88923c;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.e.g */
public final class C88755g<T, U> extends AbstractC88637a<T, U> {

    /* renamed from: b */
    final AbstractC88434g<? super T, ? extends AbstractC88984x<? extends U>> f201479b;

    /* renamed from: c */
    final int f201480c;

    /* renamed from: d */
    final EnumC88905g f201481d;

    static {
        Covode.recordClassIndex(104797);
    }

    /* renamed from: f.a.e.e.e.g$a */
    static final class C88756a<T, R> extends AtomicInteger implements AbstractC88412b, AbstractC88986z<T> {
        private static final long serialVersionUID = -6951100001833242599L;

        /* renamed from: a */
        final AbstractC88986z<? super R> f201482a;

        /* renamed from: b */
        final AbstractC88434g<? super T, ? extends AbstractC88984x<? extends R>> f201483b;

        /* renamed from: c */
        final int f201484c;

        /* renamed from: d */
        final C88901c f201485d = new C88901c();

        /* renamed from: e */
        final C88757a<R> f201486e;

        /* renamed from: f */
        final boolean f201487f;

        /* renamed from: g */
        AbstractC88476i<T> f201488g;

        /* renamed from: h */
        AbstractC88412b f201489h;

        /* renamed from: i */
        volatile boolean f201490i;

        /* renamed from: j */
        volatile boolean f201491j;

        /* renamed from: k */
        volatile boolean f201492k;

        /* renamed from: l */
        int f201493l;

        static {
            Covode.recordClassIndex(104798);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201492k;
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            this.f201491j = true;
            mo143102a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f.a.e.e.e.g$a$a */
        public static final class C88757a<R> extends AtomicReference<AbstractC88412b> implements AbstractC88986z<R> {
            private static final long serialVersionUID = 2620149119579502636L;

            /* renamed from: a */
            final AbstractC88986z<? super R> f201494a;

            /* renamed from: b */
            final C88756a<?, R> f201495b;

            static {
                Covode.recordClassIndex(104799);
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onComplete() {
                C88756a<?, R> aVar = this.f201495b;
                aVar.f201490i = false;
                aVar.mo143102a();
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onSubscribe(AbstractC88412b bVar) {
                EnumC88441b.replace(this, bVar);
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onNext(R r) {
                this.f201494a.onNext(r);
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onError(Throwable th) {
                C88756a<?, R> aVar = this.f201495b;
                if (aVar.f201485d.addThrowable(th)) {
                    if (!aVar.f201487f) {
                        aVar.f201489h.dispose();
                    }
                    aVar.f201490i = false;
                    aVar.mo143102a();
                    return;
                }
                C88925a.m154178a(th);
            }

            C88757a(AbstractC88986z<? super R> zVar, C88756a<?, R> aVar) {
                this.f201494a = zVar;
                this.f201495b = aVar;
            }
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f201492k = true;
            this.f201489h.dispose();
            EnumC88441b.dispose(this.f201486e);
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x004d, code lost:
            if (r0 == false) goto L_0x004f;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo143102a() {
            /*
            // Method dump skipped, instructions count: 186
            */
            throw new UnsupportedOperationException("Method not decompiled: p4560f.p4561a.p4568e.p4573e.p4578e.C88755g.C88756a.mo143102a():void");
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            if (this.f201493l == 0) {
                this.f201488g.offer(t);
            }
            mo143102a();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            if (this.f201485d.addThrowable(th)) {
                this.f201491j = true;
                mo143102a();
                return;
            }
            C88925a.m154178a(th);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201489h, bVar)) {
                this.f201489h = bVar;
                if (bVar instanceof AbstractC88471d) {
                    AbstractC88471d dVar = (AbstractC88471d) bVar;
                    int requestFusion = dVar.requestFusion(3);
                    if (requestFusion == 1) {
                        this.f201493l = requestFusion;
                        this.f201488g = dVar;
                        this.f201491j = true;
                        this.f201482a.onSubscribe(this);
                        mo143102a();
                        return;
                    } else if (requestFusion == 2) {
                        this.f201493l = requestFusion;
                        this.f201488g = dVar;
                        this.f201482a.onSubscribe(this);
                        return;
                    }
                }
                this.f201488g = new C88851c(this.f201484c);
                this.f201482a.onSubscribe(this);
            }
        }

        C88756a(AbstractC88986z<? super R> zVar, AbstractC88434g<? super T, ? extends AbstractC88984x<? extends R>> gVar, int i, boolean z) {
            this.f201482a = zVar;
            this.f201483b = gVar;
            this.f201484c = i;
            this.f201487f = z;
            this.f201486e = new C88757a<>(zVar, this);
        }
    }

    /* renamed from: f.a.e.e.e.g$b */
    static final class C88758b<T, U> extends AtomicInteger implements AbstractC88412b, AbstractC88986z<T> {
        private static final long serialVersionUID = 8828587559905699186L;

        /* renamed from: a */
        final AbstractC88986z<? super U> f201496a;

        /* renamed from: b */
        final AbstractC88434g<? super T, ? extends AbstractC88984x<? extends U>> f201497b;

        /* renamed from: c */
        final C88759a<U> f201498c;

        /* renamed from: d */
        final int f201499d;

        /* renamed from: e */
        AbstractC88476i<T> f201500e;

        /* renamed from: f */
        AbstractC88412b f201501f;

        /* renamed from: g */
        volatile boolean f201502g;

        /* renamed from: h */
        volatile boolean f201503h;

        /* renamed from: i */
        volatile boolean f201504i;

        /* renamed from: j */
        int f201505j;

        static {
            Covode.recordClassIndex(104800);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201503h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f.a.e.e.e.g$b$a */
        public static final class C88759a<U> extends AtomicReference<AbstractC88412b> implements AbstractC88986z<U> {
            private static final long serialVersionUID = -7449079488798789337L;

            /* renamed from: a */
            final AbstractC88986z<? super U> f201506a;

            /* renamed from: b */
            final C88758b<?, ?> f201507b;

            static {
                Covode.recordClassIndex(104801);
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onComplete() {
                C88758b<?, ?> bVar = this.f201507b;
                bVar.f201502g = false;
                bVar.mo143103a();
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onSubscribe(AbstractC88412b bVar) {
                EnumC88441b.replace(this, bVar);
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onNext(U u) {
                this.f201506a.onNext(u);
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onError(Throwable th) {
                this.f201507b.dispose();
                this.f201506a.onError(th);
            }

            C88759a(AbstractC88986z<? super U> zVar, C88758b<?, ?> bVar) {
                this.f201506a = zVar;
                this.f201507b = bVar;
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            if (!this.f201504i) {
                this.f201504i = true;
                mo143103a();
            }
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f201503h = true;
            EnumC88441b.dispose(this.f201498c);
            this.f201501f.dispose();
            if (getAndIncrement() == 0) {
                this.f201500e.clear();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0030, code lost:
            if (r0 == false) goto L_0x0032;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo143103a() {
            /*
            // Method dump skipped, instructions count: 114
            */
            throw new UnsupportedOperationException("Method not decompiled: p4560f.p4561a.p4568e.p4573e.p4578e.C88755g.C88758b.mo143103a():void");
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            if (this.f201504i) {
                C88925a.m154178a(th);
                return;
            }
            this.f201504i = true;
            dispose();
            this.f201496a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            if (!this.f201504i) {
                if (this.f201505j == 0) {
                    this.f201500e.offer(t);
                }
                mo143103a();
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201501f, bVar)) {
                this.f201501f = bVar;
                if (bVar instanceof AbstractC88471d) {
                    AbstractC88471d dVar = (AbstractC88471d) bVar;
                    int requestFusion = dVar.requestFusion(3);
                    if (requestFusion == 1) {
                        this.f201505j = requestFusion;
                        this.f201500e = dVar;
                        this.f201504i = true;
                        this.f201496a.onSubscribe(this);
                        mo143103a();
                        return;
                    } else if (requestFusion == 2) {
                        this.f201505j = requestFusion;
                        this.f201500e = dVar;
                        this.f201496a.onSubscribe(this);
                        return;
                    }
                }
                this.f201500e = new C88851c(this.f201499d);
                this.f201496a.onSubscribe(this);
            }
        }

        C88758b(AbstractC88986z<? super U> zVar, AbstractC88434g<? super T, ? extends AbstractC88984x<? extends U>> gVar, int i) {
            this.f201496a = zVar;
            this.f201497b = gVar;
            this.f201499d = i;
            this.f201498c = new C88759a<>(zVar, this);
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super U> zVar) {
        boolean z;
        if (!C88695ay.m153919a(this.f201095a, zVar, this.f201479b)) {
            if (this.f201481d == EnumC88905g.IMMEDIATE) {
                this.f201095a.mo143062b(new C88758b(new C88923c(zVar), this.f201479b, this.f201480c));
                return;
            }
            AbstractC88984x xVar = this.f201095a;
            AbstractC88434g<? super T, ? extends AbstractC88984x<? extends U>> gVar = this.f201479b;
            int i = this.f201480c;
            if (this.f201481d == EnumC88905g.END) {
                z = true;
            } else {
                z = false;
            }
            xVar.mo143062b(new C88756a(zVar, gVar, i, z));
        }
    }

    public C88755g(AbstractC88984x<T> xVar, AbstractC88434g<? super T, ? extends AbstractC88984x<? extends U>> gVar, int i, EnumC88905g gVar2) {
        super(xVar);
        this.f201479b = gVar;
        this.f201481d = gVar2;
        this.f201480c = Math.max(8, i);
    }
}
