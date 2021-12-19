package com.p2082ss.android.ugc.aweme.web.jsbridge;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.MonitorLogMethod */
public class MonitorLogMethod extends BaseCommonJavaMethod implements AbstractC33974au {
    static {
        Covode.recordClassIndex(94950);
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        if (jSONObject != null && jSONObject.length() != 0) {
            String optString = jSONObject.optString("log_type");
            if (!TextUtils.isEmpty(optString)) {
                String optString2 = jSONObject.optString("service");
                if (!TextUtils.equals(optString, "service_monitor") || !TextUtils.isEmpty(optString2)) {
                    JSONObject jSONObject2 = new JSONObject();
                    m141431a(jSONObject, jSONObject2, "status");
                    m141431a(jSONObject, jSONObject2, "value");
                    C33830n.m69192a(optString, optString2, jSONObject2);
                    if (aVar != null) {
                        aVar.mo79886a((Object) null);
                    }
                } else if (aVar != null) {
                    aVar.mo79885a(0, "service is required while log_type=".concat(String.valueOf(optString)));
                }
            } else if (aVar != null) {
                aVar.mo79885a(0, "log_type is empty");
            }
        } else if (aVar != null) {
            aVar.mo79885a(0, "params is empty");
        }
    }

    /* renamed from: a */
    private static void m141431a(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        Object opt = jSONObject.opt(str);
        if (opt != null) {
            jSONObject2.put(str, opt);
        }
    }
}
