package com.facebook.internal.p1899b.p1900a;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.facebook.C24872m;
import com.facebook.GraphRequest;
import com.facebook.internal.C24699ae;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.internal.p1899b.AbstractC24726d;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.b.a.b */
public class C24715b {

    /* renamed from: a */
    static Integer f58684a = 1000;

    /* renamed from: b */
    static boolean f58685b;

    /* renamed from: c */
    static final AbstractC24726d f58686c = C24717c.m47337a(C24719d.m47340c(), C24720e.m47345b());

    /* renamed from: d */
    static final Map<String, Integer> f58687d = new HashMap();

    /* renamed from: e */
    private static final Random f58688e = new Random();

    /* renamed from: f */
    private static final C24714a f58689f = C24714a.m47334a();

    /* renamed from: g */
    private static final AtomicLong f58690g = new AtomicLong(0);

    private C24715b() {
    }

    static {
        Covode.recordClassIndex(28868);
    }

    /* renamed from: a */
    static JSONObject m47335a() {
        if (C24677a.m47209a(C24715b.class)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fields", "monitoring_config");
            C24699ae.m47299a();
            GraphRequest a = GraphRequest.m45068a(C24872m.f59041a);
            a.f56463n = true;
            a.f56459j = bundle;
            return GraphRequest.m45069a(a).f59153b;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24715b.class);
            return null;
        }
    }
}
