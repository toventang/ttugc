package com.p2082ss.android.ugc.aweme.commercialize.feed;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17238d;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashAdServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashSettingServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17975i;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.AbstractC18019c;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.C18017a;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.ies.ugc.aweme.rich.p1274ui.C18156a;
import com.bytedance.ies.ugc.aweme.rich.p1274ui.RichTagView;
import com.bytedance.p1777x.p1779b.C23684c;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.facebook.drawee.p1855f.C24246a;
import com.google.gson.C27910f;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.p1801a.C23768b;
import com.p2082ss.android.agilelogger.ALog;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.newmedia.C30128d;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33947e;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.C34606a;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AnimationImageView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.TagLayout;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35197k;
import com.p2082ss.android.ugc.aweme.commerce.p2505a.C37438a;
import com.p2082ss.android.ugc.aweme.commerce.p2505a.C37474j;
import com.p2082ss.android.ugc.aweme.commerce.p2505a.p2506a.p2507a.C37447d;
import com.p2082ss.android.ugc.aweme.commerce.p2505a.p2506a.p2510d.C37457a;
import com.p2082ss.android.ugc.aweme.commerce.p2505a.p2506a.p2511e.C37459b;
import com.p2082ss.android.ugc.aweme.commerce.p2505a.p2512b.C37466a;
import com.p2082ss.android.ugc.aweme.commercialize.AdCardServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.commercialize.IAdCardService;
import com.p2082ss.android.ugc.aweme.commercialize.egg.impl.service.CommerceEggServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.egg.p2555d.C37792d;
import com.p2082ss.android.ugc.aweme.commercialize.egg.p2556e.AbstractC37793a;
import com.p2082ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService;
import com.p2082ss.android.ugc.aweme.commercialize.event.C37832b;
import com.p2082ss.android.ugc.aweme.commercialize.event.C37838g;
import com.p2082ss.android.ugc.aweme.commercialize.feed.C37889c;
import com.p2082ss.android.ugc.aweme.commercialize.feed.p2563a.AbstractC37844a;
import com.p2082ss.android.ugc.aweme.commercialize.feed.p2564b.C37876a;
import com.p2082ss.android.ugc.aweme.commercialize.link.C38038b;
import com.p2082ss.android.ugc.aweme.commercialize.link.micro.CommerceMicroTagLayout;
import com.p2082ss.android.ugc.aweme.commercialize.link.p2574a.C38036a;
import com.p2082ss.android.ugc.aweme.commercialize.link.video.AbstractC38041a;
import com.p2082ss.android.ugc.aweme.commercialize.link.video.AbstractC38047g;
import com.p2082ss.android.ugc.aweme.commercialize.link.video.CommerceTagLayout;
import com.p2082ss.android.ugc.aweme.commercialize.link.video.DouPlusTagLayout;
import com.p2082ss.android.ugc.aweme.commercialize.link.video.View$OnClickListenerC38042b;
import com.p2082ss.android.ugc.aweme.commercialize.link.video.View$OnClickListenerC38043c;
import com.p2082ss.android.ugc.aweme.commercialize.live.p2575a.C38050c;
import com.p2082ss.android.ugc.aweme.commercialize.log.AbstractC38162ah;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38164aj;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38182f;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38198s;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38211a;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38214ac;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38227am;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38229ao;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38238g;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38239h;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38258v;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38259w;
import com.p2082ss.android.ugc.aweme.commercialize.p2533a.AbstractC37585a;
import com.p2082ss.android.ugc.aweme.commercialize.p2534ad.AdRatingView;
import com.p2082ss.android.ugc.aweme.commercialize.p2534ad.AdTagGroup;
import com.p2082ss.android.ugc.aweme.commercialize.p2534ad.C37591b;
import com.p2082ss.android.ugc.aweme.commercialize.p2534ad.DescTextView;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.p2571j.AbstractC38029b;
import com.p2082ss.android.ugc.aweme.commercialize.p2604n.AbstractC38263a;
import com.p2082ss.android.ugc.aweme.commercialize.p2604n.C38264b;
import com.p2082ss.android.ugc.aweme.commercialize.p2605o.AbstractC38265a;
import com.p2082ss.android.ugc.aweme.commercialize.p2605o.C38266b;
import com.p2082ss.android.ugc.aweme.commercialize.playfun.AbsAdPlayFunWidget;
import com.p2082ss.android.ugc.aweme.commercialize.playfun.C38302h;
import com.p2082ss.android.ugc.aweme.commercialize.profile.AdProfilePopUpWebPageWidget;
import com.p2082ss.android.ugc.aweme.commercialize.service.C38488a;
import com.p2082ss.android.ugc.aweme.commercialize.splash.C38493d;
import com.p2082ss.android.ugc.aweme.commercialize.util.C38587g;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38620ad;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38634al;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38681bh;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38701br;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38703bs;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38748i;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38767w;
import com.p2082ss.android.ugc.aweme.commercialize.utils.p2625c.C38735a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.p2625c.C38736b;
import com.p2082ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer;
import com.p2082ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer;
import com.p2082ss.android.ugc.aweme.commercialize.views.ButtonAdBottomLabelView;
import com.p2082ss.android.ugc.aweme.commercialize.views.CircleWaveLayout;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38880af;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.C38888e;
import com.p2082ss.android.ugc.aweme.commercialize.views.form.AbstractC38940b;
import com.p2082ss.android.ugc.aweme.commercialize.widget.AdLightWebPageWidget;
import com.p2082ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget;
import com.p2082ss.android.ugc.aweme.commercialize.widget.C39039a;
import com.p2082ss.android.ugc.aweme.commercialize.widget.CommonWebPageWidget;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2627b.AbstractC39046a;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.service.ICommercializeAdService;
import com.p2082ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.p2082ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.p2082ss.android.ugc.aweme.detail.p2751ui.C41426z;
import com.p2082ss.android.ugc.aweme.experiment.C46798co;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48144ad;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48152al;
import com.p2082ss.android.ugc.aweme.feed.helper.C49617c;
import com.p2082ss.android.ugc.aweme.feed.helper.C49625h;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.p2082ss.android.ugc.aweme.feed.model.CardStruct;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUITasks;
import com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49677e;
import com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50041af;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50536e;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50539g;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.main.C59063c;
import com.p2082ss.android.ugc.aweme.main.MainActivity;
import com.p2082ss.android.ugc.aweme.miniapp.card.C59271a;
import com.p2082ss.android.ugc.aweme.miniapp.card.MicroAppVideoCardView;
import com.p2082ss.android.ugc.aweme.miniapp_api.services.C59320c;
import com.p2082ss.android.ugc.aweme.p2282ad.FeedAdServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33202b;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33252e;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.C33265g;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.IFeedAdService;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.card.C33229a;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.interactive.C33297b;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.AbstractC33320g;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.AbstractC33321h;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.C33313c;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.p2301a.AbstractC33305a;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.p2301a.AbstractC33306b;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2292a.AbstractC33200b;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33208e;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.C33205b;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2294c.C33217c;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2296e.AbstractC33260b;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2296e.C33262d;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2299g.AbstractC33277b;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.sticker.C33340b;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.survey.AbstractC33355c;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.survey.C33354b;
import com.p2082ss.android.ugc.aweme.p2282ad.p2285c.C33133p;
import com.p2082ss.android.ugc.aweme.report.C67104a;
import com.p2082ss.android.ugc.aweme.report.C67110f;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C74003br;
import com.p2082ss.android.ugc.aweme.sticker.p3963k.AbstractC75401d;
import com.p2082ss.android.ugc.aweme.tcm.api.service.AbstractC77735b;
import com.p2082ss.android.ugc.aweme.tcm.api.service.ITcmService;
import com.p2082ss.android.ugc.aweme.tcm.impl.service.TcmServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80309co;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80595j;
import com.p2082ss.android.ugc.aweme.utils.C80631v;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.aweme.web.jsbridge.C81570a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84292h;
import com.p2082ss.android.ugc.trill.R;
import com.ttnet.org.chromium.base.C87445c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4621l.C89309k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.g */
public class C37899g extends AbstractC37585a implements AbstractC1214u<C33942b>, AbstractC37879bc {

    /* renamed from: aM */
    private static final int f89409aM = R.id.e6;

    /* renamed from: c */
    public static final String f89410c = C37899g.class.getSimpleName();

    /* renamed from: A */
    View f89411A;

    /* renamed from: B */
    TextView f89412B;

    /* renamed from: C */
    LinearLayout f89413C;

    /* renamed from: D */
    AdTagGroup f89414D;

    /* renamed from: E */
    DescTextView f89415E;

    /* renamed from: F */
    RemoteImageView f89416F;

    /* renamed from: G */
    RemoteImageView f89417G;

    /* renamed from: H */
    RemoteImageView f89418H;

    /* renamed from: I */
    TextView f89419I;

    /* renamed from: J */
    TextView f89420J;

    /* renamed from: K */
    LinearLayout f89421K;

    /* renamed from: L */
    TextView f89422L;

    /* renamed from: M */
    TextView f89423M;

    /* renamed from: N */
    CommerceTagLayout f89424N;

    /* renamed from: O */
    DouPlusTagLayout f89425O;

    /* renamed from: P */
    AnimationImageView f89426P;

    /* renamed from: Q */
    CommerceMicroTagLayout f89427Q;

    /* renamed from: R */
    ViewGroup f89428R;

    /* renamed from: S */
    RemoteImageView f89429S;

    /* renamed from: T */
    TextView f89430T;

    /* renamed from: U */
    LinearLayout f89431U;

    /* renamed from: V */
    TextView f89432V;

    /* renamed from: W */
    public C33229a f89433W;

    /* renamed from: X */
    AbstractC33252e f89434X;

    /* renamed from: Y */
    public RelativeLayout f89435Y;

    /* renamed from: Z */
    AbsAdPlayFunWidget f89436Z;

    /* renamed from: a */
    public AnimatorSet f89437a;

    /* renamed from: aA */
    private AbstractC33321h f89438aA;

    /* renamed from: aB */
    private AbstractC33252e f89439aB;

    /* renamed from: aC */
    private FrameLayout f89440aC;

    /* renamed from: aD */
    private View f89441aD;

    /* renamed from: aE */
    private View f89442aE;

    /* renamed from: aF */
    private FrameLayout f89443aF;

    /* renamed from: aG */
    private TagLayout f89444aG;

    /* renamed from: aH */
    private MicroAppVideoCardView f89445aH;

    /* renamed from: aI */
    private AbstractC33260b f89446aI;

    /* renamed from: aJ */
    private AbstractC37793a f89447aJ;

    /* renamed from: aK */
    private C37876a f89448aK;

    /* renamed from: aL */
    private ICommerceEggService f89449aL;

    /* renamed from: aN */
    private C33947e f89450aN;

    /* renamed from: aO */
    private C38736b f89451aO = new C38736b();

    /* renamed from: aP */
    private C38736b f89452aP;

    /* renamed from: aQ */
    private ITcmService f89453aQ;

    /* renamed from: aR */
    private AbstractC77735b f89454aR;

    /* renamed from: aS */
    private AbstractC49691s<C49672ag> f89455aS;

    /* renamed from: aT */
    private JSONObject f89456aT;

    /* renamed from: aU */
    private final C37914b f89457aU = new C37914b(this, (byte) 0);

    /* renamed from: aV */
    private RunnableC37915c f89458aV = null;

    /* renamed from: aW */
    private AbstractC37844a f89459aW;

    /* renamed from: aX */
    private String f89460aX;

    /* renamed from: aY */
    private String f89461aY;

    /* renamed from: aZ */
    private String f89462aZ;

    /* renamed from: aa */
    boolean f89463aa;

    /* renamed from: ab */
    public final AbstractC48149ai f89464ab;

    /* renamed from: ac */
    public DataCenter f89465ac;

    /* renamed from: ad */
    String f89466ad;

    /* renamed from: ae */
    public Context f89467ae;

    /* renamed from: af */
    public IAdSceneService f89468af;

    /* renamed from: ag */
    public Fragment f89469ag;

    /* renamed from: ah */
    public boolean f89470ah = false;

    /* renamed from: ai */
    public boolean f89471ai = false;

    /* renamed from: aj */
    public boolean f89472aj = false;

    /* renamed from: ak */
    public boolean f89473ak = false;

    /* renamed from: al */
    public boolean f89474al = false;

    /* renamed from: am */
    boolean f89475am = false;

    /* renamed from: an */
    AbstractC33277b f89476an;

    /* renamed from: ao */
    public AbstractC33200b f89477ao;

    /* renamed from: ap */
    public AbstractC38029b f89478ap = new AbstractC38029b() {
        /* class com.p2082ss.android.ugc.aweme.commercialize.feed.C37899g.C3790211 */

        static {
            Covode.recordClassIndex(45354);
        }
    };

    /* renamed from: aq */
    private int f89479aq = 4;

    /* renamed from: ar */
    private RunnableC37913a f89480ar;

    /* renamed from: as */
    private boolean f89481as;

    /* renamed from: at */
    private int f89482at;

    /* renamed from: au */
    private View f89483au;

    /* renamed from: av */
    private LinearLayout f89484av;

    /* renamed from: aw */
    private RichTagView f89485aw;

    /* renamed from: ax */
    private TuxTextView f89486ax;

    /* renamed from: ay */
    private TuxTextView f89487ay;

    /* renamed from: az */
    private AbstractC33355c f89488az;

    /* renamed from: b */
    public boolean f89489b;

    /* renamed from: ba */
    private AbstractC33320g f89490ba;

    /* renamed from: bb */
    private boolean f89491bb = false;

    /* renamed from: bc */
    private boolean f89492bc = true;

    /* renamed from: bd */
    private boolean f89493bd = false;

    /* renamed from: be */
    private IFeedAdService f89494be = FeedAdServiceImpl.m67808c();

    /* renamed from: bf */
    private IAdCardService f89495bf = AdCardServiceImpl.m75807c();

    /* renamed from: bg */
    private ICommercializeAdService f89496bg = CommercializeAdServiceImpl.m79243a();

    /* renamed from: bh */
    private long f89497bh;

    /* renamed from: bi */
    private AbstractC21983b<C38050c> f89498bi;

    /* renamed from: bj */
    private AbstractC33202b f89499bj = new AbstractC33202b() {
        /* class com.p2082ss.android.ugc.aweme.commercialize.feed.C37899g.C379001 */

        static {
            Covode.recordClassIndex(45352);
        }

        @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33202b
        /* renamed from: d */
        public final void mo59133d() {
            C37899g.this.f89433W.mo59188d();
        }

        @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33202b
        /* renamed from: e */
        public final boolean mo59134e() {
            return C37899g.this.f89433W.f78958g;
        }

        @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33202b
        /* renamed from: a */
        public final String mo59130a() {
            return C37899g.this.f89433W.mo59190f();
        }

        @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33202b
        /* renamed from: b */
        public final void mo59131b() {
            C37899g.this.f89433W.mo59183a(0, true);
        }

        @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33202b
        /* renamed from: f */
        public final long mo59135f() {
            return C37899g.this.mo66011L().longValue();
        }

        @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33202b
        /* renamed from: c */
        public final void mo59132c() {
            C33229a aVar = C37899g.this.f89433W;
            if (!aVar.f78958g) {
                aVar.f78959h = true;
                DataCenter dataCenter = aVar.f78955d;
                if (dataCenter != null) {
                    dataCenter.mo60191a("ad_feed_card_show_state", (Object) true);
                }
                DataCenter dataCenter2 = aVar.f78955d;
                if (dataCenter2 != null) {
                    dataCenter2.mo60191a("AD_ACTION_MOVE_OUT_DESC", (Object) true);
                }
                aVar.f78956e.postDelayed(new C33229a.RunnableC33235e(aVar), 200);
            }
        }
    };

