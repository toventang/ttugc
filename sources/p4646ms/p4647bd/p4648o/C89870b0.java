package p4646ms.p4647bd.p4648o;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: ms.bd.o.b0 */
public final class C89870b0 {
    static {
        Covode.recordClassIndex(105967);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.String[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static boolean m155943a() {
        MethodCollector.m26663i(1263);
        boolean a = m155944a(C89889h.m155966a(16777217, 0, 0, "3af1fb", new byte[]{33, 108, 24, 11, 91, 108, 36, 69, 51, 96, 44, 96, 16, 11, 77, 97, 62, 69, 35, 47, 22, 87, 59, 64, 77, 92, 62, 73, 35}));
        MethodCollector.m26664o(1263);
        return a;
    }

    /* renamed from: a */
    static boolean m155944a(String... strArr) {
        boolean z;
        boolean z2;
        int i = 0;
        do {
            try {
                Class.forName(strArr[0]);
                z = true;
            } catch (Exception unused) {
                z = false;
            }
            z2 = z & true;
            if (!z2) {
                break;
            }
            i++;
        } while (i <= 0);
        return z2;
    }
}
