package com.p2082ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.effectmanager.knadapt.KNExecutor$execute$1 */
final class KNExecutor$execute$1 implements Runnable {
    final /* synthetic */ Runnable $command;

    static {
        Covode.recordClassIndex(95722);
    }

    KNExecutor$execute$1(Runnable runnable) {
        this.$command = runnable;
    }

    public final void run() {
        Runnable runnable = this.$command;
        if (runnable != null) {
            runnable.run();
        }
    }
}
