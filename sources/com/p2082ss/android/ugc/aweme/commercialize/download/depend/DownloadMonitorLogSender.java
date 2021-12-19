package com.p2082ss.android.ugc.aweme.commercialize.download.depend;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.p2132c.C29819a;
import com.p2082ss.android.ugc.aweme.download.component_api.depend.IMonitorLogSendDepend;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.download.depend.DownloadMonitorLogSender */
public final class DownloadMonitorLogSender implements IMonitorLogSendDepend {
    static {
        Covode.recordClassIndex(45132);
    }

    @Override // com.p2082ss.android.ugc.aweme.download.component_api.depend.IMonitorLogSendDepend
    public final void sendMonitorLog(String str, JSONObject jSONObject) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(jSONObject, "");
        C29819a.m60077a(str, jSONObject);
    }
}
