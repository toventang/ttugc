package com.p2082ss.android.ugc.aweme.app.services;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.services.c */
public class C33850c {

    /* renamed from: b */
    private static C33850c f80138b;

    /* renamed from: a */
    public JSONObject f80139a;

    static {
        Covode.recordClassIndex(40763);
    }

    private C33850c(Context context) {
        String a = m69287a(context, "assets-map/aweme.json");
        if (!TextUtils.isEmpty(a)) {
            try {
                this.f80139a = new JSONObject(a);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static C33850c m69286a(Context context) {
        MethodCollector.m26663i(11748);
        if (f80138b == null) {
            synchronized (C33850c.class) {
                try {
                    if (f80138b == null) {
                        f80138b = new C33850c(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11748);
                    throw th;
                }
            }
        }
        C33850c cVar = f80138b;
        MethodCollector.m26664o(11748);
        return cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x003f A[SYNTHETIC, Splitter:B:25:0x003f] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m69287a(android.content.Context r6, java.lang.String r7) {
        /*
            r5 = 11917(0x2e8d, float:1.6699E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r5)
            r4 = 0
            android.content.res.AssetManager r0 = r6.getAssets()     // Catch:{ IOException -> 0x002c, all -> 0x002a }
            java.io.InputStream r3 = r0.open(r7)     // Catch:{ IOException -> 0x002c, all -> 0x002a }
            int r0 = r3.available()     // Catch:{ IOException -> 0x0028 }
            byte[] r2 = new byte[r0]     // Catch:{ IOException -> 0x0028 }
            r3.read(r2)     // Catch:{ IOException -> 0x0028 }
            r3.close()     // Catch:{ IOException -> 0x0028 }
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x0028 }
            java.lang.String r0 = "utf-8"
            r1.<init>(r2, r0)     // Catch:{ IOException -> 0x0028 }
            r3.close()     // Catch:{ IOException -> 0x0024 }
        L_0x0024:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            return r1
        L_0x0028:
            r0 = move-exception
            goto L_0x002e
        L_0x002a:
            r0 = move-exception
            goto L_0x0034
        L_0x002c:
            r0 = move-exception
            r3 = r4
        L_0x002e:
            r0.printStackTrace()     // Catch:{ all -> 0x0032 }
            goto L_0x003d
        L_0x0032:
            r0 = move-exception
            r4 = r3
        L_0x0034:
            if (r4 == 0) goto L_0x0039
            r4.close()     // Catch:{ IOException -> 0x0039 }
        L_0x0039:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            throw r0
        L_0x003d:
            if (r3 == 0) goto L_0x0042
            r3.close()     // Catch:{ IOException -> 0x0042 }
        L_0x0042:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.app.services.C33850c.m69287a(android.content.Context, java.lang.String):java.lang.String");
    }
}
