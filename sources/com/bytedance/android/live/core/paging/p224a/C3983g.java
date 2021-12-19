package com.bytedance.android.live.core.paging.p224a;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.core.paging.a.g */
final /* synthetic */ class C3983g implements AbstractC1214u {

    /* renamed from: a */
    private final AbstractC3971b f10910a;

    static {
        Covode.recordClassIndex(4514);
    }

    C3983g(AbstractC3971b bVar) {
        this.f10910a = bVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        AbstractC3971b bVar = this.f10910a;
        Integer num = (Integer) obj;
        if (num != null && num.intValue() >= 0 && num.intValue() < bVar.getItemCount()) {
            bVar.notifyItemChanged(num.intValue());
        }
    }
}
