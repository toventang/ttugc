package com.p2082ss.android.ugc.aweme.journey.step.p3292a;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2123b.EnumC29737c;
import com.p2082ss.android.ugc.aweme.journey.C56845ae;
import com.p2082ss.android.ugc.aweme.journey.step.AbstractC56900c;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.step.a.a */
public final class C56882a implements AbstractC56900c<View$OnClickListenerC56885c, AbstractC56884b> {

    /* renamed from: a */
    private View$OnClickListenerC56885c f129576a;

    static {
        Covode.recordClassIndex(66769);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.step.AbstractC56900c
    /* renamed from: a */
    public final AbstractC89172b<AbstractC56884b, C89391z> mo94106a() {
        return C56883a.f129577a;
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.a.a$a */
    static final class C56883a extends AbstractC89220m implements AbstractC89172b<AbstractC56884b, C89391z> {

        /* renamed from: a */
        public static final C56883a f129577a = new C56883a();

        static {
            Covode.recordClassIndex(66770);
        }

        C56883a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC56884b bVar) {
            C89219l.m154721d(bVar, "");
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.journey.l] */
    @Override // com.p2082ss.android.ugc.aweme.journey.step.AbstractC56900c
    /* renamed from: a */
    public final /* synthetic */ long mo94105a(AbstractC56884b bVar) {
        C89219l.m154721d(bVar, "");
        return 0;
    }

    @Override // com.p2082ss.android.p2124c.p2125a.AbstractC29740a
    /* renamed from: b */
    public final /* synthetic */ Object mo51983b(Object obj) {
        C89219l.m154721d(obj, "");
        View$OnClickListenerC56885c cVar = new View$OnClickListenerC56885c();
        this.f129576a = cVar;
        return cVar;
    }

    @Override // com.p2082ss.android.p2124c.p2125a.AbstractC29740a
    /* renamed from: c */
    public final /* synthetic */ void mo51984c(Object obj) {
        AbstractC56884b bVar = (AbstractC56884b) obj;
        C89219l.m154721d(bVar, "");
        AbstractC89172b<Fragment, C89391z> f = bVar.mo94080f();
        View$OnClickListenerC56885c cVar = this.f129576a;
        if (cVar == null) {
            C89219l.m154715b();
        }
        f.invoke(cVar);
    }

    @Override // com.p2082ss.android.p2124c.p2125a.AbstractC29740a
    /* renamed from: a */
    public final /* synthetic */ boolean mo51982a(Object obj) {
        Boolean bool;
        AbstractC56884b bVar = (AbstractC56884b) obj;
        C89219l.m154721d(bVar, "");
        if (bVar.mo94092r() == null) {
            return false;
        }
        C56845ae r = bVar.mo94092r();
        if (r != null) {
            bool = r.f129441a;
        } else {
            bool = null;
        }
        if (!(!C89219l.m154714a((Object) bool, (Object) true)) && bVar.mo94068b().mo63252c() == 1 && !bVar.mo94072c().contains(Integer.valueOf(EnumC29737c.JOURNEY_AD_EXPERIENCE_ID.getId()))) {
            return true;
        }
        return false;
    }
}
