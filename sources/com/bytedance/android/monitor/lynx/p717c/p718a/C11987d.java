package com.bytedance.android.monitor.lynx.p717c.p718a;

import com.bytedance.android.monitor.p704b.AbstractC11907a;
import com.bytedance.android.monitor.p714l.C11950d;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitor.lynx.c.a.d */
public final class C11987d extends AbstractC11907a {

    /* renamed from: a */
    public long f28710a;

    /* renamed from: b */
    public long f28711b;

    /* renamed from: c */
    public long f28712c;

    /* renamed from: d */
    public long f28713d;

    /* renamed from: e */
    public long f28714e;

    /* renamed from: f */
    public long f28715f;

    /* renamed from: g */
    public boolean f28716g;

    /* renamed from: h */
    public boolean f28717h;

    static {
        Covode.recordClassIndex(13713);
    }

    @Override // com.bytedance.android.monitor.p704b.AbstractC11907a
    /* renamed from: a */
    public final void mo19117a(JSONObject jSONObject) {
        C89219l.m154719c(jSONObject, "");
        C11950d.m21099a(jSONObject, "load_start", this.f28710a);
        C11950d.m21099a(jSONObject, "load_finish", this.f28711b);
        C11950d.m21099a(jSONObject, "load_failed", this.f28712c);
        C11950d.m21099a(jSONObject, "receive_error", this.f28713d);
        C11950d.m21099a(jSONObject, "first_screen", this.f28714e);
        C11950d.m21099a(jSONObject, "runtime_ready", this.f28715f);
    }
}
