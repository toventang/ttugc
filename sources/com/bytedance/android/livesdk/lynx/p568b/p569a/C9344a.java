package com.bytedance.android.livesdk.lynx.p568b.p569a;

import com.bytedance.android.livesdk.lynx.p568b.p569a.AbstractC9346b;
import com.bytedance.android.monitor.lynx.C11969b;
import com.bytedance.android.monitor.lynx.jsb.C11998a;
import com.bytedance.android.monitor.lynx.jsb.LynxMonitorModule;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1436j.p1437a.C20072c;
import com.bytedance.p1436j.p1437a.p1442e.C20100b;
import com.lynx.tasm.LynxView;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.lynx.b.a.a */
public final class C9344a implements AbstractC9346b {

    /* renamed from: a */
    public static final C9344a f22819a = new C9344a();

    private C9344a() {
    }

    static {
        Covode.recordClassIndex(10848);
    }

    /* renamed from: com.bytedance.android.livesdk.lynx.b.a.a$a */
    public static final class C9345a implements AbstractC9346b.AbstractC9347a {

        /* renamed from: a */
        final /* synthetic */ C11998a f22820a;

        static {
            Covode.recordClassIndex(10849);
        }

        C9345a(C11998a aVar) {
            this.f22820a = aVar;
        }

        @Override // com.bytedance.android.livesdk.lynx.p568b.p569a.AbstractC9346b.AbstractC9347a
        /* renamed from: a */
        public final void mo16229a(LynxView lynxView) {
            C89219l.m154721d(lynxView, "");
            this.f22820a.f28743a = lynxView;
        }
    }

    @Override // com.bytedance.android.livesdk.lynx.p568b.p569a.AbstractC9346b
    /* renamed from: a */
    public final AbstractC9346b.AbstractC9347a mo16227a(C20072c cVar) {
        C89219l.m154721d(cVar, "");
        C11998a aVar = new C11998a();
        C9345a aVar2 = new C9345a(aVar);
        Map<String, C20100b> map = cVar.f47778n;
        if (map != null) {
            map.put("hybridMonitor", new C20100b(LynxMonitorModule.class, aVar));
        }
        return aVar2;
    }

    @Override // com.bytedance.android.livesdk.lynx.p568b.p569a.AbstractC9346b
    /* renamed from: a */
    public final void mo16228a(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        C11969b.f28620f.mo19184a(null, str, str2, jSONObject, jSONObject2, jSONObject3, jSONObject4, false);
    }
}
