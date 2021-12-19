package com.google.android.gms.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.AbstractC25517aj;
import com.google.android.gms.common.internal.C25518ak;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C25569b;
import com.google.android.gms.p1934b.AbstractC25324a;
import com.google.android.gms.p1934b.BinderC25327b;

public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new C25617v();

    /* renamed from: a */
    private final String f60737a;

    /* renamed from: b */
    private final AbstractBinderC25582n f60738b;

    /* renamed from: c */
    private final boolean f60739c;

    /* renamed from: d */
    private final boolean f60740d;

    static {
        Covode.recordClassIndex(31029);
    }

    /* renamed from: a */
    private static AbstractBinderC25582n m49452a(IBinder iBinder) {
        AbstractC25517aj akVar;
        byte[] bArr;
        if (iBinder == null) {
            return null;
        }
        try {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
            if (queryLocalInterface instanceof AbstractC25517aj) {
                akVar = (AbstractC25517aj) queryLocalInterface;
            } else {
                akVar = new C25518ak(iBinder);
            }
            AbstractC25324a a = akVar.mo41767a();
            if (a == null || (bArr = (byte[]) BinderC25327b.m48695a(a)) == null) {
                return null;
            }
            return new BinderC25585q(bArr);
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        MethodCollector.m26663i(9440);
        int a = C25569b.m49347a(parcel, 20293);
        C25569b.m49353a(parcel, 1, this.f60737a);
        AbstractBinderC25582n nVar = this.f60738b;
        if (nVar == null) {
            asBinder = null;
        } else {
            asBinder = nVar.asBinder();
        }
        C25569b.m49351a(parcel, 2, asBinder);
        C25569b.m49355a(parcel, 3, this.f60739c);
        C25569b.m49355a(parcel, 4, this.f60740d);
        C25569b.m49359b(parcel, a);
        MethodCollector.m26664o(9440);
    }

    zzj(String str, IBinder iBinder, boolean z, boolean z2) {
        this.f60737a = str;
        this.f60738b = m49452a(iBinder);
        this.f60739c = z;
        this.f60740d = z2;
    }

    zzj(String str, AbstractBinderC25582n nVar, boolean z, boolean z2) {
        this.f60737a = str;
        this.f60738b = nVar;
        this.f60739c = z;
        this.f60740d = z2;
    }
}
