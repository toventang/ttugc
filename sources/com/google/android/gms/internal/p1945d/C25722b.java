package com.google.android.gms.internal.p1945d;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.d.b */
public class C25722b implements IInterface {

    /* renamed from: a */
    private final IBinder f60849a;

    /* renamed from: b */
    private final String f60850b;

    static {
        Covode.recordClassIndex(31137);
    }

    public IBinder asBinder() {
        return this.f60849a;
    }

    /* renamed from: a */
    public final Parcel mo41953a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f60850b);
        return obtain;
    }

    public C25722b(IBinder iBinder, String str) {
        this.f60849a = iBinder;
        this.f60850b = str;
    }

    /* renamed from: a */
    public final void mo41954a(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f60849a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
