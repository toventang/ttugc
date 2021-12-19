package com.facebook.internal;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.aa */
public final class C24690aa {

    /* renamed from: a */
    static final ConcurrentHashMap<String, JSONObject> f58618a = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(28843);
    }

    /* renamed from: a */
    public static JSONObject m47223a(String str) {
        return f58618a.get(str);
    }
}
