package com.google.android.gms.internal.p1946e;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.e.b */
public class C25729b implements IInterface {

    /* renamed from: a */
    private final IBinder f60854a;

    /* renamed from: b */
    private final String f60855b;

    static {
        Covode.recordClassIndex(31144);
    }

    public IBinder asBinder() {
        return this.f60854a;
    }

    /* renamed from: c */
    public final Parcel mo41963c() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f60855b);
        return obtain;
    }

    public C25729b(IBinder iBinder, String str) {
        this.f60854a = iBinder;
        this.f60855b = str;
    }

    /* renamed from: a */
    public final Parcel mo41960a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f60854a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: b */
    public final void mo41962b(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f60854a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
