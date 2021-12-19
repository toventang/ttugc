package com.p2082ss.android.ugc.aweme.crossplatform.p2710d.p2711a;

import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.crossplatform.p2706a.C40520b;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.C40617a;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.C40628b;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.C40629c;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.C40632e;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.C40633f;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.C40634g;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.EnumC40630d;
import com.p2082ss.android.ugc.tiktok.seclink.ISecLinkService;
import com.p2082ss.android.ugc.tiktok.seclink.impl.SecLinkServiceImpl;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.d.a.b */
final class C40620b extends C40618a {
    static {
        Covode.recordClassIndex(48460);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.crossplatform.d.a.b$a */
    public static final class C40621a {

        /* renamed from: a */
        public C40617a f95074a;

        /* renamed from: b */
        public C40632e f95075b;

        /* renamed from: c */
        public C40633f f95076c;

        /* renamed from: d */
        public C40634g f95077d;

        /* renamed from: e */
        public C40628b f95078e;

        /* renamed from: f */
        public C40629c f95079f;

        static {
            Covode.recordClassIndex(48461);
        }

        C40621a() {
        }

        /* renamed from: a */
        public final C40618a mo69773a() {
            C40618a aVar = new C40618a();
            aVar.f95068a = this.f95074a;
            aVar.f95070c = this.f95075b;
            aVar.f95071d = this.f95076c;
            aVar.f95072e = this.f95077d;
            aVar.f95069b = this.f95078e;
            aVar.f95073f = this.f95079f;
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.d.a.b$b */
    public static final class C40622b {
        static {
            Covode.recordClassIndex(48462);
        }

        /* renamed from: a */
        public static C40618a m81989a(Bundle bundle) {
            C40621a aVar = new C40621a();
            aVar.f95074a = m81993b(bundle);
            if (aVar.f95074a.f95052a.intValue() == 2) {
                aVar.f95075b = m81996c(bundle);
            }
            aVar.f95078e = m81994b(bundle, aVar.f95074a);
            aVar.f95079f = m81998d(bundle);
            aVar.f95076c = m81997c(bundle, aVar.f95074a);
            aVar.f95077d = m81990a(bundle, aVar.f95074a);
            return aVar.mo69773a();
        }

        /* renamed from: d */
        private static C40629c m81998d(Bundle bundle) {
            C40629c cVar = new C40629c((char) 0);
            cVar.f95134c = bundle.getString("bundle_item_id_from_aweme");
            cVar.f95133b = bundle.getString("bundle_ad_id_from_aweme");
            cVar.f95132a = bundle.getString("bundle_creative_id_from_aweme");
            cVar.f95135d = bundle.getString("bundle_advertiser_id_from_aweme");
            cVar.f95138g = bundle.getString("bundle_cover_url_from_aweme");
            cVar.f95136e = bundle.getString("bundle_desc_from_aweme");
            cVar.f95137f = bundle.getLong("bundle_view_time_from_aweme");
            return cVar;
        }

        /* renamed from: b */
        private static C40617a m81993b(Bundle bundle) {
            int i;
            String trim;
            boolean z;
            C40617a aVar = new C40617a((byte) 0);
            if (!TextUtils.isEmpty(bundle.getString("rn_schema"))) {
                i = 2;
            } else {
                i = 1;
            }
            aVar.f95052a = Integer.valueOf(i);
            aVar.f95053b = bundle;
            String a = m81991a(m81995b(bundle.getString("url"), bundle), bundle);
            if (TextUtils.isEmpty(a)) {
                trim = "";
            } else {
                trim = a.trim();
            }
            aVar.f95054c = trim;
            Uri parse = Uri.parse(aVar.f95054c);
            aVar.f95055d = bundle.getBoolean("safeTemplate", false);
            if (aVar.f95055d && parse.isHierarchical()) {
                String decode = Uri.decode(parse.getQueryParameter("target"));
                if (!TextUtils.isEmpty(decode)) {
                    Uri.Builder buildUpon = parse.buildUpon();
                    Uri parse2 = Uri.parse(decode);
                    Set<String> queryParameterNames = parse2.getQueryParameterNames();
                    if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
                        for (String str : queryParameterNames) {
                            if (!"target".equals(str)) {
                                buildUpon.appendQueryParameter(str, parse2.getQueryParameter(str));
                            }
                        }
                    }
                    aVar.f95054c = buildUpon.build().toString();
                }
            }
            if (parse.isHierarchical()) {
                z = C40520b.m81734a(parse.getQueryParameter("auto_play_bgm"));
            } else {
                z = false;
            }
            aVar.f95058g = bundle.getBoolean("bundle_auto_play_audio", z);
            aVar.f95056e = C40520b.m81727a(C40520b.m81736b(aVar.f95054c), bundle, "group_id");
            aVar.f95057f = bundle.getString("enter_from");
            aVar.f95060i = bundle.getBoolean("from_notification", false);
            aVar.f95061j = bundle.getString("aweme_id", "");
            aVar.f95062k = bundle.getBoolean("control_request_url", false);
            if (parse.isHierarchical()) {
                aVar.f95063l = C40520b.m81734a(parse.getQueryParameter("no_hw"));
            }
            if (!aVar.f95063l) {
                aVar.f95063l = false;
            }
            aVar.mo69769a(bundle.getString("owner_id", ""));
            aVar.f95065n = C40520b.m81734a(parse.getQueryParameter("hide_system_video_poster"));
            aVar.f95066o = C40520b.m81727a(parse, bundle, "report_type");
            aVar.f95067p = ((Integer) C40520b.m81722a(parse, "page_depth_of_report_show", bundle, "page_depth_of_report_show", Integer.class, 0)).intValue();
            return aVar;
        }

        /* renamed from: c */
        private static C40632e m81996c(Bundle bundle) {
            String str;
            C40632e eVar = new C40632e();
            eVar.f95141a = bundle.getString("channel_name");
            eVar.f95143c = bundle.getString("bundle_name");
            eVar.f95145e = bundle.getString("module_name");
            String string = bundle.getString("force_h5");
            if (string == null) {
                string = "0";
            }
            eVar.f95146f = string;
            eVar.f95147g = bundle.getString("fallback_url");
            eVar.f95148h = bundle.getString("dev");
            String string2 = PreferenceManager.getDefaultSharedPreferences(C17867d.m33078a()).getString("rn_setting_bundle_url", "");
            if (string2 == null || string2.isEmpty()) {
                string2 = bundle.getString("rn_bundle_url");
            }
            eVar.f95149i = string2;
            eVar.f95150j = bundle.getString("rn_schema");
            String string3 = bundle.getString("dynamic");
            eVar.f95151k = TextUtils.equals(string3, "1");
            try {
                EnumC40630d parse = EnumC40630d.parse(Integer.parseInt(string3));
                C89219l.m154721d(parse, "");
                eVar.f95152l = parse;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            eVar.f95144d = bundle.getString("bundle");
            eVar.f95142b = bundle.getString("channel");
            eVar.f95154n = TextUtils.equals(bundle.getString("need_share_bridge"), "1");
            eVar.f95155o = bundle.getString("hybrid_report_source");
            String string4 = bundle.getString("a_surl");
            if (!TextUtils.isEmpty(string4)) {
                eVar.f95153m = string4;
            } else {
                Map map = (Map) ((C40624d) C40624d.f95082b.getValue()).f95084a.getValue();
                if (!TextUtils.isEmpty(eVar.f95142b)) {
                    str = eVar.f95142b;
                    if (str == null) {
                        C89219l.m154715b();
                    }
                } else {
                    str = eVar.f95141a;
                    if (!TextUtils.isEmpty(str)) {
                        if (str == null) {
                            C89219l.m154715b();
                        }
                        if (!C89361p.m154876c(str, "_android", false)) {
                            str = str + "_android";
                        }
                    }
                }
                if (map != null && !TextUtils.isEmpty(str) && map.containsKey(str)) {
                    eVar.f95153m = (String) map.get(str);
                }
            }
            return eVar;
        }

        /* renamed from: b */
        private static String m81995b(String str, Bundle bundle) {
            if (str == null) {
                return null;
            }
            if (Uri.parse(str) == null) {
                return str;
            }
            boolean z = bundle.getBoolean("need_sec_link", false);
            String string = bundle.getString("sec_link_scene");
            ISecLinkService b = SecLinkServiceImpl.m145081b();
            if (!b.mo129346a() || !z || TextUtils.isEmpty(string)) {
                return str;
            }
            return b.mo129345a(str, string);
        }

        /* renamed from: a */
        private static C40634g m81990a(Bundle bundle, C40617a aVar) {
            Uri parse;
            C40634g gVar = new C40634g();
            gVar.f95194a = bundle.getString("load_no_cache");
            gVar.f95196c = bundle.getString("resso_key");
            gVar.f95198e = bundle.getBoolean("need_sec_link", false);
            gVar.f95199f = bundle.getBoolean("need_detect_2_jump", false);
            gVar.f95197d = bundle.getString("sec_link_scene");
            String str = aVar.f95054c;
            if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && !parse.isOpaque() && TextUtils.equals(parse.getQueryParameter("is_view_only"), "1")) {
                gVar.f95195b = true;
            }
            return gVar;
        }

        /* renamed from: a */
        private static String m81991a(String str, Bundle bundle) {
            boolean z;
            if (str == null) {
                return null;
            }
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return str;
            }
            if (!parse.isHierarchical() || (!TextUtils.equals("1", parse.getQueryParameter("append_common_params")) && !TextUtils.equals("1", bundle.getString("add_common")))) {
                z = false;
            } else {
                z = true;
            }
            boolean z2 = bundle.getBoolean("safeTemplate", false);
            if (z) {
                m81992a(parse, z2);
                if (!SettingsManager.m29616a().mo25400a("awewebview_append_common_params_enabled", true)) {
                    return str;
                }
            } else if (z2) {
                try {
                    Uri parse2 = Uri.parse(Uri.decode(parse.getQueryParameter("target")));
                    if (TextUtils.equals("1", parse2.getQueryParameter("append_common_params"))) {
                        m81992a(parse2, true);
                    }
                } catch (Exception unused) {
                }
            }
            StringBuilder sb = new StringBuilder(str);
            if (z) {
                AppLog.appendCommonParams(sb, false);
            }
            return sb.toString();
        }

        /* renamed from: a */
        private static void m81992a(Uri uri, boolean z) {
            int i;
            try {
                String path = uri.getPath();
                if (!TextUtils.isEmpty(path)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("url", path);
                    String host = uri.getHost();
                    if (!TextUtils.isEmpty(host)) {
                        hashMap.put("host", host);
                    }
                    if (z) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    hashMap.put("is_sec_url_wrapped", String.valueOf(i));
                    C39162r.m79460a("awewebview_append_common_params", hashMap);
                }
            } catch (Exception unused) {
            }
        }

        /* renamed from: b */
        private static C40628b m81994b(Bundle bundle, C40617a aVar) {
            Uri uri;
            boolean z;
            boolean z2;
            String str = aVar.f95054c;
            if (!TextUtils.isEmpty(str)) {
                uri = Uri.parse(str);
            } else {
                uri = null;
            }
            C40628b bVar = new C40628b((byte) 0);
            bVar.f95094H = (String) C40520b.m81722a(uri, "commerce_enter_from", bundle, "commerce_enter_from", String.class, "");
            bVar.f95097K = (String) C40520b.m81722a(uri, "challenge_id", bundle, "challenge_id", String.class, "");
            bVar.f95098L = (String) C40520b.m81722a(uri, "sticker_id", bundle, "sticker_id", String.class, "");
            bVar.f95106a = bundle.getLong("ad_id", 0);
            if (bVar.f95106a <= 0) {
                Long l = (Long) C40520b.m81724a(uri, "cid", Long.class, (Object) 0L);
                Long l2 = (Long) C40520b.m81724a(uri, "ad_id", Long.class, (Object) 0L);
                if (l.longValue() > 0) {
                    bVar.f95106a = l.longValue();
                } else if (l2.longValue() > 0) {
                    bVar.f95106a = l2.longValue();
                }
            }
            bVar.f95107b = bundle.getString("ad_type", "");
            bVar.f95108c = bundle.getInt("ad_system_origin", 0);
            bVar.f95109d = bundle.getBoolean("bundle_is_from_app_ad", false);
            bVar.f95090D = bundle.getBoolean("bundle_is_from_comment_app_ad", false);
            bVar.f95110e = bundle.getString("bundle_download_url");
            bVar.f95125t = bundle.getString("bundle_ad_quick_app_url");
            bVar.f95111f = bundle.getString("bundle_download_app_name");
            bVar.f95112g = bundle.getString("aweme_package_name");
            bVar.f95113h = bundle.getString("bundle_download_app_extra");
            bVar.f95114i = (String) C40520b.m81722a(uri, "log_extra", bundle, "bundle_download_app_log_extra", String.class, "");
            bVar.f95092F = bundle.getString("has_ad_info_json");
            bVar.f95093G = bundle.getString("ad_info_json");
            bVar.f95115j = bundle.getString("gd_label");
            bVar.f95116k = bundle.getString("gd_ext_json");
            bVar.f95120o = bundle.getBoolean("bundle_forbidden_jump", false);
            bVar.f95117l = bundle.getBoolean("bundle_disable_download_dialog", true);
            bVar.f95118m = bundle.getString("aweme_creative_id");
            bVar.f95119n = bundle.getBoolean("bundle_show_download_status_bar", true);
            if (bVar.f95106a > 0 || !TextUtils.isEmpty(bVar.f95115j)) {
                z = true;
            } else {
                z = false;
            }
            bVar.f95121p = z;
            String string = bundle.getString("ad_js_url");
            if (bVar.f95106a > 0 && TextUtils.isEmpty(string)) {
                string = SharePrefCache.inst().getJsActlogUrl().mo59941c();
            }
            bVar.f95122q = string;
            bVar.f95123r = bundle.getString("dou_plus_fail_monitor_url");
            if (!bundle.getBoolean("enable_dou_plus_full_process_monitor", false) || !TextUtils.equals("TTWebView", "SystemWebView")) {
                z2 = false;
            } else {
                z2 = true;
            }
            bVar.f95124s = z2;
            bVar.f95126u = bundle.getString("preload_channel_name");
            bVar.f95127v = bundle.getString("preload_scene");
            bVar.f95128w = bundle.getInt("preload_web_status");
            bVar.f95129x = bundle.getInt("preload_web_status_new");
            bVar.f95130y = bundle.getInt("preload_is_web_url");
            bVar.f95088B = bundle.getInt("web_type");
            bVar.f95105S = bundle.getBoolean("enable_web_google_login");
            bVar.f95089C = bundle.getString("quick_shop_enter_from");
            bVar.f95091E = bundle.getBoolean("enable_web_report", false);
            bVar.f95095I = bundle.getBoolean("bundle_enable_open_browser_to_download_apk", false);
            bVar.f95096J = bundle.getBoolean("bundle_enable_card_preload", true);
            bVar.f95099M = bundle.getLong("user_click_time", 0);
            bVar.f95100N = bundle.getBoolean("hide_web_button", false);
            bVar.f95131z = bundle.getBoolean("disable_js_calculate", false);
            bVar.f95101O = bundle.getBoolean("is_from_lynx_land_page", false);
            bVar.f95102P = bundle.getString("second_page_preload_channel_name");
            bVar.f95103Q = bundle.getString("enter_from");
            bVar.f95104R = bundle.getString("landing_page_info");
            return bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0089  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x009b  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00e4  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00ed  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00fb  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x011f  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0184  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0196  */
        /* JADX WARNING: Removed duplicated region for block: B:5:0x001c  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static com.p2082ss.android.ugc.aweme.crossplatform.p2710d.C40633f m81997c(android.os.Bundle r9, com.p2082ss.android.ugc.aweme.crossplatform.p2710d.C40617a r10) {
            /*
            // Method dump skipped, instructions count: 457
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.crossplatform.p2710d.p2711a.C40620b.C40622b.m81997c(android.os.Bundle, com.ss.android.ugc.aweme.crossplatform.d.a):com.ss.android.ugc.aweme.crossplatform.d.f");
        }
    }
}
