package com.bytedance.ies.powerlist.optimize;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1202k;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.p4611f.p4613b.C89219l;

public final class Optimizer$init$1 implements AbstractC1202k {

    /* renamed from: a */
    final /* synthetic */ C17670b f42230a;

    static {
        Covode.recordClassIndex(20217);
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    public Optimizer$init$1(C17670b bVar) {
        this.f42230a = bVar;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        AbstractC88412b bVar;
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(aVar, "");
        if (C17672c.f42265a[aVar.ordinal()] == 1 && (bVar = this.f42230a.f42259c) != null) {
            bVar.dispose();
        }
    }
}
