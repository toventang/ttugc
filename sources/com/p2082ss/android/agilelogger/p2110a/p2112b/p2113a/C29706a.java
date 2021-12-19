package com.p2082ss.android.agilelogger.p2110a.p2112b.p2113a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.agilelogger.p2110a.C29701a;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.agilelogger.a.b.a.a */
public final class C29706a implements AbstractC29707b {
    static {
        Covode.recordClassIndex(36103);
    }

    @Override // com.p2082ss.android.agilelogger.p2110a.AbstractC29704b
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo51950a(Object obj) {
        return m59880a((String) obj);
    }

    /* renamed from: a */
    private static String m59880a(String str) {
        if (str == null || str.trim().length() == 0) {
            throw new C29701a("JSON empty.");
        }
        try {
            if (str.startsWith("{")) {
                return new JSONObject(str).toString(4);
            }
            if (str.startsWith("[")) {
                return new JSONArray(str).toString(4);
            }
            throw new C29701a("JSON should start with { or [, but found ".concat(String.valueOf(str)));
        } catch (Exception e) {
            throw new C29701a("Parse JSON error. JSON string:".concat(String.valueOf(str)), e);
        }
    }
}
