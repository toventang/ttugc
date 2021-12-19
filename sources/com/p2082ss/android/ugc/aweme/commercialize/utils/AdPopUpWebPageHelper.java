package com.p2082ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.ies.xbridge.p1301e.C18484a;
import com.bytedance.ies.xbridge.p1301e.C18494b;
import com.bytedance.ies.xbridge.platform.p1352b.C18822b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35197k;
import com.p2082ss.android.ugc.aweme.commercialize.event.C37830a;
import com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView;
import com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.C37977b;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38182f;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.p2282ad.p2285c.C33131n;
import com.p2082ss.android.ugc.aweme.p2282ad.p2285c.C33132o;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.AdPopUpWebPageHelper */
public final class AdPopUpWebPageHelper implements AbstractC33974au {

    /* renamed from: g */
    public static final Map<Integer, AdPopUpWebPageHelper> f91197g = new LinkedHashMap();

    /* renamed from: h */
    public static final C38599a f91198h = new C38599a((byte) 0);

    /* renamed from: a */
    public String f91199a;

    /* renamed from: b */
    long f91200b;

    /* renamed from: c */
    public AdPopUpWebPageView f91201c;

    /* renamed from: d */
    public final C38600b f91202d = new C38600b(this);

    /* renamed from: e */
    public final C38603d f91203e = new C38603d(this);

    /* renamed from: f */
    public final C38604e f91204f = new C38604e(this);

    /* renamed from: i */
    private WeakReference<ActivityC0945e> f91205i;

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.AdPopUpWebPageHelper$a */
    public static final class C38599a {
        static {
            Covode.recordClassIndex(46132);
        }

        private C38599a() {
        }

