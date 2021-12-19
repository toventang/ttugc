package com.p2082ss.android.ugc.playerkit.model;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.playerkit.model.k */
public final class C84207k {

    /* renamed from: a */
    public int f188025a;

    /* renamed from: b */
    public String f188026b;

    /* renamed from: c */
    public int f188027c;

    /* renamed from: d */
    public long f188028d;

    /* renamed from: e */
    public long f188029e;

    /* renamed from: f */
    public long f188030f;

    /* renamed from: g */
    public long f188031g;

    static {
        Covode.recordClassIndex(98114);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("{taskType=");
        int i = this.f188027c;
        String str2 = "N/A";
        if (1 == i) {
            str = "player";
        } else if (2 == i) {
            str = "preloader";
        } else {
            str = str2;
        }
        StringBuilder append = sb.append(str).append(", action=");
        int i2 = this.f188025a;
        if (-1 == i2) {
            str2 = "und";
        } else if (i2 == 0) {
            str2 = "start";
        } else if (1 == i2) {
            str2 = "complete";
        } else if (2 == i2) {
            str2 = "cancel";
        }
        return append.append(str2).append(", bytesLoaded=").append(this.f188028d).append(", off=").append(this.f188030f).append(", endOff=").append(this.f188031g).append(", fileKey: ").append(this.f188026b).append('}').toString();
    }

    /* renamed from: a */
    public static JSONObject m144804a(C84207k kVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key", kVar.f188026b);
            jSONObject.put("action", kVar.f188025a);
            jSONObject.put("task_type", kVar.f188027c);
            jSONObject.put("bytes_loaded", kVar.f188028d);
            jSONObject.put("off", kVar.f188030f);
            jSONObject.put("end_off", kVar.f188031g);
            jSONObject.put("load_cost", kVar.f188029e);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
