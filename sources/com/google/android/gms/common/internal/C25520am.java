package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.internal.p1946e.C25729b;
import com.google.android.gms.internal.p1946e.C25730c;

/* renamed from: com.google.android.gms.common.internal.am */
public final class C25520am extends C25729b implements AbstractC25555n {
    static {
        Covode.recordClassIndex(30923);
    }

    C25520am(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
        MethodCollector.m26663i(9297);
        MethodCollector.m26664o(9297);
    }

    @Override // com.google.android.gms.common.internal.AbstractC25555n
    /* renamed from: a */
    public final void mo41770a(int i, Bundle bundle) {
        MethodCollector.m26663i(9611);
        Parcel c = mo41963c();
        c.writeInt(i);
        C25730c.m49684a(c, bundle);
        mo41962b(2, c);
        MethodCollector.m26664o(9611);
    }

    @Override // com.google.android.gms.common.internal.AbstractC25555n
    /* renamed from: a */
    public final void mo41771a(int i, IBinder iBinder, Bundle bundle) {
        MethodCollector.m26663i(9453);
        Parcel c = mo41963c();
        c.writeInt(i);
        c.writeStrongBinder(iBinder);
        C25730c.m49684a(c, bundle);
        mo41962b(1, c);
        MethodCollector.m26664o(9453);
    }

    @Override // com.google.android.gms.common.internal.AbstractC25555n
    /* renamed from: a */
    public final void mo41772a(int i, IBinder iBinder, zza zza) {
        MethodCollector.m26663i(9613);
        Parcel c = mo41963c();
        c.writeInt(i);
        c.writeStrongBinder(iBinder);
        C25730c.m49684a(c, zza);
        mo41962b(3, c);
        MethodCollector.m26664o(9613);
    }
}
