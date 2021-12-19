package com.bytedance.android.livesdk.service.p625c.p628c;

import android.os.Build;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.p250i.p251a.AbstractC4357d;
import com.bytedance.android.live.p379n.AbstractC5777j;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.utils.p653a.C11200a;
import com.bytedance.android.livesdkapi.host.AbstractC11808h;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.service.c.c.b */
public final class C10729b {

    /* renamed from: a */
    public static final C10729b f25848a = new C10729b();

    private C10729b() {
    }

    static {
        Covode.recordClassIndex(12326);
    }

    /* renamed from: a */
    static String m19318a() {
        long a = C11200a.m19851a();
        AbstractC2953a a2 = C6193a.m13435a(AbstractC11808h.class);
        C89219l.m154716b(a2, "");
        Map<String, Double> a3 = ((AbstractC11808h) a2).mo18867a();
        long a4 = C11200a.m19851a() - a;
        JSONObject jSONObject = new JSONObject();
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                jSONObject.put("cpu_speed", a3.get("cpu_speed"));
            } else {
                jSONObject.put("cpu_rate", a3.get("cpu_rate"));
            }
            jSONObject.put("cost", a4);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: b */
    static String m19320b() {
        long a = C11200a.m19851a();
        AbstractC2953a a2 = C6193a.m13435a(AbstractC11808h.class);
        C89219l.m154716b(a2, "");
        Map<String, Long> b = ((AbstractC11808h) a2).mo18870b();
        long a3 = C11200a.m19851a() - a;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("java_total", b.get("mem_java_total"));
            jSONObject.put("java_free", b.get("mem_java_free"));
            jSONObject.put("java_used", b.get("mem_java_used"));
            jSONObject.put("pss_dalvik", b.get("mem_pss_dalvik"));
            jSONObject.put("pss_native", b.get("mem_pss_native"));
            jSONObject.put("pss_total", b.get("mem_pss_total"));
            jSONObject.put("graphics", b.get("mem_graphics"));
            jSONObject.put("vmsize", b.get("mem_vmsize"));
            jSONObject.put("cost", a3);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    static String m19319a(boolean z) {
        JSONObject e;
        JSONObject jSONObject = new JSONObject();
        if (!z) {
            try {
                AbstractC2953a a = C6193a.m13435a(AbstractC4357d.class);
                C89219l.m154716b(a, "");
                AbstractC5777j livePlayController = ((AbstractC4357d) a).getLivePlayController();
                if (!(livePlayController == null || (e = livePlayController.mo11543e()) == null)) {
                    jSONObject.put("preview_fps", e.optDouble("render_fps:", -1.0d));
                    jSONObject.put("real_fps", e.optDouble("push_client_fps:", -1.0d));
                    jSONObject.put("pull_cdn_ip", e.optString("cdn_ip:", ""));
                    jSONObject.put("pull_play_url", e.optString("url:", ""));
                    jSONObject.put("pull_download_speed", e.optLong("download_Speed:", -1));
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject.toString();
    }
}
