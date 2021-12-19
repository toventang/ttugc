package com.p2082ss.android.medialib.presenter;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedList;

/* renamed from: com.ss.android.medialib.presenter.d */
public final class C30027d<T> extends LinkedList<T> {

    /* renamed from: a */
    private int f71663a = 10;

    /* renamed from: b */
    private final Object f71664b = new Object();

    static {
        Covode.recordClassIndex(36513);
    }

    public final int getMaxSize() {
        return this.f71663a;
    }

    public final T pollSafe() {
        T t;
        MethodCollector.m26663i(680);
        synchronized (this.f71664b) {
            try {
                t = (T) poll();
            } finally {
                MethodCollector.m26664o(680);
            }
        }
        return t;
    }

    public C30027d(int i) {
        this.f71663a = i;
    }

    public final T addLastSafe(T t) {
        T t2;
        MethodCollector.m26663i(679);
        synchronized (this.f71664b) {
            t2 = null;
            while (size() >= this.f71663a) {
                try {
                    t2 = (T) poll();
                } finally {
                    MethodCollector.m26664o(679);
                }
            }
            addLast(t);
        }
        return t2;
    }
}
