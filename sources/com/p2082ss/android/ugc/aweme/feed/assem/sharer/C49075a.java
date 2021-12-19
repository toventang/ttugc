package com.p2082ss.android.ugc.aweme.feed.assem.sharer;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.TranslateAnimation;
import android.widget.RelativeLayout;
import androidx.lifecycle.C1175ad;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.p795b.AbstractC12693u;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.C14524g;
import com.bytedance.ext_power_list.C14530k;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.challenge.p2448d.C35503c;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48198ba;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48200bc;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a;
import com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.p2082ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationVM;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.ExposeSharer;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51754w;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.login.p3424b.C58956a;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80222ap;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4615g.C89241a;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.sharer.a */
public final class C49075a extends AbstractC48491a<C49075a> {

    /* renamed from: u */
    static final /* synthetic */ AbstractC89286i[] f113019u = {new C89232y(C49075a.class, "sharerInfoVM", "getSharerInfoVM()Lcom/ss/android/ugc/aweme/feed/assem/sharer/VideoExposeSharerInformationVM;", 0)};

    /* renamed from: v */
    public static final C49088m f113020v = new C49088m((byte) 0);

    /* renamed from: w */
    private final AbstractC89248d f113021w;

    /* renamed from: x */
    private final AbstractC89244h f113022x;

    /* renamed from: y */
    private final AbstractC89244h f113023y;

    /* renamed from: z */
    private SparseArray f113024z;

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.sharer.a$b */
    public static final class C49077b extends AbstractC89220m implements AbstractC89172b<C49109j, C49109j> {
        public static final C49077b INSTANCE = new C49077b();

        static {
            Covode.recordClassIndex(57869);
        }

        public C49077b() {
            super(1);
        }

