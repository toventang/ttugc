package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.AbstractC25551l;
import com.google.android.gms.internal.p1945d.C25722b;
import com.google.android.gms.internal.p1945d.C25723c;

/* renamed from: com.google.android.gms.signin.internal.g */
public final class C26552g extends C25722b implements AbstractC26550e {
    static {
        Covode.recordClassIndex(31980);
    }

    C26552g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
        MethodCollector.m26663i(8346);
        MethodCollector.m26664o(8346);
    }

    @Override // com.google.android.gms.signin.internal.AbstractC26550e
    /* renamed from: a */
    public final void mo43687a(int i) {
        MethodCollector.m26663i(8347);
        Parcel a = mo41953a();
        a.writeInt(i);
        mo41954a(7, a);
        MethodCollector.m26664o(8347);
    }

    @Override // com.google.android.gms.signin.internal.AbstractC26550e
    /* renamed from: a */
    public final void mo43689a(zai zai, AbstractC26548c cVar) {
        MethodCollector.m26663i(8500);
        Parcel a = mo41953a();
        a.writeInt(1);
        zai.writeToParcel(a, 0);
        C25723c.m49675a(a, cVar);
        mo41954a(12, a);
        MethodCollector.m26664o(8500);
    }

    @Override // com.google.android.gms.signin.internal.AbstractC26550e
    /* renamed from: a */
    public final void mo43688a(AbstractC25551l lVar, int i, boolean z) {
        MethodCollector.m26663i(8499);
        Parcel a = mo41953a();
        C25723c.m49675a(a, lVar);
        a.writeInt(i);
        a.writeInt(z ? 1 : 0);
        mo41954a(9, a);
        MethodCollector.m26664o(8499);
    }
}
