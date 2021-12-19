package com.bytedance.bridge.magpie;

import com.bytedance.bridge.magpie.p883b.C13431b;
import com.bytedance.bridge.magpie.p884c.C13435a;
import com.bytedance.bridge.magpie.p884c.C13438b;
import com.bytedance.bridge.magpie.p885d.AbstractC13446e;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bridge.magpie.b */
public final class C13427b {

    /* renamed from: a */
    public C13402a f32730a;

    static {
        Covode.recordClassIndex(15427);
    }

    public C13427b() {
        C13402a aVar = new C13402a();
        this.f32730a = aVar;
        aVar.f32692a = new C13435a();
    }

    /* renamed from: a */
    public final void mo21646a(C13431b bVar) {
        C89219l.m154719c(bVar, "");
        C13435a aVar = this.f32730a.f32692a;
        if (aVar != null) {
            C89219l.m154719c(bVar, "");
            if (bVar.f32747c.length() > 0) {
                if (aVar.f32757b.get(bVar.f32747c) == null) {
                    aVar.f32757b.put(bVar.f32747c, new C13438b());
                }
                C13438b bVar2 = aVar.f32757b.get(bVar.f32747c);
                if (bVar2 != null) {
                    bVar2.mo21663a(bVar);
                    return;
                }
                return;
            }
            aVar.f32756a.mo21663a(bVar);
        }
    }

    /* renamed from: a */
    public final void mo21647a(String str, JSONObject jSONObject) {
        C89219l.m154719c(str, "");
        AbstractC13446e eVar = this.f32730a.f32697f;
        if (eVar != null) {
            eVar.mo21672a(str, jSONObject);
        }
    }
}
