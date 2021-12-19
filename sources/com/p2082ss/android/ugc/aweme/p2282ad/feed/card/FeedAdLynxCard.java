package com.p2082ss.android.ugc.aweme.p2282ad.feed.card;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.core.app.ActivityC0580d;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p;
import com.bytedance.ies.bullet.p1184ui.common.BulletContainerView;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.keva.Keva;
import com.google.gson.C27919i;
import com.google.gson.C28022o;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.bullet.AbstractC34952a;
import com.p2082ss.android.ugc.aweme.bullet.AbstractC35142e;
import com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35197k;
import com.p2082ss.android.ugc.aweme.commerce.C37437a;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38220ag;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2626a.AbstractC39043a;
import com.p2082ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.CardStruct;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33214c;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.C33198a;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2300h.AbstractC33279b;
import com.p2082ss.android.ugc.aweme.p2282ad.network.ScoreApi;
import com.p2082ss.android.ugc.aweme.p2282ad.network.VoteApi;
import com.p2082ss.android.ugc.aweme.p2282ad.p2285c.C33121d;
import com.p2082ss.android.ugc.aweme.p2282ad.p2285c.C33122e;
import com.p2082ss.android.ugc.aweme.p2282ad.p2285c.C33123f;
import com.p2082ss.android.ugc.aweme.p2282ad.p2285c.C33124g;
import com.p2082ss.android.ugc.aweme.p2282ad.p2285c.C33127j;
import com.p2082ss.android.ugc.aweme.p2282ad.p2285c.C33128k;
import com.p2082ss.android.ugc.aweme.p2282ad.p2285c.C33134q;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService;
import com.p2082ss.android.ugc.aweme.p2385bd.C34791a;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80534hh;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.card.FeedAdLynxCard */
public final class FeedAdLynxCard implements AbstractC33241d, AbstractC33974au, AbstractC90252i, AbstractC90253j {

    /* renamed from: k */
    public static final C33218a f78911k = new C33218a((byte) 0);

    /* renamed from: z */
    private static Integer f78912z;

    /* renamed from: a */
    public Aweme f78913a;

    /* renamed from: b */
    public AwemeRawAd f78914b;

    /* renamed from: c */
    public final View f78915c;

    /* renamed from: d */
    public View f78916d;

    /* renamed from: e */
    public AbstractC16208i f78917e;

    /* renamed from: f */
    public boolean f78918f;

    /* renamed from: g */
    public int f78919g;

    /* renamed from: h */
    public Keva f78920h;

    /* renamed from: i */
    public final C33229a f78921i;

    /* renamed from: j */
    public final FrameLayout f78922j;

    /* renamed from: l */
    private CardStruct f78923l;

    /* renamed from: m */
    private int f78924m = -100;

    /* renamed from: n */
    private int f78925n = -100;

    /* renamed from: o */
    private int f78926o;

    /* renamed from: p */
    private String f78927p;

    /* renamed from: q */
    private String f78928q;

    /* renamed from: r */
    private final AbstractC89244h f78929r = C89250i.m154773a((AbstractC89171a) C33222d.f78941a);

    /* renamed from: s */
    private AbstractC35142e f78930s;

    /* renamed from: t */
    private BulletContainerView f78931t;

    /* renamed from: u */
    private final AbstractC34952a f78932u;

    /* renamed from: v */
    private boolean f78933v;

    /* renamed from: w */
    private boolean f78934w;

    /* renamed from: x */
    private AbstractC33279b f78935x;

    /* renamed from: y */
    private final C88411a f78936y;

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.card.FeedAdLynxCard$g */
    static final class C33225g<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C33225g f78944a = new C33225g();

        static {
            Covode.recordClassIndex(40050);
        }

        C33225g() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.card.FeedAdLynxCard$i */
    static final class C33227i<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C33227i f78946a = new C33227i();

        static {
            Covode.recordClassIndex(40052);
        }

