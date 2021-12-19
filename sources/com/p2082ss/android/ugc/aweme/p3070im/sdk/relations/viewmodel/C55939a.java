package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.viewmodel;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55212h;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.AbstractC55858h;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.C55823e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.C55845g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.p3223b.C55732c;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.viewmodel.a */
public final class C55939a implements C1175ad.AbstractC1177b {

    /* renamed from: a */
    public SharePackage f127573a;

    /* renamed from: b */
    public boolean f127574b;

    /* renamed from: c */
    public boolean f127575c;

    static {
        Covode.recordClassIndex(65732);
    }

    @Override // androidx.lifecycle.C1175ad.AbstractC1177b
    /* renamed from: a */
    public final <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
        int i;
        AbstractC55858h eVar;
        C89219l.m154721d(cls, "");
        SharePackage sharePackage = this.f127573a;
        boolean z = this.f127574b;
        boolean z2 = this.f127575c;
        if (sharePackage != null) {
            i = 2;
        } else {
            i = 0;
        }
        C55732c cVar = new C55732c(i, C55212h.m100953a(sharePackage));
        if (sharePackage != null) {
            cVar.f127114e = true;
        }
        cVar.f127116g = z;
        if (z2) {
            eVar = new C55845g(cVar);
        } else {
            eVar = new C55823e(cVar);
        }
        return new RelationViewModel(eVar);
    }

    public C55939a(SharePackage sharePackage, boolean z, boolean z2) {
        this.f127573a = sharePackage;
        this.f127574b = z;
        this.f127575c = z2;
    }
}
