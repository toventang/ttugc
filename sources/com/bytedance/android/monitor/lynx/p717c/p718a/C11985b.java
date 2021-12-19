package com.bytedance.android.monitor.lynx.p717c.p718a;

import com.bytedance.android.monitor.p706d.C11926i;
import com.bytedance.android.monitor.p714l.C11950d;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxEnv;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitor.lynx.c.a.b */
public final class C11985b extends C11926i {

    /* renamed from: l */
    public int f28699l;

    /* renamed from: m */
    public String f28700m = "";

    static {
        Covode.recordClassIndex(13711);
    }

    public C11985b() {
        this.f28531c = "lynx";
    }

    @Override // com.bytedance.android.monitor.p706d.C11926i, com.bytedance.android.monitor.p704b.AbstractC11907a
    /* renamed from: a */
    public final void mo19117a(JSONObject jSONObject) {
        super.mo19117a(jSONObject);
        C11950d.m21098a(jSONObject, "template_state", this.f28699l);
        C89219l.m154709a((Object) LynxEnv.m56706b(), "");
        C11950d.m21101a(jSONObject, "lynx_version", LynxEnv.m56707g());
        C11950d.m21101a(jSONObject, "page_version", this.f28700m);
    }
}
