package p4519d.p4520a.p4522b.p4526d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p4519d.p4520a.p4522b.p4526d.AbstractC88016h;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: d.a.b.d.d */
public final class C88008d implements AbstractC88016h {

    /* renamed from: a */
    private final AbstractC88012e f199883a;

    /* renamed from: d.a.b.d.d$a */
    static final class C88009a implements AbstractC88016h.AbstractC88017a {

        /* renamed from: c */
        public static final C88010a f199884c = new C88010a((byte) 0);

        /* renamed from: a */
        public volatile ScheduledExecutorService f199885a;

        /* renamed from: b */
        public final Object f199886b = new Object();

        /* renamed from: d */
        private final AbstractC88012e f199887d;

        static {
            Covode.recordClassIndex(104035);
        }

        /* renamed from: d.a.b.d.d$a$a */
        static final class C88010a {
            static {
                Covode.recordClassIndex(104036);
            }

            private C88010a() {
            }

            /* renamed from: d.a.b.d.d$a$a$a */
            static final class RunnableC88011a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ AbstractC89171a f199888a;

                static {
                    Covode.recordClassIndex(104037);
                }

                RunnableC88011a(AbstractC89171a aVar) {
                    this.f199888a = aVar;
                }

                public final void run() {
                    try {
                        this.f199888a.invoke();
                    } catch (Throwable unused) {
                    }
                }
            }

            public /* synthetic */ C88010a(byte b) {
                this();
            }
        }

        @Override // p4519d.p4520a.p4522b.p4526d.AbstractC88016h.AbstractC88017a
        /* renamed from: a */
        public final void mo142592a() {
            ScheduledExecutorService scheduledExecutorService = this.f199885a;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdown();
            }
        }

        public C88009a(AbstractC88012e eVar) {
            C89219l.m154719c(eVar, "");
            this.f199887d = eVar;
            this.f199885a = eVar.mo142590a();
        }

        @Override // p4519d.p4520a.p4522b.p4526d.AbstractC88016h.AbstractC88017a
        /* renamed from: a */
        public final void mo142593a(AbstractC89171a<C89391z> aVar) {
            MethodCollector.m26663i(11204);
            C89219l.m154719c(aVar, "");
            if (this.f199885a != null) {
                synchronized (this.f199886b) {
                    try {
                        ScheduledExecutorService scheduledExecutorService = this.f199885a;
                        if (scheduledExecutorService != null) {
                            scheduledExecutorService.schedule(new C88010a.RunnableC88011a(aVar), 0, TimeUnit.MILLISECONDS);
                        }
                    } finally {
                        MethodCollector.m26664o(11204);
                    }
                }
                return;
            }
            MethodCollector.m26664o(11204);
        }
    }

    static {
        Covode.recordClassIndex(104034);
    }

    @Override // p4519d.p4520a.p4522b.p4526d.AbstractC88016h
    /* renamed from: a */
    public final AbstractC88016h.AbstractC88017a mo142591a() {
        return new C88009a(this.f199883a);
    }

    public C88008d(AbstractC88012e eVar) {
        C89219l.m154719c(eVar, "");
        this.f199883a = eVar;
    }
}
