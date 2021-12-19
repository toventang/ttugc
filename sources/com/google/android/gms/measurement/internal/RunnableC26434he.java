package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.he */
public final class RunnableC26434he implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C26413gk f62168a;

    static {
        Covode.recordClassIndex(31856);
    }

    public final void run() {
        C26516ke keVar = this.f62168a.f62101b;
        keVar.f62415a.mo43015p().mo43002c();
        if (keVar.mo43621b()) {
            if (keVar.mo43620a()) {
                keVar.f62415a.mo43253b().f61923w.mo43214a(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1);
                keVar.f62415a.mo43255d().mo43305a("auto", "_cmpx", bundle);
            } else {
                String a = keVar.f62415a.mo43253b().f61923w.mo43213a();
                if (TextUtils.isEmpty(a)) {
                    keVar.f62415a.mo43016q().f61828d.mo43169a("Cache still valid but referrer not found");
                } else {
                    long a2 = ((keVar.f62415a.mo43253b().f61924x.mo43209a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(a);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String str : parse.getQueryParameterNames()) {
                        bundle2.putString(str, parse.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", a2);
                    keVar.f62415a.mo43255d().mo43305a((String) pair.first, "_cmp", (Bundle) pair.second);
                }
                keVar.f62415a.mo43253b().f61923w.mo43214a(null);
            }
            keVar.f62415a.mo43253b().f61924x.mo43210a(0);
        }
    }

    RunnableC26434he(C26413gk gkVar) {
        this.f62168a = gkVar;
    }
}
