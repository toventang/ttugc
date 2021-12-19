package com.bytedance.push.p1600k;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.push.p1600k.C21853a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.push.k.c */
public class C21857c {

    /* renamed from: a */
    private static List<String> f51777a;

    /* renamed from: b */
    private static List<ServiceInfo> f51778b;

    /* renamed from: c */
    private static List<ActivityInfo> f51779c;

    /* renamed from: d */
    private static List<ProviderInfo> f51780d;

    static {
        Covode.recordClassIndex(25509);
    }

    /* renamed from: a */
    private static List<String> m40939a(Context context) {
        String[] strArr;
        MethodCollector.m26663i(3686);
        if (f51777a == null) {
            synchronized (C21857c.class) {
                try {
                    if (f51777a == null && (strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions) != null) {
                        f51777a = Arrays.asList(strArr);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3686);
                    throw th;
                }
            }
        }
        List<String> list = f51777a;
        MethodCollector.m26664o(3686);
        return list;
    }

    /* renamed from: b */
    private static List<ServiceInfo> m40942b(Context context) {
        ServiceInfo[] serviceInfoArr;
        MethodCollector.m26663i(3721);
        if (f51778b == null) {
            synchronized (C21857c.class) {
                try {
                    if (f51778b == null && (serviceInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 516).services) != null) {
                        f51778b = Arrays.asList(serviceInfoArr);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3721);
                    throw th;
                }
            }
        }
        List<ServiceInfo> list = f51778b;
        MethodCollector.m26664o(3721);
        return list;
    }

    /* renamed from: c */
    private static List<ActivityInfo> m40945c(Context context) {
        ActivityInfo[] activityInfoArr;
        MethodCollector.m26663i(3739);
        if (f51779c == null) {
            synchronized (C21857c.class) {
                try {
                    if (f51779c == null && (activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 514).receivers) != null) {
                        f51779c = Arrays.asList(activityInfoArr);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3739);
                    throw th;
                }
            }
        }
        List<ActivityInfo> list = f51779c;
        MethodCollector.m26664o(3739);
        return list;
    }

    /* renamed from: d */
    private static List<ProviderInfo> m40947d(Context context) {
        ProviderInfo[] providerInfoArr;
        MethodCollector.m26663i(3927);
        if (f51780d == null) {
            synchronized (C21857c.class) {
                try {
                    if (f51780d == null && (providerInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 520).providers) != null) {
                        f51780d = Arrays.asList(providerInfoArr);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3927);
                    throw th;
                }
            }
        }
        List<ProviderInfo> list = f51780d;
        MethodCollector.m26664o(3927);
        return list;
    }

    /* renamed from: a */
    public static boolean m40941a(Context context, String str, List<String> list) {
        List<String> a = m40939a(context);
        if (a == null || a.isEmpty()) {
            new StringBuilder().append(str).append(".You need to declare permission(s) {").append(list).append("} in AndroidManifest.xml");
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            if (!a.contains(str2)) {
                arrayList.add(str2);
            }
        }
        if (!arrayList.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m40944b(Context context, String str, List<C21853a> list) {
        boolean z;
        if (list == null || list.isEmpty()) {
            return true;
        }
        List<ServiceInfo> b = m40942b(context);
        if (b == null || b.size() == 0) {
            new StringBuilder().append(str).append(". You need to declare service(s) {").append(list).append("} in AndroidManifest.xml");
            return false;
        }
        ArrayList arrayList = new ArrayList();
        boolean z2 = true;
        for (C21853a aVar : list) {
            Iterator<ServiceInfo> it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    arrayList.add(aVar);
                    break;
                }
                ServiceInfo next = it.next();
                if (TextUtils.equals(next.name, aVar.f51767b)) {
                    boolean equals = TextUtils.equals(aVar.f51768c, next.processName);
                    if (!TextUtils.isEmpty(aVar.f51769d)) {
                        z = TextUtils.equals(next.permission, aVar.f51769d);
                    } else {
                        z = true;
                    }
                    if (!equals) {
                        String str2 = next.processName;
                        z2 = false;
                    }
                    if (!z) {
                        String str3 = next.permission;
                        z2 = false;
                    }
                    if (aVar.f51766a != null) {
                        boolean z3 = true;
                        for (C21853a.C21855b bVar : aVar.f51766a) {
                            if (bVar.f51772a != null) {
                                for (String str4 : bVar.f51772a) {
                                    if (!m40943b(context, aVar.f51767b, bVar, str4)) {
                                        z3 = false;
                                    }
                                }
                            }
                        }
                        if (!z3) {
                            z2 = false;
                        }
                    }
                }
            }
        }
        arrayList.isEmpty();
        if (!z2 || !arrayList.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m40946c(Context context, String str, List<C21853a> list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        List<ActivityInfo> c = m40945c(context);
        if (c == null || c.size() == 0) {
            new StringBuilder().append(str).append(" error configuration:").append(list);
            return false;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C21853a aVar : list) {
            Iterator<ActivityInfo> it = c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    arrayList.add(aVar);
                    break;
                }
                ActivityInfo next = it.next();
                if (TextUtils.equals(next.name, aVar.f51767b)) {
                    if (!TextUtils.equals(aVar.f51768c, next.processName)) {
                        String str2 = next.processName;
                        z = false;
                    }
                    if (!TextUtils.isEmpty(aVar.f51769d) && !TextUtils.equals(next.permission, aVar.f51769d)) {
                        String str3 = next.permission;
                        z = false;
                    }
                    if (aVar.f51766a != null) {
                        boolean z2 = true;
                        for (C21853a.C21855b bVar : aVar.f51766a) {
                            if (bVar.f51772a != null) {
                                for (String str4 : bVar.f51772a) {
                                    if (!m40940a(context, aVar.f51767b, bVar, str4)) {
                                        z2 = false;
                                    }
                                }
                            }
                        }
                        if (!z2) {
                            z = false;
                        }
                    }
                }
            }
        }
        arrayList.isEmpty();
        if (!z || !arrayList.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m40948d(Context context, String str, List<C21853a> list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        List<ProviderInfo> d = m40947d(context);
        if (d == null || d.size() == 0) {
            new StringBuilder().append(str).append(" need to declare ContentProvider(s) ").append(list);
            return false;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C21853a aVar : list) {
            Iterator<ProviderInfo> it = d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    arrayList.add(aVar);
                    break;
                }
                ProviderInfo next = it.next();
                if (TextUtils.equals(next.name, aVar.f51767b)) {
                    if (!TextUtils.equals(aVar.f51768c, next.processName)) {
                        String str2 = next.processName;
                        z = false;
                    }
                    if (!TextUtils.isEmpty(aVar.f51770e) && !TextUtils.equals(next.authority, aVar.f51770e)) {
                        String str3 = next.authority;
                        z = false;
                    }
                }
            }
        }
        arrayList.isEmpty();
        if (!z || !arrayList.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m40943b(Context context, String str, C21853a.C21855b bVar, String str2) {
        Intent intent = new Intent();
        intent.setPackage(context.getPackageName());
        if (bVar.f51773b != null) {
            for (String str3 : bVar.f51773b) {
                intent.addCategory(str3);
            }
        }
        intent.setAction(str2);
        if (bVar.f51774c != null) {
            intent.setData(bVar.f51774c);
        }
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 576);
        if (queryIntentServices == null || queryIntentServices.size() <= 0) {
            return false;
        }
        for (ResolveInfo resolveInfo : queryIntentServices) {
            if (resolveInfo.serviceInfo != null && (TextUtils.isEmpty(str) || TextUtils.equals(resolveInfo.serviceInfo.name, str))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m40940a(Context context, String str, C21853a.C21855b bVar, String str2) {
        Intent intent = new Intent();
        intent.setPackage(context.getPackageName());
        if (bVar.f51773b != null) {
            for (String str3 : bVar.f51773b) {
                intent.addCategory(str3);
            }
        }
        intent.setAction(str2);
        if (bVar.f51774c != null) {
            if (!TextUtils.isEmpty(bVar.f51775d)) {
                intent.setDataAndType(bVar.f51774c, bVar.f51775d);
            } else {
                intent.setData(bVar.f51774c);
            }
        } else if (!TextUtils.isEmpty(bVar.f51775d)) {
            intent.setType(bVar.f51775d);
        }
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 576);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            return false;
        }
        for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
            if (resolveInfo.activityInfo != null && TextUtils.equals(resolveInfo.activityInfo.name, str)) {
                return true;
            }
        }
        return false;
    }
}
