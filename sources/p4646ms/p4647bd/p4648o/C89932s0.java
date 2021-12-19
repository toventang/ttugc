package p4646ms.p4647bd.p4648o;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import p4646ms.p4647bd.p4648o.C89868b;

/* access modifiers changed from: package-private */
/* renamed from: ms.bd.o.s0 */
public final class C89932s0 extends C89868b.AbstractC89869a {
    static {
        Covode.recordClassIndex(106029);
    }

    C89932s0() {
    }

    @Override // p4646ms.p4647bd.p4648o.C89868b.AbstractC89869a
    /* renamed from: a */
    public final Object mo35029a(long j, String str, Object obj) {
        C89953x1 a = C89953x1.m156072a(C89865a.f203764a.f203765b);
        Integer c = a.mo144479c();
        if (c == null) {
            return null;
        }
        a.f203838b.add(c);
        try {
            int size = a.f203838b.size();
            if (size <= 20) {
                return null;
            }
            ArrayList arrayList = new ArrayList(a.f203838b.subList(size - 10, size));
            a.f203838b.clear();
            a.f203838b = arrayList;
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
