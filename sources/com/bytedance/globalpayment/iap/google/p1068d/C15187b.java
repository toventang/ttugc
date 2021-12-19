package com.bytedance.globalpayment.iap.google.p1068d;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.payment.common.lib.C15234a;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import org.json.JSONObject;

/* renamed from: com.bytedance.globalpayment.iap.google.d.b */
public final class C15187b extends C15234a {
    static {
        Covode.recordClassIndex(17367);
    }

    /* renamed from: a */
    public final void mo24549a(String str, String str2, boolean z, int i) {
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "product_id", str);
        add(jSONObject, "request_id", str2);
        JSONObject jSONObject2 = new JSONObject();
        add(jSONObject2, "pay_type", (long) PayType.EXTRA_TOKEN.ordinal());
        add(jSONObject2, "is_subscription", z);
        add(jSONObject2, "restore_order_type", (long) i);
        add(jSONObject2, "payment_method", IapPaymentMethod.GOOGLE.channelName);
        C15253a.m28071a().mo24704d().mo24726a("pipo_pay_google_pay_restore_order_event", jSONObject2, null, jSONObject);
    }
}
