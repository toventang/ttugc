package com.bytedance.platform.p1565a.p1567b.p1570c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.p1565a.p1566a.C21630g;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.platform.a.b.c.c */
public final class HandlerC21658c extends Handler {
    static {
        Covode.recordClassIndex(25299);
    }

    public HandlerC21658c(Looper looper) {
        super(looper);
    }

    public final void handleMessage(Message message) {
        MethodCollector.m26663i(1797);
        super.handleMessage(message);
        if (message.what != 100) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("UnSupport message is " + message.what);
            MethodCollector.m26664o(1797);
            throw illegalArgumentException;
        } else if (message.obj instanceof WeakReference) {
            Message message2 = (Message) ((WeakReference) message.obj).get();
            if (message2 == null || message2.arg2 != 9527) {
                C21630g.m40583a(C21630g.EnumC21632a.ERROR);
                MethodCollector.m26664o(1797);
                return;
            }
            RunnableC21659d b = RunnableC21659d.m40607b();
            b.mo35321c();
            synchronized (RunnableC21659d.f51392c) {
                try {
                    if (!b.f51396d.contains(message2)) {
                        b.f51396d.add(message2);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1797);
                    throw th;
                }
            }
            int i = message2.what;
            C21630g.m40583a(C21630g.EnumC21632a.ERROR);
            MethodCollector.m26664o(1797);
        } else {
            MethodCollector.m26664o(1797);
        }
    }
}
