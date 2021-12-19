package com.bytedance.als;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;

/* access modifiers changed from: package-private */
public class LiveEvent$1 implements AbstractC33974au {

    /* renamed from: a */
    final /* synthetic */ AbstractC2565m f7708a;

    /* renamed from: b */
    final /* synthetic */ C2559g f7709b;

    static {
        Covode.recordClassIndex(2928);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        this.f7709b.mo7033b(this.f7708a);
    }

    LiveEvent$1(C2559g gVar, AbstractC2565m mVar) {
        this.f7709b = gVar;
        this.f7708a = mVar;
    }
}
