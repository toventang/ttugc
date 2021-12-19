package com.p2082ss.android.ugc.aweme.push.downgrade;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.push.downgrade.f */
public class C65715f {

    /* renamed from: a */
    static volatile boolean f148068a;

    /* renamed from: b */
    static Set<String> f148069b = new HashSet();

    static {
        Covode.recordClassIndex(77213);
    }

    /* renamed from: a */
    static void m117629a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4);
            if (!(packageInfo == null || packageInfo.services == null)) {
                ServiceInfo[] serviceInfoArr = packageInfo.services;
                String a = C65717h.m117631a(context);
                String b = C65717h.m117634b(context);
                for (ServiceInfo serviceInfo : serviceInfoArr) {
                    if (serviceInfo != null && (TextUtils.equals(a, serviceInfo.processName) || TextUtils.equals(b, serviceInfo.processName))) {
                        f148069b.add(serviceInfo.name);
                        String str = serviceInfo.name;
                    }
                }
            }
        } catch (Throwable th) {
            Log.getStackTraceString(th);
        }
    }

    /* renamed from: a */
    static boolean m117630a(Context context, Intent intent) {
        if (!(context == null || intent == null)) {
            try {
                ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
                if (!(resolveService == null || resolveService.serviceInfo == null)) {
                    String str = resolveService.serviceInfo.processName;
                    if (TextUtils.equals(C65717h.m117631a(context), str) || TextUtils.equals(C65717h.m117634b(context), str)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                Log.getStackTraceString(th);
            }
        }
        return false;
    }
}
