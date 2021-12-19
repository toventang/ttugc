package com.bytedance.push.p1598i;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.AbstractC13621j;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.push.p1590c.AbstractC21780k;
import com.bytedance.push.p1593f.C21804c;
import com.p2082ss.android.message.C30061a;
import com.p2082ss.android.message.p2159a.C30062a;
import com.p2082ss.android.pushmanager.C30205a;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.i.d */
public final class RunnableC21841d implements Runnable {

    /* renamed from: a */
    private final String f51744a;

    /* renamed from: b */
    private final AbstractC21780k f51745b;

    static {
        Covode.recordClassIndex(25493);
    }

    public final void run() {
        Map<Integer, C21804c> a;
        MethodCollector.m26663i(5370);
        synchronized (RunnableC21837b.f51734a) {
            try {
                if (!TextUtils.isEmpty(this.f51744a) && (a = C21842e.m40915a(C30061a.f71748a)) != null && !a.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    for (C21804c cVar : a.values()) {
                        if (cVar != null && cVar.f51679e > 0) {
                            if (!TextUtils.isEmpty(cVar.f51678d)) {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("sender_id", cVar.f51679e);
                                    jSONObject.put("token", cVar.f51678d);
                                    jSONArray.put(jSONObject);
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }
                    Map<String, String> e2 = this.f51745b.mo35448e();
                    e2.put("update_event", this.f51744a);
                    String a2 = C30062a.m60802a(C30205a.m61093a("/service/1/update_token/"), e2);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new Pair("sender_token_list", jSONArray.toString()));
                    int i = 0;
                    while (true) {
                        try {
                            if ("success".equals(new JSONObject(AbstractC13621j.f33100a.mo21869a(a2, arrayList, (Map<String, String>) null)).optString("message"))) {
                                break;
                            }
                        } catch (Throwable unused) {
                        }
                        i++;
                        if (i >= 2) {
                            break;
                        }
                    }
                }
            } finally {
                MethodCollector.m26664o(5370);
            }
        }
    }

    public RunnableC21841d(AbstractC21780k kVar, String str) {
        this.f51745b = kVar;
        this.f51744a = str;
    }
}
