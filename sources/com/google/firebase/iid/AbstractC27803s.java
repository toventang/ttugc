package com.google.firebase.iid;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.firebase.iid.s */
interface AbstractC27803s extends IInterface {
    static {
        Covode.recordClassIndex(33391);
    }

    /* renamed from: a */
    void mo46449a(Message message);

    /* renamed from: com.google.firebase.iid.s$a */
    public static class C27804a implements AbstractC27803s {

        /* renamed from: a */
        private final IBinder f65320a;

        static {
            Covode.recordClassIndex(33392);
        }

        public final IBinder asBinder() {
            return this.f65320a;
        }

        C27804a(IBinder iBinder) {
            this.f65320a = iBinder;
        }

        @Override // com.google.firebase.iid.AbstractC27803s
        /* renamed from: a */
        public final void mo46449a(Message message) {
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
            obtain.writeInt(1);
            message.writeToParcel(obtain, 0);
            try {
                this.f65320a.transact(1, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        }
    }
}
