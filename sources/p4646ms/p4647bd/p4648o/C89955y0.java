package p4646ms.p4647bd.p4648o;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import p4646ms.p4647bd.p4648o.C89868b;

/* access modifiers changed from: package-private */
/* renamed from: ms.bd.o.y0 */
public final class C89955y0 extends C89868b.AbstractC89869a {
    static {
        Covode.recordClassIndex(106052);
    }

    C89955y0() {
    }

    @Override // p4646ms.p4647bd.p4648o.C89868b.AbstractC89869a
    /* renamed from: a */
    public final Object mo35029a(long j, String str, Object obj) {
        Context context = C89865a.f203764a.f203765b;
        String[] strArr = (String[]) obj;
        if (context == null || str == null || strArr == null || strArr.length % 2 != 0) {
            return null;
        }
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        for (int i = 0; i < strArr.length; i += 2) {
            intent.putExtra(strArr[i], strArr[i + 1]);
        }
        context.sendBroadcast(intent);
        return null;
    }
}
