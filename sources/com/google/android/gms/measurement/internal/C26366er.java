package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.p1938c.C25499b;
import com.google.android.gms.common.p1938c.C25500c;
import com.google.android.gms.common.stats.C25588a;
import com.google.android.gms.internal.measurement.AbstractC25849bs;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.er */
public final class C26366er {

    /* renamed from: a */
    final C26381ff f61946a;

    static {
        Covode.recordClassIndex(31788);
    }

    /* renamed from: a */
    private final boolean m51825a() {
        try {
            C25499b a = C25500c.f60481a.mo41741a(this.f61946a.mo43012m());
            if (a == null) {
                this.f61946a.mo43016q().f61835k.mo43169a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            } else if (a.mo41740b("com.android.vending", 128).versionCode >= 80837300) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            this.f61946a.mo43016q().f61835k.mo43170a("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }

    C26366er(C26381ff ffVar) {
        this.f61946a = ffVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo43212a(String str) {
        String str2;
        if (str == null || str.isEmpty()) {
            this.f61946a.mo43016q().f61831g.mo43169a("Install Referrer Reporter was called with invalid app package name");
            return;
        }
        this.f61946a.mo43015p().mo43002c();
        if (!m51825a()) {
            this.f61946a.mo43016q().f61833i.mo43169a("Install Referrer Reporter is not available");
            return;
        }
        ServiceConnectionC26369eu euVar = new ServiceConnectionC26369eu(this, str);
        this.f61946a.mo43015p().mo43002c();
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        PackageManager packageManager = this.f61946a.mo43012m().getPackageManager();
        if (packageManager == null) {
            this.f61946a.mo43016q().f61831g.mo43169a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
            return;
        }
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            this.f61946a.mo43016q().f61833i.mo43169a("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        ResolveInfo resolveInfo = queryIntentServices.get(0);
        if (resolveInfo.serviceInfo != null) {
            String str3 = resolveInfo.serviceInfo.packageName;
            if (resolveInfo.serviceInfo.name == null || !"com.android.vending".equals(str3) || !m51825a()) {
                this.f61946a.mo43016q().f61830f.mo43169a("Play Store version 8.3.73 or higher required for Install Referrer");
                return;
            }
            Intent intent2 = new Intent(intent);
            try {
                C25588a.m49390a();
                boolean b = C25588a.m49392b(this.f61946a.mo43012m(), intent2, euVar, 1);
                C26353ee eeVar = this.f61946a.mo43016q().f61835k;
                if (b) {
                    str2 = "available";
                } else {
                    str2 = "not available";
                }
                eeVar.mo43170a("Install Referrer Service is", str2);
            } catch (Exception e) {
                this.f61946a.mo43016q().f61827c.mo43170a("Exception occurred while binding to Install Referrer Service", e.getMessage());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Bundle mo43211a(String str, AbstractC25849bs bsVar) {
        this.f61946a.mo43015p().mo43002c();
        if (bsVar == null) {
            this.f61946a.mo43016q().f61830f.mo43169a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle a = bsVar.mo42202a(bundle);
            if (a != null) {
                return a;
            }
            this.f61946a.mo43016q().f61827c.mo43169a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e) {
            this.f61946a.mo43016q().f61827c.mo43170a("Exception occurred while retrieving the Install Referrer", e.getMessage());
            return null;
        }
    }
}
