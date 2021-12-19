package com.p2082ss.android.ugc.aweme.commercialize.live.feedLive;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.app.ActivityC0580d;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.C1764a;
import com.bytedance.android.widget.DataCenter;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p;
import com.bytedance.ies.bullet.p1184ui.common.BulletContainerView;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.keva.Keva;
import com.google.gson.C27919i;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.bullet.AbstractC34952a;
import com.p2082ss.android.ugc.aweme.bullet.AbstractC35142e;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38220ag;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2626a.AbstractC39043a;
import com.p2082ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.CardStruct;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33214c;
import com.p2082ss.android.ugc.aweme.p2282ad.p2285c.C33121d;
import com.p2082ss.android.ugc.aweme.p2282ad.p2285c.C33124g;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService;
import com.p2082ss.android.ugc.aweme.utils.C80298cg;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80534hh;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4623i.p4624a.p4625a.p4626a.p4627a.C89393b;

/* renamed from: com.ss.android.ugc.aweme.commercialize.live.feedLive.FeedLiveAdLynxCard */
public final class FeedLiveAdLynxCard implements AbstractC33974au, AbstractC38121a, AbstractC90252i, AbstractC90253j {

    /* renamed from: k */
    public static final C38115a f90053k = new C38115a((byte) 0);

    /* renamed from: w */
    private static Integer f90054w;

    /* renamed from: a */
    AwemeRawAd f90055a;

    /* renamed from: b */
    public boolean f90056b;

    /* renamed from: c */
    public boolean f90057c;

    /* renamed from: d */
    String f90058d;

    /* renamed from: e */
    public boolean f90059e;

    /* renamed from: f */
    boolean f90060f;

    /* renamed from: g */
    public DataCenter f90061g;

    /* renamed from: h */
    public View f90062h;

    /* renamed from: i */
    public AbstractC16208i f90063i;

    /* renamed from: j */
    public final FrameLayout f90064j;

    /* renamed from: l */
    private String f90065l;

    /* renamed from: m */
    private String f90066m;

    /* renamed from: n */
    private Aweme f90067n;

    /* renamed from: o */
    private CardStruct f90068o;

    /* renamed from: p */
    private final Handler f90069p = new Handler(Looper.getMainLooper());

    /* renamed from: q */
    private final AbstractC89244h f90070q = C89250i.m154773a((AbstractC89171a) C38116b.f90076a);

    /* renamed from: r */
    private final View f90071r;

    /* renamed from: s */
    private AbstractC35142e f90072s;

    /* renamed from: t */
    private BulletContainerView f90073t;

    /* renamed from: u */
    private final AbstractC34952a f90074u;

    /* renamed from: v */
    private Keva f90075v;

    static {
        Covode.recordClassIndex(45582);
    }

