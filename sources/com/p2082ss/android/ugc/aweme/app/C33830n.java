package com.p2082ss.android.ugc.aweme.app;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.apm.C12290b;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.facebook.p1902j.p1903a.C24801b;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.n */
public class C33830n extends C34611o {

    /* renamed from: a */
    public static final NetworkUtils.AbstractC29834g f80076a = new NetworkUtils.AbstractC29834g() {
        /* class com.p2082ss.android.ugc.aweme.app.C33830n.C338333 */

        /* renamed from: a */
        public boolean f80079a;

        static {
            Covode.recordClassIndex(40733);
        }

        @Override // com.p2082ss.android.common.util.NetworkUtils.AbstractC29834g
        /* renamed from: a */
        public final void mo52120a(final long j, final long j2, final String str, final String str2, final NetworkUtils.C29833f fVar) {
            try {
                C33830n.f81674d.submit(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.app.C33830n.C338333.RunnableC338341 */

                    static {
                        Covode.recordClassIndex(40734);
                    }

                    public final void run() {
                        NetworkUtils.C29833f fVar;
                        String[] strArr = new String[1];
                        if (C13627m.m24498a(strArr[0]) && (fVar = fVar) != null) {
                            strArr[0] = fVar.f71179a;
                        }
                        String str = null;
                        if (!TextUtils.isEmpty(str)) {
                            str = Uri.parse(str).getQueryParameter("retry_type");
                        }
                        if (!C338333.this.f80079a && !TextUtils.isEmpty(str) && str.contains("aweme/v1/feed/?type=0")) {
                            C338333.this.f80079a = true;
                        }
                        C33830n.m70663a(j, j2, str, strArr[0], str2, 200, new C33743c().mo59976a("retry_type", str).mo59976a("First_Request", String.valueOf(C338333.this.f80079a)).mo59977a());
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // com.p2082ss.android.common.util.NetworkUtils.AbstractC29834g
        /* renamed from: a */
        public final void mo52121a(final long j, final long j2, final String str, final String str2, final NetworkUtils.C29833f fVar, final Throwable th) {
            try {
                C33830n.f81674d.submit(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.app.C33830n.C338333.RunnableC338352 */

                    static {
                        Covode.recordClassIndex(40735);
                    }

                    public final void run() {
                        String str;
                        NetworkUtils.C29833f fVar;
                        if (!TextUtils.isEmpty(str)) {
                            str = Uri.parse(str).getQueryParameter("retry_type");
                            if (TextUtils.equals("no_retry", str)) {
                                return;
                            }
                        } else {
                            str = null;
                        }
                        String[] strArr = new String[1];
                        int a = C33830n.m69190a(th, strArr);
                        if (C13627m.m24498a(strArr[0]) && (fVar = fVar) != null) {
                            strArr[0] = fVar.f71179a;
                        }
                        if (!C338333.this.f80079a && !TextUtils.isEmpty(str) && str.contains("aweme/v1/feed/?type=0")) {
                            C338333.this.f80079a = true;
                        }
                        JSONObject a2 = new C33743c().mo59976a("First_Request", String.valueOf(C338333.this.f80079a)).mo59976a("traceCode", str2).mo59976a("errorDesc", C33830n.m69191a(th)).mo59976a("netWorkQuality", C24801b.C24802a.f58850a.mo40614a().toString()).mo59976a("netWorkSpeeds", new StringBuilder().append((int) C24801b.C24802a.f58850a.mo40616b()).toString()).mo59976a("responseCode", String.valueOf(str2)).mo59976a("retryType", str).mo59977a();
                        C33830n.m70669b(j, j2, str, strArr[0], str2, a, a2);
                        C33830n.m70663a(j, j2, str, strArr[0], str2, a, a2);
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };

    static {
        Covode.recordClassIndex(40730);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        if (r1 != null) goto L_0x002b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m69191a(java.lang.Throwable r4) {
        /*
            r3 = 0
            if (r4 != 0) goto L_0x0004
            return r3
        L_0x0004:
            java.io.StringWriter r2 = new java.io.StringWriter     // Catch:{ all -> 0x0028 }
            r2.<init>()     // Catch:{ all -> 0x0028 }
            java.io.PrintWriter r1 = new java.io.PrintWriter     // Catch:{ all -> 0x0028 }
            r1.<init>(r2)     // Catch:{ all -> 0x0028 }
            r4.printStackTrace(r1)     // Catch:{ all -> 0x0029 }
            java.lang.Throwable r0 = r4.getCause()     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0023
            r0.printStackTrace(r1)     // Catch:{ all -> 0x0029 }
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0023
            r0.printStackTrace(r1)     // Catch:{ all -> 0x0029 }
        L_0x0023:
            java.lang.String r3 = r2.toString()     // Catch:{ all -> 0x0029 }
            goto L_0x002b
        L_0x0028:
            r1 = r3
        L_0x0029:
            if (r1 == 0) goto L_0x002e
        L_0x002b:
            r1.close()
        L_0x002e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.app.C33830n.m69191a(java.lang.Throwable):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0161 A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m69190a(java.lang.Throwable r8, java.lang.String[] r9) {
        /*
        // Method dump skipped, instructions count: 441
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.app.C33830n.m69190a(java.lang.Throwable, java.lang.String[]):int");
    }

    /* renamed from: a */
    public static void m69192a(String str, String str2, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("service", str2);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C12290b.m22064a(str, jSONObject);
    }
}
