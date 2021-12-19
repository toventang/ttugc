package com.bytedance.android.monitor.p706d;

import com.bytedance.android.monitor.p704b.AbstractC11908b;
import com.bytedance.android.monitor.p714l.C11950d;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitor.d.h */
public final class C11925h extends AbstractC11908b {

    /* renamed from: b */
    public String f28521b;

    /* renamed from: c */
    public int f28522c;

    /* renamed from: d */
    public String f28523d;

    /* renamed from: e */
    public String f28524e;

    /* renamed from: f */
    public long f28525f;

    /* renamed from: g */
    public long f28526g;

    /* renamed from: h */
    public long f28527h;

    /* renamed from: i */
    public long f28528i;

    static {
        Covode.recordClassIndex(13651);
    }

    public C11925h() {
        super("jsbPerf");
    }

    public final String toString() {
        return "JsbInfoData(bridgeName=" + this.f28521b + ", statusCode=" + this.f28522c + ", statusDescription=" + this.f28523d + ", protocolVersion=" + this.f28524e + ", costTime=" + this.f28525f + ", invokeTime=" + this.f28526g + ", callbackTime=" + this.f28527h + ", fireEventTime=" + this.f28528i + ')';
    }

    @Override // com.bytedance.android.monitor.p704b.AbstractC11907a
    /* renamed from: a */
    public final void mo19117a(JSONObject jSONObject) {
        C89219l.m154719c(jSONObject, "");
        C11950d.m21101a(jSONObject, "bridge_name", this.f28521b);
        C11950d.m21098a(jSONObject, "status_code", this.f28522c);
        C11950d.m21101a(jSONObject, "status_description", this.f28523d);
        C11950d.m21101a(jSONObject, "protocol_version", this.f28524e);
        C11950d.m21099a(jSONObject, "cost_time", this.f28525f);
        C11950d.m21099a(jSONObject, "invoke_ts", this.f28526g);
        C11950d.m21099a(jSONObject, "callback_ts", this.f28527h);
        C11950d.m21099a(jSONObject, "fireEvent_ts", this.f28528i);
    }
}
