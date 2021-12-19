package com.google.android.gms.measurement.internal;

import android.content.Intent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.measurement.internal.iv */
public final /* synthetic */ class RunnableC26478iv implements Runnable {

    /* renamed from: a */
    private final C26479iw f62307a;

    /* renamed from: b */
    private final int f62308b;

    /* renamed from: c */
    private final C26350eb f62309c;

    /* renamed from: d */
    private final Intent f62310d;

    static {
        Covode.recordClassIndex(31900);
    }

    public RunnableC26478iv(C26479iw iwVar, int i, C26350eb ebVar, Intent intent) {
        this.f62307a = iwVar;
        this.f62308b = i;
        this.f62309c = ebVar;
        this.f62310d = intent;
    }

    public final void run() {
        C26479iw iwVar = this.f62307a;
        int i = this.f62308b;
        C26350eb ebVar = this.f62309c;
        Intent intent = this.f62310d;
        if (iwVar.f62311a.mo42976a(i)) {
            ebVar.f61835k.mo43170a("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            iwVar.mo43435c().f61835k.mo43169a("Completed wakeful intent.");
            iwVar.f62311a.mo42975a(intent);
        }
    }
}
