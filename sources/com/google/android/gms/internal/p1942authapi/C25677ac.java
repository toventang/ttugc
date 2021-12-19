package com.google.android.gms.internal.p1942authapi;

import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

/* renamed from: com.google.android.gms.internal.auth-api.ac */
public final class C25677ac extends C25694p implements AbstractC25678ad {
    static {
        Covode.recordClassIndex(31091);
    }

    C25677ac(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        MethodCollector.m26663i(11352);
        MethodCollector.m26664o(11352);
    }

    @Override // com.google.android.gms.internal.p1942authapi.AbstractC25678ad
    /* renamed from: a */
    public final void mo41928a(AbstractC25676ab abVar, CredentialRequest credentialRequest) {
        MethodCollector.m26663i(11353);
        Parcel a = mo41936a();
        C25695q.m49623a(a, abVar);
        C25695q.m49624a(a, credentialRequest);
        mo41937a(1, a);
        MethodCollector.m26664o(11353);
    }

    @Override // com.google.android.gms.internal.p1942authapi.AbstractC25678ad
    /* renamed from: a */
    public final void mo41929a(AbstractC25676ab abVar, zzz zzz) {
        MethodCollector.m26663i(11510);
        Parcel a = mo41936a();
        C25695q.m49623a(a, abVar);
        C25695q.m49624a(a, zzz);
        mo41937a(2, a);
        MethodCollector.m26664o(11510);
    }
}
