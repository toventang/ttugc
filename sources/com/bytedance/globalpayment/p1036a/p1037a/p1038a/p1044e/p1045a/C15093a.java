package com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1044e.p1045a;

import android.text.TextUtils;
import com.bytedance.common.utility.AbstractC13621j;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1042d.C15092e;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1044e.p1046b.AbstractC15100a;
import com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15235a;
import com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15236b;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import com.bytedance.globalpayment.payment.common.lib.p1082j.C15280b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.globalpayment.a.a.a.e.a.a */
public class C15093a extends AbstractC15100a {

    /* renamed from: a */
    public final String f36838a = C15093a.class.getSimpleName();

    static {
        Covode.recordClassIndex(17261);
    }

    @Override // com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1044e.p1046b.AbstractC15100a
    /* renamed from: a */
    public final void mo24351a(final long j, final String str, final String str2, final AbstractC15235a<C15092e> aVar) {
        C15253a.m28071a().mo24703c().mo24721b().execute(new Runnable() {
            /* class com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1044e.p1045a.C15093a.RunnableC150941 */

            static {
                Covode.recordClassIndex(17262);
            }

            public final void run() {
                String str;
                String str2;
                String str3 = str2;
                if (TextUtils.isEmpty(str3)) {
                    str = C15253a.m28071a().mo24707g().mo24727a() + "/payment/v1/cashier_starling";
                } else {
                    str = str3 + "/payment/v1/cashier_starling";
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("version", j);
                    jSONObject.put("language", str);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                AbstractC13621j.C13622a aVar = new AbstractC13621j.C13622a();
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("Content-Type", "application/json");
                    C15253a.m28071a().mo24707g().mo24730a(str, jSONObject.toString().getBytes(), hashMap, aVar, new AbstractC15236b() {
                        /* class com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1044e.p1045a.C15093a.RunnableC150941.C150951 */

                        static {
                            Covode.recordClassIndex(17263);
                        }

                        @Override // com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15236b
                        /* renamed from: a */
                        public final void mo24353a(AbsResult absResult) {
                            aVar.mo24359a(absResult);
                        }

                        @Override // com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15236b
                        /* renamed from: a */
                        public final void mo24354a(String str) {
                            String str2;
                            try {
                                JSONObject jSONObject = new JSONObject(str);
                                if (TextUtils.equals(jSONObject.optString("result_code"), "success")) {
                                    JSONObject optJSONObject = jSONObject.optJSONObject("text_package");
                                    if (optJSONObject != null) {
                                        Map<String, String> a = C15280b.m28153a(optJSONObject);
                                        if (a.size() > 0) {
                                            aVar.mo24360a(new C15092e(str, jSONObject.optLong("version"), a, optJSONObject.toString()));
                                            return;
                                        }
                                    }
                                    str2 = "request starling data success but data is null";
                                } else {
                                    str2 = "request starling data error:".concat(String.valueOf(str));
                                }
                            } catch (JSONException e) {
                                str2 = e.getMessage();
                            }
                            aVar.mo24359a(new AbsResult().withMessage(str2));
                        }
                    });
                    str2 = "";
                } catch (Throwable th) {
                    str2 = "request starling data exception:" + th.getLocalizedMessage();
                }
                aVar.mo24359a(new AbsResult().withMessage(str2));
            }
        });
    }
}
