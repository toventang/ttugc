package com.bytedance.android.monitor.p706d;

import com.bytedance.android.monitor.p704b.AbstractC11908b;
import com.bytedance.android.monitor.p714l.C11950d;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitor.d.g */
public final class C11924g extends AbstractC11908b {

    /* renamed from: b */
    public int f28515b;

    /* renamed from: c */
    public int f28516c;

    /* renamed from: d */
    public String f28517d;

    /* renamed from: e */
    public String f28518e;

    /* renamed from: f */
    public String f28519f;

    /* renamed from: g */
    public String f28520g;

    static {
        Covode.recordClassIndex(13650);
    }

    public C11924g() {
        super("jsbError");
    }

    public final String toString() {
        return "JsbErrorData(isSync=" + this.f28515b + ", errorCode=" + this.f28516c + ", errorMessage=" + this.f28517d + ", bridgeName=" + this.f28518e + ", errorActivity=" + this.f28519f + ", protocol=" + this.f28520g + ')';
    }

    @Override // com.bytedance.android.monitor.p704b.AbstractC11907a
    /* renamed from: a */
    public final void mo19117a(JSONObject jSONObject) {
        C89219l.m154719c(jSONObject, "");
        C11950d.m21098a(jSONObject, "is_sync", this.f28515b);
        C11950d.m21098a(jSONObject, "error_code", this.f28516c);
        C11950d.m21101a(jSONObject, "error_message", this.f28517d);
        C11950d.m21101a(jSONObject, "bridge_name", this.f28518e);
        C11950d.m21101a(jSONObject, "error_activity", this.f28519f);
        C11950d.m21101a(jSONObject, "protocol_version", this.f28520g);
    }
}
