package com.google.android.gms.internal.p1942authapi;

import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.common.api.internal.AbstractC25455h;

/* renamed from: com.google.android.gms.internal.auth-api.d */
public final class C25682d extends C25694p implements AbstractC25681c {
    static {
        Covode.recordClassIndex(31096);
    }

    C25682d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
        MethodCollector.m26663i(11838);
        MethodCollector.m26664o(11838);
    }

    @Override // com.google.android.gms.internal.p1942authapi.AbstractC25681c
    /* renamed from: a */
    public final void mo41932a(AbstractC25455h hVar, String str) {
        MethodCollector.m26663i(11840);
        Parcel a = mo41936a();
        C25695q.m49623a(a, hVar);
        a.writeString(str);
        mo41937a(2, a);
        MethodCollector.m26664o(11840);
    }

    @Override // com.google.android.gms.internal.p1942authapi.AbstractC25681c
    /* renamed from: a */
    public final void mo41933a(AbstractC25674a aVar, BeginSignInRequest beginSignInRequest) {
        MethodCollector.m26663i(11839);
        Parcel a = mo41936a();
        C25695q.m49623a(a, aVar);
        C25695q.m49624a(a, beginSignInRequest);
        mo41937a(1, a);
        MethodCollector.m26664o(11839);
    }
}
