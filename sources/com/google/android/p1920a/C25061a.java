package com.google.android.p1920a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.a.a */
public class C25061a implements IInterface {

    /* renamed from: a */
    private final IBinder f59441a;

    /* renamed from: b */
    private final String f59442b = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    static {
        Covode.recordClassIndex(30425);
    }

    public C25061a(IBinder iBinder) {
        this.f59441a = iBinder;
    }

    public final IBinder asBinder() {
        return this.f59441a;
    }

    /* renamed from: a */
    public final Parcel mo40976a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f59442b);
        return obtain;
    }

    /* renamed from: a */
    public final Parcel mo40977a(Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f59441a.transact(1, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
