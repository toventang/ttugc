package com.bytedance.p802b.p841k.p845d;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.b.k.d.a */
public abstract class AbstractRunnableC13123a implements Runnable {

    /* renamed from: e */
    public final long f31961e;

    /* renamed from: f */
    public boolean f31962f;

    /* renamed from: g */
    public long f31963g;

    static {
        Covode.recordClassIndex(14959);
    }

    public AbstractRunnableC13123a() {
        this(0);
    }

    public AbstractRunnableC13123a(long j) {
        this(j, 0);
    }

    public AbstractRunnableC13123a(long j, long j2) {
        this.f31961e = j;
        this.f31963g = j2;
        if (j2 > 0) {
            this.f31962f = true;
        }
    }
}
