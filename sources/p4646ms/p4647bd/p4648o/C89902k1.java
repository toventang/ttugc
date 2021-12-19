package p4646ms.p4647bd.p4648o;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.TimeZone;
import p4646ms.p4647bd.p4648o.C89868b;

/* access modifiers changed from: package-private */
/* renamed from: ms.bd.o.k1 */
public final class C89902k1 extends C89868b.AbstractC89869a {
    static {
        Covode.recordClassIndex(105999);
    }

    C89902k1() {
    }

    @Override // p4646ms.p4647bd.p4648o.C89868b.AbstractC89869a
    /* renamed from: a */
    public final Object mo35029a(long j, String str, Object obj) {
        int i;
        String str2;
        MethodCollector.m26663i(700);
        try {
            TimeZone timeZone = TimeZone.getDefault();
            str2 = timeZone.getID();
            try {
                i = ((timeZone.getRawOffset() / 60) / 60) / 1000;
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            str2 = null;
            i = 0;
            String str3 = str2 + ((String) C89889h.m155966a(16777217, 0, 0, "6637fd", new byte[]{107})) + i;
            MethodCollector.m26664o(700);
            return str3;
        }
        String str32 = str2 + ((String) C89889h.m155966a(16777217, 0, 0, "6637fd", new byte[]{107})) + i;
        MethodCollector.m26664o(700);
        return str32;
    }
}
