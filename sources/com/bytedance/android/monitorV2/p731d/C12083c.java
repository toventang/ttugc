package com.bytedance.android.monitorV2.p731d;

import com.bytedance.android.monitorV2.p728a.AbstractC12067b;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitorV2.d.c */
public final class C12083c extends AbstractC12067b {
    static {
        Covode.recordClassIndex(13812);
    }

    @Override // com.bytedance.android.monitorV2.p728a.AbstractC12066a
    /* renamed from: a */
    public final void mo19417a(JSONObject jSONObject) {
        C89219l.m154719c(jSONObject, "");
    }

    public C12083c() {
        super("containerError");
    }

    @Override // com.bytedance.android.monitorV2.p728a.AbstractC12067b
    public final String toString() {
        return "event_type:" + this.f28927a;
    }
}
