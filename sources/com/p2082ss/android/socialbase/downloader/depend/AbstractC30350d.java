package com.p2082ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: com.ss.android.socialbase.downloader.depend.d */
public interface AbstractC30350d extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.depend.d$a */
    public static abstract class AbstractBinderC30351a extends Binder implements AbstractC30350d {
        static {
            Covode.recordClassIndex(36866);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.ss.android.socialbase.downloader.depend.d$a$a */
        public static class C30352a implements AbstractC30350d {

            /* renamed from: a */
            public static AbstractC30350d f72366a;

            /* renamed from: b */
            private IBinder f72367b;

            static {
                Covode.recordClassIndex(36867);
            }

            public final IBinder asBinder() {
                return this.f72367b;
            }

            public C30352a(IBinder iBinder) {
                this.f72367b = iBinder;
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30350d
            /* renamed from: a */
            public final void mo53883a(DownloadInfo downloadInfo, BaseException baseException, int i) {
                AbstractC30350d dVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (baseException != null) {
                        obtain.writeInt(1);
                        baseException.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    if (this.f72367b.transact(1, obtain, obtain2, 0) || (dVar = f72366a) == null) {
                        obtain2.readException();
                    } else {
                        dVar.mo53883a(downloadInfo, baseException, i);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC30351a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            DownloadInfo downloadInfo;
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend");
                BaseException baseException = null;
                if (parcel.readInt() != 0) {
                    downloadInfo = DownloadInfo.CREATOR.createFromParcel(parcel);
                } else {
                    downloadInfo = null;
                }
                if (parcel.readInt() != 0) {
                    baseException = BaseException.CREATOR.createFromParcel(parcel);
                }
                mo53883a(downloadInfo, baseException, parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(36865);
    }

    /* renamed from: a */
    void mo53883a(DownloadInfo downloadInfo, BaseException baseException, int i);
}
