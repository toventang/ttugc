package com.p2082ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: com.ss.android.socialbase.downloader.depend.j */
public interface AbstractC30366j extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.depend.j$a */
    public static abstract class AbstractBinderC30367a extends Binder implements AbstractC30366j {
        static {
            Covode.recordClassIndex(36882);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.ss.android.socialbase.downloader.depend.j$a$a */
        public static class C30368a implements AbstractC30366j {

            /* renamed from: a */
            public static AbstractC30366j f72376a;

            /* renamed from: b */
            private IBinder f72377b;

            static {
                Covode.recordClassIndex(36883);
            }

            public final IBinder asBinder() {
                return this.f72377b;
            }

            public C30368a(IBinder iBinder) {
                this.f72377b = iBinder;
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30366j
            /* renamed from: a */
            public final void mo53917a(DownloadInfo downloadInfo) {
                AbstractC30366j jVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadCompleteAidlHandler");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f72377b.transact(1, obtain, obtain2, 0) || (jVar = f72376a) == null) {
                        obtain2.readException();
                    } else {
                        jVar.mo53917a(downloadInfo);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30366j
            /* renamed from: b */
            public final boolean mo53918b(DownloadInfo downloadInfo) {
                AbstractC30366j jVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadCompleteAidlHandler");
                    boolean z = true;
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f72377b.transact(2, obtain, obtain2, 0) && (jVar = f72376a) != null) {
                        return jVar.mo53918b(downloadInfo);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC30367a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadCompleteAidlHandler");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            DownloadInfo downloadInfo = null;
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadCompleteAidlHandler");
                if (parcel.readInt() != 0) {
                    downloadInfo = DownloadInfo.CREATOR.createFromParcel(parcel);
                }
                mo53917a(downloadInfo);
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadCompleteAidlHandler");
                if (parcel.readInt() != 0) {
                    downloadInfo = DownloadInfo.CREATOR.createFromParcel(parcel);
                }
                boolean b = mo53918b(downloadInfo);
                parcel2.writeNoException();
                parcel2.writeInt(b ? 1 : 0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadCompleteAidlHandler");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(36881);
    }

    /* renamed from: a */
    void mo53917a(DownloadInfo downloadInfo);

    /* renamed from: b */
    boolean mo53918b(DownloadInfo downloadInfo);
}
