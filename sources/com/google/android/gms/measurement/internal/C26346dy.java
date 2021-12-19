package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.AbstractC25526c;

/* renamed from: com.google.android.gms.measurement.internal.dy */
public final class C26346dy extends AbstractC25526c<AbstractC26341dt> {
    static {
        Covode.recordClassIndex(31768);
    }

    @Override // com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: a */
    public final String mo41412a() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: b */
    public final String mo41413b() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: e */
    public final int mo41416e() {
        return 12451000;
    }

    /* Return type fixed from 'android.os.IInterface' to match base method */
    @Override // com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: a */
    public final /* synthetic */ AbstractC26341dt mo41411a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof AbstractC26341dt) {
            return queryLocalInterface;
        }
        return new C26343dv(iBinder);
    }

    public C26346dy(Context context, Looper looper, AbstractC25526c.AbstractC25527a aVar, AbstractC25526c.AbstractC25528b bVar) {
        super(context, looper, aVar, bVar);
    }
}
