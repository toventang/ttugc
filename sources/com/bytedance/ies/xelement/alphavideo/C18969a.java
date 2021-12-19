package com.bytedance.ies.xelement.alphavideo;

import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.xelement.alphavideo.a */
public final class C18969a {

    /* renamed from: a */
    public static final C18970a f44899a = new C18970a((byte) 0);

    /* renamed from: b */
    private final String f44900b;

    static {
        Covode.recordClassIndex(21718);
    }

    /* renamed from: com.bytedance.ies.xelement.alphavideo.a$a */
    public static final class C18970a {
        static {
            Covode.recordClassIndex(21719);
        }

        private C18970a() {
        }

        public /* synthetic */ C18970a(byte b) {
            this();
        }
    }

    public C18969a(String str) {
        this.f44900b = str;
    }

    /* renamed from: a */
    public final void mo30101a(String str, String str2, int i) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", String.valueOf(i));
        jSONObject.put("resource_url", str);
        jSONObject.put("message", str2);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("virtual_aid", this.f44900b);
        HybridMonitor.getInstance().customReport(str, "", "alpha_video_runtime_error", jSONObject, null, null, jSONObject2, true);
    }
}