        public final C49109j invoke(C49109j jVar) {
            C89219l.m154719c(jVar, "");
            return jVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.sharer.a$g */
    public static final class C49082g extends AbstractC89220m implements AbstractC89172b<C48200bc, C48200bc> {
        public static final C49082g INSTANCE = new C49082g();

        static {
            Covode.recordClassIndex(57874);
        }

        public C49082g() {
            super(1);
        }

        public final C48200bc invoke(C48200bc bcVar) {
            C89219l.m154719c(bcVar, "");
            return bcVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.sharer.a$j */
    public static final class C49085j extends AbstractC89220m implements AbstractC89172b<C48198ba, C48198ba> {
        public static final C49085j INSTANCE = new C49085j();

        static {
            Covode.recordClassIndex(57877);
        }

        public C49085j() {
            super(1);
        }

        public final C48198ba invoke(C48198ba baVar) {
            C89219l.m154719c(baVar, "");
            return baVar;
        }
    }

    static {
        Covode.recordClassIndex(57867);
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12711w
    /* renamed from: D */
    public final int mo20547D() {
        return R.layout.ais;
    }

    /* renamed from: G */
    public final VideoExposeSharerInformationVM mo80814G() {
        return (VideoExposeSharerInformationVM) this.f113021w.mo23374a(this, f113019u[0]);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a
    /* renamed from: H */
    public final View mo80494H() {
        if (this.f113024z == null) {
            this.f113024z = new SparseArray();
        }
        View view = (View) this.f113024z.get(R.id.dii);
        if (view != null) {
            return view;
        }
        View t = mo20528t();
        if (t == null) {
            return null;
        }
        View findViewById = t.findViewById(R.id.dii);
        this.f113024z.put(R.id.dii, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.sharer.a$m */
    public static final class C49088m {
        static {
            Covode.recordClassIndex(57880);
        }

        private C49088m() {
        }

        public /* synthetic */ C49088m(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.sharer.a$c */
    public static final class C49078c extends AbstractC89220m implements AbstractC89171a<C12874b<C49109j>> {
        public static final C49078c INSTANCE = new C49078c();

        static {
            Covode.recordClassIndex(57870);
        }

        public C49078c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C49109j> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.sharer.a$d */
    public static final class C49079d extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f113026a;

        static {
            Covode.recordClassIndex(57871);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C49079d(AbstractC12693u uVar) {
            super(0);
            this.f113026a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f113026a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.sharer.a$h */
    public static final class C49083h extends AbstractC89220m implements AbstractC89171a<C12874b<C48200bc>> {
        public static final C49083h INSTANCE = new C49083h();

        static {
            Covode.recordClassIndex(57875);
        }

        public C49083h() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48200bc> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.sharer.a$i */
    public static final class C49084i extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C49084i INSTANCE = new C49084i();

        static {
            Covode.recordClassIndex(57876);
        }

        public C49084i() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.sharer.a$k */
    public static final class C49086k extends AbstractC89220m implements AbstractC89171a<C12874b<C48198ba>> {
        public static final C49086k INSTANCE = new C49086k();

        static {
            Covode.recordClassIndex(57878);
        }

        public C49086k() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48198ba> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.sharer.a$l */
    public static final class C49087l extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C49087l INSTANCE = new C49087l();

        static {
            Covode.recordClassIndex(57879);
        }

        public C49087l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.sharer.a$e */
    public static final class C49080e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f113027a;

        static {
            Covode.recordClassIndex(57872);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C49080e(AbstractC12693u uVar) {
            super(0);
            this.f113027a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f113027a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.sharer.a$f */
    public static final class C49081f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f113028a;

        static {
            Covode.recordClassIndex(57873);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C49081f(AbstractC12693u uVar) {
            super(0);
            this.f113028a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f113028a.bD_().f30985g;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a, com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public final void mo20466a() {
        super.mo20466a();
        mo80814G().mo80809a((Context) null);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.sharer.a$a */
    public static final class C49076a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f113025a;

        static {
            Covode.recordClassIndex(57868);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C49076a(AbstractC89277c cVar) {
            super(0);
            this.f113025a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f113025a).getName();
        }
    }

    public C49075a() {
        AbstractC12848i.C12851c cVar = AbstractC12848i.C12851c.f31277a;
        AbstractC89277c a = C89204ab.m154669a(VideoExposeSharerInformationVM.class);
        this.f113021w = C14530k.m26542a(this, a, cVar == null ? AbstractC12848i.C12851c.f31277a : cVar, new C49076a(a), C49078c.INSTANCE, new C49079d(this), C49077b.INSTANCE, null, null, new C49080e(this), new C49081f(this));
        this.f113022x = new C14524g(C89204ab.m154669a(VideoPlayViewModel.class), this, C49083h.INSTANCE, C49084i.INSTANCE, C49082g.INSTANCE);
        this.f113023y = new C14524g(C89204ab.m154669a(VideoEventDispatchViewModel.class), this, C49086k.INSTANCE, C49087l.INSTANCE, C49085j.INSTANCE);
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: y */
    public final void mo20533y() {
        VideoExposeSharerInformationVM G;
        super.mo20533y();
        AbstractC12818f.C12819a.m23063a(this, mo80814G(), C49101b.f113043a, (C12854k) null, C49090o.f113030a, 6);
        mo20510a(G, C49103d.f113045a, C49104e.f113046a, C12856l.m23102a(mo80814G().f31149c), null, C49091p.f113031a);
        AbstractC12818f.C12819a.m23063a(this, mo80814G(), C49105f.f113047a, (C12854k) null, C49092q.f113032a, 6);
        AbstractC12818f.C12819a.m23063a(this, mo80814G(), C49106g.f113048a, C12856l.m23104c(), C49093r.f113033a, 4);
        AbstractC12818f.C12819a.m23063a(this, mo80814G(), C49102c.f113044a, C12856l.m23104c(), C49089n.f113029a, 4);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a, com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: b */
    public final /* synthetic */ void mo20469b(VideoItemParams videoItemParams) {
        mo20469b(videoItemParams);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a
    /* renamed from: a */
    public final void mo80495a(VideoItemParams videoItemParams) {
        C89219l.m154721d(videoItemParams, "");
        super.mo20469b(videoItemParams);
        mo80814G().mo80809a(az_());
    }

    /* renamed from: a */
    public final void mo80815a(int i) {
        TuxTextView tuxTextView = (TuxTextView) mo20546C().findViewById(R.id.f3u);
        C89219l.m154716b(tuxTextView, "");
        ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginEnd(i);
        TuxTextView tuxTextView2 = (TuxTextView) mo20546C().findViewById(R.id.f3u);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setLayoutParams(marginLayoutParams);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public final /* synthetic */ void mo20467a(VideoItemParams videoItemParams) {
        ExposeSharer exposeSharer;
        VideoItemParams videoItemParams2 = videoItemParams;
        C89219l.m154721d(videoItemParams2, "");
        Aweme aweme = videoItemParams2.mAweme;
        if (aweme == null || (exposeSharer = aweme.getExposeSharer()) == null || !exposeSharer.isShowed()) {
            mo20546C().setVisibility(8);
        } else {
            mo20546C().setVisibility(0);
        }
        mo80814G().mo80811a(false);
        VideoExposeSharerInformationVM G = mo80814G();
        if (G.f113008l == null) {
            G.f113008l = C51648a.f118980a.mo87329i();
            AbstractC51754w wVar = G.f113008l;
            if (wVar == null) {
                C89219l.m154715b();
            }
            wVar.mo87468a(G);
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: c */
    public final void mo20517c(View view) {
        C89219l.m154721d(view, "");
        ((RelativeLayout) view.findViewById(R.id.ewb)).setOnClickListener(new View$OnClickListenerC49096s(this));
        ((RelativeLayout) mo20546C().findViewById(R.id.ay0)).setOnClickListener(new View$OnClickListenerC49097t(this));
        AbstractC12818f.C12819a.m23063a(this, (VideoPlayViewModel) this.f113022x.getValue(), C49107h.f113049a, (C12854k) null, C49098u.f113040a, 6);
        AbstractC12818f.C12819a.m23063a(this, (VideoEventDispatchViewModel) this.f113023y.getValue(), C49108i.f113050a, (C12854k) null, C49100v.f113042a, 6);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.sharer.a$s */
    static final class View$OnClickListenerC49096s implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C49075a f113038a;

        static {
            Covode.recordClassIndex(57888);
        }

        View$OnClickListenerC49096s(C49075a aVar) {
            this.f113038a = aVar;
        }

        public final void onClick(View view) {
            Aweme aweme;
            ClickAgent.onClick(view);
            VideoExposeSharerInformationVM G = this.f113038a.mo80814G();
            VideoItemParams videoItemParams = (VideoItemParams) G.mo23342g();
            if (videoItemParams != null && (aweme = videoItemParams.mAweme) != null && aweme.getExposeSharer() != null && !aweme.isDelete()) {
                String uid = aweme.getExposeSharer().getUid();
                IAccountUserService g = C31575b.m65865g();
                String str = "";
                C89219l.m154716b(g, str);
                if (!TextUtils.equals(uid, g.getCurUserId())) {
                    if (C37699a.m76314s(aweme) && !C37699a.m76222Y(aweme)) {
                        C38000g.m77050a().mo65877a(G.mo23343h(), aweme);
                        C18129a.m33746a("draw_ad", "follow", aweme.getAwemeRawAd()).mo28902c();
                    }
                    if (C37699a.m76255aa(aweme) || C37699a.m76222Y(aweme)) {
                        C38000g.m77050a().mo65880a(G.mo23343h(), aweme, "plus_sign");
                    }
                    C34719f fVar = C34719f.C34720a.f82009a;
                    C89219l.m154716b(fVar, str);
                    if (!fVar.mo61395c()) {
                        new C79459a(G.mo23343h()).mo123050a(R.string.dcq).mo123053a();
                        return;
                    }
                    IAccountUserService g2 = C31575b.m65865g();
                    C89219l.m154716b(g2, str);
                    if (!g2.isLogin()) {
                        Activity activity = (Activity) G.mo23343h();
                        String str2 = G.f112231p;
                        if (str2 != null) {
                            str = str2;
                        }
                        C58957c.m108320a(activity, str, "click_follow", new C80222ap().mo123649a("group_id", aweme.getAid()).mo123649a("log_pb", C59208ac.m108768c(aweme.getAid())).f179700a, new VideoExposeSharerInformationVM.C49068a(aweme, G));
                        return;
                    }
                    String str3 = G.f112231p;
                    if (str3 != null) {
                        str = str3;
                    }
                    G.mo80810a(aweme, str, true);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.sharer.a$t */
    static final class View$OnClickListenerC49097t implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C49075a f113039a;

        static {
            Covode.recordClassIndex(57889);
        }

        View$OnClickListenerC49097t(C49075a aVar) {
            this.f113039a = aVar;
        }

        public final void onClick(View view) {
            Aweme aweme;
            String str;
            ClickAgent.onClick(view);
            VideoExposeSharerInformationVM G = this.f113039a.mo80814G();
            VideoItemParams videoItemParams = (VideoItemParams) G.mo23342g();
            if (videoItemParams != null && (aweme = videoItemParams.mAweme) != null && aweme.getExposeSharer() != null && aweme.getExposeSharer().getUid() != null && !C80580in.m139687c() && !C58956a.m108315a(aweme)) {
                if (aweme.isCanPlay() && !aweme.isDelete()) {
                    C33744d a = new C33744d().mo59983a("enter_from", "share_user_info_card");
                    if (((FeedBaseViewModel) G).f112230o == 0) {
                        str = "homepage_hot";
                    } else {
                        str = "server_push";
                    }
                    C39162r.m79460a("enter_personal_detail", a.mo59983a("previous_page", str).mo59983a("group_id", aweme.getAid()).mo59983a("author_id", aweme.getAuthorUid()).mo59983a("to_user_id", aweme.getExposeSharer().getUid()).f79943a);
                    SmartRouter.buildRoute(G.mo23343h(), "aweme://user/profile/").withParam("uid", aweme.getExposeSharer().getUid()).withParam("sec_user_id", aweme.getExposeSharer().getSecUid()).withParam("extra_from_pre_page", "share_user_info_card").withParam("enter_from", "others_homepage").open();
                } else if (aweme.isImage()) {
                    new C79459a(G.mo23343h()).mo123050a(R.string.civ).mo123053a();
                } else {
                    new C79459a(G.mo23343h()).mo123050a(R.string.h8k).mo123053a();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.sharer.a$o */
    static final class C49090o extends AbstractC89220m implements AbstractC89183m<C49075a, String, C89391z> {

        /* renamed from: a */
        public static final C49090o f113030a = new C49090o();

        static {
            Covode.recordClassIndex(57882);
        }

        C49090o() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C49075a aVar, String str) {
            C49075a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            TuxTextView tuxTextView = (TuxTextView) aVar2.mo20546C().findViewById(R.id.f3u);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setText(str);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.sharer.a$q */
    static final class C49092q extends AbstractC89220m implements AbstractC89183m<C49075a, Integer, C89391z> {

        /* renamed from: a */
        public static final C49092q f113032a = new C49092q();

        static {
            Covode.recordClassIndex(57884);
        }

        C49092q() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C49075a aVar, Integer num) {
            C49075a aVar2 = aVar;
            int intValue = num.intValue();
            C89219l.m154721d(aVar2, "");
            ((TuxTextView) aVar2.mo20546C().findViewById(R.id.b6h)).setText(intValue);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.sharer.a$n */
    static final class C49089n extends AbstractC89220m implements AbstractC89183m<C49075a, C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        public static final C49089n f113029a = new C49089n();

        static {
            Covode.recordClassIndex(57881);
        }

        C49089n() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C49075a aVar, C12776a<? extends Boolean> aVar2) {
            C49075a aVar3 = aVar;
            C89219l.m154721d(aVar3, "");
            RelativeLayout relativeLayout = (RelativeLayout) aVar3.mo20546C().findViewById(R.id.ewb);
            C89219l.m154716b(relativeLayout, "");
            relativeLayout.setVisibility(0);
            RelativeLayout relativeLayout2 = (RelativeLayout) aVar3.mo20546C().findViewById(R.id.ewb);
            C89219l.m154716b(relativeLayout2, "");
            relativeLayout2.setAlpha(1.0f);
            TuxIconView tuxIconView = (TuxIconView) aVar3.mo20546C().findViewById(R.id.cpb);
            C89219l.m154716b(tuxIconView, "");
            tuxIconView.setAlpha(0.0f);
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            aVar3.mo80815a(C89241a.m154730a(TypedValue.applyDimension(1, 92.0f, system.getDisplayMetrics())));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.sharer.a$u */
    static final class C49098u extends AbstractC89220m implements AbstractC89183m<C49075a, Double, C89391z> {

        /* renamed from: a */
        public static final C49098u f113040a = new C49098u();

        static {
            Covode.recordClassIndex(57890);
        }

        C49098u() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C49075a aVar, Double d) {
            Aweme aweme;
            ExposeSharer exposeSharer;
            Aweme aweme2;
            ExposeSharer exposeSharer2;
            final C49075a aVar2 = aVar;
            Double d2 = d;
            C89219l.m154721d(aVar2, "");
            VideoItemParams videoItemParams = (VideoItemParams) aVar2.mo80814G().mo23342g();
            if (!(videoItemParams == null || (aweme = videoItemParams.mAweme) == null || (exposeSharer = aweme.getExposeSharer()) == null || exposeSharer.isShowed() || d2 == null || d2.doubleValue() < 1.0d)) {
                aVar2.mo20546C().post(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.feed.assem.sharer.C49075a.C49098u.RunnableC490991 */

                    static {
                        Covode.recordClassIndex(57891);
                    }

                    public final void run() {
                        Aweme aweme;
                        String str;
                        C49075a aVar = aVar2;
                        int i = 0;
                        aVar.mo20546C().setVisibility(0);
                        aVar.mo20546C().measure(View.MeasureSpec.makeMeasureSpec(536870912, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(536870912, Integer.MIN_VALUE));
                        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) aVar.mo20546C().getMeasuredHeight(), 0.0f);
                        translateAnimation.setDuration(250);
                        translateAnimation.setFillAfter(true);
                        ViewParent parent = aVar.mo20528t().getParent();
                        Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
                        View view = (View) parent;
                        if (view != null) {
                            view.startAnimation(translateAnimation);
                        }
                        VideoExposeSharerInformationVM G = aVar.mo80814G();
                        if (aVar.mo20546C().findViewById(R.id.ewb) != null) {
                            RelativeLayout relativeLayout = (RelativeLayout) aVar.mo20546C().findViewById(R.id.ewb);
                            C89219l.m154716b(relativeLayout, "");
                            if (relativeLayout.getVisibility() == 0) {
                                i = 1;
                            }
                        }
                        VideoItemParams videoItemParams = (VideoItemParams) G.mo23342g();
                        if (videoItemParams != null && (aweme = videoItemParams.mAweme) != null) {
                            C33744d dVar = new C33744d();
                            if (((FeedBaseViewModel) G).f112230o == 0) {
                                str = "homepage_hot";
                            } else {
                                str = "server_push";
                            }
                            C39162r.m79460a("show_share_user_info", dVar.mo59983a("enter_from", str).mo59983a("group_id", aweme.getAid()).mo59983a("author_id", aweme.getAuthorUid()).mo59983a("from_user_id", aweme.getExposeSharer().getUid()).mo59980a("with_follow_button", i).f79943a);
                        }
                    }
                });
                VideoItemParams videoItemParams2 = (VideoItemParams) aVar2.mo80814G().mo23342g();
                if (!(videoItemParams2 == null || (aweme2 = videoItemParams2.mAweme) == null || (exposeSharer2 = aweme2.getExposeSharer()) == null)) {
                    exposeSharer2.setShowed(true);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.sharer.a$v */
    static final class C49100v extends AbstractC89220m implements AbstractC89183m<C49075a, C35503c, C89391z> {

        /* renamed from: a */
        public static final C49100v f113042a = new C49100v();

        static {
            Covode.recordClassIndex(57892);
        }

        C49100v() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
            if (r0 == null) goto L_0x0047;
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(com.p2082ss.android.ugc.aweme.feed.assem.sharer.C49075a r5, com.p2082ss.android.ugc.aweme.challenge.p2448d.C35503c r6) {
            /*
            // Method dump skipped, instructions count: 122
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.assem.sharer.C49075a.C49100v.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.sharer.a$r */
    static final class C49093r extends AbstractC89220m implements AbstractC89183m<C49075a, C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        public static final C49093r f113033a = new C49093r();

        static {
            Covode.recordClassIndex(57885);
        }

        C49093r() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C49075a aVar, C12776a<? extends Boolean> aVar2) {
            T t;
            final C49075a aVar3 = aVar;
            C12776a<? extends Boolean> aVar4 = aVar2;
            C89219l.m154721d(aVar3, "");
            if (!(aVar4 == null || (t = aVar4.f31085a) == null)) {
                boolean booleanValue = t.booleanValue();
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                final int a = C89241a.m154730a(TypedValue.applyDimension(1, 30.0f, system.getDisplayMetrics()));
                if (booleanValue) {
                    final ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aVar3.mo20546C().findViewById(R.id.cpb), "alpha", 0.0f, 1.0f);
                    C89219l.m154716b(ofFloat, "");
                    ofFloat.setDuration(150L);
                    ofFloat.setRepeatCount(0);
                    ofFloat.addListener(new AnimatorListenerAdapter() {
                        /* class com.p2082ss.android.ugc.aweme.feed.assem.sharer.C49075a.C49093r.C490941 */

                        static {
                            Covode.recordClassIndex(57886);
                        }

                        public final void onAnimationStart(Animator animator) {
                            C89219l.m154721d(animator, "");
                        }

                        public final void onAnimationEnd(Animator animator) {
                            C89219l.m154721d(animator, "");
                            TuxIconView tuxIconView = (TuxIconView) aVar3.mo20546C().findViewById(R.id.cpb);
                            C89219l.m154716b(tuxIconView, "");
                            tuxIconView.setAlpha(1.0f);
                        }
                    });
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(aVar3.mo20546C().findViewById(R.id.ewb), "alpha", 1.0f, 0.0f);
                    C89219l.m154716b(ofFloat2, "");
                    ofFloat2.setDuration(150L);
                    ofFloat2.addListener(new AnimatorListenerAdapter() {
                        /* class com.p2082ss.android.ugc.aweme.feed.assem.sharer.C49075a.C49093r.C490952 */

                        static {
                            Covode.recordClassIndex(57887);
                        }

                        public final void onAnimationStart(Animator animator) {
                            C89219l.m154721d(animator, "");
                            RelativeLayout relativeLayout = (RelativeLayout) aVar3.mo20546C().findViewById(R.id.ewb);
                            C89219l.m154716b(relativeLayout, "");
                            relativeLayout.setVisibility(0);
                        }

                        public final void onAnimationEnd(Animator animator) {
                            C89219l.m154721d(animator, "");
                            RelativeLayout relativeLayout = (RelativeLayout) aVar3.mo20546C().findViewById(R.id.ewb);
                            C89219l.m154716b(relativeLayout, "");
                            relativeLayout.setVisibility(8);
                            RelativeLayout relativeLayout2 = (RelativeLayout) aVar3.mo20546C().findViewById(R.id.ewb);
                            C89219l.m154716b(relativeLayout2, "");
                            relativeLayout2.setAlpha(1.0f);
                            aVar3.mo80815a(a);
                            ofFloat.start();
                        }
                    });
                    ofFloat2.start();
                } else {
                    RelativeLayout relativeLayout = (RelativeLayout) aVar3.mo20546C().findViewById(R.id.ewb);
                    C89219l.m154716b(relativeLayout, "");
                    relativeLayout.setVisibility(8);
                    TuxIconView tuxIconView = (TuxIconView) aVar3.mo20546C().findViewById(R.id.cpb);
                    C89219l.m154716b(tuxIconView, "");
                    tuxIconView.setAlpha(1.0f);
                    aVar3.mo80815a(a);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.sharer.a$p */
    static final class C49091p extends AbstractC89220m implements AbstractC89187q<C49075a, String, UrlModel, C89391z> {

        /* renamed from: a */
        public static final C49091p f113031a = new C49091p();

        static {
            Covode.recordClassIndex(57883);
        }

        C49091p() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(C49075a aVar, String str, UrlModel urlModel) {
            C49075a aVar2 = aVar;
            String str2 = str;
            C89219l.m154721d(aVar2, "");
            C89219l.m154721d(str2, "");
            C20766v a = C20761r.m39060a(C34735v.m70965a(urlModel));
            C89219l.m154716b(a, "");
            C20766v a2 = a.mo34179a(str2);
            a2.f49098K = true;
            a2.f49092E = (SmartImageView) aVar2.mo20546C().findViewById(R.id.dzc);
            a2.mo34186c();
            return C89391z.f203057a;
        }
    }
}
