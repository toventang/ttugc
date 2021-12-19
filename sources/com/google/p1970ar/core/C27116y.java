package com.google.p1970ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.p1970ar.core.ArCoreApk;

/* renamed from: com.google.ar.core.y */
final class C27116y implements AbstractC27115x {

    /* renamed from: a */
    final /* synthetic */ C27117z f64184a;

    static {
        Covode.recordClassIndex(32696);
    }

    C27116y(C27117z zVar) {
        this.f64184a = zVar;
    }

    @Override // com.google.p1970ar.core.AbstractC27115x
    /* renamed from: a */
    public final void mo45119a(ArCoreApk.Availability availability) {
        MethodCollector.m26663i(9602);
        synchronized (this.f64184a) {
            try {
                this.f64184a.f64188d = availability;
                this.f64184a.f64189e = false;
            } finally {
                MethodCollector.m26664o(9602);
            }
        }
    }
}
