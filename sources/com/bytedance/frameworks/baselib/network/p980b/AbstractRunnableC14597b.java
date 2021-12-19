package com.bytedance.frameworks.baselib.network.p980b;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.frameworks.baselib.network.b.b */
public abstract class AbstractRunnableC14597b implements AbstractC14598c, Comparable<AbstractC14598c>, Runnable {

    /* renamed from: c */
    protected final AtomicBoolean f35287c = new AtomicBoolean(false);

    /* renamed from: d */
    protected final AtomicBoolean f35288d = new AtomicBoolean(false);

    /* renamed from: e */
    public int f35289e = 0;

    /* renamed from: f */
    protected int f35290f;

    static {
        Covode.recordClassIndex(16688);
    }

    /* renamed from: c */
    public final boolean mo23475c() {
        return this.f35288d.get();
    }

    /* renamed from: a */
    public AbstractRunnableC14597b mo23470a(int i) {
        this.f35290f = i;
        return this;
    }
}
