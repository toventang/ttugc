package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.ew */
public final class C80411ew {

    /* renamed from: a */
    public static final C80411ew f179971a = new C80411ew();

    private C80411ew() {
    }

    static {
        Covode.recordClassIndex(93679);
    }

    /* renamed from: a */
    public static void m139395a(String str, C33744d dVar) {
        C89219l.m154721d(dVar, "");
        if (str != null && str.length() != 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    dVar.mo59983a(next, jSONObject.getString(next));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m139396a(String str, HashMap<String, String> hashMap) {
        C89219l.m154721d(hashMap, "");
        if (str != null && str.length() != 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String string = jSONObject.getString(next);
                    C89219l.m154716b(next, "");
                    C89219l.m154716b(string, "");
                    hashMap.put(next, string);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
