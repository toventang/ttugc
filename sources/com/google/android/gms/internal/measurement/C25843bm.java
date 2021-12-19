package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;

/* renamed from: com.google.android.gms.internal.measurement.bm */
public final class C25843bm {

    /* renamed from: a */
    private static volatile AbstractC25867cj<Boolean> f60964a = AbstractC25867cj.zzc();

    /* renamed from: b */
    private static final Object f60965b = new Object();

    static {
        Covode.recordClassIndex(31258);
    }

    /* renamed from: a */
    private static boolean m50036a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            TextUtils.equals("com.google.android.gms", C17867d.m33078a().getPackageName());
            if ((packageManager.getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: a */
    public static boolean m50037a(Context context, Uri uri) {
        ProviderInfo resolveContentProvider;
        MethodCollector.m26663i(7353);
        String authority = uri.getAuthority();
        boolean z = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            String.valueOf(authority).length();
            MethodCollector.m26664o(7353);
            return false;
        } else if (f60964a.zza()) {
            boolean booleanValue = f60964a.zzb().booleanValue();
            MethodCollector.m26664o(7353);
            return booleanValue;
        } else {
            synchronized (f60965b) {
                try {
                    if (f60964a.zza()) {
                        return f60964a.zzb().booleanValue();
                    }
                    if (("com.google.android.gms".equals(context.getPackageName()) || ((resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 0)) != null && "com.google.android.gms".equals(resolveContentProvider.packageName))) && m50036a(context)) {
                        z = true;
                    }
                    f60964a = AbstractC25867cj.zza(Boolean.valueOf(z));
                    boolean booleanValue2 = f60964a.zzb().booleanValue();
                    MethodCollector.m26664o(7353);
                    return booleanValue2;
                } finally {
                    MethodCollector.m26664o(7353);
                }
            }
        }
    }
}
