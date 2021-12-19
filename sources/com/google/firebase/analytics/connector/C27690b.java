package com.google.firebase.analytics.connector;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.internal.measurement.C25763ac;
import com.google.android.gms.internal.measurement.C25939f;
import com.google.android.gms.measurement.p1950a.C26237a;
import com.google.firebase.C27672a;
import com.google.firebase.C27695b;
import com.google.firebase.analytics.connector.internal.C27693a;
import com.google.firebase.p2010b.AbstractC27702d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.firebase.analytics.connector.b */
public class C27690b implements AbstractC27689a {

    /* renamed from: a */
    static volatile AbstractC27689a f65088a;

    /* renamed from: b */
    final C26237a f65089b;

    /* renamed from: c */
    final Map<String, Object> f65090c = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(33271);
    }

    private C27690b(C26237a aVar) {
        C25565r.m49314a(aVar);
        this.f65089b = aVar;
    }

    /* renamed from: a */
    public static AbstractC27689a m55367a(C27695b bVar, Context context, AbstractC27702d dVar) {
        MethodCollector.m26663i(1185);
        C25565r.m49314a(bVar);
        C25565r.m49314a(context);
        C25565r.m49314a(dVar);
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        C25565r.m49314a(applicationContext);
        if (f65088a == null) {
            synchronized (C27690b.class) {
                try {
                    if (f65088a == null) {
                        Bundle bundle = new Bundle(1);
                        if (bVar.mo46330f()) {
                            dVar.mo46340a(C27672a.class, ExecutorC27691c.f65091a, C27692d.f65092a);
                            bundle.putBoolean("dataCollectionDefaultEnabled", bVar.mo46328e());
                        }
                        f65088a = new C27690b(C25939f.m50211a(context, bundle).f61098c);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1185);
                    throw th;
                }
            }
        }
        AbstractC27689a aVar = f65088a;
        MethodCollector.m26664o(1185);
        return aVar;
    }

    @Override // com.google.firebase.analytics.connector.AbstractC27689a
    /* renamed from: a */
    public final void mo46318a(String str, String str2, Bundle bundle) {
        if (C27693a.m55371a(str) && !C27693a.f65093a.contains(str2)) {
            for (String str3 : C27693a.f65094b) {
                if (bundle.containsKey(str3)) {
                    return;
                }
            }
            if ("_cmp".equals(str2)) {
                if (C27693a.m55371a(str)) {
                    for (String str4 : C27693a.f65094b) {
                        if (bundle.containsKey(str4)) {
                            return;
                        }
                    }
                    str.hashCode();
                    char c = 65535;
                    switch (str.hashCode()) {
                        case 101200:
                            if (str.equals("fcm")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 101230:
                            if (str.equals("fdl")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 3142703:
                            if (str.equals("fiam")) {
                                c = 2;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            bundle.putString("_cis", "fcm_integration");
                            break;
                        case 1:
                            bundle.putString("_cis", "fdl_integration");
                            break;
                        case 2:
                            bundle.putString("_cis", "fiam_integration");
                            break;
                        default:
                            return;
                    }
                } else {
                    return;
                }
            }
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1);
            }
            this.f65089b.f61671a.mo42394a(str, str2, bundle);
        }
    }

    @Override // com.google.firebase.analytics.connector.AbstractC27689a
    /* renamed from: a */
    public final void mo46319a(String str, String str2, Object obj) {
        if (C27693a.m55371a(str)) {
            if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
                if (!str.equals("fcm") && !str.equals("frc")) {
                    return;
                }
            } else if ("_ln".equals(str2)) {
                if (!str.equals("fcm") && !str.equals("fiam")) {
                    return;
                }
            } else if (!C27693a.f65095c.contains(str2)) {
                for (String str3 : C27693a.f65096d) {
                    if (str2.matches(str3)) {
                        return;
                    }
                }
            } else {
                return;
            }
            C25939f fVar = this.f65089b.f61671a;
            fVar.mo42391a(new C25763ac(fVar, str, str2, obj));
        }
    }
}
