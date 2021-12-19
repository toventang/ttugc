package com.bytedance.android.livesdk.p442ai;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3964w;
import com.bytedance.android.live.p250i.p251a.AbstractC4356c;
import com.bytedance.android.live.p250i.p251a.AbstractC4357d;
import com.bytedance.android.live.p250i.p252b.C4360b;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePlayerPushStreamLogCpuMemoryOptimizationSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePlayerPullStreamLogCpuMemoryOptimizationSetting;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6552h;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.lancet.p3386c.C58014b;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.ai.n */
public class C6741n implements AbstractC4356c {

    /* renamed from: a */
    boolean f16729a;

    /* renamed from: b */
    float f16730b;

    /* renamed from: c */
    int f16731c;

    /* renamed from: d */
    int f16732d;

    /* renamed from: e */
    String f16733e;

    /* renamed from: f */
    String f16734f;

    /* renamed from: g */
    private String f16735g = "tt";

    static {
        Covode.recordClassIndex(7479);
    }

    public C6741n() {
        C6552h.m14010a().mo12687a(C6745o.f16750a);
        try {
            this.f16733e = ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getCpuInfoFetcher().mo10102a();
            this.f16734f = ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getGpuInfoFetcher().mo10104a(null);
            if (this.f16733e == null) {
                ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getCpuInfoFetcher().mo10103a(new C6746p(this));
            }
        } catch (Throwable th) {
            C3854a.m9458a("LivePlayerLog", th);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.ai.n$b */
    static class CallableC6743b implements Callable {

        /* renamed from: a */
        private final float f16736a;

        /* renamed from: b */
        private final JSONObject f16737b;

        /* renamed from: c */
        private int f16738c;

        /* renamed from: d */
        private int f16739d;

        /* renamed from: e */
        private String f16740e;

        /* renamed from: f */
        private String f16741f;

        /* renamed from: g */
        private String f16742g;

        static {
            Covode.recordClassIndex(7481);
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            try {
                if (LivePlayerPushStreamLogCpuMemoryOptimizationSetting.INSTANCE.isEnable()) {
                    Map<String, Double> cpuRateEnableCache = LivePerformanceManager.getInstance().getCpuRateEnableCache();
                    if (cpuRateEnableCache != null && cpuRateEnableCache.size() > 0) {
                        this.f16737b.put("cpu_speed_rate", cpuRateEnableCache.get("cpu_speed"));
                        this.f16737b.put("cpu", cpuRateEnableCache.get("cpu_rate"));
                    }
                    Map<String, Long> memoryEnableCache = LivePerformanceManager.getInstance().getMemoryEnableCache();
                    Long l = memoryEnableCache.get("mem_pss_dalvik");
                    if (l != null && l.longValue() > 0) {
                        this.f16737b.put("dalvik_pss", l);
                    }
                    Long l2 = memoryEnableCache.get("mem_pss_total");
                    float f = -1.0f;
                    if (l2 != null) {
                        f = (((float) l2.longValue()) / 1024.0f) / 1024.0f;
                    }
                    this.f16737b.put("memory", (int) f);
                } else {
                    Map<String, Double> cpuRates = LivePerformanceManager.getInstance().getCpuRates();
                    if (cpuRates != null && cpuRates.size() > 0) {
                        this.f16737b.put("cpu_speed_rate", cpuRates.get("cpu_speed"));
                        this.f16737b.put("cpu", cpuRates.get("cpu_rate"));
                    }
                    long dalvikPss = LivePerformanceManager.getInstance().getDalvikPss();
                    if (dalvikPss > 0) {
                        this.f16737b.put("dalvik_pss", dalvikPss);
                    }
                    float a = ((float) C3964w.m9651a()) / 1024.0f;
                    float f2 = a - this.f16736a;
                    this.f16737b.put("memory", (int) a);
                    this.f16737b.put("live_push_memory", (int) f2);
                    this.f16737b.put("start_memory", (int) this.f16736a);
                }
                this.f16737b.put("product_line", "live");
                Context context = ((IHostContext) C6193a.m13435a(IHostContext.class)).context();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("data", this.f16737b);
                jSONObject.put("did", AppLog.getServerDeviceId());
                jSONObject.put("uid", C11115u.m19743a().mo17915b().mo13161c());
                if (TextUtils.isEmpty(C58029j.f132254f) || !C58029j.m104846b() || C58029j.m104847c()) {
                    C58029j.f132254f = NetworkUtils.getNetworkAccessType(context);
                }
                jSONObject.put("net_type", C58029j.f132254f);
                jSONObject.put("net_des", NetworkUtils.getNetworkOperatorCode(context));
                if (m14403a(context.getPackageManager(), context.getPackageName()).metaData != null) {
                    jSONObject.put("app_version_four", m14403a(context.getPackageManager(), context.getPackageName()).metaData.getInt("UPDATE_VERSION_CODE"));
                }
                C3854a.m9453a(4, "LivePlayerLog", jSONObject.toString());
                this.f16737b.put("channel", ((IHostContext) C6193a.m13435a(IHostContext.class)).getChannel());
                this.f16737b.put("device_name", Build.MODEL);
                this.f16737b.put("screen_height", this.f16738c);
                this.f16737b.put("screen_width", this.f16739d);
                C6741n.m14399a(this.f16740e, this.f16741f, this.f16737b);
                C3868c.m9495a(this.f16742g, (String) null, this.f16737b);
            } catch (Throwable unused) {
            }
            return null;
        }

        /* renamed from: a */
        private static ApplicationInfo m14403a(PackageManager packageManager, String str) {
            if (!TextUtils.equals(str, C17867d.m33078a().getPackageName())) {
                return packageManager.getApplicationInfo(str, 128);
            }
            if (C58014b.f132218a == null) {
                C58014b.f132218a = packageManager.getApplicationInfo(str, 128);
            }
            return C58014b.f132218a;
        }

        private CallableC6743b(int i, int i2, float f, String str, String str2, JSONObject jSONObject, String str3) {
            this.f16738c = i;
            this.f16739d = i2;
            this.f16736a = f;
            this.f16740e = str;
            this.f16741f = str2;
            this.f16737b = jSONObject;
            this.f16742g = str3;
        }

        /* synthetic */ CallableC6743b(int i, int i2, float f, String str, String str2, JSONObject jSONObject, String str3, byte b) {
            this(i, i2, f, str, str2, jSONObject, str3);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.ai.n$c */
    static class CallableC6744c implements Callable {

        /* renamed from: a */
        private final float f16743a;

        /* renamed from: b */
        private final JSONObject f16744b;

        /* renamed from: c */
        private int f16745c;

        /* renamed from: d */
        private int f16746d;

        /* renamed from: e */
        private String f16747e;

        /* renamed from: f */
        private String f16748f;

        /* renamed from: g */
        private String f16749g;

        static {
            Covode.recordClassIndex(7482);
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            try {
                JSONObject jSONObject = this.f16744b;
                if (jSONObject != null) {
                    try {
                        String optString = jSONObject.optString("event_key");
                        if (TextUtils.equals(optString, "play_stop")) {
                            C6501b.C6502a.m13948a("livesdk_play_sr_support").mo12645a("sr_used", this.f16744b.optInt("sr_used", -1)).mo12655b();
                        }
                        boolean equals = TextUtils.equals(optString, "playing");
                        if (equals && this.f16744b.optInt("index", -1) == 1 && this.f16744b.optInt("is_preview", -1) == 1) {
                            LivePerformanceManager.getInstance().reportPreviewFeedFirstFps(Double.valueOf(this.f16744b.optDouble("render_fps", -1.0d)));
                        }
                        if (!LivePlayerPullStreamLogCpuMemoryOptimizationSetting.INSTANCE.isEnable()) {
                            if (equals) {
                                Map<String, Double> cpuRates = LivePerformanceManager.getInstance().getCpuRates();
                                if (cpuRates != null && cpuRates.size() > 0) {
                                    this.f16744b.put("cpu_speed_rate", cpuRates.get("cpu_speed"));
                                    this.f16744b.put("cpu", cpuRates.get("cpu_rate"));
                                }
                                long dalvikPss = LivePerformanceManager.getInstance().getDalvikPss();
                                if (dalvikPss > 0) {
                                    this.f16744b.put("dalvik_pss", dalvikPss);
                                }
                            }
                            float a = ((float) C3964w.m9651a()) / 1024.0f;
                            float f = a - this.f16743a;
                            this.f16744b.put("memory", (int) a);
                            this.f16744b.put("live_pull_memory", (int) f);
                            this.f16744b.put("start_memory", (int) this.f16743a);
                        } else if (TextUtils.equals(optString, "first_frame") || TextUtils.equals(optString, "render_stall") || TextUtils.equals(optString, "decode_stall") || equals) {
                            Map<String, Double> cpuRateEnableCache = LivePerformanceManager.getInstance().getCpuRateEnableCache();
                            if (cpuRateEnableCache != null && cpuRateEnableCache.size() > 0) {
                                this.f16744b.put("cpu_speed_rate", cpuRateEnableCache.get("cpu_speed"));
                                this.f16744b.put("cpu", cpuRateEnableCache.get("cpu_rate"));
                            }
                            Map<String, Long> memoryEnableCache = LivePerformanceManager.getInstance().getMemoryEnableCache();
                            Long l = memoryEnableCache.get("mem_pss_dalvik");
                            if (l != null && l.longValue() > 0) {
                                this.f16744b.put("dalvik_pss", l);
                            }
                            Long l2 = memoryEnableCache.get("mem_pss_total");
                            float f2 = -1.0f;
                            if (l2 != null) {
                                f2 = (((float) l2.longValue()) / 1024.0f) / 1024.0f;
                            }
                            this.f16744b.put("memory", (int) f2);
                        }
                        Context context = ((IHostContext) C6193a.m13435a(IHostContext.class)).context();
                        this.f16744b.put("channel", ((IHostContext) C6193a.m13435a(IHostContext.class)).getChannel());
                        this.f16744b.put("device_name", Build.MODEL);
                        this.f16744b.put("did", AppLog.getServerDeviceId());
                        this.f16744b.put("uid", C11115u.m19743a().mo17915b().mo13161c());
                        JSONObject jSONObject2 = this.f16744b;
                        if (TextUtils.isEmpty(C58029j.f132254f) || !C58029j.m104846b() || C58029j.m104847c()) {
                            C58029j.f132254f = NetworkUtils.getNetworkAccessType(context);
                        }
                        jSONObject2.put("net_type", C58029j.f132254f);
                        this.f16744b.put("net_des", NetworkUtils.getNetworkOperatorCode(context));
                        if (m14404a(context.getPackageManager(), context.getPackageName()).metaData != null) {
                            this.f16744b.put("app_version_four", m14404a(context.getPackageManager(), context.getPackageName()).metaData.getInt("UPDATE_VERSION_CODE"));
                        }
                        this.f16744b.put("ttlive_sdk_version", "2150");
                        this.f16744b.put("screen_height", this.f16745c);
                        this.f16744b.put("screen_width", this.f16746d);
                        C6741n.m14399a(this.f16747e, this.f16748f, this.f16744b);
                        C3868c.m9495a(this.f16749g, (String) null, this.f16744b);
                    } catch (Throwable th) {
                        C3854a.m9458a("LivePlayerLog", th);
                    }
                }
            } catch (Throwable unused) {
            }
            return null;
        }

        /* renamed from: a */
        private static ApplicationInfo m14404a(PackageManager packageManager, String str) {
            if (!TextUtils.equals(str, C17867d.m33078a().getPackageName())) {
                return packageManager.getApplicationInfo(str, 128);
            }
            if (C58014b.f132218a == null) {
                C58014b.f132218a = packageManager.getApplicationInfo(str, 128);
            }
            return C58014b.f132218a;
        }

        CallableC6744c(int i, int i2, float f, String str, String str2, JSONObject jSONObject, String str3) {
            this.f16745c = i;
            this.f16746d = i2;
            this.f16743a = f;
            this.f16747e = str;
            this.f16748f = str2;
            this.f16744b = jSONObject;
            this.f16749g = str3;
        }
    }

    @Override // com.bytedance.android.live.p250i.p251a.AbstractC4356c
    /* renamed from: a */
    public final void mo10106a(String str) {
        this.f16734f = str;
    }

    /* renamed from: com.bytedance.android.livesdk.ai.n$a */
    public static final class C6742a implements C4360b.AbstractC4362b<C6741n> {
        static {
            Covode.recordClassIndex(7480);
        }

        @Override // com.bytedance.android.live.p250i.p252b.C4360b.AbstractC4362b
        /* renamed from: a */
        public final C4360b.AbstractC4362b.C4363a<C6741n> mo10117a(C4360b.AbstractC4362b.C4363a<C6741n> aVar) {
            aVar.f11884a = (R) new C6741n();
            aVar.f11885b = true;
            return aVar;
        }
    }

    @Override // com.bytedance.android.live.p250i.p251a.AbstractC4356c
    /* renamed from: a */
    public final void mo10107a(JSONObject jSONObject, String str) {
        C6552h.m14010a().mo12689a(new CallableC6744c(this.f16731c, this.f16732d, this.f16730b, this.f16733e, this.f16734f, jSONObject, str));
    }

    /* renamed from: a */
    public static void m14399a(String str, String str2, JSONObject jSONObject) {
        if (str != null) {
            jSONObject.put("cpu_soc", str);
        }
        if (str2 != null) {
            jSONObject.put("gpu_name", str2);
        }
    }
}
