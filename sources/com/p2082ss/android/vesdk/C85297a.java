package com.p2082ss.android.vesdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vesdk.a */
public final class C85297a<E> {

    /* renamed from: a */
    private List<E> f190877a = new ArrayList();

    /* renamed from: b */
    private boolean f190878b = false;

    /* renamed from: c */
    private List<E> f190879c = new ArrayList();

    static {
        Covode.recordClassIndex(99408);
    }

    /* renamed from: a */
    public final synchronized void mo130619a() {
        MethodCollector.m26663i(6423);
        this.f190878b = true;
        this.f190877a.clear();
        MethodCollector.m26664o(6423);
    }

    /* renamed from: b */
    public final synchronized boolean mo130621b() {
        boolean isEmpty;
        MethodCollector.m26663i(6425);
        isEmpty = this.f190877a.isEmpty();
        MethodCollector.m26664o(6425);
        return isEmpty;
    }

    /* renamed from: c */
    public final synchronized List<E> mo130623c() {
        List<E> list;
        MethodCollector.m26663i(6559);
        if (this.f190878b) {
            this.f190879c = new ArrayList(this.f190877a.size());
            for (E e : this.f190877a) {
                this.f190879c.add(e);
            }
            this.f190878b = false;
        }
        list = this.f190879c;
        MethodCollector.m26664o(6559);
        return list;
    }

    /* renamed from: a */
    public final synchronized boolean mo130620a(E e) {
        MethodCollector.m26663i(6420);
        if (this.f190877a.contains(e)) {
            MethodCollector.m26664o(6420);
            return false;
        }
        this.f190878b = true;
        boolean add = this.f190877a.add(e);
        MethodCollector.m26664o(6420);
        return add;
    }

    /* renamed from: b */
    public final synchronized boolean mo130622b(E e) {
        boolean remove;
        MethodCollector.m26663i(6422);
        this.f190878b = true;
        remove = this.f190877a.remove(e);
        MethodCollector.m26664o(6422);
        return remove;
    }
}
