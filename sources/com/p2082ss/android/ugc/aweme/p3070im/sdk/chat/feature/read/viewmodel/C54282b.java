package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.read.viewmodel;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17434e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.C53709a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.b */
public final class C54282b implements C1175ad.AbstractC1177b {

    /* renamed from: a */
    public final AbstractC17434e f124344a;

    /* renamed from: b */
    public final C53709a f124345b;

    static {
        Covode.recordClassIndex(63976);
    }

    @Override // androidx.lifecycle.C1175ad.AbstractC1177b
    /* renamed from: a */
    public final <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
        C89219l.m154721d(cls, "");
        if (cls.isAssignableFrom(ReadStateViewModel.class)) {
            return new ReadStateViewModel(this.f124344a, this.f124345b);
        }
        throw new IllegalArgumentException("ReadStateViewModelFactory: Unknown ViewModel class");
    }

    public C54282b(AbstractC17434e eVar, C53709a aVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(aVar, "");
        this.f124344a = eVar;
        this.f124345b = aVar;
    }
}
