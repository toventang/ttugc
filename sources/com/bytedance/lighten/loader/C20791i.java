package com.bytedance.lighten.loader;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.LinkedBlockingDeque;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.lighten.loader.i */
public final class C20791i<E> extends LinkedBlockingDeque<E> {

    /* renamed from: a */
    private int f49198a = 10;

    static {
        Covode.recordClassIndex(24367);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.LinkedBlockingDeque, java.util.concurrent.BlockingQueue, java.util.Queue, java.util.Deque
    public final boolean offer(E e) {
        MethodCollector.m26663i(13114);
        synchronized (this) {
            try {
                if (size() == this.f49198a) {
                    removeLast();
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(13114);
                throw th;
            }
        }
        boolean offerFirst = super.offerFirst(e);
        MethodCollector.m26664o(13114);
        return offerFirst;
    }
}
