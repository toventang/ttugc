package com.bytedance.android.live.core.paging.p224a;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.core.paging.a.f */
final /* synthetic */ class C3982f implements AbstractC1214u {

    /* renamed from: a */
    private final AbstractC3971b f10909a;

    static {
        Covode.recordClassIndex(4513);
    }

    C3982f(AbstractC3971b bVar) {
        this.f10909a = bVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        boolean booleanValue;
        AbstractC3971b bVar = this.f10909a;
        Boolean bool = (Boolean) obj;
        if (bool != null && bVar.f10886e != (booleanValue = bool.booleanValue())) {
            bVar.f10886e = booleanValue;
            bVar.notifyDataSetChanged();
        }
    }
}
