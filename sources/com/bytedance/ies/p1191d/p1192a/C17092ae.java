package com.bytedance.ies.p1191d.p1192a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import p4600h.C89378p;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89350l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.ies.d.a.ae */
public final class C17092ae {

    /* renamed from: a */
    private final Map<String, C17093af> f40678a;

    static {
        Covode.recordClassIndex(19549);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.Map<java.lang.String, ? extends com.bytedance.ies.d.a.af> */
    /* JADX WARN: Multi-variable type inference failed */
    private C17092ae(Map<String, ? extends C17093af> map) {
        this.f40678a = map;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C17092ae(org.json.JSONObject r7) {
        /*
            r6 = this;
            java.lang.String r5 = ""
            p4600h.p4611f.p4613b.C89219l.m154719c(r7, r5)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.Iterator r3 = r7.keys()
            p4600h.p4611f.p4613b.C89219l.m154709a(r3, r5)
        L_0x0011:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0030
            java.lang.Object r2 = r3.next()
            java.lang.String r2 = (java.lang.String) r2
            p4600h.p4611f.p4613b.C89219l.m154709a(r2, r5)
            com.bytedance.ies.d.a.af r1 = new com.bytedance.ies.d.a.af
            org.json.JSONObject r0 = r7.getJSONObject(r2)
            p4600h.p4611f.p4613b.C89219l.m154709a(r0, r5)
            r1.<init>(r2, r0)
            r4.put(r2, r1)
            goto L_0x0011
        L_0x0030:
            r6.<init>(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.p1191d.p1192a.C17092ae.<init>(org.json.JSONObject):void");
    }

    /* renamed from: a */
    public final C89378p<List<String>, SortedMap<String, String>> mo27000a(C17100aj ajVar) {
        C89219l.m154719c(ajVar, "");
        Uri a = ajVar.mo27010a();
        String str = ajVar.f40701b;
        String path = a.getPath();
        if (path != null) {
            for (Map.Entry<String, C17093af> entry : this.f40678a.entrySet()) {
                boolean z = false;
                List<String> split = new C89350l("/").split(path, 0);
                List<String> split2 = new C89350l("/").split(entry.getKey(), 0);
                if (split.size() == split2.size()) {
                    TreeMap treeMap = new TreeMap();
                    int size = split.size();
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            String str2 = split2.get(i);
                            if (!C89361p.m154874b(str2, ":", z)) {
                                if (!C89219l.m154714a((Object) split.get(i), (Object) str2)) {
                                    break;
                                }
                            } else if (str2 != null) {
                                String substring = str2.substring(1);
                                C89219l.m154709a((Object) substring, "");
                                treeMap.put(substring, split.get(i));
                            } else {
                                throw new C89388w("null cannot be cast to non-null type");
                            }
                            i++;
                            z = false;
                        } else {
                            C17130q.m31655b("[scheme:" + str + "] match_result_rule:" + entry.getKey());
                            List<String> a2 = entry.getValue().mo27001a(ajVar);
                            if (a2 != null) {
                                return new C89378p<>(a2, treeMap);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}
