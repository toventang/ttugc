package com.p2082ss.android.ugc.aweme.journey.step.p3299h;

import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2123b.EnumC29737c;
import com.p2082ss.android.ugc.aweme.friends.service.AbstractC51649b;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.friends.service.IFriendsService;
import com.p2082ss.android.ugc.aweme.journey.step.AbstractC56900c;
import com.p2082ss.android.ugc.aweme.relation.EnumC66889c;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.step.h.c */
public final class C56965c implements AbstractC56900c<C89391z, AbstractC56968d> {
    static {
        Covode.recordClassIndex(66852);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.step.AbstractC56900c
    /* renamed from: a */
    public final AbstractC89172b<AbstractC56968d, C89391z> mo94106a() {
        return C56967b.f129702a;
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.h.c$a */
    public static final class C56966a implements IFriendsService.AbstractC51639c {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f129700a;

        /* renamed from: b */
        final /* synthetic */ AbstractC56968d f129701b;

        static {
            Covode.recordClassIndex(66853);
        }

        @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService.AbstractC51639c
        /* renamed from: a */
        public final void mo87346a() {
            this.f129701b.mo94098x().invoke();
        }

        @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService.AbstractC51639c
        /* renamed from: a */
        public final void mo87347a(Fragment fragment) {
            C89219l.m154721d(fragment, "");
            this.f129701b.mo94099y().invoke(fragment);
        }

        C56966a(ActivityC0945e eVar, AbstractC56968d dVar) {
            this.f129700a = eVar;
            this.f129701b = dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.h.c$b */
    static final class C56967b extends AbstractC89220m implements AbstractC89172b<AbstractC56968d, C89391z> {

        /* renamed from: a */
        public static final C56967b f129702a = new C56967b();

        static {
            Covode.recordClassIndex(66854);
        }

        C56967b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC56968d dVar) {
            C89219l.m154721d(dVar, "");
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.journey.l] */
    @Override // com.p2082ss.android.ugc.aweme.journey.step.AbstractC56900c
    /* renamed from: a */
    public final /* synthetic */ long mo94105a(AbstractC56968d dVar) {
        C89219l.m154721d(dVar, "");
        return 0;
    }

    @Override // com.p2082ss.android.p2124c.p2125a.AbstractC29740a
    /* renamed from: b */
    public final /* synthetic */ Object mo51983b(Object obj) {
        C89219l.m154721d(obj, "");
        return C89391z.f203057a;
    }

    @Override // com.p2082ss.android.p2124c.p2125a.AbstractC29740a
    /* renamed from: a */
    public final /* synthetic */ boolean mo51982a(Object obj) {
        AbstractC56968d dVar = (AbstractC56968d) obj;
        C89219l.m154721d(dVar, "");
        if (dVar.mo94072c().contains(Integer.valueOf(EnumC29737c.JOURNEY_NEW_USER_ADD_FB_FRIENDS_ID.getId()))) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.p2124c.p2125a.AbstractC29740a
    /* renamed from: c */
    public final /* synthetic */ void mo51984c(Object obj) {
        AbstractC56968d dVar = (AbstractC56968d) obj;
        C89219l.m154721d(dVar, "");
        ActivityC0945e eVar = dVar.mo94097w().invoke().get();
        if (eVar == null) {
            dVar.mo94098x().invoke();
            return;
        }
        AbstractC51649b s = C51648a.f118980a.mo87339s();
        if (s == null) {
            dVar.mo94098x().invoke();
        } else {
            s.mo87356a(eVar, EnumC66889c.TRIGGER_IN_JOURNEY_BACK, new C56966a(eVar, dVar));
        }
    }
}
