package com.p2082ss.android.ugc.aweme.journey.step.p3294c;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2123b.EnumC29737c;
import com.p2082ss.android.ugc.aweme.C40313cq;
import com.p2082ss.android.ugc.aweme.journey.step.AbstractC56900c;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.step.c.d */
public final class C56912d implements AbstractC56900c<C56904b, AbstractC56911c> {

    /* renamed from: a */
    private C56904b f129615a;

    static {
        Covode.recordClassIndex(66799);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.step.AbstractC56900c
    /* renamed from: a */
    public final AbstractC89172b<AbstractC56911c, C89391z> mo94106a() {
        return C56913a.f129616a;
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.c.d$a */
    static final class C56913a extends AbstractC89220m implements AbstractC89172b<AbstractC56911c, C89391z> {

        /* renamed from: a */
        public static final C56913a f129616a = new C56913a();

        static {
            Covode.recordClassIndex(66800);
        }

        C56913a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC56911c cVar) {
            C89219l.m154721d(cVar, "");
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.journey.l] */
    @Override // com.p2082ss.android.ugc.aweme.journey.step.AbstractC56900c
    /* renamed from: a */
    public final /* synthetic */ long mo94105a(AbstractC56911c cVar) {
        C89219l.m154721d(cVar, "");
        return 0;
    }

    @Override // com.p2082ss.android.p2124c.p2125a.AbstractC29740a
    /* renamed from: b */
    public final /* synthetic */ Object mo51983b(Object obj) {
        C89219l.m154721d(obj, "");
        C56904b bVar = new C56904b();
        this.f129615a = bVar;
        return bVar;
    }

    @Override // com.p2082ss.android.p2124c.p2125a.AbstractC29740a
    /* renamed from: c */
    public final /* synthetic */ void mo51984c(Object obj) {
        AbstractC56911c cVar = (AbstractC56911c) obj;
        C89219l.m154721d(cVar, "");
        AbstractC89172b<Fragment, C89391z> f = cVar.mo94080f();
        C56904b bVar = this.f129615a;
        if (bVar == null) {
            C89219l.m154715b();
        }
        f.invoke(bVar);
    }

    @Override // com.p2082ss.android.p2124c.p2125a.AbstractC29740a
    /* renamed from: a */
    public final /* synthetic */ boolean mo51982a(Object obj) {
        AbstractC56911c cVar = (AbstractC56911c) obj;
        C89219l.m154721d(cVar, "");
        if (cVar.mo94091q() != null && !C40313cq.f94478a.mo60094c() && !cVar.mo94072c().contains(Integer.valueOf(EnumC29737c.JOURNEY_CONTENT_LANGUAGE_ID.getId()))) {
            return true;
        }
        return false;
    }
}
