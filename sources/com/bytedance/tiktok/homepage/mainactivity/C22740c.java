package com.bytedance.tiktok.homepage.mainactivity;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0218d;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.AbstractC17900a;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.C17901b;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.IMainAdScene;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.viewModel.AdHomePageDataVM;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.C17899c;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashAdServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.p2082ss.android.ugc.aweme.commerce.p2505a.C37438a;
import com.p2082ss.android.ugc.aweme.commercialize.abtest.C37586a;
import com.p2082ss.android.ugc.aweme.commercialize.feed.C37883bf;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.splash.C38489a;
import com.p2082ss.android.ugc.aweme.commercialize.splash.C38493d;
import com.p2082ss.android.ugc.aweme.commercialize.util.C38587g;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38703bs;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49677e;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50477z;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50041af;
import com.p2082ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.main.AbstractC59104k;
import com.p2082ss.android.ugc.aweme.main.C59014ae;
import com.p2082ss.android.ugc.aweme.main.TabChangeManager;
import com.p2082ss.android.ugc.aweme.main.experiment.C59086g;
import com.p2082ss.android.ugc.aweme.p2282ad.FeedAdServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.p4375d.C85081a;
import org.json.JSONObject;

/* renamed from: com.bytedance.tiktok.homepage.mainactivity.c */
public class C22740c {

    /* renamed from: a */
    public final ActivityC0218d f53715a;

    /* renamed from: b */
    public C22753i f53716b;

    /* renamed from: c */
    public HomePageDataViewModel f53717c;

    /* renamed from: d */
    public AdHomePageDataVM f53718d;

    /* renamed from: e */
    public IMainAdScene f53719e;

    static {
        Covode.recordClassIndex(26633);
    }

    /* renamed from: a */
    public final Fragment mo37062a() {
        if (TabChangeManager.C59002a.m108439a(this.f53715a) == null) {
            return null;
        }
        return TabChangeManager.C59002a.m108439a(this.f53715a).mo96536b();
    }

    /* renamed from: b */
    public final C50041af mo37063b() {
        Fragment a = mo37062a();
        if (!(a instanceof C59014ae)) {
            return null;
        }
        AbstractC50477z s = ((C59014ae) a).mo96547l();
        if (s instanceof C50041af) {
            return (C50041af) s;
        }
        return null;
    }

