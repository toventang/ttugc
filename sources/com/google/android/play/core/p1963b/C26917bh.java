package com.google.android.play.core.p1963b;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.play.core.b.bh */
public final class C26917bh<T> implements AbstractC26920bk<T> {

    /* renamed from: a */
    private AbstractC26920bk<T> f63801a;

    static {
        Covode.recordClassIndex(32392);
    }

    /* renamed from: a */
    public static <T> void m53468a(AbstractC26920bk<T> bkVar, AbstractC26920bk<T> bkVar2) {
        C26917bh bhVar = (C26917bh) bkVar;
        if (bhVar.f63801a == null) {
            bhVar.f63801a = bkVar2;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26920bk
    /* renamed from: a */
    public final T mo44411a() {
        AbstractC26920bk<T> bkVar = this.f63801a;
        if (bkVar != null) {
            return bkVar.mo44411a();
        }
        throw new IllegalStateException();
    }
}
