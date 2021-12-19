package p4560f.p4561a.p4562a.p4564b;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.Objects;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4567d.AbstractC88434g;

/* renamed from: f.a.a.b.a */
public final class C88392a {

    /* renamed from: a */
    public static final AbstractC88398aa f200660a;

    /* renamed from: a */
    public static AbstractC88398aa m153583a() {
        return C88391a.m153580a(f200660a);
    }

    /* renamed from: f.a.a.b.a$a */
    static final class C88394a {

        /* renamed from: a */
        static final AbstractC88398aa f200661a = new C88395b(new Handler(Looper.getMainLooper()));

        static {
            Covode.recordClassIndex(104436);
        }
    }

    static {
        AbstractC88398aa aaVar;
        Covode.recordClassIndex(104434);
        CallableC883931 r1 = new Callable<AbstractC88398aa>() {
            /* class p4560f.p4561a.p4562a.p4564b.C88392a.CallableC883931 */

            static {
                Covode.recordClassIndex(104435);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* bridge */ /* synthetic */ AbstractC88398aa call() {
                return C88394a.f200661a;
            }
        };
        AbstractC88434g<Callable<AbstractC88398aa>, AbstractC88398aa> gVar = C88391a.f200658a;
        if (gVar == null) {
            aaVar = C88391a.m153581a(r1);
        } else {
            aaVar = (AbstractC88398aa) C88391a.m153582a(gVar, r1);
            Objects.requireNonNull(aaVar, "Scheduler Callable returned null");
        }
        f200660a = aaVar;
    }
}
