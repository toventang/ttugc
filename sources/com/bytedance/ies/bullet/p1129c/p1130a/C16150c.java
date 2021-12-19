package com.bytedance.ies.bullet.p1129c.p1130a;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.c.a.c */
public final class C16150c {
    static {
        Covode.recordClassIndex(18443);
    }

    /* renamed from: a */
    public static final void m29991a(JSONObject jSONObject, JSONObject jSONObject2) {
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
