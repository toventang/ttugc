package com.bytedance.scene.group;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1205n;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.scene.group.g */
public final class C22214g implements AbstractC1204m {

    /* renamed from: a */
    private C1205n f52523a;

    static {
        Covode.recordClassIndex(26020);
    }

    C22214g() {
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public final AbstractC1196i getLifecycle() {
        m41757a();
        return this.f52523a;
    }

    /* renamed from: a */
    private void m41757a() {
        if (this.f52523a == null) {
            this.f52523a = new C1205n(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36461a(AbstractC1196i.EnumC1198a aVar) {
        m41757a();
        this.f52523a.mo4016a(aVar);
    }
}
