package com.google.android.gms.internal.p1941a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.a.a */
public class C25671a implements IInterface {

    /* renamed from: a */
    private final IBinder f60811a;

    /* renamed from: b */
    private final String f60812b;

    static {
        Covode.recordClassIndex(31085);
    }

    protected C25671a(IBinder iBinder, String str) {
        this.f60811a = iBinder;
        this.f60812b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E_ */
    public final Parcel mo41919E_() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f60812b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo41920a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f60811a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f60811a;
    }
}
