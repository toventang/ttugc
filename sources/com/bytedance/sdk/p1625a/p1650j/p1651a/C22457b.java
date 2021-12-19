package com.bytedance.sdk.p1625a.p1650j.p1651a;

import android.os.Process;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.p907b.RunnableC13596e;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1650j.p1651a.AbstractC22460e;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.bytedance.sdk.a.j.a.b */
final class C22457b extends Thread {

    /* renamed from: a */
    volatile boolean f53091a;

    /* renamed from: b */
    private final BlockingQueue<AbstractC22460e> f53092b;

    /* renamed from: c */
    private final BlockingQueue<AbstractC22460e> f53093c;

    static {
        Covode.recordClassIndex(26273);
    }

    public final void run() {
        AbstractRunnableC22458c cVar;
        Process.setThreadPriority(10);
        while (true) {
            try {
                AbstractC22460e take = this.f53092b.take();
                if ((take instanceof AbstractRunnableC22458c) && (cVar = (AbstractRunnableC22458c) take) != null) {
                    String name = Thread.currentThread().getName();
                    String str = cVar.f53099e;
                    try {
                        if (!cVar.mo36747a()) {
                            if (!C13627m.m24498a(str) && !C13627m.m24498a(name)) {
                                Thread.currentThread().setName("ApiLocalDispatcher-".concat(String.valueOf(str)));
                            }
                            if (Logger.debug()) {
                                this.f53092b.size();
                                this.f53093c.size();
                            }
                            if (cVar.mo36751d() == AbstractC22460e.EnumC22461a.IMMEDIATE) {
                                RunnableC13596e.m24423a(cVar);
                            } else {
                                cVar.mo36753f();
                                this.f53093c.add(cVar);
                            }
                            if (!C13627m.m24498a(str) && !C13627m.m24498a(name)) {
                                Thread.currentThread().setName(name);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            } catch (InterruptedException unused2) {
                if (this.f53091a) {
                    return;
                }
            }
        }
    }

    public C22457b(BlockingQueue<AbstractC22460e> blockingQueue, BlockingQueue<AbstractC22460e> blockingQueue2) {
        super("ApiLocalDispatcher-Thread");
        this.f53092b = blockingQueue;
        this.f53093c = blockingQueue2;
    }
}
