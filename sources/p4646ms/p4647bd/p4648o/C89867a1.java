package p4646ms.p4647bd.p4648o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import p4646ms.p4647bd.p4648o.C89868b;

/* access modifiers changed from: package-private */
/* renamed from: ms.bd.o.a1 */
public final class C89867a1 extends C89868b.AbstractC89869a {
    static {
        Covode.recordClassIndex(105964);
    }

    C89867a1() {
    }

    @Override // p4646ms.p4647bd.p4648o.C89868b.AbstractC89869a
    /* renamed from: a */
    public final Object mo35029a(long j, String str, Object obj) {
        Context context = C89865a.f203764a.f203765b;
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        TextUtils.equals(packageName, C17867d.m33078a().getPackageName());
        ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
        String str2 = applicationInfo.sourceDir;
        if (str2 == null) {
            return applicationInfo.publicSourceDir;
        }
        return str2;
    }
}
