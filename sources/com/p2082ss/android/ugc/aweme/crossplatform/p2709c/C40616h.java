package com.p2082ss.android.ugc.aweme.crossplatform.p2709c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.crossplatform.p2709c.C40603d;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34346s;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.c.h */
public final class C40616h {

    /* renamed from: a */
    public static final C40616h f95050a = new C40616h();

    /* renamed from: b */
    private static final List<String> f95051b = C89070n.m154524c("error_code", "loading_status_code", "loadso");

    private C40616h() {
    }

    static {
        Covode.recordClassIndex(48456);
    }

    /* renamed from: a */
    private static String m81982a(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        C89219l.m154716b(keys, "");
        long j = 0;
        String str = "none";
        while (keys.hasNext()) {
            String next = keys.next();
            Long valueOf = Long.valueOf(jSONObject.optLong(next));
            if (valueOf.longValue() > j && valueOf != null) {
                j = valueOf.longValue();
                C89219l.m154716b(next, "");
                str = next;
            }
        }
        return str;
    }

    /* renamed from: a */
    public static void m81983a(JSONObject jSONObject, AbstractC34346s sVar) {
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        C89219l.m154716b(keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            C89219l.m154716b(next, "");
            if (C89361p.m154874b(next, "tick_", false)) {
                jSONObject4.put(next, jSONObject.opt(next));
            } else if (C89361p.m154874b(next, "dur_", false)) {
                jSONObject3.put(next, jSONObject.opt(next));
            } else if (f95051b.contains(next)) {
                jSONObject2.put(next, jSONObject.opt(next).toString());
            }
        }
        C40603d.C40604a.m81964a();
        C40603d.m81957a(sVar, "hybrid_monitor_ttwebview_full_log", m81982a(jSONObject4), jSONObject2, jSONObject3, jSONObject4);
    }
}
