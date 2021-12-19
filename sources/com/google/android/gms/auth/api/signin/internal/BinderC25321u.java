package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.AbstractC25357i;
import com.google.android.gms.common.internal.C25562q;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.util.C25612n;

/* renamed from: com.google.android.gms.auth.api.signin.internal.u */
public final class BinderC25321u extends AbstractBinderC25318r {

    /* renamed from: a */
    private final Context f60063a;

    static {
        Covode.recordClassIndex(30711);
    }

    @Override // com.google.android.gms.auth.api.signin.internal.AbstractC25315o
    /* renamed from: b */
    public final void mo41421b() {
        m48688c();
        C25316p.m48677a(this.f60063a).mo41422a();
    }

    /* renamed from: c */
    private final void m48688c() {
        if (!C25612n.m49429a(this.f60063a, Binder.getCallingUid())) {
            throw new SecurityException(new StringBuilder(52).append("Calling UID ").append(Binder.getCallingUid()).append(" is not Google Play services.").toString());
        }
    }

    @Override // com.google.android.gms.auth.api.signin.internal.AbstractC25315o
    /* renamed from: a */
    public final void mo41420a() {
        boolean z;
        m48688c();
        C25302b a = C25302b.m48642a(this.f60063a);
        GoogleSignInAccount a2 = a.mo41400a();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f60003f;
        if (a2 != null) {
            googleSignInOptions = a.mo41403b();
        }
        GoogleSignInClient googleSignInClient = new GoogleSignInClient(this.f60063a, (GoogleSignInOptions) C25565r.m49314a(googleSignInOptions));
        if (a2 != null) {
            googleSignInClient.mo41367b();
            return;
        }
        AbstractC25357i iVar = googleSignInClient.f60124g;
        Context context = googleSignInClient.f60118a;
        if (googleSignInClient.mo41298a() == GoogleSignInClient.C25290a.f59995c) {
            z = true;
        } else {
            z = false;
        }
        C25562q.m49310a(C25309i.m48666a(iVar, context, z));
    }

    public BinderC25321u(Context context) {
        this.f60063a = context;
    }
}
