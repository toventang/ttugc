package com.ttnet.org.chromium.base.task;

import android.view.Choreographer;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ttnet.org.chromium.base.task.e */
public final class C87482e implements AbstractC87492l {

    /* renamed from: a */
    private final Choreographer f198436a;

    static {
        Covode.recordClassIndex(103428);
    }

    @Override // com.ttnet.org.chromium.base.task.AbstractC87494n
    /* renamed from: a */
    public final void mo141538a() {
    }

    @Override // com.ttnet.org.chromium.base.task.AbstractC87494n
    /* renamed from: b */
    public final void mo141540b() {
    }

    @Override // com.ttnet.org.chromium.base.task.AbstractC87494n
    /* renamed from: c */
    public final void mo141541c() {
    }

    C87482e(Choreographer choreographer) {
        this.f198436a = choreographer;
    }

    @Override // com.ttnet.org.chromium.base.task.AbstractC87494n
    /* renamed from: a */
    public final void mo141539a(final Runnable runnable, long j) {
        this.f198436a.postFrameCallbackDelayed(new Choreographer.FrameCallback() {
            /* class com.ttnet.org.chromium.base.task.C87482e.Choreographer$FrameCallbackC874831 */

            static {
                Covode.recordClassIndex(103429);
            }

            public final void doFrame(long j) {
                runnable.run();
            }
        }, 0);
    }
}
