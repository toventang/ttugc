package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.viewmodel;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.data.C54004b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.viewmodel.a */
public final class C54080a implements C1175ad.AbstractC1177b {

    /* renamed from: a */
    private final C54004b f123940a;

    static {
        Covode.recordClassIndex(63757);
    }

    public C54080a(C54004b bVar) {
        C89219l.m154721d(bVar, "");
        this.f123940a = bVar;
    }

    @Override // androidx.lifecycle.C1175ad.AbstractC1177b
    /* renamed from: a */
    public final <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
        C89219l.m154721d(cls, "");
        return new GroupChatViewModel(this.f123940a);
    }
}
