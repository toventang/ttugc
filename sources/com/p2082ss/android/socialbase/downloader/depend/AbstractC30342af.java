package com.p2082ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.socialbase.downloader.depend.af */
public interface AbstractC30342af extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.depend.af$a */
    public static abstract class AbstractBinderC30343a extends Binder implements AbstractC30342af {
        static {
            Covode.recordClassIndex(36858);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.ss.android.socialbase.downloader.depend.af$a$a */
        public static class C30344a implements AbstractC30342af {

            /* renamed from: a */
            public static AbstractC30342af f72362a;

            /* renamed from: b */
            private IBinder f72363b;

            static {
                Covode.recordClassIndex(36859);
            }

            public final IBinder asBinder() {
                return this.f72363b;
            }

            public C30344a(IBinder iBinder) {
                this.f72363b = iBinder;
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30342af
            /* renamed from: a */
            public final void mo53873a(int i, int i2) {
                AbstractC30342af afVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (this.f72363b.transact(1, obtain, obtain2, 0) || (afVar = f72362a) == null) {
                        obtain2.readException();
                    } else {
                        afVar.mo53873a(i, i2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC30343a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
                mo53873a(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(36857);
    }

    /* renamed from: a */
    void mo53873a(int i, int i2);
}
