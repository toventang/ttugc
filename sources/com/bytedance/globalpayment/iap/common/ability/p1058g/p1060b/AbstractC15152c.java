package com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.C15124c;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.CreateOrderResponseEntity;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.ResponseEntity;
import com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15235a;
import com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15236b;
import com.bytedance.globalpayment.payment.common.lib.p1072b.C15243c;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.globalpayment.iap.common.ability.g.b.c */
public abstract class AbstractC15152c {

    /* renamed from: a */
    private final String f36988a = AbstractC15152c.class.getSimpleName();

    static {
        Covode.recordClassIndex(17320);
    }

    /* renamed from: a */
    public abstract void mo24401a(C15124c cVar, OrderData orderData, AbstractC15235a<CreateOrderResponseEntity> aVar);

    /* renamed from: a */
    public abstract void mo24402a(String str, String str2, String str3, String str4, boolean z, String str5, AbstractC15235a<ResponseEntity> aVar, boolean z2);

    /* renamed from: a */
    public abstract void mo24403a(String str, JSONObject jSONObject, String str2, boolean z, String str3, String str4, AbstractC15235a<ResponseEntity> aVar, boolean z2);

    /* renamed from: a */
    protected static String m27857a() {
        return m27860b() + "/pipo/trade/v1";
    }

    /* renamed from: b */
    private static String m27860b() {
        C15243c d = C15253a.m28071a().mo24709i().mo24715d();
        C15253a.m28071a().mo24705e();
        if (!TextUtils.isEmpty(d.f37213a)) {
            return d.f37213a;
        }
        C15253a.m28071a().mo24705e();
        C15253a.m28071a().mo24707g().mo24727a();
        return C15253a.m28071a().mo24707g().mo24727a();
    }

    /* renamed from: a */
    protected static String m27858a(String str) {
        C15253a.m28071a().mo24705e();
        if (TextUtils.isEmpty(str)) {
            return m27860b() + "/pipo/inner/receipt/v1";
        }
        return str + "/pipo/inner/receipt/v1";
    }

    /* renamed from: c */
    protected static String m27862c(String str) {
        if (TextUtils.isEmpty(str)) {
            return m27860b() + "/pipo/inner/order/query/v1";
        }
        return str + "/pipo/inner/order/query/v1";
    }

    /* renamed from: d */
    protected static String m27863d(String str) {
        if (TextUtils.isEmpty(str)) {
            return m27860b() + "/pipo/inner/subscription/query/v1";
        }
        return str + "/pipo/inner/subscription/query/v1";
    }

    /* renamed from: b */
    protected static String m27861b(String str) {
        if (TextUtils.isEmpty(str)) {
            return m27860b() + "/pipo/inner/subscription/upload_token/v1";
        }
        return str + "/pipo/inner/subscription/upload_token/v1";
    }

    /* renamed from: a */
    protected static void m27859a(String str, Map<String, String> map, AbstractC15236b bVar) {
        map.put("pipo_sdk_version", "1.0");
        String str2 = C15253a.m28071a().mo24709i().mo24714c().f37179k;
        if (!TextUtils.isEmpty(str2)) {
            map.put("device_id", str2);
        }
        C15253a.m28071a().mo24707g().mo24729a(str, map, bVar);
    }
}
