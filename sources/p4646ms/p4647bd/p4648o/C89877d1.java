package p4646ms.p4647bd.p4648o;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import p4646ms.p4647bd.p4648o.C89868b;

/* access modifiers changed from: package-private */
/* renamed from: ms.bd.o.d1 */
public final class C89877d1 extends C89868b.AbstractC89869a {
    static {
        Covode.recordClassIndex(105974);
    }

    C89877d1() {
    }

    /* access modifiers changed from: protected */
    @Override // p4646ms.p4647bd.p4648o.C89868b.AbstractC89869a
    /* renamed from: a */
    public final Object mo35029a(long j, String str, Object obj) {
        Throwable c = C89956y1.m156081a().mo144482c();
        if (c == null) {
            return null;
        }
        StackTraceElement[] stackTrace = c.getStackTrace();
        if (stackTrace.length < 4) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        do {
            if (stackTrace[i] != null && !TextUtils.isEmpty(stackTrace[i].getClassName())) {
                Class<?> cls = Class.forName(stackTrace[i].getClassName());
                C89956y1.m156081a();
                arrayList.addAll(C89956y1.m156080a(cls, stackTrace[i].getMethodName()));
            }
            i++;
        } while (i < 4);
        return arrayList;
    }
}
