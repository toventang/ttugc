package com.p2082ss.android.ugc.aweme.effectplatform;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttve.monitor.C30685c;
import com.p2082ss.android.ttve.monitor.C30689e;
import com.p2082ss.android.ugc.effectmanager.common.listener.IMonitorService;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.e */
public final class C46414e implements IMonitorService {
    static {
        Covode.recordClassIndex(54995);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.listener.IMonitorService
    public final void monitorCommonLog(String str, String str2, JSONObject jSONObject) {
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.listener.IMonitorService
    public final void monitorCommonLog(String str, JSONObject jSONObject) {
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.listener.IMonitorService
    public final void monitorDirectOnTimer(String str, String str2, float f) {
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.listener.IMonitorService
    public final void monitorOnTimer(String str, String str2, float f) {
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.listener.IMonitorService
    public final void monitorStatusRate(String str, int i, JSONObject jSONObject) {
        C30689e.m63053a(str, i, jSONObject);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.listener.IMonitorService
    public final void monitorStatusAndDuration(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        C30689e.m63051a();
        if (C30685c.m63035a() != null) {
            C30685c.m63035a().mo23856a(str, i, jSONObject, jSONObject2);
        }
    }
}
