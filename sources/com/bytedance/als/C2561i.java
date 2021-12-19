package com.bytedance.als;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.als.i */
public final /* synthetic */ class C2561i implements AbstractC1214u {

    /* renamed from: a */
    private final AbstractC2565m f7728a;

    static {
        Covode.recordClassIndex(2946);
    }

    C2561i(AbstractC2565m mVar) {
        this.f7728a = mVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        AbstractC2565m mVar = this.f7728a;
        if (obj != null) {
            mVar.onChanged(obj);
        }
    }
}