    /* renamed from: bk */
    private ArrayList<String> f89500bk = new ArrayList<>();

    /* renamed from: bl */
    private Boolean f89501bl = null;

    /* renamed from: bm */
    private AbstractC38880af f89502bm;

    /* renamed from: d */
    CircleWaveLayout f89503d;

    /* renamed from: e */
    ButtonAdBottomLabelView f89504e;

    /* renamed from: f */
    AdHalfWebPageContainer f89505f;

    /* renamed from: g */
    AdHalfWebPageMaskLayer f89506g;

    /* renamed from: h */
    ViewStub f89507h;

    /* renamed from: i */
    ViewStub f89508i;

    /* renamed from: j */
    ViewStub f89509j;

    /* renamed from: k */
    ViewStub f89510k;

    /* renamed from: l */
    ViewStub f89511l;

    /* renamed from: m */
    ViewStub f89512m;

    /* renamed from: n */
    public int f89513n;

    /* renamed from: o */
    public Aweme f89514o;

    /* renamed from: p */
    public View f89515p;

    /* renamed from: q */
    int f89516q = 4;

    /* renamed from: r */
    RemoteImageView f89517r;

    /* renamed from: s */
    FrameLayout f89518s;

    /* renamed from: t */
    LinearLayout f89519t;

    /* renamed from: u */
    TextView f89520u;

    /* renamed from: v */
    View f89521v;

    /* renamed from: w */
    LinearLayout f89522w;

    /* renamed from: x */
    FrameLayout f89523x;

    /* renamed from: y */
    TextView f89524y;

