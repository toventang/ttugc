package com.bytedance.ies.abmock;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ies.abmock.q */
public final /* synthetic */ class RunnableC16090q implements Runnable {

    /* renamed from: a */
    private final SettingsManager f38740a;

    static {
        Covode.recordClassIndex(18366);
    }

    RunnableC16090q(SettingsManager settingsManager) {
        this.f38740a = settingsManager;
    }

    public final void run() {
        Object[] b = this.f38740a.mo25401b();
        if (b != null) {
            for (Object obj : b) {
                ((AbstractC16082i) obj).mo25536a();
            }
        }
    }
}
