package com.p4501vk.api.sdk;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.vk.api.sdk.l */
public final class C87912l {

    /* renamed from: a */
    static final AtomicInteger f199655a = new AtomicInteger();

    /* renamed from: b */
    public static final C87912l f199656b = new C87912l();

    /* renamed from: c */
    private static final AbstractC89244h f199657c = C89250i.m154773a((AbstractC89171a) C87913a.f199659a);

    /* renamed from: d */
    private static final AbstractC89244h f199658d = C89250i.m154773a((AbstractC89171a) C87914b.f199660a);

    /* renamed from: a */
    public static ExecutorService m152929a() {
        return (ExecutorService) f199658d.getValue();
    }

    private C87912l() {
    }

    /* renamed from: com.vk.api.sdk.l$a */
    static final class C87913a extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C87913a f199659a = new C87913a();

        static {
            Covode.recordClassIndex(103924);
        }

        C87913a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: com.vk.api.sdk.l$b */
    static final class C87914b extends AbstractC89220m implements AbstractC89171a<ExecutorService> {

        /* renamed from: a */
        public static final C87914b f199660a = new C87914b();

        static {
            Covode.recordClassIndex(103925);
        }

        C87914b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ExecutorService invoke() {
            return C40780g.m82242a(C40787l.m82269a(EnumC40793o.FIXED).mo70025a(32).mo70027a(ThreadFactoryC879151.f199661a).mo70028a());
        }
    }

    static {
        Covode.recordClassIndex(103923);
    }

    /* renamed from: a */
    public static final void m152930a(Runnable runnable) {
        C89219l.m154719c(runnable, "");
        if (C89219l.m154714a(Looper.myLooper(), Looper.getMainLooper())) {
            runnable.run();
        } else {
            ((Handler) f199657c.getValue()).postDelayed(runnable, 0);
        }
    }
}
