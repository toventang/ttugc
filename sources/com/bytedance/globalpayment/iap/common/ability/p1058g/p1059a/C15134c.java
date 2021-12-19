package com.bytedance.globalpayment.iap.common.ability.p1058g.p1059a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.C15124c;
import com.bytedance.globalpayment.iap.common.ability.C15126d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.CreateOrderResponseEntity;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.OneTimeOrderStateResponseEntity;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.ResponseEntity;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.SubscriptionOrderStateResponseEntity;
import com.bytedance.globalpayment.iap.common.ability.p1056e.C15129a;
import com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b.AbstractC15152c;
import com.bytedance.globalpayment.iap.common.ability.p1061h.C15157b;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15235a;
import com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15236b;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.globalpayment.iap.common.ability.g.a.c */
public class C15134c extends AbstractC15152c {

    /* renamed from: b */
    public static boolean f36945b;

    /* renamed from: a */
    public final String f36946a = C15134c.class.getSimpleName();

    static {
        Covode.recordClassIndex(17302);
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b.AbstractC15152c
    /* renamed from: a */
    public final void mo24401a(C15124c cVar, OrderData orderData, final AbstractC15235a<CreateOrderResponseEntity> aVar) {
        String str;
        if (TextUtils.isEmpty(cVar.f36921f)) {
            aVar.mo24359a(new C15126d(201, 2012, "pay params is error in createOrder"));
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("timestamp", new StringBuilder().append(cVar.f36918c).toString());
        hashMap.put("merchant_id", cVar.f36917b);
        if (cVar.f36922g) {
            str = "pipo.subscription.init";
        } else {
            str = "pipo.trade.payIn";
        }
        hashMap.put("method", str);
        hashMap.put("sign", cVar.f36916a);
        hashMap.put("biz_content", cVar.f36921f);
        for (Map.Entry entry : hashMap.entrySet()) {
            entry.getKey();
            entry.getValue();
        }
        C15253a.m28071a().mo24705e();
        final C15129a aVar2 = new C15129a("create_order", orderData.getOrderId(), orderData.getProductId());
        aVar2.mo24392a();
        m27859a(m27857a(), hashMap, new AbstractC15236b() {
            /* class com.bytedance.globalpayment.iap.common.ability.p1058g.p1059a.C15134c.C151351 */

            static {
                Covode.recordClassIndex(17303);
            }

            /* renamed from: a */
            private void m27824a(C15126d dVar) {
                aVar2.mo24393a(false, dVar);
                AbstractC15235a aVar = aVar;
                if (aVar != null) {
                    aVar.mo24359a((AbsResult) dVar);
                }
            }

            @Override // com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15236b
            /* renamed from: a */
            public final void mo24353a(AbsResult absResult) {
                if (absResult == null) {
                    absResult = new C15126d().withErrorCode(202).withMessage("network error but pipoResult is null");
                    C15253a.m28071a().mo24705e();
                    absResult.getMessage();
                } else {
                    C15253a.m28071a().mo24705e();
                    absResult.getMessage();
                    absResult.withErrorCode(202);
                }
                m27824a(C15126d.m27810a(absResult));
            }

            @Override // com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15236b
            /* renamed from: a */
            public final void mo24354a(String str) {
                CreateOrderResponseEntity createOrderResponseEntity = new CreateOrderResponseEntity();
                try {
                    String optString = new JSONObject(str).optString("response");
                    JSONObject jSONObject = new JSONObject(optString);
                    createOrderResponseEntity.errorCode = jSONObject.optInt("error_code", -1);
                    createOrderResponseEntity.message = jSONObject.optString("message");
                    if (createOrderResponseEntity.isSuccess()) {
                        createOrderResponseEntity = (CreateOrderResponseEntity) C15157b.m27885a(optString, CreateOrderResponseEntity.class);
                    }
                } catch (JSONException e) {
                    C15253a.m28071a().mo24705e();
                    e.getLocalizedMessage();
                    createOrderResponseEntity = null;
                }
                if (createOrderResponseEntity == null) {
                    C15253a.m28071a().mo24705e();
                    m27824a(new C15126d(202, 2021, "CreateOrderApiImpl: create order service response failed, message is null"));
                } else if (createOrderResponseEntity.isSuccess()) {
                    aVar2.mo24393a(true, (C15126d) null);
                    C15253a.m28071a().mo24705e();
                    AbstractC15235a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo24360a(createOrderResponseEntity);
                    }
                } else {
                    C15253a.m28071a().mo24705e();
                    m27824a(new C15126d(202, createOrderResponseEntity.errorCode, "CreateOrderApiImpl: create order service response failed because : " + createOrderResponseEntity.message));
                }
            }
        });
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b.AbstractC15152c
    /* renamed from: a */
    public final void mo24402a(String str, String str2, String str3, String str4, boolean z, String str5, final AbstractC15235a<ResponseEntity> aVar, boolean z2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = C15253a.m28071a().mo24709i().mo24715d().f37216d;
        }
        if (!z || z2) {
            final C15129a aVar2 = new C15129a("query_order_state", str, str4);
            aVar2.mo24392a();
            StringBuilder sb = new StringBuilder(200);
            sb.append(m27862c(str5)).append('?').append("merchant_id=").append(str2).append('&').append("request_id=").append(str);
            String sb2 = sb.toString();
            C151384 r3 = new AbstractC15236b() {
                /* class com.bytedance.globalpayment.iap.common.ability.p1058g.p1059a.C15134c.C151384 */

                static {
                    Covode.recordClassIndex(17306);
                }

                /* renamed from: a */
                private void m27833a(C15126d dVar) {
                    aVar2.mo24393a(false, dVar);
                    AbstractC15235a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo24359a((AbsResult) dVar);
                    }
                }

                @Override // com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15236b
                /* renamed from: a */
                public final void mo24353a(AbsResult absResult) {
                    if (absResult == null) {
                        absResult = new C15126d().withErrorCode(204).withMessage("network error but pipoResult is null");
                    } else {
                        absResult.withErrorCode(204);
                    }
                    m27833a(C15126d.m27810a(absResult));
                }

                @Override // com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15236b
                /* renamed from: a */
                public final void mo24354a(String str) {
                    String str2;
                    try {
                        OneTimeOrderStateResponseEntity oneTimeOrderStateResponseEntity = (OneTimeOrderStateResponseEntity) C15157b.m27885a(str, OneTimeOrderStateResponseEntity.class);
                        if (oneTimeOrderStateResponseEntity == null) {
                            str2 = "";
                        } else if (oneTimeOrderStateResponseEntity.isSuccess()) {
                            aVar2.mo24393a(true, (C15126d) null);
                            C15253a.m28071a().mo24705e();
                            AbstractC15235a aVar = aVar;
                            if (aVar != null) {
                                aVar.mo24360a(oneTimeOrderStateResponseEntity);
                                return;
                            }
                            return;
                        } else {
                            str2 = oneTimeOrderStateResponseEntity.message;
                        }
                        String concat = "OrderStateApiImpl: query order state service response failed:".concat(String.valueOf(str2));
                        C15253a.m28071a().mo24705e();
                        m27833a(new C15126d(204, 2021, concat));
                    } catch (Throwable th) {
                        C15253a.m28071a().mo24705e();
                        m27833a(new C15126d(204, 2021, "OrderStateApiImpl: query order state service response failed:" + th.getLocalizedMessage()));
                    }
                }
            };
            String str6 = sb2 + "&pipo_sdk_version=1.0";
            String str7 = C15253a.m28071a().mo24709i().mo24714c().f37179k;
            if (!TextUtils.isEmpty(str7)) {
                str6 = str6 + "&device_id=" + str7;
            }
            C15253a.m28071a().mo24707g().mo24728a(str6, r3);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("MerchantID", str2);
            jSONObject.put("MerchantUserID", str3);
            jSONObject.put("MerchantSubscriptionID", str);
        } catch (JSONException unused) {
        }
        HashMap hashMap = new HashMap();
        hashMap.put("merchant_id", str2);
        hashMap.put("method", "pipo.subscription.getSubsTxnsByMerchant");
        hashMap.put("timestamp", new StringBuilder().append(System.currentTimeMillis()).toString());
        hashMap.put("biz_content", jSONObject.toString());
        final C15129a aVar3 = new C15129a("query_subscription_order_state", str, str4);
        aVar3.mo24392a();
        m27859a(m27863d(str5), hashMap, new AbstractC15236b() {
            /* class com.bytedance.globalpayment.iap.common.ability.p1058g.p1059a.C15134c.C151373 */

            static {
                Covode.recordClassIndex(17305);
            }

            /* renamed from: a */
            private void m27830a(C15126d dVar) {
                aVar3.mo24393a(false, dVar);
                AbstractC15235a aVar = aVar;
                if (aVar != null) {
                    aVar.mo24359a((AbsResult) dVar);
                }
            }

            @Override // com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15236b
            /* renamed from: a */
            public final void mo24353a(AbsResult absResult) {
                if (absResult == null) {
                    absResult = new C15126d().withErrorCode(-1).withMessage("network error but pipoResult is null");
                } else {
                    absResult.withErrorCode(-1);
                }
                m27830a(C15126d.m27810a(absResult));
            }

            @Override // com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15236b
            /* renamed from: a */
            public final void mo24354a(String str) {
                String str2;
                SubscriptionOrderStateResponseEntity fromJson = SubscriptionOrderStateResponseEntity.fromJson(str);
                if (fromJson == null) {
                    str2 = "";
                } else if (fromJson.isSuccess()) {
                    aVar3.mo24393a(true, (C15126d) null);
                    C15253a.m28071a().mo24705e();
                    AbstractC15235a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo24360a(fromJson);
                        return;
                    }
                    return;
                } else {
                    str2 = fromJson.message;
                }
                String concat = "OrderStateApiImpl: query order state response failed, message is: ".concat(String.valueOf(str2));
                C15253a.m28071a().mo24705e();
                m27830a(new C15126d(204, 2021, concat));
            }
        });
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b.AbstractC15152c
    /* renamed from: a */
    public final void mo24403a(String str, JSONObject jSONObject, String str2, boolean z, String str3, String str4, final AbstractC15235a<ResponseEntity> aVar, boolean z2) {
        boolean z3;
        String str5;
        String str6;
        if (jSONObject != null) {
            if (!z || z2) {
                z3 = false;
            } else {
                z3 = true;
                try {
                    jSONObject.put("MerchantID", str);
                } catch (Throwable unused) {
                    return;
                }
            }
            HashMap hashMap = new HashMap();
            hashMap.put("timestamp", String.valueOf(System.currentTimeMillis() / 1000));
            if (TextUtils.isEmpty(str)) {
                str = C15253a.m28071a().mo24709i().mo24715d().f37216d;
                if (TextUtils.isEmpty(str)) {
                    C15253a.m28071a().mo24705e();
                    aVar.mo24359a(new C15126d(205, 2012, "upload token failed because merchantId is null!"));
                    return;
                }
            }
            hashMap.put("merchant_id", str);
            if (z3) {
                str5 = "pipo.subscription.uploadToken";
            } else {
                str5 = "pipo.receipt.check";
            }
            hashMap.put("method", str5);
            hashMap.put("biz_content", jSONObject.toString());
            for (Map.Entry entry : hashMap.entrySet()) {
                entry.getKey();
                entry.getValue();
            }
            C15253a.m28071a().mo24705e();
            if (z3) {
                str6 = m27861b(str2);
            } else {
                str6 = m27858a(str2);
            }
            if (f36945b) {
                aVar.mo24359a(new C15126d().withMessage("simulate up token error,return without any operation "));
                return;
            }
            final C15129a aVar2 = new C15129a("upload_token", str3, str4);
            aVar2.mo24392a();
            m27859a(str6, hashMap, new AbstractC15236b() {
                /* class com.bytedance.globalpayment.iap.common.ability.p1058g.p1059a.C15134c.C151362 */

                static {
                    Covode.recordClassIndex(17304);
                }

                /* renamed from: a */
                private void m27827a(C15126d dVar) {
                    aVar2.mo24393a(false, dVar);
                    AbstractC15235a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo24359a((AbsResult) dVar);
                    }
                }

                @Override // com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15236b
                /* renamed from: a */
                public final void mo24353a(AbsResult absResult) {
                    if (absResult == null) {
                        absResult = new C15126d().withErrorCode(205).withMessage("network error but pipoResult is null");
                    } else {
                        absResult.withErrorCode(205);
                    }
                    m27827a(C15126d.m27810a(absResult));
                }

                @Override // com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15236b
                /* renamed from: a */
                public final void mo24354a(String str) {
                    String str2;
                    try {
                        ResponseEntity responseEntity = (ResponseEntity) C15157b.m27885a(str, ResponseEntity.class);
                        if (responseEntity == null) {
                            str2 = "";
                        } else if (responseEntity.isSuccess()) {
                            C15253a.m28071a().mo24705e();
                            aVar2.mo24393a(true, (C15126d) null);
                            if (aVar != null) {
                                JSONObject optJSONObject = new JSONObject(str).optJSONObject("data");
                                if (optJSONObject != null) {
                                    responseEntity.setOrderId(optJSONObject.optString("orderId"));
                                }
                                aVar.mo24360a(responseEntity);
                                return;
                            }
                            return;
                        } else {
                            str2 = responseEntity.message;
                        }
                        String concat = "UploadTokenApiImpl: upload token service response failed, message is: ".concat(String.valueOf(str2));
                        C15253a.m28071a().mo24705e();
                        m27827a(new C15126d(205, 2021, concat));
                    } catch (Throwable th) {
                        C15253a.m28071a().mo24705e();
                        m27827a(new C15126d(205, 2021, "UploadTokenApiImpl: upload token service response failed, message is: " + th.getLocalizedMessage()));
                    }
                }
            });
        } else if (aVar != null) {
            aVar.mo24359a(new C15126d(201, 2012, "tokenJson is error in uploadToken"));
        }
    }
}
