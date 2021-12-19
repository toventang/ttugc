package com.p2082ss.android.ugc.aweme.recommend.users.profile.powerlist;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.follow.widet.C51086a;
import com.p2082ss.android.ugc.aweme.following.p3003ui.view.AbstractC51346a;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.C51700au;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.recommend.AbstractC66614a;
import com.p2082ss.android.ugc.aweme.recommend.C66623g;
import com.p2082ss.android.ugc.aweme.recommend.users.C66652b;
import com.p2082ss.android.ugc.aweme.recommend.users.RecommendUserService;
import com.p2082ss.android.ugc.aweme.recommend.users.RecommendUserServiceImpl;
import com.p2082ss.android.ugc.aweme.recommend.users.profile.p3671ui.C66737f;
import com.p2082ss.android.ugc.aweme.recommend.users.profile.p3671ui.UserProfilePublishListRecommendUserVM;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendUserCell */
public final class RecommendUserCell extends PowerCell<C66694b> {

    /* renamed from: a */
    public AbstractC66614a f149840a;

    /* renamed from: b */
    final AbstractC89244h f149841b;

    /* renamed from: j */
    final AbstractC89244h f149842j;

    /* renamed from: k */
    private final C12814b f149843k;

    /* renamed from: l */
    private final AbstractC89244h f149844l;

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendUserCell$g */
    public static final class C66677g extends AbstractC89220m implements AbstractC89172b<C66737f, C66737f> {
        public static final C66677g INSTANCE = new C66677g();

        static {
            Covode.recordClassIndex(78245);
        }

        public C66677g() {
            super(1);
        }

        public final C66737f invoke(C66737f fVar) {
            C89219l.m154719c(fVar, "");
            return fVar;
        }
    }

    static {
        Covode.recordClassIndex(78238);
    }

    /* renamed from: b */
    private final C51086a m118487b() {
        return (C51086a) this.f149844l.getValue();
    }

