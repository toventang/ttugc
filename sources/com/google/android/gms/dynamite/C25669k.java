package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.internal.p1946e.C25729b;
import com.google.android.gms.internal.p1946e.C25730c;
import com.google.android.gms.p1934b.AbstractC25324a;

/* renamed from: com.google.android.gms.dynamite.k */
public final class C25669k extends C25729b implements AbstractC25670l {
    static {
        Covode.recordClassIndex(31083);
    }

    C25669k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
        MethodCollector.m26663i(8664);
        MethodCollector.m26664o(8664);
    }

    @Override // com.google.android.gms.dynamite.AbstractC25670l
    /* renamed from: a */
    public final AbstractC25324a mo41917a(AbstractC25324a aVar, String str, int i, AbstractC25324a aVar2) {
        MethodCollector.m26663i(8814);
        Parcel c = mo41963c();
        C25730c.m49683a(c, aVar);
        c.writeString(str);
        c.writeInt(i);
        C25730c.m49683a(c, aVar2);
        Parcel a = mo41960a(2, c);
        AbstractC25324a a2 = AbstractC25324a.AbstractBinderC25325a.m48693a(a.readStrongBinder());
        a.recycle();
        MethodCollector.m26664o(8814);
        return a2;
    }

    @Override // com.google.android.gms.dynamite.AbstractC25670l
    /* renamed from: b */
    public final AbstractC25324a mo41918b(AbstractC25324a aVar, String str, int i, AbstractC25324a aVar2) {
        MethodCollector.m26663i(8964);
        Parcel c = mo41963c();
        C25730c.m49683a(c, aVar);
        c.writeString(str);
        c.writeInt(i);
        C25730c.m49683a(c, aVar2);
        Parcel a = mo41960a(3, c);
        AbstractC25324a a2 = AbstractC25324a.AbstractBinderC25325a.m48693a(a.readStrongBinder());
        a.recycle();
        MethodCollector.m26664o(8964);
        return a2;
    }
}
