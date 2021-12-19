package com.google.p1970ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.p1970ar.core.exceptions.UnavailableUserDeclinedInstallationException;

/* renamed from: com.google.ar.core.ai */
final class C27086ai {

    /* renamed from: a */
    boolean f64086a;

    /* renamed from: b */
    final /* synthetic */ InstallActivity f64087b;

    static {
        Covode.recordClassIndex(32635);
    }

    C27086ai(InstallActivity installActivity) {
        this.f64087b = installActivity;
    }

    /* renamed from: a */
    public final void mo45124a(Exception exc) {
        MethodCollector.m26663i(7546);
        synchronized (this.f64087b) {
            try {
                if (!this.f64086a) {
                    this.f64086a = true;
                    InstallActivity.access$402(this.f64087b, EnumC27087aj.CANCELLED);
                    this.f64087b.finishWithFailure(exc);
                    MethodCollector.m26664o(7546);
                }
            } finally {
                MethodCollector.m26664o(7546);
            }
        }
    }

    /* renamed from: a */
    public final void mo45123a(EnumC27087aj ajVar) {
        MethodCollector.m26663i(7545);
        synchronized (this.f64087b) {
            try {
                if (!this.f64086a) {
                    InstallActivity.access$402(this.f64087b, ajVar);
                    int ordinal = ajVar.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            this.f64087b.finishWithFailure(new UnavailableUserDeclinedInstallationException());
                        } else if (ordinal == 2) {
                            if (!this.f64087b.waitingForCompletion && C27117z.f64185a.f64187c) {
                                this.f64087b.closeInstaller();
                            }
                            this.f64087b.finishWithFailure(null);
                        }
                        this.f64086a = true;
                        MethodCollector.m26664o(7545);
                        return;
                    }
                    MethodCollector.m26664o(7545);
                }
            } finally {
                MethodCollector.m26664o(7545);
            }
        }
    }
}
