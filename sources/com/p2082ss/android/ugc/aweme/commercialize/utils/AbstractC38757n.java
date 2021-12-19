package com.p2082ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18146e;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.C18147f;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.ugc.aweme.app.C33722d;
import com.p2082ss.android.ugc.aweme.bullet.utils.C35301c;
import com.p2082ss.android.ugc.aweme.commercialize.C37638d;
import com.p2082ss.android.ugc.aweme.commercialize.event.C37830a;
import com.p2082ss.android.ugc.aweme.commercialize.event.C37835d;
import com.p2082ss.android.ugc.aweme.commercialize.event.C37836e;
import com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.C37977b;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38163ai;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38214ac;
import com.p2082ss.android.ugc.aweme.commercialize.p2539d.AbstractC37639a;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.p2570im.C38024a;
import com.p2082ss.android.ugc.aweme.commercialize.profile.AdProfilePopUpWebPageWidget;
import com.p2082ss.android.ugc.aweme.commercialize.tasks.C38515b;
import com.p2082ss.android.ugc.aweme.commercialize.tasks.C38517d;
import com.p2082ss.android.ugc.aweme.commercialize.utils.p2621a.C38606a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.p2623b.C38671d;
import com.p2082ss.android.ugc.aweme.commercialize.utils.p2623b.C38673e;
import com.p2082ss.android.ugc.aweme.commercialize.utils.p2623b.p2624a.C38665a;
import com.p2082ss.android.ugc.aweme.commercialize.views.C38805a;
import com.p2082ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p2082ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness;
import com.p2082ss.android.ugc.aweme.feed.helper.C49625h;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50543k;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.landpage.p3389b.C58067a;
import com.p2082ss.android.ugc.aweme.miniapp.utils.C59286a;
import com.p2082ss.android.ugc.aweme.miniapp_api.C59308d;
import com.p2082ss.android.ugc.aweme.miniapp_api.model.p3445b.C59315a;
import com.p2082ss.android.ugc.aweme.miniapp_api.services.C59320c;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56252e;
import com.p2082ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import com.p2082ss.android.ugc.aweme.profile.api.C63431e;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.n */
public abstract class AbstractC38757n {

    /* renamed from: a */
    private static final String[] f91530a = {"webcast_room"};

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.n$a */
    public interface AbstractC38758a {
        static {
            Covode.recordClassIndex(46299);
        }

        void sendLog(boolean z);
    }

