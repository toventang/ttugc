package com.p2082ss.android.ugc.aweme.filter;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import p4560f.p4561a.p4565b.AbstractC88412b;

/* renamed from: com.ss.android.ugc.aweme.filter.FilterScrollerModule */
public class FilterScrollerModule implements AbstractC33974au {

    /* renamed from: a */
    private AbstractC88412b f116950a;

    static {
        Covode.recordClassIndex(59791);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            removeListener();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void removeListener() {
        AbstractC88412b bVar = this.f116950a;
        if (bVar != null) {
            bVar.dispose();
            this.f116950a = null;
        }
    }
}
