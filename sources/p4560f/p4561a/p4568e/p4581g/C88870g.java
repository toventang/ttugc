package p4560f.p4561a.p4568e.p4581g;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ThreadFactory;
import p4560f.p4561a.AbstractC88398aa;

/* renamed from: f.a.e.g.g */
public final class C88870g extends AbstractC88398aa {

    /* renamed from: c */
    private static final ThreadFactoryC88873j f201834c = new ThreadFactoryC88873j("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* renamed from: a */
    final ThreadFactory f201835a;

    public C88870g() {
        this(f201834c);
    }

    @Override // p4560f.p4561a.AbstractC88398aa
    /* renamed from: a */
    public final AbstractC88398aa.AbstractC88401c mo20704a() {
        return new C88871h(this.f201835a);
    }

    static {
        Covode.recordClassIndex(104912);
    }

    private C88870g(ThreadFactory threadFactory) {
        this.f201835a = threadFactory;
    }
}
