package com.bytedance.track;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1202k;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

public final class TrackerChain$attachBTM$1$1 implements AbstractC1202k {

    /* renamed from: a */
    final /* synthetic */ C22881a f54025a;

    /* renamed from: b */
    final /* synthetic */ int f54026b;

    static {
        Covode.recordClassIndex(26785);
    }

    TrackerChain$attachBTM$1$1(C22881a aVar, int i) {
        this.f54025a = aVar;
        this.f54026b = i;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(aVar, "");
        if (C22888d.f54039a[aVar.ordinal()] == 1) {
            C22886c.m43141a(this.f54025a, this.f54026b);
        }
    }
}
