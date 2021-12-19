package com.p2082ss.android.ugc.aweme.relation.recommend;

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
import com.p2082ss.android.ugc.aweme.follow.widet.C51086a;
import com.p2082ss.android.ugc.aweme.following.p3003ui.view.AbstractC51346a;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.recommend.AbstractC66614a;
import com.p2082ss.android.ugc.aweme.recommend.users.RecommendUserService;
import com.p2082ss.android.ugc.aweme.recommend.users.RecommendUserServiceImpl;
import com.p2082ss.android.ugc.aweme.relation.p3673b.C66870b;
import com.p2082ss.android.ugc.aweme.relation.p3674c.C66895d;
import com.p2082ss.android.ugc.aweme.relation.p3674c.EnumC66892b;
import com.p2082ss.android.ugc.aweme.relation.viewmodel.C67100b;
import com.p2082ss.android.ugc.aweme.relation.viewmodel.RecFriendsListViewModel;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89388w;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.relation.recommend.RecommendFriendCell */
public final class RecommendFriendCell extends PowerCell<C66989j> {

    /* renamed from: a */
    public AbstractC66614a f150203a;

    /* renamed from: b */
    final AbstractC89244h f150204b;

    /* renamed from: j */
    private final C12814b f150205j;

    /* renamed from: k */
    private final AbstractC89244h f150206k;

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.RecommendFriendCell$g */
    public static final class C66916g extends AbstractC89220m implements AbstractC89172b<C67100b, C67100b> {
        public static final C66916g INSTANCE = new C66916g();

        static {
            Covode.recordClassIndex(78493);
        }

        public C66916g() {
            super(1);
        }

        public final C67100b invoke(C67100b bVar) {
            C89219l.m154719c(bVar, "");
            return bVar;
        }
    }

    static {
        Covode.recordClassIndex(78486);
    }

    /* renamed from: b */
    private final C51086a m118665b() {
        return (C51086a) this.f150206k.getValue();
    }

