package com.p2082ss.android.socialbase.p2177a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.framwork.core.sdkmonitor.C14827k;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.p2082ss.android.socialbase.downloader.p2183f.AbstractC30440b;
import com.p2082ss.android.socialbase.downloader.p2183f.C30439a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.socialbase.a.a */
public class C30279a implements AbstractC30440b {

    /* renamed from: b */
    private static volatile C30279a f72234b;

    /* renamed from: c */
    private static volatile boolean f72235c;

    /* renamed from: a */
    public AbstractC30281b f72236a;

    /* renamed from: d */
    private String f72237d = "";

    /* renamed from: e */
    private String f72238e = "";

    /* renamed from: f */
    private long f72239f;

    static {
        Covode.recordClassIndex(36791);
    }

    private C30279a() {
    }

    /* renamed from: a */
    public static C30279a m61267a() {
        MethodCollector.m26663i(11767);
        if (f72234b == null) {
            synchronized (C30279a.class) {
                try {
                    if (f72234b == null) {
                        f72234b = new C30279a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11767);
                    throw th;
                }
            }
        }
        C30279a aVar = f72234b;
        MethodCollector.m26664o(11767);
        return aVar;
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2183f.AbstractC30440b
    /* renamed from: a */
    public final void mo53734a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        MethodCollector.m26663i(11933);
        try {
            if (!f72235c) {
                synchronized (C30279a.class) {
                    try {
                        if (!f72235c) {
                            AbstractC30281b bVar = this.f72236a;
                            if (bVar == null) {
                                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("config is null");
                                MethodCollector.m26664o(11933);
                                throw illegalArgumentException;
                            } else if (bVar.mo53735a() == null) {
                                IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("context is null");
                                MethodCollector.m26664o(11933);
                                throw illegalArgumentException2;
                            } else if (!TextUtils.isEmpty(this.f72236a.mo53736b())) {
                                try {
                                    this.f72237d = this.f72236a.mo53737c();
                                    this.f72239f = this.f72236a.mo53739e();
                                    this.f72238e = this.f72236a.mo53736b();
                                    JSONObject jSONObject4 = new JSONObject();
                                    jSONObject4.put("device_id", this.f72236a.mo53737c());
                                    jSONObject4.put("host_aid", this.f72236a.mo53736b());
                                    jSONObject4.put("channel", this.f72236a.mo53738d());
                                    jSONObject4.put("app_version", this.f72236a.mo53740f());
                                    jSONObject4.put("update_version_code", String.valueOf(this.f72236a.mo53739e()));
                                    jSONObject4.put("package_name", this.f72236a.mo53741g());
                                    jSONObject4.put("oversea", "1");
                                    String[] h = this.f72236a.mo53742h();
                                    if (h == null || h.length <= 0) {
                                        SDKMonitorUtils.m27204a("2993", Arrays.asList(C30282c.f72241a));
                                        SDKMonitorUtils.m27205b("2993", Arrays.asList(C30282c.f72242b));
                                    } else {
                                        ArrayList arrayList = new ArrayList();
                                        ArrayList arrayList2 = new ArrayList();
                                        for (String str2 : h) {
                                            arrayList.add("https://" + str2 + "/monitor/appmonitor/v2/settings");
                                            arrayList2.add("https://" + str2 + "/monitor/collect/");
                                        }
                                        SDKMonitorUtils.m27204a("2993", arrayList);
                                        SDKMonitorUtils.m27205b("2993", arrayList2);
                                    }
                                    SDKMonitorUtils.m27203a(this.f72236a.mo53735a(), "2993", jSONObject4, new C14827k.AbstractC14835a() {
                                        /* class com.p2082ss.android.socialbase.p2177a.C30279a.C302801 */

                                        static {
                                            Covode.recordClassIndex(36792);
                                        }

                                        @Override // com.bytedance.framwork.core.sdkmonitor.C14827k.AbstractC14835a
                                        /* renamed from: a */
                                        public final Map<String, String> mo21830a() {
                                            HashMap hashMap = new HashMap();
                                            hashMap.put("host_aid", String.valueOf(C30279a.this.f72236a.mo53736b()));
                                            hashMap.put("oversea", "1");
                                            return hashMap;
                                        }
                                    });
                                    f72235c = true;
                                } catch (Throwable unused) {
                                }
                            } else {
                                IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException("aid " + this.f72236a.mo53736b() + " is invalid");
                                MethodCollector.m26664o(11933);
                                throw illegalArgumentException3;
                            }
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(11933);
                        throw th;
                    }
                }
            }
            if (jSONObject != null) {
                try {
                    if (TextUtils.isEmpty(jSONObject.optString("app_id"))) {
                        jSONObject.put("app_id", this.f72238e);
                    }
                    if (TextUtils.isEmpty(jSONObject.optString("device_id"))) {
                        jSONObject.put("device_id", this.f72237d);
                        jSONObject.put("device_id_postfix", C30439a.m62031a(this.f72237d));
                    }
                    if (jSONObject.optInt("update_version") == 0) {
                        jSONObject.put("update_version", this.f72239f);
                    }
                } catch (Throwable unused2) {
                }
            }
            SDKMonitorUtils.m27201a("2993").mo23859a(str, jSONObject, jSONObject2, jSONObject3);
            MethodCollector.m26664o(11933);
        } catch (Throwable unused3) {
            MethodCollector.m26664o(11933);
        }
    }
}
