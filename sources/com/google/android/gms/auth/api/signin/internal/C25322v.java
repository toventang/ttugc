package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.p1942authapi.C25694p;
import com.google.android.gms.internal.p1942authapi.C25695q;

/* renamed from: com.google.android.gms.auth.api.signin.internal.v */
public final class C25322v extends C25694p implements AbstractC25319s {
    static {
        Covode.recordClassIndex(30712);
    }

    C25322v(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
        MethodCollector.m26663i(11842);
        MethodCollector.m26664o(11842);
    }

    @Override // com.google.android.gms.auth.api.signin.internal.AbstractC25319s
    /* renamed from: a */
    public final void mo41425a(AbstractC25317q qVar, GoogleSignInOptions googleSignInOptions) {
        MethodCollector.m26663i(11843);
        Parcel a = mo41936a();
        C25695q.m49623a(a, qVar);
        C25695q.m49624a(a, googleSignInOptions);
        mo41937a(102, a);
        MethodCollector.m26664o(11843);
    }

    @Override // com.google.android.gms.auth.api.signin.internal.AbstractC25319s
    /* renamed from: b */
    public final void mo41426b(AbstractC25317q qVar, GoogleSignInOptions googleSignInOptions) {
        MethodCollector.m26663i(11844);
        Parcel a = mo41936a();
        C25695q.m49623a(a, qVar);
        C25695q.m49624a(a, googleSignInOptions);
        mo41937a(103, a);
        MethodCollector.m26664o(11844);
    }
}