    /* renamed from: a */
    public final RecFriendsListViewModel mo105839a() {
        return (RecFriendsListViewModel) this.f150205j.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.RecommendFriendCell$b */
    public static final class C66911b extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C66911b INSTANCE = new C66911b();

        static {
            Covode.recordClassIndex(78488);
        }

        public C66911b() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.RecommendFriendCell$c */
    public static final class C66912c extends AbstractC89220m implements AbstractC89171a<C12874b<C67100b>> {
        public static final C66912c INSTANCE = new C66912c();

        static {
            Covode.recordClassIndex(78489);
        }

        public C66912c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C67100b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.RecommendFriendCell$h */
    public static final class C66917h extends AbstractC89220m implements AbstractC89171a<C12874b<C67100b>> {
        public static final C66917h INSTANCE = new C66917h();

        static {
            Covode.recordClassIndex(78494);
        }

        public C66917h() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C67100b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.RecommendFriendCell$k */
    public static final class C66920k extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C66920k INSTANCE = new C66920k();

        static {
            Covode.recordClassIndex(78497);
        }

        public C66920k() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.RecommendFriendCell$l */
    public static final class C66921l extends AbstractC89220m implements AbstractC89171a<C12874b<C67100b>> {
        public static final C66921l INSTANCE = new C66921l();

        static {
            Covode.recordClassIndex(78498);
        }

        public C66921l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C67100b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.RecommendFriendCell$o */
    static final class C66924o extends AbstractC89220m implements AbstractC89171a<AbstractC51346a> {

        /* renamed from: a */
        final /* synthetic */ RecommendFriendCell f150215a;

        static {
            Covode.recordClassIndex(78501);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66924o(RecommendFriendCell recommendFriendCell) {
            super(0);
            this.f150215a = recommendFriendCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC51346a invoke() {
            return RecommendFriendCell.m118664a(this.f150215a).getFollowBtn();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: k */
    public final void mo28072k() {
        AbstractC66614a aVar = this.f150203a;
        if (aVar == null) {
            C89219l.m154710a("recommendView");
        }
        aVar.mo61445a(false);
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.RecommendFriendCell$a */
    public static final class C66910a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f150207a;

        static {
            Covode.recordClassIndex(78487);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66910a(AbstractC89277c cVar) {
            super(0);
            this.f150207a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f150207a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.RecommendFriendCell$p */
    static final class C66925p extends AbstractC89220m implements AbstractC89171a<C51086a> {

        /* renamed from: a */
        final /* synthetic */ RecommendFriendCell f150216a;

        static {
            Covode.recordClassIndex(78502);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66925p(RecommendFriendCell recommendFriendCell) {
            super(0);
            this.f150216a = recommendFriendCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C51086a invoke() {
            return new C51086a((AbstractC51346a) this.f150216a.f150204b.getValue(), new C51086a.C51094g(this) {
                /* class com.p2082ss.android.ugc.aweme.relation.recommend.RecommendFriendCell.C66925p.C669261 */

                /* renamed from: a */
                final /* synthetic */ C66925p f150217a;

                static {
                    Covode.recordClassIndex(78503);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f150217a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.C51094g, com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
                /* renamed from: a */
                public final void mo63346a(int i, User user) {
                    C66870b.m118588b(3, EnumC66892b.NEW_VERSION_RECOMMEND.getValue());
                    if (i == 1) {
                        C66895d.m118641a(user, this.f150217a.f150216a.getAdapterPosition() - 1, 3);
                        this.f150217a.f150216a.mo105839a();
                        RecFriendsListViewModel.m118728a(user, C59256u.EnumC59257a.FOLLOW);
                        return;
                    }
                    C66895d.m118643b(user, this.f150217a.f150216a.getAdapterPosition() - 1, 3);
                    this.f150217a.f150216a.mo105839a();
                    RecFriendsListViewModel.m118728a(user, C59256u.EnumC59257a.FOLLOW_CANCEL);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.RecommendFriendCell$d */
    public static final class C66913d extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f150208a;

        static {
            Covode.recordClassIndex(78490);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66913d(PowerCell powerCell) {
            super(0);
            this.f150208a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            if (this.f150208a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f150208a.mo28070i();
                if (i != null) {
                    return (AbstractC12748a) i;
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.RecommendFriendCell$e */
    public static final class C66914e extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f150209a;

        static {
            Covode.recordClassIndex(78491);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66914e(PowerCell powerCell) {
            super(0);
            this.f150209a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            if (this.f150209a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f150209a.mo28070i();
                if (i != null) {
                    return ((AbstractC12748a) i).getViewModelStore();
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.RecommendFriendCell$f */
    public static final class C66915f extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f150210a;

        static {
            Covode.recordClassIndex(78492);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66915f(PowerCell powerCell) {
            super(0);
            this.f150210a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            if (this.f150210a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f150210a.mo28070i();
                if (i != null) {
                    return ((AbstractC12748a) i).mo20598q();
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.RecommendFriendCell$i */
    public static final class C66918i extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f150211a;

        static {
            Covode.recordClassIndex(78495);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66918i(PowerCell powerCell) {
            super(0);
            this.f150211a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            View view = this.f150211a.itemView;
            C89219l.m154709a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof ActivityC0945e) {
                View view2 = this.f150211a.itemView;
                C89219l.m154709a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    return (ActivityC0945e) context2;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else if (context instanceof ContextWrapper) {
                View view3 = this.f150211a.itemView;
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
                View view4 = this.f150211a.itemView;
                C89219l.m154709a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.RecommendFriendCell$j */
    public static final class C66919j extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f150212a;

        static {
            Covode.recordClassIndex(78496);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66919j(PowerCell powerCell) {
            super(0);
            this.f150212a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e eVar;
            View view = this.f150212a.itemView;
            C89219l.m154709a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof ActivityC0945e) {
                View view2 = this.f150212a.itemView;
                C89219l.m154709a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    eVar = (ActivityC0945e) context2;
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (context instanceof ContextThemeWrapper) {
                View view3 = this.f150212a.itemView;
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
                View view4 = this.f150212a.itemView;
                C89219l.m154709a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
            C1182af viewModelStore = eVar.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.RecommendFriendCell$m */
    public static final class C66922m extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f150213a;

        static {
            Covode.recordClassIndex(78499);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66922m(PowerCell powerCell) {
            super(0);
            this.f150213a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            AbstractC1204m i = this.f150213a.mo28070i();
            if (i instanceof Fragment) {
                AbstractC1204m i2 = this.f150213a.mo28070i();
                if (i2 != null) {
                    return (Fragment) i2;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else if (i instanceof AbstractC12748a) {
                AbstractC1204m i3 = this.f150213a.mo28070i();
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

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.RecommendFriendCell$n */
    public static final class C66923n extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f150214a;

        static {
            Covode.recordClassIndex(78500);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66923n(PowerCell powerCell) {
            super(0);
            this.f150214a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a;
            C1182af viewModelStore;
            AbstractC1204m i = this.f150214a.mo28070i();
            if (i instanceof Fragment) {
                AbstractC1204m i2 = this.f150214a.mo28070i();
                if (i2 != null) {
                    a = (Fragment) i2;
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (i instanceof AbstractC12748a) {
                AbstractC1204m i3 = this.f150214a.mo28070i();
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

    public RecommendFriendCell() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a = C89204ab.m154669a(RecFriendsListViewModel.class);
        C66910a aVar = new C66910a(a);
        C66916g gVar = C66916g.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C66917h.INSTANCE, new C66918i(this), new C66919j(this), C66920k.INSTANCE, gVar);
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C66921l.INSTANCE, new C66922m(this), new C66923n(this), C66911b.INSTANCE, gVar);
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C66912c.INSTANCE, new C66913d(this), new C66914e(this), new C66915f(this), gVar);
        } else {
            throw new IllegalArgumentException("Don't support this VMScope: " + dVar + " there");
        }
        this.f150205j = bVar;
        this.f150204b = C89250i.m154773a((AbstractC89171a) new C66924o(this));
        this.f150206k = C89250i.m154773a((AbstractC89171a) new C66925p(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.RecommendFriendCell$r */
    public static final class C66928r implements C51086a.AbstractC51091d {

        /* renamed from: a */
        final /* synthetic */ RecommendFriendCell f150220a;

        /* renamed from: b */
        final /* synthetic */ C66989j f150221b;

        static {
            Covode.recordClassIndex(78505);
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
        /* renamed from: a */
        public final void mo63342a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
        /* renamed from: b */
        public final void mo63344b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
        /* renamed from: a */
        public final void mo63343a(FollowStatus followStatus) {
            if (followStatus != null) {
                RecommendFriendCell.m118664a(this.f150220a).mo61442a(followStatus.followStatus, followStatus.followerStatus, null);
            }
        }

        C66928r(RecommendFriendCell recommendFriendCell, C66989j jVar) {
            this.f150220a = recommendFriendCell;
            this.f150221b = jVar;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ AbstractC66614a m118664a(RecommendFriendCell recommendFriendCell) {
        AbstractC66614a aVar = recommendFriendCell.f150203a;
        if (aVar == null) {
            C89219l.m154710a("recommendView");
        }
        return aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.RecommendFriendCell$s */
    static final class C66929s implements C51086a.AbstractC51092e {

        /* renamed from: a */
        final /* synthetic */ C66989j f150222a;

        static {
            Covode.recordClassIndex(78506);
        }

        C66929s(C66989j jVar) {
            this.f150222a = jVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51092e
        /* renamed from: a */
        public final void mo63345a(FollowStatus followStatus) {
            String uid = this.f150222a.f150297a.getUid();
            C89219l.m154716b(uid, "");
            C66895d.m118640a(3, uid, this.f150222a.f150297a.getFollowStatus());
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        RecommendUserService b = RecommendUserServiceImpl.m118456b();
        Context context = viewGroup.getContext();
        C89219l.m154716b(context, "");
        AbstractC66614a a = b.mo105667a(context, 8);
        this.f150203a = a;
        if (a == null) {
            C89219l.m154710a("recommendView");
        }
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.View");
        return (View) a;
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.RecommendFriendCell$q */
    public static final class View$OnAttachStateChangeListenerC66927q implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ RecommendFriendCell f150218a;

        /* renamed from: b */
        final /* synthetic */ C66989j f150219b;

        static {
            Covode.recordClassIndex(78504);
        }

        public final void onViewDetachedFromWindow(View view) {
        }

        public final void onViewAttachedToWindow(View view) {
            RecFriendsListViewModel a = this.f150218a.mo105839a();
            User user = this.f150219b.f150297a;
            C89219l.m154721d(user, "");
            if (!a.f150386k.contains(user.getUid())) {
                C59256u o = new C59256u().mo96834a("version_update").mo96837o("");
                o.f135350a = C59256u.EnumC59259c.CARD;
                o.f135352b = C59256u.EnumC59257a.SHOW;
                o.mo96832a(user).mo96841s(user.getRequestId()).mo96792f();
                Set<String> set = a.f150386k;
                String uid = user.getUid();
                C89219l.m154716b(uid, "");
                set.add(uid);
            }
        }

        View$OnAttachStateChangeListenerC66927q(RecommendFriendCell recommendFriendCell, C66989j jVar) {
            this.f150218a = recommendFriendCell;
            this.f150219b = jVar;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a, java.util.List] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo28065a(C66989j jVar, List list) {
        C66989j jVar2 = jVar;
        C89219l.m154721d(jVar2, "");
        C89219l.m154721d(list, "");
        AbstractC66614a aVar = this.f150203a;
        if (aVar == null) {
            C89219l.m154710a("recommendView");
        }
        aVar.mo61444a(jVar2.f150297a);
        AbstractC66614a aVar2 = this.f150203a;
        if (aVar2 == null) {
            C89219l.m154710a("recommendView");
        }
        aVar2.getView().addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC66927q(this, jVar2));
        m118665b().mo86508a(jVar2.f150297a);
        m118665b().f117878d = new C66928r(this, jVar2);
        m118665b().f117880f = new C66929s(jVar2);
    }
}
