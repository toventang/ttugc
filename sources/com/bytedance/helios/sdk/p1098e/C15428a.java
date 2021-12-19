package com.bytedance.helios.sdk.p1098e;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.sdk.e.a */
public final class C15428a<T> extends ConcurrentLinkedQueue<T> {

    /* renamed from: a */
    private final int f37667a;

    /* renamed from: b */
    private final AbstractC15429b<T> f37668b;

    static {
        Covode.recordClassIndex(17680);
    }

    public final int getSize() {
        return super.size();
    }

    public final int size() {
        return getSize();
    }

    @Override // java.util.Queue, java.util.concurrent.ConcurrentLinkedQueue
    public final synchronized boolean offer(T t) {
        boolean offer;
        AbstractC15429b<T> bVar;
        MethodCollector.m26663i(5523);
        if (size() >= this.f37667a && (bVar = this.f37668b) != null) {
            bVar.mo25163a(this);
        }
        if (size() + 1 > this.f37667a) {
            super.poll();
        }
        offer = super.offer(t);
        AbstractC15429b<T> bVar2 = this.f37668b;
        if (bVar2 != null) {
            bVar2.mo25164a(this, t, offer);
        }
        MethodCollector.m26664o(5523);
        return offer;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15428a(int i, AbstractC15429b<T> bVar, Collection<? extends T> collection) {
        super(collection);
        C89219l.m154719c(collection, "");
        this.f37667a = i;
        this.f37668b = bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15428a(int i, AbstractC15429b bVar, Collection collection, int i2, C89214g gVar) {
        this(i, (i2 & 2) != 0 ? null : bVar, (i2 & 4) != 0 ? C89086z.INSTANCE : collection);
    }
}
