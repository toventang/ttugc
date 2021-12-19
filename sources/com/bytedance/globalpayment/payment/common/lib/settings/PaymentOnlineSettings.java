package com.bytedance.globalpayment.payment.common.lib.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.push.settings.ISettings;
import com.bytedance.push.settings.p1601a.AbstractC21888a;
import org.json.JSONObject;

@AbstractC21888a(mo35616a = "global_payment_online_settings")
public interface PaymentOnlineSettings extends ISettings {
    static {
        Covode.recordClassIndex(17487);
    }

    /* renamed from: a */
    JSONObject mo24753a();

    /* renamed from: b */
    boolean mo24754b();

    /* renamed from: c */
    long mo24755c();

    /* renamed from: d */
    long mo24756d();

    /* renamed from: e */
    boolean mo24757e();
}
