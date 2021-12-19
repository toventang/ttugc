package com.google.android.gms.internal.p1942authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.C25253a;
import com.google.android.gms.common.api.AbstractC25357i;
import com.google.android.gms.common.internal.AbstractC25544g;
import com.google.android.gms.common.internal.C25539d;

/* renamed from: com.google.android.gms.internal.auth-api.z */
public final class C25704z extends AbstractC25544g<AbstractC25678ad> {

    /* renamed from: a */
    public final C25253a.C25254a f60840a;

    static {
        Covode.recordClassIndex(31118);
    }

    @Override // com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: a */
    public final String mo41412a() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: b */
    public final String mo41413b() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC25544g, com.google.android.gms.common.api.C25335a.AbstractC25343f, com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: e */
    public final int mo41416e() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: p */
    public final Bundle mo41793p() {
        C25253a.C25254a aVar = this.f60840a;
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", aVar.f59876b);
        bundle.putBoolean("force_save_dialog", aVar.f59877c);
        bundle.putString("log_session_id", aVar.f59878d);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: a */
    public final /* synthetic */ IInterface mo41411a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof AbstractC25678ad) {
            return queryLocalInterface;
        }
        return new C25677ac(iBinder);
    }

    public C25704z(Context context, Looper looper, C25539d dVar, C25253a.C25254a aVar, AbstractC25357i.AbstractC25359b bVar, AbstractC25357i.AbstractC25360c cVar) {
        super(context, looper, 68, dVar, bVar, cVar);
        this.f60840a = new C25253a.C25254a.C25255a(aVar == null ? C25253a.C25254a.f59875a : aVar).mo41296a(C25692n.m49618a()).mo41297a();
    }
}
