package org.greenrobot.eventbus;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: org.greenrobot.eventbus.h */
public final class HandlerC90251h extends Handler implements AbstractC90263q {

    /* renamed from: a */
    private final C90262p f205019a = new C90262p();

    /* renamed from: b */
    private final int f205020b = 10;

    /* renamed from: c */
    private final EventBus f205021c;

    /* renamed from: d */
    private boolean f205022d;

    static {
        Covode.recordClassIndex(106522);
    }

    public final void handleMessage(Message message) {
        MethodCollector.m26663i(6056);
        boolean z = false;
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                C90261o a = this.f205019a.mo145419a();
                if (a == null) {
                    synchronized (this) {
                        try {
                            a = this.f205019a.mo145419a();
                            if (a == null) {
                                this.f205022d = z;
                                this.f205022d = z;
                                MethodCollector.m26664o(6056);
                                return;
                            }
                        } catch (Throwable th) {
                            MethodCollector.m26664o(6056);
                            throw th;
                        }
                    }
                }
                this.f205021c.mo145392a(a);
            } while (SystemClock.uptimeMillis() - uptimeMillis < ((long) this.f205020b));
            if (sendMessage(obtainMessage())) {
                z = true;
                return;
            }
            C90247d dVar = new C90247d("Could not send handler message");
            MethodCollector.m26664o(6056);
            throw dVar;
        } finally {
            this.f205022d = z;
            MethodCollector.m26664o(6056);
        }
    }

    protected HandlerC90251h(EventBus eventBus, Looper looper) {
        super(looper);
        this.f205021c = eventBus;
    }

    @Override // org.greenrobot.eventbus.AbstractC90263q
    /* renamed from: a */
    public final void mo145403a(C90269v vVar, Object obj) {
        MethodCollector.m26663i(6054);
        C90261o a = C90261o.m157008a(vVar, obj);
        synchronized (this) {
            try {
                this.f205019a.mo145420a(a);
                if (!this.f205022d) {
                    this.f205022d = true;
                    if (!sendMessage(obtainMessage())) {
                        C90247d dVar = new C90247d("Could not send handler message");
                        MethodCollector.m26664o(6054);
                        throw dVar;
                    }
                }
            } finally {
                MethodCollector.m26664o(6054);
            }
        }
    }
}
