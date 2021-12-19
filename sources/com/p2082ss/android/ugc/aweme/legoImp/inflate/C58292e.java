package com.p2082ss.android.ugc.aweme.legoImp.inflate;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.legoImp.inflate.e */
public final class C58292e {
    static {
        Covode.recordClassIndex(68371);
    }

    /* renamed from: a */
    private static void m105314a(String str, String str2, JSONObject jSONObject) {
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
        C12290b.m22064a(str, jSONObject);
    }

    /* renamed from: a */
    public static View m105313a(String str, View view, Context context, int i) {
        MethodCollector.m26663i(12034);
        StringBuilder sb = new StringBuilder();
        sb.append(str + "type=" + view.getClass().getName() + "\n").append(str + "id=" + view.getId() + "\n").append(str + "childCount=" + ((ViewGroup) view).getChildCount()).append(str + "isX2COpen=" + C58293f.f132752b);
        C51423a.m95787a(sb.toString());
        m105314a("x2c_error", "", new C33743c().mo59976a("x2c_error", sb.toString()).mo59977a());
        if (i != 0) {
            View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) null);
            MethodCollector.m26664o(12034);
            return inflate;
        }
        MethodCollector.m26664o(12034);
        return null;
    }
}
