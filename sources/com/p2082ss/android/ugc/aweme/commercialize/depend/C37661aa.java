package com.p2082ss.android.ugc.aweme.commercialize.depend;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.depend.IThreadPoolExecutorDepend;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.util.concurrent.ExecutorService;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.depend.aa */
public final class C37661aa implements IThreadPoolExecutorDepend {
    static {
        Covode.recordClassIndex(45094);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IThreadPoolExecutorDepend
    public final ExecutorService getCPUThreadExecutor() {
        ExecutorService b = C40780g.m82245b();
        C89219l.m154716b(b, "");
        return b;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IThreadPoolExecutorDepend
    public final ExecutorService getIOThreadExecutor() {
        ExecutorService a = C40780g.m82241a();
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IThreadPoolExecutorDepend
    public final ExecutorService getNormalThreadExecutor() {
        ExecutorService b = C40780g.m82245b();
        C89219l.m154716b(b, "");
        return b;
    }
}
