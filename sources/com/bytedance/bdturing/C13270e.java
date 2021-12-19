package com.bytedance.bdturing;

import android.text.TextUtils;
import com.bytedance.bdturing.C13241a;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.bdturing.e */
public final class C13270e {

    /* renamed from: a */
    static long f32453a;

    static {
        Covode.recordClassIndex(15232);
    }

    /* renamed from: com.bytedance.bdturing.e$a */
    public enum EnumC13271a {
        CLOSE_REASON_MASK("mask_click_close"),
        CLOSE_REASON_BACK("back_close"),
        CLOSE_REASON_APP("app_close"),
        CLOSE_FB_MASK("close_fb_mask"),
        CLOSE_FB_CLOSE("close_fb_close"),
        CLOSE_FB_FEEDBACK("close_fb_feedback"),
        CLOSE_FB_SYSTEM("close_fb_system");
        

        /* renamed from: a */
        private String f32455a;

        public final String getName() {
            return this.f32455a;
        }

        static {
            Covode.recordClassIndex(15233);
        }

        private EnumC13271a(String str) {
            this.f32455a = str;
        }
    }

    /* renamed from: a */
    public static void m23846a() {
        f32453a = System.currentTimeMillis();
    }

    /* renamed from: b */
    public static void m23850b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key", "pop");
            m23849a("turing_verify_sdk", jSONObject);
        } catch (JSONException e) {
            C13285g.m23900a(e);
        }
    }

    /* renamed from: c */
    public static void m23851c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key", "system_low");
            m23849a("turing_verify_sdk", jSONObject);
        } catch (JSONException e) {
            C13285g.m23900a(e);
        }
    }

    /* renamed from: a */
    public static void m23847a(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result", i);
            jSONObject.put("key", "orientation");
            m23849a("turing_verify_sdk", jSONObject);
        } catch (JSONException e) {
            C13285g.m23900a(e);
        }
    }

    /* renamed from: a */
    public static void m23848a(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", System.currentTimeMillis() - f32453a);
            jSONObject.put("result", i);
            jSONObject.put("custom", str);
            jSONObject.put("key", "load_webview");
            m23849a("turing_verify_sdk", jSONObject);
        } catch (JSONException e) {
            C13285g.m23900a(e);
        }
    }

    /* renamed from: a */
    public static void m23849a(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str)) {
            try {
                C13252c cVar = C13241a.C13243a.f32360a.f32353a;
                jSONObject.put("params_for_special", "turing");
                if (cVar != null) {
                    jSONObject.put("sdk_version", cVar.f32379f);
                    jSONObject.put("host_app_id", cVar.f32375b);
                }
                cVar.f32394u.mo21440a(str, jSONObject);
                if (C13285g.m23902a()) {
                    C13285g.m23905d(jSONObject.toString());
                }
            } catch (Exception e) {
                C13285g.m23900a(e);
            }
        }
    }
}
