package com.p2082ss.android.ugc.aweme.download.component_api.depend;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.download.component_api.depend.IMonitorLogSendDepend */
public interface IMonitorLogSendDepend {
    static {
        Covode.recordClassIndex(51365);
    }

    void sendMonitorLog(String str, JSONObject jSONObject);
}
