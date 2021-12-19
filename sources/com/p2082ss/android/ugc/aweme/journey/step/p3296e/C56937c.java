package com.p2082ss.android.ugc.aweme.journey.step.p3296e;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2123b.EnumC29737c;
import com.p2082ss.android.ugc.aweme.journey.step.AbstractC56900c;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.step.e.c */
public final class C56937c implements AbstractC56900c<C56924b, AbstractC56939d> {

    /* renamed from: a */
    private C56924b f129665a;

    static {
        Covode.recordClassIndex(66824);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.step.AbstractC56900c
    /* renamed from: a */
    public final AbstractC89172b<AbstractC56939d, C89391z> mo94106a() {
        return C56938a.f129666a;
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.e.c$a */
    static final class C56938a extends AbstractC89220m implements AbstractC89172b<AbstractC56939d, C89391z> {

        /* renamed from: a */
        public static final C56938a f129666a = new C56938a();

        static {
            Covode.recordClassIndex(66825);
        }

        C56938a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC56939d dVar) {
            C89219l.m154721d(dVar, "");
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.journey.l] */
    @Override // com.p2082ss.android.ugc.aweme.journey.step.AbstractC56900c
    /* renamed from: a */
    public final /* synthetic */ long mo94105a(AbstractC56939d dVar) {
        C89219l.m154721d(dVar, "");
        return 0;
    }

    @Override // com.p2082ss.android.p2124c.p2125a.AbstractC29740a
    /* renamed from: b */
    public final /* synthetic */ Object mo51983b(Object obj) {
        C89219l.m154721d(obj, "");
        C56924b bVar = new C56924b();
        this.f129665a = bVar;
        return bVar;
    }

    @Override // com.p2082ss.android.p2124c.p2125a.AbstractC29740a
    /* renamed from: c */
    public final /* synthetic */ void mo51984c(Object obj) {
        AbstractC56939d dVar = (AbstractC56939d) obj;
        C89219l.m154721d(dVar, "");
        AbstractC89172b<Fragment, C89391z> f = dVar.mo94080f();
        C56924b bVar = this.f129665a;
        if (bVar == null) {
            C89219l.m154715b();
        }
        f.invoke(bVar);
    }

    @Override // com.p2082ss.android.p2124c.p2125a.AbstractC29740a
    /* renamed from: a */
    public final /* synthetic */ boolean mo51982a(Object obj) {
        AbstractC56939d dVar = (AbstractC56939d) obj;
        C89219l.m154721d(dVar, "");
        if (dVar.mo94076d() == 0 || dVar.mo94076d() == 2 || dVar.mo94072c().contains(Integer.valueOf(EnumC29737c.JOURNEY_GENDER_SELECTION.getId())) || dVar.mo94078e() == null) {
            return false;
        }
        return true;
    }
}
