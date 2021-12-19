package com.bytedance.provider.p1587vm;

import androidx.lifecycle.AbstractC1174ac;
import com.bytedance.covode.number.Covode;
import com.bytedance.provider.AbstractC21735d;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.provider.vm.ScopeViewModel */
public final class ScopeViewModel extends AbstractC1174ac {

    /* renamed from: a */
    private CopyOnWriteArrayList<AbstractC21735d> f51541a = new CopyOnWriteArrayList<>();

    static {
        Covode.recordClassIndex(25403);
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        super.onCleared();
        this.f51541a.clear();
    }
}
