package com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2875d.p2876a;

import com.bytedance.common.utility.p907b.C13590c;
import com.bytedance.common.utility.p907b.C13595d;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.framework.d.a.d */
public final class C45816d {

    /* renamed from: a */
    static final ExecutorService f106744a;

    /* renamed from: b */
    static final ExecutorService f106745b;

    /* renamed from: c */
    static final ExecutorService f106746c;

    /* renamed from: d */
    static final ExecutorService f106747d = new C13595d(C13590c.f33041g, C13590c.f33042h, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC45814c("TTImmediateExecutors"));

    /* renamed from: e */
    public static final C45816d f106748e = new C45816d();

    private C45816d() {
    }

    static {
        Covode.recordClassIndex(54335);
        ExecutorService executorService = C13590c.f33036b;
        C89219l.m154716b(executorService, "");
        f106744a = executorService;
        ExecutorService executorService2 = C13590c.f33038d;
        C89219l.m154716b(executorService2, "");
        f106745b = executorService2;
        ScheduledExecutorService scheduledExecutorService = C13590c.f33037c;
        C89219l.m154716b(scheduledExecutorService, "");
        f106746c = scheduledExecutorService;
    }
}
