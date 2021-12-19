package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import androidx.legacy.p061a.AbstractC1160a;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.measurement.internal.AbstractC26370ev;
import com.google.android.gms.measurement.internal.C26350eb;
import com.google.android.gms.measurement.internal.C26371ew;
import com.google.android.gms.measurement.internal.C26381ff;

public final class AppMeasurementReceiver extends AbstractC1160a implements AbstractC26370ev {

    /* renamed from: a */
    private C26371ew f61669a;

    static {
        Covode.recordClassIndex(31656);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26370ev
    /* renamed from: b */
    public final void mo42984b(Context context, Intent intent) {
        m3845a(context, intent);
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f61669a == null) {
            this.f61669a = new C26371ew(this);
        }
        C26371ew ewVar = this.f61669a;
        C26381ff a = C26381ff.m51900a(context, null, null);
        C26350eb q = a.mo43016q();
        if (intent == null) {
            q.f61830f.mo43169a("Receiver called with null intent");
            return;
        }
        a.mo43019t();
        String action = intent.getAction();
        q.f61835k.mo43170a("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            q.f61835k.mo43169a("Starting wakeful intent.");
            ewVar.f61957a.mo42984b(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            q.f61830f.mo43169a("Install Referrer Broadcasts are deprecated");
        }
    }
}
