package com.p4501vk.api.sdk.p4503b;

import com.bytedance.covode.number.Covode;
import com.p4501vk.api.sdk.C87860d;
import com.p4501vk.api.sdk.p4504c.C87854b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.vk.api.sdk.b.d */
public final class C87842d<T> extends AbstractC87840b<T> {

    /* renamed from: b */
    public final AbstractC87840b<T> f199544b;

    static {
        Covode.recordClassIndex(103852);
    }

    @Override // com.p4501vk.api.sdk.p4503b.AbstractC87840b
    /* renamed from: a */
    public final T mo142304a(C87839a aVar) {
        C89219l.m154719c(aVar, "");
        try {
            return this.f199544b.mo142304a(aVar);
        } catch (C87854b e) {
            if (e.isInvalidCredentialsError() && this.f199541a.f199566b != null) {
                e.getApiMethod();
                e.getUserBanInfo();
            }
            throw e;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.vk.api.sdk.b.b<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87842d(C87860d dVar, AbstractC87840b<? extends T> bVar) {
        super(dVar);
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(bVar, "");
        this.f199544b = bVar;
    }
}
