package com.p2082ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.ds */
public final class C80357ds {

    /* renamed from: a */
    public static final C80357ds f179889a = new C80357ds();

    private C80357ds() {
    }

    static {
        Covode.recordClassIndex(93625);
    }

    /* renamed from: a */
    public static final String m139323a(Map<String, ? extends Object> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public static final ConcurrentHashMap<String, Object> m139324a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            ConcurrentHashMap<String, Object> concurrentHashMap = new ConcurrentHashMap<>();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                C89219l.m154716b(next, "");
                Object obj = jSONObject.get(next);
                C89219l.m154716b(obj, "");
                concurrentHashMap.put(next, obj);
            }
            return concurrentHashMap;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
