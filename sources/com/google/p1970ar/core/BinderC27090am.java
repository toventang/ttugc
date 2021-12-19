package com.google.p1970ar.core;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.p1914a.p1916b.p1917a.p1918a.p1919a.AbstractBinderC25059c;
import com.google.p1970ar.core.ArCoreApk;

/* renamed from: com.google.ar.core.am */
final class BinderC27090am extends AbstractBinderC25059c {

    /* renamed from: a */
    final /* synthetic */ RunnableC27091an f64102a;

    static {
        Covode.recordClassIndex(32639);
    }

    @Override // com.google.p1914a.p1916b.p1917a.p1918a.p1919a.AbstractC25060d
    /* renamed from: a */
    public final void mo40974a(Bundle bundle) {
    }

    BinderC27090am(RunnableC27091an anVar) {
        this.f64102a = anVar;
    }

    @Override // com.google.p1914a.p1916b.p1917a.p1918a.p1919a.AbstractC25060d
    /* renamed from: b */
    public final void mo40975b(Bundle bundle) {
        int i = bundle.getInt("error.code", -100);
        if (i == -5) {
            this.f64102a.f64104b.mo45119a(ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE);
        } else if (i == -3) {
            this.f64102a.f64104b.mo45119a(ArCoreApk.Availability.UNKNOWN_ERROR);
        } else if (i != 0) {
            this.f64102a.f64104b.mo45119a(ArCoreApk.Availability.UNKNOWN_ERROR);
        } else {
            this.f64102a.f64104b.mo45119a(ArCoreApk.Availability.SUPPORTED_NOT_INSTALLED);
        }
    }
}
