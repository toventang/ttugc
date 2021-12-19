package com.bytedance.crash.p930h;

import com.bytedance.covode.number.Covode;
import org.json.JSONArray;

/* renamed from: com.bytedance.crash.h.a */
public final class C13879a {

    /* renamed from: a */
    public static boolean f33807a;

    /* renamed from: b */
    private static AbstractC13880a f33808b;

    /* renamed from: com.bytedance.crash.h.a$a */
    public interface AbstractC13880a {
        static {
            Covode.recordClassIndex(15940);
        }

        /* renamed from: a */
        JSONArray mo22359a();
    }

    static {
        Covode.recordClassIndex(15939);
    }

    /* renamed from: a */
    public static JSONArray m25107a() {
        try {
            AbstractC13880a aVar = f33808b;
            if (aVar == null) {
                return null;
            }
            return aVar.mo22359a();
        } catch (Throwable unused) {
            return null;
        }
    }
}
