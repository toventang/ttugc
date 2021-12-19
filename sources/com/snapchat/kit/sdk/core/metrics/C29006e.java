package com.snapchat.kit.sdk.core.metrics;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.metrics.p2070c.C28996b;
import dagger.p4535a.AbstractC88078c;
import dagger.p4535a.C88081f;
import java.util.concurrent.ScheduledExecutorService;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.snapchat.kit.sdk.core.metrics.e */
public final class C29006e implements AbstractC88078c<C28983b<ServerEvent>> {

    /* renamed from: a */
    private final AbstractC89405a<C28996b> f68520a;

    /* renamed from: b */
    private final AbstractC89405a<ScheduledExecutorService> f68521b;

    /* renamed from: c */
    private final AbstractC89405a<C28994c> f68522c;

    static {
        Covode.recordClassIndex(35203);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        C28983b bVar = new C28983b(this.f68520a.get(), this.f68521b.get(), this.f68522c.get(), 10);
        bVar.mo50354a();
        return C88081f.m153153a(bVar, "Cannot return null from a non-@Nullable @Provides method");
    }

    public C29006e(AbstractC89405a<C28996b> aVar, AbstractC89405a<ScheduledExecutorService> aVar2, AbstractC89405a<C28994c> aVar3) {
        this.f68520a = aVar;
        this.f68521b = aVar2;
        this.f68522c = aVar3;
    }
}
