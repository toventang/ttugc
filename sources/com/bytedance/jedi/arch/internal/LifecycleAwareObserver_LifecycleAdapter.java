package com.bytedance.jedi.arch.internal;

import androidx.lifecycle.AbstractC1191e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1212s;
import com.bytedance.covode.number.Covode;

public class LifecycleAwareObserver_LifecycleAdapter implements AbstractC1191e {

    /* renamed from: a */
    final LifecycleAwareObserver f48471a;

    static {
        Covode.recordClassIndex(24003);
    }

    LifecycleAwareObserver_LifecycleAdapter(LifecycleAwareObserver lifecycleAwareObserver) {
        this.f48471a = lifecycleAwareObserver;
    }

    @Override // androidx.lifecycle.AbstractC1191e
    /* renamed from: a */
    public final void mo4008a(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar, boolean z, C1212s sVar) {
        boolean z2;
        if (sVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            if (!z2 || sVar.mo4028a("onLifecycleEvent", 2)) {
                this.f48471a.onLifecycleEvent(mVar);
            }
        } else if (aVar != AbstractC1196i.EnumC1198a.ON_DESTROY) {
        } else {
            if (!z2 || sVar.mo4028a("onDestroy", 1)) {
                this.f48471a.onDestroy();
            }
        }
    }
}
