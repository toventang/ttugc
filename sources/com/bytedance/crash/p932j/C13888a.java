package com.bytedance.crash.p932j;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13881i;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.entity.C13865c;
import com.bytedance.crash.runtime.C13994b;
import com.bytedance.crash.runtime.C14004d;
import com.bytedance.crash.runtime.C14019n;
import com.bytedance.crash.util.C14044b;
import com.bytedance.crash.util.C14073u;
import com.bytedance.crash.util.C14075v;
import com.bytedance.news.common.service.manager.C21520c;
import com.bytedance.services.slardar.config.AbstractC22715a;
import com.bytedance.services.slardar.config.IConfigManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.j.a */
public final class C13888a {

    /* renamed from: a */
    public static Runnable f33813a = new Runnable() {
        /* class com.bytedance.crash.p932j.C13888a.RunnableC138891 */

        static {
            Covode.recordClassIndex(15949);
        }

        public final void run() {
            if (C13888a.f33814b > 0) {
                C13888a.f33814b--;
                C14075v.m25650a("try fetchApmConfig");
                if (C14044b.m25518b(C13933m.f33936a)) {
                    try {
                        IConfigManager d = C13888a.m25125d();
                        if (d != null) {
                            JSONObject jSONObject = new JSONObject(d.queryConfig());
                            C13888a.f33814b = 0;
                            C13994b.m25333a(C13888a.m25119a(C14004d.m25375a(C13933m.m25221a()), jSONObject), true);
                            C14075v.m25650a("success fetchApmConfig");
                        }
                    } catch (JSONException unused) {
                    } catch (Throwable unused2) {
                        C13888a.f33814b = 0;
                    }
                } else {
                    C13924m.m25206a();
                    if (C13924m.f33922a) {
                        C13888a.f33814b = 0;
                    }
                }
            }
            if (C13888a.f33814b <= 0) {
                return;
            }
            if (C14044b.m25518b(C13933m.f33936a)) {
                C14019n.m25421b().mo22552a(C13888a.f33813a, 15000);
            } else {
                C14019n.m25421b().mo22552a(C13888a.f33813a, 60000);
            }
        }
    };

    /* renamed from: b */
    public static int f33814b = 0;

    /* renamed from: c */
    public static boolean f33815c = false;

    /* renamed from: d */
    public static boolean f33816d = false;

    /* renamed from: e */
    public static boolean f33817e = true;

    /* renamed from: f */
    private static IConfigManager f33818f = null;

    /* renamed from: a */
    public static void m25120a() {
        f33814b = 40;
        C14019n.m25421b().mo22551a(f33813a);
    }

    static {
        Covode.recordClassIndex(15948);
    }

    /* renamed from: c */
    public static boolean m25124c() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        RunnableC138902 r2 = new Runnable() {
            /* class com.bytedance.crash.p932j.C13888a.RunnableC138902 */

            static {
                Covode.recordClassIndex(15950);
            }

            public final void run() {
                byte[] b = C13888a.m25122b();
                if (b != null && b.length > 0) {
                    try {
                        C13888a.f33815c = new JSONObject(new String(b)).optBoolean("should_upload");
                    } catch (Throwable unused) {
                    }
                    countDownLatch.countDown();
                }
            }
        };
        if (Looper.getMainLooper() == Looper.myLooper()) {
            try {
                new Thread(r2).start();
            } catch (Throwable unused) {
            }
            try {
                countDownLatch.await(3000, TimeUnit.MILLISECONDS);
            } catch (Throwable unused2) {
            }
        } else {
            r2.run();
        }
        return f33815c;
    }

    /* renamed from: d */
    public static IConfigManager m25125d() {
        if (f33817e && f33818f == null) {
            try {
                f33818f = (IConfigManager) C21520c.m40424a(IConfigManager.class);
            } catch (Throwable unused) {
                f33817e = false;
            }
            IConfigManager iConfigManager = f33818f;
            if (iConfigManager != null) {
                iConfigManager.registerConfigListener(new AbstractC22715a() {
                    /* class com.bytedance.crash.p932j.C13888a.C138913 */

                    static {
                        Covode.recordClassIndex(15951);
                    }

                    @Override // com.bytedance.services.slardar.config.AbstractC22715a
                    /* renamed from: a */
                    public final void mo20180a(JSONObject jSONObject, boolean z) {
                    }

                    @Override // com.bytedance.services.slardar.config.AbstractC22715a
                    /* renamed from: d */
                    public final void mo20038d() {
                        C13888a.f33816d = true;
                    }
                });
            }
        }
        if (!f33817e || !f33816d) {
            return null;
        }
        return f33818f;
    }

    /* renamed from: b */
    public static byte[] m25122b() {
        try {
            String uploadCheckCoreDumpUrl = C13933m.f33942g.getUploadCheckCoreDumpUrl();
            C13933m.m25221a();
            return C13907f.m25174a(uploadCheckCoreDumpUrl, C14004d.m25377a(C13933m.m25221a().f34140a.getCommonParams(), "aid", "4444", "crash", "1", "os", "Android", "update_version_code", "000000", "channel", "unknown", "app_version", "0.0.0", "device_id", C13933m.m25226b().mo22549a()));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m25121a(Object obj) {
        byte[] b;
        if (C13924m.m25208a(C13865c.m25083c(obj)) && C14073u.m25649b(C13933m.f33936a) && (b = m25123b(obj)) != null) {
            try {
                C13994b.m25333a(m25119a(C13865c.m25083c(obj), new JSONObject(new String(b)).optJSONObject("ret")), true);
                C14075v.m25650a("success fetchAidConfig net");
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    private static byte[] m25123b(Object obj) {
        JSONObject jSONObject;
        try {
            String apmConfigUrl = C13933m.f33942g.getApmConfigUrl();
            Iterator<C13881i> it = C13865c.f33759a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    jSONObject = null;
                    break;
                }
                C13881i next = it.next();
                if (next != null && next.mo22362a(obj)) {
                    jSONObject = next.mo22360a();
                    break;
                }
            }
            HashMap hashMap = new HashMap();
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next2 = keys.next();
                    hashMap.put(next2, jSONObject.opt(next2));
                }
            }
            return C13907f.m25174a(apmConfigUrl, C14004d.m25377a(hashMap, "aid", "4444", "crash", "npth", "os", "Android", "update_version_code", "000000", "channel", "unknown", "app_version", "0.0.0", "device_id", C13933m.m25226b().mo22549a()));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static JSONArray m25119a(String str, JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(str, jSONObject);
            jSONArray.put(jSONObject2);
        } catch (JSONException unused) {
        }
        return jSONArray;
    }
}
