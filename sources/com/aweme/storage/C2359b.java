package com.aweme.storage;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.aweme.storage.b */
public final class C2359b {

    /* renamed from: a */
    private static ArrayList<String> f7173a = new ArrayList<>();

    /* renamed from: b */
    private static String[] f7174b = {"/cache/picture/im_fresco_cache/", "/cache/picture/fresco_cache/", "/files/awcn_strategy/pushservice/", "/files/keva/repo/", "/files/live_kv/", "/files/effect/", "/files/music/", "/files/logs/", "/files/ALOG/", "/cache/cachev2/", "/cache/runnableCache/", "/files/robust/", "/files/tt_file_st/", "/cache/feedCache/", "/files/leakcanary/", "/cache/ttnet_storage/", "/files/MiPushLog/", "/cache/picture/", "/cache/ttnet_storage/", "/cache/cjpayWebData/", "/cache/awemeCache/", "/files/font/", "/files/npth/", "/files/.msdata/", "/files/.dynamic/", "/files/bdp/", "/files/a/", "/cache/WebView/", "/files/webview_bytedance/", "/files/.patchs/", "/files/.envelope/", "/files/.emitter/", "/files/.umeng/", "/files/.bak/", "/files/.pre_download/", "/files/.imprint/", "/shared_prefs/", "/app_sslcache/", "/app_webview/", "/lib-main/", "/splashCache/", "/awemeSplashCache/", "/app_SGLib/", "/app_assets/", "/small_emoji_res/", "/system_emoji_res/", "/files/draft/", "/files/Download/", "/files/rhea/", "/files/speed_ml/", "/databases/", "/files/filters/", "/files/extract_shot/", "/files/effectmodel/", "/files/extract_custom_sticker/", "/covode/", "/app_hws_webview/", "/files/Pictures/CJPayImageLoader/", "/cache/Universal_activity", "/files/audio-effect/", "/files/mvtheme/", "/files/origin_sound/", "/files/ve_frame_cache2/", "/files/hdr_filter/", "/files/hianalytics/"};

    /* renamed from: c */
    private static String[] f7175c = {"/files/plugins/", "/cache/Universal_activity/", "/files/appbrand/"};

    /* renamed from: d */
    private static String[] f7176d = {"/files/offlineX/", "/files/offline/", "/files/live_sdk_gecko/"};

    static {
        Covode.recordClassIndex(2637);
    }

    /* renamed from: a */
    private static HashMap<String, Integer> m7170a(String str) {
        HashMap<String, Integer> b = m7173b(str);
        if (b != null && !b.isEmpty()) {
            return b;
        }
        try {
            return m7174c(str);
        } catch (Throwable unused) {
            return b;
        }
    }

    /* renamed from: a */
    private static HashMap<String, Integer> m7171a(HashMap<String, Integer> hashMap) {
        if (hashMap == null) {
            return null;
        }
        HashMap<String, Integer> hashMap2 = new HashMap<>();
        for (String str : hashMap.keySet()) {
            String[] strArr = f7174b;
            int length = strArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    Iterator<String> it = f7173a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (str.startsWith(it.next())) {
                                break;
                            }
                        } else {
                            String[] strArr2 = f7175c;
                            int length2 = strArr2.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= length2) {
                                    String[] strArr3 = f7176d;
                                    int length3 = strArr3.length;
                                    while (true) {
                                        if (i >= length3) {
                                            hashMap2.put(str.replaceAll("\\d+", "*"), hashMap.get(str));
                                            break;
                                        }
                                        String str2 = strArr3[i];
                                        if (str.startsWith(str2) && str.split("/").length == 4) {
                                            hashMap2.put(str, hashMap.get(str));
                                            break;
                                        }
                                        if (str.startsWith(str2) && str.split("/").length == 5) {
                                            hashMap2.put(str, hashMap.get(str));
                                            break;
                                        }
                                        i++;
                                    }
                                } else {
                                    if (str.startsWith(strArr2[i3]) && str.split("/").length != 4) {
                                        break;
                                    }
                                    i3++;
                                }
                            }
                        }
                    }
                } else if (str.startsWith(strArr[i2])) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        return hashMap2;
    }

    /* renamed from: b */
    private static HashMap<String, Integer> m7173b(String str) {
        BufferedReader bufferedReader;
        Throwable th;
        MethodCollector.m26663i(3931);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(3931);
            return null;
        }
        HashMap<String, Integer> hashMap = new HashMap<>();
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("du -a -d 4 ".concat(String.valueOf(str))).getInputStream()));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String[] split = readLine.split("\t");
                    if (split.length == 2) {
                        String replace = split[1].replace(str, "");
                        if (TextUtils.isEmpty(replace)) {
                            replace = "DiskTotal";
                        }
                        hashMap.put(replace, Integer.valueOf(split[0]));
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        th.getStackTrace();
                        return null;
                    } finally {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused) {
                        }
                        MethodCollector.m26664o(3931);
                    }
                }
            }
            bufferedReader.close();
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
            }
            MethodCollector.m26664o(3931);
            return hashMap;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
            th.getStackTrace();
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a2 A[SYNTHETIC, Splitter:B:48:0x00a2] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.HashMap<java.lang.String, java.lang.Integer> m7174c(java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 169
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aweme.storage.C2359b.m7174c(java.lang.String):java.util.HashMap");
    }

    /* renamed from: a */
    public static void m7172a(Context context, JSONObject jSONObject) {
        File file;
        String packageName = context.getPackageName();
        f7173a.add("/cache/webviewbytedance_" + packageName + ":miniapp0/");
        f7173a.add("/cache/webviewbytedance_" + packageName + "/");
        f7173a.add("/app_webviewbytedance_" + packageName + ":miniapp0/");
        f7173a.add("/app_webview_" + packageName + ":miniapp0/");
        f7173a.add("/cache/webview_" + packageName + ":miniapp0/");
        f7173a.add("/app_webviewbytedance_" + packageName + "/");
        f7173a.add("/app_webviewbytedance_ttwebview_bytedance_" + packageName + "/");
        f7173a.add("/app_hws_webview_" + packageName + ":miniapp0/");
        if (C58016d.f132222c == null || !C58016d.f132224e) {
            C58016d.f132222c = context.getFilesDir();
        }
        HashMap<String, Integer> a = m7171a(m7170a(C58016d.f132222c.getParent()));
        if (!TextUtils.isEmpty("")) {
            file = context.getExternalFilesDir("");
        } else {
            if (C58016d.f132223d == null || !C58016d.f132224e) {
                C58016d.f132223d = context.getExternalFilesDir("");
            }
            file = C58016d.f132223d;
        }
        HashMap<String, Integer> a2 = m7171a(m7170a(file.getParent()));
        if (a != null) {
            try {
                a.size();
                for (Map.Entry<String, Integer> entry : a.entrySet()) {
                    jSONObject.put("internal" + entry.getKey(), entry.getValue());
                    entry.getKey();
                    entry.getValue();
                }
            } catch (JSONException e) {
                e.getStackTrace();
                return;
            }
        }
        if (a2 != null) {
            a2.size();
            for (Map.Entry<String, Integer> entry2 : a2.entrySet()) {
                jSONObject.put("external" + entry2.getKey(), entry2.getValue());
                entry2.getKey();
                entry2.getValue();
            }
        }
    }
}
