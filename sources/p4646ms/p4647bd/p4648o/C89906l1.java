package p4646ms.p4647bd.p4648o;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Locale;
import p4646ms.p4647bd.p4648o.C89868b;

/* access modifiers changed from: package-private */
/* renamed from: ms.bd.o.l1 */
public final class C89906l1 extends C89868b.AbstractC89869a {
    static {
        Covode.recordClassIndex(106003);
    }

    C89906l1() {
    }

    @Override // p4646ms.p4647bd.p4648o.C89868b.AbstractC89869a
    /* renamed from: a */
    public final Object mo35029a(long j, String str, Object obj) {
        String str2;
        MethodCollector.m26663i(689);
        try {
            Locale locale = C89865a.f203764a.f203765b.getResources().getConfiguration().locale;
            str2 = locale.getLanguage() + ((String) C89889h.m155966a(16777217, 0, 0, "7d794d", new byte[]{25})) + locale.getCountry();
        } catch (Throwable unused) {
            str2 = null;
        }
        String a = C89959z1.m156087a(str2);
        MethodCollector.m26664o(689);
        return a;
    }
}
