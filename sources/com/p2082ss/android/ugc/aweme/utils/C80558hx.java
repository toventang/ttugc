package com.p2082ss.android.ugc.aweme.utils;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.hx */
public final class C80558hx {

    /* renamed from: a */
    private static final Handler f180170a = new Handler(Looper.getMainLooper());

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.utils.hx$a */
    public static final class CallableC80559a<V> implements Callable<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f180171a;

        static {
            Covode.recordClassIndex(93832);
        }

        CallableC80559a(AbstractC89171a aVar) {
            this.f180171a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ C89391z call() {
            this.f180171a.invoke();
            return C89391z.f203057a;
        }
    }

    static {
        Covode.recordClassIndex(93831);
    }

    /* renamed from: a */
    public static /* synthetic */ void m139643a(AbstractC89171a aVar) {
        ExecutorService executorService = C1731i.f5562a;
        C89219l.m154716b(executorService, "");
        m139644a(executorService, aVar);
    }

    /* renamed from: a */
    public static final void m139642a(long j, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        if (j > 0) {
            f180170a.postDelayed(new RunnableC80560hy(aVar), j);
        } else if (C89219l.m154714a(Looper.myLooper(), Looper.getMainLooper())) {
            aVar.invoke();
        } else {
            f180170a.post(new RunnableC80560hy(aVar));
        }
    }

    /* renamed from: a */
    private static void m139644a(ExecutorService executorService, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(executorService, "");
        C89219l.m154721d(aVar, "");
        if (C89219l.m154714a(Looper.myLooper(), Looper.getMainLooper())) {
            C1731i.m5636a(new CallableC80559a(aVar), executorService);
        } else {
            aVar.invoke();
        }
    }
}
