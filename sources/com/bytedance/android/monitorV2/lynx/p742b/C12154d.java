package com.bytedance.android.monitorV2.lynx.p742b;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitorV2.lynx.b.d */
public final class C12154d {

    /* renamed from: a */
    public final Map<String, JSONObject> f29211a = new WeakHashMap();

    static {
        Covode.recordClassIndex(13883);
    }

    /* renamed from: a */
    public final JSONObject mo19517a(String str) {
        return this.f29211a.get(str);
    }

    /* renamed from: a */
    public final void mo19518a(String str, JSONObject jSONObject) {
        C89219l.m154719c(jSONObject, "");
        if (str != null && str.length() != 0) {
            this.f29211a.put(str, jSONObject);
        }
    }
}
