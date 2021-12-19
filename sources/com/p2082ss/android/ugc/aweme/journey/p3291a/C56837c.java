package com.p2082ss.android.ugc.aweme.journey.p3291a;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.experiment.C46842do;
import com.p2082ss.android.ugc.aweme.journey.AbstractC56869p;
import com.p2082ss.android.ugc.aweme.journey.C56861h;
import com.p2082ss.android.ugc.aweme.journey.C56868o;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.a.c */
public final class C56837c {

    /* renamed from: a */
    public C56868o f129426a;

    /* renamed from: b */
    public AbstractC89172b<? super C89391z, C89391z> f129427b;

    /* renamed from: c */
    public boolean f129428c;

    static {
        Covode.recordClassIndex(66722);
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.a.c$b */
    public static final class C56839b implements AbstractC88986z<C56868o> {

        /* renamed from: a */
        final /* synthetic */ C56837c f129430a;

        static {
            Covode.recordClassIndex(66724);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            this.f129430a.f129428c = true;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56839b(C56837c cVar) {
            this.f129430a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(C56868o oVar) {
            C56868o oVar2 = oVar;
            C89219l.m154721d(oVar2, "");
            this.f129430a.f129428c = true;
            C56837c cVar = this.f129430a;
            cVar.f129426a = oVar2;
            if (cVar.f129427b != null) {
                AbstractC89172b<? super C89391z, C89391z> bVar = cVar.f129427b;
                if (bVar == null) {
                    C89219l.m154715b();
                }
                bVar.invoke(C89391z.f203057a);
                cVar.f129427b = null;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.a.c$a */
    static final class RunnableC56838a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C56837c f129429a;

        static {
            Covode.recordClassIndex(66723);
        }

        RunnableC56838a(C56837c cVar) {
            this.f129429a = cVar;
        }

        public final void run() {
            if (this.f129429a.f129427b != null) {
                AbstractC89172b<? super C89391z, C89391z> bVar = this.f129429a.f129427b;
                if (bVar == null) {
                    C89219l.m154715b();
                }
                bVar.invoke(C89391z.f203057a);
                this.f129429a.f129427b = null;
            }
        }
    }

    public C56837c() {
        AbstractC88979t<C56868o> tVar;
        AbstractC56869p a = AbstractC56869p.C56870a.m103133a();
        String b = C46842do.C46843a.m90157b();
        if (b != null) {
            tVar = C56861h.f129483a.getJourney(Integer.valueOf(a.mo63254e()), "new_user_journey", b);
        } else {
            tVar = C56861h.f129483a.getJourney(Integer.valueOf(a.mo63254e()), "new_user_journey", null);
        }
        tVar.mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C56839b(this));
    }

    /* renamed from: a */
    public final void mo94001a(long j, AbstractC89172b<? super C89391z, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        if (this.f129428c) {
            bVar.invoke(C89391z.f203057a);
            return;
        }
        this.f129427b = bVar;
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC56838a(this), j);
    }
}
