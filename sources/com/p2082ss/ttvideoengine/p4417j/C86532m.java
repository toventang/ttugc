package com.p2082ss.ttvideoengine.p4417j;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.j.m */
public final class C86532m {

    /* renamed from: a */
    private String f194780a;

    /* renamed from: b */
    private String f194781b;

    /* renamed from: c */
    private String f194782c;

    static {
        Covode.recordClassIndex(101760);
    }

    /* renamed from: a */
    public final String mo137781a(int i) {
        if (i == 108) {
            return this.f194781b;
        }
        if (i == 109) {
            return this.f194782c;
        }
        if (i != 215) {
            return "";
        }
        return this.f194780a;
    }

    /* renamed from: a */
    public final void mo137782a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f194780a = jSONObject.optString("AdaptiveType");
            this.f194781b = jSONObject.optString("MainPlayUrl");
            this.f194782c = jSONObject.optString("BackupPlayUrl");
        }
    }
}