        C33227i() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(40042);
    }

    /* renamed from: j */
    private final AbstractC33214c m68114j() {
        return (AbstractC33214c) this.f78929r.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(153, new RunnableC90250g(FeedAdLynxCard.class, "onCardCloseEvent", C33121d.class, ThreadMode.MAIN, 0, false));
        hashMap.put(392, new RunnableC90250g(FeedAdLynxCard.class, "onCardExpandEvent", C33123f.class, ThreadMode.MAIN, 0, false));
        hashMap.put(393, new RunnableC90250g(FeedAdLynxCard.class, "onSwipeUpVideoEvent", C33134q.class, ThreadMode.MAIN, 0, false));
        hashMap.put(154, new RunnableC90250g(FeedAdLynxCard.class, "onCardStatusEvent", C33124g.class, ThreadMode.MAIN, 0, false));
        hashMap.put(394, new RunnableC90250g(FeedAdLynxCard.class, "onCardCollapseEvent", C33122e.class, ThreadMode.MAIN, 0, false));
        hashMap.put(395, new RunnableC90250g(FeedAdLynxCard.class, "onGetScoreEvent", C33127j.class, ThreadMode.MAIN, 0, false));
        hashMap.put(396, new RunnableC90250g(FeedAdLynxCard.class, "onGetVoteCardOptionEvent", C33128k.class, ThreadMode.MAIN, 0, false));
        hashMap.put(397, new RunnableC90250g(FeedAdLynxCard.class, "onPopupWebShowEvent", C35197k.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            sendCardShowState();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            sendCardHideState();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onActivityDestroy();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.card.FeedAdLynxCard$a */
    public static final class C33218a {
        static {
            Covode.recordClassIndex(40043);
        }

        private C33218a() {
        }

        public /* synthetic */ C33218a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.card.FeedAdLynxCard$j */
    public static final class C33228j implements AbstractC16191p {

        /* renamed from: a */
        public final JSONObject f78947a;

        /* renamed from: b */
        final /* synthetic */ String f78948b;

        /* renamed from: c */
        final /* synthetic */ JSONObject f78949c;

        /* renamed from: d */
        private final String f78950d;

        static {
            Covode.recordClassIndex(40053);
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: a */
        public final String mo25699a() {
            return this.f78950d;
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Object mo25700b() {
            return this.f78947a;
        }

        C33228j(String str, JSONObject jSONObject) {
            this.f78948b = str;
            this.f78949c = jSONObject;
            this.f78950d = str;
            this.f78947a = jSONObject;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.card.AbstractC33241d
    /* renamed from: e */
    public final boolean mo59162e() {
        return this.f78918f;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.card.AbstractC33241d
    /* renamed from: f */
    public final boolean mo59163f() {
        return this.f78933v;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.card.AbstractC33241d
    /* renamed from: c */
    public final void mo59160c() {
        EventBus.m156966a(EventBus.m156962a(), this);
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.card.FeedAdLynxCard$d */
    static final class C33222d extends AbstractC89220m implements AbstractC89171a<AbstractC33214c> {

        /* renamed from: a */
        public static final C33222d f78941a = new C33222d();

        static {
            Covode.recordClassIndex(40047);
        }

        C33222d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC33214c invoke() {
            AbstractC39043a a = CommercializeAdServiceImpl.m79243a().mo67720a(17);
            if (!(a instanceof AbstractC33214c)) {
                return null;
            }
            return a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.card.AbstractC33241d
    /* renamed from: d */
    public final void mo59161d() {
        EventBus.m156962a().mo145395b(this);
        this.f78927p = null;
        this.f78928q = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.card.AbstractC33241d
    /* renamed from: g */
    public final void mo59164g() {
        if (this.f78919g == 2) {
            this.f78921i.mo59191g();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public final void sendCardHideState() {
        AbstractC16208i iVar;
        if (this.f78934w && (iVar = this.f78917e) != null) {
            iVar.mo25776k();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void sendCardShowState() {
        AbstractC16208i iVar;
        if (this.f78934w && (iVar = this.f78917e) != null) {
            iVar.mo25775j();
        }
    }

    /* renamed from: i */
    public final void mo59166i() {
        if (this.f78919g != 1) {
            this.f78919g = 1;
            AbstractC33279b bVar = this.f78935x;
            if (bVar != null) {
                bVar.mo59237a(false);
            }
            this.f78915c.post(new RunnableC33219b(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ad.feed.card.FeedAdLynxCard$b */
    public static final class RunnableC33219b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FeedAdLynxCard f78937a;

        static {
            Covode.recordClassIndex(40044);
        }

        RunnableC33219b(FeedAdLynxCard feedAdLynxCard) {
            this.f78937a = feedAdLynxCard;
        }

        public final void run() {
            this.f78937a.f78915c.animate().translationYBy((float) this.f78937a.f78915c.getHeight()).setInterpolator(new C34791a()).setDuration(300).withEndAction(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.p2282ad.feed.card.FeedAdLynxCard.RunnableC33219b.RunnableC332201 */

                /* renamed from: a */
                final /* synthetic */ RunnableC33219b f78938a;

                static {
                    Covode.recordClassIndex(40045);
                }

                {
                    this.f78938a = r1;
                }

                public final void run() {
                    DataCenter dataCenter = this.f78938a.f78937a.f78921i.f78955d;
                    if (dataCenter != null) {
                        dataCenter.mo60191a("action_ad_pop_up_web_resume_video", (Object) null);
                    }
                    FrameLayout h = this.f78938a.f78937a.mo59165h();
                    if (h != null) {
                        h.setVisibility(8);
                    }
                    FeedAdLynxCard feedAdLynxCard = this.f78938a.f78937a;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("expand", 0);
                    feedAdLynxCard.mo59158a("event_expand_state", jSONObject);
                }
            }).start();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onActivityDestroy() {
        AbstractC1196i lifecycle;
        Context context = this.f78922j.getContext();
        if (!(context instanceof ActivityC0945e)) {
            context = null;
        }
        ActivityC0580d dVar = (ActivityC0580d) context;
        if (!(dVar == null || (lifecycle = dVar.getLifecycle()) == null)) {
            lifecycle.mo4013b(this);
        }
        AbstractC33279b bVar = this.f78935x;
        if (bVar != null) {
            bVar.mo59237a(false);
        }
        this.f78931t.mo25721a();
        this.f78936y.dispose();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.card.AbstractC33241d
    /* renamed from: a */
    public final void mo59152a() {
        mo59158a("event_card_show", (JSONObject) null);
        C18129a.m33746a("draw_ad", "othershow", this.f78914b).mo28900b("refer", "card").mo28901b();
        if (!(this.f78924m == -100 && this.f78925n == -100)) {
            C39162r.m79460a("ad_ui_adjust", new C33744d().mo59980a("original_time", this.f78924m).mo59980a("real_time", this.f78925n).mo59980a("tag", 3).mo59980a("is_adjusted", this.f78926o).f79943a);
        }
        if (this.f78914b == null) {
            C39162r.onEventV3("card_scoring_show");
        }
    }

    /* renamed from: h */
    public final FrameLayout mo59165h() {
        View inflate;
        MethodCollector.m26663i(7699);
        Context context = this.f78922j.getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity == null) {
            MethodCollector.m26664o(7699);
            return null;
        }
        ViewStub viewStub = (ViewStub) activity.findViewById(R.id.e_);
        if (viewStub == null) {
            inflate = activity.findViewById(R.id.e9);
        } else {
            inflate = viewStub.inflate();
            if (inflate == null) {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                MethodCollector.m26664o(7699);
                throw nullPointerException;
            }
        }
        FrameLayout frameLayout = (FrameLayout) inflate;
        MethodCollector.m26664o(7699);
        return frameLayout;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.card.AbstractC33241d
    /* renamed from: b */
    public final void mo59159b() {
        String cardUrl;
        String str;
        Integer num;
        String str2;
        String str3;
        String str4;
        String str5;
        List<String> urlList;
        int i = 0;
        this.f78918f = false;
        this.f78933v = false;
        CardStruct cardStruct = this.f78923l;
        if (cardStruct != null && (cardUrl = cardStruct.getCardUrl()) != null) {
            Uri.Builder buildUpon = Uri.parse(cardUrl).buildUpon();
            C28022o oVar = new C28022o();
            AwemeRawAd awemeRawAd = this.f78914b;
            String str6 = null;
            if (awemeRawAd != null) {
                Long adId = awemeRawAd.getAdId();
                if (adId != null) {
                    str3 = String.valueOf(adId.longValue());
                } else {
                    str3 = null;
                }
                oVar.mo46801a("adId", str3);
                oVar.mo46801a("creativeId", awemeRawAd.getCreativeIdStr());
                oVar.mo46801a("logExtra", awemeRawAd.getLogExtra());
                Long groupId = awemeRawAd.getGroupId();
                if (groupId != null) {
                    str4 = String.valueOf(groupId.longValue());
                } else {
                    str4 = null;
                }
                oVar.mo46801a("groupId", str4);
                UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
                if (!(clickTrackUrlList == null || (urlList = clickTrackUrlList.getUrlList()) == null || urlList.isEmpty())) {
                    C27919i iVar = new C27919i();
                    Iterator<T> it = urlList.iterator();
                    while (it.hasNext()) {
                        iVar.mo46687a((String) it.next());
                    }
                    oVar.mo46797a("clickTrackUrlList", iVar);
                }
                String nativeSiteAdInfo = awemeRawAd.getNativeSiteAdInfo();
                if (nativeSiteAdInfo == null) {
                    nativeSiteAdInfo = "";
                }
                oVar.mo46801a("pageData", nativeSiteAdInfo);
                oVar.mo46800a("landPageShowType", (Number) 0);
                oVar.mo46800a("isVoted", Integer.valueOf(this.f78920h.getBoolean(String.valueOf(awemeRawAd.getCreativeId().longValue()), false) ? 1 : 0));
                C38220ag nativeSiteConfig = awemeRawAd.getNativeSiteConfig();
                if (nativeSiteConfig != null) {
                    str5 = nativeSiteConfig.getLynxScheme();
                } else {
                    str5 = null;
                }
                oVar.mo46801a("lynxSchema", str5);
            }
            Aweme aweme = this.f78913a;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            oVar.mo46801a("itemId", String.valueOf(str));
            oVar.mo46800a("isRTL", Integer.valueOf(C80471gb.m139483a(this.f78922j.getContext()) ? 1 : 0));
            CardStruct cardStruct2 = this.f78923l;
            if (cardStruct2 != null) {
                JSONObject cardData = cardStruct2.getCardData();
                if (cardData == null || (str2 = cardData.toString()) == null) {
                    str2 = "";
                }
                oVar.mo46801a("cardData", str2);
            }
            oVar.mo46800a("topSafeAreaHeight", Integer.valueOf(C80534hh.m139609b()));
            oVar.mo46800a("isCardState", (Number) 1);
            Context context = this.f78922j.getContext();
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (!(activity == null || (num = f78912z) == null || num.intValue() != activity.hashCode())) {
                i = 1;
            }
            oVar.mo46800a("userHasVoted", Integer.valueOf(i));
            oVar.mo46800a("enableCardCloseButton", (Number) 0);
            String str7 = this.f78927p;
            if (str7 != null) {
                oVar.mo46801a("adLiveJson", str7);
            }
            String str8 = this.f78928q;
            if (str8 != null) {
                oVar.mo46801a("productInfo", str8);
            }
            String oVar2 = oVar.toString();
            C89219l.m154716b(oVar2, "");
            buildUpon.appendQueryParameter("initialData", oVar2);
            AbstractC35142e eVar = this.f78930s;
            if (eVar != null) {
                String builder = buildUpon.toString();
                C89219l.m154716b(builder, "");
                Bundle bundle = new Bundle();
                Context context2 = this.f78922j.getContext();
                AbstractC33214c j = m68114j();
                if (j != null) {
                    Aweme aweme2 = this.f78913a;
                    C89219l.m154716b(context2, "");
                    j.mo59144a(bundle, aweme2, context2);
                }
                AwemeRawAd awemeRawAd2 = this.f78914b;
                if (awemeRawAd2 != null) {
                    str6 = awemeRawAd2.getNativeSiteCustomData();
                }
                bundle.putString("bundle_native_site_custom_data", str6);
                eVar.mo61984a(builder, bundle);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.card.FeedAdLynxCard$e */
    public static final class C33223e extends AbstractC34952a {

        /* renamed from: a */
        final /* synthetic */ FeedAdLynxCard f78942a;

        static {
            Covode.recordClassIndex(40048);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33223e(FeedAdLynxCard feedAdLynxCard) {
            this.f78942a = feedAdLynxCard;
        }

        @Override // com.p2082ss.android.ugc.aweme.bullet.AbstractC34952a, com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
        /* renamed from: a */
        public final void mo25853a(View view, Uri uri, AbstractC16208i iVar) {
            int a;
            C89219l.m154721d(view, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(iVar, "");
            super.mo25853a(view, uri, iVar);
            this.f78942a.f78918f = true;
            this.f78942a.f78916d = view;
            this.f78942a.f78917e = iVar;
            if (C37699a.m76293e(this.f78942a.f78914b)) {
                Context context = this.f78942a.f78922j.getContext();
                C89219l.m154716b(context, "");
                a = C33198a.m68051a(context);
            } else {
                a = C34728n.m70946a(270.0d);
            }
            view.setLayoutParams(new FrameLayout.LayoutParams(a, -2));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.card.FeedAdLynxCard$f */
    static final class C33224f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ FeedAdLynxCard f78943a;

        static {
            Covode.recordClassIndex(40049);
        }

        C33224f(FeedAdLynxCard feedAdLynxCard) {
            this.f78943a = feedAdLynxCard;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Aweme aweme;
            C37437a commerceVideoAuthInfo;
            if (this.f78943a.f78914b == null && (aweme = this.f78943a.f78913a) != null && (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) != null) {
                commerceVideoAuthInfo.setHasUserSubmittedFeedback(true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.card.FeedAdLynxCard$h */
    static final class C33226h<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ FeedAdLynxCard f78945a;

        static {
            Covode.recordClassIndex(40051);
        }

        C33226h(FeedAdLynxCard feedAdLynxCard) {
            this.f78945a = feedAdLynxCard;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Long creativeId;
            AwemeRawAd awemeRawAd = this.f78945a.f78914b;
            if (awemeRawAd != null && (creativeId = awemeRawAd.getCreativeId()) != null) {
                this.f78945a.f78920h.storeBoolean(String.valueOf(creativeId.longValue()), true);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.card.AbstractC33241d
    /* renamed from: a */
    public final void mo59153a(int i) {
        boolean z;
        AbstractC16208i iVar;
        this.f78915c.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f78934w = z;
        if (z && (iVar = this.f78917e) != null) {
            iVar.mo25775j();
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onCardCloseEvent(C33121d dVar) {
        C89219l.m154721d(dVar, "");
        if (dVar.f78708a == this.f78931t.hashCode()) {
            this.f78921i.mo59188d();
            AbstractC16208i iVar = this.f78917e;
            if (iVar != null) {
                iVar.mo25776k();
            }
            this.f78934w = false;
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onCardStatusEvent(C33124g gVar) {
        C89219l.m154721d(gVar, "");
        if (gVar.f78714b == this.f78931t.hashCode() && gVar.f78713a == 1) {
            this.f78933v = true;
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onPopupWebShowEvent(C35197k kVar) {
        C89219l.m154721d(kVar, "");
        AbstractC33279b bVar = this.f78935x;
        if (bVar != null) {
            bVar.mo59237a(!kVar.f83111a);
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onSwipeUpVideoEvent(C33134q qVar) {
        DataCenter dataCenter;
        C89219l.m154721d(qVar, "");
        if (qVar.f78725a == this.f78931t.hashCode() && (dataCenter = this.f78921i.f78955d) != null) {
            dataCenter.mo60191a("action_ad_swipe_up_video", (Object) null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.card.AbstractC33241d
    /* renamed from: a */
    public final void mo59155a(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        CardStruct L;
        this.f78913a = aweme;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        this.f78914b = awemeRawAd;
        if (awemeRawAd == null) {
            L = C37699a.m76211N(aweme);
        } else {
            L = C37699a.m76209L(aweme);
        }
        this.f78923l = L;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.card.AbstractC33241d
    /* renamed from: a */
    public final void mo59156a(String str) {
        C18129a.m33746a("draw_ad", "othershow_fail", this.f78914b).mo28900b("refer", "card").mo28897a("fail_reason", str).mo28901b();
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onCardCollapseEvent(C33122e eVar) {
        MethodCollector.m26663i(7981);
        C89219l.m154721d(eVar, "");
        if (eVar.f78710b != this.f78931t.hashCode()) {
            MethodCollector.m26664o(7981);
        } else if (eVar.f78709a == 1) {
            mo59166i();
            MethodCollector.m26664o(7981);
        } else {
            if (eVar.f78709a == 2 && this.f78919g != 0) {
                this.f78919g = 0;
                ViewParent parent = this.f78915c.getParent();
                if (!(parent instanceof ViewGroup)) {
                    parent = null;
                }
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup != null) {
                    viewGroup.removeView(this.f78915c);
                }
                this.f78915c.setAlpha(0.0f);
                this.f78915c.setTranslationY(0.0f);
                this.f78922j.addView(this.f78915c, new ViewGroup.LayoutParams(C34728n.m70946a(270.0d), -2));
                View view = this.f78916d;
                if (view != null) {
                    view.setLayoutParams(new FrameLayout.LayoutParams(C34728n.m70946a(270.0d), -2));
                }
                this.f78915c.animate().alpha(1.0f).setInterpolator(new C34791a()).setDuration(300).start();
            }
            MethodCollector.m26664o(7981);
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onCardExpandEvent(C33123f fVar) {
        MethodCollector.m26663i(7840);
        C89219l.m154721d(fVar, "");
        if (fVar.f78712b != this.f78931t.hashCode()) {
            MethodCollector.m26664o(7840);
            return;
        }
        if (fVar.f78711a == 1 && this.f78919g != 2) {
            this.f78919g = 2;
            FrameLayout h = mo59165h();
            if (h == null) {
                MethodCollector.m26664o(7840);
                return;
            }
            ViewParent parent = this.f78915c.getParent();
            Activity activity = null;
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                viewGroup.removeView(this.f78915c);
            }
            h.addView(this.f78915c, new FrameLayout.LayoutParams(-1, -1));
            View view = this.f78916d;
            if (view != null) {
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            }
            h.setVisibility(0);
            this.f78921i.mo59191g();
            if (this.f78935x == null) {
                Context context = this.f78922j.getContext();
                if (context instanceof Activity) {
                    activity = context;
                }
                Activity activity2 = activity;
                if (activity2 == null) {
                    MethodCollector.m26664o(7840);
                    return;
                }
                this.f78935x = new C33221c(this, activity2, activity2);
            }
            AbstractC33279b bVar = this.f78935x;
            if (bVar != null) {
                bVar.mo59237a(true);
                MethodCollector.m26664o(7840);
                return;
            }
        }
        MethodCollector.m26664o(7840);
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onGetScoreEvent(C33127j jVar) {
        C89219l.m154721d(jVar, "");
        if (jVar.f78717a == this.f78931t.hashCode()) {
            Object a = RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(ScoreApi.class);
            C89219l.m154716b(a, "");
            ScoreApi scoreApi = (ScoreApi) a;
            Aweme aweme = this.f78913a;
            if (aweme != null && C37699a.m76213P(aweme)) {
                C37437a commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
                C89219l.m154716b(commerceVideoAuthInfo, "");
                String itemId = commerceVideoAuthInfo.getItemId();
                C89219l.m154716b(itemId, "");
                C37437a commerceVideoAuthInfo2 = aweme.getCommerceVideoAuthInfo();
                C89219l.m154716b(commerceVideoAuthInfo2, "");
                String advId = commerceVideoAuthInfo2.getAdvId();
                C89219l.m154716b(advId, "");
                C37437a commerceVideoAuthInfo3 = aweme.getCommerceVideoAuthInfo();
                C89219l.m154716b(commerceVideoAuthInfo3, "");
                String adId = commerceVideoAuthInfo3.getAdId();
                C89219l.m154716b(adId, "");
                C37437a commerceVideoAuthInfo4 = aweme.getCommerceVideoAuthInfo();
                C89219l.m154716b(commerceVideoAuthInfo4, "");
                String creativeId = commerceVideoAuthInfo4.getCreativeId();
                C89219l.m154716b(creativeId, "");
                this.f78936y.mo142945a(scoreApi.sendScoreOption(itemId, advId, adId, creativeId, jVar.f78718b).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C33224f(this), C33225g.f78944a));
            }
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onGetVoteCardOptionEvent(C33128k kVar) {
        int i;
        Long l;
        C89219l.m154721d(kVar, "");
        if (kVar.f78719a == this.f78931t.hashCode()) {
            Context context = this.f78922j.getContext();
            Long l2 = null;
            if (!(context instanceof Activity)) {
                context = null;
            }
            int i2 = 0;
            if (context != null) {
                i = context.hashCode();
            } else {
                i = 0;
            }
            Integer num = f78912z;
            if (num == null || i != num.intValue()) {
                if (context != null) {
                    i2 = context.hashCode();
                }
                f78912z = Integer.valueOf(i2);
            }
            Object a = RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(VoteApi.class);
            C89219l.m154716b(a, "");
            VoteApi voteApi = (VoteApi) a;
            Aweme aweme = this.f78913a;
            if (aweme != null) {
                String aid = aweme.getAid();
                C89219l.m154716b(aid, "");
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd != null) {
                    l = awemeRawAd.getCreativeId();
                } else {
                    l = null;
                }
                String valueOf = String.valueOf(l);
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                if (awemeRawAd2 != null) {
                    l2 = awemeRawAd2.getAdId();
                }
                this.f78936y.mo142945a(voteApi.sendVoteOption(aid, valueOf, String.valueOf(l2), kVar.f78720b).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C33226h(this), C33227i.f78946a));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.card.AbstractC33241d
    /* renamed from: a */
    public final void mo59157a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f78927p = str;
        this.f78928q = str2;
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.card.FeedAdLynxCard$c */
    public static final class C33221c extends AbstractC33279b {

        /* renamed from: a */
        final /* synthetic */ FeedAdLynxCard f78939a;

        /* renamed from: b */
        final /* synthetic */ Activity f78940b;

        static {
            Covode.recordClassIndex(40046);
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34466a
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (i != 4 || this.f78939a.f78919g != 2) {
                return false;
            }
            this.f78939a.mo59166i();
            return true;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33221c(FeedAdLynxCard feedAdLynxCard, Activity activity, Activity activity2) {
            super(activity2);
            this.f78939a = feedAdLynxCard;
            this.f78940b = activity;
        }
    }

    public FeedAdLynxCard(C33229a aVar, FrameLayout frameLayout) {
        AbstractC35142e eVar;
        AbstractC1196i lifecycle;
        String str;
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(frameLayout, "");
        MethodCollector.m26663i(7987);
        this.f78921i = aVar;
        this.f78922j = frameLayout;
        ActivityC0580d dVar = null;
        View inflate = View.inflate(frameLayout.getContext(), R.layout.af1, null);
        C89219l.m154716b(inflate, "");
        this.f78915c = inflate;
        C33223e eVar2 = new C33223e(this);
        this.f78932u = eVar2;
        this.f78920h = Keva.getRepo("feed_ad_lynx_vote_card_repo");
        this.f78936y = new C88411a();
        frameLayout.addView(inflate);
        View findViewById = inflate.findViewById(R.id.zn);
        C89219l.m154716b(findViewById, "");
        this.f78931t = (BulletContainerView) findViewById;
        AbstractC33214c j = m68114j();
        if (j != null) {
            BulletContainerView bulletContainerView = this.f78931t;
            IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
            if (f != null) {
                str = f.mo59391g("lynx_feed");
            } else {
                str = null;
            }
            eVar = j.mo59142a(bulletContainerView, str, eVar2);
        } else {
            eVar = null;
        }
        this.f78930s = eVar;
        Context context = frameLayout.getContext();
        ActivityC0580d dVar2 = context instanceof ActivityC0945e ? context : dVar;
        if (dVar2 == null || (lifecycle = dVar2.getLifecycle()) == null) {
            MethodCollector.m26664o(7987);
            return;
        }
        lifecycle.mo4012a(this);
        MethodCollector.m26664o(7987);
    }

    /* renamed from: a */
    public final void mo59158a(String str, JSONObject jSONObject) {
        AbstractC16208i iVar = this.f78917e;
        if (iVar != null) {
            iVar.onEvent(new C33228j(str, jSONObject));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.card.AbstractC33241d
    /* renamed from: a */
    public final void mo59154a(int i, int i2, int i3) {
        this.f78924m = i;
        this.f78925n = i2;
        this.f78926o = i3;
    }
}
