package com.p2082ss.android.ugc.aweme.p2387bf;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.bytedance.keva.adapter.KevaSpFastAdapter;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.p3924sp.C74925h;
import com.p2082ss.android.ugc.aweme.p3924sp.SharedPreferencesManager;
import com.twitter.sdk.android.core.C87807p;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.bf.d */
public final class C34822d {

    /* renamed from: a */
    private static boolean f82251a;

    /* renamed from: b */
    private static boolean f82252b;

    /* renamed from: c */
    private static int f82253c;

    /* renamed from: d */
    private static HashSet<String> f82254d = new HashSet<>();

    /* renamed from: e */
    private static HashSet<String> f82255e = new HashSet<>();

    /* renamed from: f */
    private static final String[] f82256f = {"is_allow_oppo_push", "push_multi_process_config", "traffic_monitor_info", "applog_stats", "wschannel_multi_process_config", "device_register_migrate_detector", "com.ss.android.deviceregister.utils.Cdid", "rec_user", "ab_test_mock_config", "anr_monitor_table", "app_setting", "aweme-abtest-hooker", "gaid_sp_name", "google_ads_flags", "image_opt_table", "KEY_NEED_UPLOAD_LAUNCHLOG", "plugin_meta_data", "pref_registered_pkg_names", "push_setting", "ss_app_config", "ss_location", "test_setting", "update_params", "use_https", "XMPushServiceConfig", "MiniAppCookiePersistence", "tma_jssdk_info", "mini_app_storage", "appbrand_file", "share_setting_preference", "push_switch", "sync", "httpdns_config_cache", "sp_client_report_status", "effect_setting", "d_permit", "Alvin2", "ContextData", "pushConfig", "MainTabPreferences", "sp_download_info", "TTWebView_Json_Config_Manager", "TeenageModeSetting", "extra_group", "WebViewBytedancePrefs", "app_bundle_session_ids"};

    /* renamed from: g */
    private static List<Class> f82257g = Arrays.asList(C74925h.class, C87807p.class);

    /* renamed from: h */
    private static File f82258h;

    /* renamed from: i */
    private static HashMap<String, Boolean> f82259i = new HashMap<>();

    static {
        Covode.recordClassIndex(41830);
    }

    /* renamed from: a */
    private static String[] m71164a() {
        return new String[]{"default_config", "awesome_splash", "splash_ad_sp", "ttnetCookieStore", "key_language_sp_key", "applog_stats", "aweme-app", "av_settings", "av_settings.xml", "ab_test_config", "aweme_user", "com.ss.spip_setting", "SP_EXPERIMENT_CACHE", "SP_CLIENT_EXPOSURE_CACHE", "SP_EXPERIMENT_EXPOSURE_CACHE", "CLIENT_EXPERIMENT_CACHE_TAG", C17867d.m33078a().getPackageName() + "_preferences", "rhea.sp", "ttlive_tabs_cache", "ttlive_sdk_shared_pref_cache", "live_sdk_core", "WebViewChromiumPrefs"};
    }

    /* renamed from: a */
    private static boolean m71163a(String str) {
        if ((str.length() & 7) <= f82253c) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static File m71159a(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x009b, code lost:
        if (r4 == null) goto L_0x00a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0083 A[SYNTHETIC, Splitter:B:47:0x0083] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0088 A[SYNTHETIC, Splitter:B:51:0x0088] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m71166b(android.content.Context r7) {
        /*
        // Method dump skipped, instructions count: 171
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2387bf.C34822d.m71166b(android.content.Context):void");
    }

    /* renamed from: a */
    private static boolean m71162a(File file) {
        MethodCollector.m26663i(1927);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(1927);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(1927);
        return delete;
    }

    /* renamed from: c */
    private static SharedPreferences m71168c(Context context, String str) {
        SharedPreferences sharedPreferences;
        if (context == null || (sharedPreferences = SharedPreferencesManager.getInstance().getSharedPreferences(context, str)) == null) {
            return null;
        }
        return sharedPreferences;
    }

    /* renamed from: b */
    private static boolean m71167b(Context context, String str) {
        if (!f82251a || f82257g.contains(context.getClass()) || f82254d.contains(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static void m71160a(Context context, boolean z) {
        MethodCollector.m26663i(1639);
        SharedPreferences sharedPreferences = context.getSharedPreferences("keva_switch_repo", 0);
        f82251a = sharedPreferences.getBoolean("keva_switch", true);
        f82254d.addAll(Arrays.asList(m71164a()));
        f82254d.addAll(sharedPreferences.getStringSet("keva_blacklist", Collections.emptySet()));
        f82255e.addAll(Arrays.asList(f82256f));
        if (!f82251a) {
            m71166b(context);
        }
        f82252b = z;
        MethodCollector.m26664o(1639);
    }

    /* renamed from: a */
    private static boolean m71161a(Context context, String str) {
        MethodCollector.m26663i(833);
        synchronized (f82259i) {
            try {
                Boolean bool = f82259i.get(str);
                if (bool != null) {
                    return bool.booleanValue();
                }
                if (f82258h == null) {
                    File a = m71159a(context);
                    if (!a.exists()) {
                        a.mkdir();
                    }
                    f82258h = new File(a.getParent(), "shared_prefs");
                }
                boolean exists = new File(f82258h, str + ".xml").exists();
                f82259i.put(str, Boolean.valueOf(exists));
                MethodCollector.m26664o(833);
                return exists;
            } finally {
                MethodCollector.m26664o(833);
            }
        }
    }

    /* renamed from: a */
    public static SharedPreferences m71158a(Context context, String str, int i) {
        if (m71167b(context, str)) {
            return m71165b(context, str, i);
        }
        if (!m71163a(str) && !Keva.isRepoPorted(str) && m71161a(context, str)) {
            return m71165b(context, str, i);
        }
        if (f82255e.contains(str)) {
            i = 4;
        }
        return KevaSpFastAdapter.getSharedPreferences(context, str, i, f82252b);
    }

    /* renamed from: b */
    private static SharedPreferences m71165b(Context context, String str, int i) {
        MethodCollector.m26663i(1886);
        if (TextUtils.equals("plugin_meta_data", str) || TextUtils.equals("bmd_monitor", str) || TextUtils.equals("multidex.version", str) || TextUtils.equals(C17867d.m33078a().getPackageName() + "_preferences", str)) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, i);
            MethodCollector.m26664o(1886);
            return sharedPreferences;
        }
        SharedPreferences c = m71168c(context, str);
        if (c != null) {
            MethodCollector.m26664o(1886);
            return c;
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(str, i);
        MethodCollector.m26664o(1886);
        return sharedPreferences2;
    }
}
