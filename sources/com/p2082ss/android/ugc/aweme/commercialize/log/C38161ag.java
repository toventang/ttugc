package com.p2082ss.android.ugc.aweme.commercialize.log;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.C16091a;
import com.bytedance.ies.android.base.runtime.depend.IMonitorDepend;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.ag */
public final class C38161ag {

    /* renamed from: a */
    public static final C38161ag f90139a = new C38161ag();

    private C38161ag() {
    }

    static {
        Covode.recordClassIndex(45640);
    }

    /* renamed from: a */
    public static void m77365a(String str, String str2, JSONObject jSONObject) {
        C89219l.m154721d(str, "");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("service", str2);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        IMonitorDepend iMonitorDepend = C16091a.f38742b;
        if (iMonitorDepend != null) {
            iMonitorDepend.monitorCommonLog(str, jSONObject);
        }
    }
}
