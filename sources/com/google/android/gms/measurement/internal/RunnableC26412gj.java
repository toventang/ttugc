package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.C26156mn;

/* renamed from: com.google.android.gms.measurement.internal.gj */
final /* synthetic */ class RunnableC26412gj implements Runnable {

    /* renamed from: a */
    private final C26413gk f62098a;

    /* renamed from: b */
    private final Bundle f62099b;

    static {
        Covode.recordClassIndex(31834);
    }

    RunnableC26412gj(C26413gk gkVar, Bundle bundle) {
        this.f62098a = gkVar;
        this.f62099b = bundle;
    }

    public final void run() {
        C26413gk gkVar = this.f62098a;
        Bundle bundle = this.f62099b;
        C26156mn.m51251b();
        if (gkVar.mo43018s().mo43641d(null, C26530p.f62502aN)) {
            if (bundle == null) {
                gkVar.mo43017r().f61925y.mo43204a(new Bundle());
                return;
            }
            Bundle a = gkVar.mo43017r().f61925y.mo43203a();
            for (String str : bundle.keySet()) {
                Object a2 = m51984a(bundle, str);
                if (a2 != null && !(a2 instanceof String) && !(a2 instanceof Long) && !(a2 instanceof Double)) {
                    gkVar.mo43014o();
                    if (C26510jz.m52393a(a2)) {
                        gkVar.mo43014o().mo43522a(27, (String) null, (String) null, 0);
                    }
                    gkVar.mo43016q().f61832h.mo43171a("Invalid default event parameter type. Name, value", str, a2);
                } else if (C26510jz.m52406e(str)) {
                    gkVar.mo43016q().f61832h.mo43170a("Invalid default event parameter name. Name", str);
                } else if (a2 == null) {
                    a.remove(str);
                } else if (gkVar.mo43014o().mo43537a("param", str, 100, a2)) {
                    gkVar.mo43014o().mo43525a(a, str, a2);
                }
            }
            gkVar.mo43014o();
            if (C26510jz.m52392a(a, gkVar.mo43018s().mo43639d())) {
                gkVar.mo43014o().mo43522a(26, (String) null, (String) null, 0);
                gkVar.mo43016q().f61832h.mo43169a("Too many default event parameters set. Discarding beyond event parameter limit");
            }
            gkVar.mo43017r().f61925y.mo43204a(a);
            gkVar.mo43006g().mo43387a(a);
        }
    }

    /* renamed from: a */
    private static Object m51984a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }
}
