package p4646ms.p4647bd.p4648o;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import p4646ms.p4647bd.p4648o.C89868b;

/* access modifiers changed from: package-private */
/* renamed from: ms.bd.o.h0 */
public final class C89890h0 extends C89868b.AbstractC89869a {
    static {
        Covode.recordClassIndex(105987);
    }

    C89890h0() {
    }

    @Override // p4646ms.p4647bd.p4648o.C89868b.AbstractC89869a
    /* renamed from: a */
    public final Object mo35029a(long j, String str, Object obj) {
        int i;
        Context context = C89865a.f203764a.f203765b;
        try {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Throwable unused) {
            i = -1;
        }
        return Integer.valueOf(i);
    }
}
