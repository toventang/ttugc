package com.p2082ss.android.ugc.aweme.settingsrequest.p3739b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16050d;
import com.bytedance.ies.abmock.C16073e;
import com.bytedance.ies.abmock.C16075f;
import com.bytedance.ies.abmock.ConfigItem;
import com.bytedance.ies.abmock.datacenter.p1118c.C16063e;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.settingsrequest.b.a */
public final class C68783a {

    /* renamed from: a */
    public static final C68783a f153838a = new C68783a();

    private C68783a() {
    }

    static {
        Covode.recordClassIndex(81060);
    }

    /* renamed from: a */
    private static String m121252a() {
        Map<String, ConfigItem> map = C16075f.f38715a;
        C89219l.m154716b(map, "");
        C28022o oVar = new C28022o();
        if (map != null) {
            for (Map.Entry<String, ConfigItem> entry : map.entrySet()) {
                m121254a(oVar, entry.getKey(), m121251a(entry.getKey()));
            }
        }
        Map<String, Object> map2 = C16050d.f38667a;
        if (map2 != null) {
            for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
                String key = entry2.getKey();
                C89219l.m154716b(key, "");
                m121254a(oVar, key, entry2.getValue());
            }
        }
        C16063e eVar = C16063e.f38688a;
        C89219l.m154716b(eVar, "");
        Set<String> b = eVar.mo25484b();
        if (b != null) {
            for (T t : b) {
                C89219l.m154716b(t, "");
                m121254a(oVar, t, C16063e.f38688a.mo25482a((String) t));
            }
        }
        String oVar2 = oVar.toString();
        C89219l.m154716b(oVar2, "");
        return oVar2;
    }

    /* renamed from: a */
    public static Object m121251a(String str) {
        C89219l.m154721d(str, "");
        C16073e.m29864a();
        return C16073e.m29869b(str, false);
    }

    /* renamed from: a */
    public static Map<String, Object> m121253a(List<String> list) {
        C89219l.m154721d(list, "");
        try {
            if (list.isEmpty()) {
                Map<String, ConfigItem> map = C16075f.f38715a;
                C89219l.m154716b(map, "");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (map != null) {
                    for (Map.Entry<String, ConfigItem> entry : map.entrySet()) {
                        linkedHashMap.put(entry.getKey(), m121251a(entry.getKey()));
                    }
                }
                Map<String, Object> map2 = C16050d.f38667a;
                if (map2 != null) {
                    for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
                        String key = entry2.getKey();
                        C89219l.m154716b(key, "");
                        linkedHashMap.put(key, entry2.getValue());
                    }
                }
                C16063e eVar = C16063e.f38688a;
                C89219l.m154716b(eVar, "");
                Set<String> b = eVar.mo25484b();
                if (b == null) {
                    return linkedHashMap;
                }
                for (T t : b) {
                    C89219l.m154716b(t, "");
                    linkedHashMap.put(t, C16063e.f38688a.mo25482a((String) t));
                }
                return linkedHashMap;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (T t2 : list) {
                linkedHashMap2.put(t2, m121251a((String) t2));
            }
            return linkedHashMap2;
        } catch (Exception e) {
            e.printStackTrace();
            return new LinkedHashMap();
        }
    }

    /* renamed from: a */
    public static void m121254a(C28022o oVar, String str, Object obj) {
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(str, "");
        if (obj instanceof Number) {
            oVar.mo46800a(str, (Number) obj);
        } else if (obj instanceof Boolean) {
            oVar.mo46798a(str, (Boolean) obj);
        } else if (obj instanceof String) {
            oVar.mo46801a(str, (String) obj);
        } else if (obj instanceof Character) {
            oVar.mo46799a(str, (Character) obj);
        } else if (obj instanceof AbstractC28019l) {
            oVar.mo46797a(str, (AbstractC28019l) obj);
        } else if (obj == null) {
            oVar.mo46797a(str, (AbstractC28019l) null);
        }
    }

    /* renamed from: a */
    public static void m121255a(JSONObject jSONObject, AbstractC89172b<? super String, C89391z> bVar, AbstractC89172b<? super Exception, C89391z> bVar2) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        if (jSONObject != null) {
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("ab_test_names");
                if (optJSONArray != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        String optString = optJSONArray.optString(i);
                        C89219l.m154716b(optString, "");
                        jSONObject2.put(optString, m121251a(optString));
                    }
                    String jSONObject3 = jSONObject2.toString();
                    C89219l.m154716b(jSONObject3, "");
                    bVar.invoke(jSONObject3);
                    return;
                }
            } catch (Exception e) {
                bVar2.invoke(e);
                e.printStackTrace();
                return;
            }
        }
        bVar.invoke(m121252a());
    }
}
