package com.google.android.play.core.p1963b;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1965d.C26991q;

/* renamed from: com.google.android.play.core.b.au */
public final class C26903au {

    /* renamed from: a */
    private static final C26909b f63791a = new C26909b("PhoneskyVerificationUtils");

    static {
        Covode.recordClassIndex(32378);
    }

    /* renamed from: a */
    public static boolean m53445a(Context context) {
        int length;
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
            if (signatureArr == null || (length = signatureArr.length) == 0) {
                f63791a.mo44599e("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                return false;
            }
            int i = 0;
            do {
                String a = C26991q.m53631a(signatureArr[i].toByteArray());
                if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(a)) {
                    return true;
                }
                if ((Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(a)) {
                    return true;
                }
                i++;
            } while (i < length);
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
