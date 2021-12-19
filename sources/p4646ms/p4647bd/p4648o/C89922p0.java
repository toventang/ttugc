package p4646ms.p4647bd.p4648o;

import android.content.Context;
import android.content.pm.Signature;
import com.bytedance.covode.number.Covode;
import p4646ms.p4647bd.p4648o.C89868b;

/* access modifiers changed from: package-private */
/* renamed from: ms.bd.o.p0 */
public final class C89922p0 extends C89868b.AbstractC89869a {
    static {
        Covode.recordClassIndex(106019);
    }

    C89922p0() {
    }

    @Override // p4646ms.p4647bd.p4648o.C89868b.AbstractC89869a
    /* renamed from: a */
    public final Object mo35029a(long j, String str, Object obj) {
        Context context = C89865a.f203764a.f203765b;
        Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
        if (signatureArr == null || signatureArr.length <= 0) {
            return null;
        }
        return signatureArr[0].toByteArray();
    }
}
