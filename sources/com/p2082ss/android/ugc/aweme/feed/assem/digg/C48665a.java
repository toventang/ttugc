package com.p2082ss.android.ugc.aweme.feed.assem.digg;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48198ba;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48200bc;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48244cj;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a;
import com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.p2082ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.p2082ss.android.ugc.aweme.feed.helper.C49645l;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49690r;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50524a;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50553s;
import com.p2082ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.p2082ss.android.ugc.aweme.feed.widget.DiggAnimationView;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.launcher.service.mob.C58081a;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.metrics.C59263y;
import com.p2082ss.android.ugc.aweme.p2335aq.p2336a.C33918a;
import com.p2082ss.android.ugc.aweme.p2483co.C36150d;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56216k;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80632w;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.a */
public final class C48665a extends AbstractC48491a<C48665a> {

    /* renamed from: u */
    static final /* synthetic */ AbstractC89286i[] f112518u = {new C89232y(C48665a.class, "diggVM", "getDiggVM()Lcom/ss/android/ugc/aweme/feed/assem/digg/VideoDiggVM;", 0)};

    /* renamed from: w */
    public static final C48681p f112519w = new C48681p((byte) 0);

    /* renamed from: A */
    private final AbstractC89244h f112520A;

    /* renamed from: B */
    private C36150d f112521B;

    /* renamed from: C */
    private final View$OnClickListenerC48682q f112522C;

    /* renamed from: D */
    private SparseArray f112523D;

    /* renamed from: v */
    public Drawable f112524v;

    /* renamed from: x */
    private final AbstractC89248d f112525x;

    /* renamed from: y */
    private final AbstractC89244h f112526y;

    /* renamed from: z */
    private final AbstractC89244h f112527z;

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.a$b */
    public static final class C48667b extends AbstractC89220m implements AbstractC89172b<C48701k, C48701k> {
        public static final C48667b INSTANCE = new C48667b();

        static {
            Covode.recordClassIndex(57447);
        }

        public C48667b() {
            super(1);
        }

