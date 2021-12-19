package p4560f.p4561a.p4568e.p4573e.p4574a;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88410b;
import p4560f.p4561a.AbstractC88427d;
import p4560f.p4561a.AbstractC88917f;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88417a;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88438k;

/* renamed from: f.a.e.e.a.i */
public final class C88508i extends AbstractC88410b {

    /* renamed from: a */
    final AbstractC88917f f200780a;

    /* renamed from: b */
    final AbstractC88438k<? super Throwable> f200781b;

    static {
        Covode.recordClassIndex(104550);
    }

    /* renamed from: f.a.e.e.a.i$a */
    final class C88509a implements AbstractC88427d {

        /* renamed from: b */
        private final AbstractC88427d f200783b;

        static {
            Covode.recordClassIndex(104551);
        }

        @Override // p4560f.p4561a.AbstractC88427d
        public final void onComplete() {
            this.f200783b.onComplete();
        }

        @Override // p4560f.p4561a.AbstractC88427d
        public final void onSubscribe(AbstractC88412b bVar) {
            this.f200783b.onSubscribe(bVar);
        }

        @Override // p4560f.p4561a.AbstractC88427d
        public final void onError(Throwable th) {
            try {
                if (C88508i.this.f200781b.mo7718a(th)) {
                    this.f200783b.onComplete();
                } else {
                    this.f200783b.onError(th);
                }
            } catch (Throwable th2) {
                C88422b.m153670a(th2);
                this.f200783b.onError(new C88417a(th, th2));
            }
        }

        C88509a(AbstractC88427d dVar) {
            this.f200783b = dVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88410b
    /* renamed from: b */
    public final void mo142942b(AbstractC88427d dVar) {
        this.f200780a.mo17931a(new C88509a(dVar));
    }

    public C88508i(AbstractC88917f fVar, AbstractC88438k<? super Throwable> kVar) {
        this.f200780a = fVar;
        this.f200781b = kVar;
    }
}
