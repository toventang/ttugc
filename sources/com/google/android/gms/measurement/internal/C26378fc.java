package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.C25565r;
import java.util.concurrent.BlockingQueue;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.fc */
public final class C26378fc extends Thread {

    /* renamed from: a */
    private final Object f61980a = new Object();

    /* renamed from: b */
    private final BlockingQueue<C26379fd<?>> f61981b;

    /* renamed from: c */
    private boolean f61982c;

    /* renamed from: d */
    private final /* synthetic */ C26372ex f61983d;

    static {
        Covode.recordClassIndex(31800);
    }

    /* renamed from: a */
    public final void mo43246a() {
        MethodCollector.m26663i(6658);
        synchronized (this.f61980a) {
            try {
                this.f61980a.notifyAll();
            } finally {
                MethodCollector.m26664o(6658);
            }
        }
    }

    /* renamed from: b */
    private final void m51896b() {
        MethodCollector.m26663i(6657);
        synchronized (this.f61983d.f61961c) {
            try {
                if (!this.f61982c) {
                    this.f61983d.f61962d.release();
                    this.f61983d.f61961c.notifyAll();
                    if (this == this.f61983d.f61959a) {
                        this.f61983d.f61959a = null;
                    } else if (this == this.f61983d.f61960b) {
                        this.f61983d.f61960b = null;
                    } else {
                        this.f61983d.mo43016q().f61827c.mo43169a("Current scheduler thread is neither worker nor network");
                    }
                    this.f61982c = true;
                }
            } finally {
                MethodCollector.m26664o(6657);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0088, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0089, code lost:
        m51896b();
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(6505);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x008f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        // Method dump skipped, instructions count: 144
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C26378fc.run():void");
    }

    /* renamed from: a */
    private final void m51895a(InterruptedException interruptedException) {
        this.f61983d.mo43016q().f61830f.mo43170a(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    public C26378fc(C26372ex exVar, String str, BlockingQueue<C26379fd<?>> blockingQueue) {
        this.f61983d = exVar;
        C25565r.m49314a((Object) str);
        C25565r.m49314a(blockingQueue);
        this.f61981b = blockingQueue;
        setName(str);
    }
}
