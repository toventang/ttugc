package com.p2082ss.ttvideoengine.p4417j;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.j.r */
public final class C86538r {

    /* renamed from: a */
    public float f194938a = -1.0f;

    /* renamed from: b */
    public float f194939b = -1.0f;

    /* renamed from: c */
    public int f194940c = 1;

    /* renamed from: d */
    private float f194941d = -1.0f;

    /* renamed from: e */
    private float f194942e = -1.0f;

    static {
        Covode.recordClassIndex(101766);
    }

    /* renamed from: a */
    public final void mo137801a(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (jSONObject.has("opening") || jSONObject.has("ending")) {
                this.f194940c = 1;
                try {
                    this.f194938a = (float) jSONObject.optDouble("opening");
                    this.f194939b = (float) jSONObject.optDouble("ending");
                } catch (Exception unused) {
                }
            } else if (jSONObject.has("Ending") || jSONObject.has("Opening")) {
                this.f194940c = 2;
                try {
                    this.f194941d = (float) jSONObject.optDouble("Opening");
                    this.f194942e = (float) jSONObject.optDouble("Ending");
                } catch (Exception unused2) {
                }
            }
        }
    }
}
