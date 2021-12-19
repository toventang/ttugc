package com.bytedance.crash.p932j;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.entity.C13862a;
import com.bytedance.crash.entity.C13864b;
import com.bytedance.crash.util.C14062n;
import com.bytedance.crash.util.C14075v;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.j.c */
public final class C13900c {
    static {
        Covode.recordClassIndex(15960);
    }

    /* renamed from: a */
    public static boolean m25153a(JSONObject jSONObject, JSONArray jSONArray, C13862a.AbstractC13863a aVar) {
        JSONObject optJSONObject;
        if (C14062n.m25595a(jSONArray)) {
            C14075v.m25650a("uploadFromFile with empty aid Data ");
            return aVar.mo22265a(jSONObject);
        }
        int i = 0;
        boolean z = true;
        while (i < jSONArray.length() && (optJSONObject = jSONArray.optJSONObject(i)) != null) {
            JSONObject jSONObject2 = new JSONObject();
            C13864b.m25061b(jSONObject2, jSONObject);
            C13864b.m25061b(jSONObject2, optJSONObject);
            C14075v.m25650a("uploadFromFile with aidData ".concat(String.valueOf(optJSONObject)));
            z &= aVar.mo22265a(jSONObject2);
            i++;
        }
        return z;
    }
}
