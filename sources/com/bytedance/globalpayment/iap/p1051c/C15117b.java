package com.bytedance.globalpayment.iap.p1051c;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.payment.common.lib.C15234a;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import org.json.JSONObject;

/* renamed from: com.bytedance.globalpayment.iap.c.b */
public final class C15117b extends C15234a {

    /* renamed from: a */
    private String f36891a;

    /* renamed from: b */
    private String f36892b;

    /* renamed from: c */
    private boolean f36893c;

    /* renamed from: d */
    private int f36894d;

    /* renamed from: e */
    private long f36895e;

    /* renamed from: f */
    private long f36896f;

    /* renamed from: g */
    private OrderData f36897g;

    static {
        Covode.recordClassIndex(17285);
    }

    /* renamed from: a */
    public final void mo24375a() {
        this.f36896f = SystemClock.uptimeMillis();
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "product_id", this.f36891a);
        add(jSONObject, "request_id", this.f36892b);
        JSONObject jSONObject2 = new JSONObject();
        add(jSONObject2, "pay_type", (long) this.f36894d);
        add(jSONObject2, "is_subscription", this.f36893c);
        add(jSONObject2, "payment_method", this.f36897g.getIapPaymentMethod().channelName);
        JSONObject jSONObject3 = new JSONObject();
        long j = 0;
        if (this.f36895e > 0) {
            j = SystemClock.uptimeMillis() - this.f36895e;
        }
        add(jSONObject3, "time_consuming", j);
        C15253a.m28071a().mo24704d().mo24726a("pipo_pay_create_order_start", jSONObject2, jSONObject3, jSONObject);
    }

    /* renamed from: a */
    public final void mo24376a(boolean z, AbsResult absResult) {
        long j;
        long j2 = 0;
        if (this.f36896f > 0) {
            j = SystemClock.uptimeMillis() - this.f36896f;
        } else {
            j = 0;
        }
        this.f36896f = 0;
        JSONObject jSONObject = new JSONObject();
        if (!z) {
            j2 = 1;
        }
        add(jSONObject, "status", j2);
        add(jSONObject, "pay_type", (long) this.f36894d);
        add(jSONObject, "is_subscription", this.f36893c);
        add(jSONObject, "payment_method", this.f36897g.getIapPaymentMethod().channelName);
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
        add(jSONObject3, "product_id", this.f36891a);
        add(jSONObject3, "request_id", this.f36892b);
        C15253a.m28071a().mo24704d().mo24726a("pipo_pay_create_order_end", jSONObject, jSONObject2, jSONObject3);
    }

    public C15117b(String str, String str2, boolean z, PayType payType, long j, OrderData orderData) {
        this.f36891a = str;
        this.f36892b = str2;
        this.f36893c = z;
        this.f36897g = orderData;
        if (payType == null) {
            this.f36894d = -1;
        } else {
            this.f36894d = payType.ordinal();
        }
        this.f36895e = j;
    }
}
