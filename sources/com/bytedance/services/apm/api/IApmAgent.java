package com.bytedance.services.apm.api;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.news.common.service.manager.IService;
import org.json.JSONObject;

public interface IApmAgent extends IService {
    static {
        Covode.recordClassIndex(26531);
    }

    void monitorCommonLog(String str, JSONObject jSONObject);

    void monitorDuration(String str, JSONObject jSONObject, JSONObject jSONObject2);

    void monitorEvent(C22709b bVar);

    void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    void monitorExceptionLog(String str, JSONObject jSONObject);

    void monitorLog(String str, JSONObject jSONObject);

    void monitorStatusAndDuration(String str, int i, JSONObject jSONObject, JSONObject jSONObject2);

    void monitorStatusRate(String str, int i, JSONObject jSONObject);

    void reportLegacyMonitorLog(Context context, long j, long j2, boolean z);
}
