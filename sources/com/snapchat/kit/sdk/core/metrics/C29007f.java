package com.snapchat.kit.sdk.core.metrics;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.config.ConfigClient;
import com.snapchat.kit.sdk.core.networking.C29025a;
import dagger.p4535a.AbstractC88078c;
import dagger.p4535a.C88081f;
import javax.p4631a.AbstractC89405a;
import p4640l.p4641a.p4642a.C89710a;

/* renamed from: com.snapchat.kit.sdk.core.metrics.f */
public final class C29007f implements AbstractC88078c<ConfigClient> {

    /* renamed from: a */
    private final AbstractC89405a<C29025a> f68523a;

    static {
        Covode.recordClassIndex(35204);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        C29025a aVar = this.f68523a.get();
        return C88081f.m153153a(aVar.mo50701a(aVar.f68575c, "https://api.snapkit.com", ConfigClient.class, C89710a.m155747a(aVar.f68573a)), "Cannot return null from a non-@Nullable @Provides method");
    }

    public C29007f(AbstractC89405a<C29025a> aVar) {
        this.f68523a = aVar;
    }
}
