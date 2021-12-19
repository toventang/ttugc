package com.p2082ss.android.ugc.aweme.journey.step.p3299h;

import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2123b.EnumC29737c;
import com.p2082ss.android.ugc.aweme.friends.service.AbstractC51649b;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.friends.service.IFriendsService;
import com.p2082ss.android.ugc.aweme.journey.step.AbstractC56900c;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.step.h.a */
public final class C56961a implements AbstractC56900c<C89391z, AbstractC56964b> {
    static {
        Covode.recordClassIndex(66848);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.step.AbstractC56900c
    /* renamed from: a */
    public final AbstractC89172b<AbstractC56964b, C89391z> mo94106a() {
        return C56963b.f129699a;
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.h.a$a */
    public static final class C56962a implements IFriendsService.AbstractC51639c {

        /* renamed from: a */
        final /* synthetic */ AbstractC56964b f129698a;

        static {
            Covode.recordClassIndex(66849);
        }

        @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService.AbstractC51639c
        /* renamed from: a */
        public final void mo87346a() {
            this.f129698a.mo94096v().invoke();
        }

        C56962a(AbstractC56964b bVar) {
            this.f129698a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService.AbstractC51639c
        /* renamed from: a */
        public final void mo87347a(Fragment fragment) {
            C89219l.m154721d(fragment, "");
            this.f129698a.mo94099y().invoke(fragment);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.journey.l] */
    @Override // com.p2082ss.android.ugc.aweme.journey.step.AbstractC56900c
    /* renamed from: a */
    public final /* synthetic */ long mo94105a(AbstractC56964b bVar) {
        C89219l.m154721d(bVar, "");
        return 0;
    }

    @Override // com.p2082ss.android.p2124c.p2125a.AbstractC29740a
    /* renamed from: b */
    public final /* synthetic */ Object mo51983b(Object obj) {
        C89219l.m154721d(obj, "");
        return C89391z.f203057a;
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.h.a$b */
    static final class C56963b extends AbstractC89220m implements AbstractC89172b<AbstractC56964b, C89391z> {

        /* renamed from: a */
        public static final C56963b f129699a = new C56963b();

        static {
            Covode.recordClassIndex(66850);
        }

        C56963b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC56964b bVar) {
            C89219l.m154721d(bVar, "");
            C51648a.f118980a.mo87337q();
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.p2124c.p2125a.AbstractC29740a
    /* renamed from: a */
    public final /* synthetic */ boolean mo51982a(Object obj) {
        AbstractC56964b bVar = (AbstractC56964b) obj;
        C89219l.m154721d(bVar, "");
        if (bVar.mo94072c().contains(Integer.valueOf(EnumC29737c.JOURNEY_ON_UPDATE_ADD_FB_FRIENDS_ID.getId())) || bVar.mo94068b().mo63252c() != 3) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.p2124c.p2125a.AbstractC29740a
    /* renamed from: c */
    public final /* synthetic */ void mo51984c(Object obj) {
        AbstractC56964b bVar = (AbstractC56964b) obj;
        C89219l.m154721d(bVar, "");
        ActivityC0945e eVar = bVar.mo94097w().invoke().get();
        if (eVar == null) {
            bVar.mo94098x().invoke();
            return;
        }
        AbstractC51649b s = C51648a.f118980a.mo87339s();
        if (s == null) {
            bVar.mo94098x().invoke();
        } else {
            s.mo87355a(eVar, new C56962a(bVar));
        }
    }
}
