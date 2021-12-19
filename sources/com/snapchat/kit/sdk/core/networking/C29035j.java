package com.snapchat.kit.sdk.core.networking;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.security.Fingerprint;
import dagger.p4535a.AbstractC88078c;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.snapchat.kit.sdk.core.networking.j */
public final class C29035j implements AbstractC88078c<C29034i> {

    /* renamed from: a */
    private final AbstractC89405a<String> f68599a;

    /* renamed from: b */
    private final AbstractC89405a<Fingerprint> f68600b;

    static {
        Covode.recordClassIndex(35368);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        return new C29034i(this.f68599a.get(), this.f68600b.get());
    }

    public C29035j(AbstractC89405a<String> aVar, AbstractC89405a<Fingerprint> aVar2) {
        this.f68599a = aVar;
        this.f68600b = aVar2;
    }
}
