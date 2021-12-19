package com.p2082ss.android.p2092ad.splash.p2094b;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.p2082ss.android.p2092ad.splash.core.AbstractC29536l;
import com.p2082ss.android.p2092ad.splash.core.C29478f;
import com.p2082ss.android.p2092ad.splash.core.C29495h;
import com.p2082ss.android.p2092ad.splash.core.C29535k;
import com.p2082ss.android.p2092ad.splash.core.p2103h.C29501a;
import com.p2082ss.android.p2092ad.splash.p2109f.C29638a;
import com.p2082ss.android.p2092ad.splash.p2109f.C29644g;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.b.a */
public class C29375a {

    /* renamed from: a */
    public static volatile boolean f69741a = true;

    /* renamed from: e */
    private static volatile C29375a f69742e;

    /* renamed from: b */
    public volatile boolean f69743b;

    /* renamed from: c */
    public volatile boolean f69744c;

    /* renamed from: d */
    public volatile int f69745d;

    private C29375a() {
    }

    static {
        Covode.recordClassIndex(35768);
    }

    /* renamed from: c */
    private boolean m58832c() {
        if (!this.f69743b || !f69741a) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C29375a m58829a() {
        MethodCollector.m26663i(10074);
        if (f69742e == null) {
            synchronized (C29375a.class) {
                try {
                    if (f69742e == null) {
                        f69742e = new C29375a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10074);
                    throw th;
                }
            }
        }
        C29375a aVar = f69742e;
        MethodCollector.m26664o(10074);
        return aVar;
    }

    /* renamed from: b */
    public static JSONObject m58831b() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (C29495h.m59102b() == null) {
                return jSONObject;
            }
            String c = C29495h.m59102b().mo51565c();
            jSONObject.put("device_id", C29495h.m59111j());
            jSONObject.put("app_version", "2.0.7-rc.3");
            jSONObject.put("channel", c);
            jSONObject.put("update_version_code", C29495h.f70203a);
            jSONObject.put("package_name", C29495h.f70242r.getPackageName());
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    private static boolean m58833d() {
        boolean z;
        C29478f b = C29495h.m59102b();
        if (b == null) {
            return false;
        }
        String c = b.mo51565c();
        String j = C29495h.m59111j();
        String a = b.mo51563a();
        if (TextUtils.isEmpty(c) || TextUtils.isEmpty(j) || TextUtils.isEmpty(a)) {
            z = false;
        } else {
            z = true;
        }
        Context applicationContext = C29495h.f70242r.getApplicationContext();
        if (C58003a.f132201c) {
            if (applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            return z;
        }
        if (applicationContext == null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.putOpt("log_extra", C29535k.m59196a().f70379l);
                jSONObject.putOpt("ad_extra_data", jSONObject2);
                jSONObject.putOpt("is_ad_event", "1");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C29495h.m59099a(84378473382L, "splash_ad", "context_npe", jSONObject);
            return false;
        }
        return z;
    }

    /* renamed from: a */
    public final synchronized void mo51355a(final AbstractC29536l lVar) {
        MethodCollector.m26663i(10239);
        if (!m58832c()) {
            MethodCollector.m26664o(10239);
        } else if (C29495h.m59102b() == null || C29495h.f70232h == null) {
            m58830a(lVar, false);
            MethodCollector.m26664o(10239);
        } else if (!m58833d()) {
            this.f69744c = false;
            m58830a(lVar, false);
            MethodCollector.m26664o(10239);
        } else if (this.f69744c) {
            m58830a(lVar, true);
            MethodCollector.m26664o(10239);
        } else if (this.f69745d <= 5) {
            C29501a a = C29501a.m59114a();
            RunnableC293761 r2 = new Runnable() {
                /* class com.p2082ss.android.p2092ad.splash.p2094b.C29375a.RunnableC293761 */

                static {
                    Covode.recordClassIndex(35769);
                }

                public final void run() {
                    try {
                        if (!C29375a.this.f69744c) {
                            C29495h.f70220aq.mo28672a("1385", C29375a.m58831b());
                        }
                        C29375a.this.f69744c = true;
                        C29375a.this.f69745d = 0;
                        C29375a.m58830a(lVar, true);
                    } catch (Throwable th) {
                        if ((th instanceof ClassNotFoundException) || (th instanceof NoClassDefFoundError)) {
                            C29638a.m59659a(0, " no sdk monitor ");
                            C29375a.f69741a = false;
                        }
                        C29375a.this.f69744c = false;
                        C29375a.m58830a(lVar, false);
                        C29375a.this.f69745d++;
                        th.getMessage();
                        C29644g.m59685a();
                    }
                }
            };
            if (a.f70262a == null) {
                C40787l.C40788a a2 = C40787l.m82269a(EnumC40793o.FIXED);
                a2.f95505c = 2;
                a.f70262a = C40780g.m82242a(a2.mo70028a());
            }
            a.f70262a.submit(r2);
            MethodCollector.m26664o(10239);
        } else {
            m58830a(lVar, false);
            MethodCollector.m26664o(10239);
        }
    }

    /* renamed from: a */
    public static void m58830a(AbstractC29536l lVar, boolean z) {
        if (lVar != null) {
            if (z) {
                lVar.mo51363a();
            } else {
                lVar.mo51364b();
            }
        }
    }

    /* renamed from: a */
    public final void mo51356a(Exception exc, String str) {
        if (m58832c()) {
            try {
                String message = exc.getMessage();
                if (!TextUtils.isEmpty(message)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(str, message);
                    mo51360a("service_ad_exception", (JSONObject) null, jSONObject);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo51359a(final String str, final JSONObject jSONObject) {
        if (m58832c()) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                /* class com.p2082ss.android.p2092ad.splash.p2094b.C29375a.RunnableC293772 */

                /* renamed from: b */
                final /* synthetic */ int f69749b = 0;

                /* renamed from: d */
                final /* synthetic */ JSONObject f69751d;

                static {
                    Covode.recordClassIndex(35770);
                }

                public final void run() {
                    C29375a.this.mo51358a(str, this.f69749b, jSONObject, this.f69751d);
                }

                {
                    this.f69751d = null;
                }
            }, 5000);
        }
    }

    /* renamed from: a */
    public final void mo51357a(final String str, int i, final JSONObject jSONObject) {
        if (m58832c()) {
            if (!this.f69744c) {
                mo51355a(new AbstractC29536l() {
                    /* class com.p2082ss.android.p2092ad.splash.p2094b.C29375a.C293794 */

                    static {
                        Covode.recordClassIndex(35772);
                    }

                    @Override // com.p2082ss.android.p2092ad.splash.core.AbstractC29536l
                    /* renamed from: b */
                    public final void mo51364b() {
                    }

                    @Override // com.p2082ss.android.p2092ad.splash.core.AbstractC29536l
                    /* renamed from: a */
                    public final void mo51363a() {
                        SDKMonitorUtils.m27201a("1385").mo23855a(str, 1, jSONObject);
                    }
                });
            } else {
                SDKMonitorUtils.m27201a("1385").mo23855a(str, i, jSONObject);
            }
        }
    }

    /* renamed from: a */
    public final void mo51360a(final String str, final JSONObject jSONObject, final JSONObject jSONObject2) {
        if (m58832c()) {
            if (!this.f69744c) {
                mo51355a(new AbstractC29536l() {
                    /* class com.p2082ss.android.p2092ad.splash.p2094b.C29375a.C293805 */

                    static {
                        Covode.recordClassIndex(35773);
                    }

                    @Override // com.p2082ss.android.p2092ad.splash.core.AbstractC29536l
                    /* renamed from: b */
                    public final void mo51364b() {
                    }

                    @Override // com.p2082ss.android.p2092ad.splash.core.AbstractC29536l
                    /* renamed from: a */
                    public final void mo51363a() {
                        SDKMonitorUtils.m27201a("1385").mo23858a(str, jSONObject, jSONObject2);
                    }
                });
            } else {
                SDKMonitorUtils.m27201a("1385").mo23858a(str, jSONObject, jSONObject2);
            }
        }
    }

    /* renamed from: a */
    public final void mo51358a(final String str, int i, final JSONObject jSONObject, final JSONObject jSONObject2) {
        if (m58832c()) {
            if (!this.f69744c) {
                mo51355a(new AbstractC29536l() {
                    /* class com.p2082ss.android.p2092ad.splash.p2094b.C29375a.C293783 */

                    static {
                        Covode.recordClassIndex(35771);
                    }

                    @Override // com.p2082ss.android.p2092ad.splash.core.AbstractC29536l
                    /* renamed from: b */
                    public final void mo51364b() {
                    }

                    @Override // com.p2082ss.android.p2092ad.splash.core.AbstractC29536l
                    /* renamed from: a */
                    public final void mo51363a() {
                        SDKMonitorUtils.m27201a("1385").mo23856a(str, 1, jSONObject, jSONObject2);
                    }
                });
            } else {
                SDKMonitorUtils.m27201a("1385").mo23856a(str, i, jSONObject, jSONObject2);
            }
        }
    }
}
