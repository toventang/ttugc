package com.bytedance.als;

import androidx.lifecycle.AbstractC1183ag;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.C1182af;
import com.bytedance.als.AbstractC2547b;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.C21582f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.als.e */
public abstract class AbstractC2557e<T extends AbstractC2547b> extends AbstractC2562j<T> implements AbstractC1183ag {

    /* renamed from: a */
    public C1182af f7722a;

    /* renamed from: b */
    public final C21582f f7723b;

    static {
        Covode.recordClassIndex(2942);
    }

    @Override // com.bytedance.als.AbstractC2562j
    public void onDestroy() {
        super.onDestroy();
        if (this.f7722a != null) {
            C1182af afVar = this.f7722a;
            if (afVar == null) {
                C89219l.m154710a("viewModelStore");
            }
            afVar.mo3997a();
        }
    }

    @Override // androidx.lifecycle.AbstractC1183ag
    public C1182af getViewModelStore() {
        AbstractC1196i.EnumC1199b a = getLifecycle().mo4011a();
        C89219l.m154716b(a, "");
        if (a.isAtLeast(AbstractC1196i.EnumC1199b.INITIALIZED)) {
            if (this.f7722a == null) {
                this.f7722a = new C1182af();
            }
            C1182af afVar = this.f7722a;
            if (afVar == null) {
                C89219l.m154710a("viewModelStore");
            }
            return afVar;
        }
        throw new IllegalStateException("can't access ViewModels when component is destroyed");
    }

    public AbstractC2557e(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f7723b = fVar;
    }
}
