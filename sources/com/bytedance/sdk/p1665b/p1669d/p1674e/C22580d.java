package com.bytedance.sdk.p1665b.p1669d.p1674e;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sdk.p1665b.C22518a;
import com.bytedance.sdk.p1665b.p1669d.p1671b.AbstractC22559b;
import com.bytedance.sdk.p1665b.p1669d.p1674e.AbstractRunnableC22576a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.lang.ref.SoftReference;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.sdk.b.d.e.d */
public class C22580d {

    /* renamed from: b */
    private static volatile C22580d f53355b;

    /* renamed from: a */
    public final HandlerC22582a f53356a;

    /* renamed from: c */
    private final ExecutorService f53357c;

    static {
        Covode.recordClassIndex(26396);
    }

    private C22580d() {
        C22518a.m42486j();
        ExecutorService executorService = C22518a.f53231a.f53241h;
        if (executorService == null) {
            C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
            a.f95505c = 1;
            executorService = C40780g.m82242a(a.mo70028a());
        }
        this.f53357c = executorService;
        this.f53356a = new HandlerC22582a(this);
    }

    /* renamed from: a */
    public static C22580d m42594a() {
        MethodCollector.m26663i(2880);
        if (f53355b == null) {
            synchronized (C22580d.class) {
                try {
                    if (f53355b == null) {
                        f53355b = new C22580d();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2880);
                    throw th;
                }
            }
        }
        C22580d dVar = f53355b;
        MethodCollector.m26664o(2880);
        return dVar;
    }

    /* renamed from: com.bytedance.sdk.b.d.e.d$a */
    static class HandlerC22582a extends Handler {

        /* renamed from: a */
        private final SoftReference<C22580d> f53360a;

        static {
            Covode.recordClassIndex(26398);
        }

        HandlerC22582a(C22580d dVar) {
            this.f53360a = new SoftReference<>(dVar);
        }

        public final void handleMessage(Message message) {
            AbstractRunnableC22576a aVar;
            AbstractC22559b a;
            if (this.f53360a.get() != null && (a = (aVar = (AbstractRunnableC22576a) message.obj).mo36851a()) != null) {
                int i = message.what;
                if (i == 0) {
                    a.mo36846a((Object) aVar.f53352g);
                } else if (i == 1) {
                    a.mo36845a(aVar.f53353h);
                }
            }
        }
    }

    /* renamed from: a */
    public final <T> void mo36861a(final AbstractRunnableC22576a<T> aVar) {
        if (aVar.mo36851a() != null) {
            aVar.f53351f = new AbstractRunnableC22576a.AbstractC22577a<T>() {
                /* class com.bytedance.sdk.p1665b.p1669d.p1674e.C22580d.C225811 */

                static {
                    Covode.recordClassIndex(26397);
                }

                @Override // com.bytedance.sdk.p1665b.p1669d.p1674e.AbstractRunnableC22576a.AbstractC22577a
                /* renamed from: a */
                public final void mo36857a(Exception exc) {
                    aVar.f53353h = exc;
                    Message obtain = Message.obtain();
                    obtain.obj = aVar;
                    obtain.what = 1;
                    C22580d.this.f53356a.sendMessage(obtain);
                }

                @Override // com.bytedance.sdk.p1665b.p1669d.p1674e.AbstractRunnableC22576a.AbstractC22577a
                /* renamed from: a */
                public final void mo36858a(T t) {
                    aVar.f53352g = t;
                    Message obtain = Message.obtain();
                    obtain.obj = aVar;
                    obtain.what = 0;
                    C22580d.this.f53356a.sendMessage(obtain);
                }
            };
            this.f53357c.submit(aVar);
        }
    }
}
