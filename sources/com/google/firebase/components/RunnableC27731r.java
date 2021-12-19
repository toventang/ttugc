package com.google.firebase.components;

import com.bytedance.covode.number.Covode;
import com.google.firebase.p2010b.AbstractC27700b;
import com.google.firebase.p2010b.C27699a;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.components.r */
public final /* synthetic */ class RunnableC27731r implements Runnable {

    /* renamed from: a */
    private final Map.Entry f65164a;

    /* renamed from: b */
    private final C27699a f65165b;

    static {
        Covode.recordClassIndex(33314);
    }

    RunnableC27731r(Map.Entry entry, C27699a aVar) {
        this.f65164a = entry;
        this.f65165b = aVar;
    }

    public final void run() {
        Map.Entry entry = this.f65164a;
        ((AbstractC27700b) entry.getKey()).mo46321a(this.f65165b);
    }
}
