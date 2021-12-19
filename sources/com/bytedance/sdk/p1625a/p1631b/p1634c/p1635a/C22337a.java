package com.bytedance.sdk.p1625a.p1631b.p1634c.p1635a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1631b.p1636d.C22339a;
import com.bytedance.sdk.p1625a.p1631b.p1636d.C22340b;
import com.bytedance.sdk.p1625a.p1631b.p1636d.C22342d;
import com.bytedance.sdk.p1625a.p1631b.p1636d.C22344e;
import com.bytedance.sdk.p1625a.p1638c.p1639a.C22349c;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.a.b.c.a.a */
public final class C22337a {
    static {
        Covode.recordClassIndex(26153);
    }

    /* renamed from: a */
    public static C22340b m42049a(String str) {
        if (str == null) {
            return null;
        }
        C22340b bVar = new C22340b();
        try {
            m42052a(bVar, str);
            if (bVar.f52803t) {
                if (bVar.f52806w != null) {
                    bVar.f52780a = bVar.f52806w.optString("code");
                    return bVar;
                }
                bVar.f52804u = -1;
                return bVar;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bVar;
    }

    /* renamed from: a */
    public static String m42050a(C22349c.C22350a aVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.f52812f);
        if (!TextUtils.isEmpty(aVar.f52813g)) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) != ',') {
                sb.append(",");
            }
            sb.append(aVar.f52813g);
        }
        if (!TextUtils.isEmpty(aVar.f52814h)) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) != ',') {
                sb.append(",");
            }
            sb.append(aVar.f52814h);
        }
        return sb.toString();
    }

    /* renamed from: b */
    private static Integer[][] m42054b(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        int length = jSONArray.length();
        int[] iArr = new int[2];
        iArr[1] = 2;
        iArr[0] = length;
        Integer[][] numArr = (Integer[][]) Array.newInstance(Integer.class, iArr);
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONArray optJSONArray = jSONArray.optJSONArray(i);
            if (optJSONArray != null && optJSONArray.length() == 2) {
                numArr[i][0] = Integer.valueOf(optJSONArray.optInt(0));
                numArr[i][1] = Integer.valueOf(optJSONArray.optInt(1));
            }
        }
        return numArr;
    }

    /* renamed from: a */
    private static Map<String, Integer[][]> m42051a(JSONArray jSONArray) {
        String str = null;
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Integer[][] numArr = null;
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                str = optJSONObject.optString("style");
                numArr = m42054b(optJSONObject.optJSONArray("range"));
            }
            if (!TextUtils.isEmpty(str) && numArr != null) {
                hashMap.put(str, numArr);
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public static C22342d m42053b(String str) {
        if (str == null) {
            return null;
        }
        C22342d dVar = new C22342d();
        try {
            m42052a(dVar, str);
            if (dVar.f52803t) {
                if (dVar.f52806w != null) {
                    dVar.f52781a = dVar.f52806w.optString("client_name");
                    dVar.f52782b = dVar.f52806w.optString("client_icon");
                    JSONArray optJSONArray = dVar.f52806w.optJSONArray("scopes");
                    if (optJSONArray != null) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            dVar.f52783c.add(optJSONArray.optString(i));
                        }
                    }
                    JSONObject optJSONObject = dVar.f52806w.optJSONObject("scope_dict");
                    if (optJSONObject != null) {
                        dVar.f52784d = optJSONObject;
                    }
                    JSONObject optJSONObject2 = dVar.f52806w.optJSONObject("alert_scope");
                    if (optJSONObject2 != null) {
                        C22339a aVar = new C22339a();
                        aVar.f52775a = optJSONObject2.optString("scope_name");
                        aVar.f52776b = optJSONObject2.optString("title");
                        aVar.f52777c = optJSONObject2.optString("content");
                        aVar.f52778d = optJSONObject2.optString("negative_button");
                        aVar.f52779e = optJSONObject2.optString("positive_button");
                        dVar.f52785e = aVar;
                    }
                    JSONObject optJSONObject3 = dVar.f52806w.optJSONObject("customized_scopes");
                    if (optJSONObject3 != null) {
                        HashMap hashMap = new HashMap();
                        Iterator<String> keys = optJSONObject3.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            Map<String, Integer[][]> a = m42051a(optJSONObject3.optJSONArray(next));
                            if (!TextUtils.isEmpty(next) && a != null) {
                                hashMap.put(next, a);
                            }
                        }
                        dVar.f52786f = hashMap;
                    }
                    JSONObject optJSONObject4 = dVar.f52806w.optJSONObject("scope_description");
                    if (optJSONObject4 != null) {
                        dVar.f52784d = optJSONObject4;
                    }
                    JSONObject optJSONObject5 = dVar.f52806w.optJSONObject("normal_scopes");
                    if (optJSONObject5 != null) {
                        dVar.f52798r = new C22342d.C22343a(optJSONObject5);
                    }
                    JSONObject optJSONObject6 = dVar.f52806w.optJSONObject("sensitive_scopes");
                    if (optJSONObject6 != null) {
                        dVar.f52799s = new C22342d.C22343a(optJSONObject6);
                    }
                    dVar.f52787g = dVar.f52806w.optBoolean("flipchat_conceal");
                    dVar.f52788h = dVar.f52806w.optBoolean("has_mobile");
                    dVar.f52789i = dVar.f52806w.optBoolean("login");
                    dVar.f52790j = dVar.f52806w.optBoolean("need_bind_mobile");
                    dVar.f52791k = dVar.f52806w.optBoolean("qq_conceal");
                    dVar.f52792l = dVar.f52806w.optBoolean("toutiao_conceal");
                    dVar.f52793m = dVar.f52806w.optBoolean("weibo_conceal");
                    dVar.f52794n = dVar.f52806w.optBoolean("wx_conceal");
                    dVar.f52795o = dVar.f52806w.optBoolean("contains_invalid_scope");
                    dVar.f52796p = dVar.f52806w.optString("tips");
                    dVar.f52797q = dVar.f52806w.optBoolean("can_skip_confirm");
                } else {
                    dVar.f52804u = -1;
                }
                return dVar;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dVar;
    }

    /* renamed from: a */
    private static void m42052a(C22344e eVar, String str) {
        if (str != null) {
            JSONObject jSONObject = new JSONObject(str);
            if ("success".equals(jSONObject.optString("message"))) {
                eVar.f52803t = true;
                eVar.f52806w = jSONObject.optJSONObject("data");
                return;
            }
            eVar.f52803t = false;
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null) {
                eVar.f52804u = optJSONObject.optInt("error_code");
                eVar.f52805v = optJSONObject.optString("description");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("argument is null");
    }
}
