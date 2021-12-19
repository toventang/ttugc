package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.AbstractC25357i;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC25544g;
import com.google.android.gms.common.internal.C25539d;
import com.google.android.gms.internal.p1942authapi.C25692n;

/* renamed from: com.google.android.gms.auth.api.signin.internal.g */
public final class C25307g extends AbstractC25544g<AbstractC25319s> {

    /* renamed from: a */
    public final GoogleSignInOptions f60055a;

    static {
        Covode.recordClassIndex(30697);
    }

    @Override // com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: a */
    public final String mo41412a() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: b */
    public final String mo41413b() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.api.C25335a.AbstractC25343f, com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: c */
    public final boolean mo41414c() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC25544g, com.google.android.gms.common.api.C25335a.AbstractC25343f, com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: e */
    public final int mo41416e() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.api.C25335a.AbstractC25343f, com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: d */
    public final Intent mo41415d() {
        return C25309i.m48665a(this.f60548d, this.f60055a);
    }

    @Override // com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: a */
    public final /* synthetic */ IInterface mo41411a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof AbstractC25319s) {
            return queryLocalInterface;
        }
        return new C25322v(iBinder);
    }

    public C25307g(Context context, Looper looper, C25539d dVar, GoogleSignInOptions googleSignInOptions, AbstractC25357i.AbstractC25359b bVar, AbstractC25357i.AbstractC25360c cVar) {
        super(context, looper, 91, dVar, bVar, cVar);
        GoogleSignInOptions.C25292a aVar;
        if (googleSignInOptions != null) {
            aVar = new GoogleSignInOptions.C25292a(googleSignInOptions);
        } else {
            aVar = new GoogleSignInOptions.C25292a();
        }
        aVar.f60022f = C25692n.m49618a();
        if (!dVar.f60587c.isEmpty()) {
            for (Scope scope : dVar.f60587c) {
                aVar.mo41375a(scope, new Scope[0]);
            }
        }
        this.f60055a = aVar.mo41378c();
    }
}
