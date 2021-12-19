package com.bytedance.bridge.magpie.impl.lynx;

import com.bytedance.bridge.magpie.C13402a;
import com.bytedance.bridge.magpie.impl.p888b.C13458b;
import com.bytedance.bridge.magpie.p885d.AbstractC13446e;
import com.bytedance.bridge.magpie.p886e.C13450b;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.tasm.LynxView;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bridge.magpie.impl.lynx.a */
public final class C13462a extends AbstractC13446e {

    /* renamed from: a */
    private final C13402a f32798a;

    static {
        Covode.recordClassIndex(15463);
    }

    @Override // com.bytedance.bridge.magpie.p885d.AbstractC13446e
    /* renamed from: a */
    public final void mo21671a() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13462a(C13402a aVar) {
        super(aVar);
        C89219l.m154719c(aVar, "");
        this.f32798a = aVar;
    }

    @Override // com.bytedance.bridge.magpie.p885d.AbstractC13446e
    /* renamed from: a */
    public final void mo21672a(String str, JSONObject jSONObject) {
        if (this.f32798a.f32694c != null) {
            new C13458b(this.f32798a).mo21672a(str, jSONObject);
        }
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        C13450b bVar = C13450b.f32774a;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("data", jSONObject);
        jSONObject2.put("containerID", this.f32798a.f32696e);
        jSONObject2.put("protocolVersion", "1.0");
        javaOnlyArray.pushMap(bVar.mo21680a(jSONObject2));
        LynxView lynxView = this.f32798a.f32695d;
        if (lynxView != null) {
            lynxView.sendGlobalEvent(str, javaOnlyArray);
        }
    }
}
