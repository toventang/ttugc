package com.p2082ss.ugc.live.sdk.msg;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.message.interfaces.ILogger;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMonitor;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.live.sdk.msg.a */
public final class C87075a implements ILogger, IMonitor {

    /* renamed from: a */
    private final ILogger f196296a;

    /* renamed from: b */
    private final IMonitor f196297b;

    static {
        Covode.recordClassIndex(102871);
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.ILogger
    public final void log(String str, String str2) {
        this.f196296a.log(str, str2);
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMonitor
    public final void monitor(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.f196297b.monitor(str, jSONObject, jSONObject2, jSONObject3);
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMonitor
    public final void monitorLatency(String str, long j, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.f196297b.monitorLatency(str, j, jSONObject, jSONObject2, jSONObject3);
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.ILogger
    public final boolean supportDebugInfo() {
        return this.f196296a.supportDebugInfo();
    }

    public C87075a(ILogger iLogger, IMonitor iMonitor) {
        C89219l.m154719c(iLogger, "");
        C89219l.m154719c(iMonitor, "");
        this.f196296a = iLogger;
        this.f196297b = iMonitor;
    }
}
