package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.AbstractC25357i;
import com.google.android.gms.common.api.AbstractC25478k;
import com.google.android.gms.common.api.C25480l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C25450f;
import com.google.android.gms.common.p1936a.C25334a;

/* renamed from: com.google.android.gms.auth.api.signin.internal.i */
public final class C25309i {

    /* renamed from: a */
    public static C25334a f60056a = new C25334a("GoogleSignInCommon");

    static {
        Covode.recordClassIndex(30699);
    }

    /* renamed from: a */
    public static void m48667a(Context context) {
        C25316p.m48677a(context).mo41422a();
        for (AbstractC25357i iVar : AbstractC25357i.m48756a()) {
            iVar.mo41530d();
        }
        C25450f.m49080b();
    }

    /* renamed from: a */
    public static Intent m48665a(Context context, GoogleSignInOptions googleSignInOptions) {
        f60056a.mo41461a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    /* renamed from: a */
    public static AbstractC25478k<Status> m48666a(AbstractC25357i iVar, Context context, boolean z) {
        f60056a.mo41461a("Signing out", new Object[0]);
        m48667a(context);
        if (z) {
            return C25480l.m49160a(Status.f60100a, iVar);
        }
        return iVar.mo41526b(new C25310j(iVar));
    }
}
