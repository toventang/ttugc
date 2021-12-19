package p4560f.p4561a.p4568e.p4584j;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4568e.p4581g.AbstractC88872i;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.j.e */
public final class C88903e {
    static {
        Covode.recordClassIndex(104945);
    }

    /* renamed from: a */
    public static void m154100a() {
        if (!C88925a.f201956x) {
            return;
        }
        if ((Thread.currentThread() instanceof AbstractC88872i) || C88925a.m154179a()) {
            throw new IllegalStateException("Attempt to block on a Scheduler " + Thread.currentThread().getName() + " that doesn't support blocking operators as they may lead to deadlock");
        }
    }
}
