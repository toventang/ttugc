package com.bytedance.ies.web.jsbridge2;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ies.web.jsbridge2.ai */
public final class C18324ai {

    /* renamed from: a */
    static boolean f43830a;

    static {
        Covode.recordClassIndex(20996);
    }

    /* renamed from: a */
    static String m34071a(Throwable th) {
        int i;
        StringBuilder sb = new StringBuilder("{\"code\":");
        if (th instanceof C18369y) {
            i = ((C18369y) th).f43946a;
        } else {
            i = 0;
        }
        return sb.append(i).append("}").toString();
    }

    /* renamed from: a */
    static <T> JSONObject m34072a(T t) {
        if (!(t instanceof JSONObject)) {
            return null;
        }
        try {
            t.put("code", 1);
            return t;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    static <T> String m34070a(C18343i iVar, T t) {
        String str;
        if ((t instanceof JSONObject) && f43830a && iVar.f43883b) {
            T t2 = t;
            try {
                t2.put("code", 1);
                return t2.toString();
            } catch (JSONException unused) {
            }
        }
        String a = iVar.mo29364a((Object) t);
        if (TextUtils.isEmpty(a)) {
            return "{\"code\":1}";
        }
        if (f43830a) {
            str = a.substring(1, a.length() - 1);
        } else {
            str = "";
        }
        String concat = "{\"code\":1,\"__data\":".concat(String.valueOf(a));
        if (!str.isEmpty()) {
            return concat + "," + str + "}";
        }
        return concat + "}";
    }
}
