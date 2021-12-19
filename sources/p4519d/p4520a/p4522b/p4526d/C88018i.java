package p4519d.p4520a.p4522b.p4526d;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;
import p4519d.p4520a.p4522b.p4525c.C88001d;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89216i;
import p4600h.p4620k.AbstractC89278d;

/* renamed from: d.a.b.d.i */
public final class C88018i {

    /* renamed from: a */
    public static final C88001d<AbstractC89244h<AbstractC88016h>> f199892a = new C88001d<>(C89250i.m154773a((AbstractC89171a) C88020b.f199895a));

    /* renamed from: b */
    public static final C88001d<AbstractC89244h<AbstractC88016h>> f199893b = new C88001d<>(C89250i.m154773a((AbstractC89171a) C88019a.f199894a));

    /* renamed from: d.a.b.d.i$b */
    static final /* synthetic */ class C88020b extends C89216i implements AbstractC89171a<AbstractC88016h> {

        /* renamed from: a */
        public static final C88020b f199895a = new C88020b();

        static {
            Covode.recordClassIndex(104046);
        }

        C88020b() {
            super(0);
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c, p4600h.p4620k.AbstractC89276b
        public final String getName() {
            return "createMainScheduler";
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c
        public final String getSignature() {
            return "createMainScheduler()Lbytekn/foundation/concurrent/scheduler/Scheduler;";
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC88016h invoke() {
            return new C88013f();
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c
        public final AbstractC89278d getOwner() {
            return C89204ab.m154670a(C88007c.class, "kn_common_release");
        }
    }

    /* renamed from: d.a.b.d.i$a */
    static final /* synthetic */ class C88019a extends C89216i implements AbstractC89171a<AbstractC88016h> {

        /* renamed from: a */
        public static final C88019a f199894a = new C88019a();

        static {
            Covode.recordClassIndex(104045);
        }

        C88019a() {
            super(0);
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c, p4600h.p4620k.AbstractC89276b
        public final String getName() {
            return "createIoScheduler";
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c
        public final String getSignature() {
            return "createIoScheduler()Lbytekn/foundation/concurrent/scheduler/Scheduler;";
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c
        public final AbstractC89278d getOwner() {
            return C89204ab.m154670a(C88006b.class, "kn_common_release");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC88016h invoke() {
            return new C88008d(new C88004a(TimeUnit.MINUTES.toMillis(1), new ThreadFactoryC88021j("IO")));
        }
    }

    static {
        Covode.recordClassIndex(104044);
    }
}
