package com.p2082ss.android.ugc.aweme.journey.step.p3298g;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2123b.EnumC29737c;
import com.p2082ss.android.ugc.aweme.journey.step.AbstractC56900c;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.step.g.c */
public final class C56956c implements AbstractC56900c<AbstractC56959e, AbstractC56958d> {

    /* renamed from: a */
    private AbstractC56959e f129689a;

    static {
        Covode.recordClassIndex(66843);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.step.AbstractC56900c
    /* renamed from: a */
    public final AbstractC89172b<AbstractC56958d, C89391z> mo94106a() {
        return C56957a.f129690a;
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.g.c$a */
    static final class C56957a extends AbstractC89220m implements AbstractC89172b<AbstractC56958d, C89391z> {

        /* renamed from: a */
        public static final C56957a f129690a = new C56957a();

        static {
            Covode.recordClassIndex(66844);
        }

        C56957a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC56958d dVar) {
            C89219l.m154721d(dVar, "");
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.journey.l] */
    @Override // com.p2082ss.android.ugc.aweme.journey.step.AbstractC56900c
    /* renamed from: a */
    public final /* synthetic */ long mo94105a(AbstractC56958d dVar) {
        C89219l.m154721d(dVar, "");
        return 0;
    }

    @Override // com.p2082ss.android.p2124c.p2125a.AbstractC29740a
    /* renamed from: a */
    public final /* synthetic */ boolean mo51982a(Object obj) {
        AbstractC56958d dVar = (AbstractC56958d) obj;
        C89219l.m154721d(dVar, "");
        if (dVar.mo94072c().contains(Integer.valueOf(EnumC29737c.JOURNEY_SLOGAN_ID.getId()))) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.p2124c.p2125a.AbstractC29740a
    /* renamed from: c */
    public final /* synthetic */ void mo51984c(Object obj) {
        AbstractC56958d dVar = (AbstractC56958d) obj;
        C89219l.m154721d(dVar, "");
        AbstractC89172b<Fragment, C89391z> g = dVar.mo94081g();
        AbstractC56959e eVar = this.f129689a;
        if (eVar == null) {
            C89219l.m154715b();
        }
        g.invoke(eVar);
    }

    @Override // com.p2082ss.android.p2124c.p2125a.AbstractC29740a
    /* renamed from: b */
    public final /* synthetic */ Object mo51983b(Object obj) {
        boolean z;
        AbstractC56958d dVar = (AbstractC56958d) obj;
        C89219l.m154721d(dVar, "");
        this.f129689a = new C56945a();
        Bundle bundle = new Bundle();
        if (dVar.mo94093s() > 0) {
            bundle.putInt("extra_optimize_option", dVar.mo94093s());
            bundle.putBoolean("extra_is_saveinstance", dVar.mo94094t());
        }
        bundle.putBoolean("extra_require_login", dVar.mo94095u());
        if (dVar.mo94068b().mo63252c() == 3) {
            z = true;
        } else {
            z = false;
        }
        bundle.putBoolean("extra_new_version", z);
        AbstractC56959e eVar = this.f129689a;
        if (eVar == null) {
            C89219l.m154715b();
        }
        eVar.setArguments(bundle);
        return this.f129689a;
    }
}
