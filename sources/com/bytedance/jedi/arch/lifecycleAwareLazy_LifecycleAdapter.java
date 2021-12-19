package com.bytedance.jedi.arch;

import androidx.lifecycle.AbstractC1191e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1212s;
import com.bytedance.covode.number.Covode;

public class lifecycleAwareLazy_LifecycleAdapter implements AbstractC1191e {

    /* renamed from: a */
    final lifecycleAwareLazy f48605a;

    static {
        Covode.recordClassIndex(24047);
    }

    lifecycleAwareLazy_LifecycleAdapter(lifecycleAwareLazy lifecycleawarelazy) {
        this.f48605a = lifecycleawarelazy;
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
        if (z || aVar != AbstractC1196i.EnumC1198a.ON_CREATE) {
            return;
        }
        if (!z2 || sVar.mo4028a("onStart", 1)) {
            this.f48605a.onStart();
        }
    }
}
