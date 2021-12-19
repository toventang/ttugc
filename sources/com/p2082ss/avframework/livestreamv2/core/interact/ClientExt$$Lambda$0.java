package com.p2082ss.avframework.livestreamv2.core.interact;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.livestreamv2.core.interact.statistic.InteractLogService;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.ClientExt$$Lambda$0 */
final /* synthetic */ class ClientExt$$Lambda$0 implements InteractLogService.LogCallback {
    private final ClientExt arg$1;

    static {
        Covode.recordClassIndex(100284);
    }

    ClientExt$$Lambda$0(ClientExt clientExt) {
        this.arg$1 = clientExt;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.LogCallback
    public final void onLogReport(String str, JSONObject jSONObject) {
        this.arg$1.onLogMonitor(str, jSONObject);
    }
}
