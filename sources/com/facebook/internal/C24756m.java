package com.facebook.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;

/* renamed from: com.facebook.internal.m */
public final class C24756m {

    /* renamed from: a */
    private static final HashSet<String> f58734a;

    static {
        Covode.recordClassIndex(28909);
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("8a3c4b262d721acd49a4bf97d5213199c86fa2b9");
        hashSet.add("cc2751449a350f668590264ed76692694a80308a");
        hashSet.add("a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc");
        hashSet.add("5e8f16062ea3cd2c4a0d547876baa6f38cabf625");
        hashSet.add("df6b721c8b4d3b6eb44c861d4415007e5a35fc95");
        hashSet.add("9b8f518b086098de3d77736f9458a3d2f6f95a37");
        hashSet.add("2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3");
        f58734a = hashSet;
    }

    /* renamed from: a */
    public static boolean m47401a(Context context, String str) {
        String str2 = Build.BRAND;
        int i = context.getApplicationInfo().flags;
        if (str2.startsWith("generic") && (i & 2) != 0) {
            return true;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            if (packageInfo.signatures != null && packageInfo.signatures.length > 0) {
                for (Signature signature : packageInfo.signatures) {
                    if (!f58734a.contains(C24693ad.m47237a("SHA-1", signature.toByteArray()))) {
                        return false;
                    }
                }
                return true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }
}
