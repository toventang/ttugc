package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.internal.p1946e.C25729b;
import com.google.android.gms.internal.p1946e.C25730c;
import com.google.android.gms.p1934b.AbstractC25324a;

/* renamed from: com.google.android.gms.dynamite.i */
public final class C25667i extends C25729b implements AbstractC25668j {
    static {
        Covode.recordClassIndex(31081);
    }

    @Override // com.google.android.gms.dynamite.AbstractC25668j
    /* renamed from: a */
    public final int mo41912a() {
        MethodCollector.m26663i(7373);
        Parcel a = mo41960a(6, mo41963c());
        int readInt = a.readInt();
        a.recycle();
        MethodCollector.m26664o(7373);
        return readInt;
    }

    C25667i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
        MethodCollector.m26663i(6781);
        MethodCollector.m26664o(6781);
    }

    @Override // com.google.android.gms.dynamite.AbstractC25668j
    /* renamed from: a */
    public final int mo41913a(AbstractC25324a aVar, String str, boolean z) {
        MethodCollector.m26663i(7083);
        Parcel c = mo41963c();
        C25730c.m49683a(c, aVar);
        c.writeString(str);
        C25730c.m49685a(c, z);
        Parcel a = mo41960a(3, c);
        int readInt = a.readInt();
        a.recycle();
        MethodCollector.m26664o(7083);
        return readInt;
    }

    @Override // com.google.android.gms.dynamite.AbstractC25668j
    /* renamed from: b */
    public final int mo41915b(AbstractC25324a aVar, String str, boolean z) {
        MethodCollector.m26663i(7232);
        Parcel c = mo41963c();
        C25730c.m49683a(c, aVar);
        c.writeString(str);
        C25730c.m49685a(c, z);
        Parcel a = mo41960a(5, c);
        int readInt = a.readInt();
        a.recycle();
        MethodCollector.m26664o(7232);
        return readInt;
    }

    @Override // com.google.android.gms.dynamite.AbstractC25668j
    /* renamed from: a */
    public final AbstractC25324a mo41914a(AbstractC25324a aVar, String str, int i) {
        MethodCollector.m26663i(6933);
        Parcel c = mo41963c();
        C25730c.m49683a(c, aVar);
        c.writeString(str);
        c.writeInt(i);
        Parcel a = mo41960a(2, c);
        AbstractC25324a a2 = AbstractC25324a.AbstractBinderC25325a.m48693a(a.readStrongBinder());
        a.recycle();
        MethodCollector.m26664o(6933);
        return a2;
    }

    @Override // com.google.android.gms.dynamite.AbstractC25668j
    /* renamed from: b */
    public final AbstractC25324a mo41916b(AbstractC25324a aVar, String str, int i) {
        MethodCollector.m26663i(7231);
        Parcel c = mo41963c();
        C25730c.m49683a(c, aVar);
        c.writeString(str);
        c.writeInt(i);
        Parcel a = mo41960a(4, c);
        AbstractC25324a a2 = AbstractC25324a.AbstractBinderC25325a.m48693a(a.readStrongBinder());
        a.recycle();
        MethodCollector.m26664o(7231);
        return a2;
    }
}
