package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.CancellationException;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: kotlinx.coroutines.bz */
public interface AbstractC89568bz extends AbstractC89127f.AbstractC89130b {

    /* renamed from: c */
    public static final C89570b f203287c = C89570b.f203288a;

    static {
        Covode.recordClassIndex(105659);
    }

    /* renamed from: a */
    AbstractC89548bh mo143982a(AbstractC89172b<? super Throwable, C89391z> bVar);

    /* renamed from: a */
    AbstractC89548bh mo143983a(boolean z, boolean z2, AbstractC89172b<? super Throwable, C89391z> bVar);

    /* renamed from: a */
    AbstractC89677s mo143984a(AbstractC89695u uVar);

    /* renamed from: a */
    void mo143985a(CancellationException cancellationException);

    /* renamed from: b */
    Object mo143991b(AbstractC89124d<? super C89391z> dVar);

    /* renamed from: b */
    boolean mo143993b();

    /* renamed from: k */
    boolean mo144007k();

    /* renamed from: l */
    boolean mo144008l();

    /* renamed from: m */
    CancellationException mo144009m();

    /* renamed from: n */
    boolean mo144010n();

    /* renamed from: o */
    /* synthetic */ void mo144011o();

    /* renamed from: kotlinx.coroutines.bz$b */
    public static final class C89570b implements AbstractC89127f.AbstractC89132c<AbstractC89568bz> {

        /* renamed from: a */
        static final /* synthetic */ C89570b f203288a = new C89570b();

        private C89570b() {
        }

        static {
            Covode.recordClassIndex(105661);
        }
    }

    /* renamed from: kotlinx.coroutines.bz$a */
    public static final class C89569a {
        static {
            Covode.recordClassIndex(105660);
        }

        /* renamed from: a */
        public static /* synthetic */ AbstractC89548bh m155510a(AbstractC89568bz bzVar, boolean z, boolean z2, AbstractC89172b bVar, int i) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            }
            return bzVar.mo143983a(z, z2, bVar);
        }
    }
}
