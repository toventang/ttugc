package com.bytedance.globalpayment.iap.p1051c;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.C15126d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;
import com.bytedance.globalpayment.payment.common.lib.C15234a;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import org.json.JSONObject;

/* renamed from: com.bytedance.globalpayment.iap.c.d */
public final class C15119d extends C15234a {

    /* renamed from: a */
    private long f36904a;

    /* renamed from: b */
    private String f36905b;

    /* renamed from: c */
    private String f36906c;

    /* renamed from: d */
    private boolean f36907d;

    /* renamed from: e */
    private int f36908e;

    /* renamed from: f */
    private OrderData f36909f;

    static {
        Covode.recordClassIndex(17287);
    }

    /* renamed from: a */
    public final void mo24379a() {
        this.f36904a = SystemClock.uptimeMillis();
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "product_id", this.f36905b);
        add(jSONObject, "request_id", this.f36906c);
        JSONObject jSONObject2 = new JSONObject();
        add(jSONObject2, "pay_type", (long) this.f36908e);
        add(jSONObject2, "is_subscription", this.f36907d);
        add(jSONObject2, "payment_method", this.f36909f.getIapPaymentMethod().channelName);
        C15253a.m28071a().mo24704d().mo24726a("pipo_pay_upload_token_start", jSONObject2, null, jSONObject);
    }

    /* renamed from: a */
    public final void mo24380a(boolean z, C15126d dVar) {
        long j;
        long j2 = 0;
        if (this.f36904a > 0) {
            j = SystemClock.uptimeMillis() - this.f36904a;
        } else {
            j = 0;
        }
        this.f36904a = 0;
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "pay_type", (long) this.f36908e);
        if (!z) {
            j2 = 1;
        }
        add(jSONObject, "status", j2);
        add(jSONObject, "is_subscription", this.f36907d);
        add(jSONObject, "payment_method", this.f36909f.getIapPaymentMethod().channelName);
        if (dVar != null) {
            add(jSONObject, "result_code", (long) dVar.getCode());
            add(jSONObject, "result_detail_code", (long) dVar.getDetailCode());
            add(jSONObject, "result_message", dVar.getMessage());
        } else {
            add(jSONObject, "result_code", -1L);
            add(jSONObject, "result_detail_code", -1L);
            add(jSONObject, "result_message", "unknown");
        }
        JSONObject jSONObject2 = new JSONObject();
        add(jSONObject2, "time_consuming", j);
        JSONObject jSONObject3 = new JSONObject();
        add(jSONObject3, "product_id", this.f36905b);
        add(jSONObject3, "request_id", this.f36906c);
        C15253a.m28071a().mo24704d().mo24726a("pipo_pay_upload_token_end", jSONObject, jSONObject2, jSONObject3);
    }

    public C15119d(String str, String str2, boolean z, PayType payType, OrderData orderData) {
        this.f36905b = str;
        this.f36906c = str2;
        this.f36907d = z;
        this.f36909f = orderData;
        if (payType != null) {
            this.f36908e = payType.ordinal();
        } else {
            this.f36908e = -1;
        }
    }
}
