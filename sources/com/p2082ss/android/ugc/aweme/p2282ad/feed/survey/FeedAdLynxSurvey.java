package com.p2082ss.android.ugc.aweme.p2282ad.feed.survey;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.app.ActivityC0580d;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p;
import com.bytedance.ies.bullet.p1184ui.common.BulletContainerView;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.bullet.AbstractC34952a;
import com.p2082ss.android.ugc.aweme.bullet.AbstractC35142e;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38243l;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2626a.AbstractC39043a;
import com.p2082ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33214c;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2294c.C33215a;
import com.p2082ss.android.ugc.aweme.p2282ad.p2285c.C33134q;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.survey.FeedAdLynxSurvey */
public final class FeedAdLynxSurvey implements AbstractC33974au, AbstractC90252i, AbstractC90253j {

    /* renamed from: k */
    public static final C33347a f79243k = new C33347a((byte) 0);

    /* renamed from: a */
    Aweme f79244a;

    /* renamed from: b */
    AwemeRawAd f79245b;

    /* renamed from: c */
    C38243l f79246c;

    /* renamed from: d */
    long f79247d = -1;

    /* renamed from: e */
    AbstractC35142e f79248e;

    /* renamed from: f */
    public AbstractC16208i f79249f;

    /* renamed from: g */
    String f79250g;

    /* renamed from: h */
    public boolean f79251h;

    /* renamed from: i */
    final C33352a f79252i;

    /* renamed from: j */
    final FrameLayout f79253j;

    /* renamed from: l */
    private Integer f79254l;

    /* renamed from: m */
    private final AbstractC89244h f79255m = C89250i.m154773a((AbstractC89171a) C33348b.f79259a);

    /* renamed from: n */
    private final View f79256n;

    /* renamed from: o */
    private BulletContainerView f79257o;

    /* renamed from: p */
    private final AbstractC34952a f79258p;

