package com.google.android.gms.internal.p1943b;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.AbstractC25357i;
import com.google.android.gms.common.internal.AbstractC25544g;
import com.google.android.gms.common.internal.C25539d;

/* renamed from: com.google.android.gms.internal.b.g */
public final class C25711g extends AbstractC25544g<AbstractC25707c> {
    static {
        Covode.recordClassIndex(31126);
    }

    public C25711g(Context context, Looper looper, C25539d dVar, AbstractC25357i.AbstractC25359b bVar, AbstractC25357i.AbstractC25360c cVar) {
        super(context, looper, 126, dVar, bVar, cVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: a */
    public final /* synthetic */ IInterface mo41411a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return queryLocalInterface instanceof AbstractC25707c ? queryLocalInterface : new C25708d(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: a */
    public final String mo41412a() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: b */
    public final String mo41413b() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC25544g, com.google.android.gms.common.api.C25335a.AbstractC25343f, com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: e */
    public final int mo41416e() {
        return 12451000;
    }
}
