package com.bytedance.android.live.broadcast;

import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.broadcast.t */
public final /* synthetic */ class C3709t implements AbstractC88433f {

    /* renamed from: a */
    private final EnumC3338p f10278a;

    static {
        Covode.recordClassIndex(4222);
    }

    C3709t(EnumC3338p pVar) {
        this.f10278a = pVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        EnumC3338p pVar = this.f10278a;
        Throwable th = (Throwable) obj;
        pVar.isLoadedRes.setValue(false);
        pVar.f9528c = false;
        pVar.f9527b = th.toString();
        C3854a.m9453a(6, "LiveCameraResManager", "error occurred when load resources: " + th.toString());
        C3854a.m9453a(6, "LiveCameraResManager", th.toString());
        pVar.f9526a.put("load_function_error", th.toString());
        pVar.f9526a.put("error_code", 10002);
        pVar.f9526a.put("error_msg", "load_function_error");
        C3868c.m9491a("ttlive_start_live_resource_load_all", 1, pVar.f9526a);
        pVar.f9526a.clear();
    }
}
