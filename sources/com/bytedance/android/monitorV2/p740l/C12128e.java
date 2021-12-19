package com.bytedance.android.monitorV2.p740l;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitorV2.l.e */
public final class C12128e {

    /* renamed from: a */
    public static final C12129a f29155a = new C12129a((byte) 0);

    static {
        Covode.recordClassIndex(13857);
    }

    /* renamed from: com.bytedance.android.monitorV2.l.e$a */
    public static final class C12129a {
        static {
            Covode.recordClassIndex(13858);
        }

        private C12129a() {
        }

        public /* synthetic */ C12129a(byte b) {
            this();
        }

        /* renamed from: a */
        public static JSONObject m21646a(JSONObject jSONObject) {
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject != null) {
                C12130f.m21652a(jSONObject2, "pid", C12130f.m21657c(jSONObject, "pid"));
                C12130f.m21652a(jSONObject2, "bid", C12130f.m21657c(jSONObject, "bid"));
                JSONObject d = C12130f.m21658d(jSONObject, "context");
                if (d != null) {
                    Iterator<String> keys = d.keys();
                    C89219l.m154709a((Object) keys, "");
                    while (keys.hasNext()) {
                        String next = keys.next();
                        Object obj = d.get(next);
                        if (obj != null && !(obj instanceof String)) {
                            C12130f.m21652a(d, next, obj.toString());
                        }
                    }
                    C12130f.m21651a(jSONObject2, "context", d);
                }
                C12130f.m21651a(jSONObject2, "env", C12130f.m21659e(jSONObject, "env"));
                C12130f.m21652a(jSONObject2, "release", C12130f.m21657c(jSONObject, "release"));
            }
            return jSONObject2;
        }
    }
}
