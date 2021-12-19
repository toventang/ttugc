package com.bytedance.platform.godzilla.sysopt;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1585c.AbstractC21717a;

/* renamed from: com.bytedance.platform.godzilla.sysopt.a */
public final class C21729a extends AbstractC21717a {

    /* renamed from: b */
    private int f51498b;

    static {
        Covode.recordClassIndex(25373);
    }

    @Override // com.bytedance.platform.godzilla.p1585c.AbstractC21717a
    /* renamed from: a */
    public final void mo35359a(Application application) {
    }

    @Override // com.bytedance.platform.godzilla.p1585c.AbstractC21717a
    /* renamed from: b */
    public final String mo35351b() {
        return "PthreadCreateHookPlugin";
    }

    public C21729a() {
        this.f51498b = 1048576;
        this.f51498b = 536576;
    }

    @Override // com.bytedance.platform.godzilla.p1585c.AbstractC21717a
    /* renamed from: a */
    public final void mo35350a() {
        MethodCollector.m26663i(9146);
        PthreadCreateHook.start(this.f51498b);
        MethodCollector.m26664o(9146);
    }
}
