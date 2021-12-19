package com.p2082ss.android.ugc.aweme.relation.viewholder;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20468h;
import com.bytedance.jedi.arch.AbstractC20550y;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.ext.adapter.C20671j;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.arch.JediBaseViewHolder;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.common.C39143l;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C46792ci;
import com.p2082ss.android.ugc.aweme.following.p3002a.C51108g;
import com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel.FollowRelationState;
import com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel.FollowRelationTabViewModel;
import com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel.FollowingRelationViewModel;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.newfollow.p3506c.C61504e;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63847n;
import com.p2082ss.android.ugc.aweme.recommend.AbstractC66614a;
import com.p2082ss.android.ugc.aweme.recommend.C66623g;
import com.p2082ss.android.ugc.aweme.recommend.RecommendListViewModel;
import com.p2082ss.android.ugc.aweme.recommend.RecommendUserListState;
import com.p2082ss.android.ugc.aweme.social.p3914a.C74700b;
import com.p2082ss.android.ugc.aweme.social.p3914a.C74707c;
import com.p2082ss.android.ugc.aweme.user.repository.UserState;
import com.p2082ss.android.ugc.aweme.user.repository.UserViewModel;
import com.p2082ss.android.ugc.aweme.utils.C80409eu;
import java.util.ArrayList;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.relation.viewholder.NewRecommendUserViewHolder */
public final class NewRecommendUserViewHolder extends JediBaseViewHolder<NewRecommendUserViewHolder, C51108g> implements AbstractC33974au {

    /* renamed from: g */
    final AbstractC89244h f150359g;

    /* renamed from: j */
    private final AbstractC89244h f150360j;

    /* renamed from: k */
    private final AbstractC89244h f150361k;

    /* renamed from: l */
    private final AbstractC66614a f150362l;

    static {
        Covode.recordClassIndex(78599);
    }

    /* renamed from: o */
    private final RecommendListViewModel m118714o() {
        return (RecommendListViewModel) this.f150360j.getValue();
    }

