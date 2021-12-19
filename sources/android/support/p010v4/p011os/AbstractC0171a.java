package android.support.p010v4.p011os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

/* renamed from: android.support.v4.os.a */
public interface AbstractC0171a extends IInterface {

    /* renamed from: android.support.v4.os.a$a */
    public static abstract class AbstractBinderC0172a extends Binder implements AbstractC0171a {
        static {
            Covode.recordClassIndex(196);
        }

        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: android.support.v4.os.a$a$a */
        public static class C0173a implements AbstractC0171a {

            /* renamed from: a */
            public static AbstractC0171a f464a;

            /* renamed from: b */
            private IBinder f465b;

            static {
                Covode.recordClassIndex(197);
            }

            public final IBinder asBinder() {
                return this.f465b;
            }

            C0173a(IBinder iBinder) {
                this.f465b = iBinder;
            }

            @Override // android.support.p010v4.p011os.AbstractC0171a
            /* renamed from: a */
            public final void mo331a(int i, Bundle bundle) {
                AbstractC0171a aVar;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f465b.transact(1, obtain, null, 1) || (aVar = f464a) == null) {
                        obtain.recycle();
                    } else {
                        aVar.mo331a(i, bundle);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0172a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            Bundle bundle;
            if (i == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                int readInt = parcel.readInt();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                } else {
                    bundle = null;
                }
                mo331a(readInt, bundle);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(195);
    }

    /* renamed from: a */
    void mo331a(int i, Bundle bundle);
}
