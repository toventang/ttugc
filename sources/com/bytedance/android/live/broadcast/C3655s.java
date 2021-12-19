package com.bytedance.android.live.broadcast;

import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.broadcast.s */
public final /* synthetic */ class C3655s implements AbstractC88433f {

    /* renamed from: a */
    private final EnumC3338p f10077a;

    static {
        Covode.recordClassIndex(4167);
    }

    C3655s(EnumC3338p pVar) {
        this.f10077a = pVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        EnumC3338p pVar = this.f10077a;
        Boolean bool = (Boolean) obj;
        if (bool.booleanValue()) {
            pVar.f9528c = false;
            C6806c.m14603a(AbstractC6804a.f17060k, "0.0.20");
            pVar.isLoadedRes.setValue(true);
            C3854a.m9453a(3, "LiveCameraResManager", "all resources loaded");
        } else {
            pVar.f9528c = false;
            pVar.isLoadedRes.setValue(false);
        }
        if (!bool.booleanValue()) {
            pVar.f9526a.put("error_code", 10001);
            pVar.f9526a.put("error_msg", "load_res_error");
        }
        C3868c.m9491a("ttlive_start_live_resource_load_all", !bool.booleanValue(), pVar.f9526a);
        pVar.f9526a.clear();
    }
}
