package com.bytedance.android.monitorV2.p731d;

import com.bytedance.android.monitorV2.p728a.AbstractC12067b;
import com.bytedance.android.monitorV2.p740l.C12130f;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitorV2.d.j */
public final class C12091j extends AbstractC12067b {

    /* renamed from: b */
    public long f29019b = System.currentTimeMillis();

    static {
        Covode.recordClassIndex(13820);
    }

    public C12091j() {
        super("navigationStart");
    }

    @Override // com.bytedance.android.monitorV2.p728a.AbstractC12066a
    /* renamed from: a */
    public final void mo19417a(JSONObject jSONObject) {
        C89219l.m154719c(jSONObject, "");
        C12130f.m21650a(jSONObject, "invoke_ts", this.f29019b);
    }
}
