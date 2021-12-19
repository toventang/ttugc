package p4519d.p4520a.p4522b.p4526d;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: d.a.b.d.j */
public final class ThreadFactoryC88021j implements ThreadFactory {

    /* renamed from: a */
    public static final AbstractC89244h f199896a = C89250i.m154773a((AbstractC89171a) C88023b.f199899a);

    /* renamed from: b */
    public static final C88022a f199897b = new C88022a((byte) 0);

    /* renamed from: c */
    private final String f199898c;

    /* renamed from: d.a.b.d.j$a */
    static final class C88022a {
        static {
            Covode.recordClassIndex(104048);
        }

        private C88022a() {
        }

        public /* synthetic */ C88022a(byte b) {
            this();
        }
    }

    /* renamed from: d.a.b.d.j$b */
    static final class C88023b extends AbstractC89220m implements AbstractC89171a<ThreadFactory> {

        /* renamed from: a */
        public static final C88023b f199899a = new C88023b();

        static {
            Covode.recordClassIndex(104049);
        }

        C88023b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ThreadFactory invoke() {
            return Executors.defaultThreadFactory();
        }
    }

    static {
        Covode.recordClassIndex(104047);
    }

    public ThreadFactoryC88021j(String str) {
        C89219l.m154719c(str, "");
        this.f199898c = str;
    }

    public final Thread newThread(Runnable runnable) {
        C89219l.m154719c(runnable, "");
        Thread newThread = ((ThreadFactory) f199896a.getValue()).newThread(runnable);
        newThread.setName(this.f199898c + ", " + newThread.getName());
        newThread.setDaemon(true);
        C89219l.m154709a((Object) newThread, "");
        return newThread;
    }
}
