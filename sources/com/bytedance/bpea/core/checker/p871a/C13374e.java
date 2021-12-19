package com.bytedance.bpea.core.checker.p871a;

import com.bytedance.bpea.basics.C13345f;
import com.bytedance.bpea.basics.C13347h;
import com.bytedance.bpea.core.p872d.C13382a;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bpea.core.checker.a.e */
public final class C13374e extends AbstractC13370a {

    /* renamed from: c */
    private JSONObject f32677c;

    static {
        Covode.recordClassIndex(15371);
    }

    public C13374e() {
        super(EnumC13372c.CONFIG);
    }

    @Override // com.bytedance.bpea.core.checker.p871a.AbstractC13370a
    /* renamed from: a */
    public final void mo21617a(JSONObject jSONObject) {
        this.f32677c = jSONObject;
    }

    @Override // com.bytedance.bpea.core.checker.p871a.AbstractC13371b
    /* renamed from: a */
    public final C13347h mo21619a(C13345f fVar) {
        C89219l.m154719c(fVar, "");
        return C13382a.C13383a.m24068a(this.f32677c);
    }
}
