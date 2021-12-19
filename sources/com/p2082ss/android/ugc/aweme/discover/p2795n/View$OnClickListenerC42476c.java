package com.p2082ss.android.ugc.aweme.discover.p2795n;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0643b;
import androidx.core.graphics.C0699a;
import androidx.core.p036g.C0692e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import androidx.recyclerview.widget.GridLayoutManager;
import com.C1764a;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17300a;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.AbstractC17891a;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.AbstractC17895b;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.C17896c;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.p1719f.C23142d;
import com.bytedance.tux.p1719f.p1720a.C23127c;
import com.bytedance.tux.p1722h.C23163i;
import com.google.gson.C27910f;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2322c.C33721c;
import com.p2082ss.android.ugc.aweme.autoplay.p2350e.C34181a;
import com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b;
import com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f;
import com.p2082ss.android.ugc.aweme.autoplay.player.video.C34246c;
import com.p2082ss.android.ugc.aweme.autoplay.player.video.SearchPlayerCore;
import com.p2082ss.android.ugc.aweme.autoplay.player.video.SearchVideoView;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.p2379ui.TagLayout;
import com.p2082ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39054a;
import com.p2082ss.android.ugc.aweme.discover.helper.C42014f;
import com.p2082ss.android.ugc.aweme.discover.helper.C42041n;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2791cs.C42333a;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2791cs.ClickSearchView;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2791cs.ClickSearchViewModel;
import com.p2082ss.android.ugc.aweme.discover.mob.C42460j;
import com.p2082ss.android.ugc.aweme.discover.model.Position;
import com.p2082ss.android.ugc.aweme.discover.model.VideoTag;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41497af;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41499ag;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41520as;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41522at;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41553w;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41554x;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41555y;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41556z;
import com.p2082ss.android.ugc.aweme.discover.p2766b.AbstractC41858b;
import com.p2082ss.android.ugc.aweme.discover.p2766b.AbstractC41863f;
import com.p2082ss.android.ugc.aweme.discover.p2766b.C41857a;
import com.p2082ss.android.ugc.aweme.discover.p2766b.C41861d;
import com.p2082ss.android.ugc.aweme.discover.p2766b.C41886h;
import com.p2082ss.android.ugc.aweme.discover.p2766b.C41890j;
import com.p2082ss.android.ugc.aweme.discover.p2766b.View$OnAttachStateChangeListenerC41864g;
import com.p2082ss.android.ugc.aweme.discover.p2787m.C42292a;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.C48317al;
import com.p2082ss.android.ugc.aweme.feed.helper.C49625h;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p2082ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.p2969u.AbstractC49991w;
import com.p2082ss.android.ugc.aweme.feed.p2969u.C49957aa;
import com.p2082ss.android.ugc.aweme.feed.p2969u.C49959ac;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50535d;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59242h;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.metrics.C59263y;
import com.p2082ss.android.ugc.aweme.mix.p3450e.C59538b;
import com.p2082ss.android.ugc.aweme.mix.services.MixFeedService;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.p2395bk.C34883a;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.C67361d;
import com.p2082ss.android.ugc.aweme.search.ecom.C67398b;
import com.p2082ss.android.ugc.aweme.search.ecom.p3688a.C67394a;
import com.p2082ss.android.ugc.aweme.search.ecom.p3689b.C67404c;
import com.p2082ss.android.ugc.aweme.search.ecom.p3689b.C67407e;
import com.p2082ss.android.ugc.aweme.search.ecom.video.C67427a;
import com.p2082ss.android.ugc.aweme.search.ecom.video.C67428b;
import com.p2082ss.android.ugc.aweme.search.ecom.video.C67430c;
import com.p2082ss.android.ugc.aweme.search.ecom.video.VideoAnchorView;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3683a.C67338a;
import com.p2082ss.android.ugc.aweme.search.p3686d.AbstractC67364c;
import com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a;
import com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67566p;
import com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67567q;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67469ad;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67486am;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67498at;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67500au;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67540c;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67542d;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.search.p3704r.C67704b;
import com.p2082ss.android.ugc.aweme.search.p3705s.C67718a;
import com.p2082ss.android.ugc.aweme.utils.C80231ay;
import com.p2082ss.android.ugc.aweme.utils.C80284by;
import com.p2082ss.android.ugc.aweme.utils.C80291cb;
import com.p2082ss.android.ugc.aweme.utils.C80359du;
import com.p2082ss.android.ugc.aweme.utils.C80375ef;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.aweme.utils.C80422fe;
import com.p2082ss.android.ugc.aweme.utils.C80508gp;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.aweme.utils.C80566ib;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.utils.C80589iu;
import com.p2082ss.android.ugc.aweme.utils.C80594ix;
import com.p2082ss.android.ugc.aweme.utils.C80632w;
import com.p2082ss.android.ugc.aweme.utils.C80635y;
import com.p2082ss.android.ugc.playerkit.model.C84208l;
import com.p2082ss.android.ugc.playerkit.model.C84215n;
import com.p2082ss.android.ugc.playerkit.model.C84216o;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;
import p4600h.p4619j.C89271h;
import p4600h.p4621l.AbstractC89306h;
import p4600h.p4621l.C89309k;

/* renamed from: com.ss.android.ugc.aweme.discover.n.c */
public final class View$OnClickListenerC42476c extends AbstractC42474a implements View.OnClickListener, AbstractC41858b, AbstractC49991w, AbstractC67459a, AbstractC67566p {

    /* renamed from: aj */
    private static final float f99021aj = C80284by.m139183a(2);

    /* renamed from: w */
    public static final C42480b f99022w = new C42480b((byte) 0);

    /* renamed from: A */
    private TextView f99023A;

    /* renamed from: B */
    private TagLayout f99024B;

    /* renamed from: C */
    private C42014f f99025C;

    /* renamed from: D */
    private TextView f99026D;

    /* renamed from: E */
    private LinearLayout f99027E;

    /* renamed from: F */
    private ViewStub f99028F;

    /* renamed from: G */
    private ViewStub f99029G;

    /* renamed from: H */
    private ViewStub f99030H;

    /* renamed from: I */
    private View f99031I;

    /* renamed from: J */
    private ViewStub f99032J;

    /* renamed from: K */
    private TextView f99033K;

    /* renamed from: L */
    private ImageView f99034L;

    /* renamed from: M */
    private TuxTextView f99035M;

    /* renamed from: N */
    private View f99036N;

    /* renamed from: O */
    private TuxIconView f99037O;

    /* renamed from: P */
    private FrameLayout f99038P;

    /* renamed from: Q */
    private C49959ac f99039Q;

    /* renamed from: R */
    private long f99040R;

    /* renamed from: S */
    private LinearLayout f99041S;

    /* renamed from: T */
    private ConstraintLayout f99042T;

    /* renamed from: U */
    private SmartImageView f99043U;

    /* renamed from: V */
    private TuxTextView f99044V;

    /* renamed from: W */
    private TuxTextView f99045W;

    /* renamed from: X */
    private View f99046X;

    /* renamed from: Y */
    private ClickSearchViewModel f99047Y;

    /* renamed from: Z */
    private final boolean f99048Z;

    /* renamed from: aa */
    private String f99049aa;

    /* renamed from: ab */
    private boolean f99050ab;

    /* renamed from: ac */
    private AbstractC67364c f99051ac;

    /* renamed from: ad */
    private View$OnAttachStateChangeListenerC41864g f99052ad;

    /* renamed from: ae */
    private C67427a f99053ae;

    /* renamed from: af */
    private C67394a f99054af;

    /* renamed from: ag */
    private final AbstractC89244h f99055ag;

    /* renamed from: ah */
    private final AbstractC89244h f99056ah;

    /* renamed from: ai */
    private final AbstractC89244h f99057ai;

    /* renamed from: b */
    public VideoAnchorView f99058b;

    /* renamed from: c */
    public ViewGroup f99059c;

    /* renamed from: d */
    public ViewGroup f99060d;

    /* renamed from: e */
    public C67678d f99061e;

    /* renamed from: f */
    public AbstractC51043a f99062f;

    /* renamed from: g */
    public int f99063g;

    /* renamed from: h */
    public int f99064h;

    /* renamed from: i */
    public SearchVideoView f99065i;

    /* renamed from: j */
    public C42333a f99066j;

    /* renamed from: q */
    boolean f99067q;

    /* renamed from: r */
    boolean f99068r;

    /* renamed from: s */
    public int f99069s;

    /* renamed from: t */
    public C67568r f99070t;

    /* renamed from: u */
    public AbstractC17891a f99071u;

    /* renamed from: v */
    public long f99072v;

    /* renamed from: x */
    private TextView f99073x;

    /* renamed from: y */
    private TextView f99074y;

    /* renamed from: z */
    private SmartCircleImageView f99075z;

    /* renamed from: Q */
    private final C42497q.C424981 m84911Q() {
        return (C42497q.C424981) this.f99055ag.getValue();
    }

    /* renamed from: R */
    private final AbstractC89172b<Aweme, String> m84912R() {
        return (AbstractC89172b) this.f99056ah.getValue();
    }

