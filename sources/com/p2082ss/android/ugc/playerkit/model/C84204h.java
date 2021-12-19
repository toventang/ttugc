package com.p2082ss.android.ugc.playerkit.model;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.playerkit.model.h */
public final class C84204h {

    /* renamed from: a */
    public String f188018a;

    /* renamed from: b */
    public int f188019b;

    /* renamed from: c */
    public long f188020c;

    /* renamed from: d */
    public long f188021d;

    static {
        Covode.recordClassIndex(98111);
    }

    /* renamed from: a */
    public static JSONObject m144802a(C84204h hVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", hVar.f188018a);
            jSONObject.put("stage", hVar.f188019b);
            jSONObject.put("start", hVar.f188020c);
            jSONObject.put("end", hVar.f188021d);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
