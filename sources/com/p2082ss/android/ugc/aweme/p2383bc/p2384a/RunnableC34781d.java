package com.p2082ss.android.ugc.aweme.p2383bc.p2384a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.net.p3493f.C61352h;
import com.p2082ss.android.ugc.trill.p4379h.C85089a;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.bc.a.d */
public final class RunnableC34781d implements Runnable {
    static {
        Covode.recordClassIndex(41777);
    }

    public final void run() {
        C61352h.f139334a = CallableC34782a.f82117a;
    }

    /* renamed from: com.ss.android.ugc.aweme.bc.a.d$a */
    static final class CallableC34782a<V> implements Callable {

        /* renamed from: a */
        public static final CallableC34782a f82117a = new CallableC34782a();

        static {
            Covode.recordClassIndex(41778);
        }

        CallableC34782a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return Boolean.valueOf(C85089a.m146303a(C17867d.m33078a()));
        }
    }
}
