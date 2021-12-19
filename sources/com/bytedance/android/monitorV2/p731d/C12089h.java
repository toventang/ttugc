package com.bytedance.android.monitorV2.p731d;

import com.bytedance.android.monitorV2.p728a.AbstractC12067b;
import com.bytedance.android.monitorV2.p740l.C12130f;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitorV2.d.h */
public final class C12089h extends AbstractC12067b {

    /* renamed from: b */
    public String f29001b;

    /* renamed from: c */
    public int f29002c;

    /* renamed from: d */
    public String f29003d;

    /* renamed from: e */
    public String f29004e;

    /* renamed from: f */
    public long f29005f;

    /* renamed from: g */
    public long f29006g;

    /* renamed from: h */
    public long f29007h;

    /* renamed from: i */
    public long f29008i;

    static {
        Covode.recordClassIndex(13818);
    }

    public C12089h() {
        super("jsbPerf");
    }

    @Override // com.bytedance.android.monitorV2.p728a.AbstractC12067b
    public final String toString() {
        return "JsbInfoData(bridgeName=" + this.f29001b + ", statusCode=" + this.f29002c + ", statusDescription=" + this.f29003d + ", protocolVersion=" + this.f29004e + ", costTime=" + this.f29005f + ", invokeTime=" + this.f29006g + ", callbackTime=" + this.f29007h + ", fireEventTime=" + this.f29008i + ')';
    }

    @Override // com.bytedance.android.monitorV2.p728a.AbstractC12066a
    /* renamed from: a */
    public final void mo19417a(JSONObject jSONObject) {
        C89219l.m154719c(jSONObject, "");
        C12130f.m21652a(jSONObject, "bridge_name", this.f29001b);
        C12130f.m21649a(jSONObject, "status_code", this.f29002c);
        C12130f.m21652a(jSONObject, "status_description", this.f29003d);
        C12130f.m21652a(jSONObject, "protocol_version", this.f29004e);
        C12130f.m21650a(jSONObject, "cost_time", this.f29005f);
        C12130f.m21650a(jSONObject, "invoke_ts", this.f29006g);
        C12130f.m21650a(jSONObject, "callback_ts", this.f29007h);
        C12130f.m21650a(jSONObject, "fireEvent_ts", this.f29008i);
    }
}
