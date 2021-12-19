package com.bytedance.platform.godzilla.p1575b.p1584c;

import com.bytedance.covode.number.Covode;
import com.bytedance.platform.godzilla.p1574a.C21689g;
import com.bytedance.platform.godzilla.p1585c.AbstractC21721e;
import java.util.concurrent.TimeoutException;

/* renamed from: com.bytedance.platform.godzilla.b.c.a */
public final class C21715a extends AbstractC21721e {
    static {
        Covode.recordClassIndex(25356);
    }

    @Override // com.bytedance.platform.godzilla.p1585c.AbstractC21717a
    /* renamed from: b */
    public final String mo35351b() {
        return "FinalizeTimeoutPlugin";
    }

    @Override // com.bytedance.platform.godzilla.p1585c.AbstractC21721e
    /* renamed from: c */
    public final boolean mo35373c() {
        return true;
    }

    @Override // com.bytedance.platform.godzilla.p1585c.AbstractC21717a, com.bytedance.platform.godzilla.p1585c.AbstractC21721e
    /* renamed from: a */
    public final void mo35350a() {
        super.mo35350a();
    }

    @Override // com.bytedance.platform.godzilla.p1574a.AbstractC21692h
    /* renamed from: a */
    public final boolean mo35345a(Thread thread, Throwable th) {
        if (thread == null || th == null || !thread.getName().equals("FinalizerWatchdogDaemon") || !(th instanceof TimeoutException)) {
            return false;
        }
        C21689g.m40635a(C21689g.EnumC21691a.ERROR);
        return true;
    }
}
