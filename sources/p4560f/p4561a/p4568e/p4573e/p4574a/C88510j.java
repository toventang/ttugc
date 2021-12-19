package p4560f.p4561a.p4568e.p4573e.p4574a;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88410b;
import p4560f.p4561a.AbstractC88427d;
import p4560f.p4561a.AbstractC88917f;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88417a;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4569a.EnumC88442c;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.a.j */
public final class C88510j extends AbstractC88410b {

    /* renamed from: a */
    final AbstractC88917f f200784a;

    /* renamed from: b */
    final AbstractC88433f<? super AbstractC88412b> f200785b;

    /* renamed from: c */
    final AbstractC88433f<? super Throwable> f200786c;

    /* renamed from: d */
    final AbstractC88428a f200787d;

    /* renamed from: e */
    final AbstractC88428a f200788e;

    /* renamed from: f */
    final AbstractC88428a f200789f;

    /* renamed from: g */
    final AbstractC88428a f200790g;

    static {
        Covode.recordClassIndex(104552);
    }

    /* renamed from: f.a.e.e.a.j$a */
    final class C88511a implements AbstractC88412b, AbstractC88427d {

        /* renamed from: a */
        final AbstractC88427d f200791a;

        /* renamed from: b */
        AbstractC88412b f200792b;

        static {
            Covode.recordClassIndex(104553);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f200792b.isDisposed();
        }

        /* renamed from: a */
        private void m153732a() {
            try {
                C88510j.this.f200789f.mo8579a();
            } catch (Throwable th) {
                C88422b.m153670a(th);
                C88925a.m154178a(th);
            }
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            try {
                C88510j.this.f200790g.mo8579a();
            } catch (Throwable th) {
                C88422b.m153670a(th);
                C88925a.m154178a(th);
            }
            this.f200792b.dispose();
        }

        @Override // p4560f.p4561a.AbstractC88427d
        public final void onComplete() {
            if (this.f200792b != EnumC88441b.DISPOSED) {
                try {
                    C88510j.this.f200787d.mo8579a();
                    C88510j.this.f200788e.mo8579a();
                    this.f200791a.onComplete();
                    m153732a();
                } catch (Throwable th) {
                    C88422b.m153670a(th);
                    this.f200791a.onError(th);
                }
            }
        }

        @Override // p4560f.p4561a.AbstractC88427d
        public final void onError(Throwable th) {
            if (this.f200792b == EnumC88441b.DISPOSED) {
                C88925a.m154178a(th);
                return;
            }
            try {
                C88510j.this.f200786c.accept(th);
                C88510j.this.f200788e.mo8579a();
            } catch (Throwable th2) {
                C88422b.m153670a(th2);
                th = new C88417a(th, th2);
            }
            this.f200791a.onError(th);
            m153732a();
        }

        @Override // p4560f.p4561a.AbstractC88427d
        public final void onSubscribe(AbstractC88412b bVar) {
            try {
                C88510j.this.f200785b.accept(bVar);
                if (EnumC88441b.validate(this.f200792b, bVar)) {
                    this.f200792b = bVar;
                    this.f200791a.onSubscribe(this);
                }
            } catch (Throwable th) {
                C88422b.m153670a(th);
                bVar.dispose();
                this.f200792b = EnumC88441b.DISPOSED;
                EnumC88442c.error(th, this.f200791a);
            }
        }

        C88511a(AbstractC88427d dVar) {
            this.f200791a = dVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88410b
    /* renamed from: b */
    public final void mo142942b(AbstractC88427d dVar) {
        this.f200784a.mo17931a(new C88511a(dVar));
    }

    public C88510j(AbstractC88917f fVar, AbstractC88433f<? super AbstractC88412b> fVar2, AbstractC88433f<? super Throwable> fVar3, AbstractC88428a aVar, AbstractC88428a aVar2, AbstractC88428a aVar3, AbstractC88428a aVar4) {
        this.f200784a = fVar;
        this.f200785b = fVar2;
        this.f200786c = fVar3;
        this.f200787d = aVar;
        this.f200788e = aVar2;
        this.f200789f = aVar3;
        this.f200790g = aVar4;
    }
}
