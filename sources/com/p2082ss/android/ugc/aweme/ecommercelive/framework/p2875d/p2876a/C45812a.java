package com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2875d.p2876a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import kotlinx.coroutines.AbstractC89507ah;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.framework.d.a.a */
public final class C45812a extends AbstractC89507ah {

    /* renamed from: a */
    public final ExecutorService f106731a;

    static {
        Covode.recordClassIndex(54331);
    }

    public C45812a(ExecutorService executorService) {
        C89219l.m154721d(executorService, "");
        this.f106731a = executorService;
    }

    @Override // p4600h.p4603c.AbstractC89127f, p4600h.p4603c.AbstractC89097a
    public final AbstractC89127f plus(AbstractC89127f fVar) {
        C89219l.m154721d(fVar, "");
        return super.plus(fVar);
    }

    @Override // kotlinx.coroutines.AbstractC89507ah
    public final void dispatch(AbstractC89127f fVar, Runnable runnable) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(runnable, "");
        try {
            this.f106731a.execute(runnable);
        } catch (RejectedExecutionException unused) {
        }
    }
}
