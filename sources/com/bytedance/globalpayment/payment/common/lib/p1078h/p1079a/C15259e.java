package com.bytedance.globalpayment.payment.common.lib.p1078h.p1079a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.framwork.core.sdkmonitor.C14827k;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.globalpayment.payment.common.lib.AbstractC15239b;
import com.bytedance.globalpayment.payment.common.lib.p1072b.C15240a;
import com.bytedance.globalpayment.payment.common.lib.p1076f.C15251a;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b.AbstractC15273e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.globalpayment.payment.common.lib.h.a.e */
public class C15259e implements AbstractC15273e {

    /* renamed from: a */
    private final String f37259a = C15259e.class.getSimpleName();

    /* renamed from: b */
    private C14827k f37260b;

    /* renamed from: c */
    private final AbstractC15239b<C14827k> f37261c = new AbstractC15239b<C14827k>() {
        /* class com.bytedance.globalpayment.payment.common.lib.p1078h.p1079a.C15259e.C152601 */

        static {
            Covode.recordClassIndex(17460);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public C14827k mo24697a() {
            String str;
            JSONObject jSONObject = new JSONObject();
            C15240a c = C15253a.m28071a().mo24709i().mo24714c();
            final C15251a e = C15253a.m28071a().mo24709i().mo24716e();
            try {
                jSONObject.put("device_id", c.f37179k);
                jSONObject.put("host_aid", e.f37233a);
                jSONObject.put("sdk_version", "1.0");
                jSONObject.put("channel", e.f37237e);
                jSONObject.put("app_version", e.f37235c);
                jSONObject.put("update_version_code", e.f37236d);
            } catch (Throwable unused) {
            }
            StringBuilder sb = new StringBuilder();
            if (TextUtils.isEmpty(c.f37172d)) {
                str = "https://mon.isnssdk.com/monitor";
            } else {
                str = c.f37172d;
            }
            SDKMonitorUtils.m27204a("4108", Collections.singletonList(sb.append(str).append("/monitor/appmonitor/v2/settings").toString()));
            ArrayList arrayList = new ArrayList();
            arrayList.add("https://mon.isnssdk.com/monitor/collect/");
            arrayList.add("https://i.isnssdk.com/monitor/collect/");
            SDKMonitorUtils.m27205b("4108", arrayList);
            SDKMonitorUtils.m27203a(C15253a.m28071a().mo24709i().mo24713b(), "4108", jSONObject, new C14827k.AbstractC14835a() {
                /* class com.bytedance.globalpayment.payment.common.lib.p1078h.p1079a.C15259e.C152601.C152611 */

                static {
                    Covode.recordClassIndex(17461);
                }

                @Override // com.bytedance.framwork.core.sdkmonitor.C14827k.AbstractC14835a
                /* renamed from: a */
                public final Map<String, String> mo21830a() {
                    HashMap hashMap = new HashMap();
                    if (e.f37239g) {
                        hashMap.put("oversea", "1");
                    } else {
                        hashMap.put("oversea", "0");
                    }
                    return hashMap;
                }
            });
            return SDKMonitorUtils.m27201a("4108");
        }
    };

    static {
        Covode.recordClassIndex(17459);
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b.AbstractC15273e
    /* renamed from: a */
    public final void mo24726a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (this.f37260b == null) {
            this.f37260b = this.f37261c.mo24698b();
        }
        if (this.f37260b != null) {
            if (C15253a.m28071a().mo24709i().mo24712a()) {
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("event_name", str);
                    jSONObject4.put("category", jSONObject);
                    jSONObject4.put("metric", jSONObject2);
                    jSONObject4.put("extra", jSONObject3);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                C15253a.m28071a().mo24705e();
            }
            this.f37260b.mo23859a(str, jSONObject, jSONObject2, jSONObject3);
        }
    }
}
