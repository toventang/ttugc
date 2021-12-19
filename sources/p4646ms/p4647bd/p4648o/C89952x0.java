package p4646ms.p4647bd.p4648o;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import p4646ms.p4647bd.p4648o.C89868b;

/* access modifiers changed from: package-private */
/* renamed from: ms.bd.o.x0 */
public final class C89952x0 extends C89868b.AbstractC89869a {
    static {
        Covode.recordClassIndex(106049);
    }

    C89952x0() {
    }

    @Override // p4646ms.p4647bd.p4648o.C89868b.AbstractC89869a
    /* renamed from: a */
    public final Object mo35029a(long j, String str, Object obj) {
        MethodCollector.m26663i(204);
        Context context = C89865a.f203764a.f203765b;
        String[] split = str.split((String) C89889h.m155966a(16777217, 0, 0, "0e0aad", new byte[]{29, 123}));
        String str2 = split[0];
        String str3 = split[1];
        SharedPreferences.Editor edit = C34822d.m71158a(context, str2, 0).edit();
        edit.putString(str3, (String) obj);
        edit.commit();
        MethodCollector.m26664o(204);
        return null;
    }
}
