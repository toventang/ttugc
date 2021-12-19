package com.bytedance.android.monitorV2.webview.p753e;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.monitorV2.webview.e.a */
public final class C12212a {

    /* renamed from: a */
    private static String f29388a = "webview_monitor_js_file_v2/slardar_sdk.js";

    /* renamed from: b */
    private static String f29389b = "webview_monitor_js_file_v2/slardar_bridge.js";

    /* renamed from: c */
    private static String f29390c = "";

    /* renamed from: d */
    private static String f29391d = "";

    /* renamed from: e */
    private static String f29392e = "";

    /* renamed from: f */
    private static String f29393f = " javascript:( ";

    /* renamed from: g */
    private static String f29394g = " )() ";

    /* renamed from: h */
    private static String f29395h = " function(){ ";

    /* renamed from: i */
    private static String f29396i = " } ";

    static {
        Covode.recordClassIndex(13943);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:13|14|(2:16|17)) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        com.bytedance.android.monitorV2.HybridMultiMonitor.getInstance().getExceptionHandler();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (0 != 0) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        com.bytedance.android.monitorV2.HybridMultiMonitor.getInstance().getExceptionHandler();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        if (0 != 0) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005b, code lost:
        com.bytedance.android.monitorV2.HybridMultiMonitor.getInstance().getExceptionHandler();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0062, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(9402);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0065, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m21844a(android.content.Context r6, java.lang.String r7, boolean r8) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.monitorV2.webview.p753e.C12212a.m21844a(android.content.Context, java.lang.String, boolean):java.lang.String");
    }

    /* renamed from: a */
    public static String m21843a(Context context, String str, String str2, boolean z) {
        if (TextUtils.isEmpty(f29390c)) {
            if (TextUtils.isEmpty(str)) {
                f29390c = m21844a(context, f29388a, true);
            } else {
                f29390c = m21844a(context, str, false);
            }
        }
        if (TextUtils.isEmpty(f29391d)) {
            f29391d = m21844a(context, f29389b, true);
        }
        f29392e = str2;
        if (str2 == null) {
            str2 = "";
        }
        f29392e = str2;
        if (!z) {
            f29390c = "";
            f29392e = "";
            f29391d = "";
        }
        return f29393f + f29395h + f29390c + f29391d + f29392e + f29396i + f29394g;
    }
}
