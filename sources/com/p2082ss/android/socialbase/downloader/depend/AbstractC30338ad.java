package com.p2082ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.socialbase.downloader.depend.ad */
public interface AbstractC30338ad extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.depend.ad$a */
    public static abstract class AbstractBinderC30339a extends Binder implements AbstractC30338ad {
        static {
            Covode.recordClassIndex(36854);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.ss.android.socialbase.downloader.depend.ad$a$a */
        public static class C30340a implements AbstractC30338ad {

            /* renamed from: a */
            public static AbstractC30338ad f72360a;

            /* renamed from: b */
            private IBinder f72361b;

            static {
                Covode.recordClassIndex(36855);
            }

            public final IBinder asBinder() {
                return this.f72361b;
            }

            public C30340a(IBinder iBinder) {
                this.f72361b = iBinder;
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30338ad
            /* renamed from: a */
            public final long mo53867a(int i, int i2) {
                AbstractC30338ad adVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (!this.f72361b.transact(1, obtain, obtain2, 0) && (adVar = f72360a) != null) {
                        return adVar.mo53867a(i, i2);
                    }
                    obtain2.readException();
                    long readLong = obtain2.readLong();
                    obtain2.recycle();
                    obtain.recycle();
                    return readLong;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC30339a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
                long a = mo53867a(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeLong(a);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(36853);
    }

    /* renamed from: a */
    long mo53867a(int i, int i2);
}
