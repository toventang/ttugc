package com.p2082ss.android.ugc.aweme.feed.param;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.param.c */
public final class C49813c {

    /* renamed from: a */
    public static final C49813c f114750a = new C49813c();

    private C49813c() {
    }

    static {
        Covode.recordClassIndex(58920);
    }

    /* renamed from: a */
    public static HashMap<String, String> m93275a(String str) {
        C89219l.m154721d(str, "");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Iterator<String> keys = jSONObject.keys();
        HashMap<String, String> hashMap = new HashMap<>();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            keys.remove();
            C89219l.m154716b(next, "");
            C89219l.m154716b(optString, "");
            hashMap.put(next, optString);
        }
        return hashMap;
    }
}
