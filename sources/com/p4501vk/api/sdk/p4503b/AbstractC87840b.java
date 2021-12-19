package com.p4501vk.api.sdk.p4503b;

import com.bytedance.covode.number.Covode;
import com.p4501vk.api.sdk.C87860d;
import com.p4501vk.api.sdk.p4507f.p4508a.AbstractC87884c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.vk.api.sdk.b.b */
public abstract class AbstractC87840b<T> {

    /* renamed from: a */
    public final C87860d f199541a;

    static {
        Covode.recordClassIndex(103850);
    }

    /* renamed from: a */
    public abstract T mo142304a(C87839a aVar);

    public AbstractC87840b(C87860d dVar) {
        C89219l.m154719c(dVar, "");
        this.f199541a = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo142305a(String str, Throwable th) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(th, "");
        this.f199541a.f199567c.f199523i.mo142364a(AbstractC87884c.EnumC87885a.DEBUG);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo142306b(String str, Throwable th) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(th, "");
        this.f199541a.f199567c.f199523i.mo142364a(AbstractC87884c.EnumC87885a.WARNING);
    }
}
