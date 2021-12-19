package com.bytedance.apm.p767c.p770c;

import com.bytedance.apm.p787o.C12558a;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.c.c.a */
public class C12414a {

    /* renamed from: b */
    private static volatile C12414a f30021b;

    /* renamed from: a */
    public C12558a<JSONObject> f30022a = new C12558a<>();

    static {
        Covode.recordClassIndex(14221);
    }

    private C12414a() {
    }

    /* renamed from: a */
    public static C12414a m22354a() {
        if (f30021b == null) {
            synchronized (C12414a.class) {
                if (f30021b == null) {
                    f30021b = new C12414a();
                }
            }
        }
        return f30021b;
    }
}
