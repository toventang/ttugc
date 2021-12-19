package com.bytedance.p1734ug.p1735a;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ug.a.g */
public final class C23446g implements AbstractC23454l {

    /* renamed from: a */
    private final Handler f55603a = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(27406);
    }

    C23446g() {
    }

    @Override // com.bytedance.p1734ug.p1735a.AbstractC23454l
    /* renamed from: a */
    public final void mo38212a(C23440a aVar) {
        final RuntimeException runtimeException = new RuntimeException();
        this.f55603a.post(new Runnable() {
            /* class com.bytedance.p1734ug.p1735a.C23446g.RunnableC234471 */

            static {
                Covode.recordClassIndex(27407);
            }

            public final void run() {
                throw runtimeException;
            }
        });
    }
}
