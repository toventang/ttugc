package com.p2082ss.android.ugc.aweme.p2355ax.p2356a;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ax.a.e */
public final class C34322e {
    static {
        Covode.recordClassIndex(41266);
    }

    /* renamed from: a */
    public static final void m70198a(JSONObject jSONObject, JSONObject jSONObject2) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(jSONObject2, "");
        Iterator<String> keys = jSONObject2.keys();
        C89219l.m154716b(keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject.put(next, jSONObject2.opt(next));
        }
    }
}
