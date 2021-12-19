package com.p2082ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.socialbase.downloader.depend.c */
public interface AbstractC30347c extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.depend.c$a */
    public static abstract class AbstractBinderC30348a extends Binder implements AbstractC30347c {
        static {
            Covode.recordClassIndex(36863);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.ss.android.socialbase.downloader.depend.c$a$a */
        public static class C30349a implements AbstractC30347c {

            /* renamed from: a */
            public static AbstractC30347c f72364a;

            /* renamed from: b */
            private IBinder f72365b;

            static {
                Covode.recordClassIndex(36864);
            }

            public final IBinder asBinder() {
                return this.f72365b;
            }

            public C30349a(IBinder iBinder) {
                this.f72365b = iBinder;
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30347c
            /* renamed from: a */
            public final int mo53879a(long j) {
                AbstractC30347c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator");
                    obtain.writeLong(j);
                    if (!this.f72365b.transact(1, obtain, obtain2, 0) && (cVar = f72364a) != null) {
                        return cVar.mo53879a(j);
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

        public AbstractBinderC30348a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator");
                int a = mo53879a(parcel.readLong());
                parcel2.writeNoException();
                parcel2.writeInt(a);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(36862);
    }

    /* renamed from: a */
    int mo53879a(long j);
}
