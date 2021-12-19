package com.p2082ss.android.ugc.aweme.download.component_api.depend;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30389w;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.download.component_api.depend.DownloadMonitorDepend */
public class DownloadMonitorDepend implements AbstractC30389w {
    private String eventName;
    private String eventPage;
    private Map<String, String> extraInfo;
    private IMonitorLogSendDepend logDepend;

    static {
        Covode.recordClassIndex(51362);
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30389w
    public String getEventPage() {
        return this.eventPage;
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30389w
    public void monitorLogSend(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                Map<String, String> map = this.extraInfo;
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        String key = entry.getKey();
                        if (jSONObject.get(key) == null) {
                            jSONObject.put(key, entry.getValue());
                        }
                    }
                }
                IMonitorLogSendDepend iMonitorLogSendDepend = this.logDepend;
                if (iMonitorLogSendDepend != null) {
                    iMonitorLogSendDepend.sendMonitorLog(this.eventName, jSONObject);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public DownloadMonitorDepend(IMonitorLogSendDepend iMonitorLogSendDepend, Map<String, String> map, String str, String str2) {
        this.logDepend = iMonitorLogSendDepend;
        this.extraInfo = map;
        this.eventPage = str;
        this.eventName = str2;
    }
}
