package com.p2082ss.android.ugc.p4267g.p4268a.p4271c;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.g.a.c.b */
public final class C82001b {

    /* renamed from: a */
    public AbstractC88412b f183520a;

    static {
        Covode.recordClassIndex(95816);
    }

    /* renamed from: com.ss.android.ugc.g.a.c.b$a */
    public static final class C82002a implements AbstractC88986z<Long> {

        /* renamed from: a */
        final /* synthetic */ C82001b f183521a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f183522b;

        static {
            Covode.recordClassIndex(95817);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            this.f183521a.mo127167a();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154719c(th, "");
            this.f183521a.mo127167a();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(Long l) {
            this.f183522b.invoke(Long.valueOf(l.longValue()));
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154719c(bVar, "");
            this.f183521a.f183520a = bVar;
        }

        C82002a(C82001b bVar, AbstractC89172b bVar2) {
            this.f183521a = bVar;
            this.f183522b = bVar2;
        }
    }

    /* renamed from: a */
    public final void mo127167a() {
        AbstractC88412b bVar = this.f183520a;
        if (bVar != null && !bVar.isDisposed()) {
            AbstractC88412b bVar2 = this.f183520a;
            if (bVar2 == null) {
                C89219l.m154707a();
            }
            bVar2.dispose();
        }
    }

    /* renamed from: a */
    public final void mo127168a(long j, AbstractC89172b<? super Long, C89391z> bVar) {
        C89219l.m154719c(bVar, "");
        AbstractC88979t.m154307b(j, TimeUnit.MILLISECONDS).mo143062b(new C82002a(this, bVar));
    }
}
