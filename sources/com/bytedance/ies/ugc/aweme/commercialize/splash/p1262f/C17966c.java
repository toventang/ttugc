package com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.C17957a;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.google.gson.C28022o;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.bullet.C34963b;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38220ag;
import com.p2082ss.android.ugc.aweme.commercialize.p2539d.AbstractC37639a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.landpage.AdLandPageServiceImpl;
import com.p2082ss.android.ugc.aweme.landpage.IAdLandPageService;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80534hh;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import p077b.C1731i;

/* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.f.c */
public final class C17966c {

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.f.c$a */
    public interface AbstractC17967a {
        static {
            Covode.recordClassIndex(20585);
        }

        /* renamed from: a */
        void mo28729a(boolean z);
    }

    static {
        Covode.recordClassIndex(20584);
    }

    /* renamed from: a */
    private static String m33442a() {
        return "snssdk" + C17867d.f42590n;
    }

    /* renamed from: a */
    private static Bundle m33440a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m33443a(AbstractC17967a aVar) {
        C1731i.m5631a(5000).mo5532a(new C17969e(aVar));
    }

    /* renamed from: a */
    private static Boolean m33441a(String str) {
        boolean z = false;
        if (C13627m.m24498a(str)) {
            return false;
        }
        if (TextUtils.equals("sslocal", str)) {
            return true;
        }
        String a = m33442a();
        if (!C13627m.m24498a(a) && TextUtils.equals(a, str)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: a */
    public static boolean m33444a(Context context, String str, Long l, String str2, AbstractC17973g gVar) {
        boolean z;
        String str3;
        int lastIndexOf;
        C17957a.m33426a().mo28623a(context, "splash");
        String scheme = Uri.parse(str).getScheme();
        if ("sslocal".equalsIgnoreCase(scheme) || "localsdk".equalsIgnoreCase(scheme)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C18129a.m33747a("splash_ad", "open_url_app", String.valueOf(l), str2, "0").mo28901b();
            C17957a.m33426a().mo28628b("splash_ad");
        }
        if (str.contains("__back_url__")) {
            str3 = str.replace("__back_url__", Uri.encode(AbstractC37639a.AbstractC37640a.f89002a));
        } else {
            str3 = str;
        }
        C29844g gVar2 = new C29844g(str3);
        if (m33441a(str).booleanValue()) {
            gVar2.mo52130a("url", str);
        }
        if (str.startsWith("sslocal://user/profile/")) {
            gVar2.mo52130a("enter_from", "open_screen_ad");
        }
        String host = Uri.parse(str).getHost();
        if (TextUtils.equals(host, "challenge")) {
            gVar2.mo52130a("enter_from", "splash");
        }
        if (TextUtils.equals(host, "stickers") && (lastIndexOf = str.lastIndexOf("/") + 1) < str.length()) {
            C39162r.m79460a("enter_prop_detail", new C33744d().mo59983a("enter_from", "splash_ad").mo59983a("prop_id", str.substring(lastIndexOf)).f79943a);
        }
        gVar.mo28730a(context, gVar2.mo52126a());
        if (z) {
            m33443a(new C17968d(l, str2));
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m33445a(Context context, String str, String str2, Long l, String str3, C38220ag agVar, String str4, String str5) {
        String str6;
        C18129a.m33747a("splash_ad", "open_url_h5", String.valueOf(l), str3, "0").mo28901b();
        C17957a.m33426a().mo28628b("splash_ad");
        Intent b = C17957a.m33426a().mo28625b(context);
        b.setData(Uri.parse(str));
        b.setFlags(268435456);
        if (TextUtils.isEmpty(str2)) {
            b.putExtra("title", " ");
        } else {
            b.putExtra("title", str2);
        }
        b.putExtra("bundle_forbidden_jump", true);
        b.putExtra("ad_id", l);
        b.putExtra("bundle_download_app_log_extra", str3);
        b.putExtra("bundle_webview_background", C0643b.m2378c(context, R.color.a9));
        b.putExtra("commerce_enter_from", "splash");
        b.putExtra("enter_from", "splash");
        IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
        if (f != null) {
            String a = f.mo59377a(l);
            if (!TextUtils.isEmpty(a)) {
                b.putExtra("preload_channel_name", a);
                b.putExtra("preload_scene", "splash");
                b.putExtra("preload_web_status", 4);
                b.putExtra("preload_is_web_url", 1);
            }
        }
        Bundle a2 = m33440a(b);
        if (!(a2 == null || agVar == null)) {
            String lynxScheme = agVar.getLynxScheme();
            if (!C13627m.m24498a(lynxScheme) && lynxScheme.startsWith("aweme://lynxview")) {
                a2.putBoolean("is_lynx_landing_page", true);
                a2.putBoolean("hide_nav_bar", true);
                a2.putBoolean("hide_status_bar", false);
                a2.putBoolean("bundle_nav_bar_status_padding", true);
                a2.putBoolean("need_bottom_out", true);
                if (agVar.getLynxLandingStyle() == 1) {
                    a2.putInt("bundle_webview_background", 0);
                }
                if (agVar.getGeckoChannel() != null && !agVar.getGeckoChannel().isEmpty()) {
                    a2.putString("lynx_channel_name", agVar.getGeckoChannel().get(0));
                }
                a2.putString("bundle_native_site_custom_data", str5);
                String str7 = "";
                if (agVar.getSecondPageGeckoChannel() != null && !agVar.getSecondPageGeckoChannel().isEmpty()) {
                    IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.m68380f();
                    if (f2 != null) {
                        str6 = f2.mo59382b(l);
                        f2.mo59376a().mo59416b(agVar.getSecondPageGeckoChannel());
                    } else {
                        str6 = str7;
                    }
                    a2.putString("second_page_preload_channel_prefix", str6);
                }
                a2.putInt("preset_width", View.MeasureSpec.makeMeasureSpec(C13628n.m24504a(context), 1073741824));
                a2.putInt("preset_height", View.MeasureSpec.makeMeasureSpec(C13628n.m24521b(context) - C80534hh.m139609b(), 1073741824));
                Uri parse = Uri.parse(agVar.getLynxScheme());
                if (parse.isHierarchical()) {
                    a2.putString("bundle_origin_url", parse.getQueryParameter("fallback_url"));
                    if (TextUtils.equals(parse.getQueryParameter("async_layout"), "1")) {
                        a2.putBoolean("preset_safe_point", true);
                        a2.putInt("thread_strategy", 1);
                    }
                }
                Uri.Builder buildUpon = parse.buildUpon();
                C28022o oVar = new C28022o();
                oVar.mo46800a("creativeId", l);
                oVar.mo46801a("logExtra", str3);
                oVar.mo46801a("pageData", str4);
                oVar.mo46800a("isRTL", Integer.valueOf(C80471gb.m139483a(context) ? 1 : 0));
                oVar.mo46800a("topSafeAreaHeight", Integer.valueOf(C80534hh.m139609b()));
                buildUpon.appendQueryParameter("lynx_landing_page_data", oVar.toString());
                buildUpon.appendQueryParameter("lynx_landing_page_title", str2);
                String builder = buildUpon.toString();
                IAdLandPageService b2 = AdLandPageServiceImpl.m104886b();
                if (b2 != null) {
                    str7 = b2.mo95564a();
                }
                C34963b.m71413a(context, builder, str7, a2);
                return true;
            }
        }
        try {
            C84349a.m145093a(b, context);
            context.startActivity(b);
            return true;
        } catch (Exception e) {
            C51423a.m95791b(3, null, "openSplashScheme: url = " + str + " e = " + e.toString());
            C51423a.m95790a((Throwable) e);
            return false;
        }
    }
}
