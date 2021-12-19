package com.bytedance.android.monitor.p706d;

import com.bytedance.android.monitor.p704b.AbstractC11908b;
import com.bytedance.android.monitor.p714l.C11950d;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitor.d.j */
public final class C11927j extends AbstractC11908b {

    /* renamed from: b */
    public long f28540b = System.currentTimeMillis();

    static {
        Covode.recordClassIndex(13653);
    }

    public C11927j() {
        super("navigationStart");
    }

    @Override // com.bytedance.android.monitor.p704b.AbstractC11907a
    /* renamed from: a */
    public final void mo19117a(JSONObject jSONObject) {
        C89219l.m154719c(jSONObject, "");
        C11950d.m21099a(jSONObject, "invoke_ts", this.f28540b);
    }
}
