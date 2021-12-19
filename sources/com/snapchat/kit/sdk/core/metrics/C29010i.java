package com.snapchat.kit.sdk.core.metrics;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import dagger.p4535a.AbstractC88078c;
import dagger.p4535a.C88081f;
import java.util.concurrent.ScheduledExecutorService;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.snapchat.kit.sdk.core.metrics.i */
public final class C29010i implements AbstractC88078c<C28994c> {

    /* renamed from: a */
    private final AbstractC89405a<Context> f68528a;

    /* renamed from: b */
    private final AbstractC89405a<ScheduledExecutorService> f68529b;

    static {
        Covode.recordClassIndex(35207);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        C28994c cVar = new C28994c(this.f68529b.get());
        Context applicationContext = this.f68528a.get().getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        ((Application) applicationContext).registerActivityLifecycleCallbacks(cVar);
        return C88081f.m153153a(cVar, "Cannot return null from a non-@Nullable @Provides method");
    }

    public C29010i(AbstractC89405a<Context> aVar, AbstractC89405a<ScheduledExecutorService> aVar2) {
        this.f68528a = aVar;
        this.f68529b = aVar2;
    }
}
