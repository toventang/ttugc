package com.p2082ss.android.ugc.aweme.net.monitor;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.ss.android.ugc.aweme.net.monitor.e */
public final class C61430e<T> extends ConcurrentLinkedQueue<T> {

    /* renamed from: a */
    private final int f139480a;

    static {
        Covode.recordClassIndex(72085);
    }

    public final int getSize() {
        return super.size();
    }

    public final int size() {
        return getSize();
    }

    public C61430e(int i) {
        this.f139480a = i;
    }

    @Override // java.util.Queue, java.util.concurrent.ConcurrentLinkedQueue
    public final synchronized boolean offer(T t) {
        boolean offer;
        MethodCollector.m26663i(11673);
        if (size() + 1 > this.f139480a) {
            super.poll();
        }
        offer = super.offer(t);
        MethodCollector.m26664o(11673);
        return offer;
    }
}
