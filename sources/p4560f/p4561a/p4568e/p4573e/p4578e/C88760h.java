package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4571c.AbstractC88471d;
import p4560f.p4561a.p4568e.p4571c.AbstractC88476i;
import p4560f.p4561a.p4568e.p4572d.AbstractC88490n;
import p4560f.p4561a.p4568e.p4572d.C88489m;
import p4560f.p4561a.p4568e.p4580f.C88851c;
import p4560f.p4561a.p4568e.p4584j.C88901c;
import p4560f.p4561a.p4568e.p4584j.EnumC88905g;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.e.h */
public final class C88760h<T, R> extends AbstractC88637a<T, R> {

    /* renamed from: b */
    final AbstractC88434g<? super T, ? extends AbstractC88984x<? extends R>> f201508b;

    /* renamed from: c */
    final EnumC88905g f201509c;

    /* renamed from: d */
    final int f201510d;

    /* renamed from: e */
    final int f201511e;

    static {
        Covode.recordClassIndex(104802);
    }

    /* renamed from: f.a.e.e.e.h$a */
    static final class C88761a<T, R> extends AtomicInteger implements AbstractC88412b, AbstractC88490n<R>, AbstractC88986z<T> {
        private static final long serialVersionUID = 8080567949447303262L;

        /* renamed from: a */
        final AbstractC88986z<? super R> f201512a;

        /* renamed from: b */
        final AbstractC88434g<? super T, ? extends AbstractC88984x<? extends R>> f201513b;

        /* renamed from: c */
        final int f201514c;

        /* renamed from: d */
        final int f201515d;

        /* renamed from: e */
        final EnumC88905g f201516e;

        /* renamed from: f */
        final C88901c f201517f = new C88901c();

        /* renamed from: g */
        final ArrayDeque<C88489m<R>> f201518g = new ArrayDeque<>();

        /* renamed from: h */
        AbstractC88476i<T> f201519h;

        /* renamed from: i */
        AbstractC88412b f201520i;

        /* renamed from: j */
        volatile boolean f201521j;

        /* renamed from: k */
        int f201522k;

        /* renamed from: l */
        volatile boolean f201523l;

        /* renamed from: m */
        C88489m<R> f201524m;

        /* renamed from: n */
        int f201525n;

        static {
            Covode.recordClassIndex(104803);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201523l;
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            this.f201521j = true;
            mo143002a();
        }

        /* renamed from: b */
        private void m153967b() {
            C88489m<R> mVar = this.f201524m;
            if (mVar != null) {
                mVar.dispose();
            }
            while (true) {
                C88489m<R> poll = this.f201518g.poll();
                if (poll != null) {
                    poll.dispose();
                } else {
                    return;
                }
            }
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f201523l = true;
            if (getAndIncrement() == 0) {
                this.f201519h.clear();
                m153967b();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d6, code lost:
            if (r0 == false) goto L_0x00d8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00da, code lost:
            if (r10 != null) goto L_0x00dc;
         */
        @Override // p4560f.p4561a.p4568e.p4572d.AbstractC88490n
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo143002a() {
            /*
            // Method dump skipped, instructions count: 357
            */
            throw new UnsupportedOperationException("Method not decompiled: p4560f.p4561a.p4568e.p4573e.p4578e.C88760h.C88761a.mo143002a():void");
        }

        @Override // p4560f.p4561a.p4568e.p4572d.AbstractC88490n
        /* renamed from: a */
        public final void mo143003a(C88489m<R> mVar) {
            mVar.setDone();
            mo143002a();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            if (this.f201522k == 0) {
                this.f201519h.offer(t);
            }
            mo143002a();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            if (this.f201517f.addThrowable(th)) {
                this.f201521j = true;
                mo143002a();
                return;
            }
            C88925a.m154178a(th);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201520i, bVar)) {
                this.f201520i = bVar;
                if (bVar instanceof AbstractC88471d) {
                    AbstractC88471d dVar = (AbstractC88471d) bVar;
                    int requestFusion = dVar.requestFusion(3);
                    if (requestFusion == 1) {
                        this.f201522k = requestFusion;
                        this.f201519h = dVar;
                        this.f201521j = true;
                        this.f201512a.onSubscribe(this);
                        mo143002a();
                        return;
                    } else if (requestFusion == 2) {
                        this.f201522k = requestFusion;
                        this.f201519h = dVar;
                        this.f201512a.onSubscribe(this);
                        return;
                    }
                }
                this.f201519h = new C88851c(this.f201515d);
                this.f201512a.onSubscribe(this);
            }
        }

        @Override // p4560f.p4561a.p4568e.p4572d.AbstractC88490n
        /* renamed from: a */
        public final void mo143004a(C88489m<R> mVar, R r) {
            mVar.queue().offer(r);
            mo143002a();
        }

        @Override // p4560f.p4561a.p4568e.p4572d.AbstractC88490n
        /* renamed from: a */
        public final void mo143005a(C88489m<R> mVar, Throwable th) {
            if (this.f201517f.addThrowable(th)) {
                if (this.f201516e == EnumC88905g.IMMEDIATE) {
                    this.f201520i.dispose();
                }
                mVar.setDone();
                mo143002a();
                return;
            }
            C88925a.m154178a(th);
        }

        C88761a(AbstractC88986z<? super R> zVar, AbstractC88434g<? super T, ? extends AbstractC88984x<? extends R>> gVar, int i, int i2, EnumC88905g gVar2) {
            this.f201512a = zVar;
            this.f201513b = gVar;
            this.f201514c = i;
            this.f201515d = i2;
            this.f201516e = gVar2;
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super R> zVar) {
        this.f201095a.mo143062b(new C88761a(zVar, this.f201508b, this.f201510d, this.f201511e, this.f201509c));
    }

    public C88760h(AbstractC88984x<T> xVar, AbstractC88434g<? super T, ? extends AbstractC88984x<? extends R>> gVar, EnumC88905g gVar2, int i, int i2) {
        super(xVar);
        this.f201508b = gVar;
        this.f201509c = gVar2;
        this.f201510d = i;
        this.f201511e = i2;
    }
}