    /* renamed from: c */
    public final void mo37064c() {
        if (C59086g.m108563a() || C37586a.f88830a) {
            m42897a(false);
        }
        Aweme aweme = this.f53717c.f121745k;
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (!C37699a.m76314s(aweme) || !C37699a.m76202E(aweme)) {
                if (!C37699a.m76202E(aweme)) {
                    ((AbstractC59104k) this.f53715a).allowSwipeLeft(true);
                } else {
                    ((AbstractC59104k) this.f53715a).allowSwipeLeft(false);
                }
            } else if (C37699a.m76203F(aweme)) {
                ((AbstractC59104k) this.f53715a).allowSwipeLeft(true);
            } else if (!C37699a.m76313r(aweme) && C37699a.m76321z(aweme)) {
                ((AbstractC59104k) this.f53715a).allowSwipeLeft(false);
                if (C59086g.m108563a() || C37586a.f88830a) {
                    m42897a(true);
                }
            } else if (C37699a.m76275au(aweme).booleanValue()) {
                ((AbstractC59104k) this.f53715a).allowSwipeLeft(false);
                if (C59086g.m108563a() || C37586a.f88830a) {
                    m42897a(true);
                }
            } else if (C38703bs.m78530b(aweme) || C38703bs.m78532c(aweme)) {
                ((AbstractC59104k) this.f53715a).allowSwipeLeft(false);
                if (C59086g.m108563a() || C37586a.f88830a) {
                    m42897a(true);
                }
            } else if (awemeRawAd == null || TextUtils.isEmpty(awemeRawAd.getWebUrl()) || C37699a.m76313r(aweme) || C37699a.m76291d(awemeRawAd)) {
                ((AbstractC59104k) this.f53715a).allowSwipeLeft(false);
                if (C59086g.m108563a() || C37586a.f88830a) {
                    m42897a(true);
                }
            } else {
                ((AbstractC59104k) this.f53715a).allowSwipeLeft(true);
            }
        }
    }

    /* renamed from: a */
    private void m42897a(boolean z) {
        ((AbstractC59104k) this.f53715a).setVpEnableDispatchTouchEventCheck(z);
    }

    /* renamed from: a */
    public static void m42896a(Toast toast) {
        if (Build.VERSION.SDK_INT == 25) {
            C80567ic.m139657a(toast);
        }
        toast.show();
    }

    public C22740c(ActivityC0218d dVar, C22753i iVar) {
        this.f53715a = dVar;
        this.f53716b = iVar;
        IAdSceneService f = AdSceneServiceImpl.m33210f();
        if (f != null) {
            this.f53719e = f.mo28464a();
            C17901b bVar = new C17901b();
            bVar.f42659a = dVar;
            bVar.f42655b = new AbstractC17900a() {
                /* class com.bytedance.tiktok.homepage.mainactivity.C22740c.C227411 */

                static {
                    Covode.recordClassIndex(26634);
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.AbstractC17900a
                /* renamed from: b */
                public final void mo28546b() {
                    C85081a.m146286a();
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.AbstractC17900a
                /* renamed from: c */
                public final Fragment mo28547c() {
                    return C22740c.this.mo37062a();
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.AbstractC17900a
                /* renamed from: d */
                public final void mo28548d() {
                    C22740c.this.mo37064c();
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.AbstractC17900a
                /* renamed from: f */
                public final void mo28550f() {
                    C38493d.f90922b = System.currentTimeMillis();
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.AbstractC17900a
                /* renamed from: j */
                public final long mo28554j() {
                    return C37438a.m75484d().f88370h;
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.AbstractC17900a
                /* renamed from: h */
                public final long mo28552h() {
                    return C37438a.m75484d().mo65140c();
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.AbstractC17900a
                /* renamed from: i */
                public final int mo28553i() {
                    return C37438a.m75484d().f88368f + 1;
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.AbstractC17900a
                /* renamed from: e */
                public final long mo28549e() {
                    if (C22740c.this.mo37063b() != null) {
                        return C22740c.this.mo37063b().f115519n.f114783aK.mo81169H();
                    }
                    return 0;
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.AbstractC17900a
                /* renamed from: g */
                public final void mo28551g() {
                    ISplashAdService i = SplashAdServiceImpl.m33397i();
                    if (i != null) {
                        i.mo28716b(new C38489a());
                    } else {
                        C12290b.m22060a("splash_depend_init_question", 3, (JSONObject) null);
                    }
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.AbstractC17900a
                /* renamed from: a */
                public final boolean mo28545a() {
                    if (C22740c.this.f53716b == null || !C22740c.this.f53716b.f53741b) {
                        return false;
                    }
                    return true;
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.AbstractC17900a
                /* renamed from: a */
                public final void mo28540a(Aweme aweme) {
                    AbstractC81915c.m141874a(new C49677e(aweme));
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.AbstractC17900a
                /* renamed from: a */
                public final void mo28541a(Aweme aweme, Context context) {
                    AbstractC48149ai aC;
                    C50041af b = C22740c.this.mo37063b();
                    if (b != null && (aC = b.f115519n.mo81108aC()) != null && aC.mo80231v() != null && aC.mo80231v().mo80119ad() != null) {
                        C37438a.m75484d().mo65131a(aweme, context, aC.mo80231v().mo80119ad());
                    }
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.AbstractC17900a
                /* renamed from: a */
                public final void mo28542a(String str, String str2) {
                    if (TextUtils.equals("click", str)) {
                        C38587g.m78300a(str2);
                    }
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.AbstractC17900a
                /* renamed from: a */
                public final void mo28544a(boolean z, String str) {
                    if (z) {
                        C58945a.C58947b.f134185a.mo96425a(str, false);
                    } else {
                        C58945a.C58947b.f134185a.mo96429b(str, false);
                    }
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.AbstractC17900a
                /* renamed from: a */
                public final void mo28543a(String str, String str2, JSONObject jSONObject) {
                    C38189j.m77498a(str, str2, jSONObject);
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.AbstractC17900a
                /* renamed from: a */
                public final void mo28539a(Context context, String str, String str2) {
                    if (!TextUtils.equals(C16048b.m29633a().mo25417a(true, "enable_send_staging_adlog", "v3"), "v1")) {
                        C38189j.m77491a(context, str, str2);
                    }
                }
            };
            this.f53719e.mo28473a(bVar);
        }
        IAdSceneService f2 = AdSceneServiceImpl.m33210f();
        if (f2 != null) {
            C17899c cVar = new C17899c();
            cVar.f42655b = new C37883bf();
            f2.mo28466c().mo28473a(cVar);
        }
        FeedAdServiceImpl.m67808c().mo58883b().mo59086a(dVar);
    }
}
