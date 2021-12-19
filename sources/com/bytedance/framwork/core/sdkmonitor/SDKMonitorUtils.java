package com.bytedance.framwork.core.sdkmonitor;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.framwork.core.p1005c.C14806c;
import com.bytedance.framwork.core.p999b.C14781d;
import com.bytedance.framwork.core.p999b.p1000a.C14769c;
import com.bytedance.framwork.core.p999b.p1002c.C14779d;
import com.bytedance.framwork.core.p999b.p1003d.C14782a;
import com.bytedance.framwork.core.sdkmonitor.C14827k;
import com.bytedance.news.common.service.manager.C21520c;
import com.bytedance.services.apm.api.IHttpService;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class SDKMonitorUtils {

    /* renamed from: a */
    private static ConcurrentHashMap<String, C14827k> f36105a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static ConcurrentHashMap<String, List<String>> f36106b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static ConcurrentHashMap<String, List<String>> f36107c = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(16913);
    }

    /* renamed from: a */
    public static C14827k m27201a(String str) {
        MethodCollector.m26663i(13571);
        if (!TextUtils.isEmpty(str)) {
            if (f36105a.get(str) == null) {
                synchronized (SDKMonitorUtils.class) {
                    try {
                        if (f36105a.get(str) == null) {
                            f36105a.put(str, new C14827k(str));
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(13571);
                        throw th;
                    }
                }
            }
            C14827k kVar = f36105a.get(str);
            MethodCollector.m26664o(13571);
            return kVar;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("param 'aid' is not allowed to assigned empty string");
        MethodCollector.m26664o(13571);
        throw illegalArgumentException;
    }

    /* renamed from: a */
    public static List<String> m27202a(List<String> list) {
        LinkedList linkedList = new LinkedList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            try {
                linkedList.add(("https://" + new URL(it.next()).getHost()) + "/monitor/collect/");
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return linkedList;
    }

    /* renamed from: b */
    public static synchronized void m27205b(String str, List<String> list) {
        synchronized (SDKMonitorUtils.class) {
            MethodCollector.m26663i(13463);
            if (TextUtils.isEmpty(str) || C14820g.m27212a(list)) {
                MethodCollector.m26664o(13463);
                return;
            }
            f36106b.put(str, m27202a(list));
            MethodCollector.m26664o(13463);
        }
    }

    /* renamed from: a */
    public static synchronized void m27204a(String str, List<String> list) {
        synchronized (SDKMonitorUtils.class) {
            MethodCollector.m26663i(13462);
            if (TextUtils.isEmpty(str) || C14820g.m27212a(list)) {
                MethodCollector.m26664o(13462);
                return;
            }
            LinkedList linkedList = new LinkedList();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                try {
                    linkedList.add(("https://" + new URL(it.next()).getHost()) + "/monitor/appmonitor/v3/settings");
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            }
            f36107c.put(str, linkedList);
            MethodCollector.m26664o(13462);
        }
    }

    /* renamed from: a */
    public static synchronized void m27203a(Context context, String str, JSONObject jSONObject, C14827k.AbstractC14835a aVar) {
        synchronized (SDKMonitorUtils.class) {
            MethodCollector.m26663i(13516);
            if (context == null) {
                MethodCollector.m26664o(13516);
            } else if (TextUtils.isEmpty(str)) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("param 'aid' is not allowed to assigned empty string");
                MethodCollector.m26664o(13516);
                throw illegalArgumentException;
            } else if (jSONObject == null) {
                IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("param 'headerInfo' is not allowed to be null");
                MethodCollector.m26664o(13516);
                throw illegalArgumentException2;
            } else if (f36105a.get(str) == null || !f36105a.get(str).f36170q) {
                C14827k kVar = f36105a.get(str);
                if (kVar == null) {
                    kVar = new C14827k(str);
                    f36105a.put(str, kVar);
                }
                List<String> remove = f36107c.remove(str);
                if (remove != null && !C14820g.m27212a(remove)) {
                    kVar.f36167n.clear();
                    kVar.f36167n.addAll(remove);
                }
                List<String> remove2 = f36106b.remove(str);
                if (remove2 != null && !C14820g.m27212a(remove2)) {
                    kVar.f36172s.clear();
                    kVar.f36172s.addAll(remove2);
                }
                kVar.f36170q = true;
                C14782a aVar2 = C14782a.C14784a.f36049a;
                aVar2.f36044a.mo23824a(new Runnable(context, jSONObject, aVar) {
                    /* class com.bytedance.framwork.core.sdkmonitor.C14827k.RunnableC148281 */

                    /* renamed from: a */
                    final /* synthetic */ Context f36180a;

                    /* renamed from: b */
                    final /* synthetic */ JSONObject f36181b;

                    /* renamed from: c */
                    final /* synthetic */ AbstractC14835a f36182c;

                    static {
                        Covode.recordClassIndex(16929);
                    }

                    public final void run() {
                        PackageInfo packageInfo;
                        C14827k kVar = C14827k.this;
                        Context context = this.f36180a;
                        JSONObject jSONObject = this.f36181b;
                        AbstractC14835a aVar = this.f36182c;
                        if (!(context == null || jSONObject == null)) {
                            kVar.f36170q = true;
                            Context applicationContext = context.getApplicationContext();
                            if (C58003a.f132201c && applicationContext == null) {
                                applicationContext = C58003a.f132199a;
                            }
                            kVar.f36154a = applicationContext;
                            kVar.f36155b = jSONObject;
                            try {
                                kVar.f36155b.put("aid", kVar.f36174u);
                                kVar.f36155b.put("os", "Android");
                                kVar.f36155b.put("device_platform", "android");
                                kVar.f36155b.put("os_version", Build.VERSION.RELEASE);
                                kVar.f36155b.put("os_api", Build.VERSION.SDK_INT);
                                kVar.f36155b.put("device_model", Build.MODEL);
                                kVar.f36155b.put("device_brand", Build.BRAND);
                                kVar.f36155b.put("device_manufacturer", Build.MANUFACTURER);
                                kVar.f36155b.put("sdkmonitor_version", "2.0.35");
                                kVar.f36155b.put("monitor_from", "sdk");
                                if (TextUtils.isEmpty(kVar.f36155b.optString("package_name"))) {
                                    kVar.f36155b.put("package_name", context.getPackageName());
                                }
                                boolean z = false;
                                if (TextUtils.isEmpty(kVar.f36155b.optString("version_name"))) {
                                    packageInfo = kVar.f36154a.getPackageManager().getPackageInfo(kVar.f36154a.getPackageName(), 0);
                                    kVar.f36155b.put("version_name", packageInfo.versionName);
                                } else {
                                    packageInfo = null;
                                }
                                if (TextUtils.isEmpty(kVar.f36155b.optString("version_code"))) {
                                    if (packageInfo == null) {
                                        packageInfo = kVar.f36154a.getPackageManager().getPackageInfo(kVar.f36154a.getPackageName(), 0);
                                    }
                                    kVar.f36155b.put("version_code", packageInfo.versionCode);
                                }
                                kVar.f36165l = aVar;
                                if (kVar.f36165l == null) {
                                    kVar.f36165l = new AbstractC14835a() {
                                        /* class com.bytedance.framwork.core.sdkmonitor.C14827k.C148292 */

                                        static {
                                            Covode.recordClassIndex(16930);
                                        }

                                        @Override // com.bytedance.framwork.core.sdkmonitor.C14827k.AbstractC14835a
                                        /* renamed from: a */
                                        public final Map<String, String> mo21830a() {
                                            return null;
                                        }
                                    };
                                }
                                kVar.f36166m = kVar.f36165l.mo21830a();
                                if (kVar.f36166m == null) {
                                    kVar.f36166m = new HashMap();
                                }
                                kVar.f36175v = TextUtils.equals(kVar.f36166m.get("oversea"), "1");
                                kVar.f36166m.put("aid", kVar.f36174u);
                                kVar.f36166m.put("device_id", kVar.f36155b.optString("device_id"));
                                kVar.f36166m.put("device_platform", "android");
                                kVar.f36166m.put("package_name", kVar.f36155b.optString("package_name"));
                                kVar.f36166m.put("channel", kVar.f36155b.optString("channel"));
                                kVar.f36166m.put("app_version", kVar.f36155b.optString("app_version"));
                                kVar.f36166m.put("sdkmonitor_version", "2.0.35");
                                kVar.f36166m.put("minor_version", "1");
                                C14769c.f35985b.put(kVar.f36174u, kVar);
                                C14779d.f36032a.put(kVar.f36174u, kVar);
                                C148314 r1 = new C14806c.AbstractC14808b() {
                                    /* class com.bytedance.framwork.core.sdkmonitor.C14827k.C148314 */

                                    static {
                                        Covode.recordClassIndex(16932);
                                    }

                                    @Override // com.bytedance.framwork.core.p1005c.C14806c.AbstractC14808b
                                    /* renamed from: a */
                                    public final boolean mo23834a(Context context) {
                                        return C14823j.m27222b(context);
                                    }
                                };
                                if (!C14806c.f36085b) {
                                    C14806c.f36084a = r1;
                                    C14806c.f36085b = true;
                                }
                                kVar.f36156c = new C14781d(kVar.f36154a, kVar.f36174u);
                                C14782a.C14784a.f36049a.mo23818a(kVar.f36156c);
                                kVar.f36160g = (IHttpService) C21520c.m40424a(IHttpService.class);
                                SharedPreferences i = kVar.mo23866i();
                                String string = i.getString("monitor_net_config", null);
                                kVar.f36158e = i.getLong("monitor_configure_refresh_time", 0);
                                if (i.getInt("monitor_config_update", 0) == 1) {
                                    z = true;
                                }
                                C14782a.C14784a.f36049a.mo23818a(kVar);
                                if (!TextUtils.isEmpty(string)) {
                                    try {
                                        kVar.f36171r = true;
                                        JSONObject jSONObject2 = new JSONObject(string);
                                        if (!z) {
                                            jSONObject2.remove("report_host_new");
                                        }
                                        kVar.mo23860a(jSONObject2);
                                    } catch (Exception unused) {
                                    }
                                }
                                kVar.mo23867j();
                            } catch (Exception unused2) {
                            }
                        }
                        if (C14827k.this.f36171r) {
                            C14827k.this.f36173t.mo23845a(C14827k.this);
                        }
                    }

                    {
                        this.f36180a = r2;
                        this.f36181b = r3;
                        this.f36182c = r4;
                    }
                }, 5000);
                MethodCollector.m26664o(13516);
            } else {
                MethodCollector.m26664o(13516);
            }
        }
    }
}
