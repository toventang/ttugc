package com.bytedance.android.monitorV2.p731d;

import com.bytedance.android.monitorV2.p728a.AbstractC12067b;
import com.bytedance.android.monitorV2.p740l.C12130f;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitorV2.d.g */
public final class C12088g extends AbstractC12067b {

    /* renamed from: b */
    public int f28995b;

    /* renamed from: c */
    public int f28996c;

    /* renamed from: d */
    public String f28997d;

    /* renamed from: e */
    public String f28998e;

    /* renamed from: f */
    public String f28999f;

    /* renamed from: g */
    public String f29000g;

    static {
        Covode.recordClassIndex(13817);
    }

    public C12088g() {
        super("jsbError");
    }

    @Override // com.bytedance.android.monitorV2.p728a.AbstractC12067b
    public final String toString() {
        return "JsbErrorData(isSync=" + this.f28995b + ", errorCode=" + this.f28996c + ", errorMessage=" + this.f28997d + ", bridgeName=" + this.f28998e + ", errorActivity=" + this.f28999f + ", protocol=" + this.f29000g + ')';
    }

    @Override // com.bytedance.android.monitorV2.p728a.AbstractC12066a
    /* renamed from: a */
    public final void mo19417a(JSONObject jSONObject) {
        C89219l.m154719c(jSONObject, "");
        C12130f.m21649a(jSONObject, "is_sync", this.f28995b);
        C12130f.m21649a(jSONObject, "error_code", this.f28996c);
        C12130f.m21652a(jSONObject, "error_message", this.f28997d);
        C12130f.m21652a(jSONObject, "bridge_name", this.f28998e);
        C12130f.m21652a(jSONObject, "error_activity", this.f28999f);
        C12130f.m21652a(jSONObject, "protocol_version", this.f29000g);
    }
}
