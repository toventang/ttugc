package com.bytedance.globalpayment.payment.common.lib.p1078h.p1079a;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.payment.common.lib.p1073c.C15246a;
import com.bytedance.globalpayment.payment.common.lib.p1075e.AbstractC15249b;
import com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b.AbstractC15270b;
import org.json.JSONObject;

/* renamed from: com.bytedance.globalpayment.payment.common.lib.h.a.b */
public final class C15255b implements AbstractC15270b {

    /* renamed from: a */
    private AbstractC15249b f37254a = new C15246a();

    static {
        Covode.recordClassIndex(17455);
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b.AbstractC15270b
    /* renamed from: a */
    public final void mo24719a(AbstractC15249b bVar) {
        if (bVar != null) {
            this.f37254a = bVar;
        }
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.p1075e.AbstractC15249b
    /* renamed from: a */
    public final void mo12362a(String str, JSONObject jSONObject) {
        this.f37254a.mo12362a(str, jSONObject);
    }
}
