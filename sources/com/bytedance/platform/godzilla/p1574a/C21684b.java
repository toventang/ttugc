package com.bytedance.platform.godzilla.p1574a;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.Thread;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.platform.godzilla.a.b */
public final class C21684b implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public boolean f51458a;

    /* renamed from: b */
    public Thread.UncaughtExceptionHandler f51459b;

    /* renamed from: c */
    public final List<AbstractC21692h> f51460c = new LinkedList();

    static {
        Covode.recordClassIndex(25325);
    }

    /* renamed from: a */
    private static boolean m40627a(Throwable th) {
        if (th == null) {
            return false;
        }
        int i = 0;
        while (!(th instanceof OutOfMemoryError)) {
            if (i > 20) {
                return false;
            }
            i++;
            try {
                th = th.getCause();
                if (th == null) {
                    return false;
                }
            } catch (Throwable unused) {
            }
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo35341b(AbstractC21692h hVar) {
        boolean remove;
        MethodCollector.m26663i(5392);
        synchronized (this.f51460c) {
            try {
                remove = this.f51460c.remove(hVar);
            } finally {
                MethodCollector.m26664o(5392);
            }
        }
        return remove;
    }

    /* renamed from: a */
    public final boolean mo35340a(AbstractC21692h hVar) {
        boolean add;
        MethodCollector.m26663i(5390);
        synchronized (this.f51460c) {
            try {
                add = this.f51460c.add(hVar);
            } finally {
                MethodCollector.m26664o(5390);
            }
        }
        return add;
    }

    /* renamed from: a */
    private void m40626a(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f51459b;
        if (uncaughtExceptionHandler != null && uncaughtExceptionHandler != this) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    /* renamed from: b */
    private boolean m40628b(Thread thread, Throwable th) {
        MethodCollector.m26663i(5511);
        try {
            synchronized (this.f51460c) {
                try {
                    for (AbstractC21692h hVar : this.f51460c) {
                        try {
                            if (hVar.mo35345a(thread, th)) {
                                return true;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                } finally {
                    MethodCollector.m26664o(5511);
                }
            }
        } catch (Throwable unused2) {
        }
        MethodCollector.m26664o(5511);
        return false;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            if (m40627a(th) || !m40628b(thread, th)) {
                m40626a(thread, th);
            } else if (thread != null && thread.getName().equals("main")) {
                while (true) {
                    try {
                        Looper.loop();
                    } catch (Exception e) {
                        if (m40627a(e) || !m40628b(thread, e)) {
                            m40626a(thread, e);
                        }
                    }
                }
                m40626a(thread, e);
            }
        } catch (Throwable th2) {
            m40626a(thread, th2);
        }
    }
}
