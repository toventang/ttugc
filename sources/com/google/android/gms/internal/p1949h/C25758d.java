package com.google.android.gms.internal.p1949h;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.h.d */
public class C25758d implements IInterface {

    /* renamed from: a */
    private final IBinder f60876a;

    /* renamed from: b */
    private final String f60877b;

    static {
        Covode.recordClassIndex(31173);
    }

    public IBinder asBinder() {
        return this.f60876a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo41996a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f60877b);
        return obtain;
    }

    protected C25758d(IBinder iBinder, String str) {
        this.f60876a = iBinder;
        this.f60877b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo41997a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f60876a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
