package com.p2082ss.android.ugc.aweme.feed.adapter;

import android.app.Activity;
import android.app.ActivityOptions;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.drawable.C0705a;
import androidx.core.p035f.C0680f;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.base.p177a.C2954a;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.android.livesdk.callback.AbstractC7258b;
import com.bytedance.android.livesdk.livesetting.feed.LiveForYouPageTagSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreviewCardEnableSrSetting;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6560m;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.android.livesdkapi.depend.model.p687c.C11690a;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11633b;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11639c;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11656k;
import com.bytedance.android.livesdkapi.p691g.C11771j;
import com.bytedance.android.livesdkapi.p700m.C11831d;
import com.bytedance.android.livesdkapi.service.AbstractC11843a;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.view.TextureRenderView;
import com.bytedance.android.widget.C12242b;
import com.bytedance.android.widget.DataCenter;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.ies.ugc.aweme.rich.p1274ui.C18156a;
import com.bytedance.ies.ugc.aweme.rich.p1274ui.RichTagView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.AbstractC22030d;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.adaptation.C33403c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarBorderView;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.commercialize.live.feedLive.AbstractC38121a;
import com.p2082ss.android.ugc.aweme.commercialize.live.p2575a.C38048a;
import com.p2082ss.android.ugc.aweme.commercialize.live.p2575a.C38049b;
import com.p2082ss.android.ugc.aweme.commercialize.live.p2575a.C38050c;
import com.p2082ss.android.ugc.aweme.commercialize.live.p2575a.C38051d;
import com.p2082ss.android.ugc.aweme.commercialize.live.service.C38143a;
import com.p2082ss.android.ugc.aweme.commercialize.live.service.CommercializeLiveServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.C48020ab;
import com.p2082ss.android.ugc.aweme.feed.C49538f;
import com.p2082ss.android.ugc.aweme.feed.assem.report.C48956a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.p2082ss.android.ugc.aweme.feed.model.CardStruct;
import com.p2082ss.android.ugc.aweme.feed.model.live.FeedFirstTag;
import com.p2082ss.android.ugc.aweme.feed.model.live.FeedRoomTagList;
import com.p2082ss.android.ugc.aweme.feed.model.live.FeedSubTag;
import com.p2082ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p2082ss.android.ugc.aweme.feed.model.live.MaskLayer;
import com.p2082ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.p2082ss.android.ugc.aweme.feed.model.live.Text;
import com.p2082ss.android.ugc.aweme.feed.model.live.WarningTag;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49668ac;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49669ad;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49677e;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49686n;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.LongPressLayout;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50527ac;
import com.p2082ss.android.ugc.aweme.feed.service.C49912a;
import com.p2082ss.android.ugc.aweme.feed.share.C49914a;
import com.p2082ss.android.ugc.aweme.feed.widget.WarningInfoView;
import com.p2082ss.android.ugc.aweme.follow.p3001e.C51078a;
import com.p2082ss.android.ugc.aweme.live.AbstractC58593c;
import com.p2082ss.android.ugc.aweme.live.AbstractC58647j;
import com.p2082ss.android.ugc.aweme.live.C58490ab;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.live.p3405b.View$OnAttachStateChangeListenerC58591b;
import com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b;
import com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56257j;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56259l;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56261n;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.l */
public final class C48259l extends C48224c implements Handler.Callback, AbstractC1214u<C12242b>, AbstractC90252i, AbstractC90253j {

    /* renamed from: A */
    final TextView f111790A;

    /* renamed from: B */
    final LinearLayout f111791B;

    /* renamed from: C */
    public final ViewGroup f111792C;

    /* renamed from: D */
    public final FrameLayout f111793D;

    /* renamed from: E */
    public AbstractC11633b f111794E;

    /* renamed from: F */
    public AbstractC11639c f111795F;

    /* renamed from: G */
    public boolean f111796G;

    /* renamed from: H */
    public final boolean f111797H;

    /* renamed from: I */
    public C49538f f111798I;

    /* renamed from: J */
    public LinkedList<Long> f111799J;

    /* renamed from: K */
    public boolean f111800K;

    /* renamed from: L */
    public boolean f111801L;

    /* renamed from: M */
    public boolean f111802M;

    /* renamed from: N */
    final AbstractC11656k f111803N;

    /* renamed from: O */
    public AbstractC88412b f111804O;

    /* renamed from: P */
    final Handler f111805P;

    /* renamed from: Q */
    public AbstractC38121a f111806Q;

    /* renamed from: R */
    public final AbstractC58608c f111807R;

    /* renamed from: S */
    final C48201bd f111808S;

    /* renamed from: T */
    private final View f111809T;

    /* renamed from: U */
    private final ConstraintLayout f111810U;

    /* renamed from: V */
    private final View f111811V;

    /* renamed from: W */
    private final TextView f111812W;

    /* renamed from: X */
    private final LinearLayout f111813X;

    /* renamed from: Y */
    private final RemoteImageView f111814Y;

    /* renamed from: Z */
    private final TextView f111815Z;

    /* renamed from: aA */
    private boolean f111816aA;

    /* renamed from: aB */
    private final AbstractC89244h f111817aB;

    /* renamed from: aC */
    private int f111818aC;

    /* renamed from: aD */
    private DataCenter f111819aD;

    /* renamed from: aE */
    private AbstractC21983b<C38050c> f111820aE;

    /* renamed from: aF */
    private C48260a f111821aF;

    /* renamed from: aG */
    private final TextView f111822aG;

    /* renamed from: aH */
    private String f111823aH;

    /* renamed from: aa */
    private final TextView f111824aa;

    /* renamed from: ab */
    private final View f111825ab;

    /* renamed from: ac */
    private final LottieAnimationView f111826ac;

    /* renamed from: ad */
    private final LottieAnimationView f111827ad;

    /* renamed from: ae */
    private final FrameLayout f111828ae;

    /* renamed from: af */
    private final LongPressLayout f111829af;

    /* renamed from: ag */
    private final TextView f111830ag;

    /* renamed from: ah */
    private final SmartAvatarBorderView f111831ah;

    /* renamed from: ai */
    private final View f111832ai;

    /* renamed from: aj */
    private final ImageView f111833aj;

    /* renamed from: ak */
    private final TextView f111834ak;

    /* renamed from: al */
    private final View f111835al;

    /* renamed from: am */
    private final FrameLayout f111836am;

    /* renamed from: an */
    private final WarningInfoView f111837an;

    /* renamed from: ao */
    private final LiveTextView f111838ao;

    /* renamed from: ap */
    private final LiveTextView f111839ap;

    /* renamed from: aq */
    private final LiveTextView f111840aq;

    /* renamed from: ar */
    private final LiveTextView f111841ar;

    /* renamed from: as */
    private final FrameLayout f111842as;

    /* renamed from: at */
    private final String f111843at;

    /* renamed from: au */
    private int f111844au;

    /* renamed from: av */
    private final View$OnAttachStateChangeListenerC58591b f111845av;

    /* renamed from: aw */
    private boolean f111846aw;

    /* renamed from: ax */
    private long f111847ax;

    /* renamed from: ay */
    private boolean f111848ay;

    /* renamed from: az */
    private boolean f111849az;

    /* renamed from: l */
    public boolean f111850l = true;

    /* renamed from: m */
    public long f111851m;

    /* renamed from: n */
    public long f111852n;

    /* renamed from: o */
    public boolean f111853o = true;

    /* renamed from: p */
    public boolean f111854p;

    /* renamed from: q */
    public final RemoteImageView f111855q;

    /* renamed from: r */
    public final TuxTextView f111856r;

    /* renamed from: s */
    public final TuxTextView f111857s;

    /* renamed from: t */
    public final RichTagView f111858t;

    /* renamed from: u */
    final FrameLayout f111859u;

    /* renamed from: v */
    public final View f111860v;

    /* renamed from: w */
    public final View f111861w;

    /* renamed from: x */
    public final TextView f111862x;

    /* renamed from: y */
    public final View f111863y;

    /* renamed from: z */
    final TextView f111864z;

    static {
        Covode.recordClassIndex(57001);
    }

