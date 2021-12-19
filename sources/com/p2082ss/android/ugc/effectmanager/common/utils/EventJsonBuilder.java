package com.p2082ss.android.ugc.effectmanager.common.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.effectmanager.common.utils.EventJsonBuilder */
public class EventJsonBuilder {
    private HashMap<String, Object> mHashMap = new HashMap<>();

    static {
        Covode.recordClassIndex(95514);
    }

    private static void check(Object obj) {
    }

    public HashMap<String, Object> getHasMap() {
        return this.mHashMap;
    }

    public static EventJsonBuilder newBuilder() {
        return new EventJsonBuilder();
    }

    public synchronized JSONObject build() {
        JSONObject jSONObject;
        MethodCollector.m26663i(5302);
        try {
            jSONObject = new JSONObject(this.mHashMap);
            MethodCollector.m26664o(5302);
        } catch (Exception e) {
            e.printStackTrace();
            MethodCollector.m26664o(5302);
            return null;
        }
        return jSONObject;
    }

    public static EventJsonBuilder fromJSONObject(JSONObject jSONObject) {
        EventJsonBuilder newBuilder = newBuilder();
        if (jSONObject != null && jSONObject.length() > 0) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    newBuilder.addValuePair(next, jSONObject.getString(next));
                } catch (JSONException unused) {
                }
            }
        }
        return newBuilder;
    }

    public EventJsonBuilder addValuePair(String str, Boolean bool) {
        check(this.mHashMap.put(str, bool));
        return this;
    }

    public EventJsonBuilder addValuePair(String str, Double d) {
        check(this.mHashMap.put(str, d));
        return this;
    }

    public EventJsonBuilder addValuePair(String str, Float f) {
        check(this.mHashMap.put(str, f));
        return this;
    }

    public EventJsonBuilder addValuePair(String str, Integer num) {
        check(this.mHashMap.put(str, num));
        return this;
    }

    public EventJsonBuilder addValuePair(String str, Long l) {
        check(this.mHashMap.put(str, l));
        return this;
    }

    public EventJsonBuilder addValuePair(String str, String str2) {
        check(this.mHashMap.put(str, str2));
        return this;
    }

    public EventJsonBuilder addValuePair(String str, List<String> list) {
        check(this.mHashMap.put(str, list));
        return this;
    }
}