    /* renamed from: a */
    public static boolean m78644a(Uri uri) {
        if (uri != null) {
            return TextUtils.equals("http", uri.getScheme()) || TextUtils.equals("https", uri.getScheme());
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m78637a(Context context, String str, Aweme aweme) {
        return m78638a(context, str, aweme, false, 0);
    }

    /* renamed from: a */
    private static boolean m78638a(Context context, String str, Aweme aweme, boolean z, int i) {
        if (context == null || aweme == null || !aweme.isAd() || TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (TextUtils.isEmpty(parse.getScheme())) {
            return false;
        }
        Uri build = parse.buildUpon().appendQueryParameter("source_aid", aweme.getAid()).build();
        String lowerCase = build.getScheme().toLowerCase();
        if (m78647a(str) && aweme.getAwemeRawAd() != null) {
            build = build.buildUpon().appendQueryParameter("creative_id", aweme.getAwemeRawAd().getCreativeIdStr()).appendQueryParameter("log_extra", aweme.getAwemeRawAd().getLogExtra()).appendQueryParameter("ad_id", String.valueOf(aweme.getAwemeRawAd().getAdId())).appendQueryParameter("live.intent.extra.ENTER_AWEME_ID", aweme.getAid()).build();
            str = build.toString();
        }
        if (C37699a.m76228a(lowerCase)) {
            C38673e.m78470a(str);
            C33722d.f79888e.mo59966a(context, str);
            C38163ai.m77367a(str);
            return true;
        } else if (TextUtils.equals(lowerCase, "aweme")) {
            SmartRouter.buildRoute(context, str).open();
            return true;
        } else {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(build);
            if (!C29843f.m60130a(context, intent)) {
                return false;
            }
            if (str.contains("__back_url__")) {
                str = str.replace("__back_url__", Uri.encode(AbstractC37639a.AbstractC37640a.f89002a));
                intent.setData(Uri.parse(str));
                C1731i.m5640b(new CallableC38759o(aweme), C1731i.f5562a);
            }
            intent.putExtra("open_url", str);
            intent.addFlags(268435456);
            if (!m78632a(context, intent)) {
                return false;
            }
            if (!C37699a.m76312q(aweme)) {
                if (i == 53) {
                    C18129a.m33746a("result_ad", "open_url_app", aweme.getAwemeRawAd()).mo28900b("refer", "button").mo28902c();
                    m78630a(new C38760p(aweme));
                } else if (i == 54) {
                    C18129a.m33746a("result_ad_bg", "open_url_app", aweme.getAwemeRawAd()).mo28900b("refer", "bg_more_button").mo28902c();
                    m78630a(new C38761q(aweme));
                } else {
                    C38189j.m77516c(context, aweme);
                    C18129a.m33746a("draw_ad", "open_url_app", aweme.getAwemeRawAd()).mo28902c();
                    m78630a(new C38762r(context, aweme));
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    private static boolean m78647a(String str) {
        if (str == null) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return false;
            }
            for (String str2 : f91530a) {
                if (TextUtils.equals(str2, parse.getHost())) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static boolean m78643a(Context context, String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (C59308d.m109008c(str)) {
            C59320c.C59324a.f135560a.mo96989a().openMiniApp(context, str, new C59315a());
            return true;
        }
        if (str.contains("__back_url__")) {
            str = str.replace("__back_url__", Uri.encode(AbstractC37639a.AbstractC37640a.f89002a));
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (TextUtils.isEmpty(scheme) || !C38767w.m78672d(context, str)) {
            return false;
        }
        if (C37699a.m76228a(scheme)) {
            C38673e.m78470a(str);
            C33722d.f79888e.mo59966a(context, str);
            return true;
        } else if (m78654b(str)) {
            C36125t.m73598a(C36125t.m73591a(), str);
            return true;
        } else if (z) {
            return false;
        } else {
            if (m78659c(str)) {
                return m78632a(context, new Intent("android.intent.action.SENDTO", parse));
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(parse);
            if (!C29843f.m60130a(context, intent)) {
                return false;
            }
            intent.putExtra("open_url", str);
            if (!m78632a(context, intent)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m78635a(Context context, Aweme aweme, String str, String str2) {
        return m78636a(context, aweme, str, str2, aweme == null || (aweme.isAd() && C50543k.m94758a(aweme.getAwemeRawAd())));
    }

    /* renamed from: a */
    public static boolean m78639a(Context context, String str, String str2) {
        return m78640a(context, str, str2, false, (Map<String, String>) null);
    }

    /* renamed from: a */
    public static boolean m78640a(Context context, String str, String str2, boolean z, Map<String, String> map) {
        return m78641a(context, str, str2, z, map, true);
    }

    /* renamed from: a */
    public static boolean m78641a(Context context, String str, String str2, boolean z, Map<String, String> map, boolean z2) {
        return m78642a(context, str, str2, z, map, z2, null);
    }

    /* renamed from: a */
    public static boolean m78642a(Context context, String str, String str2, boolean z, Map<String, String> map, boolean z2, C38665a.C38666a aVar) {
        return C38665a.m78455a(context, str, str2, z, map, z2, aVar);
    }

    /* renamed from: a */
    public static boolean m78645a(C37977b.C37978a aVar) {
        if (!(aVar == null || aVar.f89731a == null || aVar.f89732b == null)) {
            C37699a.m76289d(aVar.f89738h);
            int i = aVar.f89734d;
            if (((i == 7 || i == 8) && m78646a(aVar, false)) || m78652b(aVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m78646a(C37977b.C37978a aVar, boolean z) {
        if (!(aVar == null || aVar.f89731a == null || aVar.f89732b == null)) {
            aVar.mo66204b(8);
            if (!(aVar.f89731a instanceof Activity) || !AdProfilePopUpWebPageWidget.m77793a(aVar.mo66203a(), z)) {
                return false;
            }
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(46298);
    }

    /* renamed from: a */
    public static void m78630a(AbstractC38758a aVar) {
        C1731i.m5631a(5000).mo5532a(new C38763s(aVar));
    }

    /* renamed from: a */
    static final /* synthetic */ Object m78626a(Aweme aweme) {
        try {
            C37638d.f88998a.f88999b = aweme.getAwemeRawAd();
            return null;
        } catch (Exception e) {
            C51423a.m95788a("", e);
            return null;
        }
    }

    /* renamed from: b */
    private static boolean m78652b(C37977b.C37978a aVar) {
        if (aVar == null || aVar.f89731a == null || aVar.f89732b == null || !(aVar.f89731a instanceof Activity) || !AdPopUpWebPageWidget.C39024b.m79196a(aVar.f89732b, aVar.f89735e)) {
            return false;
        }
        if (!AdPopUpWebPageWidget.f92172n.mo67716a(aVar.mo66203a())) {
            return false;
        }
        AbstractC81915c.m141874a(new C37830a(1));
        return true;
    }

    /* renamed from: b */
    private static boolean m78653b(Aweme aweme) {
        if (aweme == null) {
            return true;
        }
        if (!aweme.isAd() || !C50543k.m94758a(aweme.getAwemeRawAd())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m78654b(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("aweme://")) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static boolean m78659c(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("mailto:")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m78648b(Context context, Aweme aweme) {
        if (context != null && C37699a.m76313r(aweme)) {
            return m78651b(context, aweme.getAwemeRawAd().getWebUrl());
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m78631a(Context context, int i) {
        if (m78658c(context, PreRenderWebViewBusiness.C40581a.m81922a(i))) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m78651b(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            return m78632a(context, Intent.createChooser(intent, ""));
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m78658c(Context context, String str) {
        if (!(context instanceof Activity) || !C38805a.m78737a((Activity) context, str)) {
            return false;
        }
        AbstractC81915c.m141874a(new C37830a(1));
        return true;
    }

    /* renamed from: c */
    public static void m78655c(Context context, Aweme aweme) {
        if (!C37699a.m76309n(aweme).getSplashInfo().isEnableSplashOpen()) {
            C38665a.m78454a(context, aweme, null, null, m78653b(aweme), true, 7, true);
        } else if (!m78633a(context, aweme)) {
            IPluginService d = AabPluginServiceImpl.m114069d();
            if (d == null || !d.mo28890a("com.ss.android.ugc.aweme.miniapp") || !C59286a.m108996a(context, aweme)) {
                C38665a.m78454a(context, aweme, null, null, m78653b(aweme), true, 7, true);
            }
        }
    }

    /* renamed from: a */
    public static void m78629a(Context context, String str) {
        Integer e;
        if (context != null && str != null) {
            Uri parse = Uri.parse(str);
            Intent intent = new Intent(context, CrossPlatformActivity.class);
            intent.setData(Uri.parse(parse.getQueryParameter("url")));
            String queryParameter = parse.getQueryParameter("immersive_mode");
            String queryParameter2 = parse.getQueryParameter("enter_from");
            String queryParameter3 = parse.getQueryParameter("author_id");
            if (!(queryParameter == null || (e = C89361p.m154863e(queryParameter)) == null || e.intValue() != 1)) {
                intent.putExtra("use_ordinary_web", false);
            }
            if (queryParameter2 != null) {
                intent.putExtra("quick_shop_enter_from", queryParameter2);
            }
            if (queryParameter3 != null) {
                intent.putExtra("owner_id", queryParameter3);
            }
            intent.putExtra("web_type", 2);
            C38767w.m78632a(context, intent);
        }
    }

    /* renamed from: a */
    public static boolean m78632a(Context context, Intent intent) {
        if (!(context == null || intent == null)) {
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            try {
                C84349a.m145093a(intent, context);
                context.startActivity(intent);
                return true;
            } catch (ActivityNotFoundException | SecurityException unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m78633a(Context context, Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        return m78637a(context, aweme.getAwemeRawAd().getOpenUrl(), aweme);
    }

    /* renamed from: e */
    public static boolean m78661e(Context context, Aweme aweme, int i) {
        if (context == null || aweme == null) {
            return false;
        }
        return m78645a(new C37977b.C37978a().mo66199a(context).mo66201a(aweme.getAwemeRawAd()).mo66204b(i).mo66206c(aweme.getAid()));
    }

    /* renamed from: d */
    static boolean m78660d(Context context, Aweme aweme, int i) {
        IAdSceneService f = AdSceneServiceImpl.m33210f();
        if (f != null) {
            f.mo28466c().mo28511a(aweme, context, i);
        }
        if (i == 3 || i == 4 || i == 35 || i == 5 || i == 36 || i == 6) {
            if ((C37699a.m76242aN(aweme) && m78633a(context, aweme)) || C59286a.m108996a(context, aweme)) {
                return false;
            }
            if (m78661e(context, aweme, i) || m78631a(context, i)) {
                return true;
            }
            m78635a(context, aweme, (String) null, (String) null);
            return false;
        } else if (m78661e(context, aweme, i) || m78631a(context, i)) {
            return true;
        } else {
            AbstractC81915c.m141874a(new C37836e(aweme, i));
            return true;
        }
    }

    /* renamed from: f */
    static boolean m78662f(Context context, Aweme aweme, int i) {
        IAdSceneService f = AdSceneServiceImpl.m33210f();
        if (f != null) {
            f.mo28466c().mo28511a(aweme, context, i);
        }
        if (aweme != null && aweme.isAd() && !m78637a(context, aweme.getAwemeRawAd().getRedOpenUrl(), aweme)) {
            if (!(context == null || aweme.getAwemeRawAd() == null)) {
                String redMpUrl = aweme.getAwemeRawAd().getRedMpUrl();
                if (C59308d.m109008c(redMpUrl)) {
                    C59315a.C59316a aVar = new C59315a.C59316a();
                    aVar.f135537c = "025002";
                    aVar.f135538d = "red_mp_url";
                    C59320c.C59324a.f135560a.mo96989a().openMiniApp(context, redMpUrl, aVar.mo96936a());
                }
            }
            m78636a(context, aweme, aweme.getAwemeRawAd().getRedUrl(), (String) null, C50543k.m94758a(aweme.getAwemeRawAd()));
        }
        return false;
    }

    /* renamed from: a */
    public static void m78628a(Context context, Aweme aweme, String str) {
        if (aweme != null) {
            new C17197a.C17200a(context).mo27194b(R.string.o_).mo27190a(R.string.as0, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC38765u(context, aweme, str), false).mo27195b(R.string.a8y, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC38766v(context, aweme), false).mo27193a().mo27184b();
            C38189j.m77536k(context, aweme);
            C18129a.m33746a("draw_ad", "open_url_window_show", aweme.getAwemeRawAd()).mo28902c();
        }
    }

    /* renamed from: c */
    static boolean m78656c(Context context, Aweme aweme, int i) {
        boolean z;
        IAdSceneService f = AdSceneServiceImpl.m33210f();
        if (f == null || !f.mo28466c().mo28511a(aweme, context, i)) {
            z = false;
        } else {
            z = true;
        }
        if ((i == 2 || i == 6 || i == 3 || i == 8 || i == 45) && C37699a.m76227a(C37699a.m76272ar(aweme))) {
            AbstractC81915c.m141874a(new C37835d(aweme, i));
            if (i == 6) {
                return true;
            }
            return false;
        } else if (z && !C37699a.m76242aN(aweme) && !C37699a.m76203F(aweme)) {
            C38673e.m78468a(context, null);
            return true;
        } else if (m78633a(context, aweme) || C59286a.m108996a(context, aweme)) {
            return false;
        } else {
            m78635a(context, aweme, (String) null, (String) null);
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m78649b(Context context, Aweme aweme, int i) {
        boolean z;
        boolean z2;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        IAdSceneService f = AdSceneServiceImpl.m33210f();
        if (m78648b(context, aweme)) {
            if (f != null) {
                f.mo28466c().mo28511a(aweme, context, i);
            }
            return true;
        } else if (C37699a.m76280az(aweme) && i == 8) {
            SmartRouter.buildRoute(context, C35301c.m72250b(aweme.getAwemeRawAd().getOpenUrl(), "fullScreen") + "&fullScreen=false&player_control=0&collapsible=0&expandHeight=0.9").open();
            return true;
        } else if (C38767w.m78673e(context, aweme)) {
            if (f != null) {
                f.mo28466c().mo28511a(aweme, context, i);
            }
            return true;
        } else if (!C37699a.m76314s(aweme) || TextUtils.isEmpty(aweme.getAwemeRawAd().getAuthorUrl()) || !(i == 35 || i == 36)) {
            C18147f fVar = null;
            if (f == null || !f.mo28466c().mo28511a(aweme, context, i) || C37699a.m76242aN(aweme) || C37699a.m76203F(aweme) || C58067a.f132302a.mo95569a(aweme)) {
                if (i != 2 || !C38515b.m78095a()) {
                    if (!(context == null || aweme == null || !aweme.isAd())) {
                        AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                        if (awemeRawAd3 == null) {
                            C89219l.m154715b();
                        }
                        C89219l.m154716b(awemeRawAd3, "");
                        String openUrl = awemeRawAd3.getOpenUrl();
                        if (C38024a.m77085a(openUrl)) {
                            String b = C38024a.m77086b(openUrl);
                            AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
                            if (awemeRawAd4 == null) {
                                C89219l.m154715b();
                            }
                            C89219l.m154716b(awemeRawAd4, "");
                            String logExtra = awemeRawAd4.getLogExtra();
                            AwemeRawAd awemeRawAd5 = aweme.getAwemeRawAd();
                            if (awemeRawAd5 == null) {
                                C89219l.m154715b();
                            }
                            C89219l.m154716b(awemeRawAd5, "");
                            C38671d.HandlerC38672a aVar = new C38671d.HandlerC38672a(aweme, context, new C56252e(logExtra, String.valueOf(awemeRawAd5.getCreativeId().longValue())), Looper.getMainLooper());
                            C63431e.m115024a();
                            C63431e.m115025a(aVar, b);
                            return false;
                        }
                    }
                    if (i == 53 || i == 54) {
                        if (aweme != null && aweme.isAd() && m78638a(context, aweme.getAwemeRawAd().getOpenUrl(), aweme, false, i)) {
                            return false;
                        }
                    } else if (m78633a(context, aweme)) {
                        return false;
                    }
                    if (C59286a.m108996a(context, aweme)) {
                        return false;
                    }
                    if (m78661e(context, aweme, i) || m78631a(context, i)) {
                        return true;
                    }
                    if (i == 53) {
                        if (aweme == null || (aweme.isAd() && C50543k.m94758a(aweme.getAwemeRawAd()))) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C38665a.m78454a(context, aweme, null, null, z, true, 5, false);
                    } else if (i == 54) {
                        if (aweme == null || (aweme.isAd() && C50543k.m94758a(aweme.getAwemeRawAd()))) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        C38665a.m78454a(context, aweme, null, null, z2, true, 8, false);
                    } else {
                        m78635a(context, aweme, (String) null, (String) null);
                    }
                    return false;
                }
                AwemeRawAd awemeRawAd6 = aweme.getAwemeRawAd();
                C38517d dVar = C38517d.f91023a;
                String openUrl2 = awemeRawAd6.getOpenUrl();
                String webUrl = awemeRawAd6.getWebUrl();
                String webTitle = awemeRawAd6.getWebTitle();
                if (!(context == null || aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null)) {
                    C89219l.m154716b(awemeRawAd, "");
                    boolean a = C50543k.m94758a(awemeRawAd);
                    AbstractC18146e a2 = C38517d.m78105a(context, awemeRawAd);
                    Bundle bundle = new Bundle();
                    AwemeRawAd awemeRawAd7 = aweme.getAwemeRawAd();
                    if (awemeRawAd7 != null) {
                        C89219l.m154716b(awemeRawAd7, "");
                        bundle.putString("aweme_id", aweme.getAid());
                        bundle.putString("open_url", awemeRawAd7.getOpenUrl());
                        bundle.putString("log_extra", awemeRawAd7.getLogExtra());
                        bundle.putString("creative_id", String.valueOf(awemeRawAd7.getCreativeId().longValue()));
                    }
                    fVar = a2.mo28931a(8, bundle).mo28931a(0, C38517d.m78101a(openUrl2)).mo28931a(1, C38517d.m78102a(openUrl2, aweme)).mo28931a(5, C38517d.m78104a(webUrl, webTitle, aweme, i)).mo28931a(6, C38517d.m78100a(aweme, i)).mo28931a(4, C38517d.m78107b(webUrl, aweme)).mo28931a(3, C38517d.m78099a(dVar, context, webUrl, webTitle, aweme, a)).mo28931a(2, C38517d.m78098a(context, webUrl, webTitle, aweme, a, null, 0, null, 224)).mo28932c();
                }
                int i2 = fVar.f43209b;
                if (i2 == 5 || i2 == 6) {
                    return true;
                }
                return false;
            } else if (i == 2 && C38515b.m78095a()) {
                AwemeRawAd awemeRawAd8 = aweme.getAwemeRawAd();
                String webUrl2 = awemeRawAd8.getWebUrl();
                String webTitle2 = awemeRawAd8.getWebTitle();
                if (!(context == null || aweme == null || (awemeRawAd2 = aweme.getAwemeRawAd()) == null)) {
                    C89219l.m154716b(awemeRawAd2, "");
                    fVar = C38517d.m78105a(context, awemeRawAd2).mo28931a(5, C38517d.m78104a(webUrl2, webTitle2, aweme, i)).mo28931a(6, C38517d.m78100a(aweme, i)).mo28931a(7, null).mo28932c();
                }
                return fVar.f43208a;
            } else if (m78661e(context, aweme, i) || m78631a(context, i)) {
                return true;
            } else {
                C49625h.m93072a().f114197i = i;
                C38673e.m78468a(context, null);
                return true;
            }
        } else {
            C38673e.m78468a(context, "click_title");
            return true;
        }
    }

    /* renamed from: a */
    static boolean m78634a(Context context, Aweme aweme, int i) {
        if (!aweme.isAd()) {
            return false;
        }
        IAdSceneService f = AdSceneServiceImpl.m33210f();
        if (f != null) {
            f.mo28466c().mo28511a(aweme, context, i);
        }
        if (m78636a(context, aweme, aweme.getAwemeRawAd().getConsultUrl(), aweme.getAwemeRawAd().getWebTitle(), true)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m78627a(Context context, C38214ac acVar, Aweme aweme, boolean z) {
        if (context != null && acVar != null) {
            if (m78647a(acVar.openUrl) && aweme.getAwemeRawAd() != null) {
                acVar.openUrl = Uri.parse(acVar.openUrl).buildUpon().appendQueryParameter("creative_id", aweme.getAwemeRawAd().getCreativeIdStr()).appendQueryParameter("log_extra", aweme.getAwemeRawAd().getLogExtra()).build().toString();
            }
            C38606a.m78340a(context, acVar, aweme, z);
        }
    }

    /* renamed from: a */
    private static boolean m78636a(Context context, Aweme aweme, String str, String str2, boolean z) {
        return m78650b(context, aweme, str, str2, z);
    }

    /* renamed from: b */
    private static boolean m78650b(Context context, Aweme aweme, String str, String str2, boolean z) {
        return m78657c(context, aweme, str, str2, z);
    }

    /* renamed from: c */
    private static boolean m78657c(Context context, Aweme aweme, String str, String str2, boolean z) {
        return C38665a.m78454a(context, aweme, str, str2, z, true, 1, false);
    }
}
