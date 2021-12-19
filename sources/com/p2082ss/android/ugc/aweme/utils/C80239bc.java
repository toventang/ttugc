package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.utils.bc */
public final class C80239bc<E> {

    /* renamed from: a */
    private List<E> f179717a = new ArrayList();

    /* renamed from: b */
    private boolean f179718b = false;

    /* renamed from: c */
    private List<E> f179719c = new ArrayList();

    static {
        Covode.recordClassIndex(93507);
    }

    /* renamed from: a */
    public final synchronized List<E> mo123655a() {
        List<E> list;
        MethodCollector.m26663i(9570);
        if (this.f179718b) {
            this.f179719c = new ArrayList(this.f179717a.size());
            for (E e : this.f179717a) {
                this.f179719c.add(e);
            }
            this.f179718b = false;
        }
        list = this.f179719c;
        MethodCollector.m26664o(9570);
        return list;
    }

    /* renamed from: a */
    public final synchronized boolean mo123656a(E e) {
        boolean add;
        MethodCollector.m26663i(9417);
        this.f179718b = true;
        add = this.f179717a.add(e);
        MethodCollector.m26664o(9417);
        return add;
    }

    /* renamed from: b */
    public final synchronized boolean mo123657b(E e) {
        boolean remove;
        MethodCollector.m26663i(9569);
        this.f179718b = true;
        remove = this.f179717a.remove(e);
        MethodCollector.m26664o(9569);
        return remove;
    }
}
