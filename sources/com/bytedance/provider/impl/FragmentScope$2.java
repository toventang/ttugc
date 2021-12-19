package com.bytedance.provider.impl;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1202k;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.provider.C21740f;
import p4600h.p4611f.p4613b.C89219l;

public final class FragmentScope$2 implements AbstractC1202k {

    /* renamed from: a */
    final /* synthetic */ C21751b f51529a;

    static {
        Covode.recordClassIndex(25395);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(aVar, "");
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            C21740f.m40709a(this.f51529a);
        }
    }
}
