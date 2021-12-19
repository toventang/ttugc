package com.p2082ss.ttvideoengine.p4417j;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.j.k */
public final class C86530k {

    /* renamed from: a */
    private int f194767a;

    /* renamed from: b */
    private int f194768b;

    /* renamed from: c */
    private String f194769c;

    /* renamed from: d */
    private String f194770d;

    static {
        Covode.recordClassIndex(101758);
    }

    /* renamed from: a */
    public final void mo137780a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f194767a = jSONObject.optInt("sub_id");
            this.f194768b = jSONObject.optInt("language_id");
            this.f194769c = jSONObject.optString("format");
            this.f194770d = jSONObject.optString("version");
        }
    }
}
