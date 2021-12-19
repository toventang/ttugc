package com.p2082ss.android.ugc.effectmanager.common.listener;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.effectmanager.common.listener.IMonitorService */
public interface IMonitorService {
    static {
        Covode.recordClassIndex(95475);
    }

    void monitorCommonLog(String str, String str2, JSONObject jSONObject);

    void monitorCommonLog(String str, JSONObject jSONObject);

    void monitorDirectOnTimer(String str, String str2, float f);

    void monitorOnTimer(String str, String str2, float f);

    void monitorStatusAndDuration(String str, int i, JSONObject jSONObject, JSONObject jSONObject2);

    void monitorStatusRate(String str, int i, JSONObject jSONObject);
}
