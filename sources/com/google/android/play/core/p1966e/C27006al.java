package com.google.android.play.core.p1966e;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.android.play.core.p1963b.C26909b;
import com.p2082ss.android.ugc.aweme.lancet.p3386c.C58014b;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.play.core.e.al */
public final class C27006al {

    /* renamed from: a */
    private static final C26909b f63906a = new C26909b("SplitInstallInfoProvider");

    /* renamed from: b */
    private final Context f63907b;

    /* renamed from: c */
    private final String f63908c;

    static {
        Covode.recordClassIndex(32482);
    }

    public C27006al(Context context) {
        this.f63907b = context;
        this.f63908c = context.getPackageName();
    }

    /* renamed from: a */
    public final Set<String> mo44713a() {
        HashSet hashSet = new HashSet();
        for (String str : m53657d()) {
            if (!m53656a(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    /* renamed from: b */
    public final Set<String> mo44714b() {
        C26998ad c = mo44715c();
        if (c == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Set<String> d = m53657d();
        d.add("");
        Set<String> a = mo44713a();
        a.add("");
        for (Map.Entry<String, Set<String>> entry : c.mo44702a(a).entrySet()) {
            if (d.containsAll(entry.getValue())) {
                hashSet.add(entry.getKey());
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    public final C26998ad mo44715c() {
        Bundle e = m53658e();
        if (e == null) {
            f63906a.mo44599e("No metadata found in Context.", new Object[0]);
            return null;
        }
        int i = e.getInt("com.android.vending.splits");
        if (i == 0) {
            f63906a.mo44599e("No metadata found in AndroidManifest.", new Object[0]);
            return null;
        }
        try {
            C26998ad a = C27001ag.m53648a(this.f63907b.getResources().getXml(i), new C26997ac());
            if (a == null) {
                f63906a.mo44599e("Can't parse languages metadata.", new Object[0]);
            }
            return a;
        } catch (Resources.NotFoundException unused) {
            f63906a.mo44599e("Resource with languages metadata doesn't exist.", new Object[0]);
            return null;
        }
    }

    /* renamed from: d */
    private final Set<String> m53657d() {
        HashSet hashSet = new HashSet();
        Bundle e = m53658e();
        if (e != null) {
            String string = e.getString("com.android.dynamic.apk.fused.modules");
            if (string == null || string.isEmpty()) {
                f63906a.mo44595a("App has no fused modules.", new Object[0]);
            } else {
                Collections.addAll(hashSet, string.split(",", -1));
                hashSet.remove("");
                hashSet.remove("base");
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            String[] strArr = null;
            try {
                PackageInfo packageInfo = this.f63907b.getPackageManager().getPackageInfo(this.f63908c, 0);
                if (packageInfo != null) {
                    strArr = packageInfo.splitNames;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f63906a.mo44599e("App is not found in PackageManager", new Object[0]);
            }
            if (strArr != null) {
                f63906a.mo44595a("Adding splits from package manager: %s", Arrays.toString(strArr));
                Collections.addAll(hashSet, strArr);
            } else {
                f63906a.mo44595a("No splits are found or app cannot be found in package manager.", new Object[0]);
            }
            AbstractC27004aj ajVar = C27005ak.f63905a.get();
            if (ajVar != null) {
                hashSet.addAll(ajVar.mo44693a());
            }
        }
        return hashSet;
    }

    /* renamed from: e */
    private final Bundle m53658e() {
        ApplicationInfo applicationInfo;
        try {
            PackageManager packageManager = this.f63907b.getPackageManager();
            String str = this.f63908c;
            if (TextUtils.equals(str, C17867d.m33078a().getPackageName())) {
                if (C58014b.f132218a == null) {
                    C58014b.f132218a = packageManager.getApplicationInfo(str, 128);
                }
                applicationInfo = C58014b.f132218a;
            } else {
                applicationInfo = packageManager.getApplicationInfo(str, 128);
            }
            if (applicationInfo != null && applicationInfo.metaData != null) {
                return applicationInfo.metaData;
            }
            f63906a.mo44595a("App has no applicationInfo or metaData", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            f63906a.mo44599e("App is not found in PackageManager", new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m53656a(String str) {
        return str.startsWith("config.") || str.contains(".config.");
    }
}
