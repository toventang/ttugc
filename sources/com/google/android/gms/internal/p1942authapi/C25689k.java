package com.google.android.gms.internal.p1942authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.identity.C25287f;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.AbstractC25449e;
import com.google.android.gms.common.api.internal.AbstractC25462m;
import com.google.android.gms.common.internal.AbstractC25544g;
import com.google.android.gms.common.internal.C25539d;

/* renamed from: com.google.android.gms.internal.auth-api.k */
public final class C25689k extends AbstractC25544g<AbstractC25681c> {

    /* renamed from: a */
    private final Bundle f60821a;

    static {
        Covode.recordClassIndex(31103);
    }

    @Override // com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: a */
    public final String mo41412a() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: b */
    public final String mo41413b() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC25544g, com.google.android.gms.common.api.C25335a.AbstractC25343f, com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: e */
    public final int mo41416e() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: t */
    public final boolean mo41797t() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: o */
    public final Feature[] mo41792o() {
        return C25690l.f60826e;
    }

    @Override // com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: p */
    public final Bundle mo41793p() {
        return this.f60821a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: a */
    public final /* synthetic */ IInterface mo41411a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        if (queryLocalInterface instanceof AbstractC25681c) {
            return queryLocalInterface;
        }
        return new C25682d(iBinder);
    }

    public C25689k(Context context, Looper looper, C25287f fVar, C25539d dVar, AbstractC25449e eVar, AbstractC25462m mVar) {
        super(context, looper, 212, dVar, eVar, mVar);
        Bundle bundle = new Bundle();
        bundle.putString("session_id", fVar.f59975a);
        this.f60821a = bundle;
    }
}
