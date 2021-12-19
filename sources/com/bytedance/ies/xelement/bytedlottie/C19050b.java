package com.bytedance.ies.xelement.bytedlottie;

import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.base.LLog;
import java.util.HashMap;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.bytedlottie.b */
public final class C19050b {

    /* renamed from: b */
    public static final C19051a f45135b = new C19051a((byte) 0);

    /* renamed from: a */
    public final String f45136a;

    /* renamed from: c */
    private HashMap<String, Long> f45137c = new HashMap<>();

    /* renamed from: d */
    private HashMap<String, Long> f45138d = new HashMap<>();

    static {
        Covode.recordClassIndex(21813);
    }

    /* renamed from: com.bytedance.ies.xelement.bytedlottie.b$a */
    public static final class C19051a {
        static {
            Covode.recordClassIndex(21814);
        }

        private C19051a() {
        }

        public /* synthetic */ C19051a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo30337a(String str) {
        if (str != null) {
            this.f45138d.put(str, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public C19050b(String str) {
        this.f45136a = str;
    }

    /* renamed from: b */
    public final void mo30340b(String str) {
        if (str != null && this.f45138d.containsKey(str)) {
            long currentTimeMillis = System.currentTimeMillis();
            Long l = this.f45138d.get(str);
            if (l != null) {
                C89219l.m154709a((Object) l, "");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("resource_url", str);
                jSONObject.put("lottie_url", str);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("cost", currentTimeMillis - l.longValue());
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("virtual_aid", this.f45136a);
                HybridMonitor.getInstance().customReport(str, "", "lottie_fetch_total_cost", jSONObject, jSONObject2, null, jSONObject3, true);
            }
        }
    }

    /* renamed from: a */
    public final void mo30339a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", "1");
        jSONObject.put("resource_url", str2);
        jSONObject.put("lottie_url", str);
        jSONObject.put("message", str3);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("virtual_aid", this.f45136a);
        HybridMonitor.getInstance().customReport(str, "", "lottie_fetch_error", jSONObject, null, null, jSONObject2, true);
    }

    /* renamed from: a */
    public final void mo30338a(String str, String str2, Float f, Float f2, Float f3, Float f4, Boolean bool) {
        if (!C89219l.m154712a(f, 0.0f)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bid", str2);
            jSONObject.put("lottie_src", str);
            jSONObject.put("frame_rate", String.valueOf(f2));
            jSONObject.put("frame_num", String.valueOf(f3));
            jSONObject.put("real_frame", String.valueOf(f));
            jSONObject.put("ideal_time", String.valueOf(f4));
            jSONObject.put("loop", String.valueOf(bool));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("virtual_aid", this.f45136a);
            LLog.m56859a("byted-lottie", "lottieUrl is " + str + ", bid is " + str2 + ", realFrame is " + f);
            HybridMonitor.getInstance().customReport(str, "", "lottie_animation_performance", jSONObject, null, null, jSONObject2, true);
        }
    }
}
