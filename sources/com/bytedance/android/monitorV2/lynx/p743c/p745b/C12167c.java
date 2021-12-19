package com.bytedance.android.monitorV2.lynx.p743c.p745b;

import com.bytedance.android.monitorV2.p728a.AbstractC12066a;
import com.bytedance.android.monitorV2.p740l.C12130f;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitorV2.lynx.c.b.c */
public final class C12167c extends AbstractC12066a {

    /* renamed from: a */
    public long f29275a;

    /* renamed from: b */
    public long f29276b;

    /* renamed from: c */
    public long f29277c;

    /* renamed from: d */
    public long f29278d;

    /* renamed from: e */
    public long f29279e;

    /* renamed from: f */
    public long f29280f;

    /* renamed from: g */
    public boolean f29281g;

    /* renamed from: h */
    public boolean f29282h;

    static {
        Covode.recordClassIndex(13896);
    }

    @Override // com.bytedance.android.monitorV2.p728a.AbstractC12066a
    /* renamed from: a */
    public final void mo19417a(JSONObject jSONObject) {
        C89219l.m154719c(jSONObject, "");
        C12130f.m21650a(jSONObject, "load_start", this.f29275a);
        C12130f.m21650a(jSONObject, "load_finish", this.f29276b);
        C12130f.m21650a(jSONObject, "load_failed", this.f29277c);
        C12130f.m21650a(jSONObject, "receive_error", this.f29278d);
        C12130f.m21650a(jSONObject, "first_screen", this.f29279e);
        C12130f.m21650a(jSONObject, "runtime_ready", this.f29280f);
    }
}
