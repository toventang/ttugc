package com.snapchat.kit.sdk.core.networking;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.snapchat.kit.sdk.C29073m;
import com.snapchat.kit.sdk.core.controller.C28971b;
import dagger.p4535a.AbstractC88078c;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.snapchat.kit.sdk.core.networking.h */
public final class C29033h implements AbstractC88078c<C29031g> {

    /* renamed from: a */
    private final AbstractC89405a<C29073m> f68594a;

    /* renamed from: b */
    private final AbstractC89405a<C28971b> f68595b;

    /* renamed from: c */
    private final AbstractC89405a<String> f68596c;

    /* renamed from: d */
    private final AbstractC89405a<C27910f> f68597d;

    static {
        Covode.recordClassIndex(35366);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        return new C29031g(this.f68594a.get(), this.f68595b.get(), this.f68596c.get(), this.f68597d.get());
    }

    public C29033h(AbstractC89405a<C29073m> aVar, AbstractC89405a<C28971b> aVar2, AbstractC89405a<String> aVar3, AbstractC89405a<C27910f> aVar4) {
        this.f68594a = aVar;
        this.f68595b = aVar2;
        this.f68596c = aVar3;
        this.f68597d = aVar4;
    }
}
