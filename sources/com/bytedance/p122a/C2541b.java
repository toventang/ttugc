package com.bytedance.p122a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.a.b */
public final class C2541b {

    /* renamed from: a */
    public static volatile long f7677a = 5000;

    /* renamed from: b */
    public static volatile boolean f7678b;

    /* renamed from: c */
    public static Map<String, Integer> f7679c = new HashMap();

    /* renamed from: d */
    public static AbstractC2540a f7680d;

    /* renamed from: e */
    private static Map<String, Integer> f7681e = new HashMap();

    /* renamed from: f */
    private static Map<String, C2542c> f7682f = new HashMap();

    static {
        Covode.recordClassIndex(2920);
    }

    /* renamed from: a */
    public static void m7432a() {
        if (f7678b && f7682f.size() > 0) {
            for (C2542c cVar : f7682f.values()) {
                cVar.f7688f = 2;
                cVar.f7690h = 2;
                cVar.f7689g = System.currentTimeMillis() - cVar.f7687e;
                m7436b(cVar);
            }
            f7682f.clear();
        }
    }

    /* renamed from: a */
    private static void m7433a(C2542c cVar) {
        String str;
        String str2;
        if (f7678b) {
            m7436b(cVar);
            if (TextUtils.isEmpty(cVar.f7684b)) {
                str = cVar.f7683a;
            } else {
                str = cVar.f7684b;
            }
            f7682f.remove(str);
            if (f7682f.size() > 0) {
                for (C2542c cVar2 : f7682f.values()) {
                    if (System.currentTimeMillis() - cVar2.f7687e > f7677a) {
                        cVar2.f7688f = 3;
                        cVar2.f7689g = System.currentTimeMillis() - cVar2.f7687e;
                        m7436b(cVar);
                        if (TextUtils.isEmpty(cVar2.f7684b)) {
                            str2 = cVar2.f7683a;
                        } else {
                            str2 = cVar2.f7684b;
                        }
                        f7682f.remove(str2);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private static void m7436b(C2542c cVar) {
        if (f7680d != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("scene", cVar.f7683a);
                jSONObject.put("sub_scene", cVar.f7684b);
                jSONObject.put("duration", cVar.f7689g);
                jSONObject.put("status", cVar.f7688f);
                jSONObject.put("is_first", cVar.f7685c);
                if (cVar.f7686d >= 0) {
                    jSONObject.put("pull_type", cVar.f7686d);
                }
                if (cVar.f7690h >= 0) {
                    jSONObject.put("reason", cVar.f7690h);
                }
                if (cVar.f7691i >= 0) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", cVar.f7691i);
                    jSONObject.put("net_info", jSONObject2);
                }
                if (cVar.f7692j != null) {
                    jSONObject.put("scene_info", cVar.f7692j);
                }
                f7680d.mo7003a("net_quality", jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m7437b(String str, String str2) {
        if (f7678b) {
            if (!TextUtils.isEmpty(str2)) {
                str = str2;
            }
            C2542c cVar = f7682f.get(str);
            if (cVar != null) {
                cVar.f7688f = 0;
                cVar.f7689g = System.currentTimeMillis() - cVar.f7687e;
                cVar.f7692j = null;
                m7433a(cVar);
            }
        }
    }

    /* renamed from: c */
    public static void m7439c(String str, String str2) {
        if (f7678b) {
            if (!TextUtils.isEmpty(str2)) {
                str = str2;
            }
            C2542c cVar = f7682f.get(str);
            if (cVar != null) {
                cVar.f7688f = 2;
                cVar.f7689g = System.currentTimeMillis() - cVar.f7687e;
                cVar.f7690h = 1;
                cVar.f7692j = null;
                m7433a(cVar);
            }
        }
    }

    /* renamed from: d */
    private static boolean m7440d(String str, String str2) {
        String str3 = str + str2;
        Integer num = f7679c.get(str3);
        if (num == null || num.intValue() <= 0) {
            return true;
        }
        Integer num2 = f7681e.get(str3);
        if (num2 == null) {
            num2 = 0;
        }
        Map<String, Integer> map = f7681e;
        Integer valueOf = Integer.valueOf(num2.intValue() + 1);
        map.put(str3, valueOf);
        if (valueOf.intValue() <= num.intValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m7434a(String str, String str2) {
        String str3;
        if (f7678b && m7440d(str, str2)) {
            if (TextUtils.isEmpty(str2)) {
                str3 = str;
            } else {
                str3 = str2;
            }
            if (f7682f.get(str3) == null) {
                C2542c cVar = new C2542c();
                cVar.f7683a = str;
                cVar.f7684b = str2;
                cVar.f7687e = System.currentTimeMillis();
                f7682f.put(str3, cVar);
            }
        }
    }

    /* renamed from: b */
    public static void m7438b(String str, String str2, int i) {
        String str3;
        if (f7678b && m7440d(str, str2)) {
            if (TextUtils.isEmpty(str2)) {
                str3 = str;
            } else {
                str3 = str2;
            }
            if (f7682f.get(str3) == null) {
                C2542c cVar = new C2542c();
                cVar.f7683a = str;
                cVar.f7684b = str2;
                cVar.f7686d = -1;
                cVar.f7685c = i;
                cVar.f7687e = System.currentTimeMillis();
                f7682f.put(str3, cVar);
            }
        }
    }

    /* renamed from: a */
    public static void m7435a(String str, String str2, int i) {
        if (f7678b) {
            if (!TextUtils.isEmpty(str2)) {
                str = str2;
            }
            C2542c cVar = f7682f.get(str);
            if (cVar != null) {
                cVar.f7689g = System.currentTimeMillis() - cVar.f7687e;
                cVar.f7688f = 1;
                cVar.f7690h = 1;
                cVar.f7691i = i;
                cVar.f7692j = null;
                m7433a(cVar);
            }
        }
    }
}
