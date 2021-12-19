package com.bytedance.frameworks.baselib.network.http.p995g;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.g.a */
public final class C14751a {

    /* renamed from: a */
    public static volatile String f35951a;

    /* renamed from: b */
    private static volatile boolean f35952b;

    /* renamed from: c */
    private static volatile List<String> f35953c = new ArrayList();

    /* renamed from: d */
    private static volatile List<String> f35954d = new ArrayList();

    /* renamed from: e */
    private static volatile boolean f35955e = false;

    static {
        Covode.recordClassIndex(16848);
    }

    /* renamed from: b */
    private static boolean m27043b(Context context) {
        String a = m27040a(context, "ttnet_config.json");
        if (!TextUtils.isEmpty(a)) {
            try {
                if (new JSONObject(a).optBoolean("boe_proxy_enabled", false)) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m27042a(Context context) {
        if (C58016d.f132222c == null || !C58016d.f132224e) {
            C58016d.f132222c = context.getFilesDir();
        }
        String absolutePath = C58016d.f132222c.getAbsolutePath();
        if (TextUtils.isEmpty(absolutePath)) {
            return false;
        }
        try {
            if (new File(absolutePath + "/ttnet_boe.flag").exists()) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0029 A[SYNTHETIC, Splitter:B:13:0x0029] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m27040a(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = 8042(0x1f6a, float:1.1269E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r4)
            android.content.res.AssetManager r0 = r5.getAssets()     // Catch:{ all -> 0x0026 }
            java.io.InputStream r3 = r0.open(r6)     // Catch:{ all -> 0x0026 }
            int r0 = r3.available()     // Catch:{ all -> 0x0027 }
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x0027 }
            r3.read(r2)     // Catch:{ all -> 0x0027 }
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x0027 }
            java.lang.String r0 = "UTF-8"
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0027 }
            r3.close()     // Catch:{ IOException -> 0x0021 }
            goto L_0x0033
        L_0x0021:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0033
        L_0x0026:
            r3 = 0
        L_0x0027:
            if (r3 == 0) goto L_0x0031
            r3.close()     // Catch:{ IOException -> 0x002d }
            goto L_0x0031
        L_0x002d:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0031:
            java.lang.String r1 = ""
        L_0x0033:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.p995g.C14751a.m27040a(android.content.Context, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d2, code lost:
        return r5;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m27041a(android.content.Context r4, java.lang.String r5, java.util.List<com.bytedance.retrofit2.client.C22027b> r6) {
        /*
        // Method dump skipped, instructions count: 329
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.p995g.C14751a.m27041a(android.content.Context, java.lang.String, java.util.List):java.lang.String");
    }
}
