package p4519d.p4520a.p4534g;

import com.bytedance.covode.number.Covode;
import p4519d.p4520a.p4522b.p4525c.C88002e;
import p4519d.p4520a.p4522b.p4526d.AbstractC88016h;
import p4519d.p4520a.p4522b.p4526d.C88018i;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: d.a.g.f */
public final class C88073f {

    /* renamed from: a */
    public static final C88073f f199982a = new C88073f();

    /* renamed from: b */
    private static final AbstractC88016h.AbstractC88017a f199983b = ((AbstractC88016h) ((AbstractC89244h) C88002e.m153068a(C88018i.f199892a)).getValue()).mo142591a();

    private C88073f() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d.a.g.f$a */
    public static final class C88074a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ Runnable f199984a;

        static {
            Covode.recordClassIndex(104100);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C88074a(Runnable runnable) {
            super(0);
            this.f199984a = runnable;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f199984a.run();
            return C89391z.f203057a;
        }
    }

    static {
        Covode.recordClassIndex(104099);
    }

    /* renamed from: a */
    public static void m153147a(Runnable runnable) {
        C89219l.m154719c(runnable, "");
        f199983b.mo142593a(new C88074a(runnable));
    }
}