    /* renamed from: e */
    private final AbstractC33214c m77225e() {
        return (AbstractC33214c) this.f90070q.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(153, new RunnableC90250g(FeedLiveAdLynxCard.class, "onCardCloseEvent", C33121d.class, ThreadMode.MAIN, 0, false));
        hashMap.put(154, new RunnableC90250g(FeedLiveAdLynxCard.class, "onCardStatusEvent", C33124g.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onActivityDestroy();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.feedLive.FeedLiveAdLynxCard$a */
    public static final class C38115a {
        static {
            Covode.recordClassIndex(45583);
        }

        private C38115a() {
        }

        public /* synthetic */ C38115a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.feedLive.FeedLiveAdLynxCard$d */
    public static final class C38118d implements AbstractC16191p {

        /* renamed from: a */
        public final JSONObject f90078a;

        /* renamed from: b */
        final /* synthetic */ String f90079b;

        /* renamed from: c */
        final /* synthetic */ JSONObject f90080c = null;

        /* renamed from: d */
        private final String f90081d;

        static {
            Covode.recordClassIndex(45586);
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: a */
        public final String mo25699a() {
            return this.f90081d;
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Object mo25700b() {
            return this.f90078a;
        }

        C38118d(String str) {
            this.f90079b = str;
            this.f90081d = str;
            this.f90078a = null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.live.feedLive.AbstractC38121a
    /* renamed from: b */
    public final void mo66411b() {
        C80298cg.m139204a(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.feedLive.FeedLiveAdLynxCard$f */
    public static final class RunnableC38120f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FrameLayout f90083a;

        static {
            Covode.recordClassIndex(45588);
        }

        RunnableC38120f(FrameLayout frameLayout) {
            this.f90083a = frameLayout;
        }

        public final void run() {
            this.f90083a.setVisibility(8);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.live.feedLive.AbstractC38121a
    /* renamed from: c */
    public final void mo66412c() {
        m77227g();
        C80298cg.m139205b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.feedLive.FeedLiveAdLynxCard$b */
    static final class C38116b extends AbstractC89220m implements AbstractC89171a<AbstractC33214c> {

        /* renamed from: a */
        public static final C38116b f90076a = new C38116b();

        static {
            Covode.recordClassIndex(45584);
        }

        C38116b() {
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

    /* renamed from: g */
    private final void m77227g() {
        this.f90065l = null;
        this.f90066m = null;
        m77226f();
        this.f90056b = false;
        this.f90057c = false;
        this.f90058d = null;
        this.f90059e = false;
        this.f90060f = false;
        this.f90069p.removeCallbacksAndMessages(null);
        C89393b.m154949a(this.f90064j);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onActivityDestroy() {
        AbstractC1196i lifecycle;
        Context context = this.f90064j.getContext();
        if (!(context instanceof ActivityC0945e)) {
            context = null;
        }
        ActivityC0580d dVar = (ActivityC0580d) context;
        if (!(dVar == null || (lifecycle = dVar.getLifecycle()) == null)) {
            lifecycle.mo4013b(this);
        }
        this.f90073t.mo25721a();
    }

    /* renamed from: f */
    private final void m77226f() {
        if (this.f90056b) {
            this.f90056b = false;
            FrameLayout frameLayout = this.f90064j;
            frameLayout.animate().alpha(0.0f).translationY((float) C34728n.m70946a(15.0d)).setDuration(290).withEndAction(new RunnableC38120f(frameLayout)).start();
            DataCenter dataCenter = this.f90061g;
            if (dataCenter != null) {
                dataCenter.mo19693a("ad_live_card_hide", (Object) null);
            }
        }
    }

    /* renamed from: d */
    public final void mo66413d() {
        AbstractC16208i iVar = this.f90063i;
        if (iVar != null) {
            iVar.onEvent(new C38118d("event_card_show"));
        }
        C18129a.m33746a("draw_ad", "othershow", this.f90055a).mo28900b("refer", "card").mo28901b();
        if (this.f90055a == null) {
            C39162r.onEventV3("card_scoring_show");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.feedLive.FeedLiveAdLynxCard$e */
    static final class RunnableC38119e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FeedLiveAdLynxCard f90082a;

        static {
            Covode.recordClassIndex(45587);
        }

        RunnableC38119e(FeedLiveAdLynxCard feedLiveAdLynxCard) {
            this.f90082a = feedLiveAdLynxCard;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0022 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0033  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 173
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.live.feedLive.FeedLiveAdLynxCard.RunnableC38119e.run():void");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.live.feedLive.AbstractC38121a
    /* renamed from: a */
    public final void mo66405a() {
        String cardUrl;
        String str;
        Integer num;
        String str2;
        String str3;
        String str4;
        String str5;
        CardStruct cardStruct = this.f90068o;
        if (cardStruct != null && (cardUrl = cardStruct.getCardUrl()) != null) {
            Uri.Builder buildUpon = Uri.parse(cardUrl).buildUpon();
            C28022o oVar = new C28022o();
            AwemeRawAd awemeRawAd = this.f90055a;
            int i = 1;
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
                Objects.requireNonNull(clickTrackUrlList, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.model.UrlModel");
                List<String> urlList = clickTrackUrlList.getUrlList();
                if (urlList != null && !urlList.isEmpty()) {
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
                oVar.mo46800a("isVoted", Integer.valueOf(this.f90075v.getBoolean(String.valueOf(awemeRawAd.getCreativeId().longValue()), false) ? 1 : 0));
                C38220ag nativeSiteConfig = awemeRawAd.getNativeSiteConfig();
                if (nativeSiteConfig != null) {
                    str5 = nativeSiteConfig.getLynxScheme();
                } else {
                    str5 = null;
                }
                oVar.mo46801a("lynxSchema", str5);
            }
            Aweme aweme = this.f90067n;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            oVar.mo46801a("itemId", String.valueOf(str));
            oVar.mo46800a("isRTL", Integer.valueOf(C80471gb.m139483a(this.f90064j.getContext()) ? 1 : 0));
            CardStruct cardStruct2 = this.f90068o;
            if (cardStruct2 != null) {
                JSONObject cardData = cardStruct2.getCardData();
                if (cardData == null || (str2 = cardData.toString()) == null) {
                    str2 = "";
                }
                oVar.mo46801a("cardData", str2);
            }
            oVar.mo46800a("topSafeAreaHeight", Integer.valueOf(C80534hh.m139609b()));
            oVar.mo46800a("isCardState", (Number) 1);
            Context context = this.f90064j.getContext();
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity == null || (num = f90054w) == null || num.intValue() != activity.hashCode()) {
                i = 0;
            }
            oVar.mo46800a("userHasVoted", Integer.valueOf(i));
            oVar.mo46800a("enableCardCloseButton", (Number) 0);
            String str7 = this.f90065l;
            if (str7 != null) {
                oVar.mo46801a("adLiveJson", str7);
            }
            String str8 = this.f90066m;
            if (str8 != null) {
                oVar.mo46801a("productInfo", str8);
            }
            String oVar2 = oVar.toString();
            C89219l.m154716b(oVar2, "");
            buildUpon.appendQueryParameter("initialData", oVar2);
            AbstractC35142e eVar = this.f90072s;
            if (eVar != null) {
                String builder = buildUpon.toString();
                C89219l.m154716b(builder, "");
                Bundle bundle = new Bundle();
                Context context2 = this.f90064j.getContext();
                AbstractC33214c e = m77225e();
                if (e != null) {
                    Aweme aweme2 = this.f90067n;
                    C89219l.m154716b(context2, "");
                    e.mo59144a(bundle, aweme2, context2);
                }
                AwemeRawAd awemeRawAd2 = this.f90055a;
                if (awemeRawAd2 != null) {
                    str6 = awemeRawAd2.getNativeSiteCustomData();
                }
                bundle.putString("bundle_native_site_custom_data", str6);
                eVar.mo61984a(builder, bundle);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.live.feedLive.AbstractC38121a
    /* renamed from: a */
    public final void mo66407a(DataCenter dataCenter) {
        this.f90061g = dataCenter;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.feedLive.FeedLiveAdLynxCard$c */
    public static final class C38117c extends AbstractC34952a {

        /* renamed from: a */
        final /* synthetic */ FeedLiveAdLynxCard f90077a;

        static {
            Covode.recordClassIndex(45585);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38117c(FeedLiveAdLynxCard feedLiveAdLynxCard) {
            this.f90077a = feedLiveAdLynxCard;
        }

        @Override // com.p2082ss.android.ugc.aweme.bullet.AbstractC34952a, com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
        /* renamed from: a */
        public final void mo25853a(View view, Uri uri, AbstractC16208i iVar) {
            C89219l.m154721d(view, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(iVar, "");
            super.mo25853a(view, uri, iVar);
            this.f90077a.f90059e = true;
            this.f90077a.f90062h = view;
            this.f90077a.f90063i = iVar;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.live.feedLive.AbstractC38121a
    /* renamed from: a */
    public final void mo66409a(CardStruct cardStruct) {
        C89219l.m154721d(cardStruct, "");
        this.f90068o = cardStruct;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.live.feedLive.AbstractC38121a
    /* renamed from: a */
    public final void mo66406a(long j) {
        if (this.f90068o != null && !this.f90056b) {
            this.f90069p.postDelayed(new RunnableC38119e(this), j);
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onCardCloseEvent(C33121d dVar) {
        C89219l.m154721d(dVar, "");
        if (dVar.f78708a == this.f90073t.hashCode()) {
            m77226f();
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onCardStatusEvent(C33124g gVar) {
        C89219l.m154721d(gVar, "");
        if (gVar.f78714b == this.f90073t.hashCode() && gVar.f78713a == 1) {
            this.f90060f = true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.live.feedLive.AbstractC38121a
    /* renamed from: a */
    public final void mo66408a(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        CardStruct L;
        this.f90067n = aweme;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        this.f90055a = awemeRawAd;
        if (awemeRawAd == null) {
            L = C37699a.m76211N(aweme);
        } else {
            L = C37699a.m76209L(aweme);
        }
        this.f90068o = L;
        m77227g();
    }

    public FeedLiveAdLynxCard(FrameLayout frameLayout) {
        AbstractC35142e eVar;
        AbstractC1196i lifecycle;
        String str;
        C89219l.m154721d(frameLayout, "");
        this.f90064j = frameLayout;
        View a = C1764a.m5927a(LayoutInflater.from(frameLayout.getContext()), R.layout.af7, frameLayout, true);
        C89219l.m154716b(a, "");
        this.f90071r = a;
        C38117c cVar = new C38117c(this);
        this.f90074u = cVar;
        this.f90075v = Keva.getRepo("feed_ad_lynx_vote_card_repo");
        View findViewById = a.findViewById(R.id.c_r);
        C89219l.m154716b(findViewById, "");
        this.f90073t = (BulletContainerView) findViewById;
        AbstractC33214c e = m77225e();
        ActivityC0580d dVar = null;
        if (e != null) {
            BulletContainerView bulletContainerView = this.f90073t;
            IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
            if (f != null) {
                str = f.mo59391g("lynx_feed");
            } else {
                str = null;
            }
            eVar = e.mo59142a(bulletContainerView, str, cVar);
        } else {
            eVar = null;
        }
        this.f90072s = eVar;
        Context context = frameLayout.getContext();
        ActivityC0580d dVar2 = context instanceof ActivityC0945e ? context : dVar;
        if (dVar2 != null && (lifecycle = dVar2.getLifecycle()) != null) {
            lifecycle.mo4012a(this);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.live.feedLive.AbstractC38121a
    /* renamed from: a */
    public final void mo66410a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f90065l = str;
        this.f90066m = str2;
    }
}
