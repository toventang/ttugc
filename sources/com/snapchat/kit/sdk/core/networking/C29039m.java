package com.snapchat.kit.sdk.core.networking;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import dagger.p4535a.AbstractC88078c;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.snapchat.kit.sdk.core.networking.m */
public final class C29039m implements AbstractC88078c<C29037l> {

    /* renamed from: a */
    private final AbstractC89405a<FirebaseExtensionClient> f68607a;

    /* renamed from: b */
    private final AbstractC89405a<C27910f> f68608b;

    static {
        Covode.recordClassIndex(35372);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        return new C29037l(this.f68607a.get(), this.f68608b.get());
    }

    public C29039m(AbstractC89405a<FirebaseExtensionClient> aVar, AbstractC89405a<C27910f> aVar2) {
        this.f68607a = aVar;
        this.f68608b = aVar2;
    }
}
