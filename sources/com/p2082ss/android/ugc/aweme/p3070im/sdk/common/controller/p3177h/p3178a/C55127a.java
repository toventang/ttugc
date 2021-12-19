package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3177h.p3178a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53697j;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3257g.AbstractC56225a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3257g.AbstractC56226b;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3257g.AbstractC56227c;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.h.a.a */
public final class C55127a implements AbstractC56227c {

    /* renamed from: a */
    public static final C55127a f126154a = new C55127a();

    /* renamed from: b */
    public static final C55130a f126155b = new C55130a((byte) 0);

    /* renamed from: c */
    private final ConcurrentHashMap<String, C53697j> f126156c;

    /* renamed from: d */
    private final AbstractC89188r<String, JSONObject, JSONObject, JSONObject, C89391z> f126157d;

    /* renamed from: e */
    private final AbstractC89171a<C53697j> f126158e;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.h.a.a$a */
    public static final class C55130a {
        static {
            Covode.recordClassIndex(64858);
        }

        private C55130a() {
        }

        public /* synthetic */ C55130a(byte b) {
            this();
        }
    }

    private /* synthetic */ C55127a() {
        this(C551281.f126159a, C551292.f126160a);
    }

    static {
        Covode.recordClassIndex(64855);
    }

    /* renamed from: a */
    private static JSONObject m100850a(Map<String, ? extends Object> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.r<? super java.lang.String, ? super org.json.JSONObject, ? super org.json.JSONObject, ? super org.json.JSONObject, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    private C55127a(AbstractC89188r<? super String, ? super JSONObject, ? super JSONObject, ? super JSONObject, C89391z> rVar, AbstractC89171a<C53697j> aVar) {
        C89219l.m154721d(rVar, "");
        C89219l.m154721d(aVar, "");
        this.f126157d = rVar;
        this.f126158e = aVar;
        this.f126156c = new ConcurrentHashMap<>();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3257g.AbstractC56227c
    /* renamed from: a */
    public final void mo92037a(AbstractC56226b bVar, AbstractC56225a aVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        String bVar2 = bVar.toString();
        C53697j jVar = this.f126156c.get(bVar2);
        if (jVar != null && jVar.mo90244d()) {
            jVar.mo90242b();
            JSONObject a = m100850a(aVar.f128224f);
            JSONObject a2 = m100850a(aVar.f128225g);
            a2.put("load_time", jVar.mo90243c());
            JSONObject a3 = m100850a(aVar.f128226h);
            if (C80537hk.m139613a(bVar.f128228c)) {
                a3.put("extra_id", bVar.f128228c);
            }
            this.f126157d.mo8774a(bVar.f128227b, a, a2, a3);
            C56244a.m102190b("DurationPerfMonImpl", "reported duration for ".concat(String.valueOf(bVar2)));
            this.f126156c.remove(bVar2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3257g.AbstractC56227c
    /* renamed from: a */
    public final boolean mo92038a(AbstractC56226b bVar, boolean z) {
        C53697j jVar;
        C89219l.m154721d(bVar, "");
        String bVar2 = bVar.toString();
        if (!(this.f126156c.get(bVar2) == null || (jVar = this.f126156c.get(bVar2)) == null || !jVar.mo90244d())) {
            C56244a.m102192d("DurationPerfMonImpl", "stopwatch " + bVar2 + " has already started.");
            if (!z) {
                return false;
            }
        }
        this.f126156c.put(bVar2, this.f126158e.invoke());
        return true;
    }
}
