package com.bytedance.p1603q;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* renamed from: com.bytedance.q.m */
final class C21949m<IN> implements AbstractC21931b<IN>, Serializable {

    /* renamed from: a */
    private AbstractC21931b<IN> f51942a;

    static {
        Covode.recordClassIndex(25615);
    }

    @Override // com.bytedance.p1603q.AbstractC21931b
    /* renamed from: a */
    public final Object mo35690a() {
        return this.f51942a.mo35690a();
    }

    public C21949m(AbstractC21931b<IN> bVar) {
        this.f51942a = bVar;
    }

    @Override // com.bytedance.p1603q.AbstractC21931b
    /* renamed from: b */
    public final <O> O mo35695b(Class<? extends AbstractC21935d<?, O>> cls) {
        return (O) this.f51942a.mo35695b(cls);
    }

    @Override // com.bytedance.p1603q.AbstractC21931b
    /* renamed from: a */
    public final <I> I mo35691a(Class<? extends AbstractC21935d<I, ?>> cls) {
        return (I) this.f51942a.mo35691a((Class) cls);
    }

    @Override // com.bytedance.p1603q.AbstractC21931b
    /* renamed from: a */
    public final Object mo35692a(IN in) {
        return this.f51942a.mo35692a((Object) in);
    }

    @Override // com.bytedance.p1603q.AbstractC21931b
    /* renamed from: a */
    public final Object mo35693a(String str) {
        return this.f51942a.mo35693a(str);
    }

    @Override // com.bytedance.p1603q.AbstractC21931b
    /* renamed from: a */
    public final void mo35694a(String str, Object obj) {
        this.f51942a.mo35694a(str, obj);
    }
}
