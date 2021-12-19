package com.p2082ss.android.ugc.aweme.feed.assem.avatar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12793o;
import com.bytedance.assem.arch.extensions.C12794p;
import com.bytedance.assem.arch.extensions.C12795q;
import com.bytedance.assem.arch.extensions.C12796r;
import com.bytedance.assem.arch.p795b.AbstractC12693u;
import com.bytedance.assem.arch.p795b.C12661l;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.C14524g;
import com.bytedance.ext_power_list.C14530k;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17897a;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.C18017a;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.C18026g;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.router.SmartRouter;
import com.bytedance.tiktok.proxy.AbstractC22878f;
import com.bytedance.tiktok.proxy.AbstractC22880h;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.IProfileBadgeService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AnimationImageView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarBorderView;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.discover.hitrank.C42066d;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.feed.EnumC48310af;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48198ba;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.p2082ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultVM;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50339m;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50524a;
import com.p2082ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.login.p3424b.C58956a;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59203a;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59242h;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.metrics.C59252q;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.p2082ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76598h;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.upvote.event.C79900c;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.b */
public final class C48391b implements AbstractC12818f<C48383a> {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f112104a = {new C89232y(C48391b.class, "avatarDefaultVM", "getAvatarDefaultVM()Lcom/ss/android/ugc/aweme/feed/assem/avatar/FeedAvatarDefaultVM;", 0)};

    /* renamed from: b */
    public AnimationImageView f112105b;

    /* renamed from: c */
    ViewGroup f112106c;

    /* renamed from: d */
    SmartAvatarBorderView f112107d;

    /* renamed from: e */
    SmartImageView f112108e;

    /* renamed from: f */
    ImageView f112109f;

    /* renamed from: g */
    RemoteImageView f112110g;

    /* renamed from: h */
    final C48401j f112111h;

    /* renamed from: i */
    public final Context f112112i;

    /* renamed from: j */
    public final C48383a f112113j;

    /* renamed from: k */
    private final AbstractC89244h f112114k;

    /* renamed from: l */
    private final AbstractC89248d f112115l;

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.b$b */
    public static final class C48393b extends AbstractC89220m implements AbstractC89172b<C48415h, C48415h> {
        public static final C48393b INSTANCE = new C48393b();

        static {
            Covode.recordClassIndex(57167);
        }

        public C48393b() {
            super(1);
        }

