package com.bytedance.p1559o;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.o.s */
public final class C21606s<T> extends AbstractC21603p<T> {

    /* renamed from: a */
    private final AbstractC21603p<T> f51243a;

    /* renamed from: b */
    private T f51244b;

    /* renamed from: c */
    private boolean f51245c;

    static {
        Covode.recordClassIndex(25247);
    }

    public C21606s(AbstractC21603p<T> pVar) {
        this.f51243a = pVar;
    }

    @Override // com.bytedance.p1559o.AbstractC21603p
    public final T get(C21582f fVar) {
        T t = this.f51244b;
        if (t != null) {
            return t;
        }
        T t2 = this.f51243a.get(fVar);
        this.f51244b = t2;
        return t2;
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.p1559o.AbstractC21603p
    public final void executeOnCreate(T t, C21582f fVar) {
        if (!this.f51245c) {
            this.f51245c = true;
            super.executeOnCreate(t, fVar);
        }
    }
}
