package com.p2082ss.android.ugc.aweme.discover.lynx.spark;

import com.bytedance.android.alog.C2688c;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.C21218m;
import com.bytedance.lynx.hybrid.p1515a.AbstractC21154h;
import com.lynx.react.bridge.JavaOnlyMap;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.lynx.spark.d */
public final class C42289d {

    /* renamed from: b */
    public static final C42290a f98521b = new C42290a((byte) 0);

    /* renamed from: a */
    public final AbstractC21154h f98522a;

    static {
        Covode.recordClassIndex(50232);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.spark.d$a */
    public static final class C42290a {
        static {
            Covode.recordClassIndex(50233);
        }

        private C42290a() {
        }

        public /* synthetic */ C42290a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C42289d m84653a(AbstractC21154h hVar) {
            C89219l.m154721d(hVar, "");
            return new C42289d(hVar);
        }
    }

    /* renamed from: b */
    public final void mo71479b() {
        this.f98522a.destroy();
    }

    /* renamed from: a */
    public final C21218m mo71477a() {
        AbstractC21154h hVar = this.f98522a;
        Objects.requireNonNull(hVar, "null cannot be cast to non-null type com.bytedance.lynx.hybrid.LynxKitView");
        return (C21218m) hVar;
    }

    public C42289d(AbstractC21154h hVar) {
        C89219l.m154721d(hVar, "");
        this.f98522a = hVar;
    }

    /* renamed from: a */
    public final void mo71478a(String str, JSONObject jSONObject) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(jSONObject, "");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
        Iterator<String> keys = jSONObject.keys();
        C89219l.m154716b(keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            javaOnlyMap2.put(next, jSONObject.opt(next));
        }
        javaOnlyMap.put("data", javaOnlyMap2);
        this.f98522a.mo34726a(str, C89070n.m154516a(javaOnlyMap));
        C2688c.m7778a(1, "SparkInfo", "sendEventToFe by spark:" + str + " and params" + jSONObject + " and final data： " + javaOnlyMap);
    }
}
