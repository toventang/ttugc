package com.p2082ss.android.ugc.aweme.journey.step.p3295d;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2123b.EnumC29737c;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.journey.step.AbstractC56900c;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.step.d.d */
public final class C56919d implements AbstractC56900c<C56916a, AbstractC56918c> {

    /* renamed from: a */
    private C56916a f129623a;

    static {
        Covode.recordClassIndex(66806);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.step.AbstractC56900c
    /* renamed from: a */
    public final AbstractC89172b<AbstractC56918c, C89391z> mo94106a() {
        return C56920a.f129624a;
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.d.d$a */
    static final class C56920a extends AbstractC89220m implements AbstractC89172b<AbstractC56918c, C89391z> {

        /* renamed from: a */
        public static final C56920a f129624a = new C56920a();

        static {
            Covode.recordClassIndex(66807);
        }

        C56920a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC56918c cVar) {
            C89219l.m154721d(cVar, "");
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.journey.l] */
    @Override // com.p2082ss.android.ugc.aweme.journey.step.AbstractC56900c
    /* renamed from: a */
    public final /* synthetic */ long mo94105a(AbstractC56918c cVar) {
        C89219l.m154721d(cVar, "");
        return 0;
    }

    @Override // com.p2082ss.android.p2124c.p2125a.AbstractC29740a
    /* renamed from: b */
    public final /* synthetic */ Object mo51983b(Object obj) {
        C89219l.m154721d(obj, "");
        C56916a aVar = new C56916a();
        this.f129623a = aVar;
        return aVar;
    }

    @Override // com.p2082ss.android.p2124c.p2125a.AbstractC29740a
    /* renamed from: c */
    public final /* synthetic */ void mo51984c(Object obj) {
        AbstractC56918c cVar = (AbstractC56918c) obj;
        C89219l.m154721d(cVar, "");
        AbstractC89172b<Fragment, C89391z> f = cVar.mo94080f();
        C56916a aVar = this.f129623a;
        if (aVar == null) {
            C89219l.m154715b();
        }
        f.invoke(aVar);
    }

    @Override // com.p2082ss.android.p2124c.p2125a.AbstractC29740a
    /* renamed from: a */
    public final /* synthetic */ boolean mo51982a(Object obj) {
        AbstractC56918c cVar = (AbstractC56918c) obj;
        C89219l.m154721d(cVar, "");
        if (cVar.mo94082h()) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (!g.isLogin()) {
                return false;
            }
        }
        if (cVar.mo94083i() == null || cVar.mo94072c().contains(Integer.valueOf(EnumC29737c.JOURNEY_DEEPLINK_ID.getId()))) {
            return false;
        }
        return true;
    }
}
