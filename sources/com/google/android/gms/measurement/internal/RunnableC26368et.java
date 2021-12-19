package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.stats.C25588a;
import com.google.android.gms.internal.measurement.AbstractC25849bs;
import com.google.android.gms.internal.measurement.C26129ln;

/* renamed from: com.google.android.gms.measurement.internal.et */
final class RunnableC26368et implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AbstractC25849bs f61952a;

    /* renamed from: b */
    private final /* synthetic */ ServiceConnection f61953b;

    /* renamed from: c */
    private final /* synthetic */ ServiceConnectionC26369eu f61954c;

    static {
        Covode.recordClassIndex(31790);
    }

    public final void run() {
        String str;
        C26366er erVar = this.f61954c.f61956b;
        String str2 = this.f61954c.f61955a;
        AbstractC25849bs bsVar = this.f61952a;
        ServiceConnection serviceConnection = this.f61953b;
        Bundle a = erVar.mo43211a(str2, bsVar);
        erVar.f61946a.mo43015p().mo43002c();
        if (a != null) {
            long j = a.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j == 0) {
                erVar.f61946a.mo43016q().f61830f.mo43169a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = a.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    erVar.f61946a.mo43016q().f61827c.mo43169a("No referrer defined in Install Referrer response");
                } else {
                    erVar.f61946a.mo43016q().f61835k.mo43170a("InstallReferrer API result", string);
                    C26510jz e = erVar.f61946a.mo43256e();
                    String valueOf = String.valueOf(string);
                    if (valueOf.length() != 0) {
                        str = "?".concat(valueOf);
                    } else {
                        str = new String("?");
                    }
                    Bundle a2 = e.mo43516a(Uri.parse(str));
                    if (a2 == null) {
                        erVar.f61946a.mo43016q().f61827c.mo43169a("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = a2.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = a.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j2 == 0) {
                                erVar.f61946a.mo43016q().f61827c.mo43169a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                a2.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == erVar.f61946a.mo43253b().f61910j.mo43209a()) {
                            erVar.f61946a.mo43019t();
                            erVar.f61946a.mo43016q().f61835k.mo43169a("Install Referrer campaign has already been logged");
                        } else {
                            C26129ln.m51215b();
                            if (!erVar.f61946a.f62001e.mo43641d(null, C26530p.f62490aB) || erVar.f61946a.mo43265r()) {
                                erVar.f61946a.mo43253b().f61910j.mo43210a(j);
                                erVar.f61946a.mo43019t();
                                erVar.f61946a.mo43016q().f61835k.mo43170a("Logging Install Referrer campaign from sdk with ", "referrer API");
                                a2.putString("_cis", "referrer API");
                                erVar.f61946a.mo43255d().mo43305a("auto", "_cmp", a2);
                            }
                        }
                    }
                }
            }
        }
        if (serviceConnection != null) {
            C25588a.m49390a();
            erVar.f61946a.mo43012m().unbindService(serviceConnection);
        }
    }

    RunnableC26368et(ServiceConnectionC26369eu euVar, AbstractC25849bs bsVar, ServiceConnection serviceConnection) {
        this.f61954c = euVar;
        this.f61952a = bsVar;
        this.f61953b = serviceConnection;
    }
}
