package com.bytedance.jedi.arch;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import p4560f.p4561a.p4565b.AbstractC88412b;

public final class BaseJediViewModel$selectSubscribe$2 implements AbstractC33974au {

    /* renamed from: a */
    final /* synthetic */ AbstractC88412b f48229a;

    static {
        Covode.recordClassIndex(23863);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        if (!this.f48229a.isDisposed()) {
            this.f48229a.dispose();
        }
    }

    BaseJediViewModel$selectSubscribe$2(AbstractC88412b bVar) {
        this.f48229a = bVar;
    }
}
