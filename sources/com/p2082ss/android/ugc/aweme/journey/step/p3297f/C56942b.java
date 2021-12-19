package com.p2082ss.android.ugc.aweme.journey.step.p3297f;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2123b.EnumC29737c;
import com.p2082ss.android.ugc.aweme.journey.step.AbstractC56900c;
import com.p2082ss.android.ugc.aweme.language.AbstractC58069b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.step.f.b */
public final class C56942b implements AbstractC56900c<C56940a, AbstractC56944c> {

    /* renamed from: a */
    private C56940a f129668a;

    static {
        Covode.recordClassIndex(66829);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.step.AbstractC56900c
    /* renamed from: a */
    public final AbstractC89172b<AbstractC56944c, C89391z> mo94106a() {
        return new C56943a(this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.journey.l] */
    @Override // com.p2082ss.android.ugc.aweme.journey.step.AbstractC56900c
    /* renamed from: a */
    public final /* synthetic */ long mo94105a(AbstractC56944c cVar) {
        C89219l.m154721d(cVar, "");
        return 0;
    }

    @Override // com.p2082ss.android.p2124c.p2125a.AbstractC29740a
    /* renamed from: b */
    public final /* synthetic */ Object mo51983b(Object obj) {
        C89219l.m154721d(obj, "");
        C56940a aVar = new C56940a();
        this.f129668a = aVar;
        return aVar;
    }

    @Override // com.p2082ss.android.p2124c.p2125a.AbstractC29740a
    /* renamed from: c */
    public final /* synthetic */ void mo51984c(Object obj) {
        AbstractC56944c cVar = (AbstractC56944c) obj;
        C89219l.m154721d(cVar, "");
        AbstractC89172b<Fragment, C89391z> f = cVar.mo94080f();
        C56940a aVar = this.f129668a;
        if (aVar == null) {
            C89219l.m154715b();
        }
        f.invoke(aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.f.b$a */
    static final class C56943a extends AbstractC89220m implements AbstractC89172b<AbstractC56944c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C56942b f129669a;

        static {
            Covode.recordClassIndex(66830);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56943a(C56942b bVar) {
            super(1);
            this.f129669a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC56944c cVar) {
            AbstractC56944c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            AbstractC58069b n = cVar2.mo94088n();
            if (n == null || TextUtils.equals(n.mo90022f(), cVar2.mo94089o().mo90022f())) {
                cVar2.mo94090p().invoke();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.p2124c.p2125a.AbstractC29740a
    /* renamed from: a */
    public final /* synthetic */ boolean mo51982a(Object obj) {
        AbstractC56944c cVar = (AbstractC56944c) obj;
        C89219l.m154721d(cVar, "");
        if (cVar.mo94087m() && !cVar.mo94072c().contains(Integer.valueOf(EnumC29737c.JOURNEY_PRIVATE_ACCOUNT_TIPS_ID.getId()))) {
            return true;
        }
        return false;
    }
}