        public /* synthetic */ C38599a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m78320a(Activity activity) {
            C89219l.m154721d(activity, "");
            AdPopUpWebPageHelper adPopUpWebPageHelper = AdPopUpWebPageHelper.f91197g.get(Integer.valueOf(activity.hashCode()));
            if (adPopUpWebPageHelper != null) {
                adPopUpWebPageHelper.mo67175c();
                AdPopUpWebPageHelper.f91197g.remove(Integer.valueOf(activity.hashCode()));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.AdPopUpWebPageHelper$d */
    public static final class C38603d implements AdPopUpWebPageView.AbstractC37942c {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageHelper f91214a;

        static {
            Covode.recordClassIndex(46136);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.AbstractC37942c
        /* renamed from: a */
        public final void mo66148a() {
            this.f91214a.f91199a = "back";
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38603d(AdPopUpWebPageHelper adPopUpWebPageHelper) {
            this.f91214a = adPopUpWebPageHelper;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.AdPopUpWebPageHelper$e */
    public static final class C38604e implements AdPopUpWebPageView.AbstractC37943d {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageHelper f91215a;

        static {
            Covode.recordClassIndex(46137);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.AbstractC37943d
        /* renamed from: b */
        public final void mo66150b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.AbstractC37943d
        /* renamed from: a */
        public final void mo66149a() {
            this.f91215a.f91199a = "button";
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38604e(AdPopUpWebPageHelper adPopUpWebPageHelper) {
            this.f91215a = adPopUpWebPageHelper;
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void onResume() {
        this.f91200b = System.currentTimeMillis();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.AdPopUpWebPageHelper$c */
    public static final class C38601c extends AbstractC89220m implements AbstractC89171a<Object> {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageHelper f91207a;

        /* renamed from: b */
        final /* synthetic */ AdPopUpWebPageView f91208b;

        /* renamed from: c */
        final /* synthetic */ ActivityC0945e f91209c;

        /* renamed from: d */
        final /* synthetic */ String f91210d;

        /* renamed from: e */
        final /* synthetic */ String f91211e;

        /* renamed from: f */
        final /* synthetic */ AbstractC89172b f91212f = null;

        static {
            Covode.recordClassIndex(46134);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38601c(AdPopUpWebPageHelper adPopUpWebPageHelper, AdPopUpWebPageView adPopUpWebPageView, ActivityC0945e eVar, String str, String str2, AbstractC89172b bVar) {
            super(0);
            this.f91207a = adPopUpWebPageHelper;
            this.f91208b = adPopUpWebPageView;
            this.f91209c = eVar;
            this.f91210d = str;
            this.f91211e = str2;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Object invoke() {
            return Boolean.valueOf(this.f91208b.post(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.commercialize.utils.AdPopUpWebPageHelper.C38601c.RunnableC386021 */

                /* renamed from: a */
                final /* synthetic */ C38601c f91213a;

                static {
                    Covode.recordClassIndex(46135);
                }

                {
                    this.f91213a = r1;
                }

                public final void run() {
                    AwemeRawAd awemeRawAd;
                    String str;
                    C37977b.C37978a a = new C37977b.C37978a().mo66199a(this.f91213a.f91209c);
                    Aweme a2 = AdPopUpWebPageHelper.m78316a();
                    if (a2 != null) {
                        awemeRawAd = a2.getAwemeRawAd();
                    } else {
                        awemeRawAd = null;
                    }
                    C37977b.C37978a b = a.mo66201a(awemeRawAd).mo66202a(this.f91213a.f91210d).mo66205b(this.f91213a.f91211e);
                    Aweme a3 = AdPopUpWebPageHelper.m78316a();
                    if (a3 == null || (str = a3.getAid()) == null) {
                        str = "";
                    }
                    boolean a4 = AdPopUpWebPageWidget.f92172n.mo67716a(b.mo66206c(str).mo66204b(25).mo66203a());
                    if (a4) {
                        AbstractC81915c.m141874a(new C37830a(1));
                    }
                    AbstractC89172b bVar = this.f91213a.f91212f;
                    if (bVar != null) {
                        bVar.invoke(Boolean.valueOf(a4));
                    }
                }
            }));
        }
    }

    /* renamed from: a */
    public static Aweme m78316a() {
        C38751k a = C38654au.m78417a();
        if (a != null) {
            return a.f91522m;
        }
        return null;
    }

    /* renamed from: b */
    public final ActivityC0945e mo67174b() {
        WeakReference<ActivityC0945e> weakReference = this.f91205i;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        ActivityC0945e b = mo67174b();
        if (b != null) {
            C38599a.m78320a(b);
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public final void onPause() {
        mo67173a(System.currentTimeMillis() - this.f91200b);
    }

    static {
        Covode.recordClassIndex(46131);
    }

    /* renamed from: c */
    public final void mo67175c() {
        ActivityC0945e b = mo67174b();
        if (b != null) {
            b.getLifecycle().mo4013b(this);
            if (this.f91201c != null) {
                AdPopUpWebPageWidget.f92172n.mo67715a(b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.AdPopUpWebPageHelper$b */
    public static final class C38600b implements AdPopUpWebPageView.AbstractC37940a {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageHelper f91206a;

        static {
            Covode.recordClassIndex(46133);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.AbstractC37940a
        /* renamed from: a */
        public final void mo66145a(int i, Boolean bool) {
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.AbstractC37940a
        /* renamed from: a */
        public final void mo66146a(String str) {
            C89219l.m154721d(str, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.AbstractC37940a
        /* renamed from: b */
        public final void mo66147b(int i) {
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.AbstractC37940a
        /* renamed from: a */
        public final void mo66143a() {
            AdPopUpWebPageHelper adPopUpWebPageHelper = this.f91206a;
            if (C37699a.m76237aI(AdPopUpWebPageHelper.m78316a())) {
                AbstractC81915c.m141874a(new C33132o());
            }
            AbstractC81915c.m141874a(new C35197k(true));
            adPopUpWebPageHelper.f91200b = System.currentTimeMillis();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38600b(AdPopUpWebPageHelper adPopUpWebPageHelper) {
            this.f91206a = adPopUpWebPageHelper;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.AbstractC37940a
        /* renamed from: a */
        public final void mo66144a(int i) {
            String str;
            AwemeRawAd awemeRawAd;
            String str2;
            AwemeRawAd awemeRawAd2;
            AdPopUpWebPageHelper adPopUpWebPageHelper = this.f91206a;
            if (C37699a.m76237aI(AdPopUpWebPageHelper.m78316a())) {
                AbstractC81915c.m141874a(new C33131n());
            }
            AbstractC81915c.m141874a(new C35197k(false));
            if (adPopUpWebPageHelper.f91201c != null) {
                if (C38615aa.f91246d == 1) {
                    str2 = "slide";
                } else {
                    str2 = "slide_down";
                }
                C38182f.C38184b a = C38182f.m77418a();
                a.f90211a = "landing_ad";
                a.f90212b = "close";
                String str3 = adPopUpWebPageHelper.f91199a;
                if (str3 == null) {
                    str3 = str2;
                }
                a.mo66504c(str3).mo66497b(AdPopUpWebPageHelper.m78316a()).mo66495a((Context) null);
                Aweme a2 = AdPopUpWebPageHelper.m78316a();
                if (a2 != null) {
                    awemeRawAd2 = a2.getAwemeRawAd();
                } else {
                    awemeRawAd2 = null;
                }
                C18129a.C18130a a3 = C18129a.m33746a("landing_ad", "close", awemeRawAd2);
                String str4 = adPopUpWebPageHelper.f91199a;
                if (str4 != null) {
                    str2 = str4;
                }
                a3.mo28900b("refer", str2).mo28902c();
            }
            adPopUpWebPageHelper.mo67173a(System.currentTimeMillis() - adPopUpWebPageHelper.f91200b);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Aweme a4 = AdPopUpWebPageHelper.m78316a();
            if (a4 == null || (awemeRawAd = a4.getAwemeRawAd()) == null || (str = awemeRawAd.getWebUrl()) == null) {
                str = "";
            }
            linkedHashMap.put("url", str);
            linkedHashMap.put("timestamp", String.valueOf(System.currentTimeMillis()));
            C18494b.m34415a(new C18484a("ad_webview_close", System.currentTimeMillis(), C18822b.m34925a(linkedHashMap)));
            this.f91206a.f91199a = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo67173a(long j) {
        if (this.f91201c != null) {
            C33744d dVar = new C33744d();
            dVar.mo59981a("duration", j);
            C39162r.m79460a("h5_stay_time", dVar.f79943a);
        }
    }

    public AdPopUpWebPageHelper(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        this.f91205i = new WeakReference<>(eVar);
        eVar.getLifecycle().mo4012a(this);
    }
}
