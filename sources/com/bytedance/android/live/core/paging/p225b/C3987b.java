package com.bytedance.android.live.core.paging.p225b;

import androidx.lifecycle.C1213t;
import androidx.p053i.AbstractC1036i;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.core.paging.b.b */
public final class C3987b<V> extends AbstractC1036i.AbstractC1039a<V> {

    /* renamed from: a */
    private C1213t<Boolean> f10912a = new C1213t<>();

    /* renamed from: b */
    private C1213t<Boolean> f10913b = new C1213t<>();

    static {
        Covode.recordClassIndex(4518);
    }

    @Override // androidx.p053i.AbstractC1036i.AbstractC1039a
    /* renamed from: a */
    public final void mo3753a() {
        super.mo3753a();
        this.f10913b.postValue(true);
    }

    @Override // androidx.p053i.AbstractC1036i.AbstractC1039a
    /* renamed from: a */
    public final void mo3754a(V v) {
        super.mo3754a(v);
        this.f10912a.postValue(false);
    }

    public C3987b(C1213t<Boolean> tVar, C1213t<Boolean> tVar2) {
        this.f10912a = tVar;
        this.f10913b = tVar2;
    }
}
