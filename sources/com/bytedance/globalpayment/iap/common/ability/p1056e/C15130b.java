package com.bytedance.globalpayment.iap.common.ability.p1056e;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.C15126d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;
import com.bytedance.globalpayment.iap.common.ability.p1052a.EnumC15121a;
import com.bytedance.globalpayment.payment.common.lib.C15234a;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import org.json.JSONObject;

/* renamed from: com.bytedance.globalpayment.iap.common.ability.e.b */
public class C15130b extends C15234a {

    /* renamed from: a */
    private final String f36933a = C15130b.class.getSimpleName();

    /* renamed from: b */
    private long f36934b = 0;

    /* renamed from: c */
    private String f36935c;

    /* renamed from: d */
    private String f36936d;

    /* renamed from: e */
    private boolean f36937e;

    /* renamed from: f */
    private int f36938f;

    /* renamed from: g */
    private PayType f36939g;

    /* renamed from: h */
    private OrderData f36940h;

    static {
        Covode.recordClassIndex(17298);
    }

    /* renamed from: a */
    public final void mo24394a() {
        this.f36934b = SystemClock.uptimeMillis();
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "request_id", this.f36936d);
        add(jSONObject, "product_id", this.f36935c);
        JSONObject jSONObject2 = new JSONObject();
        add(jSONObject2, "pay_type", (long) this.f36938f);
        add(jSONObject2, "is_subscription", this.f36937e);
        add(jSONObject2, "payment_method", this.f36940h.getIapPaymentMethod().channelName);
        C15253a.m28071a().mo24704d().mo24726a("pipo_pay_start", jSONObject2, null, jSONObject);
    }

    /* renamed from: a */
    public final void mo24395a(C15126d dVar, EnumC15121a aVar) {
        long j;
        C15253a.m28071a().mo24705e();
        if (this.f36934b > 0) {
            j = SystemClock.uptimeMillis() - this.f36934b;
        } else {
            j = 0;
        }
        this.f36934b = 0;
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "result_code", (long) dVar.getCode());
        add(jSONObject, "result_detail_code", (long) dVar.getDetailCode());
        add(jSONObject, "result_message", dVar.getMessage());
        add(jSONObject, "pay_type", (long) this.f36938f);
        add(jSONObject, "is_subscription", this.f36937e);
        add(jSONObject, "payment_method", this.f36940h.getIapPaymentMethod().channelName);
        if (aVar != null) {
            add(jSONObject, "pay_state", aVar.name());
        } else {
            add(jSONObject, "pay_state", "unknown");
        }
        JSONObject jSONObject2 = new JSONObject();
        add(jSONObject2, "time_consuming", j);
        JSONObject jSONObject3 = new JSONObject();
        add(jSONObject3, "request_id", this.f36936d);
        add(jSONObject3, "product_id", this.f36935c);
        C15253a.m28071a().mo24704d().mo24726a("pipo_pay_end", jSONObject, jSONObject2, jSONObject3);
    }

    public C15130b(String str, String str2, boolean z, PayType payType, OrderData orderData) {
        this.f36935c = str;
        this.f36936d = str2;
        this.f36937e = z;
        this.f36939g = payType;
        if (payType == null) {
            this.f36938f = -1;
        } else {
            this.f36938f = payType.ordinal();
        }
        this.f36940h = orderData;
    }
}
