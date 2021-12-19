package p4519d.p4520a.p4522b.p4524b;

import com.bytedance.covode.number.Covode;
import p4519d.p4520a.p4522b.p4525c.C88002e;
import p4519d.p4520a.p4522b.p4526d.AbstractC88016h;
import p4519d.p4520a.p4522b.p4526d.C88018i;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: d.a.b.b.a */
public final class C87994a implements AbstractExecutorC87997b {

    /* renamed from: a */
    public static final C87995a f199872a = new C87995a((byte) 0);

    /* renamed from: b */
    private final AbstractC88016h.AbstractC88017a f199873b = ((AbstractC88016h) ((AbstractC89244h) C88002e.m153068a(C88018i.f199893b)).getValue()).mo142591a();

    static {
        Covode.recordClassIndex(104020);
    }

    /* renamed from: d.a.b.b.a$a */
    public static final class C87995a {
        static {
            Covode.recordClassIndex(104021);
        }

        private C87995a() {
        }

        public /* synthetic */ C87995a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d.a.b.b.a$b */
    public static final class C87996b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ Runnable f199874a;

        static {
            Covode.recordClassIndex(104022);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C87996b(Runnable runnable) {
            super(0);
            this.f199874a = runnable;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f199874a.run();
            return C89391z.f203057a;
        }
    }

    @Override // p4519d.p4520a.p4522b.p4524b.AbstractExecutorC87997b
    public final void shutdown() {
        this.f199873b.mo142592a();
    }

    public final void execute(Runnable runnable) {
        C89219l.m154719c(runnable, "");
        this.f199873b.mo142593a(new C87996b(runnable));
    }
}
