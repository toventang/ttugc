package com.bytedance.android.live.core.paging.p224a;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.core.paging.a.e */
final /* synthetic */ class C3981e implements AbstractC1214u {

    /* renamed from: a */
    private final AbstractC3971b f10908a;

    static {
        Covode.recordClassIndex(4512);
    }

    C3981e(AbstractC3971b bVar) {
        this.f10908a = bVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f10908a.mo9337a(bool != null && !bool.booleanValue());
    }
}
