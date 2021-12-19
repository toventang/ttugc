package p4646ms.p4647bd.p4648o;

import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4646ms.p4647bd.p4648o.C89868b;

/* access modifiers changed from: package-private */
/* renamed from: ms.bd.o.u0 */
public final class C89943u0 extends C89868b.AbstractC89869a {
    static {
        Covode.recordClassIndex(106040);
    }

    C89943u0() {
    }

    @Override // p4646ms.p4647bd.p4648o.C89868b.AbstractC89869a
    /* renamed from: a */
    public final Object mo35029a(long j, String str, Object obj) {
        MethodCollector.m26663i(237);
        Intent a = C89953x1.m156071a(C89953x1.m156072a(C89865a.f203764a.f203765b).f203837a, new IntentFilter((String) C89889h.m155966a(16777217, 0, 0, "343d3f", new byte[]{35, 56, 68, 2, 3, 120, 52, 91, 107, 58, 54, 51, 78, 4, 66, 112, 51, 1, 107, 59, 44, 120, 98, 49, 56, 69, 21, 39, 91, 11, 1, 30, 97, 62, 43, 84, 20})));
        int i = -1;
        if (a != null) {
            int intExtra = a.getIntExtra((String) C89889h.m155966a(16777217, 0, 0, "fd2942", new byte[]{100, 114, 64, 89, 30, 54}), -1);
            if (intExtra == 2 || intExtra == 5) {
                i = 1;
            } else {
                i = 0;
            }
        }
        Integer valueOf = Integer.valueOf(i);
        MethodCollector.m26664o(237);
        return valueOf;
    }
}
