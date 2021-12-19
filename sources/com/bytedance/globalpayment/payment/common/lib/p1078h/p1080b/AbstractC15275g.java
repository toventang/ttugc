package com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15238d;
import com.bytedance.globalpayment.payment.common.lib.settings.PaymentLocalSettings;
import com.bytedance.globalpayment.payment.common.lib.settings.PaymentOnlineSettings;
import org.json.JSONObject;

/* renamed from: com.bytedance.globalpayment.payment.common.lib.h.b.g */
public interface AbstractC15275g extends AbstractC15238d {
    static {
        Covode.recordClassIndex(17475);
    }

    /* renamed from: a */
    void mo24734a(JSONObject jSONObject);

    /* renamed from: b */
    PaymentOnlineSettings mo24735b();

    /* renamed from: c */
    PaymentLocalSettings mo24736c();

    /* renamed from: d */
    boolean mo24737d();

    /* renamed from: e */
    long mo24738e();

    /* renamed from: f */
    long mo24739f();

    /* renamed from: g */
    long mo24740g();

    /* renamed from: h */
    boolean mo24741h();

    /* renamed from: i */
    long mo24742i();
}