    /* renamed from: S */
    private final C42493n.C424941 m84913S() {
        return (C42493n.C424941) this.f99057ai.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: B */
    public final void mo60425B() {
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2795n.AbstractC42474a
    /* renamed from: E */
    public final void mo72623E() {
        this.f99050ab = true;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2969u.AbstractC49991w
    /* renamed from: a */
    public final void mo72639a(C0692e<String, Integer> eVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39054a
    /* renamed from: a */
    public final boolean mo67790a(Video video, String str) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void an_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void bg_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: m */
    public final int mo60385m() {
        return 16;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.n.c$b */
    public static final class C42480b {
        static {
            Covode.recordClassIndex(50568);
        }

        private C42480b() {
        }

        public /* synthetic */ C42480b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.n.c$c */
    static final class C42481c extends AbstractC89220m implements AbstractC89171a<AbstractC89172b<? super Aweme, ? extends String>> {

        /* renamed from: a */
        public static final C42481c f99080a = new C42481c();

        static {
            Covode.recordClassIndex(50569);
        }

        C42481c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ AbstractC89172b<? super Aweme, ? extends String> invoke() {
            return C424821.f99081a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2795n.AbstractC42474a
    /* renamed from: C */
    public final boolean mo72621C() {
        return this.f99050ab;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39062g
    /* renamed from: c */
    public final void mo62381c() {
        mo72625H();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2766b.AbstractC41858b
    /* renamed from: h */
    public final AbstractC67459a mo60380h() {
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: i */
    public final boolean mo60381i() {
        return this.f99067q;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: j */
    public final boolean mo60382j() {
        return this.f99068r;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: k */
    public final C67678d mo60383k() {
        return this.f99061e;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: p */
    public final int mo60388p() {
        return this.f99069s;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2766b.AbstractC41858b
    /* renamed from: q */
    public final void mo60389q() {
        mo72625H();
    }

    /* renamed from: a */
    public final void mo72645a(String str) {
        C89219l.m154721d(str, "");
        C1731i.m5640b(new CallableC42490k(this, str, mo70877F().f151318m, mo70877F().f151326u, mo70877F().f151325t), C1731i.f5562a);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67566p
    /* renamed from: a */
    public final void mo70880a(C67568r rVar) {
        C34246c dataProvider;
        C89219l.m154721d(rVar, "");
        this.f99070t = rVar;
        C42333a aVar = this.f99066j;
        if (aVar != null) {
            aVar.f98623a = rVar;
        }
        SearchVideoView I = mo72632I();
        if (!(I == null || (dataProvider = I.getDataProvider()) == null)) {
            dataProvider.f81007x = rVar;
        }
        View view = this.itemView;
        C89219l.m154716b(view, "");
        C42460j.C42461a.m84865a(view, mo70877F());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39059e
    /* renamed from: a */
    public final /* synthetic */ void mo67806a(Aweme aweme, int i) {
        super.mo67806a(aweme, i);
        SmartImageView O = m84909O();
        if (O != null) {
            O.setUserVisibleHint(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.n.c$f */
    public static final class C42485f implements AbstractC17895b {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC42476c f99084a;

        static {
            Covode.recordClassIndex(50573);
        }

        @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.AbstractC17895b
        /* renamed from: a */
        public final ViewGroup mo28494a() {
            return this.f99084a.f99059c;
        }

        @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.AbstractC17895b
        /* renamed from: c */
        public final Context mo28496c() {
            return this.f99084a.f99020a;
        }

        @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.AbstractC17895b
        /* renamed from: d */
        public final ViewGroup mo28497d() {
            return this.f99084a.f99060d;
        }

        @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.AbstractC17895b
        /* renamed from: g */
        public final void mo28500g() {
            this.f99084a.mo60424A();
        }

        @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.AbstractC17895b
        /* renamed from: h */
        public final void mo28501h() {
            this.f99084a.bi_();
        }

        @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.AbstractC17895b
        /* renamed from: b */
        public final String mo28495b() {
            return this.f99084a.mo70877F().f151312g;
        }

        @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.AbstractC17895b
        /* renamed from: e */
        public final void mo28498e() {
            C34246c dataProvider;
            AbstractC34186b.AbstractC34187a aVar;
            C49625h a = C49625h.m93072a();
            C89219l.m154716b(a, "");
            a.f114196h = 53;
            SearchVideoView I = this.f99084a.mo72632I();
            if (I != null && (dataProvider = I.getDataProvider()) != null && (aVar = dataProvider.f80996m) != null) {
                aVar.mo60412a();
            }
        }

        @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.AbstractC17895b
        /* renamed from: f */
        public final void mo28499f() {
            C34246c dataProvider;
            AbstractC34186b.AbstractC34187a aVar;
            C49625h a = C49625h.m93072a();
            C89219l.m154716b(a, "");
            a.f114196h = 54;
            SearchVideoView I = this.f99084a.mo72632I();
            if (I != null && (dataProvider = I.getDataProvider()) != null && (aVar = dataProvider.f80996m) != null) {
                aVar.mo60412a();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C42485f(View$OnClickListenerC42476c cVar) {
            this.f99084a = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.n.c$g */
    public static final class C42486g implements AbstractC34186b.AbstractC34187a {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC42476c f99085a;

        /* renamed from: b */
        final /* synthetic */ SearchVideoView f99086b;

        static {
            Covode.recordClassIndex(50574);
        }

        @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34187a
        /* renamed from: a */
        public final void mo60412a() {
            this.f99085a.onClick(this.f99086b);
        }

        C42486g(View$OnClickListenerC42476c cVar, SearchVideoView searchVideoView) {
            this.f99085a = cVar;
            this.f99086b = searchVideoView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.n.c$n */
    static final class C42493n extends AbstractC89220m implements AbstractC89171a<C424941> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC42476c f99097a;

        static {
            Covode.recordClassIndex(50581);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42493n(View$OnClickListenerC42476c cVar) {
            super(0);
            this.f99097a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C424941 invoke() {
            return new AbstractC42475b(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.p2795n.View$OnClickListenerC42476c.C42493n.C424941 */

                /* renamed from: a */
                final /* synthetic */ C42493n f99098a;

                static {
                    Covode.recordClassIndex(50582);
                }

                @Override // com.p2082ss.android.ugc.aweme.discover.p2795n.AbstractC42475b
                /* renamed from: a */
                public final void mo72626a() {
                    AbstractC17891a aVar = this.f99098a.f99097a.f99071u;
                    if (aVar != null) {
                        aVar.mo28477c();
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.discover.p2795n.AbstractC42475b
                /* renamed from: b */
                public final void mo72627b() {
                    AbstractC17891a aVar = this.f99098a.f99097a.f99071u;
                    if (aVar != null) {
                        aVar.mo28478d();
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.discover.p2795n.AbstractC42475b
                /* renamed from: c */
                public final void mo72628c() {
                    AbstractC17891a aVar = this.f99098a.f99097a.f99071u;
                    if (aVar != null) {
                        aVar.mo28479e();
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.discover.p2795n.AbstractC42475b
                /* renamed from: d */
                public final void mo72629d() {
                    AbstractC17891a aVar = this.f99098a.f99097a.f99071u;
                    if (aVar != null) {
                        aVar.mo28480f();
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.discover.p2795n.AbstractC42475b
                /* renamed from: f */
                public final void mo72631f() {
                    AbstractC17891a aVar = this.f99098a.f99097a.f99071u;
                    if (aVar != null) {
                        aVar.mo28481g();
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.discover.p2795n.AbstractC42475b
                /* renamed from: e */
                public final Boolean mo72630e() {
                    AbstractC17891a aVar = this.f99098a.f99097a.f99071u;
                    if (aVar != null) {
                        return Boolean.valueOf(aVar.mo28482h());
                    }
                    return null;
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f99098a = r1;
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.n.c$q */
    static final class C42497q extends AbstractC89220m implements AbstractC89171a<C424981> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC42476c f99101a;

        static {
            Covode.recordClassIndex(50585);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42497q(View$OnClickListenerC42476c cVar) {
            super(0);
            this.f99101a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C424981 invoke() {
            return new AbstractC34259f(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.p2795n.View$OnClickListenerC42476c.C42497q.C424981 */

                /* renamed from: a */
                final /* synthetic */ C42497q f99102a;

                static {
                    Covode.recordClassIndex(50586);
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
                /* renamed from: A */
                public final void mo60424A() {
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
                /* renamed from: B */
                public final void mo60425B() {
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
                public final boolean aZ_() {
                    return false;
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
                public final void an_() {
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
                public final void bg_() {
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
                public final void bi_() {
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
                /* renamed from: g */
                public final void mo60429g() {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final OnUIPlayListener getWrapperedListener() {
                    return null;
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onBufferedPercent(String str, long j, int i) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onBufferedTimeMs(String str, long j) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onBuffering(String str, boolean z) {
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onBuffering(boolean z) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onCompleteLoaded(String str, boolean z) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onDecoderBuffering(String str, boolean z) {
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onDecoderBuffering(boolean z) {
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPausePlay(String str) {
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayCompleted(String str) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayCompleted(String str, int i) {
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayCompletedFirstTime(String str) {
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayFailed(C84208l lVar) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayFailed(String str, C84208l lVar) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayPause(String str) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayPrepare(String str) {
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayProgressChange(float f) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayProgressChange(String str, long j, long j2) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayRelease(String str) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayStop(String str) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayStop(String str, JSONObject jSONObject) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayStop(String str, boolean z) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlaying(String str) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPreParePlay(String str, C84215n nVar) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPreRenderSessionMissed(String str) {
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPreparePlay(String str) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onRenderFirstFrame(String str, C84216o oVar) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onRenderFirstFrameFromResume(String str) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onRenderReady(C84215n nVar) {
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onResumePlay(String str) {
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onRetryOnError(C84208l lVar) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onRetryOnError(String str, C84208l lVar) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onSeekEnd(String str, boolean z) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onSeekStart(String str, int i, float f) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onVideoBitrateChanged(String str, EnumC63056b bVar, int i) {
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onVideoSizeChanged(String str, int i, int i2) {
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
                /* renamed from: z */
                public final View mo60468z() {
                    return null;
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f99102a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onRenderFirstFrame(C84216o oVar) {
                    SearchVideoView I = this.f99102a.f99101a.mo72632I();
                    if (I != null) {
                        I.setVisibility(0);
                    }
                }
            };
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2795n.AbstractC42474a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39054a
    /* renamed from: b */
    public final int[] mo62380b() {
        return C80397em.m139369a(201);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: l */
    public final View mo60384l() {
        View view = this.itemView;
        C89219l.m154716b(view, "");
        return view;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: o */
    public final int mo60387o() {
        return getAdapterPosition();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2766b.AbstractC41858b
    /* renamed from: s */
    public final SmartImageView mo60391s() {
        return m84909O();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2766b.AbstractC41858b
    /* renamed from: t */
    public final AbstractC34186b.AbstractC34192d mo60392t() {
        return mo72632I();
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: v */
    public final void mo60394v() {
        onClick(null);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: x */
    public final Aweme mo60396x() {
        return (Aweme) ((AbstractC39054a) this).f92231m;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: z */
    public final View mo60468z() {
        return mo60384l();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.n.c$p */
    static final class RunnableC42496p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC42476c f99100a;

        static {
            Covode.recordClassIndex(50584);
        }

        RunnableC42496p(View$OnClickListenerC42476c cVar) {
            this.f99100a = cVar;
        }

        public final void run() {
            this.f99100a.mo72637N();
            this.f99100a.mo72633J();
        }
    }

    /* renamed from: T */
    private final boolean m84914T() {
        return TextUtils.equals(this.f99049aa, "selfharm");
    }

    /* renamed from: W */
    private final void m84917W() {
        C80589iu.m139729a(this.f99026D);
        C80589iu.m139729a(this.f99035M);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67566p
    /* renamed from: F */
    public final C67568r mo70877F() {
        C67568r rVar = this.f99070t;
        if (rVar == null) {
            return C67568r.C67569a.m119673a();
        }
        return rVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: w */
    public final void mo60395w() {
        View$OnAttachStateChangeListenerC41864g gVar = this.f99052ad;
        if (gVar != null) {
            C89219l.m154721d(this, "");
            gVar.mo71031a(this, (Integer) null, (AbstractC41863f) null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: y */
    public final boolean mo60397y() {
        AbstractC17891a aVar = this.f99071u;
        if (aVar == null || !aVar.mo28476b()) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(50564);
    }

    /* renamed from: aa */
    private final C59538b m84925aa() {
        return new C59538b(mo70877F().f151314i, 3, mo70877F().f151309d, this.f99069s);
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: A */
    public final void mo60424A() {
        SearchPlayerCore a = C41861d.m83857a(this);
        if (a != null) {
            a.mo60424A();
        }
        SmartImageView O = m84909O();
        if (O != null) {
            O.mo34197b();
        }
    }

    /* renamed from: K */
    public final void mo72634K() {
        FrameLayout frameLayout = this.f99038P;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        TuxIconView tuxIconView = this.f99037O;
        if (tuxIconView != null) {
            tuxIconView.setVisibility(0);
        }
        mo72635L();
    }

    /* renamed from: L */
    public final void mo72635L() {
        int i;
        TuxIconView tuxIconView = this.f99037O;
        if (tuxIconView != null) {
            if (C41857a.m83848a()) {
                i = R.raw.icon_speaker_x_mark_fill_ltr;
            } else {
                i = R.raw.icon_speaker_2_fill_ltr;
            }
            tuxIconView.setIconRes(i);
        }
    }

    /* renamed from: M */
    public final void mo72636M() {
        FrameLayout frameLayout = this.f99038P;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        TuxIconView tuxIconView = this.f99037O;
        if (tuxIconView != null) {
            tuxIconView.setVisibility(8);
        }
    }

    /* renamed from: N */
    public final void mo72637N() {
        long j = this.f99040R;
        if (j != -1) {
            TextView textView = this.f99074y;
            if (textView == null) {
                C89219l.m154710a("txtLikeCount");
            }
            textView.setText(C53437b.m98615a(j));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void bi_() {
        SearchPlayerCore a = C41861d.m83857a(this);
        if (a != null) {
            a.mo60584a();
        }
        SmartImageView O = m84909O();
        if (O != null) {
            C41861d.m83860b(O);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: n */
    public final int mo60386n() {
        View view = this.itemView;
        C89219l.m154716b(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof GridLayoutManager.C1336b)) {
            layoutParams = null;
        }
        GridLayoutManager.C1336b bVar = (GridLayoutManager.C1336b) layoutParams;
        if (bVar != null) {
            return bVar.f4324a;
        }
        return -1;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2766b.AbstractC41858b
    /* renamed from: r */
    public final boolean mo60390r() {
        View$OnAttachStateChangeListenerC41864g gVar = this.f99052ad;
        if (gVar == null || !((Boolean) gVar.f97681m.getValue()).booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: u */
    public final boolean mo60393u() {
        ClickSearchView a;
        C42333a aVar = this.f99066j;
        if (aVar == null || (a = aVar.mo71525a()) == null || !a.mo71508b()) {
            return false;
        }
        return true;
    }

    /* renamed from: O */
    private final SmartImageView m84909O() {
        ViewStub viewStub;
        ViewStub viewStub2;
        MethodCollector.m26663i(7439);
        SmartImageView smartImageView = null;
        if (!C41886h.m83910d()) {
            MethodCollector.m26664o(7439);
            return null;
        }
        if (!(this.f99043U != null || (viewStub = this.f99029G) == null || viewStub.getParent() == null || (viewStub2 = this.f99029G) == null)) {
            viewStub2.setLayoutResource(R.layout.avo);
            View inflate = viewStub2.inflate();
            if (inflate instanceof SmartImageView) {
                smartImageView = inflate;
            }
            this.f99043U = smartImageView;
        }
        SmartImageView smartImageView2 = this.f99043U;
        MethodCollector.m26664o(7439);
        return smartImageView2;
    }

    /* renamed from: V */
    private final void m84916V() {
        View P;
        View view = this.f99036N;
        if (view != null) {
            view.setVisibility(8);
        }
        TuxTextView tuxTextView = this.f99035M;
        if (tuxTextView != null) {
            tuxTextView.setVisibility(8);
        }
        if (!C67338a.m119381a() && m84910P() != null && (P = m84910P()) != null) {
            P.setVisibility(8);
        }
    }

    /* renamed from: Z */
    private final void m84920Z() {
        int i;
        TextView textView = this.f99026D;
        if (textView != null) {
            Context context = this.f99020a;
            Object obj = this.f92231m;
            C89219l.m154716b(obj, "");
            textView.setText(C80566ib.m139656f(context, ((Aweme) obj).getCreateTime() * 1000));
            if (C37699a.m76314s((Aweme) ((AbstractC39054a) this).f92231m)) {
                i = 8;
            } else {
                i = 0;
            }
            textView.setVisibility(i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2795n.AbstractC42474a
    /* renamed from: G */
    public final void mo72624G() {
        long j;
        int i;
        AwemeStatistics statistics;
        Aweme aweme = (Aweme) this.f92231m;
        if (aweme == null || (statistics = aweme.getStatistics()) == null) {
            j = -1;
        } else {
            j = statistics.getDiggCount();
        }
        this.f99040R = j;
        Aweme aweme2 = (Aweme) this.f92231m;
        if (aweme2 != null) {
            i = aweme2.getUserDigg();
        } else {
            i = 0;
        }
        this.f99063g = i;
        this.itemView.post(new RunnableC42496p(this));
    }

    /* renamed from: I */
    public final SearchVideoView mo72632I() {
        ViewStub viewStub;
        ViewStub viewStub2;
        MethodCollector.m26663i(7441);
        SearchVideoView searchVideoView = null;
        if (!C41886h.m83909c()) {
            MethodCollector.m26664o(7441);
            return null;
        }
        if (!(this.f99065i != null || (viewStub = this.f99032J) == null || viewStub.getParent() == null || (viewStub2 = this.f99032J) == null)) {
            viewStub2.setLayoutResource(R.layout.aw6);
            View inflate = viewStub2.inflate();
            if (inflate instanceof SearchVideoView) {
                searchVideoView = inflate;
            }
            SearchVideoView searchVideoView2 = searchVideoView;
            this.f99065i = searchVideoView2;
            m84922a(searchVideoView2);
        }
        SearchVideoView searchVideoView3 = this.f99065i;
        MethodCollector.m26664o(7441);
        return searchVideoView3;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final boolean aZ_() {
        Animatable i;
        if (((AbstractC42474a) this).f92232n == null || ((AbstractC42474a) this).f92232n.getController() == null || (i = ((AbstractC42474a) this).f92232n.getController().mo39821i()) == null || !i.isRunning()) {
            return false;
        }
        return true;
    }

    /* renamed from: P */
    private final View m84910P() {
        ViewStub viewStub;
        ViewStub viewStub2;
        TuxTextView tuxTextView;
        MethodCollector.m26663i(7602);
        TuxTextView tuxTextView2 = null;
        if (C67338a.m119381a()) {
            MethodCollector.m26664o(7602);
            return null;
        }
        if (!(this.f99046X != null || (viewStub = this.f99030H) == null || viewStub.getParent() == null || (viewStub2 = this.f99030H) == null)) {
            View inflate = viewStub2.inflate();
            this.f99046X = inflate;
            if (inflate != null) {
                tuxTextView = (TuxTextView) inflate.findViewById(R.id.d3f);
            } else {
                tuxTextView = null;
            }
            this.f99044V = tuxTextView;
            View view = this.f99046X;
            if (view != null) {
                tuxTextView2 = (TuxTextView) view.findViewById(R.id.f9q);
            }
            this.f99045W = tuxTextView2;
        }
        View view2 = this.f99046X;
        MethodCollector.m26664o(7602);
        return view2;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2795n.AbstractC42474a
    /* renamed from: H */
    public final void mo72625H() {
        SearchVideoView I;
        SearchPlayerCore core;
        SearchVideoView I2 = mo72632I();
        if (I2 != null) {
            Object obj = this.f92231m;
            C89219l.m154716b(obj, "");
            I2.mo60629a((Aweme) obj);
        }
        if (!(!C37699a.m76314s((Aweme) ((AbstractC39054a) this).f92231m) || (I = mo72632I()) == null || (core = I.getCore()) == null)) {
            core.setMSearchAdViewCallBack(m84913S());
        }
        SmartImageView O = m84909O();
        if (O != null) {
            C41861d.m83860b(O);
        }
        if (C67718a.m119886c((Aweme) this.f92231m)) {
            Object obj2 = this.f92231m;
            C89219l.m154716b(obj2, "");
            Video video = ((Aweme) obj2).getVideo();
            C89219l.m154716b(video, "");
            mo67788a(video.getAiCover(), "SearchVideoHolder");
            return;
        }
        super.mo72625H();
    }

    /* renamed from: J */
    public final void mo72633J() {
        if (this.f99020a != null) {
            if (this.f99048Z) {
                Drawable a = C42041n.m84141a(this.f99063g, this.f99020a, 2131233629);
                if (a != null) {
                    int a2 = (int) C80284by.m139183a(13);
                    a.setBounds(0, 0, a2, a2);
                } else {
                    a = null;
                }
                TextView textView = this.f99074y;
                if (textView == null) {
                    C89219l.m154710a("txtLikeCount");
                }
                textView.setCompoundDrawablesRelative(a, null, null, null);
                return;
            }
            Drawable a3 = C42041n.m84141a(this.f99063g, this.f99020a, 2131233634);
            TextView textView2 = this.f99074y;
            if (textView2 == null) {
                C89219l.m154710a("txtLikeCount");
            }
            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(a3, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    /* renamed from: X */
    private final void m84918X() {
        ViewGroup.LayoutParams layoutParams;
        View view = this.f99031I;
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            if (C41499ag.m83446a()) {
                Aweme aweme = (Aweme) this.f92231m;
                if (aweme == null || aweme.playlist_info == null || !C41556z.m83493d()) {
                    layoutParams.height = (int) C80284by.m139183a(32);
                } else {
                    layoutParams.height = (int) C80284by.m139183a(98);
                }
                View view2 = this.f99031I;
                if (view2 != null) {
                    View view3 = this.itemView;
                    C89219l.m154716b(view3, "");
                    view2.setBackground(C0643b.m2369a(view3.getContext(), (int) R.drawable.bf5));
                }
            } else if (C41499ag.m83447b() || C41499ag.m83448c()) {
                Aweme aweme2 = (Aweme) this.f92231m;
                if (aweme2 == null || aweme2.playlist_info == null || !C41556z.m83493d()) {
                    layoutParams.height = (int) C80284by.m139183a(32);
                } else {
                    layoutParams.height = (int) C80284by.m139183a(98);
                }
                View view4 = this.f99031I;
                if (view4 != null) {
                    View view5 = this.itemView;
                    C89219l.m154716b(view5, "");
                    view4.setBackground(C0643b.m2369a(view5.getContext(), (int) R.drawable.bf6));
                }
            } else {
                layoutParams.height = (int) C80284by.m139183a(64);
                View view6 = this.f99031I;
                if (view6 != null) {
                    View view7 = this.itemView;
                    C89219l.m154716b(view7, "");
                    view6.setBackground(C0643b.m2369a(view7.getContext(), (int) R.drawable.bco));
                }
            }
            View view8 = this.f99031I;
            if (view8 != null) {
                view8.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: Y */
    private final void m84919Y() {
        Video video;
        VideoTag videoTag;
        int i;
        Drawable a;
        Video video2;
        VideoTag videoTag2;
        hashCode();
        Aweme aweme = (Aweme) this.f92231m;
        if (aweme != null) {
            aweme.getAid();
        }
        Aweme aweme2 = (Aweme) this.f92231m;
        if (!(aweme2 == null || (video2 = aweme2.getVideo()) == null || (videoTag2 = video2.getVideoTag()) == null)) {
            videoTag2.getTitle();
        }
        Aweme aweme3 = (Aweme) this.f92231m;
        if (aweme3 == null || (video = aweme3.getVideo()) == null || (videoTag = video.getVideoTag()) == null || !C80538hl.m139614a(videoTag.getTitle())) {
            TextView textView = this.f99033K;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        float a2 = ((float) C89271h.m154762a(videoTag.getOpacity(), 0, 100)) / 100.0f;
        Integer a3 = C80231ay.m139068a(videoTag.getBackgroundColor());
        Integer a4 = C80231ay.m139068a(videoTag.getFontColor());
        TextView textView2 = this.f99033K;
        if (textView2 != null) {
            textView2.setVisibility(0);
            textView2.setText(videoTag.getTitle());
            textView2.setAlpha(a2);
            if (a4 != null) {
                i = a4.intValue();
            } else {
                i = -1;
            }
            textView2.setTextColor(i);
            if (a3 != null) {
                a = C80291cb.m139199a(a3.intValue(), f99021aj);
            } else {
                a = C0643b.m2369a(textView2.getContext(), (int) R.drawable.bcz);
            }
            textView2.setBackground(a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.n.c$k */
    static final class CallableC42490k<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC42476c f99090a;

        /* renamed from: b */
        final /* synthetic */ String f99091b;

        /* renamed from: c */
        final /* synthetic */ int f99092c;

        /* renamed from: d */
        final /* synthetic */ String f99093d;

        /* renamed from: e */
        final /* synthetic */ String f99094e;

        static {
            Covode.recordClassIndex(50578);
        }

        CallableC42490k(View$OnClickListenerC42476c cVar, String str, int i, String str2, String str3) {
            this.f99090a = cVar;
            this.f99091b = str;
            this.f99092c = i;
            this.f99093d = str2;
            this.f99094e = str3;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            String str2;
            Integer num;
            String str3;
            String str4;
            Video video;
            VideoTag videoTag;
            C67469ad c;
            AbstractC67567q a = C67486am.m119564a();
            String str5 = "";
            if (a == null || (c = a.mo106431c()) == null || (str = c.f151152b) == null) {
                str = str5;
            }
            Map<String, String> linkedHashMap = new LinkedHashMap<>();
            Aweme aweme = (Aweme) this.f99090a.f92231m;
            String str6 = null;
            if (aweme == null || (video = aweme.getVideo()) == null || (videoTag = video.getVideoTag()) == null) {
                str2 = null;
            } else {
                str2 = videoTag.getEnglishTitle();
            }
            if (str2 != null && str2.length() > 0) {
                linkedHashMap.put("video_tag", str2);
            }
            VideoAnchorView videoAnchorView = this.f99090a.f99058b;
            if (videoAnchorView != null && videoAnchorView.getVisibility() == 0) {
                Aweme aweme2 = (Aweme) ((AbstractC39054a) this.f99090a).f92231m;
                if (aweme2 != null) {
                    str4 = C67718a.m119883a(aweme2);
                } else {
                    str4 = str5;
                }
                linkedHashMap.put("anchor_info", str4);
            }
            if (this.f99090a.f99064h != 1 || C67338a.m119381a()) {
                Aweme aweme3 = (Aweme) this.f99090a.f92231m;
                C89219l.m154716b(aweme3, str5);
                String str7 = this.f99091b;
                C67568r F = this.f99090a.mo70877F();
                int i = this.f99092c;
                String str8 = this.f99093d;
                String str9 = this.f99094e;
                C89219l.m154721d(aweme3, str5);
                C89219l.m154721d(str7, str5);
                C89219l.m154721d(F, str5);
                C89219l.m154721d(str, str5);
                C67718a.C67719a aVar = new C67718a.C67719a(aweme3);
                C67718a.C67720b bVar = new C67718a.C67720b(aweme3);
                Video video2 = aweme3.getVideo();
                if (video2 == null || video2.getAiCover() == null || C67718a.m119888e(aweme3)) {
                    Video video3 = aweme3.getVideo();
                    if ((video3 == null || video3.getAiCover() == null) && C67718a.m119888e(aweme3)) {
                        str6 = (String) bVar.invoke();
                        num = 1;
                    } else {
                        Video video4 = aweme3.getVideo();
                        if (video4 == null || video4.getAiCover() == null || !C67718a.m119888e(aweme3)) {
                            num = null;
                        } else {
                            str6 = (String) bVar.invoke();
                            if (str6 == null) {
                                str6 = (String) aVar.invoke();
                            }
                            num = 2;
                        }
                    }
                } else {
                    str6 = (String) aVar.invoke();
                    num = 0;
                }
                int i2 = -1;
                if (aweme3.getRank() != -1) {
                    i = aweme3.getRank();
                }
                C67500au auVar = new C67500au(F);
                auVar.mo106459o(str7);
                auVar.mo106483c(C48027ac.C48028a.f111257a.mo80055a(aweme3.getRequestId()));
                auVar.mo106482b(str);
                auVar.mo106453i(C59208ac.m108771e(aweme3));
                auVar.mo96788a(C80632w.m139801a(aweme3, C67500au.f151194e, str7, F));
                auVar.mo106479a(Integer.valueOf(i));
                if (str6 != null) {
                    str5 = str6;
                }
                auVar.mo106452c("cover_type", str5);
                if (num != null) {
                    i2 = num.intValue();
                }
                auVar.mo96785a("ai_cover", i2);
                if (str8 == null) {
                    str8 = "normal";
                }
                auVar.mo96786a("use_scenario", str8);
                if (str9 == null) {
                    str9 = "normal";
                }
                auVar.mo96786a("tns_ban_type", str9);
                auVar.mo96788a(linkedHashMap);
                auVar.mo96792f();
            } else {
                if (C89219l.m154714a((Object) this.f99090a.mo70877F().f151327v, (Object) str5)) {
                    str3 = "playlist";
                } else {
                    str3 = this.f99090a.mo70877F().f151327v;
                }
                Aweme aweme4 = (Aweme) this.f99090a.f92231m;
                C89219l.m154716b(aweme4, str5);
                ((C67542d) ((C67542d) ((C67540c) new C67498at(this.f99090a.mo70877F()).mo106480a(this.f99090a.mo70877F().f151314i).mo106459o(this.f99090a.mo70877F().f151312g)).mo106487g(aweme4.getGroupId()).mo106482b(str)).mo106497x(str3)).mo106496w("0").mo96792f();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: U */
    private final void m84915U() {
        PlayListInfo playListInfo;
        int i;
        ViewGroup.LayoutParams layoutParams;
        Integer mixSrc;
        Aweme aweme = (Aweme) this.f92231m;
        if (aweme != null && (playListInfo = aweme.playlist_info) != null) {
            Integer mixSrc2 = playListInfo.getMixSrc();
            if (mixSrc2 != null) {
                i = mixSrc2.intValue();
            } else {
                i = 0;
            }
            this.f99064h = i;
            if (C41556z.m83492c() || (C41556z.m83493d() && this.f99064h == 0)) {
                View view = this.f99036N;
                if (view != null) {
                    view.setVisibility(0);
                    return;
                }
                return;
            }
            String str = "";
            if (C41556z.m83493d() && (mixSrc = playListInfo.getMixSrc()) != null && mixSrc.intValue() == 1 && C67338a.m119382b()) {
                TuxTextView tuxTextView = this.f99035M;
                if (tuxTextView != null) {
                    tuxTextView.setVisibility(0);
                }
                TextView textView = this.f99026D;
                Resources system = Resources.getSystem();
                C89219l.m154716b(system, str);
                C11279p.m20015b(textView, C89241a.m154730a(TypedValue.applyDimension(1, 4.0f, system.getDisplayMetrics())));
                TuxTextView tuxTextView2 = this.f99035M;
                if (tuxTextView2 != null) {
                    tuxTextView2.setTuxFont(62);
                }
                TuxTextView tuxTextView3 = this.f99035M;
                if (tuxTextView3 != null) {
                    C17191a.C17192a aVar = new C17191a.C17192a();
                    String mixName = playListInfo.getMixName();
                    if (mixName != null) {
                        str = mixName;
                    }
                    tuxTextView3.setText(m84921a(new C23142d(aVar.mo27179b(str).f40973a)));
                }
            } else if (C67338a.m119383c() && this.f99064h == 1) {
                m84924a(playListInfo);
                View view2 = this.itemView;
                C89219l.m154716b(view2, str);
                int b = C0699a.m2464b(C0643b.m2378c(view2.getContext(), R.color.bi), 0);
                View view3 = this.f99031I;
                if (view3 != null) {
                    View view4 = this.itemView;
                    C89219l.m154716b(view4, str);
                    int[] iArr = {b, C0643b.m2378c(view4.getContext(), R.color.bi)};
                    GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                    Resources system2 = Resources.getSystem();
                    C89219l.m154709a((Object) system2, str);
                    view3.setBackground(C80291cb.m139201a(iArr, orientation, TypedValue.applyDimension(1, 2.0f, system2.getDisplayMetrics())));
                }
                View view5 = this.f99031I;
                if (!(view5 == null || (layoutParams = view5.getLayoutParams()) == null)) {
                    Resources system3 = Resources.getSystem();
                    C89219l.m154716b(system3, str);
                    layoutParams.height = C89241a.m154730a(TypedValue.applyDimension(1, 75.0f, system3.getDisplayMetrics()));
                }
                View P = m84910P();
                if (P != null) {
                    P.setBackgroundColor(0);
                }
                MixFeedService.m109435k().mo97320a(mo70877F().f151312g, playListInfo.getMixId(), ((Aweme) this.f92231m).getGroupId(), ((Aweme) this.f92231m).getAuthorUid(), m84925aa());
            } else if (C67338a.m119384d() && this.f99064h == 1) {
                m84924a(playListInfo);
                View view6 = this.f99031I;
                if (view6 != null) {
                    view6.setVisibility(8);
                }
                View P2 = m84910P();
                if (P2 != null) {
                    View view7 = this.itemView;
                    C89219l.m154716b(view7, str);
                    P2.setBackgroundColor(C0643b.m2378c(view7.getContext(), R.color.a4));
                }
                MixFeedService.m109435k().mo97320a(mo70877F().f151312g, playListInfo.getMixId(), ((Aweme) this.f92231m).getGroupId(), ((Aweme) this.f92231m).getAuthorUid(), m84925aa());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2795n.AbstractC42474a
    /* renamed from: D */
    public final void mo72622D() {
        long j;
        AwemeStatistics statistics;
        User author;
        String nickname;
        boolean z;
        SpannableString spannableString;
        if (this.f92231m != null) {
            m84918X();
            mo72625H();
            Object obj = this.f92231m;
            C89219l.m154716b(obj, "");
            int i = 0;
            if (TextUtils.isEmpty(((Aweme) obj).getDesc()) || !C41520as.m83461b()) {
                TextView textView = this.f99073x;
                if (textView == null) {
                    C89219l.m154710a("txtDesc");
                }
                textView.setText("");
                TextView textView2 = this.f99073x;
                if (textView2 == null) {
                    C89219l.m154710a("txtDesc");
                }
                textView2.setVisibility(8);
            } else {
                LinearLayout linearLayout = this.f99027E;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                TextView textView3 = this.f99073x;
                if (textView3 == null) {
                    C89219l.m154710a("txtDesc");
                }
                textView3.setVisibility(0);
                Object obj2 = this.f92231m;
                C89219l.m154716b(obj2, "");
                List<TextExtraStruct> textExtra = ((Aweme) obj2).getTextExtra();
                Object obj3 = this.f92231m;
                C89219l.m154716b(obj3, "");
                String desc = ((Aweme) obj3).getDesc();
                this.f92231m = CommerceChallengeServiceImpl.m75741e().mo65378a((Aweme) this.f92231m);
                if (!C41555y.m83489a() || m84914T()) {
                    z = false;
                } else {
                    z = true;
                    TextView textView4 = this.f99073x;
                    if (textView4 == null) {
                        C89219l.m154710a("txtDesc");
                    }
                    if (!(textView4 instanceof TuxTextView)) {
                        textView4 = null;
                    }
                    TuxTextView tuxTextView = (TuxTextView) textView4;
                    if (tuxTextView != null) {
                        View view = this.itemView;
                        C89219l.m154716b(view, "");
                        tuxTextView.setTextColor(view.getResources().getColor(R.color.c4));
                        tuxTextView.setTuxFont(41);
                    }
                }
                Object obj4 = this.f92231m;
                C89219l.m154716b(obj4, "");
                if (((Aweme) obj4).getSearchDesc() != null) {
                    if (z) {
                        Object obj5 = this.f92231m;
                        C89219l.m154716b(obj5, "");
                        if (((Aweme) obj5).getHighlightInfoList() != null) {
                            C42014f fVar = this.f99025C;
                            if (fVar == null) {
                                C89219l.m154710a("highlightHelper");
                            }
                            Object obj6 = this.f92231m;
                            C89219l.m154716b(obj6, "");
                            String searchDesc = ((Aweme) obj6).getSearchDesc();
                            C89219l.m154716b(searchDesc, "");
                            spannableString = fVar.mo71198a(searchDesc, "search_desc", 0);
                        }
                    }
                    Object obj7 = this.f92231m;
                    C89219l.m154716b(obj7, "");
                    spannableString = new SpannableString(((Aweme) obj7).getSearchDesc());
                } else {
                    Object obj8 = this.f92231m;
                    C89219l.m154716b(obj8, "");
                    spannableString = new SpannableString(((Aweme) obj8).getDesc());
                }
                TextView textView5 = this.f99073x;
                if (textView5 == null) {
                    C89219l.m154710a("txtDesc");
                }
                textView5.setText(spannableString);
                ICommerceChallengeService e = CommerceChallengeServiceImpl.m75741e();
                TextView textView6 = this.f99073x;
                if (textView6 == null) {
                    C89219l.m154710a("txtDesc");
                }
                e.mo65381a(textView6, (Aweme) this.f92231m, spannableString, "search_hashtag");
                Object obj9 = this.f92231m;
                C89219l.m154716b(obj9, "");
                ((Aweme) obj9).setTextExtra(textExtra);
                Object obj10 = this.f92231m;
                C89219l.m154716b(obj10, "");
                ((Aweme) obj10).setDesc(desc);
                int i2 = C41553w.f96909a;
                if (i2 > 0) {
                    TextView textView7 = this.f99073x;
                    if (textView7 == null) {
                        C89219l.m154710a("txtDesc");
                    }
                    textView7.setMaxLines(i2);
                }
            }
            Aweme aweme = (Aweme) this.f92231m;
            if (!(aweme == null || (author = aweme.getAuthor()) == null)) {
                TextView textView8 = this.f99023A;
                if (textView8 == null) {
                    C89219l.m154710a("txtAuthorName");
                }
                if (C80580in.m139700m(author)) {
                    nickname = author.getUniqueId();
                } else {
                    nickname = author.getNickname();
                }
                textView8.setText(nickname);
                if (C80538hl.m139614a(author.getCustomVerify())) {
                    ImageView imageView = this.f99034L;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                } else {
                    ImageView imageView2 = this.f99034L;
                    if (imageView2 != null) {
                        imageView2.setVisibility(8);
                    }
                }
                C20766v a = C20761r.m39060a(C34735v.m70965a(author.getAvatarThumb())).mo34185b(C80397em.m139369a(100)).mo34179a("AbsCellViewHolder");
                SmartCircleImageView smartCircleImageView = this.f99075z;
                if (smartCircleImageView == null) {
                    C89219l.m154710a("authorAvatar");
                }
                a.f49092E = smartCircleImageView;
                a.mo34186c();
            }
            TextView textView9 = this.f99074y;
            if (textView9 == null) {
                C89219l.m154710a("txtLikeCount");
            }
            textView9.setVisibility(0);
            Aweme aweme2 = (Aweme) this.f92231m;
            if (aweme2 == null || (statistics = aweme2.getStatistics()) == null) {
                j = -1;
            } else {
                j = statistics.getDiggCount();
            }
            this.f99040R = j;
            Aweme aweme3 = (Aweme) this.f92231m;
            if (aweme3 != null) {
                i = aweme3.getUserDigg();
            }
            this.f99063g = i;
            mo72637N();
            TagLayout tagLayout = this.f99024B;
            if (tagLayout == null) {
                C89219l.m154710a("tagLayout");
            }
            tagLayout.setEventType(this.f99049aa);
            if (((Aweme) this.f92231m).getVideoLabels() != null) {
                TagLayout tagLayout2 = this.f99024B;
                if (tagLayout2 == null) {
                    C89219l.m154710a("tagLayout");
                }
                tagLayout2.mo61317a((Aweme) this.f92231m, ((Aweme) this.f92231m).getVideoLabels(), new TagLayout.C34666a(16));
            }
            m84919Y();
            m84920Z();
            m84916V();
            m84915U();
            if (C41499ag.m83448c()) {
                m84917W();
            }
            Object obj11 = this.f92231m;
            C89219l.m154716b(obj11, "");
            m84928c((Aweme) obj11);
        }
    }

    /* renamed from: a */
    public final void mo72640a(View$OnAttachStateChangeListenerC41864g gVar) {
        if (gVar != null && C41886h.m83908b()) {
            this.f99052ad = gVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.n.c$a */
    static final class C42479a<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC42476c f99079a;

        static {
            Covode.recordClassIndex(50567);
        }

        C42479a(View$OnClickListenerC42476c cVar) {
            this.f99079a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            int i = this.f99079a.f99069s;
            if (num != null && num.intValue() == i) {
                this.f99079a.bi_();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.n.c$d */
    public static final class C42483d extends AbstractC89220m implements AbstractC89172b<ViewGroup.LayoutParams, C89391z> {

        /* renamed from: a */
        public static final C42483d f99082a = new C42483d();

        static {
            Covode.recordClassIndex(50571);
        }

        C42483d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(ViewGroup.LayoutParams layoutParams) {
            ViewGroup.LayoutParams layoutParams2 = layoutParams;
            C89219l.m154721d(layoutParams2, "");
            if (!(layoutParams2 instanceof ConstraintLayout.C0547a)) {
                layoutParams2 = null;
            }
            ConstraintLayout.C0547a aVar = (ConstraintLayout.C0547a) layoutParams2;
            if (aVar != null) {
                aVar.f2272j = R.id.fcp;
                aVar.bottomMargin = (int) C80284by.m139183a(5);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.n.c$m */
    public static final class C42492m extends AbstractC89220m implements AbstractC89172b<C67427a, List<? extends C67394a>> {

        /* renamed from: a */
        public static final C42492m f99096a = new C42492m();

        static {
            Covode.recordClassIndex(50580);
        }

        C42492m() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ List<? extends C67394a> invoke(C67427a aVar) {
            C67427a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            List<C67394a> list = aVar2.f151066b;
            if (list == null || !(!list.isEmpty())) {
                return C89086z.INSTANCE;
            }
            return list;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2969u.AbstractC49991w
    /* renamed from: a */
    public final void mo72644a(Exception exc) {
        Aweme aweme = (Aweme) ((AbstractC39054a) this).f92231m;
        int i = 1;
        if (aweme != null && aweme.getUserDigg() == 1) {
            i = 0;
        }
        m84926b(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39062g, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39059e
    /* renamed from: b */
    public final void mo66994b(boolean z) {
        super.mo66994b(z);
        SmartImageView O = m84909O();
        if (O != null) {
            O.setAttached(z);
            if (!z) {
                C41861d.m83860b(O);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.n.c$e */
    public static final class C42484e extends AbstractC89220m implements AbstractC89172b<ViewGroup.LayoutParams, C89391z> {

        /* renamed from: a */
        public static final C42484e f99083a = new C42484e();

        static {
            Covode.recordClassIndex(50572);
        }

        C42484e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(ViewGroup.LayoutParams layoutParams) {
            ViewGroup.LayoutParams layoutParams2 = layoutParams;
            C89219l.m154721d(layoutParams2, "");
            if (!(layoutParams2 instanceof ConstraintLayout.C0547a)) {
                layoutParams2 = null;
            }
            ConstraintLayout.C0547a aVar = (ConstraintLayout.C0547a) layoutParams2;
            if (aVar != null) {
                aVar.f2272j = R.id.fcm;
                aVar.bottomMargin = (int) C80284by.m139183a(10);
            }
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private View$OnClickListenerC42476c(View view) {
        super(view);
        C89219l.m154721d(view, "");
        this.f99048Z = C41554x.m83488a();
        this.f99069s = -1;
        this.f99055ag = C89250i.m154773a((AbstractC89171a) new C42497q(this));
        this.f99056ah = C89250i.m154773a((AbstractC89171a) C42481c.f99080a);
        this.f99057ai = C89250i.m154773a((AbstractC89171a) new C42493n(this));
    }

    /* renamed from: b */
    private final void m84926b(int i) {
        if (i == 1) {
            C48317al.m91755a(C48317al.m91756b() + 1);
            this.f99040R++;
            this.f99063g = 1;
        } else if (i == 0) {
            C48317al.m91755a(Math.max(C48317al.m91756b() - 1, 0));
            this.f99040R = Math.max(this.f99040R - 1, 0L);
            this.f99063g = 0;
        }
        mo72637N();
        mo72633J();
    }

    /* renamed from: a */
    public final void mo72643a(AbstractC51043a aVar) {
        SearchPlayerCore core;
        SearchPlayerCore core2;
        this.f99062f = aVar;
        if (aVar != null) {
            SearchVideoView I = mo72632I();
            if (!(I == null || (core2 = I.getCore()) == null)) {
                core2.setContainerStatusProvider(aVar);
            }
            SearchVideoView I2 = mo72632I();
            if (I2 != null && (core = I2.getCore()) != null) {
                core.setVideoUiListener(m84911Q());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.n.c$i */
    static final class C42488i extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C42488i f99088a = new C42488i();

        static {
            Covode.recordClassIndex(50576);
        }

        C42488i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            int i;
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            Resources system = Resources.getSystem();
            C89219l.m154716b(system, "");
            aVar2.f54432b = C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154716b(system2, "");
            aVar2.f54433c = C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system2.getDisplayMetrics()));
            if (C41857a.m83848a()) {
                i = R.raw.icon_speaker_x_mark_fill_ltr;
            } else {
                i = R.raw.icon_speaker_2_ltr;
            }
            aVar2.f54431a = i;
            aVar2.f54435e = Integer.valueOf((int) R.attr.aa);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.n.c$j */
    static final class View$OnClickListenerC42489j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC42476c f99089a;

        static {
            Covode.recordClassIndex(50577);
        }

        View$OnClickListenerC42489j(View$OnClickListenerC42476c cVar) {
            this.f99089a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            boolean z = true;
            int i = !C41857a.m83848a() ? 1 : 0;
            C41857a.f97656a = i;
            C34883a.f82329a.f82330b.storeInt("key_search_auto_play_sound", i);
            SearchPlayerCore a = C41861d.m83857a(this.f99089a);
            if (a != null) {
                if (!C41857a.m83848a() && !C80635y.m139807b((Aweme) ((AbstractC39054a) this.f99089a).f92231m)) {
                    z = false;
                }
                a.setMute(z);
            }
            SearchPlayerCore a2 = C41861d.m83857a(this.f99089a);
            if (a2 != null) {
                a2.mo60587e();
            }
            this.f99089a.mo72635L();
            this.f99089a.mo72634K();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.n.c$l */
    public static final class C42491l extends AbstractC89220m implements AbstractC89172b<AnchorCommonStruct, C67427a> {

        /* renamed from: a */
        public static final C42491l f99095a = new C42491l();

        static {
            Covode.recordClassIndex(50579);
        }

        C42491l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C67427a invoke(AnchorCommonStruct anchorCommonStruct) {
            JSONArray a;
            List<C67394a> list;
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            if (!(anchorCommonStruct2 == null || (a = C80359du.m139328a(anchorCommonStruct2.getExtra())) == null)) {
                ArrayList arrayList = new ArrayList();
                int length = a.length();
                for (int i = 0; i < length; i++) {
                    Object obj = a.get(i);
                    if (!(obj instanceof JSONObject)) {
                        obj = null;
                    }
                    JSONObject jSONObject = (JSONObject) obj;
                    Object a2 = C80359du.m139327a((C27910f) C67398b.f151003a.getValue(), jSONObject != null ? jSONObject.optString("extra") : null, C67394a.class);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
                C67427a aVar = new C67427a(anchorCommonStruct2.getIcon(), arrayList);
                if (aVar == null || (list = aVar.f151066b) == null || !(!list.isEmpty())) {
                    return null;
                }
                return aVar;
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.n.c$o */
    public static final class C42495o extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C42495o f99099a = new C42495o();

        static {
            Covode.recordClassIndex(50583);
        }

        C42495o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_playlist_fill;
            aVar2.f54435e = Integer.valueOf((int) R.attr.aa);
            Resources system = Resources.getSystem();
            C89219l.m154716b(system, "");
            aVar2.f54433c = C89241a.m154730a(TypedValue.applyDimension(1, 14.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154716b(system2, "");
            aVar2.f54432b = C89241a.m154730a(TypedValue.applyDimension(1, 14.0f, system2.getDisplayMetrics()));
            if (C41499ag.m83448c()) {
                aVar2.f54436f = true;
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private final SpannableStringBuilder m84921a(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        C22999a a = C23005c.m43393a(C42495o.f99099a);
        View view = this.itemView;
        C89219l.m154716b(view, "");
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        C23127c b = a.mo37369b(context);
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        Context context2 = view2.getContext();
        C89219l.m154716b(context2, "");
        boolean a2 = C23163i.m43663a(context2);
        Resources system = Resources.getSystem();
        C89219l.m154716b(system, "");
        b.mo37614a(a2, C89241a.m154730a(TypedValue.applyDimension(1, 4.0f, system.getDisplayMetrics())));
        spannableStringBuilder.append((CharSequence) "0");
        spannableStringBuilder.setSpan(b, 0, 1, 17);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: b */
    private final void m84927b(Aweme aweme) {
        int i;
        AbstractC89306h f;
        List<C67394a> list;
        if (C67430c.m119464a()) {
            List<AnchorCommonStruct> anchors = aweme.getAnchors();
            if (anchors != null) {
                C67394a aVar = null;
                if ((!anchors.isEmpty()) && (f = C89309k.m154811f(C89070n.m154598r(anchors), C42491l.f99095a)) != null) {
                    C67427a aVar2 = (C67427a) C89309k.m154808d(f);
                    this.f99053ae = aVar2;
                    if (!(aVar2 == null || (list = aVar2.f151066b) == null)) {
                        aVar = (C67394a) C89070n.m154583g((List) list);
                    }
                    this.f99054af = aVar;
                    i = C89309k.m154816j(C89309k.m154805c(f, C42492m.f99096a));
                    aweme.setTotalProductAnchors(i);
                }
            }
            i = 0;
            aweme.setTotalProductAnchors(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.n.c$h */
    static final class View$OnClickListenerC42487h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC42476c f99087a;

        static {
            Covode.recordClassIndex(50575);
        }

        View$OnClickListenerC42487h(View$OnClickListenerC42476c cVar) {
            this.f99087a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f99087a.f99063g == 1) {
                this.f99087a.mo72638a(0);
                C59263y a = new C59263y("like_cancel").mo96852a(this.f99087a.mo70877F().f151312g);
                a.f135431Z = this.f99087a.mo70877F().f151309d;
                AbstractC59242h l = a.mo96810l(this.f99087a.mo70877F().f151314i);
                Aweme aweme = (Aweme) this.f99087a.f92231m;
                C89219l.m154716b(aweme, "");
                C59263y yVar = (C59263y) l.mo96804f(aweme.getAid());
                yVar.f135430Y = this.f99087a.mo70877F().f151311f;
                yVar.f135433aa = "0";
                yVar.mo96749g((Aweme) this.f99087a.f92231m).mo96792f();
                return;
            }
            this.f99087a.mo72638a(1);
            C59263y a2 = new C59263y().mo96852a(this.f99087a.mo70877F().f151312g);
            a2.f135431Z = this.f99087a.mo70877F().f151309d;
            AbstractC59242h l2 = a2.mo96810l(this.f99087a.mo70877F().f151314i);
            Aweme aweme2 = (Aweme) this.f99087a.f92231m;
            C89219l.m154716b(aweme2, "");
            C59263y yVar2 = (C59263y) l2.mo96804f(aweme2.getAid());
            yVar2.f135430Y = this.f99087a.mo70877F().f151311f;
            yVar2.f135433aa = "0";
            yVar2.mo96749g((Aweme) this.f99087a.f92231m).mo96792f();
        }
    }

    /* renamed from: a */
    private final void m84922a(SearchVideoView searchVideoView) {
        hashCode();
        if (searchVideoView != null) {
            Integer.valueOf(searchVideoView.hashCode());
            searchVideoView.setEnableLifecycleObserver(true);
            searchVideoView.setEnableHideCoverAnim(true);
            searchVideoView.setMCoverView(this.f92232n);
            AbstractC51043a aVar = this.f99062f;
            if (aVar != null) {
                SearchPlayerCore core = searchVideoView.getCore();
                if (core != null) {
                    core.setContainerStatusProvider(aVar);
                }
                SearchPlayerCore core2 = searchVideoView.getCore();
                if (core2 != null) {
                    core2.setVideoUiListener(m84911Q());
                }
            }
            if (Build.VERSION.SDK_INT >= 21) {
                searchVideoView.setOutlineProvider(new C80508gp((int) C80284by.m139183a(2)));
                searchVideoView.setClipToOutline(true);
            }
            C34246c dataProvider = searchVideoView.getDataProvider();
            if (dataProvider != null) {
                dataProvider.f80996m = new C42486g(this, searchVideoView);
            }
            C42333a aVar2 = this.f99066j;
            if (aVar2 != null) {
                aVar2.mo71526a(this.f92232n, searchVideoView);
            }
        }
    }

    /* renamed from: c */
    private final void m84928c(Aweme aweme) {
        C67394a aVar;
        String str;
        Fragment g;
        VideoAnchorView videoAnchorView = this.f99058b;
        if (videoAnchorView != null) {
            C11279p.m20006a(videoAnchorView);
        }
        if (C67430c.m119464a() && !C37699a.m76314s(aweme) && (aVar = this.f99054af) != null) {
            Integer num = null;
            if (C80537hk.m139613a(aVar.f150985a) && (str = aVar.f150985a) != null) {
                TuxTextView tuxTextView = this.f99035M;
                if (tuxTextView == null || tuxTextView.getVisibility() != 0) {
                    VideoAnchorView videoAnchorView2 = this.f99058b;
                    if (videoAnchorView2 != null && videoAnchorView2.mo106340a(aweme, this.f99053ae)) {
                        TextView textView = this.f99026D;
                        if (textView != null) {
                            C80594ix.m139735a(textView, C42484e.f99083a);
                        }
                        View view = this.f99031I;
                        if (view != null) {
                            C80594ix.m139736a(view, Integer.valueOf((int) C80284by.m139183a(80)));
                        }
                        AbstractC51043a aVar2 = this.f99062f;
                        if (!(aVar2 == null || (g = aVar2.mo60503g()) == null)) {
                            num = Integer.valueOf(g.hashCode());
                        }
                        String aid = aweme.getAid();
                        C89219l.m154716b(aid, "");
                        if (!C67428b.m119463a(num, aid, str)) {
                            Map<String, String> a = C67404c.m119438a(aweme, this.f99054af, this.f99070t);
                            aweme.getAid();
                            new C67407e().mo106450b(a).mo96792f();
                            return;
                        }
                        return;
                    }
                    return;
                }
                C80594ix.m139735a(this.f99026D, C42483d.f99082a);
            }
        }
    }

    /* renamed from: a */
    private final void m84923a(Aweme aweme) {
        IAdSceneService f;
        ViewGroup viewGroup = this.f99059c;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        ViewGroup viewGroup2 = this.f99060d;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
        AwemeRawAd awemeRawAd = null;
        this.f99071u = null;
        if (C37699a.m76314s(aweme) && (f = AdSceneServiceImpl.m33210f()) != null) {
            this.f99071u = f.mo28467d();
            C17896c cVar = new C17896c();
            TextView textView = this.f99026D;
            if (textView != null) {
                textView.setVisibility(8);
            }
            cVar.f42655b = new C42485f(this);
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            }
            cVar.f42658a = awemeRawAd;
            AbstractC17891a aVar = this.f99071u;
            if (aVar != null) {
                aVar.mo28473a(cVar);
            }
        }
    }

    /* renamed from: a */
    private final void m84924a(PlayListInfo playListInfo) {
        int i;
        long j;
        TextView textView = this.f99026D;
        if (textView != null) {
            textView.setVisibility(8);
        }
        View P = m84910P();
        if (P != null) {
            P.setVisibility(0);
        }
        TuxTextView tuxTextView = this.f99045W;
        if (tuxTextView != null) {
            Context context = this.f99020a;
            Long updateTime = playListInfo.getUpdateTime();
            if (updateTime != null) {
                j = updateTime.longValue();
            } else {
                j = 0;
            }
            tuxTextView.setText(C80566ib.m139655e(context, j * 1000));
        }
        TuxTextView tuxTextView2 = this.f99045W;
        if (tuxTextView2 != null) {
            tuxTextView2.setTuxFont(72);
        }
        String a = C1764a.m5928a(this.f99020a.getText(R.string.fge).toString(), Arrays.copyOf(new Object[]{playListInfo.getItemTotal()}, 1));
        C89219l.m154716b(a, "");
        TuxTextView tuxTextView3 = this.f99044V;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(m84921a((CharSequence) a));
        }
        TuxTextView tuxTextView4 = this.f99044V;
        if (tuxTextView4 != null) {
            tuxTextView4.setTuxFont(52);
        }
        C17191a.C17192a aVar = new C17191a.C17192a();
        String mixName = playListInfo.getMixName();
        if (mixName == null) {
            mixName = "";
        }
        C23142d dVar = new C23142d(aVar.mo27179b(mixName).f40973a);
        dVar.mo37628a(42);
        TextView textView2 = this.f99073x;
        if (textView2 == null) {
            C89219l.m154710a("txtDesc");
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) dVar);
        View view = this.itemView;
        C89219l.m154716b(view, "");
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C0643b.m2378c(view.getContext(), R.color.bx));
        String mixName2 = playListInfo.getMixName();
        if (mixName2 != null) {
            i = mixName2.length();
        } else {
            i = 0;
        }
        spannableStringBuilder.setSpan(foregroundColorSpan, 0, i, 33);
        textView2.setText(spannableStringBuilder);
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0297  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r22) {
        /*
        // Method dump skipped, instructions count: 777
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.p2795n.View$OnClickListenerC42476c.onClick(android.view.View):void");
    }

    /* renamed from: a */
    public final void mo72638a(int i) {
        String str;
        Long l;
        AwemeStatistics statistics;
        TextView textView = this.f99074y;
        if (textView == null) {
            C89219l.m154710a("txtLikeCount");
        }
        Context context = textView.getContext();
        C89219l.m154716b(context, "");
        if (C80422fe.m139425a(context)) {
            m84926b(i);
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (!g.isLogin()) {
                Aweme aweme = (Aweme) this.f92231m;
                if (!(aweme == null || (statistics = aweme.getStatistics()) == null)) {
                    statistics.setDiggCount(this.f99040R);
                }
                Aweme aweme2 = (Aweme) this.f92231m;
                if (aweme2 != null) {
                    aweme2.setUserDigg(this.f99063g);
                    return;
                }
                return;
            }
            HashMap hashMap = new HashMap();
            Object obj = this.f92231m;
            C89219l.m154716b(obj, "");
            String aid = ((Aweme) obj).getAid();
            C89219l.m154716b(aid, "");
            hashMap.put("aweme_id", aid);
            hashMap.put(StringSet.type, String.valueOf(i));
            hashMap.put("channel_id", String.valueOf(C33721c.m69041a("search_result")));
            Long l2 = null;
            if (this.f92231m == null || !((Aweme) this.f92231m).isAd()) {
                C50535d.m94740a("search_result", null, hashMap);
            } else {
                Context context2 = this.f99020a;
                C89219l.m154716b(context2, "");
                AwemeRawAd awemeRawAd = ((Aweme) this.f92231m).getAwemeRawAd();
                if (awemeRawAd != null) {
                    str = awemeRawAd.getLogExtra();
                } else {
                    str = null;
                }
                AwemeRawAd awemeRawAd2 = ((Aweme) this.f92231m).getAwemeRawAd();
                if (awemeRawAd2 != null) {
                    l = awemeRawAd2.getAdId();
                } else {
                    l = null;
                }
                String valueOf = String.valueOf(l);
                AwemeRawAd awemeRawAd3 = ((Aweme) this.f92231m).getAwemeRawAd();
                if (awemeRawAd3 != null) {
                    l2 = awemeRawAd3.getCreativeId();
                }
                C50535d.m94739a(context2, str, valueOf, String.valueOf(l2), hashMap);
            }
            C49959ac acVar = this.f99039Q;
            if (acVar == null) {
                C89219l.m154715b();
            }
            acVar.mo57616a(hashMap);
        }
    }

    /* renamed from: a */
    public final void mo72642a(Aweme aweme, int i, boolean z) {
        mo72641a(aweme, i, i, z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC42476c(View view, String str, AbstractC67364c cVar) {
        this(view, str, cVar, null);
        C89219l.m154721d(view, "");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC42476c(final View view, String str, AbstractC67364c cVar, ClickSearchViewModel clickSearchViewModel) {
        this(view);
        ViewStub viewStub;
        ViewStub viewStub2;
        C89219l.m154721d(view, "");
        MethodCollector.m26663i(6391);
        View findViewById = view.findViewById(R.id.ajd);
        C89219l.m154716b(findViewById, "");
        this.f99073x = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.c8p);
        C89219l.m154716b(findViewById2, "");
        this.f99074y = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.n2);
        C89219l.m154716b(findViewById3, "");
        this.f99075z = (SmartCircleImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.n4);
        C89219l.m154716b(findViewById4, "");
        this.f99023A = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.eer);
        C89219l.m154716b(findViewById5, "");
        this.f99024B = (TagLayout) findViewById5;
        this.f99026D = (TextView) view.findViewById(R.id.fcs);
        this.f99027E = (LinearLayout) view.findViewById(R.id.ccc);
        this.f99028F = (ViewStub) view.findViewById(R.id.dfs);
        this.f99029G = (ViewStub) view.findViewById(R.id.fcn);
        this.f99032J = (ViewStub) view.findViewById(R.id.fcu);
        this.f99033K = (TextView) view.findViewById(R.id.fcr);
        this.f99034L = (ImageView) view.findViewById(R.id.fco);
        this.f92232n = (SmartImageView) view.findViewById(R.id.afn);
        this.f99059c = (ViewGroup) view.findViewById(R.id.dqt);
        this.f99060d = (ViewGroup) view.findViewById(R.id.dqy);
        this.f99035M = (TuxTextView) view.findViewById(R.id.fcp);
        this.f99036N = view.findViewById(R.id.d3h);
        this.f99031I = view.findViewById(R.id.fct);
        this.f99037O = (TuxIconView) view.findViewById(R.id.e4b);
        this.f99038P = (FrameLayout) view.findViewById(R.id.e4c);
        this.f99041S = (LinearLayout) view.findViewById(R.id.ajl);
        this.f99042T = (ConstraintLayout) view.findViewById(R.id.n3);
        this.f99058b = (VideoAnchorView) view.findViewById(R.id.fcm);
        this.f99030H = (ViewStub) view.findViewById(R.id.fcq);
        Fragment fragment = null;
        if (C41886h.m83909c() && C41890j.m83914b() && mo72632I() == null && (viewStub = this.f99032J) != null && viewStub.getParent() != null && (viewStub2 = this.f99032J) != null) {
            viewStub2.setLayoutResource(R.layout.aw6);
            View inflate = viewStub2.inflate();
            this.f99065i = (SearchVideoView) (!(inflate instanceof SearchVideoView) ? null : inflate);
            m84922a(mo72632I());
        }
        TextView textView = this.f99073x;
        if (textView == null) {
            C89219l.m154710a("txtDesc");
        }
        textView.setOnClickListener(this);
        SmartCircleImageView smartCircleImageView = this.f99075z;
        if (smartCircleImageView == null) {
            C89219l.m154710a("authorAvatar");
        }
        smartCircleImageView.setOnClickListener(this);
        TextView textView2 = this.f99023A;
        if (textView2 == null) {
            C89219l.m154710a("txtAuthorName");
        }
        textView2.setOnClickListener(this);
        VideoAnchorView videoAnchorView = this.f99058b;
        if (videoAnchorView != null) {
            videoAnchorView.setOnClickListener(this);
        }
        view.setOnClickListener(this);
        if (((Number) C41497af.f96810a.getValue()).intValue() == 1) {
            TextView textView3 = this.f99074y;
            if (textView3 == null) {
                C89219l.m154710a("txtLikeCount");
            }
            textView3.setOnClickListener(new View$OnClickListenerC42487h(this));
        }
        TuxIconView tuxIconView = this.f99037O;
        if (tuxIconView != null) {
            tuxIconView.setTuxIcon(C23005c.m43393a(C42488i.f99088a));
        }
        FrameLayout frameLayout = this.f99038P;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new View$OnClickListenerC42489j(this));
        }
        if (!C41522at.m83463a()) {
            LinearLayout linearLayout = this.f99041S;
            if (linearLayout != null) {
                Resources system = Resources.getSystem();
                C89219l.m154716b(system, "");
                int a = C89241a.m154730a(TypedValue.applyDimension(1, 10.0f, system.getDisplayMetrics()));
                Resources system2 = Resources.getSystem();
                C89219l.m154716b(system2, "");
                linearLayout.setPadding(a, 0, C89241a.m154730a(TypedValue.applyDimension(1, 10.0f, system2.getDisplayMetrics())), 0);
            }
            LinearLayout linearLayout2 = this.f99041S;
            if (linearLayout2 != null) {
                Resources system3 = Resources.getSystem();
                C89219l.m154716b(system3, "");
                C11279p.m19999a(linearLayout2, C89241a.m154730a(TypedValue.applyDimension(1, 10.0f, system3.getDisplayMetrics())));
            }
            TextView textView4 = this.f99073x;
            if (textView4 == null) {
                C89219l.m154710a("txtDesc");
            } else {
                Resources system4 = Resources.getSystem();
                C89219l.m154716b(system4, "");
                C23163i.m43668b(textView4, 0, 0, 0, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 4.0f, system4.getDisplayMetrics()))), false, 16);
            }
            ConstraintLayout constraintLayout = this.f99042T;
            if (constraintLayout != null) {
                Resources system5 = Resources.getSystem();
                C89219l.m154716b(system5, "");
                C11279p.m20015b(constraintLayout, C89241a.m154730a(TypedValue.applyDimension(1, 10.0f, system5.getDisplayMetrics())));
            }
            ImageView imageView = this.f99034L;
            if (imageView != null) {
                Resources system6 = Resources.getSystem();
                C89219l.m154716b(system6, "");
                C23163i.m43668b(imageView, 0, 0, 0, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 5.0f, system6.getDisplayMetrics()))), false, 16);
            }
            SmartCircleImageView smartCircleImageView2 = this.f99075z;
            if (smartCircleImageView2 == null) {
                C89219l.m154710a("authorAvatar");
            }
            ViewGroup.LayoutParams layoutParams = smartCircleImageView2.getLayoutParams();
            Resources system7 = Resources.getSystem();
            C89219l.m154716b(system7, "");
            layoutParams.width = C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system7.getDisplayMetrics()));
            Resources system8 = Resources.getSystem();
            C89219l.m154716b(system8, "");
            layoutParams.height = C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system8.getDisplayMetrics()));
            SmartCircleImageView smartCircleImageView3 = this.f99075z;
            if (smartCircleImageView3 == null) {
                C89219l.m154710a("authorAvatar");
            } else {
                smartCircleImageView3.setLayoutParams(layoutParams);
            }
        }
        this.f99049aa = str;
        this.f99051ac = cVar;
        mo72633J();
        this.f99025C = new C42014f(new C42014f.AbstractC42017c(this) {
            /* class com.p2082ss.android.ugc.aweme.discover.p2795n.View$OnClickListenerC42476c.C424771 */

            /* renamed from: a */
            final /* synthetic */ View$OnClickListenerC42476c f99076a;

            static {
                Covode.recordClassIndex(50565);
            }

            @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42014f.AbstractC42017c
            /* renamed from: a */
            public final List<C67361d> mo70843a() {
                Aweme aweme = (Aweme) this.f99076a.f92231m;
                if (aweme != null) {
                    return aweme.getHighlightInfoList();
                }
                return null;
            }

            {
                this.f99076a = r1;
            }

            @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42014f.AbstractC42017c
            /* renamed from: a */
            public final List<Object> mo70844a(String str, String str2, Position position) {
                C89219l.m154721d(str, "");
                C89219l.m154721d(str2, "");
                C89219l.m154721d(position, "");
                if (str2.hashCode() != -539714872 || !str2.equals("search_desc")) {
                    return null;
                }
                return C89070n.m154525d(new ForegroundColorSpan(C0643b.m2378c(view.getContext(), R.color.bx)), new C42292a(C17300a.m32029a().mo27610a(C17303d.f41573g)));
            }
        });
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
            /* class com.p2082ss.android.ugc.aweme.discover.p2795n.View$OnClickListenerC42476c.View$OnAttachStateChangeListenerC424782 */

            /* renamed from: a */
            final /* synthetic */ View$OnClickListenerC42476c f99078a;

            static {
                Covode.recordClassIndex(50566);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f99078a = r1;
            }

            public final void onViewAttachedToWindow(View view) {
                String aid;
                String str = "";
                C89219l.m154721d(view, str);
                View$OnClickListenerC42476c cVar = this.f99078a;
                AbstractC17891a aVar = cVar.f99071u;
                if (aVar != null) {
                    aVar.mo28474a();
                }
                cVar.f99067q = true;
                C34181a.m69857a(cVar);
                ConcurrentHashMap<String, WeakReference<C67568r>> concurrentHashMap = C67704b.f151780n;
                Aweme aweme = (Aweme) ((AbstractC39054a) cVar).f92231m;
                if (!(aweme == null || (aid = aweme.getAid()) == null)) {
                    str = aid;
                }
                concurrentHashMap.put(str, new WeakReference<>(cVar.mo70877F()));
            }

            public final void onViewDetachedFromWindow(View view) {
                String aid;
                String str = "";
                C89219l.m154721d(view, str);
                View$OnClickListenerC42476c cVar = this.f99078a;
                cVar.f99067q = false;
                cVar.f99068r = false;
                C34181a.m69859b(cVar);
                ConcurrentHashMap<String, WeakReference<C67568r>> concurrentHashMap = C67704b.f151780n;
                Aweme aweme = (Aweme) ((AbstractC39054a) cVar).f92231m;
                if (!(aweme == null || (aid = aweme.getAid()) == null)) {
                    str = aid;
                }
                concurrentHashMap.remove(str);
                cVar.bi_();
            }
        });
        TextView textView5 = this.f99023A;
        if (textView5 == null) {
            C89219l.m154710a("txtAuthorName");
        }
        textView5.setTextDirection(5);
        ViewStub viewStub3 = this.f99028F;
        if (!(clickSearchViewModel == null || viewStub3 == null)) {
            C42479a aVar = new C42479a(this);
            C89219l.m154721d(aVar, "");
            NextLiveData<Integer> c = clickSearchViewModel.mo71523c();
            WeakReference<Fragment> weakReference = clickSearchViewModel.f98605a;
            C80375ef.m139355a(c, weakReference != null ? weakReference.get() : fragment, aVar);
            this.f99047Y = clickSearchViewModel;
            C42333a aVar2 = new C42333a(clickSearchViewModel, this, viewStub3);
            aVar2.mo71526a(this.f92232n);
            this.f99066j = aVar2;
        }
        C49959ac acVar = new C49959ac();
        this.f99039Q = acVar;
        acVar.mo67838a(new C49957aa());
        C49959ac acVar2 = this.f99039Q;
        if (acVar2 != null) {
            acVar2.mo67839a_(this);
            MethodCollector.m26664o(6391);
            return;
        }
        MethodCollector.m26664o(6391);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72641a(com.p2082ss.android.ugc.aweme.feed.model.Aweme r4, int r5, int r6, boolean r7) {
        /*
            r3 = this;
            super.mo67806a(r4, r5)
            if (r4 != 0) goto L_0x0006
            return
        L_0x0006:
            r3.m84923a(r4)
            r0 = 1
            r3.f99068r = r0
            r3.f92231m = r4
            r3.f99050ab = r7
            r3.f99069s = r6
            java.lang.Object r1 = r3.f92231m
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.p2082ss.android.ugc.aweme.feed.model.Aweme) r1
            r3.m84927b(r1)
            com.ss.android.ugc.aweme.search.k.r r2 = r3.mo70877F()
            h.f.a.b r0 = r3.m84912R()
            r2.mo106508a(r0)
            h.f.a.b r1 = r3.m84912R()
            java.lang.Object r0 = r3.f92231m
            java.lang.Object r0 = r1.invoke(r0)
            java.lang.String r0 = (java.lang.String) r0
            r2.mo106514c(r0)
            com.bytedance.lighten.loader.SmartImageView r0 = r3.f92232n
            m84896a(r0)
            boolean r0 = r3.f99050ab
            if (r0 == 0) goto L_0x0044
            r3.mo72622D()
        L_0x0044:
            r3.mo72633J()
            com.ss.android.ugc.aweme.discover.mixfeed.cs.a r0 = r3.f99066j
            if (r0 == 0) goto L_0x004e
            r0.mo71528c()
        L_0x004e:
            r3.mo72636M()
            r0 = 0
            r3.f99072v = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.p2795n.View$OnClickListenerC42476c.mo72641a(com.ss.android.ugc.aweme.feed.model.Aweme, int, int, boolean):void");
    }
}
