package com.bytedance.globalpayment.payment.common.lib.p1073c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.payment.common.lib.p1075e.AbstractC15249b;
import com.p2082ss.android.common.applog.AppLog;
import org.json.JSONObject;

/* renamed from: com.bytedance.globalpayment.payment.common.lib.c.a */
public final class C15246a implements AbstractC15249b {
    static {
        Covode.recordClassIndex(17446);
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.p1075e.AbstractC15249b
    /* renamed from: a */
    public final void mo12362a(String str, JSONObject jSONObject) {
        AppLog.onEvent((Context) null, "event_v3", str, (String) null, 0, 0, jSONObject);
    }
}
