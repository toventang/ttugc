package com.p2082ss.android.socialbase.downloader.segment;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.socialbase.downloader.segment.b */
public final class C30600b implements AbstractC30601c, AbstractC30602d, AbstractC30603e {

    /* renamed from: a */
    private final int f73036a;

    /* renamed from: b */
    private final int f73037b;

    /* renamed from: c */
    private final Object f73038c = new Object();

    /* renamed from: d */
    private final Object f73039d = new Object();

    /* renamed from: e */
    private C30599a f73040e;

    /* renamed from: f */
    private C30599a f73041f;

    /* renamed from: g */
    private C30599a f73042g;

    /* renamed from: h */
    private C30599a f73043h;

    /* renamed from: i */
    private C30599a f73044i;

    /* renamed from: j */
    private volatile boolean f73045j;

    /* renamed from: k */
    private int f73046k;

    static {
        Covode.recordClassIndex(37135);
    }

    /* renamed from: c */
    public final void mo54825c() {
        MethodCollector.m26663i(6264);
        this.f73045j = true;
        synchronized (this.f73038c) {
            try {
                this.f73038c.notifyAll();
            } finally {
                MethodCollector.m26664o(6264);
            }
        }
        synchronized (this.f73039d) {
            try {
                this.f73039d.notifyAll();
            } finally {
                MethodCollector.m26664o(6264);
            }
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.segment.AbstractC30602d
    /* renamed from: a */
    public final C30599a mo54821a() {
        C30599a aVar;
        MethodCollector.m26663i(5688);
        C30599a aVar2 = this.f73044i;
        if (aVar2 != null) {
            this.f73044i = aVar2.f73035d;
            aVar2.f73035d = null;
            MethodCollector.m26664o(5688);
            return aVar2;
        }
        synchronized (this.f73039d) {
            try {
                aVar = this.f73042g;
                while (aVar == null) {
                    if (!this.f73045j) {
                        this.f73039d.wait();
                        aVar = this.f73042g;
                    } else {
                        StreamClosedException streamClosedException = new StreamClosedException("read");
                        MethodCollector.m26664o(5688);
                        throw streamClosedException;
                    }
                }
                this.f73044i = aVar.f73035d;
                this.f73043h = null;
                this.f73042g = null;
                aVar.f73035d = null;
            } finally {
                MethodCollector.m26664o(5688);
            }
        }
        return aVar;
    }

    @Override // com.p2082ss.android.socialbase.downloader.segment.AbstractC30601c
    /* renamed from: b */
    public final C30599a mo54823b() {
        MethodCollector.m26663i(5821);
        synchronized (this.f73038c) {
            try {
                if (!this.f73045j) {
                    C30599a aVar = this.f73040e;
                    if (aVar != null) {
                        this.f73040e = aVar.f73035d;
                    } else {
                        int i = this.f73046k;
                        if (i < this.f73036a) {
                            this.f73046k = i + 1;
                            return new C30599a(this.f73037b);
                        }
                        do {
                            this.f73038c.wait();
                            if (!this.f73045j) {
                                aVar = this.f73040e;
                            } else {
                                StreamClosedException streamClosedException = new StreamClosedException("obtain");
                                MethodCollector.m26664o(5821);
                                throw streamClosedException;
                            }
                        } while (aVar == null);
                    }
                    this.f73040e = aVar.f73035d;
                    if (aVar == this.f73041f) {
                        this.f73041f = null;
                    }
                    aVar.f73035d = null;
                    MethodCollector.m26664o(5821);
                    return aVar;
                }
                StreamClosedException streamClosedException2 = new StreamClosedException("obtain");
                MethodCollector.m26664o(5821);
                throw streamClosedException2;
            } finally {
                MethodCollector.m26664o(5821);
            }
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.segment.AbstractC30601c
    /* renamed from: a */
    public final void mo54822a(C30599a aVar) {
        MethodCollector.m26663i(5819);
        synchronized (this.f73038c) {
            try {
                C30599a aVar2 = this.f73041f;
                if (aVar2 == null) {
                    this.f73041f = aVar;
                    this.f73040e = aVar;
                } else {
                    aVar2.f73035d = aVar;
                    this.f73041f = aVar;
                }
                this.f73038c.notify();
            } finally {
                MethodCollector.m26664o(5819);
            }
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.segment.AbstractC30603e
    /* renamed from: b */
    public final void mo54824b(C30599a aVar) {
        MethodCollector.m26663i(5954);
        synchronized (this.f73039d) {
            try {
                C30599a aVar2 = this.f73043h;
                if (aVar2 == null) {
                    this.f73043h = aVar;
                    this.f73042g = aVar;
                    this.f73039d.notify();
                } else {
                    aVar2.f73035d = aVar;
                    this.f73043h = aVar;
                }
            } finally {
                MethodCollector.m26664o(5954);
            }
        }
    }

    C30600b(int i, int i2) {
        i = i < 64 ? 64 : i;
        i2 = i2 < 8192 ? 8192 : i2;
        this.f73036a = i;
        this.f73037b = i2;
    }
}
