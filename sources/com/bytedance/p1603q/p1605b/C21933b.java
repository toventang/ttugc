package com.bytedance.p1603q.p1605b;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1603q.AbstractC21931b;
import com.bytedance.p1603q.AbstractC21935d;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.q.b.b */
public final class C21933b extends AbstractC21932a {

    /* renamed from: a */
    public List<AbstractC21932a> f51916a;

    static {
        Covode.recordClassIndex(25599);
    }

    public C21933b(AbstractC21932a... aVarArr) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f51916a = copyOnWriteArrayList;
        copyOnWriteArrayList.addAll(Arrays.asList(aVarArr));
    }

    @Override // com.bytedance.p1603q.p1605b.AbstractC21932a
    /* renamed from: a */
    public final <T> void mo24304a(AbstractC21931b<T> bVar, AbstractC21935d dVar) {
        for (AbstractC21932a aVar : this.f51916a) {
            if (aVar != null) {
                aVar.mo24304a(bVar, dVar);
            }
        }
    }

    @Override // com.bytedance.p1603q.p1605b.AbstractC21932a
    /* renamed from: b */
    public final <T> void mo24306b(AbstractC21931b<T> bVar, AbstractC21935d dVar) {
        for (AbstractC21932a aVar : this.f51916a) {
            if (aVar != null) {
                aVar.mo24306b(bVar, dVar);
            }
        }
    }

    @Override // com.bytedance.p1603q.p1605b.AbstractC21932a
    /* renamed from: c */
    public final <T> void mo24308c(AbstractC21931b<T> bVar, AbstractC21935d dVar) {
        for (AbstractC21932a aVar : this.f51916a) {
            if (aVar != null) {
                aVar.mo24308c(bVar, dVar);
            }
        }
    }

    @Override // com.bytedance.p1603q.p1605b.AbstractC21932a
    /* renamed from: a */
    public final <T> void mo24305a(AbstractC21931b<T> bVar, AbstractC21935d dVar, Throwable th) {
        for (AbstractC21932a aVar : this.f51916a) {
            if (aVar != null) {
                aVar.mo24305a(bVar, dVar, th);
            }
        }
    }

    @Override // com.bytedance.p1603q.p1605b.AbstractC21932a
    /* renamed from: b */
    public final <T> void mo24307b(AbstractC21931b<T> bVar, AbstractC21935d dVar, Throwable th) {
        for (AbstractC21932a aVar : this.f51916a) {
            if (aVar != null) {
                aVar.mo24307b(bVar, dVar, th);
            }
        }
    }

    @Override // com.bytedance.p1603q.p1605b.AbstractC21932a
    /* renamed from: c */
    public final <T> void mo35696c(AbstractC21931b<T> bVar, AbstractC21935d dVar, Throwable th) {
        for (AbstractC21932a aVar : this.f51916a) {
            if (aVar != null) {
                aVar.mo35696c(bVar, dVar, th);
            }
        }
    }
}
