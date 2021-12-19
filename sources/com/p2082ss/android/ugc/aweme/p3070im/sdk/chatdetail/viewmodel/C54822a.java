package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.viewmodel;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.a */
public final class C54822a implements C1175ad.AbstractC1177b {

    /* renamed from: a */
    private final String f125587a;

    /* renamed from: b */
    private final AbstractC17427b f125588b;

    static {
        Covode.recordClassIndex(64541);
    }

    @Override // androidx.lifecycle.C1175ad.AbstractC1177b
    /* renamed from: a */
    public final <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
        C89219l.m154721d(cls, "");
        return new GroupChatDetailViewModel(this.f125587a, this.f125588b);
    }

    public C54822a(String str, AbstractC17427b bVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        this.f125587a = str;
        this.f125588b = bVar;
    }
}
