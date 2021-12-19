package com.google.android.gms.internal.p1942authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.auth-api.p */
public class C25694p implements IInterface {

    /* renamed from: a */
    private final IBinder f60831a;

    /* renamed from: b */
    private final String f60832b;

    static {
        Covode.recordClassIndex(31108);
    }

    public IBinder asBinder() {
        return this.f60831a;
    }

    /* renamed from: a */
    public final Parcel mo41936a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f60832b);
        return obtain;
    }

    public C25694p(IBinder iBinder, String str) {
        this.f60831a = iBinder;
        this.f60832b = str;
    }

    /* renamed from: a */
    public final void mo41937a(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f60831a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
