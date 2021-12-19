package com.google.android.play.core.p1963b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.play.core.b.br */
public class C26927br implements IInterface {

    /* renamed from: a */
    private final IBinder f63815a;

    /* renamed from: b */
    private final String f63816b;

    static {
        Covode.recordClassIndex(32402);
    }

    protected C26927br(IBinder iBinder, String str) {
        this.f63815a = iBinder;
        this.f63816b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo44630a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f63816b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo44631a(int i, Parcel parcel) {
        try {
            this.f63815a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f63815a;
    }
}
