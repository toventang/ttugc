package com.p2082ss.android.ugc.aweme.profile.p3565a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.profile.a.i */
final /* synthetic */ class C63361i implements AbstractC1729g {

    /* renamed from: a */
    private final C63356e f143862a;

    static {
        Covode.recordClassIndex(74652);
    }

    C63361i(C63356e eVar) {
        this.f143862a = eVar;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        C63356e eVar = this.f143862a;
        if (!iVar.mo5535a()) {
            return null;
        }
        Integer num = (Integer) iVar.mo5545d();
        eVar.f143854c.setText(eVar.f143854c.getContext().getResources().getQuantityString(R.plurals.hk, num.intValue(), num));
        return null;
    }
}
