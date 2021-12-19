package com.bytedance.ies.android.base.runtime.p1120b;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.common.utility.p907b.C13590c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.C16091a;
import com.bytedance.ies.android.base.runtime.depend.IThreadPoolExecutorDepend;
import java.util.concurrent.ExecutorService;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.bytedance.ies.android.base.runtime.b.a */
public final class C16101a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f38783a = {new C89232y(C89204ab.m154669a(C16101a.class), "mainThreadHandler", "getMainThreadHandler()Landroid/os/Handler;"), new C89232y(C89204ab.m154669a(C16101a.class), "normalExecutorService", "getNormalExecutorService()Ljava/util/concurrent/ExecutorService;"), new C89232y(C89204ab.m154669a(C16101a.class), "ioExecutorService", "getIoExecutorService()Ljava/util/concurrent/ExecutorService;")};

    /* renamed from: b */
    public static final C16101a f38784b = new C16101a();

    /* renamed from: c */
    private static final AbstractC89244h f38785c = C89250i.m154773a((AbstractC89171a) C16103b.f38789a);

    /* renamed from: d */
    private static final AbstractC89244h f38786d = C89250i.m154773a((AbstractC89171a) C16104c.f38790a);

    /* renamed from: e */
    private static final AbstractC89244h f38787e = C89250i.m154773a((AbstractC89171a) C16102a.f38788a);

    /* renamed from: a */
    public static final ExecutorService m29901a() {
        return (ExecutorService) f38786d.getValue();
    }

    private C16101a() {
    }

    /* renamed from: com.bytedance.ies.android.base.runtime.b.a$a */
    static final class C16102a extends AbstractC89220m implements AbstractC89171a<ExecutorService> {

        /* renamed from: a */
        public static final C16102a f38788a = new C16102a();

        static {
            Covode.recordClassIndex(18380);
        }

        C16102a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ExecutorService invoke() {
            ExecutorService iOThreadExecutor;
            IThreadPoolExecutorDepend iThreadPoolExecutorDepend = C16091a.f38744d;
            if (iThreadPoolExecutorDepend == null || (iOThreadExecutor = iThreadPoolExecutorDepend.getIOThreadExecutor()) == null) {
                return C13590c.m24422b();
            }
            return iOThreadExecutor;
        }
    }

    /* renamed from: com.bytedance.ies.android.base.runtime.b.a$b */
    static final class C16103b extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C16103b f38789a = new C16103b();

        static {
            Covode.recordClassIndex(18381);
        }

        C16103b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: com.bytedance.ies.android.base.runtime.b.a$c */
    static final class C16104c extends AbstractC89220m implements AbstractC89171a<ExecutorService> {

        /* renamed from: a */
        public static final C16104c f38790a = new C16104c();

        static {
            Covode.recordClassIndex(18382);
        }

        C16104c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ExecutorService invoke() {
            ExecutorService normalThreadExecutor;
            IThreadPoolExecutorDepend iThreadPoolExecutorDepend = C16091a.f38744d;
            if (iThreadPoolExecutorDepend == null || (normalThreadExecutor = iThreadPoolExecutorDepend.getNormalThreadExecutor()) == null) {
                return C13590c.m24421a();
            }
            return normalThreadExecutor;
        }
    }

    static {
        Covode.recordClassIndex(18379);
    }
}
