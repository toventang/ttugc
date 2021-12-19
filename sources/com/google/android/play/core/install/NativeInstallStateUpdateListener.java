package com.google.android.play.core.install;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

final class NativeInstallStateUpdateListener implements AbstractC27057b {
    static {
        Covode.recordClassIndex(32532);
    }

    NativeInstallStateUpdateListener() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.play.core.p1964c.AbstractC26967a
    /* renamed from: a */
    public final /* synthetic */ void mo35005a(InstallState installState) {
        MethodCollector.m26663i(11476);
        onStateUpdate(installState);
        MethodCollector.m26664o(11476);
    }

    public final native void onStateUpdate(InstallState installState);
}
