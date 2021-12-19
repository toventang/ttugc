package com.google.p1914a.p1915a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.a.a.a */
public class C25054a implements IInterface {

    /* renamed from: a */
    private final IBinder f59439a;

    /* renamed from: b */
    private final String f59440b;

    static {
        Covode.recordClassIndex(30418);
    }

    public C25054a(IBinder iBinder, String str) {
        this.f59439a = iBinder;
        this.f59440b = str;
    }

    public final IBinder asBinder() {
        return this.f59439a;
    }

    /* renamed from: a */
    public final Parcel mo40965a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f59440b);
        return obtain;
    }

    /* renamed from: b */
    public final void mo40968b(int i, Parcel parcel) {
        try {
            this.f59439a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: a */
    public final Parcel mo40966a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f59439a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
