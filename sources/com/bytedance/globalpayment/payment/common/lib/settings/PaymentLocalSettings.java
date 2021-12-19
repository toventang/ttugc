package com.bytedance.globalpayment.payment.common.lib.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.push.settings.ILocalSettings;
import com.bytedance.push.settings.p1601a.AbstractC21888a;

@AbstractC21888a(mo35616a = "global_payment_local_settings")
public interface PaymentLocalSettings extends ILocalSettings {
    static {
        Covode.recordClassIndex(17484);
    }

    /* renamed from: a */
    String mo24746a();

    /* renamed from: a */
    void mo24747a(long j);

    /* renamed from: a */
    void mo24748a(String str);

    /* renamed from: b */
    long mo24749b();
}
