package com.p2082ss.android.ugc.aweme.utils;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.hz */
public final class C80561hz {

    /* renamed from: a */
    public static final C80561hz f180173a = new C80561hz();

    private C80561hz() {
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.hz$a */
    static final class C80562a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ Runnable f180174a;

        static {
            Covode.recordClassIndex(93835);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C80562a(Runnable runnable) {
            super(0);
            this.f180174a = runnable;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f180174a.run();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.hz$b */
    public static final class RunnableC80563b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f180175a;

        static {
            Covode.recordClassIndex(93836);
        }

        public RunnableC80563b(AbstractC89171a aVar) {
            this.f180175a = aVar;
        }

        public final void run() {
            this.f180175a.invoke();
        }
    }

    static {
        Covode.recordClassIndex(93834);
    }

    /* renamed from: a */
    public static final boolean m139646a() {
        Looper mainLooper = Looper.getMainLooper();
        C89219l.m154716b(mainLooper, "");
        return C89219l.m154714a(mainLooper.getThread(), Thread.currentThread());
    }

    /* renamed from: a */
    public static final void m139645a(Runnable runnable) {
        C89219l.m154721d(runnable, "");
        C80558hx.m139642a(0, new C80562a(runnable));
    }
}
