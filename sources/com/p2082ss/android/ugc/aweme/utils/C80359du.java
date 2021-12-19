package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.C28027t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.du */
public final class C80359du {
    static {
        Covode.recordClassIndex(93627);
    }

    /* renamed from: b */
    public static final JSONObject m139329b(String str) {
        boolean z;
        String str2;
        if (str != null) {
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str2 = str;
            } else {
                str2 = null;
            }
            if (str2 != null) {
                try {
                    return new JSONObject(str);
                } catch (JSONException unused) {
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final JSONArray m139328a(String str) {
        boolean z;
        String str2;
        if (str != null) {
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str2 = str;
            } else {
                str2 = null;
            }
            if (str2 != null) {
                try {
                    return new JSONArray(str);
                } catch (JSONException unused) {
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final <T> T m139327a(C27910f fVar, String str, Class<T> cls) {
        boolean z;
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(cls, "");
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            return (T) fVar.mo46670a(str, (Class) cls);
        } catch (C28027t unused) {
            return null;
        }
    }
}
