package com.p2082ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.socialbase.downloader.depend.l */
public interface AbstractC30370l extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.depend.l$a */
    public static abstract class AbstractBinderC30371a extends Binder implements AbstractC30370l {
        static {
            Covode.recordClassIndex(36886);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.ss.android.socialbase.downloader.depend.l$a$a */
        static class C30372a implements AbstractC30370l {

            /* renamed from: a */
            public static AbstractC30370l f72378a;

            /* renamed from: b */
            private IBinder f72379b;

            static {
                Covode.recordClassIndex(36887);
            }

            public final IBinder asBinder() {
                return this.f72379b;
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30370l
            /* renamed from: a */
            public final void mo53924a() {
                AbstractC30370l lVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback");
                    if (this.f72379b.transact(1, obtain, obtain2, 0) || (lVar = f72378a) == null) {
                        obtain2.readException();
                    } else {
                        lVar.mo53924a();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            C30372a(IBinder iBinder) {
                this.f72379b = iBinder;
            }
        }

        public AbstractBinderC30371a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback");
                mo53924a();
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(36885);
    }

    /* renamed from: a */
    void mo53924a();
}
