package com.p2082ss.android.ugc.aweme.commercialize.splash;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashAdServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashSettingServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17975i;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.C17977a;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize_tools_api.singleton.TroubleshootingLogDelegate;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39106g;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48191b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.p2082ss.android.ugc.aweme.feed.p2963q.C49860aw;
import com.p2082ss.android.ugc.aweme.feed.p2963q.C49888x;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50041af;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.freeflowcard.p3010a.C51433a;
import com.p2082ss.android.ugc.aweme.utils.C80444fq;
import com.p2082ss.android.ugc.aweme.utils.EnumC80443fp;
import com.p2082ss.android.ugc.aweme.video.C81079v;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.e */
public final class C38496e {
    static {
        Covode.recordClassIndex(46021);
    }

    /* renamed from: a */
    public static boolean m78026a(C50041af afVar) {
        String str;
        int i;
        MethodCollector.m26663i(7381);
        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("try show TopView");
        if (afVar == null) {
            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView show failed reason: feedRecommendFragment null");
            MethodCollector.m26664o(7381);
            return false;
        }
        String str2 = C17975i.f42808h;
        C17975i.f42808h = null;
        C17975i.f42809i = !TextUtils.isEmpty(str2);
        if (TextUtils.isEmpty(str2)) {
            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView show failed reason: awesomeId null");
            MethodCollector.m26664o(7381);
            return false;
        }
        Aweme a = SplashAdServiceImpl.m33397i().mo28707a(str2);
        if (a == null) {
            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView show failed reason: aweme null");
            MethodCollector.m26664o(7381);
            return false;
        } else if (!a.isAd()) {
            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView show failed reason: aweme not ad");
            MethodCollector.m26664o(7381);
            return false;
        } else {
            C49860aw awVar = afVar.f115519n;
            if (awVar == null || awVar.f114768W == null) {
                TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView show failed reason: BaseListFragmentPanel null");
                MethodCollector.m26664o(7381);
                return false;
            }
            int aE = awVar.mo81110aE();
            AbstractC48191b bVar = awVar.f114768W;
            int b = C50545m.m94764b(bVar.mo80288e(), a);
            if (b >= 0) {
                Aweme c = bVar.mo80287c(b);
                Context a2 = C17867d.m33078a();
                int i2 = 2;
                if (c.isAd()) {
                    i = 1;
                } else {
                    i = 2;
                }
                C38189j.m77477a(a2, a, i);
                C18129a.C18130a a3 = C18129a.m33746a("draw_ad", "item_repeat", a.getAwemeRawAd());
                if (c.isAd()) {
                    i2 = 1;
                }
                a3.mo28897a("filter_reason", Integer.valueOf(i2)).mo28902c();
            }
            if (!C17977a.m33497a() || !C17975i.f42812l || bVar.getCount() != 0) {
                C17975i.f42812l = false;
                int i3 = -1;
                for (int i4 = 0; i4 < bVar.getCount(); i4++) {
                    Aweme c2 = bVar.mo80287c(i4);
                    if ((c2 == a || TextUtils.equals(c2.getAid(), a.getAid())) && a.getAwemeRawAd().isEnableFilterSameVideo()) {
                        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView show failed reason: feed has same aweme");
                        Context a4 = C17867d.m33078a();
                        C38189j.m77510b(a4, "show_failed", a, C38189j.m77503b(a4, a, C17975i.m33464b("8")));
                        C18129a.C18130a a5 = C18129a.m33746a("draw_ad", "show_failed", a.getAwemeRawAd()).mo28897a("ad_show_fail_type", "8");
                        if (C17975i.f42802b) {
                            str = "1";
                        } else {
                            str = "2";
                        }
                        a5.mo28897a("awemelaunch", str).mo28902c();
                        MethodCollector.m26664o(7381);
                        return false;
                    }
                    if (i4 >= aE && i3 == -1 && !c2.isAd()) {
                        i3 = i4;
                    }
                }
                int b2 = SplashSettingServiceImpl.m33419g().mo28724b();
                if (b2 > 0) {
                    try {
                        Thread.sleep((long) b2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Aweme a6 = AwemeService.m70060b().mo60677a(a);
                TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("insert TopView to feed list");
                a6.getAid();
                awVar.mo81110aE();
                AwemeSplashInfo m = C37699a.m76308m(a6);
                if (m != null) {
                    m.setShown(false);
                    m.contextTrackSent = false;
                }
                C51433a.f118515a = true;
                try {
                    awVar.mo84721b(a6, aE);
                    if (a6.getVideo() != null) {
                        if (C16048b.m29633a().mo25412a(true, "player_precreateplayer", 0) == 1 && C80444fq.C80445a.f180026a.mo123743a(EnumC80443fp.PLAYER_FIRST_VIDEO_PREPARED)) {
                            C81079v.m140776O().mo123936a(a6);
                        }
                    }
                } catch (C39106g e2) {
                    C51423a.m95788a("", e2);
                }
                awVar.mo84719b(aE, false);
                C51433a.f118515a = false;
                if (!C38493d.f90924d && SplashSettingServiceImpl.m33419g().mo28725c()) {
                    for (int count = bVar.getCount() - 1; count > aE; count--) {
                        if (count != i3 + 1 && (awVar instanceof C49888x)) {
                            awVar.mo84684a(count, bVar.mo80287c(count));
                        }
                    }
                    afVar.mo70521a();
                } else if (!C38493d.f90924d) {
                    C17975i.m33460a();
                }
                if (C38493d.f90924d && !SplashSettingServiceImpl.m33419g().mo28723a()) {
                    C17975i.m33460a();
                }
                MethodCollector.m26664o(7381);
                return true;
            }
            MethodCollector.m26664o(7381);
            return false;
        }
    }
}
