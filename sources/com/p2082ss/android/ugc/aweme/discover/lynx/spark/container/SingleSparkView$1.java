package com.p2082ss.android.ugc.aweme.discover.lynx.spark.container;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1202k;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.lynx.spark.C42289d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.lynx.spark.container.SingleSparkView$1 */
public final class SingleSparkView$1 implements AbstractC1202k {

    /* renamed from: a */
    final /* synthetic */ C42284a f98506a;

    static {
        Covode.recordClassIndex(50226);
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    SingleSparkView$1(C42284a aVar) {
        this.f98506a = aVar;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(aVar, "");
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            C42289d dVar = this.f98506a.f98508a;
            if (dVar != null) {
                dVar.mo71479b();
            }
            for (T t : this.f98506a.f98514g) {
                if (!t.isDisposed()) {
                    t.dispose();
                }
            }
        }
    }
}
