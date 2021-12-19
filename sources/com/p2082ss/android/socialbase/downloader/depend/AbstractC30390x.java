package com.p2082ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: com.ss.android.socialbase.downloader.depend.x */
public interface AbstractC30390x extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.depend.x$a */
    public static abstract class AbstractBinderC30391a extends Binder implements AbstractC30390x {
        static {
            Covode.recordClassIndex(36906);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.ss.android.socialbase.downloader.depend.x$a$a */
        static class C30392a implements AbstractC30390x {

            /* renamed from: a */
            public static AbstractC30390x f72386a;

            /* renamed from: b */
            private IBinder f72387b;

            static {
                Covode.recordClassIndex(36907);
            }

            public final IBinder asBinder() {
                return this.f72387b;
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30390x
            /* renamed from: a */
            public final String mo53949a() {
                AbstractC30390x xVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                    if (!this.f72387b.transact(3, obtain, obtain2, 0) && (xVar = f72386a) != null) {
                        return xVar.mo53949a();
                    }
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            C30392a(IBinder iBinder) {
                this.f72387b = iBinder;
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30390x
            /* renamed from: a */
            public final boolean mo53951a(boolean z) {
                int i;
                AbstractC30390x xVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                    boolean z2 = true;
                    if (z) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    if (!this.f72387b.transact(2, obtain, obtain2, 0) && (xVar = f72386a) != null) {
                        return xVar.mo53951a(z);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z2 = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30390x
            /* renamed from: a */
            public final void mo53950a(int i, DownloadInfo downloadInfo, String str, String str2) {
                AbstractC30390x xVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                    obtain.writeInt(i);
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (this.f72387b.transact(1, obtain, obtain2, 0) || (xVar = f72386a) == null) {
                        obtain2.readException();
                    } else {
                        xVar.mo53950a(i, downloadInfo, str, str2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC30391a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
        }

        /* renamed from: a */
        public static AbstractC30390x m61644a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC30390x)) {
                return new C30392a(iBinder);
            }
            return (AbstractC30390x) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            DownloadInfo downloadInfo;
            boolean z;
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                int readInt = parcel.readInt();
                if (parcel.readInt() != 0) {
                    downloadInfo = DownloadInfo.CREATOR.createFromParcel(parcel);
                } else {
                    downloadInfo = null;
                }
                mo53950a(readInt, downloadInfo, parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolean a = mo53951a(z);
                parcel2.writeNoException();
                parcel2.writeInt(a ? 1 : 0);
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                String a2 = mo53949a();
                parcel2.writeNoException();
                parcel2.writeString(a2);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(36905);
    }

    /* renamed from: a */
    String mo53949a();

    /* renamed from: a */
    void mo53950a(int i, DownloadInfo downloadInfo, String str, String str2);

    /* renamed from: a */
    boolean mo53951a(boolean z);
}
