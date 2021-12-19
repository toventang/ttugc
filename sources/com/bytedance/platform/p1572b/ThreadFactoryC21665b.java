package com.bytedance.platform.p1572b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bytedance.platform.b.b */
public final class ThreadFactoryC21665b implements ThreadFactory {

    /* renamed from: a */
    final AbstractC21676g f51420a;

    /* renamed from: b */
    private final String f51421b;

    /* renamed from: c */
    private int f51422c;

    static {
        Covode.recordClassIndex(25306);
    }

    public final synchronized Thread newThread(Runnable runnable) {
        C216661 r2;
        MethodCollector.m26663i(9407);
        r2 = new Thread(runnable, this.f51421b + "-thread-" + this.f51422c) {
            /* class com.bytedance.platform.p1572b.ThreadFactoryC21665b.C216661 */

            static {
                Covode.recordClassIndex(25307);
            }

            public final void run() {
                if (ThreadFactoryC21665b.this.f51420a != null) {
                    try {
                        super.run();
                    } catch (Throwable th) {
                        ThreadFactoryC21665b.this.f51420a.mo35335a(th);
                    }
                } else {
                    super.run();
                }
            }
        };
        this.f51422c++;
        MethodCollector.m26664o(9407);
        return r2;
    }

    public ThreadFactoryC21665b(String str, AbstractC21676g gVar) {
        this.f51421b = str;
        this.f51420a = gVar;
    }
}
