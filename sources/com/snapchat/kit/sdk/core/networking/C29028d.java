package com.snapchat.kit.sdk.core.networking;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.snapchat.kit.sdk.C29073m;
import com.snapchat.kit.sdk.core.controller.C28971b;
import com.snapchat.kit.sdk.core.security.Fingerprint;
import dagger.p4535a.AbstractC88078c;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.snapchat.kit.sdk.core.networking.d */
public final class C29028d implements AbstractC88078c<C29027c> {

    /* renamed from: a */
    private final AbstractC89405a<C29073m> f68579a;

    /* renamed from: b */
    private final AbstractC89405a<C28971b> f68580b;

    /* renamed from: c */
    private final AbstractC89405a<String> f68581c;

    /* renamed from: d */
    private final AbstractC89405a<Fingerprint> f68582d;

    /* renamed from: e */
    private final AbstractC89405a<C27910f> f68583e;

    static {
        Covode.recordClassIndex(35361);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        return new C29027c(this.f68579a.get(), this.f68580b.get(), this.f68581c.get(), this.f68582d.get(), this.f68583e.get());
    }

    public C29028d(AbstractC89405a<C29073m> aVar, AbstractC89405a<C28971b> aVar2, AbstractC89405a<String> aVar3, AbstractC89405a<Fingerprint> aVar4, AbstractC89405a<C27910f> aVar5) {
        this.f68579a = aVar;
        this.f68580b = aVar2;
        this.f68581c = aVar3;
        this.f68582d = aVar4;
        this.f68583e = aVar5;
    }
}
