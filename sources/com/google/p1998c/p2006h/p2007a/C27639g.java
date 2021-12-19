package com.google.p1998c.p2006h.p2007a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.c.h.a.g */
public final class C27639g {

    /* renamed from: c */
    private static final Logger f65037c = Logger.getLogger(C27639g.class.getName());

    /* renamed from: a */
    public C27640a f65038a;

    /* renamed from: b */
    public boolean f65039b;

    static {
        Covode.recordClassIndex(33219);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        if (r1 == null) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        r0 = r1.f65042c;
        r1.f65042c = r2;
        r2 = r1;
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (r2 == null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        m55283a(r2.f65040a, r2.f65041b);
        r2 = r2.f65042c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(2340);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo46255a() {
        /*
            r4 = this;
            r3 = 2340(0x924, float:3.279E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r3)
            monitor-enter(r4)
            boolean r0 = r4.f65039b     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x000f
            monitor-exit(r4)     // Catch:{ all -> 0x0031 }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return
        L_0x000f:
            r0 = 1
            r4.f65039b = r0
            com.google.c.h.a.g$a r1 = r4.f65038a
            r2 = 0
            r4.f65038a = r2
            monitor-exit(r4)
        L_0x0018:
            if (r1 == 0) goto L_0x0021
            com.google.c.h.a.g$a r0 = r1.f65042c
            r1.f65042c = r2
            r2 = r1
            r1 = r0
            goto L_0x0018
        L_0x0021:
            if (r2 == 0) goto L_0x002d
            java.lang.Runnable r1 = r2.f65040a
            java.util.concurrent.Executor r0 = r2.f65041b
            m55283a(r1, r0)
            com.google.c.h.a.g$a r2 = r2.f65042c
            goto L_0x0021
        L_0x002d:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return
        L_0x0031:
            r0 = move-exception
            monitor-exit(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p1998c.p2006h.p2007a.C27639g.mo46255a():void");
    }

    /* renamed from: a */
    public static void m55283a(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f65037c.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* renamed from: com.google.c.h.a.g$a */
    public static final class C27640a {

        /* renamed from: a */
        final Runnable f65040a;

        /* renamed from: b */
        final Executor f65041b;

        /* renamed from: c */
        C27640a f65042c;

        static {
            Covode.recordClassIndex(33220);
        }

        public C27640a(Runnable runnable, Executor executor, C27640a aVar) {
            this.f65040a = runnable;
            this.f65041b = executor;
            this.f65042c = aVar;
        }
    }
}
