package com.bytedance.globalpayment.iap.p1051c;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.C15126d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;
import com.bytedance.globalpayment.payment.common.lib.C15234a;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import org.json.JSONObject;

/* renamed from: com.bytedance.globalpayment.iap.c.c */
public final class C15118c extends C15234a {

    /* renamed from: a */
    private long f36898a;

    /* renamed from: b */
    private String f36899b;

    /* renamed from: c */
    private String f36900c;

    /* renamed from: d */
    private boolean f36901d;

    /* renamed from: e */
    private int f36902e;

    /* renamed from: f */
    private OrderData f36903f;

    static {
        Covode.recordClassIndex(17286);
    }

    /* renamed from: a */
    public final void mo24377a() {
        this.f36898a = SystemClock.uptimeMillis();
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "product_id", this.f36899b);
        add(jSONObject, "request_id", this.f36900c);
        JSONObject jSONObject2 = new JSONObject();
        add(jSONObject2, "pay_type", (long) this.f36902e);
        add(jSONObject2, "is_subscription", this.f36901d);
        add(jSONObject2, "payment_method", this.f36903f.getIapPaymentMethod().channelName);
        C15253a.m28071a().mo24704d().mo24726a("pipo_pay_query_order_state_start", jSONObject2, null, jSONObject);
    }

    /* renamed from: a */
    public final void mo24378a(boolean z, int i, C15126d dVar) {
        long j;
        long j2 = 0;
        if (this.f36898a > 0) {
            j = SystemClock.uptimeMillis() - this.f36898a;
        } else {
            j = 0;
        }
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "time_consuming", j);
        JSONObject jSONObject2 = new JSONObject();
        if (!z) {
            j2 = 1;
        }
        add(jSONObject2, "status", j2);
        add(jSONObject2, "order_state", (long) i);
        add(jSONObject2, "is_subscription", this.f36901d);
        add(jSONObject2, "payment_method", this.f36903f.getIapPaymentMethod().channelName);
        if (dVar != null) {
            add(jSONObject2, "result_code", (long) dVar.getCode());
            add(jSONObject2, "result_detail_code", (long) dVar.getDetailCode());
            add(jSONObject2, "result_message", dVar.getMessage());
        } else {
            add(jSONObject2, "result_code", -1L);
            add(jSONObject2, "result_detail_code", -1L);
            add(jSONObject2, "result_message", "unknown");
        }
        JSONObject jSONObject3 = new JSONObject();
        add(jSONObject3, "product_id", this.f36899b);
        add(jSONObject3, "request_id", this.f36900c);
        C15253a.m28071a().mo24704d().mo24726a("pipo_pay_query_order_state_end", jSONObject2, jSONObject, jSONObject3);
    }

    public C15118c(String str, String str2, boolean z, PayType payType, OrderData orderData) {
        this.f36899b = str;
        this.f36900c = str2;
        this.f36901d = z;
        this.f36903f = orderData;
        if (payType != null) {
            this.f36902e = payType.ordinal();
        } else {
            this.f36902e = -1;
        }
    }
}
