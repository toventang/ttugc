package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractC26920bk;
import com.google.android.play.core.p1963b.C26896an;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.play.core.assetpacks.di */
public final class C26856di implements AbstractC26920bk<Executor> {
    static {
        Covode.recordClassIndex(32331);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.p1963b.AbstractC26920bk
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Executor mo44411a() {
        ThreadFactory threadFactory = ThreadFactoryC26846cz.f63702a;
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        a.f95509g = threadFactory;
        ExecutorService a2 = C40780g.m82242a(a.mo70028a());
        C26896an.m53419a(a2);
        return a2;
    }
}