    /* renamed from: a */
    public final UserProfilePublishListRecommendUserVM mo105672a() {
        return (UserProfilePublishListRecommendUserVM) this.f149843k.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendUserCell$b */
    public static final class C66672b extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C66672b INSTANCE = new C66672b();

        static {
            Covode.recordClassIndex(78240);
        }

        public C66672b() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendUserCell$c */
    public static final class C66673c extends AbstractC89220m implements AbstractC89171a<C12874b<C66737f>> {
        public static final C66673c INSTANCE = new C66673c();

        static {
            Covode.recordClassIndex(78241);
        }

        public C66673c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C66737f> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendUserCell$h */
    public static final class C66678h extends AbstractC89220m implements AbstractC89171a<C12874b<C66737f>> {
        public static final C66678h INSTANCE = new C66678h();

        static {
            Covode.recordClassIndex(78246);
        }

        public C66678h() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C66737f> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendUserCell$k */
    public static final class C66681k extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C66681k INSTANCE = new C66681k();

        static {
            Covode.recordClassIndex(78249);
        }

        public C66681k() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendUserCell$l */
    public static final class C66682l extends AbstractC89220m implements AbstractC89171a<C12874b<C66737f>> {
        public static final C66682l INSTANCE = new C66682l();

        static {
            Covode.recordClassIndex(78250);
        }

        public C66682l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C66737f> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendUserCell$o */
    static final class C66685o extends AbstractC89220m implements AbstractC89171a<AbstractC51346a> {

        /* renamed from: a */
        final /* synthetic */ RecommendUserCell f149853a;

        static {
            Covode.recordClassIndex(78253);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66685o(RecommendUserCell recommendUserCell) {
            super(0);
            this.f149853a = recommendUserCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC51346a invoke() {
            return RecommendUserCell.m118486a(this.f149853a).getFollowBtn();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendUserCell$q */
    static final class C66688q extends AbstractC89220m implements AbstractC89171a<Context> {

        /* renamed from: a */
        final /* synthetic */ RecommendUserCell f149856a;

        static {
            Covode.recordClassIndex(78256);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66688q(RecommendUserCell recommendUserCell) {
            super(0);
            this.f149856a = recommendUserCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Context invoke() {
            View view = this.f149856a.itemView;
            C89219l.m154716b(view, "");
            return view.getContext();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendUserCell$a */
    public static final class C66671a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f149845a;

        static {
            Covode.recordClassIndex(78239);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66671a(AbstractC89277c cVar) {
            super(0);
            this.f149845a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f149845a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendUserCell$p */
    static final class C66686p extends AbstractC89220m implements AbstractC89171a<C51086a> {

        /* renamed from: a */
        final /* synthetic */ RecommendUserCell f149854a;

        static {
            Covode.recordClassIndex(78254);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66686p(RecommendUserCell recommendUserCell) {
            super(0);
            this.f149854a = recommendUserCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C51086a invoke() {
            return new C51086a((AbstractC51346a) this.f149854a.f149841b.getValue(), new C51086a.C51094g(this) {
                /* class com.p2082ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendUserCell.C66686p.C666871 */

                /* renamed from: a */
                final /* synthetic */ C66686p f149855a;

                static {
                    Covode.recordClassIndex(78255);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f149855a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.C51094g, com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
                /* renamed from: a */
                public final void mo63346a(int i, User user) {
                    C59256u.EnumC59257a aVar;
                    UserProfilePublishListRecommendUserVM a = this.f149855a.f149854a.mo105672a();
                    if (i == 1) {
                        aVar = C59256u.EnumC59257a.FOLLOW;
                    } else {
                        aVar = C59256u.EnumC59257a.FOLLOW_CANCEL;
                    }
                    a.mo105683a(aVar, user);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendUserCell$d */
    public static final class C66674d extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f149846a;

        static {
            Covode.recordClassIndex(78242);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66674d(PowerCell powerCell) {
            super(0);
            this.f149846a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            if (this.f149846a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f149846a.mo28070i();
                if (i != null) {
                    return (AbstractC12748a) i;
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendUserCell$e */
    public static final class C66675e extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f149847a;

        static {
            Covode.recordClassIndex(78243);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66675e(PowerCell powerCell) {
            super(0);
            this.f149847a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            if (this.f149847a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f149847a.mo28070i();
                if (i != null) {
                    return ((AbstractC12748a) i).getViewModelStore();
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendUserCell$f */
    public static final class C66676f extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f149848a;

        static {
            Covode.recordClassIndex(78244);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66676f(PowerCell powerCell) {
            super(0);
            this.f149848a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            if (this.f149848a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f149848a.mo28070i();
                if (i != null) {
                    return ((AbstractC12748a) i).mo20598q();
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendUserCell$i */
    public static final class C66679i extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f149849a;

        static {
            Covode.recordClassIndex(78247);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66679i(PowerCell powerCell) {
            super(0);
            this.f149849a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            View view = this.f149849a.itemView;
            C89219l.m154709a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof ActivityC0945e) {
                View view2 = this.f149849a.itemView;
                C89219l.m154709a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    return (ActivityC0945e) context2;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else if (context instanceof ContextWrapper) {
                View view3 = this.f149849a.itemView;
                C89219l.m154709a((Object) view3, "");
                Context context3 = view3.getContext();
                if (context3 != null) {
                    Context baseContext = ((ContextWrapper) context3).getBaseContext();
                    if (baseContext != null) {
                        return (ActivityC0945e) baseContext;
                    }
                    throw new C89388w("null cannot be cast to non-null type");
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else {
                StringBuilder sb = new StringBuilder("can not convert ");
                View view4 = this.f149849a.itemView;
                C89219l.m154709a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendUserCell$j */
    public static final class C66680j extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f149850a;

        static {
            Covode.recordClassIndex(78248);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66680j(PowerCell powerCell) {
            super(0);
            this.f149850a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e eVar;
            View view = this.f149850a.itemView;
            C89219l.m154709a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof ActivityC0945e) {
                View view2 = this.f149850a.itemView;
                C89219l.m154709a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    eVar = (ActivityC0945e) context2;
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (context instanceof ContextThemeWrapper) {
                View view3 = this.f149850a.itemView;
                C89219l.m154709a((Object) view3, "");
                Context context3 = view3.getContext();
                if (context3 != null) {
                    Context baseContext = ((ContextThemeWrapper) context3).getBaseContext();
                    if (baseContext != null) {
                        eVar = (ActivityC0945e) baseContext;
                    } else {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else {
                StringBuilder sb = new StringBuilder("can not convert ");
                View view4 = this.f149850a.itemView;
                C89219l.m154709a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
            C1182af viewModelStore = eVar.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendUserCell$m */
    public static final class C66683m extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f149851a;

        static {
            Covode.recordClassIndex(78251);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66683m(PowerCell powerCell) {
            super(0);
            this.f149851a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            AbstractC1204m i = this.f149851a.mo28070i();
            if (i instanceof Fragment) {
                AbstractC1204m i2 = this.f149851a.mo28070i();
                if (i2 != null) {
                    return (Fragment) i2;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else if (i instanceof AbstractC12748a) {
                AbstractC1204m i3 = this.f149851a.mo28070i();
                if (i3 != null) {
                    Fragment a = C12777b.m22999a((AbstractC1204m) ((AbstractC12748a) i3));
                    if (a != null) {
                        return a;
                    }
                    throw new IllegalStateException("can not find fragment.");
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else {
                throw new IllegalStateException("can not find fragment.");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendUserCell$n */
    public static final class C66684n extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f149852a;

        static {
            Covode.recordClassIndex(78252);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66684n(PowerCell powerCell) {
            super(0);
            this.f149852a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a;
            C1182af viewModelStore;
            AbstractC1204m i = this.f149852a.mo28070i();
            if (i instanceof Fragment) {
                AbstractC1204m i2 = this.f149852a.mo28070i();
                if (i2 != null) {
                    a = (Fragment) i2;
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (i instanceof AbstractC12748a) {
                AbstractC1204m i3 = this.f149852a.mo28070i();
                if (i3 != null) {
                    a = C12777b.m22999a((AbstractC1204m) ((AbstractC12748a) i3));
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else {
                throw new IllegalStateException("can not find fragment.");
            }
            if (a != null && (viewModelStore = a.getViewModelStore()) != null) {
                return viewModelStore;
            }
            throw new IllegalStateException("can not get viewModelStore due to null fragment.");
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: k */
    public final void mo28072k() {
        AbstractC66614a aVar = this.f149840a;
        if (aVar == null) {
            C89219l.m154710a("recommendView");
        }
        aVar.mo61445a(false);
        AbstractC66614a aVar2 = this.f149840a;
        if (aVar2 == null) {
            C89219l.m154710a("recommendView");
        }
        aVar2.setEventListener(new C66689r(this));
        m118487b().f117878d = new C66690s(this);
        m118487b().f117880f = C66691t.f149859a;
        AbstractC66614a aVar3 = this.f149840a;
        if (aVar3 == null) {
            C89219l.m154710a("recommendView");
        }
        aVar3.getView().addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC66692u(this));
    }

    public RecommendUserCell() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a = C89204ab.m154669a(UserProfilePublishListRecommendUserVM.class);
        C66671a aVar = new C66671a(a);
        C66677g gVar = C66677g.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C66678h.INSTANCE, new C66679i(this), new C66680j(this), C66681k.INSTANCE, gVar);
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C66682l.INSTANCE, new C66683m(this), new C66684n(this), C66672b.INSTANCE, gVar);
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C66673c.INSTANCE, new C66674d(this), new C66675e(this), new C66676f(this), gVar);
        } else {
            throw new IllegalArgumentException("Don't support this VMScope: " + dVar + " there");
        }
        this.f149843k = bVar;
        this.f149841b = C89250i.m154773a((AbstractC89171a) new C66685o(this));
        this.f149844l = C89250i.m154773a((AbstractC89171a) new C66686p(this));
        this.f149842j = C89250i.m154773a((AbstractC89171a) new C66688q(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendUserCell$s */
    public static final class C66690s implements C51086a.AbstractC51091d {

        /* renamed from: a */
        final /* synthetic */ RecommendUserCell f149858a;

        static {
            Covode.recordClassIndex(78258);
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
        /* renamed from: a */
        public final void mo63342a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
        /* renamed from: b */
        public final void mo63344b() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C66690s(RecommendUserCell recommendUserCell) {
            this.f149858a = recommendUserCell;
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
        /* renamed from: a */
        public final void mo63343a(FollowStatus followStatus) {
            if (followStatus != null) {
                RecommendUserCell.m118486a(this.f149858a).mo61442a(followStatus.followStatus, followStatus.followerStatus, null);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendUserCell$u */
    public static final class View$OnAttachStateChangeListenerC66692u implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ RecommendUserCell f149860a;

        static {
            Covode.recordClassIndex(78260);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnAttachStateChangeListenerC66692u(RecommendUserCell recommendUserCell) {
            this.f149860a = recommendUserCell;
        }

        public final void onViewDetachedFromWindow(View view) {
            if (view != null) {
                view.removeOnAttachStateChangeListener(this);
            }
        }

        public final void onViewAttachedToWindow(View view) {
            User user;
            UserProfilePublishListRecommendUserVM a = this.f149860a.mo105672a();
            C59256u.EnumC59257a aVar = C59256u.EnumC59257a.SHOW;
            C66694b bVar = (C66694b) this.f149860a.f42160d;
            if (bVar != null) {
                user = bVar.f149862a;
            } else {
                user = null;
            }
            a.mo105683a(aVar, user);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ AbstractC66614a m118486a(RecommendUserCell recommendUserCell) {
        AbstractC66614a aVar = recommendUserCell.f149840a;
        if (aVar == null) {
            C89219l.m154710a("recommendView");
        }
        return aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendUserCell$t */
    static final class C66691t implements C51086a.AbstractC51092e {

        /* renamed from: a */
        public static final C66691t f149859a = new C66691t();

        static {
            Covode.recordClassIndex(78259);
        }

        C66691t() {
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51092e
        /* renamed from: a */
        public final void mo63345a(FollowStatus followStatus) {
            C89219l.m154716b(followStatus, "");
            if (followStatus.followStatus == 0) {
                C39162r.m79460a("follow_cancel_finish", new C33744d().mo59983a("enter_from", "others_homepage").mo59983a("to_user_id", followStatus.userId).f79943a);
            } else {
                C39162r.m79460a("follow_finish", new C33744d().mo59983a("enter_from", "others_homepage").mo59983a("to_user_id", followStatus.userId).f79943a);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        RecommendUserService b = RecommendUserServiceImpl.m118456b();
        Context context = viewGroup.getContext();
        C89219l.m154716b(context, "");
        AbstractC66614a a = b.mo105667a(context, 2);
        this.f149840a = a;
        if (a == null) {
            C89219l.m154710a("recommendView");
        }
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.View");
        return (View) a;
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendUserCell$r */
    static final class C66689r extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ RecommendUserCell f149857a;

        static {
            Covode.recordClassIndex(78257);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66689r(RecommendUserCell recommendUserCell) {
            super(1);
            this.f149857a = recommendUserCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            String str;
            int intValue = num.intValue();
            C66694b bVar = (C66694b) this.f149857a.f42160d;
            if (bVar != null) {
                if (intValue == C51700au.f119173e) {
                    this.f149857a.mo105672a().mo23336a((AbstractC17641a) bVar);
                    C66652b bVar2 = C66652b.f149825a;
                    String uid = bVar.f149862a.getUid();
                    C89219l.m154716b(uid, "");
                    bVar2.mo105655a(uid, bVar.f149862a.getSecUid());
                    this.f149857a.mo105672a().mo105683a(C59256u.EnumC59257a.CLOSE, bVar.f149862a);
                } else if (intValue == C51700au.f119170b || intValue == C51700au.f119171c) {
                    UserProfilePublishListRecommendUserVM a = this.f149857a.mo105672a();
                    Context context = (Context) this.f149857a.f149842j.getValue();
                    C89219l.m154716b(context, "");
                    User user = bVar.f149862a;
                    C89219l.m154721d(context, "");
                    C89219l.m154721d(user, "");
                    SmartRoute withParam = SmartRouter.buildRoute(context, "aweme://user/profile/").withParam("uid", user.getUid()).withParam("sec_user_id", user.getSecUid()).withParam("extra_previous_page_position", "card_head").withParam("need_track_compare_recommend_reason", 1).withParam("previous_recommend_reason", user.getRecommendReason()).withParam("recommend_from_type", "card").withParam("position", "bottom");
                    C59256u.EnumC59259c cVar = C59256u.EnumC59259c.CARD;
                    String recType = user.getRecType();
                    C59256u.EnumC59258b a2 = C66623g.C66624a.m118386a(user);
                    String uid2 = user.getUid();
                    String str2 = a.f149867n;
                    User user2 = a.f149866m;
                    if (user2 != null) {
                        str = user2.getUid();
                    } else {
                        str = null;
                    }
                    withParam.withParam("recommend_enter_profile_params", new C66623g("others_homepage", null, cVar, recType, a2, uid2, null, null, str2, str, user.getFriendTypeStr(), user.getSocialInfo())).open();
                    this.f149857a.mo105672a().mo105683a(C59256u.EnumC59257a.ENTER_PROFILE, bVar.f149862a);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a, java.util.List] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo28065a(C66694b bVar, List list) {
        C66694b bVar2 = bVar;
        C89219l.m154721d(bVar2, "");
        C89219l.m154721d(list, "");
        User user = bVar2.f149862a;
        AbstractC66614a aVar = this.f149840a;
        if (aVar == null) {
            C89219l.m154710a("recommendView");
        }
        aVar.mo61444a(user);
        m118487b().mo86508a(user);
    }
}
