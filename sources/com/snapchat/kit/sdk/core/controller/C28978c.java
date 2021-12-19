package com.snapchat.kit.sdk.core.controller;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import dagger.p4535a.AbstractC88078c;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.snapchat.kit.sdk.core.controller.c */
public final class C28978c implements AbstractC88078c<C28971b> {

    /* renamed from: a */
    private final AbstractC89405a<Handler> f68458a;

    static {
        Covode.recordClassIndex(35169);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        return new C28971b(this.f68458a.get());
    }

    public C28978c(AbstractC89405a<Handler> aVar) {
        this.f68458a = aVar;
    }
}
