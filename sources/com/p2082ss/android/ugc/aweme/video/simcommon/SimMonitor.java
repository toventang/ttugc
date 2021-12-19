package com.p2082ss.android.ugc.aweme.video.simcommon;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.playerkit.simapicommon.reporter.IMonitor;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.video.simcommon.SimMonitor */
public class SimMonitor implements IMonitor {
    static {
        Covode.recordClassIndex(94247);
    }

    @Override // com.p2082ss.android.ugc.playerkit.simapicommon.reporter.IMonitor
    public void ensureNotReachHere(Throwable th) {
        C22708a.m42802a(th);
    }

    @Override // com.p2082ss.android.ugc.playerkit.simapicommon.reporter.IMonitor
    public void ensureNotReachHere(Throwable th, String str) {
        C22708a.m42803a(th, str);
    }

    @Override // com.p2082ss.android.ugc.playerkit.simapicommon.reporter.IMonitor
    public void monitorCommonLog(String str, JSONObject jSONObject) {
        C33830n.m70668a(str, jSONObject);
    }

    @Override // com.p2082ss.android.ugc.playerkit.simapicommon.reporter.IMonitor
    public void monitorCommonLog(String str, String str2, JSONObject jSONObject) {
        C33830n.m69192a(str, str2, jSONObject);
    }

    @Override // com.p2082ss.android.ugc.playerkit.simapicommon.reporter.IMonitor
    public void monitorStatusRate(String str, int i, JSONObject jSONObject) {
        C12290b.m22060a(str, i, jSONObject);
    }

    @Override // com.p2082ss.android.ugc.playerkit.simapicommon.reporter.IMonitor
    public void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C12290b.m22066a(str, jSONObject, jSONObject2, jSONObject3);
    }
}