    /* renamed from: p */
    private final FollowingRelationViewModel m118715p() {
        return (FollowingRelationViewModel) this.f150361k.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.JediBaseViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: q */
    private final String m118716q() {
        return (String) withState(m118714o(), C67028g.f150376a);
    }

    /* renamed from: s */
    private final String m118718s() {
        return (String) withState(m118714o(), C67030i.f150378a);
    }

    /* renamed from: t */
    private final String m118719t() {
        return (String) withState(m118714o(), C67029h.f150377a);
    }

    /* renamed from: r */
    private final String m118717r() {
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = "";
        withState(m118714o(), new C67027f(eVar));
        return eVar.element;
    }

    /* renamed from: n */
    public final String mo70807n() {
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = "";
        withState(m118714o(), new C67026e(eVar));
        return eVar.element;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void cc_() {
        super.cc_();
        AbstractC88412b unused = selectSubscribe(mo63351m(), C67036a.f150384a, new C20370ah(), C67033l.f150381a);
        AbstractC20468h.C20469a.m38667a(this, mo63351m(), C67037b.f150385a, (C20370ah) null, C67034m.f150382a, (AbstractC89172b) null, C67035n.f150383a, 10);
        mo105890a(((C51108g) aQ_()).f117934b, 5);
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.viewholder.NewRecommendUserViewHolder$a */
    public static final class C67022a extends AbstractC89220m implements AbstractC89171a<FollowRelationTabViewModel> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolder f150363a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f150364b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f150365c;

        static {
            Covode.recordClassIndex(78600);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C67022a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f150363a = jediViewHolder;
            this.f150364b = cVar;
            this.f150365c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel.FollowRelationTabViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.relation.viewholder.NewRecommendUserViewHolder.C67022a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_relation_viewholder_NewRecommendUserViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m118724x7b7b346b(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.viewholder.NewRecommendUserViewHolder$b */
    public static final class C67023b extends AbstractC89220m implements AbstractC89171a<RecommendListViewModel> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolder f150366a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f150367b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f150368c;

        static {
            Covode.recordClassIndex(78601);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C67023b(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f150366a = jediViewHolder;
            this.f150367b = cVar;
            this.f150368c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.recommend.RecommendListViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.recommend.RecommendListViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.recommend.RecommendListViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.recommend.RecommendListViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.relation.viewholder.NewRecommendUserViewHolder.C67023b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_relation_viewholder_NewRecommendUserViewHolder$$special$$inlined$hostViewModel$2_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m118725x8f2307ec(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.viewholder.NewRecommendUserViewHolder$c */
    public static final class C67024c extends AbstractC89220m implements AbstractC89171a<FollowingRelationViewModel> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolder f150369a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f150370b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f150371c;

        static {
            Covode.recordClassIndex(78602);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C67024c(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f150369a = jediViewHolder;
            this.f150370b = cVar;
            this.f150371c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel.FollowingRelationViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.relation.viewholder.NewRecommendUserViewHolder.C67024c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_relation_viewholder_NewRecommendUserViewHolder$$special$$inlined$hostViewModel$3_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m118726xa2cadb6d(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: m */
    public final UserViewModel mo63351m() {
        C67032k kVar = new C67032k(this);
        JediViewHolderProxy jediViewHolderProxy = this.f48646d;
        if (jediViewHolderProxy != null) {
            JediViewModel jediViewModel = (JediViewModel) C20671j.C20672a.m38922a(mo33721d(), jediViewHolderProxy.mo33900b()).mo33923a(getClass().getName() + '_' + UserViewModel.class.getName(), UserViewModel.class);
            AbstractC20550y a = jediViewModel.f48234j.mo33696a(UserViewModel.class);
            if (a != null) {
                a.binding(jediViewModel);
            }
            jediViewModel.mo33686a_(kVar);
            return (UserViewModel) jediViewModel;
        }
        throw new IllegalStateException("proxy not bound to viewHolder yet");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.viewholder.NewRecommendUserViewHolder$g */
    public static final class C67028g extends AbstractC89220m implements AbstractC89172b<RecommendUserListState, String> {

        /* renamed from: a */
        public static final C67028g f150376a = new C67028g();

        static {
            Covode.recordClassIndex(78606);
        }

        C67028g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(RecommendUserListState recommendUserListState) {
            RecommendUserListState recommendUserListState2 = recommendUserListState;
            C89219l.m154721d(recommendUserListState2, "");
            return recommendUserListState2.getUserId();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.viewholder.NewRecommendUserViewHolder$i */
    public static final class C67030i extends AbstractC89220m implements AbstractC89172b<RecommendUserListState, String> {

        /* renamed from: a */
        public static final C67030i f150378a = new C67030i();

        static {
            Covode.recordClassIndex(78608);
        }

        C67030i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(RecommendUserListState recommendUserListState) {
            RecommendUserListState recommendUserListState2 = recommendUserListState;
            C89219l.m154721d(recommendUserListState2, "");
            return recommendUserListState2.getRecommendMobParams().f149765b;
        }
    }

    /* renamed from: a */
    public final void mo105889a(User user) {
        this.f150362l.mo61444a(user);
        this.f150362l.setEventListener(new C67025d(this, user));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.viewholder.NewRecommendUserViewHolder$d */
    public static final class C67025d extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ NewRecommendUserViewHolder f150372a;

        /* renamed from: b */
        final /* synthetic */ User f150373b;

        static {
            Covode.recordClassIndex(78603);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67025d(NewRecommendUserViewHolder newRecommendUserViewHolder, User user) {
            super(1);
            this.f150372a = newRecommendUserViewHolder;
            this.f150373b = user;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            this.f150372a.mo105890a(this.f150373b, num.intValue());
            NewRecommendUserViewHolder newRecommendUserViewHolder = this.f150372a;
            newRecommendUserViewHolder.withState((FollowRelationTabViewModel) newRecommendUserViewHolder.f150359g.getValue(), C67031j.f150379a);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.viewholder.NewRecommendUserViewHolder$e */
    public static final class C67026e extends AbstractC89220m implements AbstractC89172b<RecommendUserListState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f150374a;

        static {
            Covode.recordClassIndex(78604);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67026e(C89233z.C89238e eVar) {
            super(1);
            this.f150374a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(RecommendUserListState recommendUserListState) {
            RecommendUserListState recommendUserListState2 = recommendUserListState;
            C89219l.m154721d(recommendUserListState2, "");
            this.f150374a.element = recommendUserListState2.getRecommendUserType() == 13 ? (T) "following_list" : (T) recommendUserListState2.getRecommendMobParams().f149764a;
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.viewholder.NewRecommendUserViewHolder$h */
    public static final class C67029h extends AbstractC89220m implements AbstractC89172b<RecommendUserListState, String> {

        /* renamed from: a */
        public static final C67029h f150377a = new C67029h();

        static {
            Covode.recordClassIndex(78607);
        }

        C67029h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(RecommendUserListState recommendUserListState) {
            RecommendUserListState recommendUserListState2 = recommendUserListState;
            C89219l.m154721d(recommendUserListState2, "");
            if (recommendUserListState2.getRecommendUserType() != 13 || !C74700b.m131154b()) {
                return "";
            }
            return "bottom";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.viewholder.NewRecommendUserViewHolder$j */
    static final class C67031j extends AbstractC89220m implements AbstractC89172b<FollowRelationState, C89391z> {

        /* renamed from: a */
        public static final C67031j f150379a = new C67031j();

        static {
            Covode.recordClassIndex(78609);
        }

        C67031j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(FollowRelationState followRelationState) {
            FollowRelationState followRelationState2 = followRelationState;
            C89219l.m154721d(followRelationState2, "");
            if (followRelationState2.isFollowingTab() && C74700b.m131154b()) {
                C74707c.m131160d();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.viewholder.NewRecommendUserViewHolder$k */
    public static final class C67032k extends AbstractC89220m implements AbstractC89172b<UserState, UserState> {

        /* renamed from: a */
        final /* synthetic */ NewRecommendUserViewHolder f150380a;

        static {
            Covode.recordClassIndex(78610);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67032k(NewRecommendUserViewHolder newRecommendUserViewHolder) {
            super(1);
            this.f150380a = newRecommendUserViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ UserState invoke(UserState userState) {
            UserState userState2 = userState;
            C89219l.m154721d(userState2, "");
            return UserState.copy$default(userState2, ((C51108g) this.f150380a.aQ_()).f117934b, false, null, null, null, 30, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.viewholder.NewRecommendUserViewHolder$f */
    public static final class C67027f extends AbstractC89220m implements AbstractC89172b<RecommendUserListState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f150375a;

        static {
            Covode.recordClassIndex(78605);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67027f(C89233z.C89238e eVar) {
            super(1);
            this.f150375a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(RecommendUserListState recommendUserListState) {
            RecommendUserListState recommendUserListState2 = recommendUserListState;
            C89219l.m154721d(recommendUserListState2, "");
            if (recommendUserListState2.isMySelf() && recommendUserListState2.getRecommendUserType() == 13) {
                this.f150375a.element = "following_list";
            } else if (recommendUserListState2.getRecommendUserType() == 21) {
                this.f150375a.element = "suggested_list";
            }
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewRecommendUserViewHolder(AbstractC66614a aVar) {
        super(aVar.getView());
        C89219l.m154721d(aVar, "");
        this.f150362l = aVar;
        AbstractC89277c a = C89204ab.m154669a(FollowRelationTabViewModel.class);
        this.f150359g = C89250i.m154773a((AbstractC89171a) new C67022a(this, a, a));
        AbstractC89277c a2 = C89204ab.m154669a(RecommendListViewModel.class);
        this.f150360j = C89250i.m154773a((AbstractC89171a) new C67023b(this, a2, a2));
        AbstractC89277c a3 = C89204ab.m154669a(FollowingRelationViewModel.class);
        this.f150361k = C89250i.m154773a((AbstractC89171a) new C67024c(this, a3, a3));
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.viewholder.NewRecommendUserViewHolder$l */
    static final class C67033l extends AbstractC89220m implements AbstractC89183m<NewRecommendUserViewHolder, User, C89391z> {

        /* renamed from: a */
        public static final C67033l f150381a = new C67033l();

        static {
            Covode.recordClassIndex(78611);
        }

        C67033l() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(NewRecommendUserViewHolder newRecommendUserViewHolder, User user) {
            NewRecommendUserViewHolder newRecommendUserViewHolder2 = newRecommendUserViewHolder;
            User user2 = user;
            C89219l.m154721d(newRecommendUserViewHolder2, "");
            C89219l.m154721d(user2, "");
            newRecommendUserViewHolder2.mo105889a(user2);
            ((C51108g) newRecommendUserViewHolder2.aQ_()).f117934b.setFollowStatus(user2.getFollowStatus());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.viewholder.NewRecommendUserViewHolder$m */
    static final class C67034m extends AbstractC89220m implements AbstractC89183m<NewRecommendUserViewHolder, Throwable, C89391z> {

        /* renamed from: a */
        public static final C67034m f150382a = new C67034m();

        static {
            Covode.recordClassIndex(78612);
        }

        C67034m() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(NewRecommendUserViewHolder newRecommendUserViewHolder, Throwable th) {
            NewRecommendUserViewHolder newRecommendUserViewHolder2 = newRecommendUserViewHolder;
            Throwable th2 = th;
            C89219l.m154721d(newRecommendUserViewHolder2, "");
            C89219l.m154721d(th2, "");
            View view = newRecommendUserViewHolder2.itemView;
            C89219l.m154716b(view, "");
            Activity a = C34729o.m70950a(view.getContext());
            C89219l.m154716b(a, "");
            C39143l.m79438a(a, th2);
            newRecommendUserViewHolder2.mo105889a(((C51108g) newRecommendUserViewHolder2.aQ_()).f117934b);
            newRecommendUserViewHolder2.mo63351m().mo123555a();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.viewholder.NewRecommendUserViewHolder$n */
    static final class C67035n extends AbstractC89220m implements AbstractC89183m<NewRecommendUserViewHolder, FollowStatus, C89391z> {

        /* renamed from: a */
        public static final C67035n f150383a = new C67035n();

        static {
            Covode.recordClassIndex(78613);
        }

        C67035n() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(NewRecommendUserViewHolder newRecommendUserViewHolder, FollowStatus followStatus) {
            NewRecommendUserViewHolder newRecommendUserViewHolder2 = newRecommendUserViewHolder;
            C89219l.m154721d(newRecommendUserViewHolder2, "");
            C89219l.m154721d(followStatus, "");
            newRecommendUserViewHolder2.mo63351m();
            String n = newRecommendUserViewHolder2.mo70807n();
            String uid = ((C51108g) newRecommendUserViewHolder2.aQ_()).f117934b.getUid();
            C89219l.m154716b(uid, "");
            UserViewModel.m138853a(n, uid, ((C51108g) newRecommendUserViewHolder2.aQ_()).f117934b.getFollowStatus());
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo105890a(User user, int i) {
        int i2;
        String str;
        String str2;
        C59256u.EnumC59257a aVar;
        int i3;
        user.setRequestId(((C51108g) aQ_()).f117936d);
        int i4 = 1;
        if (i != 1) {
            int i5 = 2;
            if (i == 2) {
                if (user.getFollowStatus() == 0) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                if (C46792ci.m90137a()) {
                    if (i2 != 1) {
                        i5 = 0;
                    } else if (user.isSecret()) {
                        i5 = 4;
                    } else if (user.getFollowerStatus() != 1) {
                        i5 = 1;
                    }
                    AbstractC66614a aVar2 = this.f150362l;
                    if (user.getFollowerStatus() == 1) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    aVar2.mo61442a(i5, i3, null);
                }
                mo63351m().mo123556a(new C63847n.C63848a().mo103320a(user.getUid()).mo103325b(user.getSecUid()).mo103318a(i2).mo103327c(mo70807n()).mo103324b(12).mo103323a());
                if (user.getFollowStatus() == 0) {
                    str = "follow";
                } else {
                    str = "follow_cancel";
                }
                if (user.getFollowerStatus() == 1) {
                    str2 = "mutual";
                } else {
                    str2 = "single";
                }
                C33744d a = new C33744d().mo59983a("enter_from", mo70807n()).mo59983a("rec_type", user.getRecType()).mo59983a("to_user_id", user.getUid()).mo59980a("impr_order", ((C51108g) aQ_()).f117935c).mo59983a("previous_page", m118718s()).mo59983a("req_id", user.getRequestId()).mo59983a("follow_type", str2).mo59980a("is_private", user.isSecret() ? 1 : 0);
                int followStatus = user.getFollowStatus();
                if (followStatus == 0) {
                    i4 = -1;
                } else if (followStatus == 4) {
                    i4 = 0;
                }
                C39162r.m79460a(str, a.mo59980a("cancel_type", i4).f79943a);
                C59256u q = new C59256u().mo96834a(m118717r()).mo96839q(m118718s());
                q.f135350a = C59256u.EnumC59259c.CARD;
                if (user.getFollowStatus() == 0) {
                    aVar = C59256u.EnumC59257a.FOLLOW;
                } else {
                    aVar = C59256u.EnumC59257a.FOLLOW_CANCEL;
                }
                q.f135352b = aVar;
                q.mo96832a(user).mo96841s(user.getRequestId()).mo96838p(m118719t()).mo96842t(m118716q()).mo96792f();
            } else if (i == 3) {
                if (m118714o().mo105599a(((C51108g) aQ_()).f117934b)) {
                    m118715p().mo86785a(new ArrayList());
                }
                C39162r.m79460a("close_recommend_user_cell", new C33744d().mo59983a("enter_from", mo70807n()).mo59983a("rec_type", user.getRecType()).mo59983a("relation_type", user.getFriendTypeStr()).mo59983a("rec_uid", user.getUid()).mo59980a("impr_order", ((C51108g) aQ_()).f117935c).mo59983a("previous_page", m118718s()).mo59983a("req_id", user.getRequestId()).f79943a);
                C59256u q2 = new C59256u().mo96834a(m118717r()).mo96839q(m118718s());
                q2.f135350a = C59256u.EnumC59259c.CARD;
                q2.f135352b = C59256u.EnumC59257a.CLOSE;
                q2.mo96832a(user).mo96841s(user.getRequestId()).mo96838p(m118719t()).mo96842t(m118716q()).mo96792f();
            } else if (i == 5) {
                if (user.isShould_write_impr()) {
                    C61504e.C61505a.f139616a.mo99160a(1, user.getUid());
                }
                C39162r.m79460a("show_recommend_user_cell", new C33744d().mo59983a("enter_from", mo70807n()).mo59983a("rec_type", user.getRecType()).mo59983a("rec_uid", user.getUid()).mo59980a("impr_order", ((C51108g) aQ_()).f117935c).mo59983a("previous_page", m118718s()).mo59983a("relation_type", user.getFriendTypeStr()).mo59983a("req_id", ((C51108g) aQ_()).f117936d).f79943a);
                C59256u q3 = new C59256u().mo96834a(m118717r()).mo96839q(m118718s());
                q3.f135350a = C59256u.EnumC59259c.CARD;
                q3.f135352b = C59256u.EnumC59257a.SHOW;
                q3.mo96832a(user).mo96841s(user.getRequestId()).mo96838p(m118719t()).mo96842t(m118716q()).mo96792f();
            }
        } else {
            View view = this.itemView;
            C89219l.m154716b(view, "");
            Context context = view.getContext();
            if (context != null) {
                SmartRouter.buildRoute(context, "//user/profile").withParam("uid", user.getUid()).withParam("sec_user_id", user.getSecUid()).withParam("extra_mutual_relation", user.getMutualStruct()).withParam("extra_from_mutual", true).withParam("enter_from", mo70807n()).withParam("enter_from_request_id", user.getRequestId()).withParam("recommend_enter_profile_params", new C66623g(m118717r(), m118718s(), C59256u.EnumC59259c.CARD, user.getRecType(), C66623g.C66624a.m118386a(user), user.getUid(), null, null, user.getRequestId(), m118716q(), user.getFriendTypeStr(), null, 2048, null)).open();
            }
            C33744d a2 = new C33744d().mo59983a("enter_from", mo70807n()).mo59983a("rec_type", user.getRecType()).mo59983a("to_user_id", user.getUid()).mo59980a("impr_order", ((C51108g) aQ_()).f117935c).mo59983a("previous_page", m118718s()).mo59983a("req_id", user.getRequestId()).mo59983a("impr_id", user.getUid());
            C89219l.m154716b(a2, "");
            C39162r.m79460a("enter_personal_detail", C80409eu.m139390a(a2, user).f79943a);
            C59256u q4 = new C59256u().mo96834a(m118717r()).mo96839q(m118718s());
            q4.f135350a = C59256u.EnumC59259c.CARD;
            q4.f135352b = C59256u.EnumC59257a.ENTER_PROFILE;
            q4.mo96832a(user).mo96841s(user.getRequestId()).mo96842t(m118716q()).mo96838p(m118719t()).mo96792f();
        }
    }
}
