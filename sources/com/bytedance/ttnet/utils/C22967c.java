package com.bytedance.ttnet.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.p995g.C14757g;
import com.bytedance.ttnet.C22916b;
import org.json.JSONObject;

/* renamed from: com.bytedance.ttnet.utils.c */
public final class C22967c {

    /* renamed from: a */
    public static AbstractC22969b f54319a;

    /* renamed from: b */
    public static AbstractC22968a f54320b;

    /* renamed from: c */
    public static volatile boolean f54321c = true;

    /* renamed from: com.bytedance.ttnet.utils.c$a */
    public interface AbstractC22968a {
        static {
            Covode.recordClassIndex(26885);
        }
    }

    /* renamed from: com.bytedance.ttnet.utils.c$b */
    public interface AbstractC22969b {
        static {
            Covode.recordClassIndex(26886);
        }

        /* renamed from: a */
        void mo37226a(String str, int i, boolean z, JSONObject jSONObject);
    }

    static {
        Covode.recordClassIndex(26884);
    }

    /* renamed from: a */
    public static String m43299a(String str) {
        if (!f54321c) {
            return null;
        }
        try {
            if (C14757g.m27060a(str).getHost().endsWith(C22916b.m43214a())) {
                return String.valueOf(System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
