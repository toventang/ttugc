package com.p2082ss.android.ugc.aweme.notification.p3523e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39109f;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.e.d */
public final class C61994d {

    /* renamed from: a */
    private static final AbstractC89244h f140706a = C89250i.m154773a((AbstractC89171a) C61999e.f140711a);

    /* renamed from: a */
    private static ExecutorService m112122a() {
        return (ExecutorService) f140706a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.e.d$e */
    static final class C61999e extends AbstractC89220m implements AbstractC89171a<ExecutorService> {

        /* renamed from: a */
        public static final C61999e f140711a = new C61999e();

        static {
            Covode.recordClassIndex(72748);
        }

        C61999e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ExecutorService invoke() {
            return C58254p.m105192a(true);
        }
    }

    static {
        Covode.recordClassIndex(72743);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.e.d$a */
    public static final class CallableC61995a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f140707a;

        static {
            Covode.recordClassIndex(72744);
        }

        CallableC61995a(AbstractC89171a aVar) {
            this.f140707a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                this.f140707a.invoke();
            } catch (Throwable th) {
                C39109f.m79401a("PerfExt", "asyncCall error", th);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.e.d$b */
    public static final class CallableC61996b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f140708a;

        static {
            Covode.recordClassIndex(72745);
        }

        CallableC61996b(AbstractC89171a aVar) {
            this.f140708a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                this.f140708a.invoke();
            } catch (Throwable th) {
                C39109f.m79401a("PerfExt", "serialCall error", th);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.e.d$c */
    public static final class CallableC61997c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f140709a;

        static {
            Covode.recordClassIndex(72746);
        }

        CallableC61997c(AbstractC89171a aVar) {
            this.f140709a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final T call() {
            try {
                return (T) this.f140709a.invoke();
            } catch (Throwable th) {
                C39109f.m79401a("PerfExt", "serialCall error", th);
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.e.d$d */
    public static final class C61998d<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f140710a;

        static {
            Covode.recordClassIndex(72747);
        }

        C61998d(AbstractC89172b bVar) {
            this.f140710a = bVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            AbstractC89172b bVar = this.f140710a;
            C89219l.m154716b(iVar, "");
            bVar.invoke(iVar.mo5545d());
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final C1731i<C89391z> m112120a(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        C1731i<C89391z> b = C1731i.m5640b(new CallableC61996b(aVar), m112122a());
        if (b == null) {
            C89219l.m154715b();
        }
        return b;
    }

    /* renamed from: b */
    public static final C1731i<C89391z> m112123b(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        C1731i<C89391z> b = C1731i.m5640b(new CallableC61995a(aVar), C1731i.f5562a);
        C89219l.m154716b(b, "");
        return b;
    }

    /* renamed from: a */
    public static final <T> C1731i<C89391z> m112121a(AbstractC89171a<? extends T> aVar, AbstractC89172b<? super T, C89391z> bVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        C1731i<C89391z> a = C1731i.m5640b(new CallableC61997c(aVar), m112122a()).mo5534a(new C61998d(bVar), C1731i.f5564c, null);
        C89219l.m154716b(a, "");
        return a;
    }
}
