package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.zzj;
import com.google.android.gms.internal.p1946e.C25729b;
import com.google.android.gms.internal.p1946e.C25730c;
import com.google.android.gms.p1934b.AbstractC25324a;

/* renamed from: com.google.android.gms.common.internal.ao */
public final class C25522ao extends C25729b implements AbstractC25521an {
    static {
        Covode.recordClassIndex(30925);
    }

    public C25522ao(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
        MethodCollector.m26663i(8840);
        MethodCollector.m26664o(8840);
    }

    @Override // com.google.android.gms.common.internal.AbstractC25521an
    /* renamed from: a */
    public final boolean mo41773a(zzj zzj, AbstractC25324a aVar) {
        boolean z;
        MethodCollector.m26663i(8990);
        Parcel c = mo41963c();
        C25730c.m49684a(c, zzj);
        C25730c.m49683a(c, aVar);
        Parcel a = mo41960a(5, c);
        if (a.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        a.recycle();
        MethodCollector.m26664o(8990);
        return z;
    }
}
