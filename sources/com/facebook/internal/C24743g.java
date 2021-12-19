package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.bytedance.covode.number.Covode;
import com.facebook.C24872m;
import com.facebook.internal.p1894a.p1896b.C24677a;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.facebook.internal.g */
public class C24743g {

    /* renamed from: a */
    private static final String[] f58716a = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    static {
        Covode.recordClassIndex(28896);
    }

    /* renamed from: b */
    private static String m47376b() {
        if (C24677a.m47209a(C24743g.class)) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder("fbconnect://cct.");
            C24699ae.m47299a();
            return sb.append(C24872m.f59047g.getPackageName()).toString();
        } catch (Throwable th) {
            C24677a.m47208a(th, C24743g.class);
            return null;
        }
    }

    /* renamed from: a */
    public static String m47374a() {
        if (C24677a.m47209a(C24743g.class)) {
            return null;
        }
        try {
            C24699ae.m47299a();
            Context context = C24872m.f59047g;
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            if (queryIntentServices != null) {
                HashSet hashSet = new HashSet(Arrays.asList(f58716a));
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                        return serviceInfo.packageName;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24743g.class);
            return null;
        }
    }

    /* renamed from: a */
    public static String m47375a(String str) {
        if (C24677a.m47209a(C24743g.class)) {
            return null;
        }
        try {
            C24699ae.m47299a();
            if (C24699ae.m47304a(C24872m.f59047g, str)) {
                return str;
            }
            C24699ae.m47299a();
            if (C24699ae.m47304a(C24872m.f59047g, m47376b())) {
                return m47376b();
            }
            return "";
        } catch (Throwable th) {
            C24677a.m47208a(th, C24743g.class);
            return null;
        }
    }
}
