package com.benchmark;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.benchmark.AbstractC2468d;
import com.bytedance.covode.number.Covode;

/* renamed from: com.benchmark.c */
public interface AbstractC2432c extends IInterface {

    /* renamed from: com.benchmark.c$a */
    public static abstract class AbstractBinderC2433a extends Binder implements AbstractC2432c {
        static {
            Covode.recordClassIndex(2786);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.benchmark.c$a$a */
        public static class C2434a implements AbstractC2432c {

            /* renamed from: a */
            private IBinder f7316a;

            static {
                Covode.recordClassIndex(2787);
            }

            public final IBinder asBinder() {
                return this.f7316a;
            }

            @Override // com.benchmark.AbstractC2432c
            /* renamed from: a */
            public final void mo6798a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.benchmark.IBTCManager");
                    this.f7316a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C2434a(IBinder iBinder) {
                this.f7316a = iBinder;
            }

            @Override // com.benchmark.AbstractC2432c
            /* renamed from: a */
            public final void mo6799a(int i, String str, String str2, AbstractC2468d dVar) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.benchmark.IBTCManager");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (dVar != null) {
                        iBinder = dVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f7316a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC2433a() {
            attachInterface(this, "com.benchmark.IBTCManager");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            AbstractC2468d aVar;
            if (i == 1) {
                parcel.enforceInterface("com.benchmark.IBTCManager");
                int readInt = parcel.readInt();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    aVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.benchmark.IByteBenchCallback");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC2468d)) {
                        aVar = new AbstractC2468d.AbstractBinderC2469a.C2470a(readStrongBinder);
                    } else {
                        aVar = (AbstractC2468d) queryLocalInterface;
                    }
                }
                mo6799a(readInt, readString, readString2, aVar);
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.benchmark.IBTCManager");
                mo6798a();
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.benchmark.IBTCManager");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(2785);
    }

    /* renamed from: a */
    void mo6798a();

    /* renamed from: a */
    void mo6799a(int i, String str, String str2, AbstractC2468d dVar);
}
