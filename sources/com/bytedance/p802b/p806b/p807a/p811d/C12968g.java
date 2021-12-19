package com.bytedance.p802b.p806b.p807a.p811d;

import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p806b.p807a.C12927a;
import com.bytedance.p802b.p806b.p807a.p809b.C12932b;
import com.bytedance.p802b.p806b.p807a.p810c.C12943a;
import com.bytedance.p802b.p806b.p807a.p810c.C12944b;
import com.bytedance.p802b.p806b.p807a.p811d.AbstractC12964f;
import com.bytedance.p802b.p806b.p807a.p811d.C12950a;
import com.bytedance.p802b.p821e.p822a.C13037a;
import com.bytedance.p802b.p841k.p843b.C13118b;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.b.b.a.d.g */
public final class C12968g {

    /* renamed from: a */
    static final List<AbstractC12964f> f31586a;

    /* renamed from: b */
    private static AtomicInteger f31587b = new AtomicInteger(0);

    /* renamed from: c */
    private static final List<String> f31588c = Arrays.asList("tracing");

    /* renamed from: d */
    private static final AbstractC12964f.C12965a f31589d;

    /* renamed from: e */
    private static final AbstractC12964f.C12967c f31590e;

    /* renamed from: f */
    private static final AbstractC12964f.C12966b f31591f;

    static {
        Covode.recordClassIndex(14804);
        AbstractC12964f.C12965a aVar = new AbstractC12964f.C12965a();
        f31589d = aVar;
        AbstractC12964f.C12967c cVar = new AbstractC12964f.C12967c();
        f31590e = cVar;
        AbstractC12964f.C12966b bVar = new AbstractC12964f.C12966b();
        f31591f = bVar;
        ArrayList arrayList = new ArrayList();
        f31586a = arrayList;
        arrayList.add(aVar);
        arrayList.add(cVar);
        arrayList.add(bVar);
    }

    /* renamed from: a */
    private static void m23287a(Map<Long, List<C12944b>> map) {
        if (C13037a.m23579r()) {
            map.size();
            for (Long l : map.keySet()) {
                List<C12944b> list = map.get(l);
                C12932b.m23210a().mo20780a(String.valueOf(l));
                for (int i = 0; i < list.size(); i++) {
                    list.get(i);
                }
            }
        }
    }

    /* renamed from: a */
    public static Map<AbstractC12964f, byte[]> m23286a(List<C12943a> list, int i) {
        int i2;
        Object obj;
        String[] list2;
        try {
            HashMap hashMap = new HashMap();
            long size = (long) list.size();
            long j = 0;
            long j2 = 0;
            for (C12943a aVar : list) {
                long j3 = aVar.f31518a;
                List list3 = (List) hashMap.get(Long.valueOf(j3));
                if (list3 == null) {
                    list3 = new ArrayList();
                    hashMap.put(Long.valueOf(j3), list3);
                }
                j += (long) aVar.f31520c;
                j2 += (long) aVar.f31519b;
                list3.addAll(aVar.f31522e);
            }
            m23287a(hashMap);
            File a = C12950a.C12952a.f31541a.mo20800a();
            if (a == null || (list2 = a.list()) == null) {
                i2 = 0;
            } else {
                i2 = list2.length;
            }
            HashMap hashMap2 = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (Long l : hashMap.keySet()) {
                List list4 = (List) hashMap.get(l);
                if (list4 != null) {
                    for (int i3 = 0; i3 < list4.size(); i3++) {
                        try {
                            JSONObject jSONObject = new JSONObject(new String(((C12944b) list4.get(i3)).f31523a));
                            String optString = jSONObject.optString("log_type");
                            if (C12927a.f31457b.contains(optString)) {
                                obj = f31589d;
                            } else if (f31588c.contains(optString)) {
                                obj = f31590e;
                            } else {
                                obj = f31591f;
                            }
                            if (obj instanceof AbstractC12964f.C12966b) {
                                try {
                                    JSONObject optJSONObject = jSONObject.optJSONObject("_debug_self");
                                    if (optJSONObject == null) {
                                        optJSONObject = new JSONObject();
                                        jSONObject.put("_debug_self", optJSONObject);
                                    }
                                    optJSONObject.put("debug_sender_number", f31587b.getAndIncrement());
                                    optJSONObject.put("debug_sender_sid", C13037a.m23432a());
                                    optJSONObject.put("debug_total_bytes", j);
                                    optJSONObject.put("debug_total_count", j2);
                                    optJSONObject.put("debug_merge_file_count", size);
                                    optJSONObject.put("debug_second_file_count", i2);
                                    optJSONObject.put("debug_left_file_count", i);
                                } catch (Exception unused) {
                                }
                                if (jSONObject.has("seq_no")) {
                                    arrayList.add(String.valueOf(jSONObject.get("seq_no")));
                                }
                            }
                            Map map = (Map) hashMap2.get(obj);
                            if (map == null) {
                                map = new HashMap();
                                hashMap2 = hashMap2;
                                hashMap2.put(obj, map);
                            }
                            if (!map.containsKey(l)) {
                                map.put(l, new JSONArray());
                            }
                            ((JSONArray) map.get(l)).put(jSONObject);
                        } catch (Exception unused2) {
                        }
                    }
                }
            }
            HashMap hashMap3 = new HashMap();
            for (AbstractC12964f fVar : hashMap2.keySet()) {
                hashMap3.put(fVar, fVar.mo20823a((HashMap) hashMap2.get(fVar)));
            }
            return hashMap3;
        } catch (Throwable th) {
            C13118b.m23587a(C12927a.f31456a, "LogSender serialize failed.", th);
            return null;
        }
    }
}
