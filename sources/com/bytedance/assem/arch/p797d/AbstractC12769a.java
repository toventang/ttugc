package com.bytedance.assem.arch.p797d;

import android.view.View;
import com.bytedance.assem.arch.core.AbstractC12766p;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.assem.arch.d.a */
public abstract class AbstractC12769a extends AbstractC12766p {

    /* renamed from: i */
    public int f31061i;

    static {
        Covode.recordClassIndex(14593);
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: u */
    public void mo20631u() {
        View view;
        if (((AbstractC12766p) this).f31047g != null) {
            mo20630b(mo20528t());
        } else if (this.f31061i != 0 && (view = bD_().f30981c) != null) {
            View findViewById = view.findViewById(this.f31061i);
            if (findViewById != null) {
                mo20629a(findViewById);
                mo20630b(findViewById);
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
    }
}