    /* renamed from: z */
    AdRatingView f89525z;

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: N */
    public final AbstractC33200b mo65937N() {
        return this.f89477ao;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: R */
    public final int mo65941R() {
        return this.f89479aq;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: b */
    public final AbstractC33355c mo65963b() {
        return this.f89488az;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: j */
    public final AbstractC38029b mo65977j() {
        return this.f89478ap;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: o */
    public final AbstractC38880af mo65982o() {
        return this.f89502bm;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: a */
    public final void mo65956a(Aweme aweme) {
        if (aweme != null) {
            aweme.setActivityId(this.f89460aX);
            aweme.setNewSourceType(this.f89461aY);
            aweme.setNewSourceId(this.f89462aZ);
            this.f89514o = aweme;
            String str = this.f89466ad;
            if (aweme.isAd() && aweme.getAwemeRawAd() != null) {
                aweme.getAwemeRawAd().setPageFrom(str);
            }
            m76742am();
            if (mo66015c() != null) {
                C37438a d = C37438a.m75484d();
                Aweme aweme2 = this.f89514o;
                Context context = this.f89467ae;
                String ah = m76737ah();
                if (aweme2 != null) {
                    d.f88364b.put(C37474j.m75563d(aweme2), ah);
                }
                d.mo65126a(aweme2, context);
            }
            C89219l.m154721d(this.f89514o, "");
            this.f89433W.mo59184a(this.f89514o);
            AbstractC33355c cVar = this.f89488az;
            if (cVar != null) {
                cVar.mo59354a(this.f89514o, this.f89482at);
            }
            AbstractC33321h hVar = this.f89438aA;
            if (hVar != null) {
                hVar.mo59316a(this.f89514o);
                if (C37699a.m76237aI(this.f89514o)) {
                    this.f89438aA.mo59314a();
                }
            }
            AbstractC33252e eVar = this.f89434X;
            if (eVar != null) {
                eVar.mo59207a(this.f89514o);
                this.f89434X.mo59204a();
                if (C37699a.m76215R(this.f89514o) == null || C37699a.m76215R(this.f89514o).getShowSeconds() != 0) {
                    this.f89434X.mo59208b();
                } else {
                    C49617c cVar2 = new C49617c();
                    Context context2 = this.f89467ae;
                    Video video = this.f89514o.getVideo();
                    this.f89514o.getOcrLocation();
                    AbstractC75401d.C75402a a = cVar2.mo81410a(context2, video);
                    this.f89465ac.mo60191a("ad_feed_bind_texture_size", new C38229ao(a.f169476a, a.f169477b));
                    this.f89434X.mo59205a((long) C33340b.m68350a());
                }
            }
            AbstractC33277b bVar = this.f89476an;
            if (bVar != null) {
                bVar.mo59223a(aweme);
            }
            AbstractC33252e eVar2 = this.f89439aB;
            if (eVar2 != null) {
                eVar2.mo59207a(this.f89514o);
                this.f89439aB.mo59204a();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: a */
    public final void mo65951a(DataCenter dataCenter) {
        this.f89465ac = dataCenter;
        if (dataCenter != null) {
            dataCenter.mo60189a("on_ad_light_web_page_show", (AbstractC1214u<C33942b>) this);
            this.f89465ac.mo60189a("on_ad_light_web_page_hide", (AbstractC1214u<C33942b>) this);
            this.f89465ac.mo60189a("AD_ACTION_MOVE_IN_DESC", (AbstractC1214u<C33942b>) this);
            this.f89465ac.mo60189a("AD_ACTION_MOVE_OUT_DESC", (AbstractC1214u<C33942b>) this);
            this.f89465ac.mo60189a("AD_ACTION_RESET_INTRO_CONTAINER_LOCATION", (AbstractC1214u<C33942b>) this);
            this.f89465ac.mo60189a("on_ad_pop_up_web_page_show", (AbstractC1214u<C33942b>) this);
            this.f89465ac.mo60189a("on_ad_pop_up_web_page_hide", (AbstractC1214u<C33942b>) this);
            this.f89465ac.mo60189a("action_ad_pop_up_web_pause_video", (AbstractC1214u<C33942b>) this);
            this.f89465ac.mo60189a("action_ad_pop_up_web_resume_video", (AbstractC1214u<C33942b>) this);
            this.f89465ac.mo60189a("new_clean_mode", (AbstractC1214u<C33942b>) this);
            this.f89465ac.mo60189a("AD_ACTION_REPLAY_VIDEO", (AbstractC1214u<C33942b>) this);
            this.f89465ac.mo60189a("action_ad_hide_lynx_mask", (AbstractC1214u<C33942b>) this);
            this.f89465ac.mo60189a("action_ad_swipe_up_video", (AbstractC1214u<C33942b>) this);
            this.f89465ac.mo60189a("ad_feed_pause_video", (AbstractC1214u<C33942b>) this);
            this.f89465ac.mo60189a("ad_feed_resume_video", (AbstractC1214u<C33942b>) this);
        }
        C33229a aVar = this.f89433W;
        aVar.f78955d = dataCenter;
        DataCenter dataCenter2 = aVar.f78955d;
        if (dataCenter2 != null) {
            dataCenter2.mo60189a("ad_feed_on_page_selected", (AbstractC1214u<C33942b>) aVar);
            dataCenter2.mo60189a("ad_feed_on_page_unselected", (AbstractC1214u<C33942b>) aVar);
            dataCenter2.mo60189a("ad_comment_dialog_visible", (AbstractC1214u<C33942b>) aVar);
            dataCenter2.mo60189a("ad_share_dialog_visible", (AbstractC1214u<C33942b>) aVar);
            dataCenter2.mo60189a("ad_video_on_resume_play", (AbstractC1214u<C33942b>) aVar);
        }
        AbstractC33355c cVar = this.f89488az;
        if (cVar != null) {
            cVar.mo59353a(dataCenter);
        }
        AbstractC33321h hVar = this.f89438aA;
        if (hVar != null) {
            hVar.mo59315a(dataCenter);
        }
        AbstractC33252e eVar = this.f89434X;
        if (eVar != null) {
            eVar.mo59206a(dataCenter);
        }
        AbstractC33252e eVar2 = this.f89439aB;
        if (eVar2 != null) {
            eVar2.mo59206a(dataCenter);
        }
        AbstractC33277b bVar = this.f89476an;
        if (bVar != null) {
            bVar.mo59222a(dataCenter);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: a */
    public final void mo65952a(C33947e eVar) {
        this.f89450aN = eVar;
        if (eVar != null) {
            eVar.mo60217a((View) null, new AdLightWebPageWidget());
            this.f89450aN.mo60217a((View) null, new AdPopUpWebPageWidget());
            this.f89450aN.mo60217a((View) null, new CommonWebPageWidget());
            this.f89450aN.mo60217a((View) null, new AdProfilePopUpWebPageWidget());
            Widget b = CommercializeAdServiceImpl.m79243a().mo67723b(this.f89467ae, new C38302h());
            if (b instanceof AbsAdPlayFunWidget) {
                this.f89436Z = (AbsAdPlayFunWidget) b;
            }
            this.f89450aN.mo60221b(R.id.fd, this.f89436Z);
            ICommercializeAdService iCommercializeAdService = this.f89496bg;
            if (iCommercializeAdService != null) {
                this.f89450aN.mo60221b(R.id.em, iCommercializeAdService.mo67723b(this.f89467ae, new C33297b()));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: a */
    public final boolean mo65962a(AbstractC0952i iVar) {
        CardStruct b;
        String cardUrl;
        if (!C37699a.m76314s(this.f89514o) || ((TextUtils.isEmpty(this.f89514o.getAwemeRawAd().getWebUrl()) && !C37699a.m76319x(this.f89514o)) || ((TextUtils.isEmpty(this.f89514o.getAwemeRawAd().getWebUrl()) && !C37699a.m76233aE(this.f89514o)) || !this.f89500bk.isEmpty() || this.f89439aB.mo59209c()))) {
            return false;
        }
        Aweme aweme = this.f89514o;
        if (C38748i.m78598c(aweme) || C38748i.m78599d(aweme)) {
            AdHalfWebPageContainer adHalfWebPageContainer = this.f89505f;
            Aweme aweme2 = this.f89514o;
            if (adHalfWebPageContainer != null && C34729o.m70960b(adHalfWebPageContainer) && ((C38748i.m78598c(aweme2) && C38748i.m78600e(aweme2) == 0) || C38748i.m78599d(aweme2))) {
                return false;
            }
            if (!C37699a.m76237aI(this.f89514o)) {
                Aweme aweme3 = this.f89514o;
                CardStruct b2 = C38748i.m78597b(aweme3);
                if (b2 == null || b2.getCardType() != 1 || (b = C38748i.m78597b(aweme3)) == null || (cardUrl = b.getCardUrl()) == null || cardUrl.length() <= 0) {
                    return mo66016f();
                }
                return m76744c(iVar);
            } else if (m76731ab()) {
                return true;
            } else {
                return mo66016f();
            }
        } else {
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m76730aa();
            }
            if (!C58029j.f132256h) {
                return mo66016f();
            }
            if (C37699a.m76237aI(this.f89514o)) {
                if (m76731ab()) {
                    return true;
                }
                return mo66016f();
            } else if (TextUtils.isEmpty(C37699a.m76224a(this.f89514o))) {
                return mo66016f();
            } else {
                if (!C30128d.m60946a(C37699a.m76224a(this.f89514o))) {
                    return mo66016f();
                }
                if (C38620ad.m78374a(this.f89514o)) {
                    return m76744c(iVar);
                }
                return mo66016f();
            }
        }
    }

    /* renamed from: a */
    public final void mo66013a(boolean z, final boolean z2) {
        AbstractC33320g gVar;
        AbstractC33320g gVar2;
        if (!AbstractC33200b.C33201a.m68064a(this.f89514o) || this.f89470ah || this.f89471ai) {
            if (!m76734ae() || (gVar2 = this.f89490ba) == null) {
                if (this.f89519t.getVisibility() == 8 && !m76733ad()) {
                    return;
                }
            } else if (!gVar2.mo59303b() && !m76733ad()) {
                return;
            }
            m76748i(false);
            this.f89464ab.mo80095b(false);
            this.f89505f.setInCleanMode(false);
            this.f89433W.mo59185a(false);
            C49625h.m93072a().f114192d = false;
            this.f89470ah = false;
            this.f89471ai = false;
            if (m76733ad()) {
                m76749j(z);
                return;
            }
            if (!m76734ae() || (gVar = this.f89490ba) == null) {
                m76743b(z, z2);
            } else {
                gVar.mo59301a(z, new AbstractC33306b() {
                    /* class com.p2082ss.android.ugc.aweme.commercialize.feed.C37899g.C3790110 */

                    static {
                        Covode.recordClassIndex(45353);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.p2301a.AbstractC33306b
                    /* renamed from: b */
                    public final boolean mo59297b() {
                        if (!(C37899g.this.f89467ae instanceof MainActivity) || !C59063c.m108543a().f134455a) {
                            return false;
                        }
                        C37899g.this.f89435Y.setVisibility(4);
                        return true;
                    }

                    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.p2301a.AbstractC33306b
                    /* renamed from: a */
                    public final void mo59296a() {
                        C37899g.this.mo66010I();
                        if (C37899g.this.f89468af != null && z2) {
                            C37899g.this.f89468af.mo28466c().mo28504a(C37899g.this.f89514o, C37899g.this.f89467ae, 2, C37899g.this.f89513n + 1);
                        }
                    }
                });
            }
            this.f89465ac.mo60191a("ON_AD_COMMON_MASK_HIDE", (Object) null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: a */
    public final void mo65961a(boolean z) {
        int i;
        if (!TextUtils.equals(this.f89466ad, "homepage_follow")) {
            FrameLayout frameLayout = this.f89523x;
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            frameLayout.setVisibility(i);
            if (!z) {
                frameLayout.setAlpha(1.0f);
            }
        }
        this.f89505f.setInCleanMode(z);
        this.f89433W.mo59185a(z);
        this.f89445aH.mo96860a(z);
        m76748i(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: a */
    public final void mo65958a(Integer num) {
        int c = C33265g.m68197c();
        if (c >= 0) {
            this.f89433W.mo59182a(num.intValue(), c, 1);
            this.f89465ac.mo60191a("SET_HALF_WEB_PAGE_REAL_SHOW", new C38238g(num.intValue(), c, 1));
        } else if (c != -100) {
            this.f89433W.mo59182a(num.intValue(), num.intValue(), 0);
            this.f89465ac.mo60191a("SET_HALF_WEB_PAGE_REAL_SHOW", new C38238g(num.intValue(), num.intValue(), 0));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: a */
    public final void mo65960a(JSONObject jSONObject) {
        this.f89456aT = jSONObject;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: a */
    public final void mo65957a(C49812b bVar) {
        this.f89460aX = bVar.getActivityId();
        this.f89461aY = bVar.getNewSourceType();
        this.f89462aZ = bVar.getNewSourceId();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: a */
    public final void mo65955a(C37838g gVar) {
        this.f89465ac.mo60191a("ad_on_receive_js_bridge_event", gVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: a */
    public final void mo65959a(String str) {
        this.f89465ac.mo60191a("AD_ON_PROFILE_WEB_PAGE_SHOW", str);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: a */
    public final void mo65954a(C37832b bVar) {
        this.f89465ac.mo60191a("ON_RECEIVE_AD_WEB_PAGE_EVENT", bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: a */
    public final void mo65950a(C33133p pVar) {
        C38736b bVar = this.f89452aP;
        if (bVar != null) {
            bVar.mo67275a();
        } else {
            this.f89452aP = new C38736b();
        }
        this.f89452aP.mo67276a(100);
        JSONArray jSONArray = pVar.f78723a;
        for (int i = 0; i < jSONArray.length(); i++) {
            this.f89452aP.mo67278a(new C38266b.C38267a().mo66847a(this.f89497bh).mo66846a(jSONArray.optInt(i)).mo66848a(new RunnableC37857am(this, pVar)).mo66849a(true).mo66850a());
        }
        m76728a(this.f89452aP);
        this.f89452aP.mo67279b();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: a */
    public final void mo65953a(C35197k kVar) {
        if (kVar.f83111a) {
            this.f89493bd = !this.f89491bb;
            mo66009H();
        } else if (this.f89493bd) {
            mo66010I();
        }
    }

    /* renamed from: U */
    private void m76720U() {
        this.f89439aB.mo59205a(0);
    }

    /* renamed from: ag */
    private void m76736ag() {
        this.f89459aW.mo65850b();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: B */
    public final void mo65930B() {
        this.f89504e.mo67606g();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: F */
    public final void mo65933F() {
        C38264b.m77610a(this.f89457aU);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: P */
    public final void mo65939P() {
        mo66014b(1);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: Q */
    public final void mo65940Q() {
        mo66014b(4);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: S */
    public final void mo65942S() {
        this.f89504e.mo67362b(true);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: g */
    public final void mo65974g() {
        mo66013a(false, true);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: q */
    public final void mo65984q() {
        this.f89433W.mo59186b();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: r */
    public final void mo65985r() {
        AbstractC33355c cVar = this.f89488az;
        if (cVar != null) {
            cVar.mo59352a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.g$b */
    class C37914b implements AbstractC38263a {

        /* renamed from: a */
        boolean f89553a;

        static {
            Covode.recordClassIndex(45366);
        }

        /* renamed from: c */
        private boolean m76853c() {
            return C50536e.m94741a(C37899g.this.f89514o);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.p2604n.AbstractC38263a
        /* renamed from: a */
        public final void mo66030a() {
            if (!this.f89553a) {
                this.f89553a = true;
                if (!C37899g.this.f89470ah && !C37899g.this.f89471ai && !C37899g.this.f89472aj && m76853c() && C37899g.this.mo66015c() != null) {
                    if (C37899g.this.f89477ao.mo59127a(C37899g.this.f89514o)) {
                        C37438a.m75484d().f88370h = C37899g.this.f89477ao.mo59124a();
                        C89219l.m154721d("PlayerLog.toPlay, mPausePosition: " + C37438a.m75484d().f88370h, "");
                    } else {
                        C37438a.m75484d().f88370h = -1;
                    }
                    C37438a.m75484d().mo65145e(C37899g.this.f89514o, C37899g.this.f89467ae, C37899g.this.mo66015c(), C37899g.this.f89513n);
                    C37899g.this.f89514o.getDesc();
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.p2604n.AbstractC38263a
        /* renamed from: b */
        public final void mo66031b() {
            if (this.f89553a) {
                this.f89553a = false;
                if (!C37899g.this.f89470ah && !C37899g.this.f89471ai && ((!C37899g.this.f89472aj) && m76853c()) && C37899g.this.mo66015c() != null) {
                    C37438a d = C37438a.m75484d();
                    Aweme aweme = C37899g.this.f89514o;
                    Context context = C37899g.this.f89467ae;
                    View c = C37899g.this.mo66015c();
                    int i = C37899g.this.f89513n;
                    if (aweme != null) {
                        C51423a.m95784a(3, null, "AdOM onPlayPause ");
                        if (i == 0) {
                            C37466a.m75553a("pause");
                            C23768b a = d.mo65125a(context, aweme, c);
                            if (a != null) {
                                a.mo39230e();
                            }
                            C37447d b = d.mo65135b(context, aweme, c);
                            if (b != null) {
                                C37457a.m75545a(b.f88405a);
                                b.f88405a.mo65161e();
                                C37459b.f88437a.mo65172b();
                            }
                        }
                        C38703bs.m78527a("pause", aweme, "play_pause");
                        C38189j.m77510b(context, "pause", aweme, C38189j.m77468a(context, aweme, false, C38189j.m77463a(d.f88368f + 1)));
                        C18129a.m33746a("draw_ad", "pause", aweme.getAwemeRawAd()).mo28897a("play_order", Integer.valueOf(d.f88368f + 1)).mo28902c();
                    }
                    C37899g.this.f89514o.getDesc();
                }
            }
        }

        private C37914b() {
        }

        /* synthetic */ C37914b(C37899g gVar, byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.g$c */
    static class RunnableC37915c implements Runnable {

        /* renamed from: a */
        final Handler f89555a = new Handler(Looper.getMainLooper());

        /* renamed from: b */
        private final WeakReference<C37899g> f89556b;

        static {
            Covode.recordClassIndex(45367);
        }

        /* renamed from: a */
        public final void mo66032a() {
            this.f89555a.removeCallbacks(this);
            this.f89555a.postDelayed(this, 200);
        }

        public final void run() {
            C37899g gVar = this.f89556b.get();
            if (gVar != null) {
                Aweme aweme = gVar.f89514o;
                long n = C81079v.m140776O().mo123891n();
                if (aweme != null && C38587g.m78302e(aweme) && n >= C38587g.m78303f(aweme) && !C38587g.f91183a.mo67170b(aweme)) {
                    aweme.getDesc();
                    C38587g.m78298a(aweme, "play");
                    C38587g.f91183a.mo67171c(aweme);
                }
                mo66032a();
            }
        }

        RunnableC37915c(C37899g gVar) {
            this.f89556b = new WeakReference<>(gVar);
        }
    }

    /* renamed from: Z */
    private boolean m76725Z() {
        if (!C37699a.m76297g(this.f89514o) || this.f89436Z == null) {
            return false;
        }
        return true;
    }

    /* renamed from: aa */
    private static boolean m76730aa() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: ad */
    private boolean m76733ad() {
        AbstractC33321h hVar = this.f89438aA;
        if (hVar == null) {
            return false;
        }
        return hVar.mo59321d();
    }

    /* renamed from: ah */
    private String m76737ah() {
        AbstractC49815a ai = m76738ai();
        if (ai != null) {
            return ai.mo84775h(this.f89514o);
        }
        return null;
    }

    /* renamed from: ai */
    private AbstractC49815a m76738ai() {
        Fragment fragment = this.f89469ag;
        if (fragment instanceof C50041af) {
            return ((C50041af) fragment).f115519n;
        }
        return null;
    }

    /* renamed from: am */
    private void m76742am() {
        if (this.f89514o != null) {
            m76740ak();
            m76741al();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: E */
    public final void mo65932E() {
        this.f89451aO.mo67280c();
        C38736b bVar = this.f89452aP;
        if (bVar != null) {
            bVar.mo67280c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: J */
    public final void mo65934J() {
        this.f89465ac.mo60191a("video_stop_dou_plus_guide_animation", (Object) null);
    }

    /* renamed from: L */
    public final Long mo66011L() {
        return Long.valueOf(this.f89451aO.mo67281d());
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: T */
    public final void mo65943T() {
        this.f89504e.mo67611h();
        m76726a(m76723X());
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: a */
    public final void mo65944a() {
        this.f89433W.mo59183a(0, true);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: e */
    public final boolean mo65973e() {
        if (this.f89470ah || this.f89472aj || this.f89471ai) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: p */
    public final void mo65983p() {
        AbstractC38880af afVar = this.f89502bm;
        if (afVar != null) {
            afVar.mo67560c();
        }
        this.f89502bm = null;
        this.f89505f.mo67320d();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: s */
    public final void mo65986s() {
        if (!C37699a.m76216S(this.f89514o)) {
            this.f89504e.mo67594a(0);
        }
    }

    static {
        Covode.recordClassIndex(45351);
    }

    /* renamed from: ae */
    private boolean m76734ae() {
        if (this.f89501bl == null) {
            this.f89501bl = Boolean.valueOf(C16048b.m29633a().mo25421a(true, "use_new_mask", false));
        }
        return this.f89501bl.booleanValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: A */
    public final void mo65929A() {
        this.f89465ac.mo60191a("ad_video_on_pause_play", (Object) null);
        this.f89465ac.mo60191a("ad_feed_video_playing_state", (Object) false);
        this.f89491bb = true;
    }

    /* renamed from: C */
    public final boolean mo66007C() {
        Fragment fragment = this.f89469ag;
        if (fragment == null || !(fragment instanceof AbstractC48152al)) {
            return false;
        }
        return ((AbstractC48152al) fragment).mo80291o();
    }

    /* renamed from: G */
    public final boolean mo66008G() {
        Context context = this.f89467ae;
        if (!(context instanceof ActivityC0945e) || !C38620ad.m78373a(((ActivityC0945e) context).getSupportFragmentManager())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final void mo66009H() {
        AbstractC48149ai aiVar = this.f89464ab;
        if (aiVar instanceof AbstractC48144ad) {
            ((AbstractC48144ad) aiVar).mo80068G();
        } else {
            C81079v.m140776O().mo123908B();
        }
    }

    /* renamed from: I */
    public final void mo66010I() {
        AbstractC48149ai aiVar = this.f89464ab;
        if (aiVar instanceof AbstractC48144ad) {
            ((AbstractC48144ad) aiVar).mo80067F();
        } else {
            C81079v.m140776O().mo123950y();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: K */
    public final void mo65935K() {
        ButtonAdBottomLabelView buttonAdBottomLabelView = this.f89504e;
        if (buttonAdBottomLabelView != null) {
            C38000g.m77053d().mo67203a(buttonAdBottomLabelView, buttonAdBottomLabelView.getResources().getDimensionPixelOffset(R.dimen.g3), 300, false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: M */
    public final Long mo65936M() {
        return Long.valueOf((this.f89497bh * ((long) this.f89451aO.f91476b)) + this.f89451aO.mo67281d());
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: i */
    public final void mo65976i() {
        IAdSceneService iAdSceneService = this.f89468af;
        if (iAdSceneService != null) {
            iAdSceneService.mo28466c().mo28512b(this.f89514o, this.f89467ae);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: m */
    public final void mo65980m() {
        if (this.f89435Y != null) {
            C38748i.m78596a(this.f89467ae, this.f89514o, this.f89505f);
            this.f89433W.mo59187c();
            this.f89459aW.mo65849a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: y */
    public final void mo65992y() {
        this.f89465ac.mo60191a("ad_on_fragment_pause", (Object) null);
        this.f89504e.mo67362b(false);
        this.f89504e.mo67360a((Boolean) false);
    }

    /* renamed from: V */
    private void m76721V() {
        MethodCollector.m26663i(5919);
        if (!(this.f89483au == null || m76723X() == null)) {
            View view = this.f89483au;
            if (view instanceof AbstractC18019c) {
                ((AbstractC18019c) view).mo28746a();
            }
            m76723X().removeView(this.f89483au);
            this.f89483au = null;
        }
        MethodCollector.m26664o(5919);
    }

    /* renamed from: W */
    private boolean m76722W() {
        MethodCollector.m26663i(5922);
        if (this.f89515p == null || m76723X() == null) {
            MethodCollector.m26664o(5922);
            return false;
        }
        View view = this.f89515p;
        if (view instanceof AbstractC18019c) {
            ((AbstractC18019c) view).mo28746a();
        }
        m76723X().removeView(this.f89515p);
        this.f89515p = null;
        ALog.m59865d("AwesomeSplash", "onAwesomeSplashEvent AwesomeSplashEvent.GONE && mAwesomeSplashMask != null");
        Aweme aweme = this.f89514o;
        if (aweme != null) {
            C37699a.m76264aj(aweme);
        }
        MethodCollector.m26664o(5922);
        return true;
    }

    /* renamed from: X */
    private ViewGroup m76723X() {
        AbstractC48149ai aiVar = this.f89464ab;
        if (aiVar == null || aiVar.mo80231v() == null || this.f89464ab.mo80231v().mo80119ad() == null) {
            return null;
        }
        return (ViewGroup) this.f89464ab.mo80231v().mo80119ad();
    }

    /* renamed from: af */
    private void m76735af() {
        CircleWaveLayout circleWaveLayout = this.f89503d;
        if (circleWaveLayout.f91597e && circleWaveLayout.f91598f) {
            C38000g.m77050a().mo65897i(circleWaveLayout.getContext(), circleWaveLayout.f91596d);
            C18129a.m33746a("draw_ad", "logo_show", circleWaveLayout.f91596d.getAwemeRawAd()).mo28902c();
        }
    }

    /* renamed from: aj */
    private void m76739aj() {
        FrameLayout frameLayout = this.f89440aC;
        if (frameLayout != null && frameLayout.findViewById(R.id.title) != null) {
            this.f89522w.setTranslationX(0.0f);
            this.f89522w.setTranslationY(0.0f);
            this.f89522w.setAlpha(1.0f);
            this.f89522w.setVisibility(0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: O */
    public final void mo65938O() {
        if (C49625h.m93072a().f114196h == 53) {
            C38767w.m78666a(this.f89467ae, this.f89514o, 53, this.f89478ap);
            C49625h.m93072a().f114196h = -1;
        } else if (C49625h.m93072a().f114196h == 54) {
            C38767w.m78666a(this.f89467ae, this.f89514o, 54, this.f89478ap);
            C49625h.m93072a().f114196h = -1;
        }
    }

    /* renamed from: f */
    public final boolean mo66016f() {
        boolean ac;
        AbstractC33320g gVar;
        if (mo66008G() || mo66007C()) {
            return false;
        }
        this.f89470ah = true;
        m76748i(true);
        this.f89505f.setInCleanMode(true);
        this.f89433W.mo59185a(true);
        if (!m76734ae() || (gVar = this.f89490ba) == null) {
            ac = m76732ac();
        } else {
            ac = gVar.mo59302a(new C37987s(this));
        }
        this.f89465ac.mo60191a("ON_AD_COMMON_MASK_SHOW", (Object) null);
        return ac;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: n */
    public final void mo65981n() {
        Aweme aweme = this.f89514o;
        if (aweme != null && aweme.getUserDigg() != 0 && C31575b.m65865g().isLogin()) {
            AbstractC37793a aVar = this.f89447aJ;
            if (aVar != null) {
                aVar.mo65813a(new C37792d("like", "", "", this.f89514o.getAid(), (byte) 0));
            }
            if (this.f89439aB != null && this.f89514o.isAd()) {
                m76720U();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: v */
    public final void mo65989v() {
        this.f89465ac.mo60191a("ad_on_fragment_pager_pause", (Object) null);
        Aweme aweme = this.f89514o;
        if (aweme != null && aweme.isAd()) {
            this.f89451aO.f91477c.mo67283b();
            C37438a.m75484d().mo65144e();
            C38736b bVar = this.f89452aP;
            if (bVar != null) {
                bVar.f91477c.mo67283b();
            }
        }
        this.f89477ao.mo59125a(this.f89514o, mo65973e());
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: w */
    public final void mo65990w() {
        this.f89465ac.mo60191a("ad_on_holder_pause", (Object) null);
        Aweme aweme = this.f89514o;
        if (aweme != null && aweme.isAd()) {
            this.f89451aO.f91477c.mo67283b();
            C37438a.m75484d().mo65144e();
            C38736b bVar = this.f89452aP;
            if (bVar != null) {
                bVar.f91477c.mo67283b();
            }
        }
        AbstractC38880af afVar = this.f89502bm;
        if (afVar != null) {
            afVar.mo67564g();
        }
        this.f89477ao.mo59125a(this.f89514o, mo65973e());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.g$a */
    public class RunnableC37913a implements Runnable {

        /* renamed from: a */
        public boolean f89550a;

        /* renamed from: c */
        private final Aweme f89552c;

        static {
            Covode.recordClassIndex(45365);
        }

        public final void run() {
            if (!this.f89550a && TextUtils.equals(this.f89552c.getAid(), C37899g.this.f89514o.getAid()) && C37899g.this.f89489b) {
                C37699a.m76264aj(this.f89552c);
                C37899g.this.mo66014b(3);
                C37899g.this.f89504e.mo67362b(true);
                C37899g.this.f89464ab.mo80095b(false);
                C37899g.this.f89435Y.setAlpha(0.0f);
                C37899g.this.f89437a.start();
            }
        }

        RunnableC37913a(Aweme aweme) {
            this.f89552c = aweme;
        }
    }

    /* renamed from: ab */
    private boolean m76731ab() {
        if (mo66008G() || mo66007C() || this.f89438aA == null) {
            return false;
        }
        this.f89464ab.mo80095b(true);
        boolean b = this.f89438aA.mo59319b();
        this.f89471ai = b;
        if (b) {
            mo66009H();
            this.f89435Y.setVisibility(4);
            this.f89465ac.mo60191a("ON_AD_LYNX_MASK_SHOW", (Object) null);
            Aweme aweme = this.f89514o;
            if (!(aweme == null || aweme.getAwemeRawAd() == null)) {
                C18129a.m33746a("background_ad", "othershow", this.f89514o.getAwemeRawAd()).mo28897a("background_type", String.valueOf(this.f89514o.getAwemeRawAd().getNativeCardType())).mo28901b();
            }
        } else {
            C18129a.m33746a("background_ad", "othershow_fail", this.f89514o.getAwemeRawAd()).mo28901b();
        }
        return this.f89471ai;
    }

    /* renamed from: ac */
    private boolean m76732ac() {
        Aweme aweme = this.f89514o;
        if (!(aweme == null || aweme.getAwemeRawAd() == null)) {
            HashMap hashMap = new HashMap();
            hashMap.put("background_type", String.valueOf(this.f89514o.getAwemeRawAd().getNativeCardType()));
            C38189j.m77484a(this.f89467ae, this.f89514o, hashMap);
            C18129a.m33746a("background_ad", "othershow", this.f89514o.getAwemeRawAd()).mo28897a("background_type", String.valueOf(this.f89514o.getAwemeRawAd().getNativeCardType())).mo28902c();
        }
        this.f89519t.setAlpha(0.0f);
        this.f89435Y.setAlpha(1.0f);
        this.f89435Y.animate().alpha(0.0f).setDuration(150).withEndAction(new RunnableC37994u(this)).start();
        return true;
    }

    /* renamed from: ak */
    private void m76740ak() {
        CommerceTagLayout commerceTagLayout;
        Aweme aweme = this.f89514o;
        if (aweme != null && (commerceTagLayout = this.f89424N) != null) {
            if (m76729a(commerceTagLayout, aweme)) {
                final C38214ac a = C38681bh.m78486a(this.f89514o);
                if (a != null) {
                    C59320c.C59324a.f135560a.mo96989a().preloadMiniApp(a.mpUrl);
                }
                CommerceTagLayout commerceTagLayout2 = this.f89424N;
                C379052 r2 = new AbstractC38047g() {
                    /* class com.p2082ss.android.ugc.aweme.commercialize.feed.C37899g.C379052 */

                    /* renamed from: a */
                    long f89535a;

                    /* renamed from: d */
                    private Runnable f89538d = new RunnableC37865au(this);

                    static {
                        Covode.recordClassIndex(45357);
                    }

                    /* access modifiers changed from: package-private */
                    /* renamed from: e */
                    public final C38036a.C38037a mo66021e() {
                        return new C38036a.C38037a().mo66311a(a).mo66312a(C37899g.this.f89514o).mo66314a(false);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.commercialize.link.video.AbstractC38041a
                    /* renamed from: c */
                    public final void mo66019c() {
                        C38189j.m77473a(C37899g.this.f89467ae, mo66021e().mo66313a("close").mo66309a(0).mo66315a());
                        if (C37699a.m76221X(C37899g.this.f89514o)) {
                            C38189j.m77474a(C37899g.this.f89467ae, a, C37899g.this.f89514o, false);
                        }
                        mo66020d();
                    }

                    @Override // com.p2082ss.android.ugc.aweme.commercialize.link.video.AbstractC38047g
                    /* renamed from: d */
                    public final void mo66020d() {
                        if (this.f89535a != 0) {
                            C38189j.m77473a(C37899g.this.f89467ae, mo66021e().mo66313a("show_over").mo66309a(0).mo66310a(System.currentTimeMillis() - this.f89535a).mo66315a());
                            this.f89535a = 0;
                            if (C37899g.this.f89424N != null) {
                                C37899g.this.f89424N.removeCallbacks(this.f89538d);
                            }
                        }
                    }

                    @Override // com.p2082ss.android.ugc.aweme.commercialize.link.video.AbstractC38041a
                    /* renamed from: a */
                    public final void mo66017a() {
                        C38189j.m77473a(C37899g.this.f89467ae, mo66021e().mo66313a("show").mo66309a(100).mo66315a());
                        this.f89535a = System.currentTimeMillis();
                        if (C37899g.this.f89424N != null) {
                            C37899g.this.f89424N.postDelayed(this.f89538d, 1000);
                        }
                        C38488a.f90908a.mo67045a().mo66459a(C37899g.this.f89514o, a);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.commercialize.link.video.AbstractC38041a
                    /* renamed from: b */
                    public final void mo66018b() {
                        C38189j.m77473a(C37899g.this.f89467ae, mo66021e().mo66313a("click").mo66309a(100).mo66315a());
                        C38767w.m78627a(C37899g.this.f89467ae, a, C37899g.this.f89514o, false);
                        if (C37699a.m76221X(C37899g.this.f89514o)) {
                            C38189j.m77474a(C37899g.this.f89467ae, a, C37899g.this.f89514o, false);
                        }
                        if (C37699a.m76223Z(C37899g.this.f89514o)) {
                            C38189j.m77507b(C37899g.this.f89467ae, C37899g.this.f89514o, "common_link");
                            C18129a.m33746a("draw_ad", "otherclick", C37899g.this.f89514o.getAwemeRawAd()).mo28900b("refer", "common_link").mo28902c();
                        }
                    }
                };
                commerceTagLayout2.f89890a = new View$OnClickListenerC38043c(commerceTagLayout2.getContext());
                commerceTagLayout2.f89890a.mo66319a(r2);
                commerceTagLayout2.f89890a.mo66320a(a, r2, commerceTagLayout2);
                commerceTagLayout2.removeAllViews();
                commerceTagLayout2.addView(commerceTagLayout2.f89890a.mo66322c());
                this.f89424N.setVisibility(0);
                return;
            }
            CommerceTagLayout commerceTagLayout3 = this.f89424N;
            commerceTagLayout3.removeAllViews();
            commerceTagLayout3.f89890a = null;
            this.f89424N.setVisibility(8);
        }
    }

    /* renamed from: c */
    public final View mo66015c() {
        AbstractC48149ai aiVar = this.f89464ab;
        if (aiVar == null || aiVar.mo80231v() == null || this.f89464ab.mo80231v().mo80119ad() == null) {
            return null;
        }
        return this.f89464ab.mo80231v().mo80119ad();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: h */
    public final boolean mo65975h() {
        boolean E = C37699a.m76202E(this.f89514o);
        if (C37699a.m76314s(this.f89514o) || !E) {
            return false;
        }
        new C23144b(this.f89435Y).mo37640e(R.string.o6).mo37637b();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r1.mo84926k() != false) goto L_0x0015;
     */
    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo65987t() {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.feed.C37899g.mo65987t():void");
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: u */
    public final void mo65988u() {
        this.f89465ac.mo60191a("ad_on_fragment_pager_resume", (Object) null);
        Aweme aweme = this.f89514o;
        if (aweme != null && aweme.isAd()) {
            this.f89451aO.f91477c.mo67282a();
            C37438a.m75484d().mo65142d(this.f89514o);
            C38736b bVar = this.f89452aP;
            if (bVar != null) {
                bVar.f91477c.mo67282a();
            }
        }
        if (m76725Z()) {
            this.f89436Z.mo66853f();
        }
        Aweme aweme2 = this.f89514o;
        if (aweme2 == null || !C38703bs.m78532c(aweme2)) {
            C37438a.m75484d().mo65129a((View) null, (Aweme) null);
        } else {
            C37438a.m75484d().mo65129a(mo66015c(), this.f89514o);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: x */
    public final void mo65991x() {
        IAdSceneService iAdSceneService;
        this.f89465ac.mo60191a("ad_on_fragment_resume", (Object) null);
        Aweme aweme = this.f89514o;
        if (aweme != null && aweme.isAppAd()) {
            this.f89504e.mo67605f();
        }
        if (m76725Z()) {
            this.f89436Z.mo66853f();
        }
        if (this.f89481as && (iAdSceneService = this.f89468af) != null) {
            iAdSceneService.mo28466c().mo28504a(this.f89514o, this.f89467ae, 2, this.f89513n + 1);
            this.f89481as = false;
        }
        Context context = this.f89467ae;
        FrameLayout frameLayout = this.f89523x;
        C89219l.m154721d(context, "");
        C89219l.m154721d(frameLayout, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: z */
    public final void mo65993z() {
        this.f89465ac.mo60191a("ad_video_on_resume_play", (Object) null);
        this.f89465ac.mo60191a("ad_feed_video_playing_state", (Object) true);
        this.f89491bb = false;
        AbstractC38880af afVar = this.f89502bm;
        if (afVar != null) {
            afVar.mo67562e();
        }
        mo65949a(this.f89469ag.getChildFragmentManager(), false);
        if (!AbstractC33200b.C33201a.m68064a(this.f89514o) || this.f89470ah) {
            this.f89519t.setAlpha(1.0f);
            this.f89519t.animate().alpha(0.0f).setDuration(150).withEndAction(new RunnableC37847ac(this)).start();
        }
        this.f89504e.mo67362b(true ^ C37699a.m76260af(this.f89514o));
        this.f89504e.mo67360a((Boolean) false);
    }

    /* renamed from: al */
    private void m76741al() {
        Aweme aweme = this.f89514o;
        if (aweme != null && this.f89425O != null) {
            if (C38038b.m77116a("dou+", aweme, false)) {
                final C38259w j = C37699a.m76303j(this.f89514o);
                DouPlusTagLayout douPlusTagLayout = this.f89425O;
                C379063 r7 = new AbstractC38041a() {
                    /* class com.p2082ss.android.ugc.aweme.commercialize.feed.C37899g.C379063 */

                    static {
                        Covode.recordClassIndex(45358);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.commercialize.link.video.AbstractC38041a
                    /* renamed from: a */
                    public final void mo66017a() {
                    }

                    @Override // com.p2082ss.android.ugc.aweme.commercialize.link.video.AbstractC38041a
                    /* renamed from: c */
                    public final void mo66019c() {
                    }

                    @Override // com.p2082ss.android.ugc.aweme.commercialize.link.video.AbstractC38041a
                    /* renamed from: b */
                    public final void mo66018b() {
                        C38767w.m78666a(C37899g.this.f89467ae, C37899g.this.f89514o, 18, C37899g.this.f89478ap);
                        Context context = C37899g.this.f89467ae;
                        C38259w wVar = j;
                        Aweme aweme = C37899g.this.f89514o;
                        if (!(context == null || wVar == null || aweme == null || aweme.getAwemeRawAd() == null)) {
                            C38189j.m77494a(context, "draw_ad", "click", C38189j.m77467a(context, aweme, "douplus link", "link"), C38189j.m77502b(aweme.getAwemeRawAd()), C38189j.m77520d(aweme));
                            if (C37699a.m76314s(aweme)) {
                                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                                C38164aj.m77369a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new C38198s(aweme));
                            }
                        }
                        C81570a.f182407g = C37899g.this.f89514o;
                    }
                };
                C89219l.m154721d(j, "");
                C89219l.m154721d(r7, "");
                douPlusTagLayout.f89891a = new View$OnClickListenerC38042b(douPlusTagLayout.getContext(), (byte) 0);
                View$OnClickListenerC38042b bVar = douPlusTagLayout.f89891a;
                if (bVar == null) {
                    C89219l.m154715b();
                }
                C89219l.m154721d(r7, "");
                bVar.f89895d = r7;
                if (j == null) {
                    bVar.f89892a.setImageResource(R.color.c9);
                    bVar.f89893b.setText("");
                } else {
                    ((C24246a) bVar.f89892a.getHierarchy()).mo39970d(R.color.j);
                    UrlModel urlModel = j.avatarIcon;
                    if (urlModel == null || C13603b.m24435a((Collection) urlModel.getUrlList())) {
                        bVar.f89892a.setImageResource(R.color.c9);
                    } else {
                        C34577e.m70592a(bVar.f89892a, j.avatarIcon);
                    }
                    bVar.f89894c.setVisibility(8);
                    bVar.f89893b.setText(j.title);
                }
                douPlusTagLayout.removeAllViews();
                View$OnClickListenerC38042b bVar2 = douPlusTagLayout.f89891a;
                if (bVar2 == null) {
                    C89219l.m154715b();
                }
                douPlusTagLayout.addView(bVar2);
                this.f89425O.setVisibility(0);
                return;
            }
            DouPlusTagLayout douPlusTagLayout2 = this.f89425O;
            douPlusTagLayout2.removeAllViews();
            douPlusTagLayout2.f89891a = null;
            this.f89425O.setVisibility(8);
        }
    }

    /* renamed from: Y */
    private void m76724Y() {
        this.f89417G.setVisibility(8);
        this.f89420J.setVisibility(8);
        this.f89419I.setVisibility(8);
        this.f89421K.setVisibility(8);
        if (!TextUtils.isEmpty(this.f89514o.getDesc())) {
            this.f89415E.setText(this.f89514o.getDesc());
            if (this.f89514o.getAwemeRawAd() != null && !TextUtils.isEmpty(this.f89514o.getAwemeRawAd().getAdMoreTextual())) {
                this.f89415E.setMoreString(this.f89514o.getAwemeRawAd().getAdMoreTextual());
            }
            this.f89415E.setViewLineHeight((int) C13628n.m24520b(this.f89467ae, 20.0f));
            this.f89415E.setImageSpanXAxisAdjust((int) C13628n.m24520b(this.f89467ae, 4.0f));
        } else {
            this.f89415E.setVisibility(8);
        }
        if (this.f89514o.getAuthor() == null || this.f89514o.getAuthor().getAvatarMedium() == null) {
            C34577e.m70598a(this.f89416F, C34606a.m70656a(2131232314));
        } else {
            C34577e.m70592a(this.f89416F, this.f89514o.getAuthor().getAvatarMedium());
        }
        if (this.f89514o.getAwemeRawAd() != null) {
            String str = "";
            if (C38701br.m78512a(this.f89514o, 3)) {
                TextView textView = this.f89524y;
                if (this.f89514o.getAwemeRawAd().getOmVast().vast.adTitle != null) {
                    str = this.f89514o.getAwemeRawAd().getOmVast().vast.adTitle;
                }
                textView.setText(str);
            } else {
                TextView textView2 = this.f89524y;
                if (this.f89514o.getAuthor() != null) {
                    str = this.f89514o.getAuthor().getNickname();
                }
                textView2.setText(str);
            }
            if (TextUtils.isEmpty(this.f89514o.getAwemeRawAd().getAppInstall()) && this.f89514o.getAwemeRawAd().getAppLike() < 4.0f) {
                this.f89413C.setVisibility(8);
            }
            if (TextUtils.isEmpty(this.f89514o.getAwemeRawAd().getAppInstall())) {
                this.f89412B.setVisibility(8);
                this.f89411A.setVisibility(8);
            } else {
                this.f89412B.setText(this.f89514o.getAwemeRawAd().getAppInstall());
            }
            this.f89525z.setRatingProgress(this.f89514o.getAwemeRawAd().getAppLike());
            if (this.f89514o.getAwemeRawAd().getAppLike() < 4.0f) {
                this.f89525z.setVisibility(8);
                this.f89411A.setVisibility(8);
            }
            if (this.f89514o.getAwemeRawAd().getAppCategory() == null || this.f89514o.getAwemeRawAd().getAppCategory().length == 0) {
                this.f89414D.setVisibility(8);
                return;
            }
            ArrayList arrayList = new ArrayList();
            String[] appCategory = this.f89514o.getAwemeRawAd().getAppCategory();
            for (String str2 : appCategory) {
                if (str2.length() <= 6) {
                    arrayList.add(str2);
                }
            }
            this.f89414D.setTagList((String[]) arrayList.toArray(new String[0]));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a.m76210M(r7.f89514o) != false) goto L_0x003f;
     */
    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo65979l() {
        /*
        // Method dump skipped, instructions count: 427
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.feed.C37899g.mo65979l():void");
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: d */
    public final void mo65970d() {
        boolean z;
        AbstractC33320g gVar;
        String a;
        Drawable bVar;
        DataCenter dataCenter;
        if (this.f89514o != null) {
            C80595j.m139739a(this.f89520u);
            C80595j.m139739a(this.f89521v);
            C80595j.m139739a(this.f89523x);
            C80595j.m139739a(this.f89415E);
            C80595j.m139739a(this.f89416F);
            C80595j.m139739a(this.f89413C);
            C80595j.m139739a(this.f89524y);
            C80595j.m139739a(this.f89414D);
            if (C37699a.m76314s(this.f89514o) && (dataCenter = this.f89465ac) != null) {
                dataCenter.mo60191a("update_ad_user_follow_ui", (Object) true);
            }
        }
        if (C37699a.m76314s(this.f89514o)) {
            TextView textView = this.f89520u;
            if (C37699a.m76319x(this.f89514o)) {
                a = C37699a.m76257ac(this.f89514o);
            } else if (C37699a.m76233aE(this.f89514o)) {
                a = C37699a.m76246aR(this.f89514o);
            } else {
                a = C38620ad.m78372a(this.f89467ae, this.f89514o, true);
            }
            textView.setText(a);
            if (C37699a.m76319x(this.f89514o)) {
                bVar = new C37591b((float) C34728n.m70946a(2.0d), C0643b.m2378c(this.f89467ae, R.color.bh));
            } else if (C37699a.m76233aE(this.f89514o)) {
                bVar = new C37591b((float) C34728n.m70946a(2.0d), Color.parseColor(C37699a.m76247aS(this.f89514o)));
            } else {
                bVar = new C37591b((float) C34728n.m70946a(2.0d), C0643b.m2378c(this.f89467ae, R.color.av));
            }
            if (C37699a.m76266al(this.f89514o)) {
                bVar = C80595j.m139738a(bVar.mutate(), C0643b.m2378c(this.f89467ae, R.color.j));
            }
            this.f89520u.setBackground(bVar);
        }
        this.f89504e.mo67596a(this.f89514o, this.f89465ac);
        Aweme aweme = this.f89514o;
        if (!aweme.isAd() || !aweme.getAwemeRawAd().isRightStyle()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f89485aw.mo28933a(C18156a.C18157a.C18158a.m33791a().mo28942a(this.f89514o.getAwemeRawAd().getLabel().getLabelName()).mo28943b(92).mo28941a(this.f89485aw.getResources().getColor(R.color.a9)).f43256a);
            if (!this.f89514o.isAd() || TextUtils.isEmpty(this.f89514o.getAwemeRawAd().getLabel().byText)) {
                this.f89486ax.setVisibility(8);
            } else {
                this.f89486ax.setVisibility(0);
                this.f89486ax.setText(this.f89514o.getAwemeRawAd().getLabel().byText + " ");
            }
            if (!this.f89514o.isAd() || TextUtils.isEmpty(this.f89514o.getAwemeRawAd().getLabel().bySource)) {
                this.f89487ay.setVisibility(8);
            } else {
                this.f89487ay.setVisibility(0);
                this.f89487ay.setText("@" + this.f89514o.getAwemeRawAd().getLabel().bySource);
                this.f89487ay.setOnClickListener(new View$OnClickListenerC37923o(this));
            }
            if (TextUtils.isEmpty(this.f89514o.getDesc())) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f89484av.getLayoutParams();
                marginLayoutParams.topMargin = (int) C13628n.m24520b(this.f89467ae, 4.5f);
                this.f89484av.setLayoutParams(marginLayoutParams);
            }
            this.f89484av.setVisibility(0);
            this.f89485aw.setOnClickListener(new View$OnClickListenerC37924p(this));
        } else {
            this.f89484av.setVisibility(8);
        }
        this.f89505f.mo67320d();
        this.f89506g.setVisibility(8);
        m76745f(false);
        m76746g(false);
        if (C38701br.m78512a(this.f89514o, 3)) {
            C38703bs.m78535d(this.f89514o);
        }
        this.f89445aH.setVisibility(8);
        if (!C46798co.f109025c || C37699a.m76314s(this.f89514o)) {
            this.f89465ac.mo60191a("ad_feed_video_params", (Object) new C39039a.C39040a().mo67169a(new C37985q(this)).f91182a);
        }
        Aweme aweme2 = this.f89514o;
        if (m76734ae() && (gVar = this.f89490ba) != null) {
            C33313c cVar = new C33313c();
            Context context = this.f89467ae;
            RelativeLayout relativeLayout = this.f89435Y;
            String str = this.f89466ad;
            C379118 r1 = new AbstractC33305a() {
                /* class com.p2082ss.android.ugc.aweme.commercialize.feed.C37899g.C379118 */

                static {
                    Covode.recordClassIndex(45363);
                }

                @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.p2301a.AbstractC33305a
                /* renamed from: a */
                public final void mo59293a() {
                    C37438a.m75484d();
                    C37438a.m75483c(C37899g.this.f89514o);
                }

                @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.p2301a.AbstractC33305a
                /* renamed from: a */
                public final void mo59294a(int i) {
                    C38767w.m78666a(C37899g.this.f89467ae, C37899g.this.f89514o, i, C37899g.this.f89478ap);
                }

                @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.p2301a.AbstractC33305a
                /* renamed from: a */
                public final void mo59295a(boolean z, boolean z2) {
                    C37899g.this.mo66013a(z, z2);
                }
            };
            C89219l.m154721d(context, "");
            C89219l.m154721d(aweme2, "");
            C89219l.m154721d(relativeLayout, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(r1, "");
            cVar.f79142a = context;
            cVar.f79143b = aweme2;
            cVar.f79145d = str;
            cVar.f79144c = r1;
            cVar.f79146e = relativeLayout;
            gVar.mo59300a(cVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: D */
    public final void mo65931D() {
        long j;
        Video video;
        int D;
        int colorDelay;
        int buttonShow;
        this.f89465ac.mo60191a("ad_video_on_render_ready", (Object) null);
        this.f89465ac.mo60191a("ad_feed_video_playing_state", (Object) true);
        this.f89491bb = false;
        this.f89451aO.mo67275a();
        Aweme aweme = this.f89514o;
        if (aweme != null && aweme.isAd()) {
            AbstractC33208e a = C33205b.m68071a();
            AbstractC37872ay a2 = C37889c.C37890a.m76706a();
            if (C37699a.m76251aW(this.f89514o) && a != null) {
                j = a.mo59103g();
            } else if (!C37699a.m76277aw(this.f89514o) || a2 == null) {
                Aweme aweme2 = this.f89514o;
                AbstractC80747i O = C81079v.m140776O();
                C89219l.m154716b(O, "");
                j = O.mo123887j();
                if (j <= 0) {
                    if (!(aweme2 == null || (video = aweme2.getVideo()) == null || Integer.valueOf(video.getDuration()) == null)) {
                        Video video2 = aweme2.getVideo();
                        C89219l.m154716b(video2, "");
                        if (video2.getDuration() > 0) {
                            Video video3 = aweme2.getVideo();
                            C89219l.m154716b(video3, "");
                            j = (long) video3.getDuration();
                        }
                    }
                    j = 1;
                }
            } else {
                j = a2.mo65912c();
            }
            this.f89497bh = j;
            m76728a(this.f89451aO);
            long j2 = this.f89497bh;
            if (C37699a.m76216S(this.f89514o)) {
                this.f89451aO.mo67276a(350);
                if (!C37699a.m76266al(this.f89514o)) {
                    int D2 = C37699a.m76201D(this.f89514o);
                    CommerceSmartUITasks b = C33265g.m68196b();
                    if (b == null || (buttonShow = b.getButtonShow()) < 0) {
                        if (!(this.f89476an == null || C33265g.m68195a() == null)) {
                            int i = D2 / 1000;
                            this.f89476an.mo59219a(i, i, 0);
                        }
                        this.f89451aO.mo67278a(new C38266b.C38267a().mo66847a(j2).mo66846a(D2).mo66848a(new RunnableC37999z(this)).mo66849a(false).mo66850a());
                    } else {
                        AbstractC33277b bVar = this.f89476an;
                        if (bVar != null) {
                            bVar.mo59219a(D2 / 1000, buttonShow, 1);
                        }
                        this.f89451aO.mo67278a(new C38266b.C38267a().mo66847a(j2).mo66846a(buttonShow).mo66848a(new RunnableC37998y(this)).mo66849a(false).mo66850a());
                    }
                }
                if (C37699a.m76267am(this.f89514o)) {
                    Aweme aweme3 = this.f89514o;
                    if (aweme3 == null || !aweme3.isAd() || aweme3.getAwemeRawAd().getAnimationType() != 3) {
                        D = C37699a.m76201D(aweme3);
                    } else {
                        D = Math.max(C37699a.m76201D(aweme3), aweme3.getAwemeRawAd().getShowButtonColorSeconds() * 1000);
                    }
                    CommerceSmartUITasks b2 = C33265g.m68196b();
                    if (b2 == null || (colorDelay = b2.getColorDelay()) <= 0 || D == 0) {
                        if (!(this.f89476an == null || C33265g.m68195a() == null)) {
                            int i2 = D / 1000;
                            this.f89476an.mo59226b(i2, i2, 0);
                        }
                        this.f89451aO.mo67278a(new C38266b.C38267a().mo66847a(j2).mo66846a(D).mo66848a(new RunnableC37846ab(this)).mo66849a(false).mo66850a());
                    } else {
                        AbstractC33277b bVar2 = this.f89476an;
                        if (bVar2 != null) {
                            bVar2.mo59226b(D / 1000, colorDelay, 1);
                        }
                        this.f89451aO.mo67278a(new C38266b.C38267a().mo66847a(j2).mo66846a(colorDelay).mo66848a(new RunnableC37845aa(this)).mo66849a(false).mo66850a());
                    }
                }
            }
            long j3 = this.f89497bh;
            boolean a3 = this.f89477ao.mo59127a(this.f89514o);
            if (j3 >= InteractFirstFrameTimeOutDurationSetting.DEFAULT && (!a3 || this.f89451aO.mo67281d() < InteractFirstFrameTimeOutDurationSetting.DEFAULT)) {
                this.f89451aO.mo67278a(new C38266b.C38267a().mo66847a(j3).mo66846a(LiveNetAdaptiveHurryTimeSetting.DEFAULT).mo66848a(new RunnableC37851ag(this)).mo66849a(true).mo66850a());
            }
            if (j3 >= 6000 && (!a3 || this.f89451aO.mo67281d() < 6000)) {
                this.f89451aO.mo67278a(new C38266b.C38267a().mo66847a(j3).mo66846a(6000).mo66848a(new RunnableC37852ah(this)).mo66849a(true).mo66850a());
            }
            if (j3 >= 15000 && (!a3 || this.f89451aO.mo67281d() < 15000)) {
                this.f89451aO.mo67278a(new C38266b.C38267a().mo66847a(j3).mo66846a(15000).mo66848a(new RunnableC37853ai(this)).mo66849a(true).mo66850a());
            }
            Aweme aweme4 = this.f89514o;
            if (aweme4 != null && aweme4.isAd() && !C13603b.m24435a((Collection) aweme4.getAwemeRawAd().getPlaybackSecondsTrackList())) {
                for (C38227am amVar : this.f89514o.getAwemeRawAd().getPlaybackSecondsTrackList()) {
                    this.f89451aO.mo67278a(new C38266b.C38267a().mo66847a(j3).mo66846a((int) Math.min((long) (amVar.f90315a * 1000), j3)).mo66848a(new RunnableC37854aj(this, amVar)).mo66849a(true).mo66850a());
                }
            }
            long j4 = this.f89497bh;
            if (m76725Z() && !this.f89463aa) {
                float showTime = this.f89514o.getAwemeRawAd().getPlayFunModel().getShowTime();
                if (showTime < 0.0f) {
                    showTime = 0.0f;
                }
                this.f89451aO.mo67276a(350);
                this.f89451aO.mo67278a(new C38266b.C38267a().mo66847a(j4).mo66846a((int) (showTime * 1000.0f)).mo66848a(new RunnableC37986r(this)).mo66849a(false).mo66850a());
            }
            long j5 = this.f89497bh;
            if (C37699a.m76200C(this.f89514o)) {
                float showTime2 = this.f89514o.getAwemeRawAd().getAdInteractionData().getGestureGuidance().getShowTime();
                if (showTime2 < 0.0f) {
                    showTime2 = 0.0f;
                }
                this.f89451aO.mo67276a(100);
                this.f89451aO.mo67278a(new C38266b.C38267a().mo66847a(j5).mo66846a(((int) (showTime2 * 1000.0f)) - C33217c.m68113a()).mo66848a(new RunnableC37855ak(this)).mo66849a(true).mo66850a());
            }
            long j6 = this.f89497bh;
            if (C37699a.m76214Q(this.f89514o)) {
                float showSeconds = (float) C37699a.m76215R(this.f89514o).getShowSeconds();
                if (showSeconds > 0.0f) {
                    this.f89451aO.mo67276a(100);
                    this.f89451aO.mo67278a(new C38266b.C38267a().mo66847a(j6).mo66846a((int) (showSeconds * 1000.0f)).mo66848a(new RunnableC37856al(this)).mo66849a(false).mo66850a());
                }
            }
            this.f89451aO.mo67279b();
        }
        this.f89457aU.f89553a = true;
        AbstractC48149ai aiVar = this.f89464ab;
        if (!(aiVar == null || aiVar.mo80225p().mo80234y() == null)) {
            View y = this.f89464ab.mo80225p().mo80234y();
            this.f89465ac.mo60191a("ad_feed_bind_texture_size", new C38229ao(y.getWidth(), y.getHeight()));
        }
        if (!AbstractC33200b.C33201a.m68064a(C37438a.m75484d().f88371i) && !C37699a.m76251aW(C37438a.m75484d().f88371i) && !(this.f89469ag instanceof C50041af) && C37438a.m75484d().f88371i != null && C37438a.m75484d().mo65124a() != null) {
            C37438a.m75484d().f88369g = false;
            C37438a.m75484d().mo65128a(this.f89467ae, C37438a.m75484d().f88371i, C37438a.m75484d().mo65124a(), false);
        }
        Aweme aweme5 = this.f89514o;
        if (aweme5 == null || !C38703bs.m78532c(aweme5) || mo66015c() == null) {
            C37438a.m75484d().mo65129a((View) null, (Aweme) null);
        } else {
            C37438a.m75484d().mo65129a(mo66015c(), this.f89514o);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03c6  */
    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo65978k() {
        /*
        // Method dump skipped, instructions count: 1847
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.feed.C37899g.mo65978k():void");
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: a */
    public final void mo65945a(int i) {
        this.f89513n = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: a */
    public final void mo65947a(long j) {
        this.f89433W.mo59183a(j, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: b */
    public final void mo65966b(String str) {
        this.f89465ac.mo60191a("AD_ON_PROFILE_WEB_PAGE_HIDE", str);
    }

    /* renamed from: i */
    private void m76748i(boolean z) {
        if (m76725Z()) {
            this.f89436Z.mo66851a(z);
        }
    }

    /* renamed from: a */
    private void m76726a(ViewGroup viewGroup) {
        RunnableC37913a aVar = this.f89480ar;
        if (aVar != null) {
            aVar.f89550a = true;
            if (viewGroup != null) {
                viewGroup.removeCallbacks(this.f89480ar);
            }
            this.f89480ar = null;
        }
        AnimatorSet animatorSet = this.f89437a;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f89437a = null;
        }
    }

    /* renamed from: g */
    private void m76746g(boolean z) {
        if (this.f89514o != null) {
            if (m76725Z()) {
                this.f89517r.setVisibility(8);
            } else {
                m76747h(z);
            }
        }
    }

    /* renamed from: j */
    private void m76749j(boolean z) {
        if (this.f89438aA != null) {
            this.f89464ab.mo80095b(false);
            this.f89438aA.mo59317a(z);
            this.f89435Y.setVisibility(0);
        }
        this.f89465ac.mo60191a("ON_AD_LYNX_MASK_HIDE", (Object) null);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: b */
    public final void mo65965b(Aweme aweme) {
        if (!mo65975h() && aweme != null) {
            if (C37699a.m76314s(this.f89514o)) {
                C37438a.m75484d();
                C37438a.m75483c(aweme);
            }
            mo66013a(true, false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: d */
    public final void mo65971d(boolean z) {
        this.f89465ac.mo60191a("ad_comment_dialog_visible", Boolean.valueOf(z));
        this.f89473ak = z;
        if (z) {
            this.f89500bk.add("comment_block");
        } else {
            this.f89500bk.remove("comment_block");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: e */
    public final void mo65972e(boolean z) {
        this.f89465ac.mo60191a("ad_share_dialog_visible", Boolean.valueOf(z));
        this.f89474al = z;
        if (z) {
            this.f89500bk.add("share_block");
        } else {
            this.f89500bk.remove("share_block");
        }
    }

    /* renamed from: a */
    private void m76728a(C38736b bVar) {
        AbstractC33208e a = C33205b.m68071a();
        final AbstractC37872ay a2 = C37889c.C37890a.m76706a();
        if (C37699a.m76251aW(this.f89514o) && a != null) {
            a.getClass();
            bVar.mo67277a(C37850af.m76516a(a));
        } else if (!C37699a.m76277aw(this.f89514o) || a2 == null) {
            bVar.mo67277a(C38735a.f91474a);
        } else {
            bVar.mo67277a(new AbstractC38265a() {
                /* class com.p2082ss.android.ugc.aweme.commercialize.feed.C37899g.C3790413 */

                static {
                    Covode.recordClassIndex(45356);
                }

                @Override // com.p2082ss.android.ugc.aweme.commercialize.p2605o.AbstractC38265a
                /* renamed from: a */
                public final long mo65856a() {
                    return a2.mo65913d();
                }
            });
        }
    }

    /* renamed from: c */
    private boolean m76744c(AbstractC0952i iVar) {
        if (mo66008G() || mo66007C()) {
            return false;
        }
        this.f89472aj = true;
        this.f89518s.setAlpha(0.0f);
        CardStruct h = C37699a.m76299h(this.f89514o);
        if (h != null) {
            C81570a.f182403c = h;
            C81570a.f182407g = this.f89514o;
            C81570a.f182406f = 2;
        }
        C38634al.m78394a(this.f89514o, new AbstractC38940b(iVar, null) {
            /* class com.p2082ss.android.ugc.aweme.commercialize.feed.C37899g.C379129 */

            /* renamed from: a */
            final /* synthetic */ AbstractC0952i f89547a;

            /* renamed from: b */
            final /* synthetic */ AbstractC84292h f89548b = null;

            static {
                Covode.recordClassIndex(45364);
            }

            @Override // com.p2082ss.android.ugc.aweme.commercialize.views.form.AbstractC38940b
            /* renamed from: c */
            public final void mo66028c() {
                C37899g.this.mo65949a(this.f89547a, true);
                C37899g.this.f89464ab.mo80095b(false);
            }

            @Override // com.p2082ss.android.ugc.aweme.commercialize.views.form.AbstractC38940b
            /* renamed from: b */
            public final void mo66027b() {
                AwemeRawAd awemeRawAd;
                C37899g.this.mo65949a(this.f89547a, false);
                C37899g.this.mo66016f();
                C38189j.m77550y(C37899g.this.f89467ae, C37899g.this.f89514o);
                if (C37899g.this.f89514o != null) {
                    awemeRawAd = C37899g.this.f89514o.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                C18129a.m33746a("feed_form", "load_fail", awemeRawAd).mo28902c();
                C37899g.this.f89518s.setAlpha(1.0f);
            }

            @Override // com.p2082ss.android.ugc.aweme.commercialize.views.form.AbstractC38940b
            /* renamed from: a */
            public final void mo66025a() {
                C37899g.this.f89518s.animate().alpha(1.0f).setDuration(200).start();
                C37899g.this.f89464ab.mo80095b(true);
                HashMap hashMap = new HashMap();
                hashMap.put("background_type", "-1");
                if (C37899g.this.f89514o != null) {
                    C38189j.m77484a(C37899g.this.f89467ae, C37899g.this.f89514o, hashMap);
                    C18129a.m33746a("background_ad", "othershow", C37899g.this.f89514o.getAwemeRawAd()).mo28897a("background_type", "-1").mo28902c();
                }
                C37899g.this.f89465ac.mo60191a("ON_AD_FORM_MASK_SHOW", (Object) null);
            }

            @Override // com.p2082ss.android.ugc.aweme.commercialize.views.form.AbstractC38940b
            /* renamed from: a */
            public final void mo66026a(boolean z) {
                AwemeRawAd awemeRawAd;
                if (!z) {
                    C38189j.m77549x(C37899g.this.f89467ae, C37899g.this.f89514o);
                    if (C37899g.this.f89514o != null) {
                        awemeRawAd = C37899g.this.f89514o.getAwemeRawAd();
                    } else {
                        awemeRawAd = null;
                    }
                    C18129a.m33746a("feed_form", "click_cancel", awemeRawAd).mo28902c();
                }
            }

            {
                this.f89547a = r3;
            }
        }, iVar, this.f89518s, f89409aM);
        return true;
    }

    /* renamed from: h */
    private void m76747h(boolean z) {
        ICommercializeAdService iCommercializeAdService;
        if (!(this.f89446aI != null || (iCommercializeAdService = this.f89496bg) == null || this.f89517r == null)) {
            this.f89446aI = (AbstractC33260b) iCommercializeAdService.mo67724c(this.f89467ae, new C33262d(this.f89517r));
        }
        AbstractC33260b bVar = this.f89446aI;
        if (bVar != null) {
            bVar.mo59215a(z, this.f89514o, this.f89466ad);
        }
    }

    /* renamed from: b */
    public final void mo66014b(int i) {
        int i2 = this.f89479aq;
        if (i2 == 4 || i2 < i) {
            this.f89479aq = i;
            if (this.f89514o != null) {
                m76727a(new C18017a(i, this.f89514o));
                C18017a.m33569a(i, this.f89514o);
                C17975i.m33461a(i, this.f89441aD, this.f89443aF, this.f89442aE);
            }
        }
    }

    /* renamed from: a */
    private void m76727a(C18017a aVar) {
        int i;
        AwemeSplashInfo m = C37699a.m76308m(aVar.f42892b);
        if (m != null) {
            i = m.getSwipeUpType();
        } else {
            i = 0;
        }
        if (SplashSettingServiceImpl.m33419g().mo28726d() && (i == 2 || i == 6 || i == 7)) {
            this.f89516q = aVar.f42891a;
            if (aVar.f42891a == 4) {
                ALog.m59865d("AwesomeSplash", "onAwesomeSplashEvent is AwesomeSplashEvent.GONE");
                m76722W();
            } else {
                if (aVar.f42891a == 1) {
                    this.f89475am = false;
                }
                if (this.f89515p == null && m76723X() != null) {
                    ViewGroup X = m76723X();
                    ALog.m59865d("AwesomeSplash", "onAwesomeSplashEvent awesome_splash_mask inflate");
                    View a = SplashAdServiceImpl.m33397i().mo28705a(this.f89469ag, X);
                    this.f89515p = a;
                    if (a != null) {
                        View a2 = SplashAdServiceImpl.m33397i().mo28704a(this.f89515p);
                        if (a2 != null) {
                            a2.setOnTouchListener(new View.OnTouchListener() {
                                /* class com.p2082ss.android.ugc.aweme.commercialize.feed.C37899g.View$OnTouchListenerC379096 */

                                static {
                                    Covode.recordClassIndex(45361);
                                }

                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                    C50041af afVar;
                                    long j;
                                    float rawX;
                                    C50041af afVar2;
                                    if (motionEvent.getAction() == 1) {
                                        AbstractC48149ai aiVar = C37899g.this.f89464ab;
                                        long j2 = 0;
                                        if (C50539g.m94752e(aiVar) && C37699a.m76199B(aiVar.mo80206b())) {
                                            if (!(C37899g.this.f89469ag instanceof C50041af) || (afVar2 = (C50041af) C37899g.this.f89469ag) == null) {
                                                j = 0;
                                            } else {
                                                j = afVar2.f115519n.f114783aK.mo81169H();
                                            }
                                            HashMap hashMap = new HashMap();
                                            hashMap.put("duration", String.valueOf(j));
                                            HashMap hashMap2 = new HashMap();
                                            if (C80471gb.m139483a(C37899g.this.f89467ae)) {
                                                hashMap2.put("click_x", String.valueOf(((float) C34723i.m70928b(C37899g.this.f89467ae)) - motionEvent.getRawX()));
                                            } else {
                                                hashMap2.put("click_x", String.valueOf(motionEvent.getRawX()));
                                            }
                                            hashMap2.put("click_y", String.valueOf(motionEvent.getRawY()));
                                            hashMap.put("ad_extra_data", new C27910f().mo46674b(hashMap2));
                                            Context context = C87445c.f198342a;
                                            Aweme b = aiVar.mo80206b();
                                            C38189j.m77510b(context, "skip", b, C38189j.m77468a(context, b, false, (Map<String, String>) hashMap));
                                            C18129a.C18130a a = C18129a.m33746a("draw_ad", "skip", aiVar.mo80206b().getAwemeRawAd());
                                            if (C80471gb.m139483a(C37899g.this.f89467ae)) {
                                                rawX = ((float) C34723i.m70928b(C37899g.this.f89467ae)) - motionEvent.getRawX();
                                            } else {
                                                rawX = motionEvent.getRawX();
                                            }
                                            a.mo28897a("click_x", Float.valueOf(rawX)).mo28897a("click_y", Float.valueOf(motionEvent.getRawY())).mo28902c();
                                            if (!(aiVar.mo80231v() == null || aiVar.mo80231v().mo80119ad() == null)) {
                                                C37438a.m75484d().mo65131a(aiVar.mo80206b(), C87445c.f198342a, aiVar.mo80231v().mo80119ad());
                                            }
                                        }
                                        C37899g gVar = C37899g.this;
                                        if (gVar.f89516q == 2) {
                                            if (gVar.f89515p instanceof AbstractC18019c) {
                                                ((AbstractC18019c) gVar.f89515p).mo28747b();
                                            }
                                            AbstractC48149ai aiVar2 = gVar.f89464ab;
                                            if (C50539g.m94752e(aiVar2) && C37699a.m76199B(aiVar2.mo80206b())) {
                                                gVar.f89475am = true;
                                                if ((gVar.f89469ag instanceof C50041af) && (afVar = (C50041af) gVar.f89469ag) != null) {
                                                    j2 = afVar.f115519n.f114783aK.mo81169H();
                                                }
                                                new HashMap().put("duration", String.valueOf(j2));
                                                AbstractC81915c.m141874a(new C49677e(aiVar2.mo80206b()));
                                            }
                                        }
                                    }
                                    return false;
                                }
                            });
                        }
                        this.f89515p.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                            /* class com.p2082ss.android.ugc.aweme.commercialize.feed.C37899g.ViewTreeObserver$OnPreDrawListenerC379107 */

                            static {
                                Covode.recordClassIndex(45362);
                            }

                            public final boolean onPreDraw() {
                                C38493d.f90922b = System.currentTimeMillis();
                                if (C37899g.this.f89515p == null || C37899g.this.f89515p.getViewTreeObserver() == null) {
                                    return true;
                                }
                                C37899g.this.f89515p.getViewTreeObserver().removeOnPreDrawListener(this);
                                return true;
                            }
                        });
                    } else {
                        return;
                    }
                }
            }
            View view = this.f89515p;
            if (view instanceof AbstractC18019c) {
                ((AbstractC18019c) view).onEvent(aVar);
            }
        } else if (i != 5) {
        } else {
            if (aVar.f42891a == 4) {
                m76721V();
            } else if (this.f89483au == null && m76723X() != null) {
                View b = SplashAdServiceImpl.m33397i().mo28714b(this.f89469ag, m76723X());
                this.f89483au = b;
                if (b != null) {
                    ((AbstractC18019c) b).onEvent(aVar);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: b */
    public final void mo65964b(AbstractC0952i iVar) {
        if (C80631v.m139799b(this.f89514o) && this.f89502bm == null) {
            if (C16048b.m29633a().mo25421a(true, "use_new_ad_card_version", false)) {
                this.f89502bm = AdCardServiceImpl.m75807c().mo65441a().mo67566a(this.f89467ae).mo67571a(this.f89514o).mo67569a(this.f89505f).mo67570a(this.f89506g).mo67567a(iVar).mo67568a(this.f89465ac).mo67572a(this.f89464ab).mo67565a();
            } else {
                C38888e.C38896a aVar = new C38888e.C38896a();
                aVar.f91871a.f91836a = this.f89467ae;
                aVar.f91871a.f91837b = this.f89514o;
                AdHalfWebPageContainer adHalfWebPageContainer = this.f89505f;
                adHalfWebPageContainer.setUseZOrder(C80309co.m139212a());
                aVar.f91871a.f91838c = adHalfWebPageContainer;
                aVar.f91871a.f91839d = this.f89506g;
                aVar.f91871a.f91840e = iVar;
                aVar.f91871a.f91848m = this.f89465ac;
                aVar.f91871a.f91853r = this.f89464ab;
                this.f89502bm = aVar.f91871a;
            }
            this.f89502bm.mo67555a();
            C38488a.f90908a.mo67045a().mo66457a(this.f89514o);
            IAdCardService iAdCardService = this.f89495bf;
            if (iAdCardService != null) {
                iAdCardService.mo65444b().mo67548c(this.f89514o);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: c */
    public final void mo65969c(boolean z) {
        if (z && this.f89514o != null) {
            AbstractC37793a aVar = this.f89447aJ;
            if (aVar != null) {
                aVar.mo65813a(new C37792d("like", "", "", this.f89514o.getAid(), (byte) 0));
            }
            if (this.f89439aB != null && this.f89514o.isAd()) {
                m76720U();
            }
        }
        IAdSceneService iAdSceneService = this.f89468af;
        if (iAdSceneService != null) {
            iAdSceneService.mo28466c().mo28509a(this.f89514o, this.f89467ae, z);
        }
    }

    /* renamed from: f */
    private void m76745f(boolean z) {
        if (C38701br.m78512a(this.f89514o, 3)) {
            boolean z2 = false;
            C34729o.m70955a(this.f89428R, 0);
            C23684c a = C38701br.m78510a(this.f89514o, "AdChoices");
            if (a != null && !C13603b.m24435a((Collection) a.staticResource)) {
                Iterator<String> it = a.staticResource.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String next = it.next();
                    if (!TextUtils.isEmpty(next)) {
                        C34729o.m70955a(this.f89429S, 0);
                        C34577e.m70608b(this.f89429S, next, -1, -1);
                        ViewGroup viewGroup = this.f89428R;
                        if (viewGroup != null) {
                            viewGroup.setClickable(true);
                        }
                        z2 = true;
                    }
                }
            } else {
                C34729o.m70955a(this.f89429S, 8);
                ViewGroup viewGroup2 = this.f89428R;
                if (viewGroup2 != null) {
                    viewGroup2.setClickable(false);
                }
            }
            if (z && z2 && !C13603b.m24435a((Collection) a.viewTracking) && C38703bs.m78530b(this.f89514o)) {
                Set<String> set = a.viewTracking;
                if (set != null) {
                    C38703bs.m78524a(C89309k.m154804b(C89070n.m154598r(set), C38703bs.C38729w.f91468a), (AbstractC38162ah) null);
                }
                C38182f.C38184b a2 = C38182f.m77418a();
                a2.f90211a = "draw_ad";
                a2.f90212b = "ad_choice_view";
                a2.mo66504c("video").mo66497b(this.f89514o).mo66495a(this.f89467ae);
                Aweme aweme = this.f89514o;
                if (aweme != null) {
                    C18129a.m33746a("draw_ad", "ad_choice_view", aweme.getAwemeRawAd()).mo28900b("refer", "video").mo28902c();
                }
            }
            if (this.f89430T != null) {
                if (this.f89514o.getAwemeRawAd() == null || this.f89514o.getAwemeRawAd().getLabel() == null || TextUtils.isEmpty(this.f89514o.getAwemeRawAd().getLabel().getLabelName())) {
                    this.f89430T.setText(R.string.oj);
                } else {
                    this.f89430T.setText(this.f89514o.getAwemeRawAd().getLabel().getLabelName());
                }
            }
            C34729o.m70955a(this.f89444aG, 8);
            return;
        }
        C34729o.m70955a(this.f89428R, 8);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: b */
    public final void mo65967b(boolean z) {
        if (z) {
            FrameLayout frameLayout = this.f89523x;
            C17238d.m31812a(frameLayout, frameLayout.getAlpha(), 0.0f);
        } else {
            FrameLayout frameLayout2 = this.f89523x;
            C17238d.m31812a(frameLayout2, frameLayout2.getAlpha(), 1.0f);
        }
        this.f89505f.setInCleanMode(z);
        this.f89433W.mo59185a(z);
        this.f89445aH.mo96860a(z);
        m76748i(z);
        this.f89465ac.mo60191a("ON_DISLIKE_MODE_CHANGE", Boolean.valueOf(z));
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: c */
    public final void mo65968c(Aweme aweme) {
        C38211a disclaimer;
        if (!C37699a.m76249aU(aweme)) {
            this.f89431U.setVisibility(8);
            return;
        }
        this.f89431U.setVisibility(0);
        this.f89431U.setOnClickListener(null);
        Fragment fragment = this.f89469ag;
        if (!(fragment == null || fragment.getActivity() == null)) {
            ActivityC0945e activity = this.f89469ag.getActivity();
            LinearLayout linearLayout = this.f89431U;
            C89219l.m154721d(aweme, "");
            C89219l.m154721d(activity, "");
            C89219l.m154721d(linearLayout, "");
            TuxTextView tuxTextView = (TuxTextView) linearLayout.findViewById(R.id.azp);
            TuxIconView tuxIconView = (TuxIconView) linearLayout.findViewById(R.id.azq);
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (!(awemeRawAd == null || (disclaimer = awemeRawAd.getDisclaimer()) == null)) {
                C89219l.m154716b(tuxTextView, "");
                ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                C89219l.m154716b(tuxIconView, "");
                ViewGroup.LayoutParams layoutParams3 = tuxIconView.getLayoutParams();
                Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                int i = 1;
                if (disclaimer.getType() == 1) {
                    tuxTextView.setText(disclaimer.getPureText());
                    linearLayout.setBackgroundColor(0);
                    tuxIconView.setTintColorRes(R.attr.ab);
                    layoutParams2.topMargin = (int) C13628n.m24520b(activity, 0.0f);
                    layoutParams4.topMargin = (int) C13628n.m24520b(activity, 0.0f);
                } else if (disclaimer.getType() == 2) {
                    layoutParams2.topMargin = (int) C13628n.m24520b(activity, 12.0f);
                    layoutParams4.topMargin = (int) C13628n.m24520b(activity, 12.0f);
                    linearLayout.setBackgroundColor(C0643b.m2378c(activity, R.color.a4));
                    tuxTextView.setTuxFont(62);
                    tuxIconView.setTintColorRes(R.attr.m);
                    List<C38258v> textList = disclaimer.getTextList();
                    if (textList != null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (C38258v vVar : textList) {
                            String text = vVar.getText();
                            if (vVar.getType() == 0) {
                                spannableStringBuilder.append((CharSequence) text);
                            } else {
                                if (vVar.getType() == i) {
                                    C67110f.View$OnClickListenerC67111a aVar = new C67110f.View$OnClickListenerC67111a(vVar, aweme, activity, linearLayout, tuxTextView);
                                    Context context = linearLayout.getContext();
                                    C89219l.m154716b(context, "");
                                    C67104a aVar2 = new C67104a(aVar, context);
                                    int length = spannableStringBuilder.length();
                                    spannableStringBuilder.append((CharSequence) text);
                                    spannableStringBuilder.setSpan(aVar2, length, text.length() + length, 17);
                                }
                                i = 1;
                            }
                        }
                        tuxTextView.setText(spannableStringBuilder);
                        tuxTextView.setOnTouchListener(new C67110f.View$OnTouchListenerC67112b(spannableStringBuilder, aweme, activity, linearLayout, tuxTextView));
                    }
                }
                tuxTextView.setLayoutParams(layoutParams2);
                tuxIconView.setLayoutParams(layoutParams4);
            }
        }
    }

    /* renamed from: a */
    public final void mo66012a(View view) {
        int id = view.getId();
        if (id != R.id.cpt) {
            boolean z = false;
            if (id == R.id.azt) {
                if (!mo65975h()) {
                    C38767w.m78666a(this.f89467ae, this.f89514o, 3, this.f89478ap);
                    this.f89481as = true;
                    Aweme aweme = this.f89514o;
                    if (C37699a.m76305k(aweme)) {
                        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                        if (!C29843f.m60133b(C17867d.m33078a(), awemeRawAd.getPackageName()) && TextUtils.isEmpty(awemeRawAd.getQuickAppUrl()) && awemeRawAd.getDownloadMode() == 0 && TextUtils.isEmpty(awemeRawAd.getPackageName())) {
                            z = true;
                        }
                    }
                    mo66013a(z, true);
                }
            } else if (id == R.id.ef) {
                if (!mo65975h()) {
                    C38767w.m78666a(this.f89467ae, this.f89514o, 11, this.f89478ap);
                }
            } else if (id == R.id.eu) {
                if (!mo65975h()) {
                    C38767w.m78666a(this.f89467ae, this.f89514o, 14, this.f89478ap);
                }
            } else if (id == R.id.ds) {
                if (!mo65975h()) {
                    C38767w.m78666a(this.f89467ae, this.f89514o, 12, this.f89478ap);
                }
            } else if (id == R.id.es) {
                if (!mo65975h()) {
                    C38767w.m78666a(this.f89467ae, this.f89514o, 13, this.f89478ap);
                }
            } else if (id == R.id.g4) {
                if (!mo65975h()) {
                    C38767w.m78666a(this.f89467ae, this.f89514o, 15, this.f89478ap);
                }
            } else if (id == R.id.eh || id == R.id.gc) {
                if (!mo65975h()) {
                    C38767w.m78666a(this.f89467ae, this.f89514o, 19, this.f89478ap);
                }
            } else if (id == R.id.g6) {
                if (!mo65975h()) {
                    C38767w.m78666a(this.f89467ae, this.f89514o, 20, this.f89478ap);
                }
            } else if (id == R.id.fi) {
                if (!mo65975h()) {
                    C38767w.m78666a(this.f89467ae, this.f89514o, 21, this.f89478ap);
                }
            } else if ((id == R.id.azv || id == R.id.azy) && !mo65975h()) {
                if (C37699a.m76314s(this.f89514o)) {
                    C38189j.m77537l(this.f89467ae, this.f89514o);
                    C37438a.m75484d();
                    C37438a.m75483c(this.f89514o);
                }
                mo66013a(true, false);
            }
        } else if (!mo65975h()) {
            C38767w.m78666a(this.f89467ae, this.f89514o, 2, this.f89478ap);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public /* synthetic */ void onChanged(C33942b bVar) {
        boolean z;
        int a;
        boolean z2;
        VerticalViewPager verticalViewPager;
        VerticalViewPager verticalViewPager2;
        C33942b bVar2 = bVar;
        if (bVar2 != null) {
            String str = bVar2.f80277a;
            str.hashCode();
            char c = 65535;
            int i = 0;
            switch (str.hashCode()) {
                case -2106631497:
                    if (str.equals("action_ad_pop_up_web_resume_video")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1842619453:
                    if (str.equals("AD_ACTION_RESET_INTRO_CONTAINER_LOCATION")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1023452510:
                    if (str.equals("on_ad_light_web_page_hide")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1023125411:
                    if (str.equals("on_ad_light_web_page_show")) {
                        c = 3;
                        break;
                    }
                    break;
                case -992914323:
                    if (str.equals("ad_feed_pause_video")) {
                        c = 4;
                        break;
                    }
                    break;
                case -924046888:
                    if (str.equals("new_clean_mode")) {
                        c = 5;
                        break;
                    }
                    break;
                case -835841586:
                    if (str.equals("ad_feed_resume_video")) {
                        c = 6;
                        break;
                    }
                    break;
                case -481195123:
                    if (str.equals("on_ad_pop_up_web_page_hide")) {
                        c = 7;
                        break;
                    }
                    break;
                case -480868024:
                    if (str.equals("on_ad_pop_up_web_page_show")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 1044302436:
                    if (str.equals("action_ad_pop_up_web_pause_video")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 1133065514:
                    if (str.equals("action_ad_hide_lynx_mask")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 1481889616:
                    if (str.equals("AD_ACTION_REPLAY_VIDEO")) {
                        c = 11;
                        break;
                    }
                    break;
                case 1655117583:
                    if (str.equals("action_ad_swipe_up_video")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 1676264963:
                    if (str.equals("AD_ACTION_MOVE_OUT_DESC")) {
                        c = '\r';
                        break;
                    }
                    break;
                case 1881011274:
                    if (str.equals("AD_ACTION_MOVE_IN_DESC")) {
                        c = 14;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    if (this.f89492bc) {
                        mo66010I();
                        this.f89492bc = false;
                        return;
                    }
                    return;
                case 1:
                    m76739aj();
                    return;
                case 2:
                    this.f89500bk.remove("lightpage_block");
                    return;
                case 3:
                    mo66013a(true, true);
                    this.f89500bk.add("lightpage_block");
                    return;
                case 4:
                    mo66009H();
                    return;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    this.f89445aH.mo96860a(false);
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    mo66010I();
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    this.f89500bk.remove("popup_page_block");
                    return;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    this.f89500bk.add("popup_page_block");
                    mo66013a(false, true);
                    return;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    if (!this.f89491bb) {
                        this.f89492bc = true;
                    }
                    if (bVar2.mo60212a() != null) {
                        i = ((Integer) bVar2.mo60212a()).intValue();
                    }
                    if (C38767w.m78665a(i) || i == 48 || i == 3) {
                        this.f89492bc = true;
                    }
                    mo66009H();
                    return;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    if (bVar2.mo60212a() instanceof Boolean) {
                        m76749j(((Boolean) bVar2.mo60212a()).booleanValue());
                        return;
                    }
                    return;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    mo66010I();
                    return;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    Object a2 = bVar2.mo60212a();
                    if (a2 == null) {
                        Fragment fragment = this.f89469ag;
                        if (fragment instanceof C50041af) {
                            VerticalViewPager verticalViewPager3 = ((C50041af) fragment).f115519n.f114759N;
                            if (verticalViewPager3 != null) {
                                verticalViewPager3.mo67972a(verticalViewPager3.getCurrentItem() + 1, verticalViewPager3.getCurrentItem(), 8000);
                                return;
                            }
                            return;
                        } else if ((fragment instanceof C41426z) && (verticalViewPager2 = ((C41426z) fragment).f96636k.f114759N) != null) {
                            verticalViewPager2.mo67972a(verticalViewPager2.getCurrentItem() + 1, verticalViewPager2.getCurrentItem(), 8000);
                            return;
                        } else {
                            return;
                        }
                    } else if (a2 instanceof C33354b) {
                        C33354b bVar3 = (C33354b) a2;
                        int i2 = bVar3.f79279a;
                        int i3 = bVar3.f79280b;
                        int i4 = bVar3.f79281c;
                        Fragment fragment2 = this.f89469ag;
                        if ((fragment2 instanceof C50041af) && (verticalViewPager = ((C50041af) fragment2).f115519n.f114759N) != null) {
                            verticalViewPager.mo67972a(i2, i3, i4);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    if (bVar2.mo60212a() != null) {
                        z = ((Boolean) bVar2.mo60212a()).booleanValue();
                    } else {
                        z = false;
                    }
                    LinearLayout linearLayout = this.f89522w;
                    if (linearLayout == null) {
                        return;
                    }
                    if (z) {
                        linearLayout.animate().alpha(0.0f).setInterpolator(new LinearInterpolator()).setDuration(200).withEndAction(new RunnableC37848ad(this)).start();
                        return;
                    }
                    if (C80471gb.m139483a(this.f89467ae)) {
                        a = -C74003br.m130148a(this.f89522w);
                    } else {
                        a = C74003br.m130148a(this.f89522w);
                    }
                    LinearLayout linearLayout2 = this.f89522w;
                    linearLayout2.setAlpha(linearLayout2.getAlpha());
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout2, "alpha", linearLayout2.getAlpha(), 0.0f);
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(new LinearInterpolator());
                    ofFloat.start();
                    LinearLayout linearLayout3 = this.f89522w;
                    C74003br.m130149a(linearLayout3, linearLayout3.getTranslationX(), (float) a);
                    return;
                case ABRConfig.ABR_SELECT_SCENE:
                    if (bVar2.mo60212a() != null) {
                        z2 = ((Boolean) bVar2.mo60212a()).booleanValue();
                    } else {
                        z2 = false;
                    }
                    LinearLayout linearLayout4 = this.f89522w;
                    if (linearLayout4 == null) {
                        return;
                    }
                    if (linearLayout4.getVisibility() != 0 || this.f89522w.getAlpha() != 1.0f) {
                        if (z2) {
                            this.f89522w.setVisibility(0);
                            this.f89522w.setTranslationY((float) C34728n.m70946a(17.0d));
                            this.f89522w.animate().alpha(1.0f).translationY(0.0f).setInterpolator(new LinearInterpolator()).setDuration(200).start();
                            return;
                        }
                        LinearLayout linearLayout5 = this.f89522w;
                        C17238d.m31812a(linearLayout5, linearLayout5.getAlpha(), 1.0f);
                        LinearLayout linearLayout6 = this.f89522w;
                        C74003br.m130149a(linearLayout6, linearLayout6.getTranslationX(), 0.0f);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: a */
    public final void mo65948a(FrameLayout frameLayout) {
        float splashShowTime;
        mo66014b(2);
        AnimatorSet animatorSet = this.f89437a;
        if (animatorSet == null || !animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f89437a = animatorSet2;
            animatorSet2.play(ObjectAnimator.ofFloat(this.f89441aD, "alpha", 0.0f, 1.0f)).with(ObjectAnimator.ofFloat(this.f89442aE, "alpha", 0.0f, 1.0f)).with(ObjectAnimator.ofFloat(this.f89435Y, "alpha", 0.0f, 1.0f));
            this.f89437a.setStartDelay(260);
            this.f89437a.setDuration(430L);
            this.f89437a.addListener(new AnimatorListenerAdapter() {
                /* class com.p2082ss.android.ugc.aweme.commercialize.feed.C37899g.C379085 */

                static {
                    Covode.recordClassIndex(45360);
                }

                public final void onAnimationEnd(Animator animator) {
                    if (C37899g.this.f89489b) {
                        C37899g.this.mo66014b(4);
                    }
                }
            });
        }
        RunnableC37913a aVar = this.f89480ar;
        if (aVar == null || aVar.f89550a) {
            this.f89480ar = new RunnableC37913a(this.f89514o);
            AwemeSplashInfo m = C37699a.m76308m(this.f89514o);
            if (m == null) {
                splashShowTime = 0.0f;
            } else {
                splashShowTime = m.getSplashShowTime();
            }
            frameLayout.postDelayed(this.f89480ar, (long) splashShowTime);
        }
    }

    /* renamed from: a */
    private static boolean m76729a(CommerceTagLayout commerceTagLayout, Aweme aweme) {
        if (commerceTagLayout != null && !C37699a.m76259ae(aweme) && C38038b.m77116a("company_link", aweme, false)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m76743b(boolean z, boolean z2) {
        this.f89519t.setAlpha(1.0f);
        this.f89519t.animate().alpha(0.0f).setDuration(150).withEndAction(new RunnableC37995v(this, z, z2)).start();
        if (!(this.f89467ae instanceof MainActivity) || !C59063c.m108543a().f134455a) {
            this.f89435Y.setAlpha(0.0f);
            this.f89435Y.setVisibility(0);
            this.f89435Y.animate().alpha(1.0f).setDuration(150).start();
            return;
        }
        this.f89435Y.setVisibility(4);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: a */
    public final void mo65946a(int i, String str) {
        this.f89465ac.mo60191a("ACTION_HALF_WEB_PAGE_SHOW", new C38239h(i, str));
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc
    /* renamed from: a */
    public final void mo65949a(AbstractC0952i iVar, boolean z) {
        if (this.f89472aj) {
            this.f89472aj = false;
            C38634al.m78393a(iVar, this.f89518s, f89409aM, z);
            this.f89465ac.mo60191a("ON_AD_FORM_MASK_HIDE", (Object) null);
        }
    }

    public C37899g(AbstractC48149ai aiVar, View view, int i, String str, AbstractC49691s<C49672ag> sVar, Fragment fragment) {
        ViewStub viewStub;
        ViewStub viewStub2;
        ViewStub viewStub3;
        this.f89464ab = aiVar;
        this.f89482at = i;
        this.f89466ad = str;
        this.f89467ae = view.getContext();
        this.f89455aS = sVar;
        this.f89469ag = fragment;
        this.f89459aW = new C59271a(view, str);
        this.f89468af = AdSceneServiceImpl.m33210f();
        this.f89453aQ = TcmServiceImpl.m135859j();
        this.f89477ao = this.f89494be.mo58877a();
        this.f89503d = (CircleWaveLayout) view.findViewById(R.id.f205082do);
        this.f89504e = (ButtonAdBottomLabelView) view.findViewById(R.id.cpt);
        this.f89505f = (AdHalfWebPageContainer) view.findViewById(R.id.eb);
        this.f89506g = (AdHalfWebPageMaskLayer) view.findViewById(R.id.sv);
        this.f89507h = (ViewStub) view.findViewById(R.id.aag);
        this.f89512m = (ViewStub) view.findViewById(R.id.b19);
        this.f89517r = (RemoteImageView) view.findViewById(R.id.fn);
        this.f89518s = (FrameLayout) view.findViewById(R.id.ea);
        this.f89519t = (LinearLayout) view.findViewById(R.id.azv);
        this.f89520u = (TextView) view.findViewById(R.id.azt);
        this.f89521v = view.findViewById(R.id.azy);
        this.f89522w = (LinearLayout) view.findViewById(R.id.p7);
        this.f89523x = (FrameLayout) view.findViewById(R.id.u2);
        this.f89524y = (TextView) view.findViewById(R.id.eu);
        this.f89525z = (AdRatingView) view.findViewById(R.id.fm);
        this.f89411A = view.findViewById(R.id.er);
        this.f89412B = (TextView) view.findViewById(R.id.d5);
        this.f89413C = (LinearLayout) view.findViewById(R.id.es);
        this.f89414D = (AdTagGroup) view.findViewById(R.id.g4);
        this.f89415E = (DescTextView) view.findViewById(R.id.ds);
        this.f89416F = (RemoteImageView) view.findViewById(R.id.ef);
        this.f89417G = (RemoteImageView) view.findViewById(R.id.eh);
        this.f89418H = (RemoteImageView) view.findViewById(R.id.gc);
        this.f89419I = (TextView) view.findViewById(R.id.en);
        this.f89420J = (TextView) view.findViewById(R.id.g5);
        this.f89421K = (LinearLayout) view.findViewById(R.id.fi);
        this.f89422L = (TextView) view.findViewById(R.id.fh);
        this.f89423M = (TextView) view.findViewById(R.id.fp);
        this.f89424N = (CommerceTagLayout) view.findViewById(R.id.c9w);
        this.f89425O = (DouPlusTagLayout) view.findViewById(R.id.anv);
        this.f89426P = (AnimationImageView) view.findViewById(R.id.fdf);
        this.f89427Q = (CommerceMicroTagLayout) view.findViewById(R.id.ck2);
        this.f89428R = (ViewGroup) view.findViewById(R.id.fb9);
        this.f89429S = (RemoteImageView) view.findViewById(R.id.fb_);
        this.f89430T = (TextView) view.findViewById(R.id.fba);
        this.f89431U = (LinearLayout) view.findViewById(R.id.e3);
        this.f89432V = (TextView) view.findViewById(R.id.azp);
        View findViewById = view.findViewById(R.id.u2);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View$OnClickListenerC37916h(this));
        }
        View findViewById2 = view.findViewById(R.id.azt);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new View$OnClickListenerC37917i(this));
        }
        View findViewById3 = view.findViewById(R.id.azv);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new View$OnClickListenerC37988t(this));
        }
        View findViewById4 = view.findViewById(R.id.azy);
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(new View$OnClickListenerC37849ae(this));
        }
        View findViewById5 = view.findViewById(R.id.cpt);
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(new View$OnClickListenerC37859ao(this));
        }
        View findViewById6 = view.findViewById(R.id.ef);
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(new View$OnClickListenerC37860ap(this));
        }
        View findViewById7 = view.findViewById(R.id.ds);
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(new View$OnClickListenerC37861aq(this));
        }
        View findViewById8 = view.findViewById(R.id.eu);
        if (findViewById8 != null) {
            findViewById8.setOnClickListener(new View$OnClickListenerC37862ar(this));
        }
        View findViewById9 = view.findViewById(R.id.es);
        if (findViewById9 != null) {
            findViewById9.setOnClickListener(new View$OnClickListenerC37863as(this));
        }
        View findViewById10 = view.findViewById(R.id.g4);
        if (findViewById10 != null) {
            findViewById10.setOnClickListener(new View$OnClickListenerC37864at(this));
        }
        View findViewById11 = view.findViewById(R.id.eh);
        if (findViewById11 != null) {
            findViewById11.setOnClickListener(new View$OnClickListenerC37918j(this));
        }
        View findViewById12 = view.findViewById(R.id.gc);
        if (findViewById12 != null) {
            findViewById12.setOnClickListener(new View$OnClickListenerC37919k(this));
        }
        View findViewById13 = view.findViewById(R.id.g6);
        if (findViewById13 != null) {
            findViewById13.setOnClickListener(new View$OnClickListenerC37920l(this));
        }
        View findViewById14 = view.findViewById(R.id.fi);
        if (findViewById14 != null) {
            findViewById14.setOnClickListener(new View$OnClickListenerC37921m(this));
        }
        this.f89435Y = (RelativeLayout) view.findViewById(R.id.fir);
        this.f89441aD = view.findViewById(R.id.bbq);
        this.f89442aE = view.findViewById(R.id.bbs);
        this.f89443aF = (FrameLayout) view.findViewById(R.id.bp8);
        this.f89440aC = (FrameLayout) view.findViewById(R.id.c34);
        this.f89426P = (AnimationImageView) view.findViewById(R.id.fdf);
        this.f89444aG = (TagLayout) view.findViewById(R.id.fe0);
        this.f89445aH = (MicroAppVideoCardView) view.findViewById(R.id.ck1);
        if (m76734ae() && (viewStub3 = (ViewStub) view.findViewById(R.id.fg2)) != null) {
            C33313c cVar = new C33313c();
            cVar.f79147f = viewStub3;
            AbstractC39046a c = CommercializeAdServiceImpl.m79243a().mo67724c(this.f89467ae, cVar);
            if (c instanceof AbstractC33320g) {
                this.f89490ba = (AbstractC33320g) c;
            }
        }
        this.f89484av = (LinearLayout) view.findViewById(R.id.du);
        this.f89485aw = (RichTagView) view.findViewById(R.id.dt);
        this.f89486ax = (TuxTextView) view.findViewById(R.id.cki);
        this.f89487ay = (TuxTextView) view.findViewById(R.id.ckh);
        ICommerceEggService c2 = CommerceEggServiceImpl.m76488c();
        this.f89449aL = c2;
        if (!(c2 == null || (viewStub2 = this.f89507h) == null)) {
            this.f89447aJ = c2.mo65833a(viewStub2);
        }
        ITcmService iTcmService = this.f89453aQ;
        if (!(iTcmService == null || (viewStub = this.f89512m) == null)) {
            this.f89454aR = iTcmService.mo121248a(viewStub);
        }
        this.f89448aK = new C37876a(view, this.f89467ae, aiVar);
        this.f89508i = (ViewStub) view.findViewById(R.id.b16);
        this.f89510k = (ViewStub) view.findViewById(R.id.b15);
        this.f89511l = (ViewStub) view.findViewById(R.id.azz);
        this.f89433W = new C33229a(view);
        this.f89509j = (ViewStub) view.findViewById(R.id.fg2);
        IFeedAdService iFeedAdService = this.f89494be;
        if (iFeedAdService != null) {
            this.f89488az = iFeedAdService.mo58880a(this.f89508i);
            this.f89438aA = this.f89494be.mo58884b(this.f89509j);
            this.f89434X = this.f89494be.mo58885c(this.f89510k);
            this.f89439aB = this.f89494be.mo58886d(this.f89511l);
            AbstractC33277b a = this.f89494be.mo58879a(view);
            this.f89476an = a;
            a.mo59221a(this.f89499bj);
        }
        ViewGroup viewGroup = this.f89428R;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new View$OnClickListenerC37922n(this));
        }
    }
}
