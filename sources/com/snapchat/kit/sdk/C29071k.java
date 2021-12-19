package com.snapchat.kit.sdk;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.C29012k;
import dagger.p4535a.C88077b;
import java.util.concurrent.ScheduledExecutorService;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.snapchat.kit.sdk.k */
public final class C29071k implements AbstractC29068i {

    /* renamed from: a */
    private AbstractC89405a<ScheduledExecutorService> f68705a;

    static {
        Covode.recordClassIndex(35420);
    }

    private C29071k() {
        this.f68705a = C88077b.m153149a(C29012k.f68533a);
    }

    @Override // com.snapchat.kit.sdk.AbstractC29068i
    /* renamed from: a */
    public final ScheduledExecutorService mo50740a() {
        return this.f68705a.get();
    }

    /* synthetic */ C29071k(byte b) {
        this();
    }
}
