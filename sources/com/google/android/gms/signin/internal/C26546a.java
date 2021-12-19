package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.system.p1357b.p1358a.p1360b.C18871a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.C25302b;
import com.google.android.gms.common.api.AbstractC25357i;
import com.google.android.gms.common.internal.AbstractC25526c;
import com.google.android.gms.common.internal.AbstractC25544g;
import com.google.android.gms.common.internal.AbstractC25551l;
import com.google.android.gms.common.internal.C25539d;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.AbstractC26544d;

/* renamed from: com.google.android.gms.signin.internal.a */
public final class C26546a extends AbstractC25544g<AbstractC26550e> implements AbstractC26544d {

    /* renamed from: a */
    private final boolean f62643a;

    /* renamed from: s */
    private final C25539d f62644s;

    /* renamed from: t */
    private final Bundle f62645t;

    /* renamed from: u */
    private Integer f62646u;

    static {
        Covode.recordClassIndex(31974);
    }

    @Override // com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: a */
    public final String mo41412a() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: b */
    public final String mo41413b() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC25544g, com.google.android.gms.common.api.C25335a.AbstractC25343f, com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: e */
    public final int mo41416e() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.api.C25335a.AbstractC25343f, com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: i */
    public final boolean mo41787i() {
        return this.f62643a;
    }

    @Override // com.google.android.gms.signin.AbstractC26544d
    /* renamed from: u */
    public final void mo43683u() {
        try {
            ((AbstractC26550e) mo41794q()).mo43687a(this.f62646u.intValue());
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.signin.AbstractC26544d
    /* renamed from: v */
    public final void mo43684v() {
        mo41779a(new AbstractC25526c.C25530d());
    }

    @Override // com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: p */
    public final Bundle mo41793p() {
        if (!this.f60548d.getPackageName().equals(this.f62644s.f60591g)) {
            this.f62645t.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f62644s.f60591g);
        }
        return this.f62645t;
    }

    @Override // com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: a */
    public final /* synthetic */ IInterface mo41411a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof AbstractC26550e) {
            return queryLocalInterface;
        }
        return new C26552g(iBinder);
    }

    @Override // com.google.android.gms.signin.AbstractC26544d
    /* renamed from: a */
    public final void mo43682a(AbstractC26548c cVar) {
        Account account;
        C25565r.m49315a(cVar, "Expecting a valid ISignInCallbacks");
        try {
            C25539d dVar = this.f62644s;
            if (dVar.f60585a != null) {
                account = dVar.f60585a;
            } else {
                account = new Account("<<default account>>", C18871a.f44691d);
            }
            GoogleSignInAccount googleSignInAccount = null;
            if ("<<default account>>".equals(account.name)) {
                googleSignInAccount = C25302b.m48642a(this.f60548d).mo41400a();
            }
            ((AbstractC26550e) mo41794q()).mo43689a(new zai(new ResolveAccountRequest(account, this.f62646u.intValue(), googleSignInAccount)), cVar);
        } catch (RemoteException e) {
            try {
                cVar.mo41580a(new zak());
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // com.google.android.gms.signin.AbstractC26544d
    /* renamed from: a */
    public final void mo43681a(AbstractC25551l lVar, boolean z) {
        try {
            ((AbstractC26550e) mo41794q()).mo43688a(lVar, this.f62646u.intValue(), z);
        } catch (RemoteException unused) {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26546a(android.content.Context r9, android.os.Looper r10, com.google.android.gms.common.internal.C25539d r11, com.google.android.gms.common.api.AbstractC25357i.AbstractC25359b r12, com.google.android.gms.common.api.AbstractC25357i.AbstractC25360c r13) {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.signin.internal.C26546a.<init>(android.content.Context, android.os.Looper, com.google.android.gms.common.internal.d, com.google.android.gms.common.api.i$b, com.google.android.gms.common.api.i$c):void");
    }

    private C26546a(Context context, Looper looper, C25539d dVar, Bundle bundle, AbstractC25357i.AbstractC25359b bVar, AbstractC25357i.AbstractC25360c cVar) {
        super(context, looper, 44, dVar, bVar, cVar);
        this.f62643a = true;
        this.f62644s = dVar;
        this.f62645t = bundle;
        this.f62646u = dVar.f60595k;
    }
}
