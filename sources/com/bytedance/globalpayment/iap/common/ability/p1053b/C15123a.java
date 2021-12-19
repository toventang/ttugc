package com.bytedance.globalpayment.iap.common.ability.p1053b;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.C15124c;
import com.bytedance.globalpayment.iap.common.ability.C15126d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.payment.common.lib.C15234a;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import org.json.JSONObject;

/* renamed from: com.bytedance.globalpayment.iap.common.ability.b.a */
public class C15123a extends C15234a {
    static {
        Covode.recordClassIndex(17291);
    }

    /* renamed from: a */
    public final JSONObject mo24385a(OrderData orderData) {
        JSONObject jSONObject = new JSONObject();
        if (orderData != null) {
            add(jSONObject, "request_id", orderData.getOrderId());
            add(jSONObject, "product_id", orderData.getProductId());
            add(jSONObject, "payment_method", orderData.getIapPaymentMethod().channelName);
            if (orderData.getPayType() != null) {
                add(jSONObject, "pay_type", orderData.getPayType().name());
            } else {
                add(jSONObject, "pay_type", "unknown");
            }
            C15124c iapPayRequest = orderData.getIapPayRequest();
            if (iapPayRequest != null) {
                add(jSONObject, "merchant_id", iapPayRequest.f36917b);
                add(jSONObject, "user_id", iapPayRequest.f36920e);
            } else {
                add(jSONObject, "merchant_id", "unknown");
                add(jSONObject, "user_id", "unknown");
            }
            AbsIapChannelOrderData absIapChannelOrderData = orderData.getAbsIapChannelOrderData();
            if (absIapChannelOrderData == null) {
                add(jSONObject, "purchase", "unknown");
            } else {
                JSONObject jSONObject2 = new JSONObject();
                add(jSONObject2, "purchase_gp_order_id", absIapChannelOrderData.getChannelOrderId());
                add(jSONObject2, "purchase_self_order_id", absIapChannelOrderData.getSelfOrderId());
                add(jSONObject2, "purchase_token", absIapChannelOrderData.getChannelToken());
                add(jSONObject2, "purchase_signature", absIapChannelOrderData.getSignature());
                add(jSONObject2, "purchase_sku_id", absIapChannelOrderData.getProductId());
                add(jSONObject2, "purchase_state", (long) absIapChannelOrderData.getOrderState());
                add(jSONObject, "purchase", jSONObject2.toString());
            }
        } else {
            add(jSONObject, "request_id", "unknown");
            add(jSONObject, "product_id", "unknown");
            add(jSONObject, "pay_type", "unknown");
            add(jSONObject, "merchant_id", "unknown");
            add(jSONObject, "user_id", "unknown");
            add(jSONObject, "purchase", "unknown");
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m27802a(String str, JSONObject jSONObject) {
        C15253a.m28071a().mo24710j().mo12362a(str, jSONObject);
    }

    /* renamed from: a */
    public final JSONObject mo24386a(JSONObject jSONObject, C15126d dVar) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (dVar != null) {
            add(jSONObject, "result_code", (long) dVar.getCode());
            add(jSONObject, "result_detail_code", (long) dVar.getDetailCode());
            add(jSONObject, "result_message", dVar.getMessage());
            add(jSONObject, "pay_type", dVar.f36930c.name());
        } else {
            add(jSONObject, "result_code", "unknown");
            add(jSONObject, "result_detail_code", "unknown");
            add(jSONObject, "result_message", "unknown");
            add(jSONObject, "pay_type", "unknown");
        }
        return jSONObject;
    }
}
