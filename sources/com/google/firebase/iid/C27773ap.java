package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.google.firebase.iid.ap */
public final class C27773ap {

    /* renamed from: d */
    private static C27773ap f65253d;

    /* renamed from: a */
    Boolean f65254a;

    /* renamed from: b */
    Boolean f65255b;

    /* renamed from: c */
    public final Queue<Intent> f65256c = new ArrayDeque();

    /* renamed from: e */
    private String f65257e;

    static {
        Covode.recordClassIndex(33361);
    }

    private C27773ap() {
    }

    /* renamed from: a */
    public static synchronized C27773ap m55533a() {
        C27773ap apVar;
        synchronized (C27773ap.class) {
            MethodCollector.m26663i(12059);
            if (f65253d == null) {
                f65253d = new C27773ap();
            }
            apVar = f65253d;
            MethodCollector.m26664o(12059);
        }
        return apVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo46426a(Context context) {
        boolean z;
        if (this.f65254a == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f65254a = Boolean.valueOf(z);
        }
        this.f65254a.booleanValue();
        return this.f65254a.booleanValue();
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName m55534b(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C27773ap.m55534b(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo46425a(Context context, Intent intent) {
        ComponentName componentName;
        String c = m55535c(context, intent);
        if (c != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(c);
                if (valueOf.length() != 0) {
                    "Restricting intent to a specific service: ".concat(valueOf);
                } else {
                    new String("Restricting intent to a specific service: ");
                }
            }
            intent.setClassName(context.getPackageName(), c);
        }
        try {
            if (mo46426a(context)) {
                componentName = C27778as.m55557a(context, intent);
            } else {
                componentName = m55534b(context, intent);
            }
            if (componentName == null) {
                return 404;
            }
            return -1;
        } catch (SecurityException unused) {
            return 401;
        } catch (IllegalStateException e) {
            String.valueOf(String.valueOf(e)).length();
            return 402;
        }
    }

    /* renamed from: c */
    private synchronized String m55535c(Context context, Intent intent) {
        String str;
        MethodCollector.m26663i(12190);
        String str2 = this.f65257e;
        if (str2 != null) {
            MethodCollector.m26664o(12190);
            return str2;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService == null || resolveService.serviceInfo == null) {
            MethodCollector.m26664o(12190);
            return null;
        }
        ServiceInfo serviceInfo = resolveService.serviceInfo;
        if (!context.getPackageName().equals(serviceInfo.packageName) || serviceInfo.name == null) {
            String str3 = serviceInfo.packageName;
            String str4 = serviceInfo.name;
            String.valueOf(str3).length();
            String.valueOf(str4).length();
            MethodCollector.m26664o(12190);
            return null;
        }
        if (serviceInfo.name.startsWith(".")) {
            String valueOf = String.valueOf(context.getPackageName());
            String valueOf2 = String.valueOf(serviceInfo.name);
            if (valueOf2.length() != 0) {
                str = valueOf.concat(valueOf2);
            } else {
                str = new String(valueOf);
            }
            this.f65257e = str;
        } else {
            this.f65257e = serviceInfo.name;
        }
        String str5 = this.f65257e;
        MethodCollector.m26664o(12190);
        return str5;
    }
}
