package com.p2082ss.android.ugc.aweme.journey.step.interestselector;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2123b.EnumC29737c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C46998gw;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.progressguidance.C50418a;
import com.p2082ss.android.ugc.aweme.journey.step.AbstractC56900c;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.e */
public final class C56994e implements AbstractC56900c<AbstractC34586a, AbstractC56974c> {

    /* renamed from: a */
    public static final C56995a f129754a = new C56995a((byte) 0);

    /* renamed from: b */
    private AbstractC34586a f129755b;

    static {
        Covode.recordClassIndex(66882);
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.e$a */
    public static final class C56995a {
        static {
            Covode.recordClassIndex(66883);
        }

        private C56995a() {
        }

        public /* synthetic */ C56995a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.step.AbstractC56900c
    /* renamed from: a */
    public final AbstractC89172b<AbstractC56974c, C89391z> mo94106a() {
        return C56996b.f129756a;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.journey.l] */
    @Override // com.p2082ss.android.ugc.aweme.journey.step.AbstractC56900c
    /* renamed from: a */
    public final /* synthetic */ long mo94105a(AbstractC56974c cVar) {
        AbstractC56974c cVar2 = cVar;
        C89219l.m154721d(cVar2, "");
        if (cVar2.mo94085k()) {
            return 1000;
        }
        return 0;
    }

    @Override // com.p2082ss.android.p2124c.p2125a.AbstractC29740a
    /* renamed from: b */
    public final /* synthetic */ Object mo51983b(Object obj) {
        AbstractC34586a fVar;
        C89219l.m154721d(obj, "");
        if (C46998gw.m90275a()) {
            fVar = new C56975d();
        } else {
            fVar = new C56997f();
        }
        this.f129755b = fVar;
        return fVar;
    }

    @Override // com.p2082ss.android.p2124c.p2125a.AbstractC29740a
    /* renamed from: c */
    public final /* synthetic */ void mo51984c(Object obj) {
        AbstractC56974c cVar = (AbstractC56974c) obj;
        C89219l.m154721d(cVar, "");
        AbstractC89172b<Fragment, C89391z> f = cVar.mo94080f();
        AbstractC34586a aVar = this.f129755b;
        if (aVar == null) {
            C89219l.m154715b();
        }
        f.invoke(aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.e$b */
    static final class C56996b extends AbstractC89220m implements AbstractC89172b<AbstractC56974c, C89391z> {

        /* renamed from: a */
        public static final C56996b f129756a = new C56996b();

        static {
            Covode.recordClassIndex(66884);
        }

        C56996b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC56974c cVar) {
            AbstractC56974c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            C39162r.m79460a("need_show_interest_selection", new C33744d().mo59980a("backend_response_received", C50418a.f116406b.contains("response_received") ? 1 : 0).mo59980a("used_default_interest_data", cVar2.mo94085k() ? 1 : 0).f79943a);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.p2124c.p2125a.AbstractC29740a
    /* renamed from: a */
    public final /* synthetic */ boolean mo51982a(Object obj) {
        AbstractC56974c cVar = (AbstractC56974c) obj;
        C89219l.m154721d(cVar, "");
        if (cVar.mo94068b().mo63252c() != 1 || cVar.mo94072c().contains(Integer.valueOf(EnumC29737c.JOURNEY_INTERESTS_ID.getId()))) {
            return false;
        }
        return true;
    }
}
