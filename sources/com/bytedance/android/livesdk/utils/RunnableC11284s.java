package com.bytedance.android.livesdk.utils;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.utils.s */
public final /* synthetic */ class RunnableC11284s implements Runnable {

    /* renamed from: a */
    private final String f26991a;

    static {
        Covode.recordClassIndex(12916);
    }

    RunnableC11284s(String str) {
        this.f26991a = str;
    }

    public final void run() {
        LiveAppBundleUtils.monitorStartLoad(this.f26991a);
    }
}
