package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC25551l;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.zak;

/* renamed from: com.google.android.gms.common.api.internal.am */
final class C25376am extends AbstractC25385av {

    /* renamed from: a */
    private final /* synthetic */ C25368ae f60208a;

    /* renamed from: b */
    private final /* synthetic */ zak f60209b;

    static {
        Covode.recordClassIndex(30775);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25385av
    /* renamed from: a */
    public final void mo41561a() {
        C25368ae aeVar = this.f60208a;
        zak zak = this.f60209b;
        if (aeVar.mo41573b(0)) {
            ConnectionResult connectionResult = zak.f62652a;
            if (connectionResult.mo41434b()) {
                ResolveAccountResponse resolveAccountResponse = zak.f62653b;
                ConnectionResult connectionResult2 = resolveAccountResponse.f60511b;
                if (!connectionResult2.mo41434b()) {
                    String valueOf = String.valueOf(connectionResult2);
                    Log.wtf("GACConnecting", new StringBuilder(String.valueOf(valueOf).length() + 48).append("Sign-in succeeded with resolve account failure: ").append(valueOf).toString(), new Exception());
                    aeVar.mo41570b(connectionResult2);
                    return;
                }
                aeVar.f60181g = true;
                aeVar.f60182h = AbstractC25551l.AbstractBinderC25552a.m49297a(resolveAccountResponse.f60510a);
                aeVar.f60183i = resolveAccountResponse.f60512c;
                aeVar.f60184j = resolveAccountResponse.f60513d;
                aeVar.mo41576e();
            } else if (aeVar.mo41568a(connectionResult)) {
                aeVar.mo41577f();
                aeVar.mo41576e();
            } else {
                aeVar.mo41570b(connectionResult);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C25376am(AbstractC25383at atVar, C25368ae aeVar, zak zak) {
        super(atVar);
        this.f60208a = aeVar;
        this.f60209b = zak;
    }
}