        public final C48701k invoke(C48701k kVar) {
            C89219l.m154719c(kVar, "");
            return kVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.a$g */
    public static final class C48672g extends AbstractC89220m implements AbstractC89172b<C48244cj, C48244cj> {
        public static final C48672g INSTANCE = new C48672g();

        static {
            Covode.recordClassIndex(57452);
        }

        public C48672g() {
            super(1);
        }

        public final C48244cj invoke(C48244cj cjVar) {
            C89219l.m154719c(cjVar, "");
            return cjVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.a$j */
    public static final class C48675j extends AbstractC89220m implements AbstractC89172b<C48200bc, C48200bc> {
        public static final C48675j INSTANCE = new C48675j();

        static {
            Covode.recordClassIndex(57455);
        }

        public C48675j() {
            super(1);
        }

        public final C48200bc invoke(C48200bc bcVar) {
            C89219l.m154719c(bcVar, "");
            return bcVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.a$m */
    public static final class C48678m extends AbstractC89220m implements AbstractC89172b<C48198ba, C48198ba> {
        public static final C48678m INSTANCE = new C48678m();

        static {
            Covode.recordClassIndex(57458);
        }

        public C48678m() {
            super(1);
        }

        public final C48198ba invoke(C48198ba baVar) {
            C89219l.m154719c(baVar, "");
            return baVar;
        }
    }

    static {
        Covode.recordClassIndex(57445);
    }

    /* renamed from: I */
    private final VideoViewModel m92014I() {
        return (VideoViewModel) this.f112526y.getValue();
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12711w
    /* renamed from: D */
    public final int mo20547D() {
        return R.layout.t1;
    }

    /* renamed from: G */
    public final VideoDiggVM mo80645G() {
        return (VideoDiggVM) this.f112525x.mo23374a(this, f112518u[0]);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a
    /* renamed from: H */
    public final View mo80494H() {
        if (this.f112523D == null) {
            this.f112523D = new SparseArray();
        }
        View view = (View) this.f112523D.get(R.id.dii);
        if (view != null) {
            return view;
        }
        View t = mo20528t();
        if (t == null) {
            return null;
        }
        View findViewById = t.findViewById(R.id.dii);
        this.f112523D.put(R.id.dii, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.a$p */
    public static final class C48681p {
        static {
            Covode.recordClassIndex(57461);
        }

        private C48681p() {
        }

        public /* synthetic */ C48681p(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.a$c */
    public static final class C48668c extends AbstractC89220m implements AbstractC89171a<C12874b<C48701k>> {
        public static final C48668c INSTANCE = new C48668c();

        static {
            Covode.recordClassIndex(57448);
        }

        public C48668c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48701k> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.a$d */
    public static final class C48669d extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112529a;

        static {
            Covode.recordClassIndex(57449);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48669d(AbstractC12693u uVar) {
            super(0);
            this.f112529a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f112529a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.a$h */
    public static final class C48673h extends AbstractC89220m implements AbstractC89171a<C12874b<C48244cj>> {
        public static final C48673h INSTANCE = new C48673h();

        static {
            Covode.recordClassIndex(57453);
        }

        public C48673h() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48244cj> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.a$i */
    public static final class C48674i extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C48674i INSTANCE = new C48674i();

        static {
            Covode.recordClassIndex(57454);
        }

        public C48674i() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.a$k */
    public static final class C48676k extends AbstractC89220m implements AbstractC89171a<C12874b<C48200bc>> {
        public static final C48676k INSTANCE = new C48676k();

        static {
            Covode.recordClassIndex(57456);
        }

        public C48676k() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48200bc> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.a$l */
    public static final class C48677l extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C48677l INSTANCE = new C48677l();

        static {
            Covode.recordClassIndex(57457);
        }

        public C48677l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.a$n */
    public static final class C48679n extends AbstractC89220m implements AbstractC89171a<C12874b<C48198ba>> {
        public static final C48679n INSTANCE = new C48679n();

        static {
            Covode.recordClassIndex(57459);
        }

        public C48679n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48198ba> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.a$o */
    public static final class C48680o extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C48680o INSTANCE = new C48680o();

        static {
            Covode.recordClassIndex(57460);
        }

        public C48680o() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.a$q */
    public static final class View$OnClickListenerC48682q implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C48665a f112532a;

        static {
            Covode.recordClassIndex(57462);
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.a$q$a */
        static final class C48683a extends AbstractC89220m implements AbstractC89183m<Boolean, Aweme, C89391z> {

            /* renamed from: a */
            final /* synthetic */ View$OnClickListenerC48682q f112533a;

            /* renamed from: b */
            final /* synthetic */ View f112534b;

            static {
                Covode.recordClassIndex(57463);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C48683a(View$OnClickListenerC48682q qVar, View view) {
                super(2);
                this.f112533a = qVar;
                this.f112534b = view;
            }

            /* renamed from: a */
            private static boolean m92026a() {
                try {
                    return C34719f.C34720a.f82009a.mo61395c();
                } catch (Exception unused) {
                    return false;
                }
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final /* synthetic */ C89391z invoke(Boolean bool, Aweme aweme) {
                String str;
                String str2;
                String str3;
                String str4;
                Aweme aweme2;
                Aweme aweme3 = aweme;
                if (bool.booleanValue()) {
                    ((DiggAnimationView) this.f112533a.f112532a.mo20546C().findViewById(R.id.al8)).mo85725a(this.f112534b);
                    this.f112533a.f112532a.az_();
                    if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                        C58029j.f132256h = m92026a();
                    }
                    if (!C58029j.f132256h) {
                        new C79459a(this.f112533a.f112532a.az_()).mo123050a(R.string.dcq).mo123053a();
                    } else if (aweme3 == null) {
                        C51423a.m95791b(6, "VideoDiggAssem", "handleDiggClick:" + String.valueOf(this.f112533a.f112532a.az_()) + ",aweme: null");
                    } else {
                        C49645l.m93085a();
                        ImageView imageView = (ImageView) this.f112533a.f112532a.mo20546C().findViewById(R.id.al8);
                        VideoItemParams videoItemParams = (VideoItemParams) this.f112533a.f112532a.mo80645G().mo23342g();
                        String str5 = null;
                        if (videoItemParams != null) {
                            str = videoItemParams.mEventType;
                        } else {
                            str = null;
                        }
                        C49645l.m93090b(imageView, str, C59208ac.m108771e(aweme3), C59208ac.m108758a(aweme3));
                        VideoDiggVM G = this.f112533a.f112532a.mo80645G();
                        DataCenter j = G.mo80643j();
                        if (j != null) {
                            j.mo60191a("handle_digg_click", aweme3);
                        }
                        C89233z.C89237d dVar = new C89233z.C89237d();
                        C89233z.C89234a aVar = new C89233z.C89234a();
                        boolean z = true;
                        if (!G.f112484m && aweme3.getUserDigg() == 0) {
                            DataCenter j2 = G.mo80643j();
                            if (j2 != null) {
                                j2.mo60191a("video_digg", (Object) 5);
                            }
                            G.f112483l++;
                            dVar.element = G.mo80634a(true, aweme3);
                            G.mo80639a("click_like");
                            aVar.element = true;
                        } else if (!G.f112484m || aweme3.getUserDigg() == 0) {
                            if (aweme3.getUserDigg() != 1) {
                                z = false;
                            }
                            G.f112484m = z;
                            dVar.element = G.mo80634a(G.f112484m, aweme3);
                            if (G.f112484m) {
                                G.f112483l++;
                            } else {
                                G.f112483l--;
                            }
                            aVar.element = G.f112484m;
                        } else {
                            DataCenter j3 = G.mo80643j();
                            if (j3 != null) {
                                j3.mo60191a("video_digg", (Object) 6);
                            }
                            G.f112483l--;
                            dVar.element = G.mo80634a(false, aweme3);
                            C34719f fVar = C34719f.C34720a.f82009a;
                            C89219l.m154716b(fVar, "");
                            if (!fVar.mo61395c()) {
                                new C79459a(G.mo80642i()).mo123050a(R.string.dcq).mo123053a();
                            } else {
                                Context i = G.mo80642i();
                                if (i == null || (str2 = FeedParamProvider.C49809a.m93270a(i).getSearchResultId()) == null) {
                                    str2 = "";
                                }
                                if (TextUtils.isEmpty(str2)) {
                                    str2 = C59208ac.m108771e(aweme3);
                                    C89219l.m154716b(str2, "");
                                }
                                if (aweme3.playlist_info != null) {
                                    str3 = aweme3.playlist_info.getMixId();
                                } else {
                                    str3 = "";
                                }
                                C59263y yVar = new C59263y("like_cancel");
                                String str6 = G.f112231p;
                                if (str6 == null) {
                                    str6 = "";
                                }
                                C59263y a = yVar.mo96852a(str6);
                                Context i2 = G.mo80642i();
                                if (i2 == null || (str4 = FeedParamProvider.C49809a.m93270a(i2).getSearchId()) == null) {
                                    str4 = "";
                                }
                                C59263y yVar2 = (C59263y) a.mo96810l(str4).mo96804f(str2);
                                yVar2.f135462e = G.mo80644k().f112551a;
                                yVar2.f135432a = ((FeedBaseViewModel) G).f112230o;
                                C59263y o = yVar2.mo96749g(aweme3).mo96854o(G.mo80644k().f112554d);
                                o.f135465r = G.mo80644k().f112555e;
                                o.f135466s = G.mo80644k().f112556f;
                                o.f135429X = str3;
                                VideoItemParams videoItemParams2 = (VideoItemParams) G.mo23342g();
                                if (videoItemParams2 != null) {
                                    aweme2 = videoItemParams2.mAweme;
                                } else {
                                    aweme2 = null;
                                }
                                o.mo96788a(C80632w.m139800a(aweme2, "like_cancel", G.f112231p)).mo96792f();
                                if (!TextUtils.equals("opus", G.f112231p)) {
                                    G.mo80642i();
                                    C39162r.m79456a("like_cancel", G.f112231p, aweme3.getAid(), 0, G.mo23343h());
                                } else if (G.f112233r) {
                                    G.mo80642i();
                                    C39162r.m79456a("like_cancel", "personal_homepage", aweme3.getAid(), 0, G.mo23343h());
                                } else {
                                    G.mo80642i();
                                    C39162r.m79456a("like_cancel", "others_homepage", aweme3.getAid(), 0, G.mo23343h());
                                }
                                if (aweme3.getAwemeType() != 34) {
                                    String aid = aweme3.getAid();
                                    C89219l.m154716b(aid, "");
                                    G.mo80640a(aid, 0, aweme3);
                                } else {
                                    C38000g.m77050a().mo65895g(G.mo80642i(), aweme3);
                                    C18129a.m33746a("draw_ad", "like_cancel", aweme3.getAwemeRawAd()).mo28902c();
                                }
                            }
                            aVar.element = false;
                        }
                        G.mo20662a(new VideoDiggVM.C48654d(G, dVar, aweme3, aVar));
                        Context i3 = G.mo80642i();
                        if (i3 != null) {
                            str5 = i3.getString(R.string.kn);
                        }
                        Context i4 = G.mo80642i();
                        if (i4 != null) {
                            C50524a.m94705a(i4, str5, false, 0);
                        }
                    }
                } else {
                    new C79459a(this.f112533a.f112532a.az_()).mo123050a(R.string.hc8).mo123053a();
                }
                return C89391z.f203057a;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnClickListenerC48682q(C48665a aVar) {
            this.f112532a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f112532a.mo80645G().mo80638a(new C48683a(this, view));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.a$e */
    public static final class C48670e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112530a;

        static {
            Covode.recordClassIndex(57450);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48670e(AbstractC12693u uVar) {
            super(0);
            this.f112530a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f112530a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.a$f */
    public static final class C48671f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112531a;

        static {
            Covode.recordClassIndex(57451);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48671f(AbstractC12693u uVar) {
            super(0);
            this.f112531a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f112531a.bD_().f30985g;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a, com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public final void mo20466a() {
        super.mo20466a();
        mo80645G().mo80637a((Context) null);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.a$a */
    public static final class C48666a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f112528a;

        static {
            Covode.recordClassIndex(57446);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48666a(AbstractC89277c cVar) {
            super(0);
            this.f112528a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f112528a).getName();
        }
    }

    /* renamed from: J */
    private final C36150d m92015J() {
        if (this.f112521B == null) {
            this.f112521B = new C36150d();
        }
        C36150d dVar = this.f112521B;
        if (dVar == null) {
            C89219l.m154715b();
        }
        return dVar;
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u, com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: f */
    public final void mo20518f() {
        super.mo20518f();
        C51423a.m95792b("VideoDiggAssem", "onCreate: ".concat(String.valueOf(this)));
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: y */
    public final void mo20533y() {
        super.mo20533y();
        AbstractC12818f.C12819a.m23063a(this, mo80645G(), C48692b.f112543a, C12856l.m23100a(), C48684r.f112535a, 4);
        AbstractC12818f.C12819a.m23063a(this, mo80645G(), C48693c.f112544a, (C12854k) null, C48685s.f112536a, 6);
        AbstractC12818f.C12819a.m23063a(this, mo80645G(), C48694d.f112545a, C12856l.m23100a(), C48686t.f112537a, 4);
    }

    public C48665a() {
        AbstractC12848i.C12851c cVar = AbstractC12848i.C12851c.f31277a;
        AbstractC89277c a = C89204ab.m154669a(VideoDiggVM.class);
        this.f112525x = C14530k.m26542a(this, a, cVar == null ? AbstractC12848i.C12851c.f31277a : cVar, new C48666a(a), C48668c.INSTANCE, new C48669d(this), C48667b.INSTANCE, null, null, new C48670e(this), new C48671f(this));
        this.f112526y = new C14524g(C89204ab.m154669a(VideoViewModel.class), this, C48673h.INSTANCE, C48674i.INSTANCE, C48672g.INSTANCE);
        this.f112527z = new C14524g(C89204ab.m154669a(VideoPlayViewModel.class), this, C48676k.INSTANCE, C48677l.INSTANCE, C48675j.INSTANCE);
        this.f112520A = new C14524g(C89204ab.m154669a(VideoEventDispatchViewModel.class), this, C48679n.INSTANCE, C48680o.INSTANCE, C48678m.INSTANCE);
        this.f112522C = new View$OnClickListenerC48682q(this);
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
        mo80645G().mo80637a(az_());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public final /* synthetic */ void mo20467a(VideoItemParams videoItemParams) {
        String str;
        VideoItemParams videoItemParams2 = videoItemParams;
        C89219l.m154721d(videoItemParams2, "");
        C51423a.m95792b("VideoDiggAssem", "onBind: " + this + ", item: " + videoItemParams2);
        ((DiggAnimationView) mo20546C().findViewById(R.id.al8)).setImageDrawable(this.f112524v);
        C36150d J = m92015J();
        if (J != null) {
            J.mo63274b();
        }
        C89219l.m154721d("VideoDiggAssem OnBind", "");
        C58081a aVar = C58081a.f132324a;
        Aweme aweme = videoItemParams2.mAweme;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        aVar.mo60039a(str);
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: c */
    public final void mo20517c(View view) {
        Drawable drawable;
        Resources resources;
        C89219l.m154721d(view, "");
        C51423a.m95792b("VideoDiggAssem", "onViewCreated: ".concat(String.valueOf(this)));
        Context az_ = az_();
        if (az_ == null || (resources = az_.getResources()) == null) {
            drawable = null;
        } else {
            drawable = resources.getDrawable(R.drawable.b10);
        }
        this.f112524v = drawable;
        if (C56216k.m102131a()) {
            TuxTextView tuxTextView = (TuxTextView) mo20546C().findViewById(R.id.ala);
            C89219l.m154716b(tuxTextView, "");
            C23163i.m43660a((View) tuxTextView, (Integer) null, (Integer) null, (Integer) null, (Integer) 12, false, 23);
        }
        C36150d J = m92015J();
        J.f85398a = mo20528t();
        J.f85399b = (FrameLayout) mo20546C().findViewById(R.id.al_);
        J.f85400c = (DiggAnimationView) mo20546C().findViewById(R.id.al8);
        J.f85401d = (TuxTextView) mo20546C().findViewById(R.id.ala);
        Drawable d = C36150d.m73649d();
        if (d != null) {
            this.f112524v = d;
        }
        ((FrameLayout) mo20546C().findViewById(R.id.al_)).setOnClickListener(this.f112522C);
        ((TuxTextView) mo20546C().findViewById(R.id.ala)).setOnClickListener(this.f112522C);
        ((LinearLayout) mo20546C().findViewById(R.id.ald)).setOnClickListener(this.f112522C);
        AbstractC12818f.C12819a.m23070b(this, m92014I(), C48695e.f112546a, C12856l.m23100a(), C48688v.f112539a, 4);
        AbstractC12818f.C12819a.m23070b(this, (VideoPlayViewModel) this.f112527z.getValue(), C48696f.f112547a, C12856l.m23100a(), C48689w.f112540a, 4);
        AbstractC12818f.C12819a.m23070b(this, m92014I(), C48697g.f112548a, C12856l.m23100a(), C48690x.f112541a, 4);
        AbstractC12818f.C12819a.m23070b(this, m92014I(), C48698h.f112549a, C12856l.m23100a(), C48691y.f112542a, 4);
        AbstractC12818f.C12819a.m23070b(this, (VideoEventDispatchViewModel) this.f112520A.getValue(), C48699i.f112550a, C12856l.m23100a(), C48687u.f112538a, 4);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.a$x */
    static final class C48690x extends AbstractC89220m implements AbstractC89183m<C48665a, C12776a<? extends VideoItemParams>, C89391z> {

        /* renamed from: a */
        public static final C48690x f112541a = new C48690x();

        static {
            Covode.recordClassIndex(57470);
        }

        C48690x() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48665a aVar, C12776a<? extends VideoItemParams> aVar2) {
            Aweme aweme;
            C48665a aVar3 = aVar;
            C12776a<? extends VideoItemParams> aVar4 = aVar2;
            C89219l.m154721d(aVar3, "");
            if (aVar4 != null) {
                VideoDiggVM G = aVar3.mo80645G();
                T t = aVar4.f31085a;
                if (t != null) {
                    aweme = t.mAweme;
                } else {
                    aweme = null;
                }
                G.mo80641b(aweme);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.a$y */
    static final class C48691y extends AbstractC89220m implements AbstractC89183m<C48665a, C12776a<? extends VideoItemParams>, C89391z> {

        /* renamed from: a */
        public static final C48691y f112542a = new C48691y();

        static {
            Covode.recordClassIndex(57471);
        }

        C48691y() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48665a aVar, C12776a<? extends VideoItemParams> aVar2) {
            Aweme aweme;
            C48665a aVar3 = aVar;
            C12776a<? extends VideoItemParams> aVar4 = aVar2;
            C89219l.m154721d(aVar3, "");
            if (aVar4 != null) {
                VideoDiggVM G = aVar3.mo80645G();
                T t = aVar4.f31085a;
                if (t != null) {
                    aweme = t.mAweme;
                } else {
                    aweme = null;
                }
                G.mo80641b(aweme);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.a$t */
    static final class C48686t extends AbstractC89220m implements AbstractC89183m<C48665a, C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        public static final C48686t f112537a = new C48686t();

        static {
            Covode.recordClassIndex(57466);
        }

        C48686t() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48665a aVar, C12776a<? extends Boolean> aVar2) {
            C48665a aVar3 = aVar;
            C12776a<? extends Boolean> aVar4 = aVar2;
            C89219l.m154721d(aVar3, "");
            if (aVar4 != null) {
                if (aVar4.f31085a.booleanValue()) {
                    C50553s.m94778a(aVar3.mo20546C().findViewById(R.id.al8));
                } else {
                    ((DiggAnimationView) aVar3.mo20546C().findViewById(R.id.al8)).mo85726g();
                }
                aVar3.mo80645G().mo20662a(VideoDiggVM.C48661i.f112510a);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.a$u */
    static final class C48687u extends AbstractC89220m implements AbstractC89183m<C48665a, C49690r, C89391z> {

        /* renamed from: a */
        public static final C48687u f112538a = new C48687u();

        static {
            Covode.recordClassIndex(57467);
        }

        C48687u() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48665a aVar, C49690r rVar) {
            Aweme aweme;
            C48665a aVar2 = aVar;
            C49690r rVar2 = rVar;
            C89219l.m154721d(aVar2, "");
            VideoDiggVM G = aVar2.mo80645G();
            if (rVar2 != null) {
                String str = rVar2.f114356a;
                VideoItemParams videoItemParams = (VideoItemParams) G.mo23342g();
                if (videoItemParams != null) {
                    aweme = videoItemParams.mAweme;
                } else {
                    aweme = null;
                }
                if (TextUtils.equals(str, C59208ac.m108771e(aweme))) {
                    G.mo20662a(new VideoDiggVM.C48657f(G, G.f112483l));
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.a$r */
    static final class C48684r extends AbstractC89220m implements AbstractC89183m<C48665a, Boolean, C89391z> {

        /* renamed from: a */
        public static final C48684r f112535a = new C48684r();

        static {
            Covode.recordClassIndex(57464);
        }

        C48684r() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48665a aVar, Boolean bool) {
            C48665a aVar2 = aVar;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(aVar2, "");
            if (booleanValue) {
                ((DiggAnimationView) aVar2.mo20546C().findViewById(R.id.al8)).setTag(C33918a.f80227a, false);
                ((DiggAnimationView) aVar2.mo20546C().findViewById(R.id.al8)).setImageDrawable(aVar2.f112524v);
            } else {
                ((DiggAnimationView) aVar2.mo20546C().findViewById(R.id.al8)).setImageDrawable(aVar2.f112524v);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.a$v */
    static final class C48688v extends AbstractC89220m implements AbstractC89183m<C48665a, C12776a<? extends Aweme>, C89391z> {

        /* renamed from: a */
        public static final C48688v f112539a = new C48688v();

        static {
            Covode.recordClassIndex(57468);
        }

        C48688v() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48665a aVar, C12776a<? extends Aweme> aVar2) {
            C48665a aVar3 = aVar;
            C12776a<? extends Aweme> aVar4 = aVar2;
            C89219l.m154721d(aVar3, "");
            if (aVar4 != null) {
                VideoDiggVM G = aVar3.mo80645G();
                T t = aVar4.f31085a;
                if (!(G.mo80642i() == null || t == null)) {
                    if (C37699a.m76278ax(t)) {
                        G.mo20672d(new VideoDiggVM.C48658g(G));
                    } else if (C37699a.m76252aX(t)) {
                        new C79459a(G.mo80642i()).mo123050a(R.string.cuu).mo123053a();
                    } else if (!G.f112484m && t.getUserDigg() == 0) {
                        G.f112483l++;
                        G.mo20667b(new VideoDiggVM.C48659h(G, G.mo80634a(true, (Aweme) t), t));
                        G.mo80639a("click_double_like");
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.a$w */
    static final class C48689w extends AbstractC89220m implements AbstractC89183m<C48665a, C12776a<? extends Aweme>, C89391z> {

        /* renamed from: a */
        public static final C48689w f112540a = new C48689w();

        static {
            Covode.recordClassIndex(57469);
        }

        C48689w() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48665a aVar, C12776a<? extends Aweme> aVar2) {
            long diggCount;
            C48665a aVar3 = aVar;
            C12776a<? extends Aweme> aVar4 = aVar2;
            C89219l.m154721d(aVar3, "");
            if (aVar4 != null) {
                VideoDiggVM G = aVar3.mo80645G();
                T t = aVar4.f31085a;
                if (t != null && t.isAd()) {
                    boolean z = true;
                    if (t.getUserDigg() != 1) {
                        z = false;
                    }
                    G.f112484m = z;
                    if (t.getStatistics() == null) {
                        diggCount = 0;
                    } else {
                        AwemeStatistics statistics = t.getStatistics();
                        C89219l.m154716b(statistics, "");
                        diggCount = statistics.getDiggCount();
                    }
                    G.f112483l = diggCount;
                    if (G.f112483l < 0) {
                        G.f112483l = 0;
                    }
                    G.mo20662a(new VideoDiggVM.C48663k(G, G.f112483l, t));
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.a$s */
    static final class C48685s extends AbstractC89220m implements AbstractC89183m<C48665a, C48702l, C89391z> {

        /* renamed from: a */
        public static final C48685s f112536a = new C48685s();

        static {
            Covode.recordClassIndex(57465);
        }

        C48685s() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48665a aVar, C48702l lVar) {
            Aweme aweme;
            C48665a aVar2 = aVar;
            C48702l lVar2 = lVar;
            C89219l.m154721d(aVar2, "");
            Thread currentThread = Thread.currentThread();
            C89219l.m154716b(currentThread, "");
            currentThread.getName();
            if (lVar2 != null) {
                if (!lVar2.f112563c) {
                    TuxTextView tuxTextView = (TuxTextView) aVar2.mo20546C().findViewById(R.id.ala);
                    C89219l.m154716b(tuxTextView, "");
                    tuxTextView.setVisibility(4);
                } else {
                    try {
                        TuxTextView tuxTextView2 = (TuxTextView) aVar2.mo20546C().findViewById(R.id.ala);
                        C89219l.m154716b(tuxTextView2, "");
                        tuxTextView2.setVisibility(0);
                        TuxTextView tuxTextView3 = (TuxTextView) aVar2.mo20546C().findViewById(R.id.ala);
                        C89219l.m154716b(tuxTextView3, "");
                        tuxTextView3.setText(lVar2.f112561a);
                    } catch (NullPointerException e) {
                        TuxTextView tuxTextView4 = (TuxTextView) aVar2.mo20546C().findViewById(R.id.ala);
                        C89219l.m154716b(tuxTextView4, "");
                        VideoItemParams videoItemParams = (VideoItemParams) aVar2.mo80645G().mo23342g();
                        if (videoItemParams != null) {
                            aweme = videoItemParams.mAweme;
                        } else {
                            aweme = null;
                        }
                        tuxTextView4.setText(VideoDiggVM.m91990a(0, aweme));
                        C51423a.m95790a((Throwable) e);
                        e.printStackTrace();
                    }
                }
                DiggAnimationView diggAnimationView = (DiggAnimationView) aVar2.mo20546C().findViewById(R.id.al8);
                C89219l.m154716b(diggAnimationView, "");
                diggAnimationView.setSelected(lVar2.f112562b);
            }
            return C89391z.f203057a;
        }
    }
}
