package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.util.C25609k;
import com.google.firebase.C27695b;
import java.util.List;

/* renamed from: com.google.firebase.iid.ae */
public final class C27760ae {

    /* renamed from: a */
    private final Context f65224a;

    /* renamed from: b */
    private String f65225b;

    /* renamed from: c */
    private String f65226c;

    /* renamed from: d */
    private int f65227d;

    /* renamed from: e */
    private int f65228e;

    static {
        Covode.recordClassIndex(33348);
    }

    /* renamed from: c */
    public final synchronized String mo46413c() {
        String a;
        MethodCollector.m26663i(12879);
        a = m55504a(this);
        MethodCollector.m26664o(12879);
        return a;
    }

    /* renamed from: f */
    private synchronized String m55505f() {
        String str;
        MethodCollector.m26663i(12880);
        if (this.f65225b == null) {
            m55506g();
        }
        str = this.f65225b;
        MethodCollector.m26664o(12880);
        return str;
    }

    /* renamed from: d */
    public final synchronized String mo46414d() {
        String str;
        MethodCollector.m26663i(12965);
        if (this.f65226c == null) {
            m55506g();
        }
        str = this.f65226c;
        MethodCollector.m26664o(12965);
        return str;
    }

    /* renamed from: e */
    public final synchronized int mo46415e() {
        int i;
        PackageInfo a;
        MethodCollector.m26663i(12966);
        if (this.f65227d == 0 && (a = m55502a("com.google.android.gms")) != null) {
            this.f65227d = a.versionCode;
        }
        i = this.f65227d;
        MethodCollector.m26664o(12966);
        return i;
    }

    /* renamed from: g */
    private synchronized void m55506g() {
        MethodCollector.m26663i(12967);
        PackageInfo a = m55502a(this.f65224a.getPackageName());
        if (a != null) {
            this.f65225b = Integer.toString(a.versionCode);
            this.f65226c = a.versionName;
        }
        MethodCollector.m26664o(12967);
    }

    /* renamed from: a */
    public final boolean mo46411a() {
        if (mo46412b() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final synchronized int mo46412b() {
        MethodCollector.m26663i(12791);
        int i = this.f65228e;
        if (i != 0) {
            MethodCollector.m26664o(12791);
            return i;
        }
        PackageManager packageManager = this.f65224a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            MethodCollector.m26664o(12791);
            return 0;
        }
        if (!C25609k.m49423e()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f65228e = 1;
                MethodCollector.m26664o(12791);
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            if (C25609k.m49423e()) {
                this.f65228e = 2;
            } else {
                this.f65228e = 1;
            }
            int i2 = this.f65228e;
            MethodCollector.m26664o(12791);
            return i2;
        }
        this.f65228e = 2;
        MethodCollector.m26664o(12791);
        return 2;
    }

    public C27760ae(Context context) {
        this.f65224a = context;
    }

    /* renamed from: a */
    private static String m55504a(C27760ae aeVar) {
        try {
            return aeVar.m55505f();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: a */
    private PackageInfo m55502a(String str) {
        try {
            return this.f65224a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String.valueOf(String.valueOf(e)).length();
            return null;
        }
    }

    /* renamed from: a */
    public static String m55503a(C27695b bVar) {
        String str = bVar.mo46327c().f65182e;
        if (str != null) {
            return str;
        }
        String str2 = bVar.mo46327c().f65179b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }
}
