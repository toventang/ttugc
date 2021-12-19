package com.bytedance.android.livesdk.container.util;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1202k;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

public final class KeyboardWatcher$1 implements AbstractC1202k {

    /* renamed from: a */
    final /* synthetic */ ViewTreeObserver$OnGlobalLayoutListenerC8308f f20566a;

    static {
        Covode.recordClassIndex(9134);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(aVar, "");
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            ViewTreeObserver$OnGlobalLayoutListenerC8308f fVar = this.f20566a;
            fVar.f20581a.getViewTreeObserver().removeOnGlobalLayoutListener(fVar);
        }
    }
}
