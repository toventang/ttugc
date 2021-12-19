package com.bytedance.ies.web.jsbridge2;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.C18364w;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ies.web.jsbridge2.ae */
public final /* synthetic */ class RunnableC18320ae implements Runnable {

    /* renamed from: a */
    private final C18315ad f43823a;

    /* renamed from: b */
    private final C18364w.AbstractC18367b f43824b;

    static {
        Covode.recordClassIndex(20992);
    }

    RunnableC18320ae(C18315ad adVar, C18364w.AbstractC18367b bVar) {
        this.f43823a = adVar;
        this.f43824b = bVar;
    }

    public final void run() {
        C18315ad adVar = this.f43823a;
        C18364w.AbstractC18367b bVar = this.f43824b;
        new TimeLineEvent.C18302a().mo29301a(TimeLineEvent.C18303b.f43689E, (Object) false).mo29302a(TimeLineEvent.C18303b.f43727aa, C18364w.f43929f);
        adVar.f43809b.mo29387h().mo29391a("com.bytedance.ies.web.jsbridge2.PermissionConfigRepository.permission_config_response", new C18322ag(adVar, bVar));
    }
}
