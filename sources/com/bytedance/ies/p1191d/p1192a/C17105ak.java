package com.bytedance.ies.p1191d.p1192a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.C89388w;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.d.a.ak */
public final class C17105ak {
    static {
        Covode.recordClassIndex(19562);
    }

    /* renamed from: b */
    public static final Map<String, String> m31594b(JSONArray jSONArray) {
        if (jSONArray == null) {
            return C89041ag.m154415a();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String optString = jSONObject.optString("key");
            C89219l.m154709a((Object) optString, "");
            String optString2 = jSONObject.optString("value");
            C89219l.m154709a((Object) optString2, "");
            linkedHashMap.put(optString, optString2);
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public static final List<String> m31591a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return C89086z.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String string = jSONArray.getString(i);
            C89219l.m154709a((Object) string, "");
            arrayList.add(string);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final Map<String, List<String>> m31595b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return C89041ag.m154415a();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        C89219l.m154709a((Object) keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            C89219l.m154709a((Object) next, "");
            linkedHashMap.put(next, m31591a(jSONObject.optJSONArray(next)));
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public static final SortedMap<String, String> m31592a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new TreeMap();
        }
        TreeMap treeMap = new TreeMap();
        Iterator<String> keys = jSONObject.keys();
        C89219l.m154709a((Object) keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            treeMap.put(next, jSONObject.getString(next));
        }
        return treeMap;
    }

    /* renamed from: c */
    public static final SortedMap<String, AbstractC17099ai> m31596c(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new TreeMap();
        }
        TreeMap treeMap = new TreeMap();
        Iterator<String> keys = jSONObject.keys();
        C89219l.m154709a((Object) keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            String string = jSONObject2.getString("value");
            String string2 = jSONObject2.getString(StringSet.type);
            C89219l.m154709a((Object) string2, "");
            Locale locale = Locale.ROOT;
            C89219l.m154709a((Object) locale, "");
            if (string2 != null) {
                String lowerCase = string2.toLowerCase(locale);
                C89219l.m154709a((Object) lowerCase, "");
                switch (lowerCase.hashCode()) {
                    case -1249586564:
                        if (!lowerCase.equals("variable")) {
                            break;
                        } else {
                            C89219l.m154709a((Object) next, "");
                            C89219l.m154709a((Object) string, "");
                            treeMap.put(next, new C17106al(string));
                            break;
                        }
                    case -892481938:
                        if (!lowerCase.equals("static")) {
                            break;
                        } else {
                            C89219l.m154709a((Object) next, "");
                            C89219l.m154709a((Object) string, "");
                            treeMap.put(next, new C17097ag(string));
                            break;
                        }
                    case -362445944:
                        if (!lowerCase.equals("pathparam")) {
                            break;
                        } else {
                            C89219l.m154709a((Object) next, "");
                            C89219l.m154709a((Object) string, "");
                            treeMap.put(next, new C17134t(string));
                            break;
                        }
                    case 107944136:
                        if (!lowerCase.equals("query")) {
                            break;
                        } else {
                            C89219l.m154709a((Object) next, "");
                            C89219l.m154709a((Object) string, "");
                            treeMap.put(next, new C17133s(string));
                            break;
                        }
                }
            } else {
                throw new C89388w("null cannot be cast to non-null type");
            }
        }
        return treeMap;
    }

    /* renamed from: a */
    public static final JSONObject m31593a(Map<String, String> map) {
        if (map == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        for (T t : map.entrySet()) {
            jSONObject.put((String) t.getKey(), t.getValue());
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static final String m31590a(String str, Map<String, String> map) {
        C89219l.m154719c(str, "");
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        String builder = buildUpon.toString();
        C89219l.m154709a((Object) builder, "");
        return builder;
    }
}
