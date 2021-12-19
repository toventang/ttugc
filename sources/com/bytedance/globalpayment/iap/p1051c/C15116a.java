package com.bytedance.globalpayment.iap.p1051c;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.payment.common.lib.C15234a;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import org.json.JSONObject;

/* renamed from: com.bytedance.globalpayment.iap.c.a */
public class C15116a extends C15234a {

    /* renamed from: a */
    private long f36885a;

    /* renamed from: b */
    private String f36886b;

    /* renamed from: c */
    private String f36887c;

    /* renamed from: d */
    private boolean f36888d;

    /* renamed from: e */
    private int f36889e;

    /* renamed from: f */
    private OrderData f36890f;

    static {
        Covode.recordClassIndex(17284);
    }

    /* renamed from: a */
    public final void mo24373a() {
        this.f36885a = SystemClock.uptimeMillis();
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "product_id", this.f36886b);
        add(jSONObject, "request_id", this.f36887c);
        JSONObject jSONObject2 = new JSONObject();
        add(jSONObject2, "pay_type", (long) this.f36889e);
        add(jSONObject2, "is_subscription", this.f36888d);
        add(jSONObject2, "payment_method", this.f36890f.getIapPaymentMethod().channelName);
        C15253a.m28071a().mo24704d().mo24726a("pipo_consume_product_start", jSONObject2, null, jSONObject);
    }

    /* renamed from: a */
    public final void mo24374a(boolean z, AbsResult absResult) {
        long j;
        long j2 = 0;
        if (this.f36885a > 0) {
            j = SystemClock.uptimeMillis() - this.f36885a;
        } else {
            j = 0;
        }
        this.f36885a = 0;
        JSONObject jSONObject = new JSONObject();
        if (!z) {
            j2 = 1;
        }
        add(jSONObject, "status", j2);
        add(jSONObject, "pay_type", (long) this.f36889e);
        add(jSONObject, "is_subscription", this.f36888d);
        add(jSONObject, "payment_method", this.f36890f.getIapPaymentMethod().channelName);
        if (absResult != null) {
            add(jSONObject, "result_code", (long) absResult.getCode());
            add(jSONObject, "result_detail_code", (long) absResult.getDetailCode());
            add(jSONObject, "result_message", absResult.getMessage());
        } else {
            add(jSONObject, "result_code", -1L);
            add(jSONObject, "result_detail_code", -1L);
            add(jSONObject, "result_message", "unknown");
        }
        JSONObject jSONObject2 = new JSONObject();
        add(jSONObject2, "time_consuming", j);
        JSONObject jSONObject3 = new JSONObject();
        add(jSONObject3, "product_id", this.f36886b);
        add(jSONObject3, "request_id", this.f36887c);
        C15253a.m28071a().mo24704d().mo24726a("pipo_consume_product_end", jSONObject, jSONObject2, jSONObject3);
    }

    public C15116a(String str, String str2, PayType payType, boolean z, OrderData orderData) {
        this.f36886b = str;
        this.f36887c = str2;
        this.f36888d = z;
        this.f36890f = orderData;
        if (payType == null) {
            this.f36889e = -1;
        } else {
            this.f36889e = payType.ordinal();
        }
    }
}
