package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC25551l;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.zak;

/* renamed from: com.google.android.gms.common.api.internal.bt */
final class RunnableC25410bt implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zak f60290a;

    /* renamed from: b */
    private final /* synthetic */ BinderC25408br f60291b;

    static {
        Covode.recordClassIndex(30809);
    }

    public final void run() {
        BinderC25408br brVar = this.f60291b;
        zak zak = this.f60290a;
        ConnectionResult connectionResult = zak.f62652a;
        if (connectionResult.mo41434b()) {
            ResolveAccountResponse resolveAccountResponse = zak.f62653b;
            connectionResult = resolveAccountResponse.f60511b;
            if (!connectionResult.mo41434b()) {
                String valueOf = String.valueOf(connectionResult);
                Log.wtf("SignInCoordinator", new StringBuilder(String.valueOf(valueOf).length() + 48).append("Sign-in succeeded with resolve account failure: ").append(valueOf).toString(), new Exception());
            } else {
                brVar.f60285c.mo41628a(AbstractC25551l.AbstractBinderC25552a.m49297a(resolveAccountResponse.f60510a), brVar.f60283a);
                brVar.f60284b.mo41491f();
            }
        }
        brVar.f60285c.mo41629b(connectionResult);
        brVar.f60284b.mo41491f();
    }

    RunnableC25410bt(BinderC25408br brVar, zak zak) {
        this.f60291b = brVar;
        this.f60290a = zak;
    }
}
