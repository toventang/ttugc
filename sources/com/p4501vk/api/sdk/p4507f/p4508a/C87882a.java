package com.p4501vk.api.sdk.p4507f.p4508a;

import com.bytedance.covode.number.Covode;
import com.p4501vk.api.sdk.p4507f.p4508a.AbstractC87884c;
import p4600h.AbstractC89244h;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.vk.api.sdk.f.a.a */
public final class C87882a implements AbstractC87884c {

    /* renamed from: a */
    private AbstractC89244h<? extends AbstractC87884c.EnumC87885a> f199612a;

    /* renamed from: b */
    private final String f199613b;

    static {
        Covode.recordClassIndex(103892);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.h<? extends com.vk.api.sdk.f.a.c$a>, h.h<com.vk.api.sdk.f.a.c$a> */
    @Override // com.p4501vk.api.sdk.p4507f.p4508a.AbstractC87884c
    /* renamed from: a */
    public final AbstractC89244h<AbstractC87884c.EnumC87885a> mo142363a() {
        return this.f199612a;
    }

    @Override // com.p4501vk.api.sdk.p4507f.p4508a.AbstractC87884c
    /* renamed from: a */
    public final void mo142364a(AbstractC87884c.EnumC87885a aVar) {
        C89219l.m154719c(aVar, "");
        if (((AbstractC87884c.EnumC87885a) this.f199612a.getValue()).ordinal() <= aVar.ordinal()) {
            int i = C87883b.f199614a[aVar.ordinal()];
        }
    }

    public C87882a(AbstractC89244h<? extends AbstractC87884c.EnumC87885a> hVar, String str) {
        C89219l.m154719c(hVar, "");
        C89219l.m154719c(str, "");
        this.f199612a = hVar;
        this.f199613b = str;
    }
}
