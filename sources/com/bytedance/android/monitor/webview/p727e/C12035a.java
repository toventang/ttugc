package com.bytedance.android.monitor.webview.p727e;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.monitor.webview.e.a */
public final class C12035a {

    /* renamed from: a */
    private static String f28826a = "webview_monitor_js_file/slardar_sdk.js";

    /* renamed from: b */
    private static String f28827b = "webview_monitor_js_file/slardar_bridge.js";

    /* renamed from: c */
    private static String f28828c = "";

    /* renamed from: d */
    private static String f28829d = "";

    /* renamed from: e */
    private static String f28830e = "";

    /* renamed from: f */
    private static String f28831f = " javascript:( ";

    /* renamed from: g */
    private static String f28832g = " )() ";

    /* renamed from: h */
    private static String f28833h = " function(){ ";

    /* renamed from: i */
    private static String f28834i = " } ";

    static {
        Covode.recordClassIndex(13763);
    }

    /* renamed from: a */
    public static String m21315a(Context context, String str, String str2) {
        if (TextUtils.isEmpty(f28828c)) {
            if (TextUtils.isEmpty(str)) {
                f28828c = m21316a(context, f28826a, true);
            } else {
                f28828c = m21316a(context, str, false);
            }
        }
        if (TextUtils.isEmpty(f28829d)) {
            f28829d = m21316a(context, f28827b, true);
        }
        f28830e = str2;
        if (str2 == null) {
            str2 = "";
        }
        f28830e = str2;
        return f28831f + f28833h + f28828c + f28829d + f28830e + f28834i + f28832g;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:13|14|(2:16|17)) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        com.bytedance.android.monitor.HybridMonitor.getInstance().getExceptionHandler();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (0 != 0) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        com.bytedance.android.monitor.HybridMonitor.getInstance().getExceptionHandler();
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
        com.bytedance.android.monitor.HybridMonitor.getInstance().getExceptionHandler();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0062, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(4880);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0065, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m21316a(android.content.Context r6, java.lang.String r7, boolean r8) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.monitor.webview.p727e.C12035a.m21316a(android.content.Context, java.lang.String, boolean):java.lang.String");
    }
}
