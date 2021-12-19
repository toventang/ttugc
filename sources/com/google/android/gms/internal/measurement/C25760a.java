package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.a */
public class C25760a implements IInterface {

    /* renamed from: a */
    private final IBinder f60879a;

    /* renamed from: b */
    private final String f60880b;

    static {
        Covode.recordClassIndex(31175);
    }

    public IBinder asBinder() {
        return this.f60879a;
    }

    /* renamed from: F_ */
    public final Parcel mo41999F_() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f60880b);
        return obtain;
    }

    public C25760a(IBinder iBinder, String str) {
        this.f60879a = iBinder;
        this.f60880b = str;
    }

    /* renamed from: a */
    public final Parcel mo42000a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f60879a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: b */
    public final void mo42002b(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f60879a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
