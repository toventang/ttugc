package com.p2082ss.android.p2092ad.splash.core;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.p2092ad.splash.p2094b.C29375a;
import com.p2082ss.android.p2092ad.splash.p2109f.C29641d;
import com.p2082ss.android.p2092ad.splash.p2109f.C29644g;
import com.p2082ss.android.p2092ad.splash.p2109f.C29657l;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.m */
public class C29537m {

    /* renamed from: b */
    private static volatile C29537m f70381b;

    /* renamed from: a */
    ConcurrentHashMap<String, String> f70382a = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(35931);
    }

    private C29537m() {
    }

    /* renamed from: a */
    public static C29537m m59206a() {
        MethodCollector.m26663i(13635);
        if (f70381b == null) {
            synchronized (C29537m.class) {
                try {
                    if (f70381b == null) {
                        f70381b = new C29537m();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(13635);
                    throw th;
                }
            }
        }
        C29537m mVar = f70381b;
        MethodCollector.m26664o(13635);
        return mVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo51652b() {
        if (C29495h.f70187K) {
            if (Math.abs(System.currentTimeMillis() - C29556v.m59363a().f70433b.getLong("clear_local_cache_time", 0)) >= Math.min(C29495h.f70186J, 3600000L)) {
                C29495h.f70232h.execute(new Runnable() {
                    /* class com.p2082ss.android.p2092ad.splash.core.C29537m.RunnableC295381 */

                    static {
                        Covode.recordClassIndex(35932);
                    }

                    public final void run() {
                        String e = C29495h.m59106e();
                        if (!C29657l.m59760a(e)) {
                            C29537m.m59207a(e);
                        }
                        if (C29495h.m59095a().f70655c) {
                            String f = C29495h.m59107f();
                            if (!TextUtils.isEmpty(f) && !f.equals(e)) {
                                C29537m.m59207a(f);
                            }
                        }
                        String str = C29495h.f70185I;
                        if (!TextUtils.isEmpty(str)) {
                            C29537m.m59207a(str);
                        }
                        try {
                            JSONArray jSONArray = new JSONArray(C29556v.m59363a().mo51748g());
                            JSONArray jSONArray2 = new JSONArray();
                            long currentTimeMillis = System.currentTimeMillis();
                            for (int i = 0; i < jSONArray.length(); i++) {
                                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                                if (optJSONObject != null) {
                                    String optString = optJSONObject.optString("local_url");
                                    long optLong = optJSONObject.optLong("local_data_expire_time");
                                    if (!C29657l.m59760a(optString)) {
                                        File file = new File(optString);
                                        if (file.exists()) {
                                            if (currentTimeMillis <= optLong) {
                                                jSONArray2.put(optJSONObject);
                                            } else {
                                                C29537m.m59209a(file);
                                                C29644g.m59688b("file " + optString + " is expired, delete it ");
                                            }
                                        }
                                    }
                                }
                            }
                            C29556v.m59363a().mo51747g(jSONArray2.toString()).mo51750h();
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        C29556v a = C29556v.m59363a();
                        a.mo51764u().putLong("clear_local_cache_time", System.currentTimeMillis());
                        a.mo51750h();
                    }
                });
            }
        }
    }

    /* renamed from: c */
    public final void mo51653c() {
        ConcurrentHashMap<String, String> concurrentHashMap = this.f70382a;
        if (!(concurrentHashMap == null || concurrentHashMap.isEmpty())) {
            for (Map.Entry<String, String> entry : this.f70382a.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                    File file = new File(key);
                    if (file.exists() && !C29556v.m59363a().mo51746f(value)) {
                        m59209a(file);
                    }
                }
            }
            this.f70382a.clear();
        }
    }

    /* renamed from: a */
    static void m59207a(String str) {
        File[] listFiles;
        try {
            File file = new File(str);
            if (file.exists() && (listFiles = file.listFiles()) != null) {
                if (listFiles.length > 0) {
                    for (File file2 : listFiles) {
                        long j = C29495h.f70186J;
                        if (file2 != null) {
                            if (j > 0) {
                                if (System.currentTimeMillis() - file2.lastModified() <= j) {
                                }
                            }
                            if (file2.exists()) {
                                m59209a(file2);
                            }
                        }
                        C29644g.m59688b("file " + str + " is expired, delete it");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    static boolean m59209a(File file) {
        MethodCollector.m26663i(13696);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(13696);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(13696);
        return delete;
    }

    /* renamed from: a */
    public static void m59208a(String str, boolean z) {
        String str2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key_splash_cache_size", C29641d.m59676a(new File(str)) / 1024);
            if (z) {
                str2 = "service_ad_extra_res_disk_cache_size_in_mb";
            } else {
                str2 = "service_ad_res_disk_cache_size_in_mb";
            }
            C29375a.m58829a().mo51360a(str2, jSONObject, (JSONObject) null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
