package com.facebook.p1904k.p1905a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

/* renamed from: com.facebook.k.a.a */
public interface AbstractC24812a extends IInterface {

    /* renamed from: com.facebook.k.a.a$a */
    public static abstract class AbstractBinderC24813a extends Binder implements AbstractC24812a {
        static {
            Covode.recordClassIndex(28984);
        }

        /* renamed from: com.facebook.k.a.a$a$a */
        public static class C24814a implements AbstractC24812a {

            /* renamed from: a */
            public static AbstractC24812a f58874a;

            /* renamed from: b */
            private IBinder f58875b;

            static {
                Covode.recordClassIndex(28985);
            }

            public final IBinder asBinder() {
                return this.f58875b;
            }

            public C24814a(IBinder iBinder) {
                this.f58875b = iBinder;
            }

            @Override // com.facebook.p1904k.p1905a.AbstractC24812a
            /* renamed from: a */
            public final int mo40625a(Bundle bundle) {
                AbstractC24812a aVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f58875b.transact(1, obtain, obtain2, 0) && (aVar = f58874a) != null) {
                        return aVar.mo40625a(bundle);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            Bundle bundle;
            if (i == 1) {
                parcel.enforceInterface("com.facebook.ppml.receiver.IReceiverService");
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                } else {
                    bundle = null;
                }
                int a = mo40625a(bundle);
                parcel2.writeNoException();
                parcel2.writeInt(a);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.facebook.ppml.receiver.IReceiverService");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(28983);
    }

    /* renamed from: a */
    int mo40625a(Bundle bundle);
}
