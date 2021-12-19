package com.p2082ss.android.ugc.aweme.ecommerce.track;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.track.c */
public final class C45544c {

    /* renamed from: a */
    public static final C45544c f106064a = new C45544c();

    private C45544c() {
    }

    static {
        Covode.recordClassIndex(54035);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.track.c$a */
    public static final class C45545a {

        /* renamed from: a */
        public Map<String, Object> f106065a = new HashMap();

        static {
            Covode.recordClassIndex(54036);
        }

        /* renamed from: a */
        public final void mo76751a(Map<String, ? extends Object> map) {
            C89219l.m154721d(map, "");
            this.f106065a.putAll(map);
        }

        /* renamed from: a */
        public static int m88084a(C45545a aVar, Map<String, ? extends Object> map) {
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(map, "");
            aVar.f106065a.putAll(map);
            return 0;
        }

        /* renamed from: b */
        public final void mo76752b(String str, Object obj) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(obj, "");
            this.f106065a.put(str, obj);
        }

        /* renamed from: c */
        public final void mo76753c(String str, Object obj) {
            C89219l.m154721d(str, "");
            if (obj != null) {
                this.f106065a.put(str, obj);
            }
        }

        /* renamed from: a */
        public final void mo76750a(String str, Object obj) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(obj, "");
            this.f106065a.put(str, obj);
        }
    }

    /* renamed from: a */
    public static void m88081a(String str, AbstractC89172b<? super C45545a, C89391z> bVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        JSONObject jSONObject = new JSONObject();
        C45545a aVar = new C45545a();
        bVar.invoke(aVar);
        for (Map.Entry<String, Object> entry : aVar.f106065a.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        C39162r.m79461a(str, jSONObject);
    }

    /* renamed from: a */
    public static void m88082a(String str, Map<String, ? extends Object> map) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(map, "");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        C39162r.m79461a(str, jSONObject);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0065, code lost:
        if (r0 != null) goto L_0x0010;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m88080a(android.content.Context r4, java.lang.String r5, p4600h.p4611f.p4612a.AbstractC89172b<? super com.p2082ss.android.ugc.aweme.ecommerce.track.C45544c.C45545a, p4600h.C89391z> r6) {
        /*
        // Method dump skipped, instructions count: 146
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.track.C45544c.m88080a(android.content.Context, java.lang.String, h.f.a.b):void");
    }

    /* renamed from: a */
    public static void m88083a(String str, Map<String, ? extends Object> map, AbstractC89172b<? super Map<String, Object>, C89391z> bVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(map, "");
        C89219l.m154721d(bVar, "");
        JSONObject jSONObject = new JSONObject();
        Map d = C89041ag.m154431d(map);
        bVar.invoke(d);
        for (Map.Entry entry : d.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        C39162r.m79461a(str, jSONObject);
    }
}
