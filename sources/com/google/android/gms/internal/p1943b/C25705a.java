package com.google.android.gms.internal.p1943b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.b.a */
public class C25705a implements IInterface {

    /* renamed from: a */
    private final IBinder f60842a;

    /* renamed from: b */
    private final String f60843b;

    static {
        Covode.recordClassIndex(31120);
    }

    protected C25705a(IBinder iBinder, String str) {
        this.f60842a = iBinder;
        this.f60843b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo41941a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f60843b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41942a(Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f60842a.transact(1, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f60842a;
    }
}
