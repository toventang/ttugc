package com.bytedance.bpea.core.p872d;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bpea.core.d.b */
public final class C13384b {

    /* renamed from: a */
    public static final C13385a f32682a = new C13385a((byte) 0);

    static {
        Covode.recordClassIndex(15381);
    }

    /* renamed from: com.bytedance.bpea.core.d.b$a */
    public static final class C13385a {
        static {
            Covode.recordClassIndex(15382);
        }

        private C13385a() {
        }

        public /* synthetic */ C13385a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m24070a(JSONObject jSONObject, JSONObject jSONObject2) {
            C89219l.m154719c(jSONObject, "");
            if (jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                C89219l.m154709a((Object) keys, "");
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, jSONObject2.get(next));
                }
            }
        }
    }
}
