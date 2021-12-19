package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.C24872m;
import com.facebook.GraphRequest;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.p */
public final class C24764p {

    /* renamed from: a */
    public static final AtomicBoolean f58744a = new AtomicBoolean(false);

    /* renamed from: b */
    public static Long f58745b;

    /* renamed from: c */
    private static final String f58746c = C24764p.class.getCanonicalName();

    /* renamed from: d */
    private static final ConcurrentLinkedQueue<AbstractC24767a> f58747d = new ConcurrentLinkedQueue<>();

    /* renamed from: e */
    private static final Map<String, JSONObject> f58748e = new ConcurrentHashMap();

    /* renamed from: com.facebook.internal.p$a */
    public interface AbstractC24767a {
        static {
            Covode.recordClassIndex(28920);
        }

        /* renamed from: a */
        void mo40586a();
    }

    static {
        Covode.recordClassIndex(28917);
    }

    /* renamed from: a */
    public static void m47417a() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue<AbstractC24767a> concurrentLinkedQueue = f58747d;
            if (!concurrentLinkedQueue.isEmpty()) {
                final AbstractC24767a poll = concurrentLinkedQueue.poll();
                if (poll != null) {
                    handler.post(new Runnable() {
                        /* class com.facebook.internal.C24764p.RunnableC247662 */

                        static {
                            Covode.recordClassIndex(28919);
                        }

                        public final void run() {
                            if (!C24677a.m47209a(this)) {
                                try {
                                    poll.mo40586a();
                                } catch (Throwable th) {
                                    C24677a.m47208a(th, this);
                                }
                            }
                        }
                    });
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    static JSONObject m47415a(String str) {
        JSONObject b = m47420b(str);
        if (b == null) {
            return null;
        }
        C24699ae.m47299a();
        Context context = C24872m.f59047g;
        C34822d.m71158a(context, "com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(C1764a.m5928a("com.facebook.internal.APP_GATEKEEPERS.%s", new Object[]{str}), b.toString()).apply();
        return m47416a(str, b);
    }

    /* renamed from: b */
    public static JSONObject m47420b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("platform", "android");
        bundle.putString("sdk_version", "9.0.0");
        bundle.putString("fields", "gatekeepers");
        GraphRequest a = GraphRequest.m45068a(C1764a.m5928a("%s/%s", new Object[]{str, "mobile_sdk_gk"}));
        a.f56463n = true;
        a.f56459j = bundle;
        return GraphRequest.m45069a(a).f59153b;
    }

    /* renamed from: c */
    private static Map<String, Boolean> m47421c(String str) {
        m47418a((AbstractC24767a) null);
        if (str != null) {
            Map<String, JSONObject> map = f58748e;
            if (map.containsKey(str)) {
                HashMap hashMap = new HashMap();
                JSONObject jSONObject = map.get(str);
                if (jSONObject == null) {
                    return new HashMap();
                }
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, Boolean.valueOf(jSONObject.optBoolean(next)));
                }
                return hashMap;
            }
        }
        return new HashMap();
    }

    /* renamed from: a */
    static synchronized void m47418a(AbstractC24767a aVar) {
        synchronized (C24764p.class) {
            MethodCollector.m26663i(8598);
            if (aVar != null) {
                f58747d.add(aVar);
            }
            Long l = f58745b;
            if (l == null || System.currentTimeMillis() - l.longValue() >= 3600000) {
                C24699ae.m47299a();
                final Context context = C24872m.f59047g;
                C24699ae.m47299a();
                final String str = C24872m.f59041a;
                final String a = C1764a.m5928a("com.facebook.internal.APP_GATEKEEPERS.%s", new Object[]{str});
                if (context == null) {
                    MethodCollector.m26664o(8598);
                    return;
                }
                String string = C34822d.m71158a(context, "com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(a, null);
                if (!C24693ad.m47261a(string)) {
                    try {
                        m47416a(str, new JSONObject(string));
                    } catch (JSONException e) {
                        C24693ad.m47255a("FacebookSDK", (Exception) e);
                    }
                }
                Executor c = C24872m.m47689c();
                if (c == null) {
                    MethodCollector.m26664o(8598);
                } else if (!f58744a.compareAndSet(false, true)) {
                    MethodCollector.m26664o(8598);
                } else {
                    c.execute(new Runnable() {
                        /* class com.facebook.internal.C24764p.RunnableC247651 */

                        static {
                            Covode.recordClassIndex(28918);
                        }

                        public final void run() {
                            if (!C24677a.m47209a(this)) {
                                try {
                                    JSONObject b = C24764p.m47420b(str);
                                    if (b != null) {
                                        C24764p.m47416a(str, b);
                                        C34822d.m71158a(context, "com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(a, b.toString()).apply();
                                        C24764p.f58745b = Long.valueOf(System.currentTimeMillis());
                                    }
                                    C24764p.m47417a();
                                    C24764p.f58744a.set(false);
                                } catch (Throwable th) {
                                    C24677a.m47208a(th, this);
                                }
                            }
                        }
                    });
                    MethodCollector.m26664o(8598);
                }
            } else {
                m47417a();
                MethodCollector.m26664o(8598);
            }
        }
    }

    /* renamed from: a */
    protected static synchronized JSONObject m47416a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (C24764p.class) {
            MethodCollector.m26663i(8601);
            Map<String, JSONObject> map = f58748e;
            if (map.containsKey(str)) {
                jSONObject2 = map.get(str);
            } else {
                jSONObject2 = new JSONObject();
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("data");
            JSONObject jSONObject3 = null;
            if (optJSONArray != null) {
                jSONObject3 = optJSONArray.optJSONObject(0);
            }
            if (!(jSONObject3 == null || jSONObject3.optJSONArray("gatekeepers") == null)) {
                JSONArray optJSONArray2 = jSONObject3.optJSONArray("gatekeepers");
                for (int i = 0; i < optJSONArray2.length(); i++) {
                    try {
                        JSONObject jSONObject4 = optJSONArray2.getJSONObject(i);
                        jSONObject2.put(jSONObject4.getString("key"), jSONObject4.getBoolean("value"));
                    } catch (JSONException e) {
                        C24693ad.m47255a("FacebookSDK", (Exception) e);
                    }
                }
            }
            f58748e.put(str, jSONObject2);
            MethodCollector.m26664o(8601);
        }
        return jSONObject2;
    }

    /* renamed from: a */
    public static boolean m47419a(String str, String str2, boolean z) {
        Boolean bool;
        Map<String, Boolean> c = m47421c(str2);
        if (c.containsKey(str) && (bool = c.get(str)) != null) {
            return bool.booleanValue();
        }
        return z;
    }
}
