package com.bytedance.sdk.bdlynx.p1677a.p1683f;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.sdk.bdlynx.a.f.a */
public final class C22613a {
    static {
        Covode.recordClassIndex(26429);
    }

    /* renamed from: a */
    public static final void m42644a(JSONObject jSONObject, JSONObject jSONObject2) {
        C89219l.m154719c(jSONObject, "");
        C89219l.m154719c(jSONObject2, "");
        Iterator<String> keys = jSONObject2.keys();
        C89219l.m154709a((Object) keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject.put(next, jSONObject2.opt(next));
        }
    }
}
