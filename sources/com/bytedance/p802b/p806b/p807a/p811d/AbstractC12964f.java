package com.bytedance.p802b.p806b.p807a.p811d;

import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p806b.p807a.C12927a;
import com.bytedance.p802b.p806b.p807a.p809b.C12931a;
import com.bytedance.p802b.p806b.p807a.p809b.C12932b;
import com.bytedance.p802b.p806b.p807a.p809b.C12936d;
import com.bytedance.p802b.p806b.p807a.p811d.C12954b;
import com.bytedance.p802b.p806b.p807a.p811d.C12957c;
import com.bytedance.p802b.p821e.p822a.C13037a;
import com.bytedance.p802b.p834j.C13104c;
import com.bytedance.p802b.p834j.p840f.AbstractC13112a;
import com.bytedance.p802b.p841k.C13116b;
import com.bytedance.p802b.p841k.C13130f;
import com.bytedance.p802b.p841k.C13133i;
import com.bytedance.p802b.p841k.p843b.C13118b;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.b.b.a.d.f */
public interface AbstractC12964f {
    static {
        Covode.recordClassIndex(14800);
    }

    /* renamed from: a */
    String mo20822a();

    /* renamed from: a */
    byte[] mo20823a(HashMap<Long, JSONArray> hashMap);

    /* renamed from: b */
    List<String> mo20824b();

    /* renamed from: com.bytedance.b.b.a.d.f$a */
    public static class C12965a implements AbstractC12964f {
        static {
            Covode.recordClassIndex(14801);
        }

        @Override // com.bytedance.p802b.p806b.p807a.p811d.AbstractC12964f
        /* renamed from: a */
        public final String mo20822a() {
            return "exception";
        }

        @Override // com.bytedance.p802b.p806b.p807a.p811d.AbstractC12964f
        /* renamed from: b */
        public final List<String> mo20824b() {
            C12957c cVar = C12957c.C12958a.f31568a;
            if (cVar.f31566l == null || C13130f.m23608a(cVar.f31566l.f31460c)) {
                return cVar.f31562h;
            }
            return cVar.f31566l.f31460c;
        }

        @Override // com.bytedance.p802b.p806b.p807a.p811d.AbstractC12964f
        /* renamed from: a */
        public final byte[] mo20823a(HashMap<Long, JSONArray> hashMap) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                for (Long l : hashMap.keySet()) {
                    JSONArray jSONArray2 = hashMap.get(l);
                    if (jSONArray2 != null) {
                        for (int i = 0; i < jSONArray2.length(); i++) {
                            jSONArray.put(jSONArray2.get(i));
                        }
                    }
                }
                jSONObject.put("header", C12936d.m23216a(C12932b.m23210a().mo20780a(String.valueOf(C12936d.m23214a()))));
                jSONObject.put("data", jSONArray);
                return C13133i.m23619a(jSONObject.toString());
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: com.bytedance.b.b.a.d.f$b */
    public static class C12966b implements AbstractC12964f {
        static {
            Covode.recordClassIndex(14802);
        }

        @Override // com.bytedance.p802b.p806b.p807a.p811d.AbstractC12964f
        /* renamed from: a */
        public final String mo20822a() {
            return "log";
        }

        @Override // com.bytedance.p802b.p806b.p807a.p811d.AbstractC12964f
        /* renamed from: b */
        public final List<String> mo20824b() {
            C12957c cVar = C12957c.C12958a.f31568a;
            if (cVar.f31566l == null || C13130f.m23608a(cVar.f31566l.f31459b)) {
                return cVar.f31560f;
            }
            return cVar.f31566l.f31459b;
        }

        @Override // com.bytedance.p802b.p806b.p807a.p811d.AbstractC12964f
        /* renamed from: a */
        public final byte[] mo20823a(HashMap<Long, JSONArray> hashMap) {
            C12931a a;
            try {
                JSONArray jSONArray = new JSONArray();
                for (Long l : hashMap.keySet()) {
                    C12931a a2 = C12932b.m23210a().mo20780a(String.valueOf(l));
                    if (a2 == null) {
                        C13037a.m23579r();
                    } else {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("data", hashMap.get(l));
                        jSONObject.put("header", C12936d.m23216a(a2));
                        jSONArray.put(jSONObject);
                    }
                }
                JSONArray a3 = C12954b.C12955a.f31549a.mo20810a();
                if (a3.length() > 0 && (a = C12932b.m23210a().mo20780a(String.valueOf(C12936d.m23214a()))) != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("data", a3);
                    jSONObject2.put("header", C12936d.m23216a(a));
                    jSONArray.put(jSONObject2);
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("list", jSONArray);
                AbstractC13112a aVar = (AbstractC13112a) C13104c.m23566a(AbstractC13112a.class);
                if (aVar != null) {
                    jSONObject3 = aVar.mo20941a();
                }
                return C13133i.m23619a(jSONObject3.toString());
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: com.bytedance.b.b.a.d.f$c */
    public static class C12967c implements AbstractC12964f {
        static {
            Covode.recordClassIndex(14803);
        }

        @Override // com.bytedance.p802b.p806b.p807a.p811d.AbstractC12964f
        /* renamed from: a */
        public final String mo20822a() {
            return "trace";
        }

        @Override // com.bytedance.p802b.p806b.p807a.p811d.AbstractC12964f
        /* renamed from: b */
        public final List<String> mo20824b() {
            C12957c cVar = C12957c.C12958a.f31568a;
            if (cVar.f31566l == null || C13130f.m23608a(cVar.f31566l.f31461d)) {
                return cVar.f31561g;
            }
            return cVar.f31566l.f31461d;
        }

        @Override // com.bytedance.p802b.p806b.p807a.p811d.AbstractC12964f
        /* renamed from: a */
        public final byte[] mo20823a(HashMap<Long, JSONArray> hashMap) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                for (Long l : hashMap.keySet()) {
                    JSONArray jSONArray2 = hashMap.get(l);
                    if (jSONArray2 != null) {
                        for (int i = 0; i < jSONArray2.length(); i++) {
                            try {
                                List<Object> a = C13116b.m23582a(jSONArray2.getJSONObject(i));
                                if (!C13130f.m23608a(a)) {
                                    for (Object obj : a) {
                                        jSONArray.put(obj);
                                    }
                                }
                            } catch (Exception e) {
                                C13118b.m23587a(C12927a.f31456a, "serialize", e);
                            }
                        }
                    }
                }
                jSONObject.put("header", C12936d.m23216a(C12932b.m23210a().mo20780a(String.valueOf(C12936d.m23214a()))));
                jSONObject.put("data", jSONArray);
                return C13133i.m23619a(jSONObject.toString());
            } catch (Exception unused) {
                return null;
            }
        }
    }
}
