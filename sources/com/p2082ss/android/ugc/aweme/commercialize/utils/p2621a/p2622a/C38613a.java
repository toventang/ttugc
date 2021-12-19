package com.p2082ss.android.ugc.aweme.commercialize.utils.p2621a.p2622a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.google.gson.C28022o;
import com.p2082ss.android.newmedia.C30128d;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.bullet.C34963b;
import com.p2082ss.android.ugc.aweme.bullet.p2410ab.C34961c;
import com.p2082ss.android.ugc.aweme.commercialize.feed.p2565c.C37892a;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.p2619a.AbstractC38555a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38659ay;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80534hh;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.a.a */
public class C38613a extends AbstractC38555a {

    /* renamed from: g */
    public static final C38614a f91242g = new C38614a((byte) 0);

    static {
        Covode.recordClassIndex(46154);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.a.a$a */
    public static final class C38614a {
        static {
            Covode.recordClassIndex(46155);
        }

        private C38614a() {
        }

        public /* synthetic */ C38614a(byte b) {
            this();
        }
    }

    /* renamed from: e */
    private final String m78349e() {
        return mo67076d().f91094b.f91133a;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.AbstractC38578e
    /* renamed from: a */
    public final boolean mo65690a() {
        if (m78349e().length() == 0) {
            return false;
        }
        if (!C30128d.m60946a(m78349e())) {
            String e = m78349e();
            if (!TextUtils.isEmpty(e)) {
                Objects.requireNonNull(e, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = e.toLowerCase();
                C89219l.m154716b(lowerCase, "");
                if (C89361p.m154874b(lowerCase, "aweme://lynxview", false)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.AbstractC38578e
    /* renamed from: b */
    public final boolean mo65691b() {
        boolean z;
        String str;
        String str2;
        boolean z2;
        if (C34961c.f82469a) {
            String.valueOf(mo67076d().f91093a.f91102c);
            C89219l.m154721d("ad_lynx_download_WebUrlHandler_doHandle", "");
        }
        Intent intent = new Intent(mo67075c(), CrossPlatformActivity.class);
        Uri parse = Uri.parse(m78349e());
        if (!mo67076d().f91094b.f91136d.isEmpty()) {
            Uri.Builder buildUpon = Uri.parse(m78349e()).buildUpon();
            for (Map.Entry<String, String> entry : mo67076d().f91094b.f91136d.entrySet()) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
            }
            parse = buildUpon.build();
        }
        intent.setData(parse);
        if (!TextUtils.equals(parse.getQueryParameter("launch_mode"), "standard")) {
            intent.addFlags(268435456);
        }
        if (mo67076d().f91094b.f91134b.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            intent.putExtra("title", mo67076d().f91094b.f91134b);
        } else {
            intent.putExtra("title", " ");
            intent.putExtra("use_webview_title", true);
        }
        intent.putExtra("show_report", mo67076d().f91094b.f91138f);
        intent.putExtra("bundle_app_ad_from", mo67076d().f91094b.f91147o);
        if (mo67076d().f91093a.f91102c != 0) {
            intent.putExtra("ad_id", mo67076d().f91093a.f91102c);
            intent.putExtra("aweme_creative_id", String.valueOf(mo67076d().f91093a.f91102c));
            m78348a(intent, "ad_type", mo67076d().f91093a.f91105f);
            intent.putExtra("ad_system_origin", mo67076d().f91093a.f91106g);
            m78348a(intent, "bundle_download_app_log_extra", mo67076d().f91093a.f91103d);
            intent.putExtra("landing_page_info", mo67076d().f91094b.f91152t);
            if (mo67076d().f91094b.f91153u == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            intent.putExtra("need_bottom_out", z2);
        }
        SharePrefCache inst = SharePrefCache.inst();
        C89219l.m154716b(inst, "");
        C33594aj<String> jsActlogUrl = inst.getJsActlogUrl();
        C89219l.m154716b(jsActlogUrl, "");
        String c = jsActlogUrl.mo59941c();
        if (c != null && c.length() > 0) {
            intent.putExtra("ad_js_url", c);
        }
        intent.putExtra("bundle_disable_download_dialog", mo67076d().f91098f.f91112d);
        if (mo67076d().f91098f.f91109a.length() > 0) {
            intent.putExtra("bundle_download_url", mo67076d().f91098f.f91109a);
            m78348a(intent, "aweme_package_name", mo67076d().f91098f.f91110b);
            intent.putExtra("bundle_is_from_app_ad", mo67076d().f91098f.f91113e);
            m78348a(intent, "bundle_ad_quick_app_url", mo67076d().f91098f.f91111c);
            intent.putExtra("bundle_download_app_name", mo67076d().f91098f.f91114f);
            intent.putExtra("bundle_download_mode", mo67076d().f91098f.f91115g);
            intent.putExtra("bundle_link_mode", mo67076d().f91098f.f91116h);
            intent.putExtra("bundle_support_multiple_download", mo67076d().f91098f.f91117i);
            intent.putExtra("bundle_web_url", mo67076d().f91098f.f91118j);
            intent.putExtra("bundle_web_title", mo67076d().f91098f.f91119k);
            intent.putExtra("bundle_open_url", mo67076d().f91098f.f91120l);
        }
        String jSONObject = C38189j.m77470a(mo67075c(), mo67076d().f91093a.f91100a, false, (Map<String, String>) null).toString();
        if (jSONObject == null) {
            jSONObject = "";
        }
        intent.putExtra("aweme_json_extra", jSONObject);
        Long valueOf = Long.valueOf(mo67076d().f91093a.f91104e);
        if (valueOf.longValue() > 0 && valueOf != null) {
            intent.putExtra("group_id", valueOf.longValue());
        }
        Integer num = mo67076d().f91094b.f91139g;
        if (num != null) {
            intent.putExtra("bundle_webview_background", num.intValue());
        }
        intent.putExtra("aweme_id", mo67076d().f91093a.f91107h);
        intent.putExtra("owner_id", mo67076d().f91093a.f91108i);
        intent.putExtra("bundle_forbidden_jump", mo67076d().f91094b.f91140h);
        intent.putExtra("use_ordinary_web", mo67076d().f91094b.f91137e);
        intent.putExtra("preload_channel_name", mo67076d().f91094b.f91144l);
        intent.putExtra("preload_scene", "feed");
        intent.putExtra("preload_web_status", mo67076d().f91094b.f91142j);
        intent.putExtra("preload_web_status_new", mo67076d().f91094b.f91143k);
        intent.putExtra("preload_is_web_url", mo67076d().f91094b.f91145m);
        intent.putExtra("web_type", mo67076d().f91094b.f91146n);
        intent.putExtra("user_click_time", mo67076d().f91094b.f91148p);
        intent.putExtra("is_from_lynx_land_page", mo67076d().f91094b.f91149q);
        intent.putExtra("second_page_preload_channel_name", mo67076d().f91094b.f91150r);
        C38659ay.f91340a = mo67076d().f91093a.f91100a;
        if (C34961c.f82469a) {
            String.valueOf(mo67076d().f91093a.f91102c);
            C89219l.m154721d("ad_lynx_download_WebUrlHandler_doHandle", "");
        }
        Context c2 = mo67075c();
        Bundle a = m78347a(intent);
        if (!C89361p.m154874b(m78349e(), "aweme://lynxview", false)) {
            return m78188a(mo67075c(), intent);
        }
        if (a == null) {
            a = new Bundle();
        }
        a.putBoolean("is_lynx_landing_page", true);
        a.putBoolean("hide_nav_bar", true);
        a.putBoolean("hide_status_bar", false);
        a.putBoolean("bundle_nav_bar_status_padding", true);
        a.putBoolean("need_bottom_out", true);
        if (mo67076d().f91094b.f91132C == 1) {
            if (!TextUtils.isEmpty(mo67076d().f91094b.f91155w)) {
                a.putString("bundle_full_screen_bg_image", mo67076d().f91094b.f91155w);
            }
            a.putInt("bundle_webview_background", 0);
        }
        a.putString("lynx_channel_name", mo67076d().f91094b.f91156x);
        a.putString("bundle_native_site_custom_data", mo67076d().f91094b.f91157y);
        List<String> list = mo67076d().f91094b.f91131B;
        if (list != null && !list.isEmpty()) {
            IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
            if (f == null || (str2 = f.mo59382b(Long.valueOf(mo67076d().f91093a.f91101b))) == null) {
                str2 = "";
            }
            a.putString("second_page_preload_channel_prefix", str2);
            f.mo59376a().mo59416b(mo67076d().f91094b.f91131B);
        }
        a.putInt("preset_width", View.MeasureSpec.makeMeasureSpec(C13628n.m24504a(c2), 1073741824));
        a.putInt("preset_height", View.MeasureSpec.makeMeasureSpec(C13628n.m24521b(c2) - C80534hh.m139609b(), 1073741824));
        Uri parse2 = Uri.parse(m78349e());
        C89219l.m154716b(parse2, "");
        if (parse2.isHierarchical()) {
            a.putString("bundle_origin_url", parse2.getQueryParameter("fallback_url"));
            if (TextUtils.equals(parse2.getQueryParameter("async_layout"), "1")) {
                a.putBoolean("preset_safe_point", true);
                a.putInt("thread_strategy", 2);
            }
        }
        Uri.Builder buildUpon2 = parse2.buildUpon();
        C28022o oVar = new C28022o();
        C37892a aVar = mo67076d().f91094b.f91141i;
        if (aVar == null || (str = aVar.getSiteId()) == null) {
            str = "";
        }
        oVar.mo46801a("siteId", str);
        oVar.mo46801a("adId", String.valueOf(mo67076d().f91093a.f91101b));
        oVar.mo46801a("creativeId", String.valueOf(mo67076d().f91093a.f91102c));
        oVar.mo46801a("logExtra", mo67076d().f91093a.f91103d);
        oVar.mo46801a("groupId", String.valueOf(mo67076d().f91093a.f91104e));
        oVar.mo46801a("webUrl", m78349e());
        oVar.mo46801a("pageData", mo67076d().f91094b.f91158z);
        oVar.mo46801a("appData", mo67076d().f91094b.f91130A);
        oVar.mo46800a("isRTL", Integer.valueOf(C80471gb.m139483a(mo67075c()) ? 1 : 0));
        oVar.mo46800a("topSafeAreaHeight", Integer.valueOf(C80534hh.m139609b()));
        String oVar2 = oVar.toString();
        C89219l.m154716b(oVar2, "");
        buildUpon2.appendQueryParameter("lynx_landing_page_data", oVar2);
        buildUpon2.appendQueryParameter("lynx_landing_page_title", mo67076d().f91094b.f91134b);
        String builder = buildUpon2.toString();
        C89219l.m154716b(builder, "");
        C34963b.m71413a(c2, builder, "ad_commerce", a);
        return true;
    }

    /* renamed from: a */
    private static Bundle m78347a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m78348a(Intent intent, String str, String str2) {
        if (str2 != null && str2.length() > 0) {
            intent.putExtra(str, str2);
        }
    }
}
