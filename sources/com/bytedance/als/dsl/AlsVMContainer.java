package com.bytedance.als.dsl;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import com.bytedance.als.AlsLogicContainer;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4613b.C89219l;

public final class AlsVMContainer extends AbstractC1174ac {

    /* renamed from: a */
    public C2554e f7712a = new C2554e((byte) 0);

    /* renamed from: b */
    public AlsLogicContainer f7713b;

    /* renamed from: c */
    public OCAdapterViewModel f7714c;

    /* renamed from: d */
    private WeakReference<ActivityC0945e> f7715d;

    static {
        Covode.recordClassIndex(2933);
    }

    /* renamed from: a */
    private final void m7454a() {
        this.f7713b = null;
        this.f7714c = null;
    }

    /* renamed from: a */
    public final void mo7021a(C2554e eVar) {
        C89219l.m154721d(eVar, "");
        this.f7712a = eVar;
    }

    /* renamed from: a */
    public final void mo7020a(ActivityC0945e eVar) {
        ActivityC0945e eVar2;
        C89219l.m154721d(eVar, "");
        WeakReference<ActivityC0945e> weakReference = this.f7715d;
        if (weakReference != null) {
            eVar2 = weakReference.get();
        } else {
            eVar2 = null;
        }
        if (!C89219l.m154714a(eVar2, eVar)) {
            this.f7715d = new WeakReference<>(eVar);
            m7454a();
        }
    }
}