    static {
        Covode.recordClassIndex(40185);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final AbstractC33214c mo59346a() {
        return (AbstractC33214c) this.f79255m.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(45, new RunnableC90250g(FeedAdLynxSurvey.class, "onHomeTabPressed", C33215a.class, ThreadMode.MAIN, 0, false));
        hashMap.put(46, new RunnableC90250g(FeedAdLynxSurvey.class, "onSwipeUpEvent", C33134q.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.survey.FeedAdLynxSurvey$a */
    public static final class C33347a {
        static {
            Covode.recordClassIndex(40186);
        }

        private C33347a() {
        }

        public /* synthetic */ C33347a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.survey.FeedAdLynxSurvey$d */
    public static final class C33350d implements AbstractC16191p {

        /* renamed from: a */
        public final JSONObject f79261a;

        /* renamed from: b */
        final /* synthetic */ String f79262b;

        /* renamed from: c */
        final /* synthetic */ JSONObject f79263c;

        /* renamed from: d */
        private final String f79264d;

        static {
            Covode.recordClassIndex(40189);
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: a */
        public final String mo25699a() {
            return this.f79264d;
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Object mo25700b() {
            return this.f79261a;
        }

        C33350d(String str, JSONObject jSONObject) {
            this.f79262b = str;
            this.f79263c = jSONObject;
            this.f79264d = str;
            this.f79261a = jSONObject;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.survey.FeedAdLynxSurvey$b */
    static final class C33348b extends AbstractC89220m implements AbstractC89171a<AbstractC33214c> {

        /* renamed from: a */
        public static final C33348b f79259a = new C33348b();

        static {
            Covode.recordClassIndex(40187);
        }

        C33348b() {
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

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.survey.FeedAdLynxSurvey$c */
    public static final class C33349c extends AbstractC34952a {

        /* renamed from: a */
        final /* synthetic */ FeedAdLynxSurvey f79260a;

        static {
            Covode.recordClassIndex(40188);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33349c(FeedAdLynxSurvey feedAdLynxSurvey) {
            this.f79260a = feedAdLynxSurvey;
        }

        @Override // com.p2082ss.android.ugc.aweme.bullet.AbstractC34952a, com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
        /* renamed from: a */
        public final void mo25853a(View view, Uri uri, AbstractC16208i iVar) {
            C89219l.m154721d(view, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(iVar, "");
            super.mo25853a(view, uri, iVar);
            this.f79260a.f79251h = true;
            this.f79260a.f79249f = iVar;
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onSwipeUpEvent(C33134q qVar) {
        DataCenter dataCenter;
        String str = "";
        C89219l.m154721d(qVar, str);
        if (qVar.f78725a == this.f79257o.hashCode()) {
            String str2 = qVar.f78726b;
            if (str2 != null) {
                str = str2;
            }
            this.f79250g = str;
            C33352a aVar = this.f79252i;
            C33354b bVar = aVar.f79271c;
            if (bVar != null && (dataCenter = aVar.f79269a) != null) {
                dataCenter.mo60191a("action_ad_swipe_up_video", bVar);
            }
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onHomeTabPressed(C33215a aVar) {
        Long l;
        int i;
        C89219l.m154721d(aVar, "");
        if (this.f79252i.f79270b) {
            this.f79252i.mo59356b();
            C18129a.C18130a a = C18129a.m33746a("draw_ad", "othershow_over", this.f79245b);
            AwemeRawAd awemeRawAd = this.f79245b;
            if (awemeRawAd != null) {
                l = awemeRawAd.getAdId();
            } else {
                l = null;
            }
            C18129a.C18130a a2 = a.mo28900b("ad_id", l).mo28897a("duration", Long.valueOf(System.currentTimeMillis() - this.f79247d));
            C38243l lVar = this.f79246c;
            if (lVar != null) {
                i = lVar.getId();
            } else {
                i = 0;
            }
            a2.mo28897a("five_star_survey_id", Integer.valueOf(i)).mo28901b();
        }
        EventBus.m156962a().mo145395b(this);
    }

    /* renamed from: a */
    public final void mo59347a(Aweme aweme, int i) {
        AwemeRawAd awemeRawAd;
        this.f79244a = aweme;
        C38243l lVar = null;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        this.f79245b = awemeRawAd;
        this.f79254l = Integer.valueOf(i);
        AwemeRawAd awemeRawAd2 = this.f79245b;
        if (awemeRawAd2 != null) {
            lVar = awemeRawAd2.getAdQuestionnaire();
        }
        this.f79246c = lVar;
    }

    public FeedAdLynxSurvey(C33352a aVar, FrameLayout frameLayout) {
        AbstractC35142e eVar;
        AbstractC1196i lifecycle;
        String str;
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(frameLayout, "");
        MethodCollector.m26663i(8260);
        this.f79252i = aVar;
        this.f79253j = frameLayout;
        ActivityC0580d dVar = null;
        View inflate = View.inflate(frameLayout.getContext(), R.layout.af5, null);
        C89219l.m154716b(inflate, "");
        this.f79256n = inflate;
        this.f79250g = "";
        C33349c cVar = new C33349c(this);
        this.f79258p = cVar;
        frameLayout.removeAllViews();
        frameLayout.addView(inflate);
        View findViewById = inflate.findViewById(R.id.zm);
        C89219l.m154716b(findViewById, "");
        this.f79257o = (BulletContainerView) findViewById;
        AbstractC33214c a = mo59346a();
        if (a != null) {
            BulletContainerView bulletContainerView = this.f79257o;
            IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
            if (f != null) {
                str = f.mo59391g("lynx_feed");
            } else {
                str = null;
            }
            eVar = a.mo59142a(bulletContainerView, str, cVar);
        } else {
            eVar = null;
        }
        this.f79248e = eVar;
        Context context = frameLayout.getContext();
        ActivityC0580d dVar2 = context instanceof ActivityC0945e ? context : dVar;
        if (dVar2 == null || (lifecycle = dVar2.getLifecycle()) == null) {
            MethodCollector.m26664o(8260);
            return;
        }
        lifecycle.mo4012a(this);
        MethodCollector.m26664o(8260);
    }
}