    /* renamed from: ab */
    private final ImageSpan m91673ab() {
        return (ImageSpan) this.f111817aB.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(330, new RunnableC90250g(C48259l.class, "onEvent", C11771j.class, ThreadMode.POSTING, 0, false));
        hashMap.put(331, new RunnableC90250g(C48259l.class, "onFollowLiveStatusChange", C2954a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.C48224c
    /* renamed from: J */
    public final String mo80363J() {
        return this.f111843at;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.C48224c, com.p2082ss.android.ugc.aweme.adaptation.C33403c.AbstractC33407c
    /* renamed from: d */
    public final void mo59483d() {
        m91682ak();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.C48224c
    /* renamed from: a */
    public final void mo80164a(C56259l lVar) {
        super.mo80164a(lVar);
        Aweme aweme = this.f111708b;
        if (aweme != null && lVar != null && TextUtils.equals(lVar.f128329a, aweme.getAid())) {
            m91674ac();
            this.f111823aH = lVar.f128330b;
            TextView textView = this.f111822aG;
            if (textView != null) {
                textView.setOnClickListener(new View$OnClickListenerC48275n(this, lVar));
            }
            C49914a.f115062c.mo84962a(lVar, this.f111808S);
            this.f111805P.sendEmptyMessageDelayed(3, lVar.f128331c);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.C48224c
    /* renamed from: a */
    public final void mo80165a(C56261n nVar) {
        super.mo80165a(nVar);
        if (nVar != null) {
            if (TextUtils.isEmpty(this.f111823aH) || TextUtils.equals(this.f111823aH, nVar.f128339b)) {
                m91674ac();
                C49914a.m93720a(nVar, this.f111808S);
                this.f111805P.sendEmptyMessageDelayed(4, nVar.f128340c);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.l$d */
    static final class C48263d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C48263d f111870a = new C48263d();

        static {
            Covode.recordClassIndex(57005);
        }

        C48263d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            LivePerformanceManager.getInstance().initStartValue();
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.C48224c
    /* renamed from: K */
    public final String mo80364K() {
        if (TextUtils.equals(this.f111843at, "homepage_hot")) {
            return "homepage_hot";
        }
        return "homepage_follow";
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.C48224c
    /* renamed from: L */
    public final boolean mo80365L() {
        return TextUtils.equals(mo80364K(), "homepage_hot");
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.C48224c
    /* renamed from: M */
    public final boolean mo80366M() {
        return TextUtils.equals(mo80364K(), "homepage_follow");
    }

    /* renamed from: aa */
    public final void mo80384aa() {
        AbstractC11639c cVar = this.f111795F;
        if (cVar != null) {
            cVar.mo11773a();
            this.f111795F = null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.l$c */
    public static final class C48262c implements AbstractC48150aj {

        /* renamed from: a */
        final /* synthetic */ C48259l f111869a;

        static {
            Covode.recordClassIndex(57004);
        }

        @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48150aj
        /* renamed from: a */
        public final void mo80290a() {
            if (!this.f111869a.f111713g) {
                this.f111869a.f111807R.pauseWithStreamData();
            }
            AbstractC11633b bVar = this.f111869a.f111794E;
            if (bVar != null) {
                bVar.mo18243b();
            }
            this.f111869a.mo80384aa();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C48262c(C48259l lVar) {
            this.f111869a = lVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.l$g */
    static final class RunnableC48266g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f111875a;

        /* renamed from: b */
        final /* synthetic */ int f111876b;

        /* renamed from: c */
        final /* synthetic */ UrlModel f111877c;

        /* renamed from: d */
        final /* synthetic */ C48259l f111878d;

        static {
            Covode.recordClassIndex(57008);
        }

        RunnableC48266g(int i, int i2, UrlModel urlModel, C48259l lVar) {
            this.f111875a = i;
            this.f111876b = i2;
            this.f111877c = urlModel;
            this.f111878d = lVar;
        }

        public final void run() {
            C34577e.m70594a(this.f111878d.f111855q, this.f111877c, this.f111875a, this.f111876b, C49912a.m93712a((((float) this.f111875a) * 1.0f) / ((float) this.f111876b)));
        }
    }

    /* renamed from: ac */
    private final void m91674ac() {
        this.f111805P.removeMessages(1);
        this.f111805P.removeMessages(2);
        this.f111805P.removeMessages(3);
        this.f111805P.removeMessages(4);
    }

    /* renamed from: ae */
    private final boolean m91676ae() {
        LiveRoomStruct liveRoomStruct;
        if (this.f111801L || (liveRoomStruct = this.f111709c) == null || liveRoomStruct.maskLayer == null) {
            return false;
        }
        return true;
    }

    /* renamed from: X */
    public final void mo80380X() {
        this.f111805P.removeMessages(100);
        C48164as.m91483a(new C49668ac(this.f111843at, true), new C49669ad(this.f111707a.hashCode(), 1));
    }

    /* renamed from: Z */
    public final void mo80382Z() {
        this.f111848ay = true;
        m91686h(true);
        if (this.f111796G) {
            this.f111847ax = 0;
            this.f111805P.removeMessages(100);
            AbstractC81915c.m141874a(new C49686n());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.C48224c
    /* renamed from: l */
    public final void mo80082l() {
        super.mo80082l();
        if (this.f111850l) {
            this.f111826ac.mo5831b();
            this.f111827ad.mo5831b();
        } else if (!this.f111797H) {
            mo80381Y();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.C48224c
    /* renamed from: m */
    public final void mo80083m() {
        super.mo80083m();
        this.f111826ac.mo5837e();
        this.f111827ad.mo5837e();
        this.f111845av.mo96047a();
        this.f111805P.removeMessages(100);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.l$o */
    static final class RunnableC48276o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f111891a;

        /* renamed from: b */
        final /* synthetic */ FeedSubTag f111892b;

        /* renamed from: c */
        final /* synthetic */ C48259l f111893c;

        static {
            Covode.recordClassIndex(57018);
        }

        RunnableC48276o(String str, FeedSubTag feedSubTag, C48259l lVar) {
            this.f111891a = str;
            this.f111892b = feedSubTag;
            this.f111893c = lVar;
        }

        public final void run() {
            C48259l lVar = this.f111893c;
            String str = this.f111891a;
            int style = this.f111892b.getStyle();
            if (lVar.f111791B.getMeasuredWidth() + C3966y.m9653a(144.0f) > C3966y.m9664c()) {
                lVar.f111790A.setText(str);
                lVar.f111790A.setVisibility(0);
                C48259l.m91672a(lVar.f111790A, style);
                lVar.f111864z.setVisibility(4);
            }
        }
    }

    /* renamed from: ak */
    private final void m91682ak() {
        int dimensionPixelSize;
        if (C33403c.C33406b.f79409a.f79388q) {
            dimensionPixelSize = 0;
        } else {
            dimensionPixelSize = this.f111707a.getResources().getDimensionPixelSize(R.dimen.tb);
        }
        ViewGroup.LayoutParams layoutParams = this.f111810U.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = dimensionPixelSize;
        this.f111810U.setLayoutParams(marginLayoutParams);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48145ae, com.p2082ss.android.ugc.aweme.feed.adapter.C48224c
    /* renamed from: F */
    public final void mo80282F() {
        super.mo80282F();
        C48260a aVar = this.f111821aF;
        if (aVar != null) {
            aVar.f111866b = false;
        }
        this.f111796G = true;
        this.f111859u.setVisibility(0);
        this.f111807R.setMute(false);
        this.f111851m = System.currentTimeMillis();
        m91675ad();
        m91679ah();
        this.f111846aw = false;
        this.f111816aA = false;
        this.f111849az = false;
    }

    /* renamed from: Y */
    public final void mo80381Y() {
        this.f111805P.removeMessages(100);
        if (this.f111847ax <= 0 || System.currentTimeMillis() - this.f111847ax < 5000) {
            this.f111805P.sendEmptyMessageDelayed(100, 5000);
            this.f111847ax = System.currentTimeMillis();
            return;
        }
        this.f111805P.sendEmptyMessageDelayed(100, 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.C48224c
    /* renamed from: c */
    public final void mo80080c() {
        super.mo80080c();
        this.f111850l = true;
        EventBus.m156962a().mo145395b(this);
        AbstractC58608c cVar = this.f111807R;
        if (cVar != null) {
            cVar.stopWithStreamData();
        }
        AbstractC88412b bVar = this.f111804O;
        if (bVar != null && !bVar.isDisposed()) {
            bVar.dispose();
        }
        this.f111804O = null;
        this.f111821aF = null;
        LivePerformanceManager.getInstance().resetInitValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.C48224c
    /* renamed from: j */
    public final void mo70620j() {
        super.mo70620j();
        this.f111807R.destroy();
        AbstractC11633b bVar = this.f111794E;
        if (bVar != null) {
            bVar.mo18244c();
        }
        m91677af();
        mo80384aa();
        EventBus.m156962a().mo145395b(this);
        AbstractC88412b bVar2 = this.f111804O;
        if (bVar2 != null && !bVar2.isDisposed()) {
            bVar2.dispose();
        }
        this.f111804O = null;
        this.f111821aF = null;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.l$m */
    static final class C48274m extends AbstractC89220m implements AbstractC89171a<ImageSpan> {

        /* renamed from: a */
        final /* synthetic */ C48259l f111888a;

        static {
            Covode.recordClassIndex(57016);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48274m(C48259l lVar) {
            super(0);
            this.f111888a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ImageSpan invoke() {
            int i;
            boolean a = C6229a.m13521a(this.f111888a.f111707a);
            Drawable c = C3966y.m9665c(2131231731);
            BitmapDrawable bitmapDrawable = null;
            if (c == null) {
                return null;
            }
            if (a) {
                C0705a.m2503b(c, 1);
                C0705a.m2500a(c, true);
            }
            c.setBounds(0, 0, C3966y.m9653a(12.0f), C3966y.m9653a(13.0f));
            if (c instanceof BitmapDrawable) {
                bitmapDrawable = c;
            }
            BitmapDrawable bitmapDrawable2 = bitmapDrawable;
            if (bitmapDrawable2 != null) {
                if (a) {
                    i = 3;
                } else {
                    i = 5;
                }
                bitmapDrawable2.setGravity(i);
            }
            return new ImageSpan(c, 1);
        }
    }

    /* renamed from: ai */
    private final void m91680ai() {
        LiveRoomStruct liveRoomStruct = this.f111709c;
        if (liveRoomStruct != null && !this.f111849az && m91676ae()) {
            C6560m.m14027a(liveRoomStruct.f114485id, liveRoomStruct.getAnchorId());
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from_merge", mo80364K());
            hashMap.put("enter_method", "live_cell");
            hashMap.put("action_type", "show");
            C6501b.C6502a.m13948a("livesdk_mask_layer_show").mo12652a((Map<String, String>) hashMap).mo12639a().mo12655b();
            this.f111849az = true;
        }
    }

    /* renamed from: aj */
    private final void m91681aj() {
        WarningTag warningTag;
        String str;
        LiveRoomStruct liveRoomStruct = this.f111709c;
        if (liveRoomStruct != null && !this.f111816aA && (warningTag = liveRoomStruct.warningTag) != null) {
            C6560m.m14027a(liveRoomStruct.f114485id, liveRoomStruct.getAnchorId());
            HashMap hashMap = new HashMap();
            Text text = warningTag.getText();
            if (text == null || (str = text.getKey()) == null) {
                str = "";
            }
            hashMap.put("warning_reason", str);
            hashMap.put("user_type", "user");
            hashMap.put("enter_from_merge", mo80364K());
            hashMap.put("enter_method", "live_cell");
            C6501b.C6502a.m13948a("livesdk_bottom_message_show").mo12652a((Map<String, String>) hashMap).mo12651a("action_type", "show").mo12645a("message_type", 3).mo12655b();
            this.f111816aA = true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48145ae, com.p2082ss.android.ugc.aweme.feed.adapter.C48224c
    /* renamed from: G */
    public final void mo80283G() {
        Integer num;
        String str;
        User user;
        if (!this.f111802M) {
            ViewGroup viewGroup = this.f111792C;
            Long l = null;
            if (viewGroup != null) {
                num = Integer.valueOf(viewGroup.getVisibility());
            } else {
                num = null;
            }
            if (num.intValue() == 0 && this.f111709c != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("enter_from_merge", mo80364K());
                hashMap.put("enter_method", "live_cell");
                LiveRoomStruct liveRoomStruct = this.f111709c;
                if (liveRoomStruct == null || (user = liveRoomStruct.owner) == null || (str = user.getUid()) == null) {
                    str = "";
                }
                hashMap.put("anchor_id", str);
                LiveRoomStruct liveRoomStruct2 = this.f111709c;
                if (liveRoomStruct2 != null) {
                    l = Long.valueOf(liveRoomStruct2.f114485id);
                }
                hashMap.put("room_id", String.valueOf(l));
                hashMap.put("action_type", "draw");
                hashMap.put("click_icon", "draw");
                C6501b.C6502a.m13948a("livesdk_mask_layer_click").mo12652a((Map<String, String>) hashMap).mo12655b();
            }
        }
        this.f111802M = false;
        this.f111801L = false;
        this.f111816aA = false;
        this.f111849az = false;
    }

    /* renamed from: ad */
    private final void m91675ad() {
        WarningTag warningTag;
        MaskLayer maskLayer;
        Text text;
        WarningTag warningTag2;
        Text text2;
        if (this.f111709c != null && this.f111850l) {
            LiveRoomStruct liveRoomStruct = this.f111709c;
            Text text3 = null;
            if (liveRoomStruct != null) {
                warningTag = liveRoomStruct.warningTag;
            } else {
                warningTag = null;
            }
            if (warningTag != null) {
                LiveRoomStruct liveRoomStruct2 = this.f111709c;
                if (liveRoomStruct2 != null) {
                    warningTag2 = liveRoomStruct2.warningTag;
                } else {
                    warningTag2 = null;
                }
                this.f111837an.setVisibility(0);
                WarningInfoView warningInfoView = this.f111837an;
                if (warningTag2 != null) {
                    text2 = warningTag2.getText();
                } else {
                    text2 = null;
                }
                C50527ac.m94716a(warningInfoView, text2);
                m91681aj();
            }
            if (m91676ae()) {
                this.f111792C.setVisibility(0);
                LiveRoomStruct liveRoomStruct3 = this.f111709c;
                if (liveRoomStruct3 != null) {
                    maskLayer = liveRoomStruct3.maskLayer;
                } else {
                    maskLayer = null;
                }
                LiveTextView liveTextView = this.f111838ao;
                if (maskLayer != null) {
                    text = maskLayer.getTitle();
                } else {
                    text = null;
                }
                C50527ac.m94715a(liveTextView, text);
                LiveTextView liveTextView2 = this.f111839ap;
                if (maskLayer != null) {
                    text3 = maskLayer.getSubTitle();
                }
                C50527ac.m94715a(liveTextView2, text3);
                this.f111840aq.setText(C3966y.m9657a((int) R.string.e1x));
                this.f111841ar.setText(C3966y.m9657a((int) R.string.ed_));
                this.f111807R.pauseWithStreamData();
                m91680ai();
            }
            this.f111840aq.setOnClickListener(new View$OnClickListenerC48282u(this));
            this.f111841ar.setOnClickListener(new View$OnClickListenerC48283v(this));
        }
    }

    /* renamed from: af */
    private final void m91677af() {
        AwemeRawAd awemeRawAd;
        String str;
        RoomFeedCellStruct roomFeedCellStruct;
        LiveRoomStruct newLiveRoomData;
        RoomFeedCellStruct roomFeedCellStruct2;
        LiveRoomStruct newLiveRoomData2;
        Aweme b = mo80206b();
        if (b != null && b.isAd() && this.f111851m > 0 && this.f111708b != null && this.f111709c != null) {
            Aweme b2 = mo80206b();
            String str2 = null;
            if (b2 != null) {
                awemeRawAd = b2.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            C18129a.C18130a b3 = C18129a.m33746a("draw_ad", "break", awemeRawAd).mo28900b("duration", Long.valueOf(System.currentTimeMillis() - this.f111851m));
            Aweme b4 = mo80206b();
            if (b4 == null || (roomFeedCellStruct2 = b4.getRoomFeedCellStruct()) == null || (newLiveRoomData2 = roomFeedCellStruct2.getNewLiveRoomData()) == null) {
                str = null;
            } else {
                str = String.valueOf(newLiveRoomData2.getAnchorId());
            }
            C18129a.C18130a a = b3.mo28897a("anchor_id", str);
            Aweme b5 = mo80206b();
            if (!(b5 == null || (roomFeedCellStruct = b5.getRoomFeedCellStruct()) == null || (newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData()) == null)) {
                str2 = String.valueOf(newLiveRoomData.f114485id);
            }
            a.mo28897a("room_id", str2).mo28901b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.C48224c
    /* renamed from: g */
    public final void mo80072g() {
        this.f111846aw = false;
        this.f111796G = false;
        m91678ag();
        m91677af();
        mo80384aa();
        this.f111845av.mo96047a();
        if (this.f111797H) {
            C49538f fVar = this.f111798I;
            if (fVar != null) {
                fVar.f113922a.cancel();
            }
            this.f111798I = null;
        } else {
            this.f111805P.removeMessages(100);
        }
        boolean z = this.f111848ay;
        if (!z) {
            m91686h(z);
        }
        this.f111818aC = -1;
        if (C38143a.m77302a(mo80206b())) {
            AbstractC21983b<C38050c> bVar = this.f111820aE;
            if (bVar != null) {
                bVar.cancel();
            }
            this.f111820aE = null;
            this.f111806Q.mo66412c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.C48224c
    /* renamed from: o */
    public final void mo80369o() {
        AwemeRawAd awemeRawAd;
        String str;
        RoomFeedCellStruct roomFeedCellStruct;
        LiveRoomStruct newLiveRoomData;
        RoomFeedCellStruct roomFeedCellStruct2;
        LiveRoomStruct newLiveRoomData2;
        super.mo80369o();
        LiveRoomStruct liveRoomStruct = this.f111709c;
        if (liveRoomStruct != null) {
            if (this.f111850l) {
                this.f111807R.setPlayerLogCache(this.f111803N);
                this.f111807R.setLivePlayerEntranceParam(new C11690a(mo80364K(), "live_cell", ""));
                this.f111807R.playWithStreamData(true, liveRoomStruct, this.f111859u);
                TextureRenderView textureView = this.f111807R.getTextureView();
                if (textureView != null) {
                    textureView.setScaleType(2);
                }
                if (m91676ae()) {
                    this.f111807R.pauseWithStreamData();
                }
                Aweme b = mo80206b();
                if (b != null && b.isAd()) {
                    Aweme b2 = mo80206b();
                    String str2 = null;
                    if (b2 != null) {
                        awemeRawAd = b2.getAwemeRawAd();
                    } else {
                        awemeRawAd = null;
                    }
                    C18129a.C18130a a = C18129a.m33746a("draw_ad", "play", awemeRawAd);
                    Aweme b3 = mo80206b();
                    if (b3 == null || (roomFeedCellStruct2 = b3.getRoomFeedCellStruct()) == null || (newLiveRoomData2 = roomFeedCellStruct2.getNewLiveRoomData()) == null) {
                        str = null;
                    } else {
                        str = String.valueOf(newLiveRoomData2.getAnchorId());
                    }
                    C18129a.C18130a a2 = a.mo28897a("anchor_id", str);
                    Aweme b4 = mo80206b();
                    if (!(b4 == null || (roomFeedCellStruct = b4.getRoomFeedCellStruct()) == null || (newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData()) == null)) {
                        str2 = String.valueOf(newLiveRoomData.f114485id);
                    }
                    a2.mo28897a("room_id", str2).mo28901b();
                }
            } else {
                return;
            }
        }
        this.f111845av.mo96048b();
    }

    /* renamed from: ag */
    private final void m91678ag() {
        boolean z;
        Integer num;
        String str;
        Integer num2;
        String str2;
        String str3 = "1";
        if (this.f111851m > 0 && this.f111708b != null && this.f111709c != null && this.f111712f) {
            C33744d a = new C33744d().mo59983a("scene_id", "1003").mo59981a("duration", System.currentTimeMillis() - this.f111851m).mo59983a("enter_from_merge", mo80364K()).mo59983a("action_type", "click");
            LiveRoomStruct liveRoomStruct = this.f111709c;
            if (liveRoomStruct == null) {
                C89219l.m154715b();
            }
            User user = liveRoomStruct.owner;
            C89219l.m154716b(user, "");
            C33744d a2 = a.mo59983a("anchor_id", user.getUid());
            LiveRoomStruct liveRoomStruct2 = this.f111709c;
            if (liveRoomStruct2 == null) {
                C89219l.m154715b();
            }
            C33744d a3 = a2.mo59981a("room_id", liveRoomStruct2.f114485id);
            Aweme aweme = this.f111708b;
            if (aweme == null) {
                C89219l.m154715b();
            }
            C33744d a4 = a3.mo59983a("request_id", aweme.getRequestId()).mo59983a("enter_method", "live_cell");
            Aweme b = mo80206b();
            if (b != null) {
                num2 = Integer.valueOf(b.getAwemePosition());
            } else {
                num2 = null;
            }
            C33744d a5 = a4.mo59982a("order", num2);
            if (this.f111854p) {
                str2 = str3;
            } else {
                str2 = "0";
            }
            C39162r.m79460a("livesdk_live_window_duration", a5.mo59983a("has_first_frame", str2).f79943a);
        }
        if (this.f111852n <= 0 || this.f111851m <= 0 || this.f111708b == null || this.f111709c == null || !this.f111712f) {
            z = false;
        } else {
            long j = this.f111852n;
            long j2 = this.f111851m;
            if (j < j2) {
                j = j2;
            }
            C33744d a6 = new C33744d().mo59983a("scene_id", "1003").mo59981a("duration", System.currentTimeMillis() - j).mo59983a("enter_from_merge", mo80364K()).mo59983a("action_type", "click");
            LiveRoomStruct liveRoomStruct3 = this.f111709c;
            if (liveRoomStruct3 == null) {
                C89219l.m154715b();
            }
            User user2 = liveRoomStruct3.owner;
            C89219l.m154716b(user2, "");
            C33744d a7 = a6.mo59983a("anchor_id", user2.getUid());
            LiveRoomStruct liveRoomStruct4 = this.f111709c;
            if (liveRoomStruct4 == null) {
                C89219l.m154715b();
            }
            C33744d a8 = a7.mo59981a("room_id", liveRoomStruct4.f114485id);
            Aweme aweme2 = this.f111708b;
            if (aweme2 == null) {
                C89219l.m154715b();
            }
            C33744d a9 = a8.mo59983a("request_id", aweme2.getRequestId()).mo59983a("enter_method", "live_cell");
            Aweme b2 = mo80206b();
            if (b2 != null) {
                num = Integer.valueOf(b2.getAwemePosition());
            } else {
                num = null;
            }
            C33744d a10 = a9.mo59982a("order", num);
            LiveRoomStruct liveRoomStruct5 = this.f111709c;
            if (liveRoomStruct5 == null) {
                C89219l.m154715b();
            }
            C33744d a11 = a10.mo59983a("follow_status", String.valueOf(C48285n.m91724a(liveRoomStruct5)));
            if (this.f111854p) {
                str = str3;
            } else {
                str = "0";
            }
            C33744d a12 = a11.mo59983a("has_first_frame", str);
            LiveRoomStruct liveRoomStruct6 = this.f111709c;
            if (liveRoomStruct6 == null) {
                C89219l.m154715b();
            }
            if (!liveRoomStruct6.hasCommerceGoods) {
                str3 = "0";
            }
            C33744d a13 = a12.mo59983a("is_ecom", str3).mo59980a("room_position", this.f111818aC);
            z = false;
            C39162r.m79460a("livesdk_live_window_duration_v2", a13.mo59980a("is_from_draw_req", 0).f79943a);
        }
        this.f111712f = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.l$j */
    static final class RunnableC48271j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C48259l f111884a;

        static {
            Covode.recordClassIndex(57013);
        }

        RunnableC48271j(C48259l lVar) {
            this.f111884a = lVar;
        }

        public final void run() {
            String str;
            Long l;
            String str2;
            int i;
            User user;
            Integer num;
            if (this.f111884a.f111853o) {
                this.f111884a.f111853o = false;
                this.f111884a.f111852n = System.currentTimeMillis();
                this.f111884a.f111854p = true;
                C48259l lVar = this.f111884a;
                LiveRoomStruct liveRoomStruct = lVar.f111709c;
                if (liveRoomStruct != null) {
                    C33744d a = new C33744d().mo59983a("scene_id", "1007").mo59983a("enter_from_merge", lVar.mo80364K()).mo59983a("action_type", "click");
                    User user2 = liveRoomStruct.owner;
                    C89219l.m154716b(user2, "");
                    C33744d a2 = a.mo59983a("anchor_id", user2.getUid()).mo59981a("room_id", liveRoomStruct.f114485id);
                    Aweme aweme = lVar.f111708b;
                    if (aweme == null) {
                        C89219l.m154715b();
                    }
                    C33744d a3 = a2.mo59983a("request_id", aweme.getRequestId());
                    Aweme aweme2 = lVar.f111708b;
                    if (aweme2 != null) {
                        num = Integer.valueOf(aweme2.getAwemePosition());
                    } else {
                        num = null;
                    }
                    C39162r.m79460a("livesdk_live_window_show", a3.mo59982a("order", num).mo59983a("enter_method", "live_cell").f79943a);
                }
                C48259l lVar2 = this.f111884a;
                lVar2.f111803N.mo18428a("start", String.valueOf(lVar2.f111851m));
                if (lVar2.f111851m > 0 && lVar2.f111852n > 0 && lVar2.f111708b != null && lVar2.f111709c != null) {
                    long j = lVar2.f111852n - lVar2.f111851m;
                    if (j < 0) {
                        j = 0;
                    }
                    JSONObject staticLog = lVar2.f111807R.getStaticLog();
                    C33744d a4 = new C33744d().mo59983a("scene_id", "1007").mo59983a("enter_from_merge", lVar2.mo80364K()).mo59983a("action_type", "click");
                    LiveRoomStruct liveRoomStruct2 = lVar2.f111709c;
                    if (liveRoomStruct2 == null || (user = liveRoomStruct2.owner) == null) {
                        str = null;
                    } else {
                        str = user.getUid();
                    }
                    C33744d a5 = a4.mo59983a("anchor_id", str);
                    LiveRoomStruct liveRoomStruct3 = lVar2.f111709c;
                    if (liveRoomStruct3 != null) {
                        l = Long.valueOf(liveRoomStruct3.f114485id);
                    } else {
                        l = null;
                    }
                    C33744d a6 = a5.mo59982a("room_id", l);
                    Aweme aweme3 = lVar2.f111708b;
                    if (aweme3 == null) {
                        C89219l.m154715b();
                    }
                    C33744d a7 = a6.mo59983a("request_id", aweme3.getRequestId()).mo59983a("enter_method", "live_cell").mo59983a("notice_type", C51078a.f117813a).mo59983a("show_cnt", String.valueOf(C51078a.f117814b)).mo59983a("yellow_dot_logid", C51078a.f117815c).mo59981a("duration", j);
                    if (lVar2.f111854p) {
                        str2 = "1";
                    } else {
                        str2 = "0";
                    }
                    int i2 = -1;
                    C33744d a8 = a7.mo59983a("has_first_frame", str2).mo59986a(lVar2.f111803N.mo18430b()).mo59981a("first_frame_duration", lVar2.f111803N.mo18432d()).mo59983a("vquality", staticLog.optString("settings_res:", "-1")).mo59980a("bitrate", staticLog.optInt("download_Speed:", -1)).mo59983a("definition", staticLog.optString("width:", "-1"));
                    String optString = staticLog.optString("HardDecode:", "-1");
                    C89219l.m154716b(optString, "");
                    if (TextUtils.equals(optString, "true")) {
                        i = 1;
                    } else if (TextUtils.equals(optString, "false")) {
                        i = 0;
                    } else {
                        i = -1;
                    }
                    C33744d a9 = a8.mo59980a("is_hw", i);
                    String optString2 = staticLog.optString("Codec_Type:", "-1");
                    C89219l.m154716b(optString2, "");
                    if (TextUtils.equals(optString2, "bytevc1")) {
                        i2 = 1;
                    } else if (TextUtils.equals(optString2, "h264")) {
                        i2 = 0;
                    }
                    C39162r.m79460a("livesdk_enter_window_from_draw_duration", a9.mo59980a("is_bytevc1", i2).mo59981a("video_package_duration", lVar2.f111803N.mo18434f()).f79943a);
                    lVar2.f111803N.mo18431c();
                }
                C48259l lVar3 = this.f111884a;
                if (lVar3.f111796G) {
                    lVar3.f111859u.setVisibility(0);
                    lVar3.f111807R.setMute(false);
                } else {
                    lVar3.f111859u.setVisibility(8);
                    lVar3.f111807R.setMute(true);
                }
                this.f111884a.f111807R.changeSRSupportScene(LivePreviewCardEnableSrSetting.INSTANCE.isEnable());
                AbstractC11633b bVar = this.f111884a.f111794E;
                if (bVar != null) {
                    bVar.mo18242a();
                }
                AbstractC11639c cVar = this.f111884a.f111795F;
                if (cVar != null) {
                    cVar.mo11774a(C16048b.m29633a().mo25412a(true, "follow_live_interaction_style", 0));
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01d7  */
    /* renamed from: ah */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m91679ah() {
        /*
        // Method dump skipped, instructions count: 516
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.adapter.C48259l.m91679ah():void");
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.C48224c
    /* renamed from: n */
    public final void mo80368n() {
        boolean z;
        String str;
        UrlModel urlModel;
        String str2;
        List<com.bytedance.android.live.base.model.user.User> list;
        com.bytedance.android.live.base.model.user.User user;
        String str3;
        String nickname;
        UrlModel urlModel2;
        UrlModel urlModel3;
        ViewGroup.LayoutParams layoutParams;
        String str4;
        FeedRoomTagList feedRoomTagList;
        List<FeedSubTag> subTags;
        FeedRoomTagList feedRoomTagList2;
        List<FeedFirstTag> firstTags;
        String str5;
        String str6;
        List<com.bytedance.android.live.base.model.user.User> list2;
        AbstractC11633b bVar;
        AwemeRawAd awemeRawAd;
        String str7;
        AwemeRawAd awemeRawAd2;
        AwemeTextLabelModel label;
        String labelName;
        LiveRoomStruct liveRoomStruct = this.f111709c;
        if (liveRoomStruct != null) {
            if (liveRoomStruct.liveEventInfo != null) {
                z = true;
            } else {
                z = false;
            }
            this.f111800K = z;
            View$OnAttachStateChangeListenerC58591b bVar2 = this.f111845av;
            boolean z2 = this.f111850l;
            String str8 = "";
            C89219l.m154721d(liveRoomStruct, str8);
            bVar2.f133461g = liveRoomStruct;
            bVar2.f133462h = z2;
            if (!bVar2.mo96049c()) {
                ViewGroup viewGroup = bVar2.f133455a;
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                }
                bVar2.mo96047a();
            } else {
                ViewGroup viewGroup2 = bVar2.f133455a;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                }
                if (bVar2.f133456b != null) {
                    User user2 = liveRoomStruct.owner;
                    if (user2 != null) {
                        urlModel = user2.getAvatarLarger();
                    } else {
                        urlModel = null;
                    }
                    C20766v a = C20761r.m39060a(C34735v.m70965a(urlModel)).mo34179a("AudioLivePreviewManager");
                    a.f49092E = bVar2.f133456b;
                    a.mo34186c();
                }
                if (bVar2.f133458d != null && !TextUtils.isEmpty(bVar2.f133459e)) {
                    C20766v a2 = C20761r.m39060a((Object) bVar2.f133459e).mo34179a("AudioLivePreviewManager");
                    a2.f49106c = true;
                    a2.f49124u = Bitmap.Config.ARGB_8888;
                    a2.f49092E = bVar2.f133458d;
                    a2.mo34186c();
                }
                List<String> list3 = bVar2.f133460f;
                User user3 = liveRoomStruct.owner;
                if (user3 != null) {
                    str = user3.getUid();
                } else {
                    str = null;
                }
                String a3 = View$OnAttachStateChangeListenerC58591b.m107697a(list3, str);
                if (!(a3 == null || a3.length() <= 0 || bVar2.f133457c == null)) {
                    C20766v a4 = C20761r.m39061a(a3).mo34179a("AudioLivePreviewManager");
                    a4.f49092E = bVar2.f133457c;
                    a4.mo34186c();
                }
                bVar2.mo96048b();
            }
            TuxTextView tuxTextView = this.f111857s;
            TuxTextView tuxTextView2 = this.f111856r;
            RichTagView richTagView = this.f111858t;
            this.f111810U.setVisibility(0);
            C89233z.C89238e eVar = new C89233z.C89238e();
            eVar.element = null;
            if (this.f111800K) {
                if (!liveRoomStruct.liveEventInfo.getSubscribed() || !this.f111850l) {
                    this.f111864z.setVisibility(8);
                } else {
                    this.f111864z.setVisibility(0);
                }
                this.f111833aj.setVisibility(0);
                tuxTextView.setVisibility(0);
                String title = liveRoomStruct.liveEventInfo.getTitle();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (C6229a.m13521a(this.f111707a)) {
                    if (C0680f.f2738d.mo2717a(title, title.length())) {
                        spannableStringBuilder.append((CharSequence) title).append((char) 8202).append((CharSequence) " ").append((char) 8204);
                        spannableStringBuilder.setSpan(m91673ab(), title.length() + 1, title.length() + 2, 17);
                    } else {
                        spannableStringBuilder.append((char) 8202).append((CharSequence) " ").append((char) 8204).append((CharSequence) title);
                        spannableStringBuilder.setSpan(m91673ab(), 1, 2, 17);
                    }
                } else if (C0680f.f2737c.mo2717a(title, title.length())) {
                    spannableStringBuilder.append((char) 8202).append((CharSequence) " ").append((char) 8204).append((CharSequence) title);
                    spannableStringBuilder.setSpan(m91673ab(), 1, 2, 17);
                } else {
                    spannableStringBuilder.append((CharSequence) title).append((char) 8202).append((CharSequence) " ").append((char) 8204);
                    spannableStringBuilder.setSpan(m91673ab(), title.length() + 1, title.length() + 2, 17);
                }
                tuxTextView2.setText(spannableStringBuilder);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm aa", Locale.US);
                tuxTextView.setText(simpleDateFormat.format(new Date(liveRoomStruct.liveEventInfo.getStartTime() * 1000)) + " - " + simpleDateFormat.format(new Date((liveRoomStruct.liveEventInfo.getStartTime() + liveRoomStruct.liveEventInfo.getDuration()) * 1000)) + " (UTC+8)");
            } else {
                if (TextUtils.isEmpty(liveRoomStruct.title)) {
                    tuxTextView.setVisibility(8);
                } else {
                    tuxTextView.setText(liveRoomStruct.title);
                    tuxTextView.setVisibility(0);
                }
                if (liveRoomStruct.owner != null) {
                    User user4 = liveRoomStruct.owner;
                    C89219l.m154716b(user4, str8);
                    if (!TextUtils.isEmpty(user4.getUniqueId())) {
                        StringBuilder sb = new StringBuilder("@");
                        User user5 = liveRoomStruct.owner;
                        C89219l.m154716b(user5, str8);
                        str2 = sb.append(user5.getUniqueId()).toString();
                        eVar.element = (T) ((SlimRoom.C11692a) C80342dg.m139301a(liveRoomStruct.linkMic, SlimRoom.C11692a.class));
                        T t = eVar.element;
                        if (!(t == null || (list = t.f27944a) == null || (user = list.get(0)) == null || (str3 = user.displayId) == null)) {
                            str2 = "@".concat(String.valueOf(str3));
                        }
                        tuxTextView2.setText(str2);
                        this.f111833aj.setVisibility(8);
                        this.f111864z.setVisibility(8);
                    }
                }
                User user6 = liveRoomStruct.owner;
                if (user6 != null) {
                    if (!TextUtils.isEmpty(user6.getRemarkName())) {
                        nickname = user6.getRemarkName();
                    } else {
                        nickname = user6.getNickname();
                    }
                    if (!TextUtils.isEmpty(nickname)) {
                        str2 = "@" + nickname;
                        eVar.element = (T) ((SlimRoom.C11692a) C80342dg.m139301a(liveRoomStruct.linkMic, SlimRoom.C11692a.class));
                        T t2 = eVar.element;
                        str2 = "@".concat(String.valueOf(str3));
                        tuxTextView2.setText(str2);
                        this.f111833aj.setVisibility(8);
                        this.f111864z.setVisibility(8);
                    }
                }
                str2 = str8;
                try {
                    eVar.element = (T) ((SlimRoom.C11692a) C80342dg.m139301a(liveRoomStruct.linkMic, SlimRoom.C11692a.class));
                } catch (Exception unused) {
                }
                T t22 = eVar.element;
                str2 = "@".concat(String.valueOf(str3));
                tuxTextView2.setText(str2);
                this.f111833aj.setVisibility(8);
                this.f111864z.setVisibility(8);
            }
            Aweme aweme = this.f111708b;
            if (aweme == null || aweme.getAwemeRawAd() == null || !aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null || !awemeRawAd.isRightStyle()) {
                richTagView.setVisibility(8);
            } else {
                C18156a.C18157a a5 = C18156a.C18157a.C18158a.m33791a();
                Aweme aweme2 = this.f111708b;
                if (!(aweme2 == null || (awemeRawAd2 = aweme2.getAwemeRawAd()) == null || (label = awemeRawAd2.getLabel()) == null || (labelName = label.getLabelName()) == null)) {
                    str8 = labelName;
                }
                C18156a aVar = a5.mo28942a(str8).mo28943b(92).mo28941a(richTagView.getResources().getColor(R.color.a9)).f43256a;
                if (aVar != null) {
                    richTagView.mo28933a(aVar);
                }
                Aweme aweme3 = this.f111708b;
                if (aweme3 != null) {
                    str7 = aweme3.getDesc();
                } else {
                    str7 = null;
                }
                if (TextUtils.isEmpty(str7)) {
                    ViewGroup.LayoutParams layoutParams2 = richTagView.getLayoutParams();
                    Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams.topMargin = (int) C13628n.m24520b(this.f111707a, 4.5f);
                    richTagView.setLayoutParams(marginLayoutParams);
                }
                richTagView.setVisibility(0);
            }
            tuxTextView2.setOnClickListener(new View$OnClickListenerC48265f(liveRoomStruct, eVar, this));
            User user7 = liveRoomStruct.owner;
            if (user7 != null) {
                user7.roomId = liveRoomStruct.f114485id;
            }
            int i = this.f111844au;
            if ((i == 5 || i == 3) && this.f111850l) {
                AbstractC58593c d = LiveOuterService.m107269s().mo95830d();
                if (d != null) {
                    bVar = d.mo12976a(this.f111707a, this.f111828ae);
                } else {
                    bVar = null;
                }
                this.f111794E = bVar;
            }
            ViewGroup viewGroup3 = this.f111792C;
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(8);
            }
            WarningInfoView warningInfoView = this.f111837an;
            if (warningInfoView != null) {
                warningInfoView.setVisibility(8);
            }
            if (this.f111850l) {
                if (this.f111797H) {
                    this.f111825ab.setVisibility(8);
                }
                this.f111812W.setVisibility(0);
                this.f111826ac.setVisibility(0);
                this.f111827ad.setVisibility(0);
                this.f111860v.setVisibility(0);
                this.f111861w.setVisibility(8);
                if (this.f111800K) {
                    this.f111815Z.setText(C58490ab.m107312a(this.f111707a, "pm_live_mt_events_mixed_card"));
                    this.f111824aa.setText(C58490ab.m107312a(this.f111707a, "pm_live_mt_events_mixed_card"));
                    this.f111812W.setText(C58490ab.m107312a(this.f111707a, "pm_mt_live_events_live_consumer_live_events"));
                } else {
                    this.f111815Z.setText(C58490ab.m107312a(this.f111707a, "pm_following_livecard_watch_guide2"));
                    this.f111824aa.setText(C58490ab.m107312a(this.f111707a, "pm_following_livecard_watch_guide2"));
                    this.f111812W.setText(C58490ab.m107312a(this.f111707a, "pm_following_livecard_live_icon_backup"));
                }
                LiveRoomStruct liveRoomStruct2 = this.f111709c;
                if (liveRoomStruct2 != null) {
                    str4 = liveRoomStruct2.linkMic;
                } else {
                    str4 = null;
                }
                if (!TextUtils.isEmpty(str4)) {
                    try {
                        LiveRoomStruct liveRoomStruct3 = this.f111709c;
                        if (liveRoomStruct3 != null) {
                            str6 = liveRoomStruct3.linkMic;
                        } else {
                            str6 = null;
                        }
                        SlimRoom.C11692a aVar2 = (SlimRoom.C11692a) C80342dg.m139301a(str6, SlimRoom.C11692a.class);
                        if (!(aVar2 == null || (list2 = aVar2.f27944a) == null || list2.size() <= 0)) {
                            this.f111861w.setVisibility(0);
                            this.f111860v.setVisibility(8);
                            this.f111812W.setText(this.f111707a.getString(R.string.e7m));
                        }
                    } catch (Exception unused2) {
                    }
                }
                LiveRoomStruct liveRoomStruct4 = this.f111709c;
                if (!(liveRoomStruct4 == null || (str5 = liveRoomStruct4.videoFeedTag) == null)) {
                    this.f111812W.setText(str5);
                }
                if (mo80365L() && LiveForYouPageTagSetting.INSTANCE.getValue() > 0) {
                    this.f111814Y.setVisibility(8);
                    LiveRoomStruct liveRoomStruct5 = this.f111709c;
                    if (!(liveRoomStruct5 == null || (feedRoomTagList2 = liveRoomStruct5.feedRoomTagList) == null || (firstTags = feedRoomTagList2.getFirstTags()) == null)) {
                        if (!firstTags.isEmpty()) {
                            FeedFirstTag feedFirstTag = firstTags.get(0);
                            String content = feedFirstTag.getContent();
                            if (!TextUtils.isEmpty(content)) {
                                this.f111812W.setText(content);
                                this.f111812W.setVisibility(0);
                                UrlModel icon = feedFirstTag.getIcon();
                                if (icon != null) {
                                    C34577e.m70592a(this.f111814Y, icon);
                                    this.f111814Y.setVisibility(0);
                                }
                                this.f111791B.setVisibility(0);
                            }
                        }
                    }
                    this.f111864z.setVisibility(8);
                    this.f111790A.setVisibility(8);
                    LiveRoomStruct liveRoomStruct6 = this.f111709c;
                    if (!(liveRoomStruct6 == null || (feedRoomTagList = liveRoomStruct6.feedRoomTagList) == null || (subTags = feedRoomTagList.getSubTags()) == null || subTags.isEmpty())) {
                        FeedSubTag feedSubTag = subTags.get(0);
                        String content2 = feedSubTag.getContent();
                        if (!TextUtils.isEmpty(content2)) {
                            this.f111864z.setText(content2);
                            this.f111864z.setVisibility(0);
                            m91672a(this.f111864z, feedSubTag.getStyle());
                            this.f111805P.post(new RunnableC48276o(content2, feedSubTag, this));
                        }
                    }
                }
                this.f111829af.setOnClickListener(new View$OnClickListenerC48277p(this, liveRoomStruct));
                urlModel3 = null;
                this.f111831ah.setOnClickListener(null);
                this.f111830ag.setOnClickListener(null);
                this.f111832ai.setOnClickListener(null);
                this.f111829af.setListener(mo80367a(this.f111707a));
                m91675ad();
                urlModel2 = liveRoomStruct.roomCover;
                if (urlModel2 == null) {
                    User user8 = liveRoomStruct.owner;
                    if (user8 != null) {
                        urlModel3 = user8.getAvatarLarger();
                    }
                }
                urlModel3 = urlModel2;
            } else {
                urlModel3 = null;
                if (this.f111797H) {
                    this.f111825ab.setVisibility(0);
                    if (this.f111800K) {
                        this.f111834ak.setText(C58490ab.m107312a(this.f111707a, "pm_live_mt_events_live_consumer_event_end"));
                    } else {
                        this.f111834ak.setText(C58490ab.m107312a(this.f111707a, "pm_following_livecard_live_end"));
                    }
                    this.f111860v.setVisibility(8);
                    this.f111861w.setVisibility(8);
                } else {
                    if (this.f111800K) {
                        this.f111815Z.setText(C58490ab.m107312a(this.f111707a, "pm_live_mt_events_live_consumer_event_end"));
                        this.f111824aa.setText(C58490ab.m107312a(this.f111707a, "pm_live_mt_events_live_consumer_event_end"));
                    } else {
                        this.f111815Z.setText(C58490ab.m107312a(this.f111707a, "pm_following_livecard_live_end"));
                        this.f111824aa.setText(C58490ab.m107312a(this.f111707a, "pm_following_livecard_live_end"));
                    }
                    mo80381Y();
                }
                this.f111826ac.setVisibility(8);
                this.f111812W.setVisibility(8);
                this.f111791B.setVisibility(8);
                this.f111790A.setVisibility(8);
                this.f111827ad.setVisibility(4);
                this.f111829af.setOnClickListener(new View$OnClickListenerC48278q(this, liveRoomStruct));
                this.f111831ah.setOnClickListener(new View$OnClickListenerC48279r(this));
                this.f111830ag.setOnClickListener(new View$OnClickListenerC48280s(this));
                this.f111832ai.setOnClickListener(new View$OnClickListenerC48281t(this));
                urlModel2 = liveRoomStruct.roomCover;
                if (urlModel2 == null) {
                    User user9 = liveRoomStruct.owner;
                    if (user9 != null) {
                        urlModel3 = user9.getAvatarLarger();
                    }
                }
                urlModel3 = urlModel2;
            }
            int b = C34723i.m70928b(this.f111707a);
            int a6 = C34723i.m70924a(this.f111707a);
            RemoteImageView remoteImageView = this.f111855q;
            if (!(remoteImageView == null || (layoutParams = remoteImageView.getLayoutParams()) == null)) {
                layoutParams.width = b;
                layoutParams.height = a6;
            }
            if (urlModel3 != null) {
                this.f111855q.post(new RunnableC48266g(b, a6, urlModel3, this));
            } else {
                this.f111855q.setVisibility(8);
            }
            m91682ak();
            mo80385f(false);
        }
        this.f111829af.setTimeInterval(500);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.l$i */
    static final class C48269i extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C48259l f111881a;

        static {
            Covode.recordClassIndex(57011);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48269i(C48259l lVar) {
            super(1);
            this.f111881a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            mo80393a(view);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo80393a(final View view) {
            C89219l.m154721d(view, "");
            this.f111881a.f111793D.post(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.feed.adapter.C48259l.C48269i.RunnableC482701 */

                /* renamed from: a */
                final /* synthetic */ C48269i f111882a;

                static {
                    Covode.recordClassIndex(57012);
                }

                {
                    this.f111882a = r1;
                }

                public final void run() {
                    this.f111882a.f111881a.f111863y.animate().translationY(((float) (C34729o.m70961c(this.f111882a.f111881a.f111793D).top - C34729o.m70961c(view).bottom)) - C13628n.m24520b(this.f111882a.f111881a.f111707a, 32.0f)).setDuration(360).setStartDelay(0).start();
                    int childCount = ((ViewGroup) this.f111882a.f111881a.f111863y).getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = ((ViewGroup) this.f111882a.f111881a.f111863y).getChildAt(i);
                        C89219l.m154716b(childAt, "");
                        if (!(childAt.getId() == this.f111882a.f111881a.f111860v.getId() || childAt.getId() == this.f111882a.f111881a.f111861w.getId())) {
                            childAt.animate().alpha(0.0f).setDuration(200).setStartDelay(0).start();
                        }
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.l$k */
    public static final class C48272k implements AbstractC58607b {

        /* renamed from: a */
        final /* synthetic */ C48259l f111885a;

        static {
            Covode.recordClassIndex(57014);
        }

        @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b
        public final void firstFrame() {
        }

        @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b
        public final void playPrepared(String str) {
            C89219l.m154721d(str, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b
        public final void playerMediaError(String str) {
            C89219l.m154721d(str, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b
        public final void playing() {
        }

        @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b
        public final void seiUpdate(String str) {
            C89219l.m154721d(str, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C48272k(C48259l lVar) {
            this.f111885a = lVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b
        public final void playComplete(String str) {
            AwemeRawAd awemeRawAd;
            String str2;
            RoomFeedCellStruct roomFeedCellStruct;
            LiveRoomStruct newLiveRoomData;
            RoomFeedCellStruct roomFeedCellStruct2;
            LiveRoomStruct newLiveRoomData2;
            C89219l.m154721d(str, "");
            Aweme aweme = this.f111885a.f111708b;
            if (aweme != null && aweme.isAd()) {
                Aweme aweme2 = this.f111885a.f111708b;
                String str3 = null;
                if (aweme2 != null) {
                    awemeRawAd = aweme2.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                C18129a.C18130a b = C18129a.m33746a("draw_ad", "over", awemeRawAd).mo28900b("duration", Long.valueOf(System.currentTimeMillis() - this.f111885a.f111851m));
                Aweme aweme3 = this.f111885a.f111708b;
                if (aweme3 == null || (roomFeedCellStruct2 = aweme3.getRoomFeedCellStruct()) == null || (newLiveRoomData2 = roomFeedCellStruct2.getNewLiveRoomData()) == null) {
                    str2 = null;
                } else {
                    str2 = String.valueOf(newLiveRoomData2.getAnchorId());
                }
                C18129a.C18130a a = b.mo28897a("anchor_id", str2);
                Aweme aweme4 = this.f111885a.f111708b;
                if (!(aweme4 == null || (roomFeedCellStruct = aweme4.getRoomFeedCellStruct()) == null || (newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData()) == null)) {
                    str3 = String.valueOf(newLiveRoomData.f114485id);
                }
                a.mo28897a("room_id", str3).mo28901b();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b
        public final void onPlayerMessage(AbstractC11643g.EnumC11645b bVar, Object obj) {
            C89219l.m154721d(bVar, "");
            int i = C48284m.f111903a[bVar.ordinal()];
            if (i == 1 || i == 2) {
                this.f111885a.mo80385f(true);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b
        public final void onVideoSizeChange(TextureView textureView, int i, int i2) {
            C48259l lVar = this.f111885a;
            ViewGroup.LayoutParams layoutParams = lVar.f111859u.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (i > i2) {
                marginLayoutParams.width = C34723i.m70928b(lVar.f111707a);
                marginLayoutParams.height = (int) (((float) marginLayoutParams.width) * (((float) i2) / ((float) i)));
                marginLayoutParams.topMargin = (int) C13628n.m24520b(lVar.f111707a, 96.0f);
            } else {
                marginLayoutParams.width = C34723i.m70928b(lVar.f111707a);
                marginLayoutParams.height = C34723i.m70924a(lVar.f111707a) - C13628n.m24525e(lVar.f111707a);
                marginLayoutParams.topMargin = 0;
            }
            lVar.f111859u.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.l$a */
    public static final class C48260a implements AbstractC88433f<C17873f.C17875b> {

        /* renamed from: a */
        public boolean f111865a;

        /* renamed from: b */
        public boolean f111866b;

        static {
            Covode.recordClassIndex(57002);
        }

        /* renamed from: a */
        public final void mo80389a(boolean z) {
            if (z) {
                this.f111865a = true;
            } else if (this.f111865a) {
                this.f111865a = false;
                this.f111866b = true;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C17873f.C17875b bVar) {
            C17873f.C17875b bVar2 = bVar;
            if (bVar2 != null) {
                mo80389a(bVar2.f42646b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.l$e */
    static final class View$OnClickListenerC48264e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Aweme f111871a;

        static {
            Covode.recordClassIndex(57006);
        }

        View$OnClickListenerC48264e(Aweme aweme) {
            this.f111871a = aweme;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Aweme aweme = this.f111871a;
            if (aweme != null) {
                C89219l.m154716b(view, "");
                C48956a.m92139a(aweme, view);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.l$r */
    static final class View$OnClickListenerC48279r implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C48259l f111898a;

        static {
            Covode.recordClassIndex(57021);
        }

        View$OnClickListenerC48279r(C48259l lVar) {
            this.f111898a = lVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f111898a.mo80380X();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.l$s */
    static final class View$OnClickListenerC48280s implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C48259l f111899a;

        static {
            Covode.recordClassIndex(57022);
        }

        View$OnClickListenerC48280s(C48259l lVar) {
            this.f111899a = lVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f111899a.mo80380X();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.l$t */
    static final class View$OnClickListenerC48281t implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C48259l f111900a;

        static {
            Covode.recordClassIndex(57023);
        }

        View$OnClickListenerC48281t(C48259l lVar) {
            this.f111900a = lVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f111900a.mo80382Z();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.l$n */
    static final class View$OnClickListenerC48275n implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C48259l f111889a;

        /* renamed from: b */
        final /* synthetic */ C56259l f111890b;

        static {
            Covode.recordClassIndex(57017);
        }

        View$OnClickListenerC48275n(C48259l lVar, C56259l lVar2) {
            this.f111889a = lVar;
            this.f111890b = lVar2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C49914a.m93717a(this.f111889a.f111808S);
            this.f111890b.f128334f.mo92819a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.l$p */
    static final class View$OnClickListenerC48277p implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C48259l f111894a;

        /* renamed from: b */
        final /* synthetic */ LiveRoomStruct f111895b;

        static {
            Covode.recordClassIndex(57019);
        }

        View$OnClickListenerC48277p(C48259l lVar, LiveRoomStruct liveRoomStruct) {
            this.f111894a = lVar;
            this.f111895b = liveRoomStruct;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f111894a.f111714h) {
                this.f111894a.f111714h = false;
            } else {
                this.f111894a.mo80383a(this.f111895b);
            }
        }
    }

    /* renamed from: b */
    public static int m91683b(LiveRoomStruct liveRoomStruct) {
        User user = liveRoomStruct.owner;
        if (user == null) {
            return -1;
        }
        int followStatus = user.getFollowStatus();
        if (followStatus == 0 || followStatus == 1 || followStatus == 2) {
            return followStatus;
        }
        if (user.getFollowerStatus() == 0) {
            return 0;
        }
        return 3;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48145ae, com.p2082ss.android.ugc.aweme.feed.adapter.C48224c
    /* renamed from: f */
    public final void mo80285f(int i) {
        View view = this.f111835al;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C89219l.m154716b(layoutParams, "");
            layoutParams.height = i;
            this.f111835al.setLayoutParams(layoutParams);
            this.f111835al.requestLayout();
            this.f111835al.setVisibility(0);
        }
    }

    @AbstractC90264r
    public final void onEvent(C11771j jVar) {
        C89219l.m154721d(jVar, "");
        LiveRoomStruct liveRoomStruct = this.f111709c;
        if (liveRoomStruct != null && liveRoomStruct.f114485id == jVar.f28125a) {
            AbstractC81915c.m141874a(new C49677e(mo80206b(), this.f111843at));
        }
    }

    /* renamed from: b */
    private static void m91684b(Activity activity) {
        try {
            Method declaredMethod = Activity.class.getDeclaredMethod("convertFromTranslucent", new Class[0]);
            C89219l.m154716b(declaredMethod, "");
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(activity, new Object[0]);
        } catch (Throwable th) {
            C3854a.m9458a("FeedLiveViewHolderNew", th);
        }
    }

    /* renamed from: f */
    public final void mo80385f(boolean z) {
        LiveRoomStruct liveRoomStruct = this.f111709c;
        if (liveRoomStruct != null) {
            ILiveOuterService s = LiveOuterService.m107269s();
            C89219l.m154716b(s, "");
            s.mo95830d().mo12986a(liveRoomStruct.f114485id, new C48267h(this, z));
        }
    }

    @AbstractC90264r
    public final void onFollowLiveStatusChange(C2954a aVar) {
        C89219l.m154721d(aVar, "");
        LiveRoomStruct liveRoomStruct = this.f111709c;
        if (liveRoomStruct != null && liveRoomStruct.f114485id == aVar.f8696a && aVar.f8698c) {
            this.f111850l = false;
            mo80368n();
            this.f111807R.pauseWithStreamData();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.l$l */
    public static final class C48273l extends AbstractC7258b {

        /* renamed from: b */
        final /* synthetic */ String f111886b;

        /* renamed from: c */
        final /* synthetic */ long f111887c;

        static {
            Covode.recordClassIndex(57015);
        }

        @Override // com.bytedance.android.livesdk.callback.AbstractC7258b
        /* renamed from: a */
        public final void mo13461a(Map<String, Object> map) {
            Object obj;
            String str;
            String str2;
            HashMap<String, String> hashMap = null;
            if (map != null) {
                obj = map.get("audience_live_play_enter_room_config");
            } else {
                obj = null;
            }
            if (!(obj instanceof EnterRoomConfig)) {
                obj = null;
            }
            EnterRoomConfig enterRoomConfig = (EnterRoomConfig) obj;
            if (enterRoomConfig != null) {
                EnterRoomConfig.RoomsData roomsData = enterRoomConfig.f28233c;
                if (roomsData != null) {
                    hashMap = roomsData.f28356l;
                }
                EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.f28233c;
                if (roomsData2 != null && roomsData2.f28359o) {
                    String str3 = this.f111886b;
                    String str4 = "";
                    if (hashMap == null || (str = hashMap.get("value")) == null) {
                        str = str4;
                    }
                    C89219l.m154716b(str, str4);
                    if (!(hashMap == null || (str2 = hashMap.get("log_extra")) == null)) {
                        str4 = str2;
                    }
                    C18129a.m33747a("live_ad", str3, str, str4, "0").mo28897a("room_id", map.get("audience_live_play_room_id")).mo28901b();
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48273l(String str, long j, long j2) {
            super(j2);
            this.f111886b = str;
            this.f111887c = j;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.l$u */
    public static final class View$OnClickListenerC48282u implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C48259l f111901a;

        static {
            Covode.recordClassIndex(57024);
        }

        View$OnClickListenerC48282u(C48259l lVar) {
            this.f111901a = lVar;
        }

        public final void onClick(View view) {
            String str;
            Long l;
            User user;
            ClickAgent.onClick(view);
            this.f111901a.f111801L = true;
            this.f111901a.f111792C.setVisibility(8);
            this.f111901a.mo80369o();
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from_merge", this.f111901a.mo80364K());
            hashMap.put("enter_method", "live_cell");
            LiveRoomStruct liveRoomStruct = this.f111901a.f111709c;
            if (liveRoomStruct == null || (user = liveRoomStruct.owner) == null || (str = user.getUid()) == null) {
                str = "";
            }
            hashMap.put("anchor_id", str);
            LiveRoomStruct liveRoomStruct2 = this.f111901a.f111709c;
            if (liveRoomStruct2 != null) {
                l = Long.valueOf(liveRoomStruct2.f114485id);
            } else {
                l = null;
            }
            hashMap.put("room_id", String.valueOf(l));
            hashMap.put("action_type", "click");
            hashMap.put("click_icon", "watch");
            C6501b.C6502a.m13948a("livesdk_mask_layer_click").mo12652a((Map<String, String>) hashMap).mo12655b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.l$v */
    public static final class View$OnClickListenerC48283v implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C48259l f111902a;

        static {
            Covode.recordClassIndex(57025);
        }

        View$OnClickListenerC48283v(C48259l lVar) {
            this.f111902a = lVar;
        }

        public final void onClick(View view) {
            String str;
            Long l;
            User user;
            ClickAgent.onClick(view);
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.eda);
            this.f111902a.f111802M = true;
            this.f111902a.f111796G = true;
            this.f111902a.mo80382Z();
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from_merge", this.f111902a.mo80364K());
            hashMap.put("enter_method", "live_cell");
            LiveRoomStruct liveRoomStruct = this.f111902a.f111709c;
            if (liveRoomStruct == null || (user = liveRoomStruct.owner) == null || (str = user.getUid()) == null) {
                str = "";
            }
            hashMap.put("anchor_id", str);
            LiveRoomStruct liveRoomStruct2 = this.f111902a.f111709c;
            if (liveRoomStruct2 != null) {
                l = Long.valueOf(liveRoomStruct2.f114485id);
            } else {
                l = null;
            }
            hashMap.put("room_id", String.valueOf(l));
            hashMap.put("action_type", "click");
            hashMap.put("click_icon", "skip");
            C6501b.C6502a.m13948a("livesdk_mask_layer_click").mo12652a((Map<String, String>) hashMap).mo12655b();
        }
    }

    /* renamed from: g */
    private final void m91685g(boolean z) {
        if (z) {
            this.f111811V.animate().alpha(0.0f).setDuration(200).start();
            this.f111810U.animate().alpha(0.0f).setDuration(200).start();
            if (this.f111707a instanceof Activity) {
                m91671a((Activity) this.f111707a);
                return;
            }
            return;
        }
        this.f111811V.setAlpha(1.0f);
        this.f111810U.setAlpha(1.0f);
        if (this.f111707a instanceof Activity) {
            m91684b((Activity) this.f111707a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.C48224c
    /* renamed from: a */
    public final void mo70614a(int i) {
        super.mo70614a(i);
        this.f111818aC = i;
        this.f111848ay = false;
        this.f111796G = true;
        this.f111847ax = 0;
        this.f111851m = System.currentTimeMillis();
        ConstraintLayout constraintLayout = this.f111810U;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
        mo80385f(true);
        this.f111859u.setVisibility(0);
        this.f111807R.setMute(false);
        this.f111846aw = false;
        LiveRoomStruct liveRoomStruct = this.f111709c;
        if (liveRoomStruct != null && C38143a.m77302a(mo80206b()) && this.f111850l) {
            this.f111806Q.mo66411b();
            ICommercializeLiveService a = CommercializeLiveServiceImpl.m77282a();
            String valueOf = String.valueOf(liveRoomStruct.f114485id);
            User user = liveRoomStruct.owner;
            C89219l.m154716b(user, "");
            String uid = user.getUid();
            C89219l.m154716b(uid, "");
            User user2 = liveRoomStruct.owner;
            C89219l.m154716b(user2, "");
            String secUid = user2.getSecUid();
            C89219l.m154716b(secUid, "");
            AbstractC21983b<C38050c> a2 = a.mo66421a(valueOf, uid, secUid);
            this.f111820aE = a2;
            if (a2 != null) {
                a2.enqueue(new C48261b(liveRoomStruct, this));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.C48224c
    /* renamed from: b */
    public final void mo80207b(int i) {
        m91678ag();
        this.f111846aw = true;
        this.f111845av.mo96047a();
        if (this.f111797H) {
            C49538f fVar = this.f111798I;
            if (fVar != null) {
                fVar.f113922a.cancel();
                return;
            }
            return;
        }
        this.f111805P.removeMessages(100);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.C48224c
    /* renamed from: c */
    public final void mo80210c(int i) {
        if (this.f111715i) {
            AbstractC81915c.m141874a(new C48020ab(true));
            m91685g(false);
        }
        super.mo80210c(i);
        if (this.f111850l) {
            return;
        }
        if (this.f111797H) {
            C49538f fVar = this.f111798I;
            if (fVar != null) {
                fVar.mo81265a();
                return;
            }
            return;
        }
        mo80381Y();
    }

    public final boolean handleMessage(Message message) {
        long j;
        C89219l.m154721d(message, "");
        if (message.what == 100) {
            mo80382Z();
            return true;
        } else if (message.what == 1) {
            Object obj = message.obj;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.ShareCompleteEvent");
            C56257j jVar = (C56257j) obj;
            C49914a.m93719a(jVar, this.f111808S);
            if (TextUtils.isEmpty(jVar.f128326i)) {
                j = 5000;
            } else {
                j = InteractFirstFrameTimeOutDurationSetting.DEFAULT;
            }
            this.f111805P.sendEmptyMessageDelayed(2, j);
            return true;
        } else if (message.what == 2) {
            C49914a.m93726c(this.f111808S);
            return true;
        } else if (message.what == 3) {
            C49914a.m93717a(this.f111808S);
            return true;
        } else if (message.what != 4) {
            return false;
        } else {
            C49914a.m93724b(this.f111808S);
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.l$h */
    public static final class C48267h implements AbstractC11843a {

        /* renamed from: a */
        final /* synthetic */ C48259l f111879a;

        /* renamed from: b */
        final /* synthetic */ boolean f111880b;

        static {
            Covode.recordClassIndex(57009);
        }

        @Override // com.bytedance.android.livesdkapi.service.AbstractC11843a
        /* renamed from: a */
        public final void mo18942a(boolean z) {
            Long l;
            AbstractC58647j m;
            if (z != this.f111879a.f111850l) {
                this.f111879a.f111850l = z;
                ILiveOuterService s = LiveOuterService.m107269s();
                if (!(s == null || (m = s.mo95839m()) == null)) {
                    m.mo34111a("ttlive_feed_avatar_live_show", 0, C89041ag.m154412a(C89387v.m154943a("alive", String.valueOf(z))));
                }
                this.f111879a.mo80368n();
            }
            if (!z) {
                this.f111879a.f111807R.stopWithStreamData();
                this.f111879a.f111855q.setVisibility(0);
                if (!this.f111879a.f111797H) {
                    this.f111879a.mo80381Y();
                } else if (this.f111880b) {
                    LinkedList<Long> linkedList = this.f111879a.f111799J;
                    LiveRoomStruct liveRoomStruct = this.f111879a.f111709c;
                    Long l2 = null;
                    if (liveRoomStruct != null) {
                        l = Long.valueOf(liveRoomStruct.f114485id);
                    } else {
                        l = null;
                    }
                    if (C89070n.m154556a((Iterable) linkedList, (Object) l)) {
                        this.f111879a.f111862x.setText(C58490ab.m107312a(this.f111879a.f111707a, "pm_livecard_end_subtitle_2"));
                        return;
                    }
                    String a = C58490ab.m107312a(this.f111879a.f111707a, "pm_livecard_end_subtitle_1");
                    C48259l lVar = this.f111879a;
                    TextView textView = this.f111879a.f111862x;
                    C89219l.m154716b(a, "");
                    lVar.f111798I = new C49538f(textView, a, new AbstractC89171a<C89391z>(this.f111879a) {
                        /* class com.p2082ss.android.ugc.aweme.feed.adapter.C48259l.C48267h.C482681 */

                        static {
                            Covode.recordClassIndex(57010);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // p4600h.p4611f.p4612a.AbstractC89171a
                        public final /* synthetic */ C89391z invoke() {
                            ((C48259l) this.receiver).mo80382Z();
                            return C89391z.f203057a;
                        }
                    });
                    C49538f fVar = this.f111879a.f111798I;
                    if (fVar != null) {
                        fVar.mo81266a(fVar.f113923b / 1000);
                        fVar.f113922a.start();
                    }
                    if (this.f111879a.f111799J.size() == 20) {
                        this.f111879a.f111799J.poll();
                    }
                    LinkedList<Long> linkedList2 = this.f111879a.f111799J;
                    LiveRoomStruct liveRoomStruct2 = this.f111879a.f111709c;
                    if (liveRoomStruct2 != null) {
                        l2 = Long.valueOf(liveRoomStruct2.f114485id);
                    }
                    linkedList2.offer(l2);
                }
            }
        }

        C48267h(C48259l lVar, boolean z) {
            this.f111879a = lVar;
            this.f111880b = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.l$q */
    static final class View$OnClickListenerC48278q implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C48259l f111896a;

        /* renamed from: b */
        final /* synthetic */ LiveRoomStruct f111897b;

        static {
            Covode.recordClassIndex(57020);
        }

        View$OnClickListenerC48278q(C48259l lVar, LiveRoomStruct liveRoomStruct) {
            this.f111896a = lVar;
            this.f111897b = liveRoomStruct;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C33744d a = new C33744d().mo59983a("enter_from_merge", this.f111896a.mo80364K()).mo59983a("action_type", "click");
            LiveRoomStruct liveRoomStruct = this.f111896a.f111709c;
            if (liveRoomStruct == null) {
                C89219l.m154715b();
            }
            User user = liveRoomStruct.owner;
            C89219l.m154716b(user, "");
            C33744d a2 = a.mo59983a("anchor_id", user.getUid());
            LiveRoomStruct liveRoomStruct2 = this.f111896a.f111709c;
            if (liveRoomStruct2 == null) {
                C89219l.m154715b();
            }
            C33744d a3 = a2.mo59981a("room_id", liveRoomStruct2.f114485id);
            Aweme aweme = this.f111896a.f111708b;
            if (aweme == null) {
                C89219l.m154715b();
            }
            C33744d a4 = a3.mo59983a("request_id", aweme.getRequestId()).mo59983a("enter_method", "live_cell");
            User user2 = this.f111897b.owner;
            C89219l.m154716b(user2, "");
            C39162r.m79460a("livesdk_finish_card_click", a4.mo59980a("follow_status", user2.getFollowStatus()).f79943a);
            this.f111896a.mo80383a(this.f111897b);
        }
    }

    /* renamed from: a */
    private static void m91671a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                Method declaredMethod = Activity.class.getDeclaredMethod("getActivityOptions", new Class[0]);
                C89219l.m154716b(declaredMethod, "");
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(activity, new Object[0]);
                Class<?>[] declaredClasses = Activity.class.getDeclaredClasses();
                Class<?> cls = null;
                for (Class<?> cls2 : declaredClasses) {
                    C89219l.m154716b(cls2, "");
                    String simpleName = cls2.getSimpleName();
                    C89219l.m154716b(simpleName, "");
                    if (C89361p.m154908a((CharSequence) simpleName, (CharSequence) "TranslucentConversionListener", false)) {
                        cls = cls2;
                    }
                }
                int i = Build.VERSION.SDK_INT;
                Method declaredMethod2 = Activity.class.getDeclaredMethod("convertToTranslucent", cls, ActivityOptions.class);
                C89219l.m154716b(declaredMethod2, "");
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(activity, null, invoke);
            } catch (Throwable th) {
                C3854a.m9458a("FeedLiveViewHolderNew", th);
            }
        } else {
            try {
                Class<?>[] declaredClasses2 = Activity.class.getDeclaredClasses();
                Class<?> cls3 = null;
                for (Class<?> cls4 : declaredClasses2) {
                    C89219l.m154716b(cls4, "");
                    String simpleName2 = cls4.getSimpleName();
                    C89219l.m154716b(simpleName2, "");
                    if (C89361p.m154908a((CharSequence) simpleName2, (CharSequence) "TranslucentConversionListener", false)) {
                        cls3 = cls4;
                    }
                }
                Method declaredMethod3 = Activity.class.getDeclaredMethod("convertToTranslucent", cls3);
                C89219l.m154716b(declaredMethod3, "");
                declaredMethod3.setAccessible(true);
                declaredMethod3.invoke(activity, new Object[]{null});
            } catch (Throwable th2) {
                C3854a.m9458a("FeedLiveViewHolderNew", th2);
            }
        }
    }

    /* renamed from: h */
    private final void m91686h(boolean z) {
        String str;
        Long l;
        String str2;
        String str3;
        User user;
        User user2;
        C33744d a = new C33744d().mo59983a("enter_from_merge", mo80364K()).mo59983a("action_type", "click");
        LiveRoomStruct liveRoomStruct = this.f111709c;
        Integer num = null;
        if (liveRoomStruct == null || (user2 = liveRoomStruct.owner) == null) {
            str = null;
        } else {
            str = user2.getUid();
        }
        C33744d a2 = a.mo59983a("anchor_id", str);
        LiveRoomStruct liveRoomStruct2 = this.f111709c;
        if (liveRoomStruct2 != null) {
            l = Long.valueOf(liveRoomStruct2.f114485id);
        } else {
            l = null;
        }
        C33744d a3 = a2.mo59982a("room_id", l);
        Aweme aweme = this.f111708b;
        if (aweme != null) {
            str2 = aweme.getRequestId();
        } else {
            str2 = null;
        }
        C33744d a4 = a3.mo59983a("request_id", str2).mo59983a("enter_method", "live_cell");
        LiveRoomStruct liveRoomStruct3 = this.f111709c;
        if (!(liveRoomStruct3 == null || (user = liveRoomStruct3.owner) == null)) {
            num = Integer.valueOf(user.getFollowStatus());
        }
        C33744d a5 = a4.mo59982a("follow_status", num);
        if (z) {
            str3 = "auto";
        } else {
            str3 = "swipe";
        }
        C39162r.m79460a("livesdk_finish_card_swipe", a5.mo59983a("request_type", str3).f79943a);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag, com.p2082ss.android.ugc.aweme.feed.adapter.C48224c
    /* renamed from: b */
    public final void mo80209b(Aweme aweme) {
        String str;
        Long l;
        String str2;
        String str3;
        User user;
        User user2;
        C49538f fVar;
        if (this.f111715i) {
            AbstractC81915c.m141874a(new C48020ab(true));
            m91685g(false);
        }
        super.mo80209b(aweme);
        if (!this.f111796G) {
            this.f111859u.setVisibility(8);
        }
        this.f111853o = true;
        this.f111851m = System.currentTimeMillis();
        this.f111852n = 0;
        this.f111854p = false;
        mo80369o();
        if (this.f111846aw) {
            m91679ah();
            this.f111846aw = false;
        }
        if (!this.f111850l) {
            if (this.f111797H && (fVar = this.f111798I) != null) {
                fVar.mo81265a();
            }
            C33744d a = new C33744d().mo59983a("enter_from_merge", mo80364K()).mo59983a("action_type", "click");
            LiveRoomStruct liveRoomStruct = this.f111709c;
            Integer num = null;
            if (liveRoomStruct == null || (user2 = liveRoomStruct.owner) == null) {
                str = null;
            } else {
                str = user2.getUid();
            }
            C33744d a2 = a.mo59983a("anchor_id", str);
            LiveRoomStruct liveRoomStruct2 = this.f111709c;
            if (liveRoomStruct2 != null) {
                l = Long.valueOf(liveRoomStruct2.f114485id);
            } else {
                l = null;
            }
            C33744d a3 = a2.mo59982a("room_id", l);
            Aweme aweme2 = this.f111708b;
            if (aweme2 != null) {
                str2 = aweme2.getRequestId();
            } else {
                str2 = null;
            }
            C33744d a4 = a3.mo59983a("request_id", str2).mo59983a("enter_method", "live_cell");
            LiveRoomStruct liveRoomStruct3 = this.f111709c;
            if (!(liveRoomStruct3 == null || (user = liveRoomStruct3.owner) == null)) {
                num = Integer.valueOf(user.getFollowStatus());
            }
            C33744d a5 = a4.mo59982a("follow_status", num);
            C48260a aVar = this.f111821aF;
            if (aVar == null || !aVar.f111866b) {
                str3 = "0";
            } else {
                str3 = "1";
            }
            C39162r.m79460a("livesdk_finish_card_show", a5.mo59983a("back_from_background", str3).f79943a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.C48224c
    /* renamed from: c */
    public final void mo80212c(boolean z) {
        if (z) {
            this.f111811V.animate().alpha(0.0f).setDuration(200).start();
            this.f111810U.animate().alpha(0.0f).setDuration(200).start();
            return;
        }
        this.f111811V.animate().alpha(1.0f).setDuration(200).start();
        this.f111810U.animate().alpha(1.0f).setDuration(200).start();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C12242b bVar) {
        String str;
        C12242b bVar2 = bVar;
        if (bVar2 != null && (str = bVar2.f29504a) != null) {
            int hashCode = str.hashCode();
            if (hashCode != 97530138) {
                if (hashCode == 97857237 && str.equals("ad_live_card_show") && (this.f111863y instanceof ViewGroup)) {
                    C48269i iVar = new C48269i(this);
                    if (C34729o.m70957a(this.f111860v)) {
                        iVar.mo80393a(this.f111860v);
                    } else if (C34729o.m70957a(this.f111861w)) {
                        iVar.mo80393a(this.f111861w);
                    }
                }
            } else if (str.equals("ad_live_card_hide")) {
                View view = this.f111863y;
                if (view instanceof ViewGroup) {
                    view.animate().translationY(0.0f).setDuration(360).setStartDelay(250).start();
                    int childCount = ((ViewGroup) this.f111863y).getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        ((ViewGroup) this.f111863y).getChildAt(i).animate().alpha(1.0f).setDuration(200).setStartDelay(450).start();
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.C48224c
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70615a(com.p2082ss.android.ugc.aweme.feed.model.Aweme r8) {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.adapter.C48259l.mo70615a(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.l$f */
    static final class View$OnClickListenerC48265f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LiveRoomStruct f111872a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f111873b;

        /* renamed from: c */
        final /* synthetic */ C48259l f111874c;

        static {
            Covode.recordClassIndex(57007);
        }

        View$OnClickListenerC48265f(LiveRoomStruct liveRoomStruct, C89233z.C89238e eVar, C48259l lVar) {
            this.f111872a = liveRoomStruct;
            this.f111873b = eVar;
            this.f111874c = lVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:44:0x016d  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x0177  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x021a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r11) {
            /*
            // Method dump skipped, instructions count: 549
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.adapter.C48259l.View$OnClickListenerC48265f.onClick(android.view.View):void");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:86:0x024d, code lost:
        if (r1 != null) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x025b, code lost:
        if (r1 != null) goto L_0x022c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80383a(com.p2082ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r12) {
        /*
        // Method dump skipped, instructions count: 858
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.adapter.C48259l.mo80383a(com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.C48224c
    /* renamed from: a */
    public final void mo80163a(C56257j jVar) {
        super.mo80163a(jVar);
        Aweme aweme = this.f111708b;
        if (aweme != null && jVar != null && TextUtils.equals(jVar.f128324g, aweme.getAid())) {
            if (TextUtils.isEmpty(this.f111823aH) || TextUtils.isEmpty(jVar.f128326i) || TextUtils.equals(this.f111823aH, jVar.f128326i)) {
                m91674ac();
                Message obtainMessage = this.f111805P.obtainMessage(1);
                C89219l.m154716b(obtainMessage, "");
                obtainMessage.obj = jVar;
                if (TextUtils.isEmpty(jVar.f128326i)) {
                    this.f111805P.sendMessage(obtainMessage);
                } else {
                    this.f111805P.sendMessageDelayed(obtainMessage, 500);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.l$b */
    public static final class C48261b implements AbstractC22030d<C38050c> {

        /* renamed from: a */
        final /* synthetic */ LiveRoomStruct f111867a;

        /* renamed from: b */
        final /* synthetic */ C48259l f111868b;

        static {
            Covode.recordClassIndex(57003);
        }

        C48261b(LiveRoomStruct liveRoomStruct, C48259l lVar) {
            this.f111867a = liveRoomStruct;
            this.f111868b = lVar;
        }

        @Override // com.bytedance.retrofit2.AbstractC22030d
        /* renamed from: a */
        public final void mo6818a(AbstractC21983b<C38050c> bVar, Throwable th) {
            AwemeRawAd awemeRawAd;
            if (this.f111868b.f111796G) {
                Aweme aweme = this.f111868b.f111708b;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                C18129a.m33746a("draw_ad", "othershow_fail", awemeRawAd).mo28900b("refer", "card").mo28897a("fail_reason", "app_tech_problem").mo28901b();
            }
        }

        @Override // com.bytedance.retrofit2.AbstractC22030d
        /* renamed from: a */
        public final void mo6817a(AbstractC21983b<C38050c> bVar, C22099u<C38050c> uVar) {
            C38049b bVar2;
            AwemeRawAd awemeRawAd = null;
            if (this.f111868b.f111708b == null || !C38143a.m77302a(this.f111868b.f111708b)) {
                Aweme aweme = this.f111868b.f111708b;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                }
                C18129a.m33746a("draw_ad", "othershow_fail", awemeRawAd).mo28900b("refer", "card").mo28897a("fail_reason", "app_tech_problem").mo28901b();
            } else if (uVar == null || uVar.f52262b == null || !uVar.f52261a.mo35845a() || uVar.f52262b.f89912a == null || (bVar2 = uVar.f52262b.f89912a) == null || bVar2.f89911a == null || uVar.f52262b.mo66332a() == null) {
                Aweme aweme2 = this.f111868b.f111708b;
                if (aweme2 != null) {
                    awemeRawAd = aweme2.getAwemeRawAd();
                }
                C18129a.m33746a("draw_ad", "othershow_fail", awemeRawAd).mo28900b("refer", "card").mo28897a("fail_reason", "no_live_product").mo28901b();
            } else {
                C38051d a = uVar.f52262b.mo66332a();
                if (a == null) {
                    C89219l.m154715b();
                }
                if (a.f89915a != 1) {
                    Aweme aweme3 = this.f111868b.f111708b;
                    if (aweme3 != null) {
                        awemeRawAd = aweme3.getAwemeRawAd();
                    }
                    C18129a.m33746a("draw_ad", "othershow_fail", awemeRawAd).mo28900b("refer", "card").mo28897a("fail_reason", "sold_out").mo28901b();
                    return;
                }
                C38049b bVar3 = uVar.f52262b.f89912a;
                if (bVar3 == null) {
                    C89219l.m154715b();
                }
                CardStruct cardStruct = bVar3.f89911a;
                if (cardStruct == null) {
                    C89219l.m154715b();
                }
                Boolean onlyTrackEventNotShow = cardStruct.getOnlyTrackEventNotShow();
                C89219l.m154716b(onlyTrackEventNotShow, "");
                if (onlyTrackEventNotShow.booleanValue()) {
                    Aweme aweme4 = this.f111868b.f111708b;
                    if (aweme4 != null) {
                        awemeRawAd = aweme4.getAwemeRawAd();
                    }
                    C18129a.m33746a("draw_ad", "othershow_fail", awemeRawAd).mo28900b("refer", "card").mo28897a("fail_reason", "only_track").mo28901b();
                    return;
                }
                this.f111868b.f111806Q.mo66409a(cardStruct);
                Aweme aweme5 = this.f111868b.f111708b;
                if (aweme5 == null) {
                    C89219l.m154715b();
                }
                AwemeRawAd awemeRawAd2 = aweme5.getAwemeRawAd();
                if (awemeRawAd2 == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(awemeRawAd2, "");
                C38048a a2 = C38143a.m77300a(awemeRawAd2, "12");
                a2.f89905b = String.valueOf(this.f111867a.f114485id);
                User user = this.f111867a.owner;
                C89219l.m154716b(user, "");
                a2.f89906c = user.getUid();
                User user2 = this.f111867a.owner;
                C89219l.m154716b(user2, "");
                a2.f89907d = String.valueOf(user2.getFollowStatus());
                AbstractC38121a aVar = this.f111868b.f111806Q;
                String b = C80342dg.m139300a().mo46674b(a2);
                C89219l.m154716b(b, "");
                String b2 = C80342dg.m139300a().mo46674b(uVar.f52262b.f89913b);
                C89219l.m154716b(b2, "");
                aVar.mo66410a(b, b2);
                this.f111868b.f111806Q.mo66405a();
                if (cardStruct.getShowSeconds() > 0) {
                    this.f111868b.f111806Q.mo66406a(((long) cardStruct.getShowSeconds()) * 1000);
                } else {
                    this.f111868b.f111806Q.mo66406a(0);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m91670a(long j, String str) {
        C89219l.m154721d(str, "");
        ILiveOuterService s = LiveOuterService.m107269s();
        C89219l.m154716b(s, "");
        s.mo95830d().mo12995a(AbstractC7258b.EnumC7259a.AUDIENCE_LIVE_PLAY_DURATION, new C48273l(str, j, j));
    }

    /* renamed from: a */
    static void m91672a(TextView textView, int i) {
        if (i == 2) {
            textView.setTextColor(C3966y.m9663b((int) R.color.a0_));
            textView.setBackgroundResource(R.drawable.pt);
        } else if (i == 3) {
            textView.setTextColor(C3966y.m9663b((int) R.color.a0e));
            textView.setBackgroundResource(R.drawable.pu);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48259l(View view, String str, Fragment fragment) {
        super(view);
        boolean z;
        Boolean bool;
        C89219l.m154721d(view, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(fragment, "");
        View findViewById = view.findViewById(R.id.ffz);
        C89219l.m154716b(findViewById, "");
        this.f111809T = findViewById;
        View findViewById2 = view.findViewById(R.id.dko);
        C89219l.m154716b(findViewById2, "");
        this.f111855q = (RemoteImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.eyx);
        C89219l.m154716b(findViewById3, "");
        this.f111856r = (TuxTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.ez5);
        C89219l.m154716b(findViewById4, "");
        this.f111857s = (TuxTextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.et);
        C89219l.m154716b(findViewById5, "");
        this.f111858t = (RichTagView) findViewById5;
        View findViewById6 = view.findViewById(R.id.b4t);
        C89219l.m154716b(findViewById6, "");
        this.f111859u = (FrameLayout) findViewById6;
        View findViewById7 = view.findViewById(R.id.b3m);
        C89219l.m154716b(findViewById7, "");
        this.f111810U = (ConstraintLayout) findViewById7;
        View findViewById8 = view.findViewById(R.id.bbq);
        C89219l.m154716b(findViewById8, "");
        this.f111811V = findViewById8;
        View findViewById9 = view.findViewById(R.id.eyv);
        C89219l.m154716b(findViewById9, "");
        this.f111812W = (TextView) findViewById9;
        View findViewById10 = view.findViewById(R.id.c9m);
        C89219l.m154716b(findViewById10, "");
        this.f111813X = (LinearLayout) findViewById10;
        View findViewById11 = view.findViewById(R.id.bl8);
        C89219l.m154716b(findViewById11, "");
        this.f111814Y = (RemoteImageView) findViewById11;
        View findViewById12 = view.findViewById(R.id.ez3);
        C89219l.m154716b(findViewById12, "");
        this.f111815Z = (TextView) findViewById12;
        View findViewById13 = view.findViewById(R.id.ez4);
        C89219l.m154716b(findViewById13, "");
        this.f111824aa = (TextView) findViewById13;
        View findViewById14 = view.findViewById(R.id.vh);
        C89219l.m154716b(findViewById14, "");
        this.f111860v = findViewById14;
        View findViewById15 = view.findViewById(R.id.vi);
        C89219l.m154716b(findViewById15, "");
        this.f111861w = findViewById15;
        View findViewById16 = view.findViewById(R.id.adn);
        C89219l.m154716b(findViewById16, "");
        this.f111862x = (TextView) findViewById16;
        View findViewById17 = view.findViewById(R.id.avp);
        C89219l.m154716b(findViewById17, "");
        this.f111825ab = findViewById17;
        View findViewById18 = view.findViewById(R.id.c2u);
        C89219l.m154716b(findViewById18, "");
        this.f111826ac = (LottieAnimationView) findViewById18;
        View findViewById19 = view.findViewById(R.id.c2v);
        C89219l.m154716b(findViewById19, "");
        this.f111827ad = (LottieAnimationView) findViewById19;
        View findViewById20 = view.findViewById(R.id.b3i);
        C89219l.m154716b(findViewById20, "");
        this.f111828ae = (FrameLayout) findViewById20;
        View findViewById21 = view.findViewById(R.id.ch5);
        C89219l.m154716b(findViewById21, "");
        this.f111829af = (LongPressLayout) findViewById21;
        View findViewById22 = view.findViewById(R.id.ccr);
        C89219l.m154716b(findViewById22, "");
        this.f111863y = findViewById22;
        View findViewById23 = view.findViewById(R.id.eyy);
        C89219l.m154716b(findViewById23, "");
        this.f111830ag = (TextView) findViewById23;
        View findViewById24 = view.findViewById(R.id.caw);
        C89219l.m154716b(findViewById24, "");
        this.f111831ah = (SmartAvatarBorderView) findViewById24;
        View findViewById25 = view.findViewById(R.id.cdn);
        C89219l.m154716b(findViewById25, "");
        this.f111832ai = findViewById25;
        View findViewById26 = view.findViewById(R.id.axe);
        C89219l.m154716b(findViewById26, "");
        this.f111833aj = (ImageView) findViewById26;
        View findViewById27 = view.findViewById(R.id.eyt);
        C89219l.m154716b(findViewById27, "");
        this.f111864z = (TextView) findViewById27;
        View findViewById28 = view.findViewById(R.id.eyu);
        C89219l.m154716b(findViewById28, "");
        this.f111790A = (TextView) findViewById28;
        View findViewById29 = view.findViewById(R.id.c9l);
        C89219l.m154716b(findViewById29, "");
        this.f111791B = (LinearLayout) findViewById29;
        View findViewById30 = view.findViewById(R.id.cav);
        C89219l.m154716b(findViewById30, "");
        this.f111834ak = (TextView) findViewById30;
        this.f111835al = view.findViewById(R.id.fc2);
        View findViewById31 = view.findViewById(R.id.b4q);
        C89219l.m154716b(findViewById31, "");
        this.f111836am = (FrameLayout) findViewById31;
        View findViewById32 = view.findViewById(R.id.cip);
        C89219l.m154716b(findViewById32, "");
        this.f111792C = (ViewGroup) findViewById32;
        View findViewById33 = view.findViewById(R.id.fi7);
        C89219l.m154716b(findViewById33, "");
        this.f111837an = (WarningInfoView) findViewById33;
        View findViewById34 = view.findViewById(R.id.cin);
        C89219l.m154716b(findViewById34, "");
        this.f111838ao = (LiveTextView) findViewById34;
        View findViewById35 = view.findViewById(R.id.cil);
        C89219l.m154716b(findViewById35, "");
        this.f111839ap = (LiveTextView) findViewById35;
        View findViewById36 = view.findViewById(R.id.cio);
        C89219l.m154716b(findViewById36, "");
        this.f111840aq = (LiveTextView) findViewById36;
        View findViewById37 = view.findViewById(R.id.cik);
        C89219l.m154716b(findViewById37, "");
        this.f111841ar = (LiveTextView) findViewById37;
        View findViewById38 = view.findViewById(R.id.dii);
        C89219l.m154716b(findViewById38, "");
        this.f111842as = (FrameLayout) findViewById38;
        View findViewById39 = view.findViewById(R.id.c_s);
        C89219l.m154716b(findViewById39, "");
        FrameLayout frameLayout = (FrameLayout) findViewById39;
        this.f111793D = frameLayout;
        this.f111843at = str;
        this.f111845av = new View$OnAttachStateChangeListenerC58591b(view);
        ILiveOuterService s = LiveOuterService.m107269s();
        C89219l.m154716b(s, "");
        AbstractC58593c d = s.mo95830d();
        if (d == null || (bool = (Boolean) d.mo12981a("live_new_close_card_type", (Object) false)) == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        this.f111797H = z;
        this.f111799J = new LinkedList<>();
        this.f111817aB = C11831d.m20835a(new C48274m(this));
        this.f111818aC = -1;
        this.f111803N = new C48258k();
        DataCenter dataCenter = (DataCenter) C1181ae.m3879a(fragment, (C1175ad.AbstractC1177b) null).mo3983a(DataCenter.class);
        dataCenter.f29487a = fragment;
        C89219l.m154716b(dataCenter, "");
        this.f111819aD = dataCenter;
        this.f111805P = new Handler(Looper.getMainLooper(), this);
        this.f111806Q = CommercializeLiveServiceImpl.m77282a().mo66424a(frameLayout);
        AbstractC58608c a = LiveOuterService.m107269s().mo95826a(new RunnableC48271j(this), new C48272k(this));
        C89219l.m154716b(a, "");
        this.f111807R = a;
        TextView textView = (TextView) view.findViewById(R.id.f93);
        this.f111822aG = textView;
        this.f111808S = new C48201bd((TuxTextView) view.findViewById(R.id.dxl), view.findViewById(R.id.cbo), (TuxIconView) view.findViewById(R.id.dxu), (TuxIconView) view.findViewById(R.id.avv), textView);
        findViewById8.getLayoutParams().height = (C13628n.m24521b(this.f111707a) * 3) / 4;
        this.f111844au = C16048b.m29633a().mo25412a(true, "follow_live_interaction_style", 0);
        findViewById22.setVisibility(0);
        this.f111819aD.mo19692a("ad_live_card_hide", (AbstractC1214u<C12242b>) this);
        this.f111819aD.mo19692a("ad_live_card_show", (AbstractC1214u<C12242b>) this);
    }
}
