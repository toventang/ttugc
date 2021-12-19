package com.p2082ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: com.ss.android.socialbase.downloader.depend.ab */
public interface AbstractC30334ab extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.depend.ab$a */
    public static abstract class AbstractBinderC30335a extends Binder implements AbstractC30334ab {
        static {
            Covode.recordClassIndex(36850);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.ss.android.socialbase.downloader.depend.ab$a$a */
        static class C30336a implements AbstractC30334ab {

            /* renamed from: a */
            public static AbstractC30334ab f72358a;

            /* renamed from: b */
            private IBinder f72359b;

            static {
                Covode.recordClassIndex(36851);
            }

            public final IBinder asBinder() {
                return this.f72359b;
            }

            C30336a(IBinder iBinder) {
                this.f72359b = iBinder;
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30334ab
            /* renamed from: a */
            public final boolean mo53858a(DownloadInfo downloadInfo) {
                AbstractC30334ab abVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
                    boolean z = true;
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f72359b.transact(1, obtain, obtain2, 0) && (abVar = f72358a) != null) {
                        return abVar.mo53858a(downloadInfo);
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

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30334ab
            /* renamed from: b */
            public final boolean mo53859b(DownloadInfo downloadInfo) {
                AbstractC30334ab abVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
                    boolean z = true;
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f72359b.transact(2, obtain, obtain2, 0) && (abVar = f72358a) != null) {
                        return abVar.mo53859b(downloadInfo);
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

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30334ab
            /* renamed from: c */
            public final boolean mo53860c(DownloadInfo downloadInfo) {
                AbstractC30334ab abVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
                    boolean z = true;
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f72359b.transact(3, obtain, obtain2, 0) && (abVar = f72358a) != null) {
                        return abVar.mo53860c(downloadInfo);
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

        public AbstractBinderC30335a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
        }

        /* renamed from: a */
        public static AbstractC30334ab m61560a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC30334ab)) {
                return new C30336a(iBinder);
            }
            return (AbstractC30334ab) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            DownloadInfo downloadInfo = null;
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
                if (parcel.readInt() != 0) {
                    downloadInfo = DownloadInfo.CREATOR.createFromParcel(parcel);
                }
                boolean a = mo53858a(downloadInfo);
                parcel2.writeNoException();
                parcel2.writeInt(a ? 1 : 0);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
                if (parcel.readInt() != 0) {
                    downloadInfo = DownloadInfo.CREATOR.createFromParcel(parcel);
                }
                boolean b = mo53859b(downloadInfo);
                parcel2.writeNoException();
                parcel2.writeInt(b ? 1 : 0);
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
                if (parcel.readInt() != 0) {
                    downloadInfo = DownloadInfo.CREATOR.createFromParcel(parcel);
                }
                boolean c = mo53860c(downloadInfo);
                parcel2.writeNoException();
                parcel2.writeInt(c ? 1 : 0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(36849);
    }

    /* renamed from: a */
    boolean mo53858a(DownloadInfo downloadInfo);

    /* renamed from: b */
    boolean mo53859b(DownloadInfo downloadInfo);

    /* renamed from: c */
    boolean mo53860c(DownloadInfo downloadInfo);
}
