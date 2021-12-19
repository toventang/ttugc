package com.bytedance.bpea.core.checker.p871a;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bpea.core.checker.a.a */
public abstract class AbstractC13370a implements AbstractC13371b {

    /* renamed from: a */
    JSONObject f32671a;

    /* renamed from: b */
    public final EnumC13372c f32672b;

    static {
        Covode.recordClassIndex(15367);
    }

    /* renamed from: a */
    public abstract void mo21617a(JSONObject jSONObject);

    public String toString() {
        return getClass().getSimpleName() + ' ' + this.f32671a;
    }

    public AbstractC13370a(EnumC13372c cVar) {
        C89219l.m154719c(cVar, "");
        this.f32672b = cVar;
    }
}
