package com.bytedance.common.utility.p907b;

import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.common.utility.b.e */
public class RunnableC13596e implements Runnable {

    /* renamed from: b */
    public static ExecutorService f33067b = C13590c.f33035a;

    /* renamed from: c */
    public static ExecutorService f33068c = C13590c.f33035a;

    /* renamed from: d */
    protected static final AtomicInteger f33069d = new AtomicInteger();

    /* renamed from: a */
    private Runnable f33070a;

    /* renamed from: e */
    private final boolean f33071e;

    public RunnableC13596e() {
        this((char) 0);
    }

    public void run() {
        Runnable runnable = this.f33070a;
        if (runnable != null) {
            runnable.run();
        }
    }

    static {
        Covode.recordClassIndex(15621);
    }

    /* renamed from: a */
    public final void mo21860a() {
        Runnable runnable;
        if (Logger.debug()) {
            runnable = new Runnable() {
                /* class com.bytedance.common.utility.p907b.RunnableC13596e.RunnableC135971 */

                static {
                    Covode.recordClassIndex(15622);
                }

                public final void run() {
                    try {
                        RunnableC13596e.this.run();
                    } catch (Exception unused) {
                    }
                }
            };
        } else {
            runnable = this;
        }
        if (this.f33071e) {
            f33068c.submit(runnable);
        } else {
            f33067b.submit(runnable);
        }
    }

    /* renamed from: a */
    public static void m24423a(Runnable runnable) {
        if (runnable != null) {
            f33067b.submit(runnable);
        }
    }

    public RunnableC13596e(byte b) {
        this((char) 0);
    }

    private RunnableC13596e(char c) {
        this.f33071e = false;
    }
}
