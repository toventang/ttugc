package com.lynx.tasm.behavior.shadow;

import android.view.Choreographer;
import com.bytedance.covode.number.Covode;

/* renamed from: com.lynx.tasm.behavior.shadow.a */
public class C28534a implements AbstractC28538c {
    static {
        Covode.recordClassIndex(34535);
    }

    @Override // com.lynx.tasm.behavior.shadow.AbstractC28538c
    /* renamed from: a */
    public final void mo49111a(final Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() {
            /* class com.lynx.tasm.behavior.shadow.C28534a.Choreographer$FrameCallbackC285351 */

            static {
                Covode.recordClassIndex(34536);
            }

            public final void doFrame(long j) {
                runnable.run();
            }
        });
    }
}
