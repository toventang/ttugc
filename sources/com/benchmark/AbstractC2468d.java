package com.benchmark;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

/* renamed from: com.benchmark.d */
public interface AbstractC2468d extends IInterface {

    /* renamed from: com.benchmark.d$a */
    public static abstract class AbstractBinderC2469a extends Binder implements AbstractC2468d {
        static {
            Covode.recordClassIndex(2824);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.benchmark.d$a$a */
        static class C2470a implements AbstractC2468d {

            /* renamed from: a */
            private IBinder f7411a;

            static {
                Covode.recordClassIndex(2825);
            }

            public final IBinder asBinder() {
                return this.f7411a;
            }

            C2470a(IBinder iBinder) {
                this.f7411a = iBinder;
            }

            @Override // com.benchmark.AbstractC2468d
            /* renamed from: a */
            public final void mo6844a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.benchmark.IByteBenchCallback");
                    obtain.writeString(str);
                    this.f7411a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.benchmark.AbstractC2468d
            /* renamed from: a */
            public final void mo6843a(int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.benchmark.IByteBenchCallback");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f7411a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.benchmark.AbstractC2468d
            /* renamed from: a */
            public final void mo6845a(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.benchmark.IByteBenchCallback");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f7411a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.benchmark.AbstractC2468d
            /* renamed from: a */
            public final void mo6842a(int i, int i2, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.benchmark.IByteBenchCallback");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    this.f7411a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC2469a() {
            attachInterface(this, "com.benchmark.IByteBenchCallback");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.benchmark.IByteBenchCallback");
                mo6844a(parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.benchmark.IByteBenchCallback");
                mo6845a(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("com.benchmark.IByteBenchCallback");
                mo6843a(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i == 4) {
                parcel.enforceInterface("com.benchmark.IByteBenchCallback");
                mo6842a(parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.benchmark.IByteBenchCallback");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(2823);
    }

    /* renamed from: a */
    void mo6842a(int i, int i2, String str);

    /* renamed from: a */
    void mo6843a(int i, String str);

    /* renamed from: a */
    void mo6844a(String str);

    /* renamed from: a */
    void mo6845a(String str, String str2);
}
