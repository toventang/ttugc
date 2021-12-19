package com.bytedance.globalpayment.iap.google.helper;

import com.android.billingclient.api.Purchase;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.globalpayment.iap.common.ability.C15126d;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.payment.common.lib.C15234a;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.globalpayment.iap.google.helper.b */
public class C15198b extends C15234a {

    /* renamed from: a */
    private static volatile C15198b f37099a;

    static {
        Covode.recordClassIndex(17379);
    }

    /* renamed from: a */
    public static C15198b m28002a() {
        MethodCollector.m26663i(4481);
        if (f37099a == null) {
            synchronized (C15198b.class) {
                try {
                    if (f37099a == null) {
                        f37099a = new C15198b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4481);
                    throw th;
                }
            }
        }
        C15198b bVar = f37099a;
        MethodCollector.m26664o(4481);
        return bVar;
    }

    /* renamed from: a */
    public final void mo24567a(Purchase purchase) {
        JSONObject b = m28004b(purchase);
        add(b, "payment_method", IapPaymentMethod.GOOGLE.channelName);
        C15253a.m28071a().mo24710j().mo12362a("billing_query_in_google_updated", b);
    }

    /* renamed from: a */
    private JSONObject m28003a(C15126d dVar) {
        JSONObject jSONObject = new JSONObject();
        if (dVar != null) {
            add(jSONObject, "result_code", (long) dVar.getCode());
            add(jSONObject, "result_message", dVar.getMessage());
        } else {
            add(jSONObject, "result_code", -1L);
            add(jSONObject, "result_message", "unknown");
        }
        return jSONObject;
    }

    /* renamed from: b */
    private JSONObject m28004b(Purchase purchase) {
        JSONObject jSONObject = new JSONObject();
        if (purchase != null) {
            add(jSONObject, "purchase_gp_order_id", purchase.mo6160a());
            add(jSONObject, "purchase_token", purchase.mo6162c());
            add(jSONObject, "original_json", purchase.f6646a);
            add(jSONObject, "purchase_signature", purchase.f6647b);
            add(jSONObject, "purchase_sku_id", purchase.mo6161b());
            add(jSONObject, "purchase_state", (long) purchase.mo6163d());
        } else {
            add(jSONObject, "purchase_gp_order_id", "unknown");
            add(jSONObject, "purchase_token", "unknown");
            add(jSONObject, "original_json", "unknown");
            add(jSONObject, "purchase_signature", "unknown");
            add(jSONObject, "purchase_sku_id", "unknown");
            add(jSONObject, "purchase_state", -1L);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo24568a(C15126d dVar, List<Purchase> list) {
        String str;
        if (list == null) {
            str = "unknown";
        } else if (list.size() == 0) {
            str = "size is 0";
        } else {
            JSONArray jSONArray = new JSONArray();
            for (Purchase purchase : list) {
                jSONArray.put(m28004b(purchase));
            }
            str = jSONArray.toString();
        }
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "result_code", (long) dVar.getCode());
        add(jSONObject, "result_message", dVar.getMessage());
        add(jSONObject, "purchase_list", str);
        add(jSONObject, "payment_method", IapPaymentMethod.GOOGLE.channelName);
        C15253a.m28071a().mo24710j().mo12362a("purchase_updated_from_google", jSONObject);
    }

    /* renamed from: a */
    public final void mo24569a(String str, String str2, String str3, String str4, C15126d dVar) {
        JSONObject a = m28003a(dVar);
        add(a, "sku_id", str);
        add(a, "order_id", str2);
        add(a, "merchant_id", str3);
        add(a, "user_id", str4);
        add(a, "payment_method", IapPaymentMethod.GOOGLE.channelName);
        C15253a.m28071a().mo24710j().mo12362a("query_sku_details_failed", a);
    }
}
