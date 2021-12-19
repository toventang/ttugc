package com.bytedance.p1748w.p1749a;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.w.a.a */
public final class C23544a {

    /* renamed from: a */
    private final long f55764a;

    /* renamed from: b */
    private final String f55765b;

    /* renamed from: c */
    private final Map<String, String> f55766c;

    static {
        Covode.recordClassIndex(27642);
    }

    /* renamed from: a */
    public final JSONObject mo38629a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("timestamp", this.f55764a);
            jSONObject.put("message", this.f55765b);
            Map<String, String> map = this.f55766c;
            if (map != null && map.size() > 0) {
                jSONObject.put("fields", new JSONObject(this.f55766c));
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