        public final C48415h invoke(C48415h hVar) {
            C89219l.m154719c(hVar, "");
            return hVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.b$g */
    public static final class C48398g extends AbstractC89220m implements AbstractC89172b<C48198ba, C48198ba> {
        public static final C48398g INSTANCE = new C48398g();

        static {
            Covode.recordClassIndex(57172);
        }

        public C48398g() {
            super(1);
        }

        public final C48198ba invoke(C48198ba baVar) {
            C89219l.m154719c(baVar, "");
            return baVar;
        }
    }

    static {
        Covode.recordClassIndex(57165);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final VideoEventDispatchViewModel mo80513a() {
        return (VideoEventDispatchViewModel) this.f112114k.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j> void mo20508a(AssemViewModel<S> assemViewModel, C12854k<S> kVar, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super C48383a, ? super S, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(mVar, "");
        this.f112113j.mo20508a(assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A> void mo20509a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, C12854k<C12793o<A>> kVar2, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super C48383a, ? super A, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(mVar, "");
        this.f112113j.mo20509a(assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B> void mo20510a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C12854k<C12794p<A, B>> kVar3, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89187q<? super C48383a, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(qVar, "");
        this.f112113j.mo20510a(assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B, C> void mo20511a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C12854k<C12795q<A, B, C>> kVar4, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89188r<? super C48383a, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(rVar, "");
        this.f112113j.mo20511a(assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B, C, D> void mo20512a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C12854k<C12796r<A, B, C, D>> kVar5, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89189s<? super C48383a, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(kVar5, "");
        C89219l.m154721d(sVar, "");
        this.f112113j.mo20512a(assemViewModel, kVar, kVar2, kVar3, kVar4, kVar5, bVar, sVar);
    }

    /* renamed from: b */
    public final FeedAvatarDefaultVM mo80516b() {
        return (FeedAvatarDefaultVM) this.f112115l.mo23374a(this, f112104a[0]);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: b */
    public final <S extends AbstractC12853j, A> void mo20515b(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, C12854k<C12793o<A>> kVar2, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super C48383a, ? super A, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(mVar, "");
        this.f112113j.mo20515b(assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC22878f getActualLifecycleOwnerHolder() {
        return this.f112113j.getActualLifecycleOwnerHolder();
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC22880h<C48383a> getActualReceiverHolder() {
        return this.f112113j.getActualReceiverHolder();
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final boolean getHasSubscribedForReused() {
        return this.f112113j.getHasSubscribedForReused();
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC1204m getHostLifecycleOwner() {
        return this.f112113j.getHostLifecycleOwner();
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final boolean getUniqueOnlyDefault() {
        return this.f112113j.getUniqueOnlyDefault();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.b$c */
    public static final class C48394c extends AbstractC89220m implements AbstractC89171a<C12874b<C48415h>> {
        public static final C48394c INSTANCE = new C48394c();

        static {
            Covode.recordClassIndex(57168);
        }

        public C48394c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48415h> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.b$d */
    public static final class C48395d extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112117a;

        static {
            Covode.recordClassIndex(57169);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48395d(AbstractC12693u uVar) {
            super(0);
            this.f112117a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f112117a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.b$h */
    public static final class C48399h extends AbstractC89220m implements AbstractC89171a<C12874b<C48198ba>> {
        public static final C48399h INSTANCE = new C48399h();

        static {
            Covode.recordClassIndex(57173);
        }

        public C48399h() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48198ba> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.b$i */
    public static final class C48400i extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C48400i INSTANCE = new C48400i();

        static {
            Covode.recordClassIndex(57174);
        }

        public C48400i() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.b$e */
    public static final class C48396e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112118a;

        static {
            Covode.recordClassIndex(57170);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48396e(AbstractC12693u uVar) {
            super(0);
            this.f112118a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f112118a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.b$f */
    public static final class C48397f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112119a;

        static {
            Covode.recordClassIndex(57171);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48397f(AbstractC12693u uVar) {
            super(0);
            this.f112119a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f112119a.bD_().f30985g;
        }
    }

    /* Return type fixed from 'com.bytedance.tiktok.proxy.d' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final /* bridge */ /* synthetic */ C48383a getReceiverForHostVM() {
        return (C48383a) this.f112113j.getReceiverForHostVM();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.b$a */
    public static final class C48392a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f112116a;

        static {
            Covode.recordClassIndex(57166);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48392a(AbstractC89277c cVar) {
            super(0);
            this.f112116a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f112116a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.b$j */
    public static final class C48401j implements IProfileBadgeService.AbstractC31281c {

        /* renamed from: a */
        final /* synthetic */ C48391b f112120a;

        static {
            Covode.recordClassIndex(57175);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C48401j(C48391b bVar) {
            this.f112120a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.IProfileBadgeService.AbstractC31281c
        /* renamed from: a */
        public final void mo56081a(ProfileBadgeStruct profileBadgeStruct) {
            String str;
            Aweme aweme;
            User author;
            Aweme aweme2;
            FeedAvatarDefaultVM b = this.f112120a.mo80516b();
            if (profileBadgeStruct != null) {
                VideoItemParams videoItemParams = (VideoItemParams) b.mo23342g();
                if (videoItemParams == null || (aweme2 = videoItemParams.mAweme) == null) {
                    str = null;
                } else {
                    str = aweme2.getAuthorUid();
                }
                IAccountUserService e = AccountService.m65215a().mo57069e();
                C89219l.m154716b(e, "");
                User curUser = e.getCurUser();
                C89219l.m154716b(curUser, "");
                if (C89219l.m154714a((Object) str, (Object) curUser.getUid())) {
                    VideoItemParams videoItemParams2 = (VideoItemParams) b.mo23342g();
                    if (!(videoItemParams2 == null || (aweme = videoItemParams2.mAweme) == null || (author = aweme.getAuthor()) == null)) {
                        author.setProfileBadgeStruct(profileBadgeStruct);
                    }
                    b.mo20667b(new FeedAvatarDefaultVM.C48381b(b, b.mo80505i()));
                }
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ AnimationImageView m91841a(C48391b bVar) {
        AnimationImageView animationImageView = bVar.f112105b;
        if (animationImageView == null) {
            C89219l.m154710a("followView");
        }
        return animationImageView;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.b$n */
    static final class View$OnClickListenerC48405n implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C48391b f112125a;

        static {
            Covode.recordClassIndex(57179);
        }

        View$OnClickListenerC48405n(C48391b bVar) {
            this.f112125a = bVar;
        }

        public final void onClick(View view) {
            Aweme aweme;
            ClickAgent.onClick(view);
            VideoItemParams videoItemParams = (VideoItemParams) C12661l.m22797a(this.f112125a.f112113j);
            if (videoItemParams != null && (aweme = videoItemParams.mAweme) != null) {
                DataCenter dataCenter = ((VideoItemParams) C12661l.m22797a(this.f112125a.f112113j)).dataCenter;
                if (dataCenter != null) {
                    dataCenter.mo60191a("VIDEO_CANCEL_REPORT_SKIP_BEHAVIOR", aweme.getAid());
                }
                C89219l.m154716b(view, "");
                if (view.getVisibility() != 4 && !C37699a.m76202E(aweme) && !aweme.isDelete() && aweme.getAuthor() != null) {
                    User author = aweme.getAuthor();
                    C89219l.m154716b(author, "");
                    if (author.getFollowStatus() == 0) {
                        IAccountUserService g = C31575b.m65865g();
                        C89219l.m154716b(g, "");
                        if (!C89219l.m154714a((Object) g.getCurUserId(), (Object) aweme.getAuthorUid())) {
                            if (C37699a.m76314s(aweme) && !C37699a.m76222Y(aweme)) {
                                C38000g.m77050a().mo65877a(this.f112125a.f112112i, aweme);
                                C18129a.m33746a("draw_ad", "follow", aweme.getAwemeRawAd()).mo28897a("anchor_id", C50339m.m94440a(aweme)).mo28897a("room_id", C50339m.m94441b(aweme)).mo28902c();
                            }
                            if (C37699a.m76222Y(aweme)) {
                                C38000g.m77050a().mo65880a(this.f112125a.f112112i, aweme, "plus_sign");
                            }
                            C34719f fVar = C34719f.C34720a.f82009a;
                            C89219l.m154716b(fVar, "");
                            if (!fVar.mo61395c()) {
                                new C79459a(this.f112125a.f112112i).mo123050a(R.string.dcq).mo123053a();
                                return;
                            }
                            DataCenter dataCenter2 = ((VideoItemParams) C12661l.m22797a(this.f112125a.f112113j)).dataCenter;
                            if (dataCenter2 != null) {
                                C49672ag agVar = new C49672ag(12, aweme);
                                agVar.f114319e = "feed";
                                dataCenter2.mo60191a("feed_internal_event", agVar);
                            }
                            IAccountUserService g2 = C31575b.m65865g();
                            C89219l.m154716b(g2, "");
                            if (g2.isLogin()) {
                                C42066d.m84193a(aweme.getAuthor(), 5);
                                Context context = this.f112125a.f112112i;
                                Context context2 = this.f112125a.f112112i;
                                User author2 = aweme.getAuthor();
                                C89219l.m154716b(author2, "");
                                C50524a.m94705a(context, context2.getString(R.string.kl, author2.getNickname()), false, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.b$k */
    public static final class View$OnClickListenerC48402k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C48391b f112121a;

        /* renamed from: b */
        final /* synthetic */ VideoItemParams f112122b;

        static {
            Covode.recordClassIndex(57176);
        }

        View$OnClickListenerC48402k(C48391b bVar, VideoItemParams videoItemParams) {
            this.f112121a = bVar;
            this.f112122b = videoItemParams;
        }

        public final void onClick(View view) {
            int i;
            String str;
            boolean z;
            String str2;
            String str3;
            String str4;
            String str5;
            AbstractC17897a c;
            ClickAgent.onClick(view);
            Aweme aweme = this.f112122b.mAweme;
            DataCenter dataCenter = this.f112122b.dataCenter;
            if (!C80580in.m139687c() && !C58956a.m108315a(aweme)) {
                String str6 = "";
                if ((!C89219l.m154714a((Object) this.f112122b.mEventType, (Object) "new_ad_fake_user")) && C37699a.m76202E(aweme)) {
                    C89219l.m154716b(aweme, str6);
                    if (!aweme.isAd()) {
                        return;
                    }
                }
                C89219l.m154716b(aweme, str6);
                if (!aweme.isCanPlay() || aweme.isDelete()) {
                    C79459a aVar = new C79459a(this.f112121a.f112112i);
                    if (aweme.isImage()) {
                        i = R.string.civ;
                    } else {
                        i = R.string.h8k;
                    }
                    aVar.mo123050a(i).mo123053a();
                    return;
                }
                IAdSceneService f = AdSceneServiceImpl.m33210f();
                if (!(f == null || (c = f.mo28466c()) == null)) {
                    c.mo28503a(aweme, this.f112121a.f112112i);
                }
                C59256u a = new C59256u().mo96834a("homepage_hot");
                a.f135350a = C59256u.EnumC59259c.ITEM;
                a.f135352b = C59256u.EnumC59257a.ENTER_PROFILE;
                C59256u a2 = a.mo96749g(aweme).mo96832a(aweme.getAuthor());
                User author = aweme.getAuthor();
                C89219l.m154716b(author, str6);
                a2.mo96841s(author.getRequestId()).mo96835b();
                C49907s.m93686a(EnumC48310af.PROFILE);
                JSONObject jSONObject = this.f112122b.mRequestId;
                if (jSONObject == null || (str = jSONObject.optString("request_id")) == null) {
                    str = aweme.getRequestId();
                }
                aweme.setRequestId(str);
                if (dataCenter != null) {
                    dataCenter.mo60191a("feed_internal_event", new C49672ag(19, aweme));
                }
                if (MSAdaptionService.m97895c().mo89377c(this.f112121a.f112112i)) {
                    SmartRouter.buildRoute(this.f112121a.f112112i, "//duo").withParam("duo_type", "duo_profile").open();
                    return;
                }
                if (dataCenter != null) {
                    dataCenter.mo60191a("to_profile", str6);
                }
                C59252q c2 = new C59252q().mo96823c(aweme, this.f112122b.mPageType);
                String str7 = this.f112122b.mEventType;
                if (str7 == null) {
                    str7 = str6;
                }
                C59252q qVar = (C59252q) c2.mo96825o(str7).mo96740a(this.f112121a.f112112i);
                qVar.f135285Y = FeedParamProvider.C49809a.m93270a(this.f112121a.f112112i).getPreviousPage();
                qVar.f135286Z = FeedParamProvider.C49809a.m93270a(this.f112121a.f112112i).getPreviousPagePosition();
                if (aweme.getBottomBarModel() != null) {
                    z = true;
                } else {
                    z = false;
                }
                qVar.f135287aa = z;
                String str8 = null;
                if (dataCenter != null) {
                    str2 = (String) dataCenter.mo60195b("playlist_type", str6);
                } else {
                    str2 = null;
                }
                qVar.f135317t = str2;
                if (dataCenter != null) {
                    str3 = (String) dataCenter.mo60195b("playlist_id", str6);
                } else {
                    str3 = null;
                }
                qVar.f135319v = str3;
                if (dataCenter != null) {
                    str4 = (String) dataCenter.mo60195b("playlist_id_key", str6);
                } else {
                    str4 = null;
                }
                qVar.f135318u = str4;
                if (dataCenter != null) {
                    str8 = (String) dataCenter.mo60195b("tab_name", str6);
                }
                AbstractC59242h l = ((AbstractC59203a) qVar.mo96801c(str8).mo96802d(C59208ac.m108764b(aweme, this.f112122b.mPageType))).mo96741a("click_head").mo96810l(FeedParamProvider.C49809a.m93270a(this.f112121a.f112112i).getSearchId());
                String searchResultId = FeedParamProvider.C49809a.m93270a(this.f112121a.f112112i).getSearchResultId();
                if (searchResultId == null || searchResultId.length() == 0) {
                    searchResultId = aweme.getAid();
                }
                C59252q qVar2 = (C59252q) l.mo96804f(searchResultId);
                qVar2.f135290ad = FeedParamProvider.C49809a.m93270a(this.f112121a.f112112i).getCategoryName();
                qVar2.f135222V = C76598h.m134176a(aweme.getAuthor());
                if (C76706a.m134281g(aweme)) {
                    str5 = "story";
                } else {
                    str5 = UGCMonitor.TYPE_POST;
                }
                qVar2.f135223W = str5;
                AbstractC59242h b_ = qVar2.mo96752b_(C76706a.m134276b(aweme));
                String str9 = this.f112122b.mEventType;
                if (str9 != null) {
                    str6 = str9;
                }
                C79900c.m138667a(b_, aweme, str6).mo96792f();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010f, code lost:
        if (com.p2082ss.android.ugc.aweme.commercialize.model.C38245n.C38246a.m77604a(r0.getAuthor()) != false) goto L_0x0111;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80514a(com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams r12) {
        /*
        // Method dump skipped, instructions count: 366
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.assem.avatar.C48391b.mo80514a(com.ss.android.ugc.aweme.feed.model.VideoItemParams):void");
    }

    /* renamed from: a */
    public final void mo80515a(String str) {
        int i;
        Aweme aweme;
        SmartImageView smartImageView = this.f112108e;
        if (smartImageView == null) {
            C89219l.m154710a("profileWidgetView");
        }
        if (str == null || str.length() == 0) {
            i = 8;
        } else {
            i = 0;
        }
        smartImageView.setVisibility(i);
        if (str != null && str.length() != 0) {
            C20766v a = C20761r.m39061a(str);
            SmartImageView smartImageView2 = this.f112108e;
            if (smartImageView2 == null) {
                C89219l.m154710a("profileWidgetView");
            }
            a.f49092E = smartImageView2;
            a.mo34186c();
            VideoItemParams videoItemParams = (VideoItemParams) C12661l.m22797a(this.f112113j);
            if (videoItemParams != null && (aweme = videoItemParams.mAweme) != null) {
                C33744d a2 = new C33744d().mo59983a("group_id", aweme.getAid());
                User author = aweme.getAuthor();
                String str2 = "";
                C89219l.m154716b(author, str2);
                C33744d a3 = a2.mo59983a("author_id", author.getSecUid());
                User author2 = aweme.getAuthor();
                C89219l.m154716b(author2, str2);
                ProfileBadgeStruct profileBadge = author2.getProfileBadge();
                Long l = str2;
                if (profileBadge != null) {
                    l = Long.valueOf(profileBadge.getId());
                }
                C39162r.m79460a("profile_badge_show", a3.mo59982a("badge_id", l).mo59983a("enter_from", ((VideoItemParams) C12661l.m22797a(this.f112113j)).mEventType).f79943a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.b$m */
    static final class C48404m extends AbstractC89220m implements AbstractC89183m<C48383a, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C48391b f112124a;

        static {
            Covode.recordClassIndex(57178);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48404m(C48391b bVar) {
            super(2);
            this.f112124a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48383a aVar, String str) {
            C89219l.m154721d(aVar, "");
            this.f112124a.mo80515a(str);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.b$l */
    static final class C48403l extends AbstractC89220m implements AbstractC89183m<C48383a, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C48391b f112123a;

        static {
            Covode.recordClassIndex(57177);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48403l(C48391b bVar) {
            super(2);
            this.f112123a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48383a aVar, Integer num) {
            int intValue = num.intValue();
            C89219l.m154721d(aVar, "");
            C48391b.m91841a(this.f112123a).setVisibility(intValue);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.b$p */
    static final class C48408p extends AbstractC89220m implements AbstractC89183m<C48383a, C18017a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C48391b f112128a;

        static {
            Covode.recordClassIndex(57182);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48408p(C48391b bVar) {
            super(2);
            this.f112128a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48383a aVar, C18017a aVar2) {
            Aweme aweme;
            C48383a aVar3 = aVar;
            C18017a aVar4 = aVar2;
            C89219l.m154721d(aVar3, "");
            VideoItemParams videoItemParams = (VideoItemParams) C12661l.m22797a(aVar3);
            if (videoItemParams != null && (aweme = videoItemParams.mAweme) != null && aVar4 != null && aVar4.f42891a == 3 && C37699a.m76318w(aweme) && !C37699a.m76319x(aweme)) {
                this.f112128a.mo80516b().mo23343h();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.b$q */
    static final class C48409q extends AbstractC89220m implements AbstractC89183m<C48383a, C18026g, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C48391b f112129a;

        static {
            Covode.recordClassIndex(57183);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48409q(C48391b bVar) {
            super(2);
            this.f112129a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48383a aVar, C18026g gVar) {
            Aweme aweme;
            String str;
            C48383a aVar2 = aVar;
            C18026g gVar2 = gVar;
            C89219l.m154721d(aVar2, "");
            VideoItemParams videoItemParams = (VideoItemParams) C12661l.m22797a(aVar2);
            if (!(videoItemParams == null || (aweme = videoItemParams.mAweme) == null)) {
                if (gVar2 != null) {
                    str = gVar2.f42904a;
                } else {
                    str = null;
                }
                if (C89219l.m154714a((Object) str, (Object) aweme.getAid())) {
                    this.f112129a.mo80516b().mo23343h();
                }
            }
            return C89391z.f203057a;
        }
    }

    public C48391b(Context context, C48383a aVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        this.f112112i = context;
        this.f112113j = aVar;
        this.f112114k = new C14524g(C89204ab.m154669a(VideoEventDispatchViewModel.class), aVar, C48399h.INSTANCE, C48400i.INSTANCE, C48398g.INSTANCE);
        AbstractC12848i.C12851c cVar = AbstractC12848i.C12851c.f31277a;
        AbstractC89277c a = C89204ab.m154669a(FeedAvatarDefaultVM.class);
        this.f112115l = C14530k.m26542a(aVar, a, cVar == null ? AbstractC12848i.C12851c.f31277a : cVar, new C48392a(a), C48394c.INSTANCE, new C48395d(aVar), C48393b.INSTANCE, null, null, new C48396e(aVar), new C48397f(aVar));
        this.f112111h = new C48401j(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.b$o */
    static final class C48406o extends AbstractC89220m implements AbstractC89183m<C48383a, FollowStatusEvent, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C48391b f112126a;

        static {
            Covode.recordClassIndex(57180);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48406o(C48391b bVar) {
            super(2);
            this.f112126a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48383a aVar, FollowStatusEvent followStatusEvent) {
            FollowStatus followStatus;
            VideoItemParams videoItemParams;
            Aweme aweme;
            FollowStatusEvent followStatusEvent2 = followStatusEvent;
            C89219l.m154721d(aVar, "");
            if (!(followStatusEvent2 == null || (followStatus = followStatusEvent2.status) == null)) {
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                if (!(!g.isLogin() || (videoItemParams = (VideoItemParams) C12661l.m22797a(this.f112126a.f112113j)) == null || (aweme = videoItemParams.mAweme) == null)) {
                    User author = aweme.getAuthor();
                    C89219l.m154716b(author, "");
                    if (!(!C89219l.m154714a((Object) author.getUid(), (Object) followStatus.userId)) && aweme.isCanPlay()) {
                        User author2 = aweme.getAuthor();
                        C89219l.m154716b(author2, "");
                        author2.setFollowStatus(followStatus.followStatus);
                        C48391b.m91841a(this.f112126a).mo5836d();
                        C48391b.m91841a(this.f112126a).setProgress(0.0f);
                        if (followStatus.followStatus == 0) {
                            this.f112126a.mo80516b().mo23343h();
                        } else {
                            C48391b.m91841a(this.f112126a).mo5826a();
                            C48391b.m91841a(this.f112126a).mo5828a(new AnimatorListenerAdapter(this) {
                                /* class com.p2082ss.android.ugc.aweme.feed.assem.avatar.C48391b.C48406o.C484071 */

                                /* renamed from: a */
                                final /* synthetic */ C48406o f112127a;

                                static {
                                    Covode.recordClassIndex(57181);
                                }

                                /* JADX WARN: Incorrect args count in method signature: ()V */
                                {
                                    this.f112127a = r1;
                                }

                                public final void onAnimationEnd(Animator animator) {
                                    this.f112127a.f112126a.mo80516b().mo23343h();
                                }
                            });
                        }
                    }
                }
            }
            return C89391z.f203057a;
        }
    }
}
