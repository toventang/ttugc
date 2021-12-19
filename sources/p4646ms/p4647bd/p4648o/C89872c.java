package p4646ms.p4647bd.p4648o;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4646ms.p4647bd.p4648o.C89868b;

/* access modifiers changed from: package-private */
/* renamed from: ms.bd.o.c */
public final class C89872c extends C89868b.AbstractC89869a {
    static {
        Covode.recordClassIndex(105969);
    }

    C89872c() {
    }

    @Override // p4646ms.p4647bd.p4648o.C89868b.AbstractC89869a
    /* renamed from: a */
    public final Object mo35029a(long j, String str, Object obj) {
        String str2;
        MethodCollector.m26663i(2440);
        try {
            Context context = C89865a.f203764a.f203765b;
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            C89889h.m155966a(16777217, 0, 0, "503284", new byte[]{45, 59});
            str2 = "";
        }
        MethodCollector.m26664o(2440);
        return str2;
    }
}
