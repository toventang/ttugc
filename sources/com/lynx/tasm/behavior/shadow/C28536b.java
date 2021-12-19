package com.lynx.tasm.behavior.shadow;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.base.C28454c;
import com.lynx.tasm.p2047b.C28449c;

/* renamed from: com.lynx.tasm.behavior.shadow.b */
public class C28536b implements AbstractC28538c {

    /* renamed from: a */
    Runnable f67144a;

    /* renamed from: b */
    public boolean f67145b;

    /* renamed from: c */
    private Handler f67146c;

    /* renamed from: d */
    private C28449c f67147d;

    static {
        Covode.recordClassIndex(34537);
    }

    @Override // com.lynx.tasm.behavior.shadow.AbstractC28538c
    /* renamed from: a */
    public final void mo49111a(Runnable runnable) {
        boolean z;
        if (this.f67146c == null) {
            this.f67146c = new Handler();
            this.f67147d = new C28449c();
        }
        C28449c cVar = this.f67147d;
        Thread currentThread = Thread.currentThread();
        if (cVar.f66908a == null) {
            cVar.f66908a = currentThread;
        }
        if (cVar.f66908a == currentThread) {
            z = true;
        } else {
            z = false;
        }
        C28454c.m56882a(z);
        if (!this.f67145b) {
            this.f67144a = runnable;
            this.f67146c.postDelayed(new Runnable() {
                /* class com.lynx.tasm.behavior.shadow.C28536b.RunnableC285371 */

                static {
                    Covode.recordClassIndex(34538);
                }

                public final void run() {
                    C28536b bVar = C28536b.this;
                    if (bVar.f67144a != null) {
                        bVar.f67144a.run();
                    }
                    C28536b.this.f67145b = false;
                }
            }, 16);
            this.f67145b = true;
        }
    }
}
