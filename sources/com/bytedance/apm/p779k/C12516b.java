package com.bytedance.apm.p779k;

import android.text.TextUtils;
import com.bytedance.apm.C12397c;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p767c.p769b.C12412f;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.k.b */
public final class C12516b {
    static {
        Covode.recordClassIndex(14332);
    }

    /* renamed from: a */
    public static void m22502a(C12412f fVar) {
        String b = C12538g.m22536a().mo20362b();
        JSONObject jSONObject = fVar.f30014e;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (TextUtils.isEmpty(b)) {
                b = ActivityLifeObserver.getInstance().getTopActivityClassName();
            }
            jSONObject.put("scene", b);
            jSONObject.put("process_name", C12397c.m22278a());
            jSONObject.put("is_main_process", C12397c.m22285b());
            if (jSONObject.isNull("is_front")) {
                jSONObject.put("is_front", ActivityLifeObserver.getInstance().isForeground());
            }
            fVar.f30014e = jSONObject;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public static void m22503a(C12412f fVar, boolean z) {
        fVar.f30015f = C12538g.m22536a().mo20361a(z);
    }

    /* renamed from: a */
    public static void m22504a(JSONObject jSONObject, String str) {
        jSONObject.put("timestamp", System.currentTimeMillis());
        jSONObject.put("crash_time", System.currentTimeMillis());
        jSONObject.put("is_main_process", C12397c.m22285b());
        jSONObject.put("process_name", C12397c.m22278a());
        jSONObject.put("event_type", str);
        jSONObject.put("scene", ActivityLifeObserver.getInstance().getTopActivityClassName());
    }
}
