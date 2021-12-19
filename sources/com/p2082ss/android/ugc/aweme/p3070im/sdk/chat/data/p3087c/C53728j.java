package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3087c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17434e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.read.viewmodel.ReadStateViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3082b.C53635b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.c.j */
public final class C53728j implements AbstractC53727i {
    static {
        Covode.recordClassIndex(63308);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3087c.AbstractC53727i
    /* renamed from: a */
    public final AbstractC17434e mo90310a(String str) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str, "");
        AbstractC17434e eVar = C53635b.f123059a;
        String str2 = null;
        if (eVar != null) {
            str2 = eVar.mo27757a();
        }
        if (!C89219l.m154714a((Object) str, (Object) str2) || eVar == null) {
            return AbstractC17434e.C17435a.m32338a(str, ReadStateViewModel.f124327b);
        }
        return eVar;
    }
}
