package com.p2082ss.android.ugc.aweme.dependence.beauty.p2741b;

import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.dependence.beauty.b.d */
public final class C41099d<T> extends C1213t<T> {

    /* renamed from: a */
    private WeakReference<AbstractC1204m> f96059a;

    static {
        Covode.recordClassIndex(48969);
    }

    /* renamed from: a */
    public final void mo70310a(AbstractC1204m mVar, AbstractC1214u<T> uVar) {
        AbstractC1204m mVar2;
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(uVar, "");
        WeakReference<AbstractC1204m> weakReference = this.f96059a;
        if (!(weakReference == null || (mVar2 = weakReference.get()) == null)) {
            removeObservers(mVar2);
        }
        this.f96059a = new WeakReference<>(mVar);
        observe(mVar, uVar);
    }
}
