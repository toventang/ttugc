package com.bytedance.ies.p1204e.p1205a;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: com.bytedance.ies.e.a.a */
public final class C17305a {

    /* renamed from: a */
    public static final Executor f41576a = new ScheduledThreadPoolExecutor(4);

    /* renamed from: b */
    public static C17305a f41577b;

    /* renamed from: c */
    public static Handler f41578c;

    /* renamed from: d */
    public boolean f41579d;

    /* renamed from: e */
    public Executor f41580e;

    /* renamed from: com.bytedance.ies.e.a.a$a */
    public static class C17307a {

        /* renamed from: a */
        public Executor f41584a;

        static {
            Covode.recordClassIndex(19791);
        }
    }

    static {
        Covode.recordClassIndex(19789);
    }

    /* renamed from: a */
    public static synchronized C17305a m32043a() {
        C17305a aVar;
        synchronized (C17305a.class) {
            MethodCollector.m26663i(4504);
            if (f41577b == null) {
                f41577b = new C17305a();
            }
            aVar = f41577b;
            MethodCollector.m26664o(4504);
        }
        return aVar;
    }

    /* renamed from: a */
    private static void m32044a(C17305a aVar) {
        if (!aVar.f41579d) {
            throw new IllegalStateException("TaskManager not init");
        }
    }

    /* renamed from: b */
    private static Runnable m32045b(final Handler handler, final Callable callable, final int i) {
        return new Runnable() {
            /* class com.bytedance.ies.p1204e.p1205a.C17305a.RunnableC173061 */

            static {
                Covode.recordClassIndex(19790);
            }

            public final void run() {
                Handler handler = handler;
                if (handler == null) {
                    try {
                        callable.call();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    Message obtainMessage = handler.obtainMessage(i);
                    try {
                        obtainMessage.obj = callable.call();
                    } catch (Exception e2) {
                        obtainMessage.obj = e2;
                    }
                    handler.sendMessage(obtainMessage);
                }
            }
        };
    }

    /* renamed from: a */
    public final void mo27615a(Handler handler, Callable callable, int i) {
        m32044a(this);
        this.f41580e.execute(m32045b(handler, callable, i));
    }
}
