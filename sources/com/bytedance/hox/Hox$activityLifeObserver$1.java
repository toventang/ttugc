package com.bytedance.hox;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1202k;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

public final class Hox$activityLifeObserver$1 implements AbstractC1202k {

    /* renamed from: a */
    final /* synthetic */ Hox f37761a;

    static {
        Covode.recordClassIndex(17748);
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    Hox$activityLifeObserver$1(Hox hox) {
        this.f37761a = hox;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(aVar, "");
        int i = C15493a.f37766a[aVar.ordinal()];
        if (i == 1) {
            this.f37761a.f37752b = true;
        } else if (i == 2) {
            this.f37761a.f37752b = false;
        }
    }
}
