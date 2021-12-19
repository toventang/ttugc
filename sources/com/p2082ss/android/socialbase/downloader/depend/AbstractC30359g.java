package com.p2082ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: com.ss.android.socialbase.downloader.depend.g */
public interface AbstractC30359g extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.depend.g$a */
    public static abstract class AbstractBinderC30360a extends Binder implements AbstractC30359g {
        static {
            Covode.recordClassIndex(36875);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.ss.android.socialbase.downloader.depend.g$a$a */
        static class C30361a implements AbstractC30359g {

            /* renamed from: a */
            public static AbstractC30359g f72372a;

            /* renamed from: b */
            private IBinder f72373b;

            static {
                Covode.recordClassIndex(36876);
            }

            public final IBinder asBinder() {
                return this.f72373b;
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30359g
            /* renamed from: a */
            public final int mo53895a() {
                AbstractC30359g gVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (!this.f72373b.transact(1, obtain, obtain2, 0) && (gVar = f72372a) != null) {
                        return gVar.mo53895a();
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

            C30361a(IBinder iBinder) {
                this.f72373b = iBinder;
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30359g
            /* renamed from: b */
            public final void mo53898b(DownloadInfo downloadInfo) {
                AbstractC30359g gVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f72373b.transact(3, obtain, obtain2, 0) || (gVar = f72372a) == null) {
                        obtain2.readException();
                    } else {
                        gVar.mo53898b(downloadInfo);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30359g
            /* renamed from: c */
            public final void mo53900c(DownloadInfo downloadInfo) {
                AbstractC30359g gVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f72373b.transact(4, obtain, obtain2, 0) || (gVar = f72372a) == null) {
                        obtain2.readException();
                    } else {
                        gVar.mo53900c(downloadInfo);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30359g
            /* renamed from: d */
            public final void mo53902d(DownloadInfo downloadInfo) {
                AbstractC30359g gVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f72373b.transact(5, obtain, obtain2, 0) || (gVar = f72372a) == null) {
                        obtain2.readException();
                    } else {
                        gVar.mo53902d(downloadInfo);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30359g
            /* renamed from: e */
            public final void mo53903e(DownloadInfo downloadInfo) {
                AbstractC30359g gVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f72373b.transact(6, obtain, obtain2, 0) || (gVar = f72372a) == null) {
                        obtain2.readException();
                    } else {
                        gVar.mo53903e(downloadInfo);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30359g
            /* renamed from: f */
            public final void mo53904f(DownloadInfo downloadInfo) {
                AbstractC30359g gVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f72373b.transact(8, obtain, obtain2, 0) || (gVar = f72372a) == null) {
                        obtain2.readException();
                    } else {
                        gVar.mo53904f(downloadInfo);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30359g
            /* renamed from: g */
            public final void mo53905g(DownloadInfo downloadInfo) {
                AbstractC30359g gVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f72373b.transact(9, obtain, obtain2, 0) || (gVar = f72372a) == null) {
                        obtain2.readException();
                    } else {
                        gVar.mo53905g(downloadInfo);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30359g
            /* renamed from: h */
            public final void mo53906h(DownloadInfo downloadInfo) {
                AbstractC30359g gVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f72373b.transact(10, obtain, obtain2, 0) || (gVar = f72372a) == null) {
                        obtain2.readException();
                    } else {
                        gVar.mo53906h(downloadInfo);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30359g
            /* renamed from: i */
            public final void mo53907i(DownloadInfo downloadInfo) {
                AbstractC30359g gVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f72373b.transact(13, obtain, obtain2, 0) || (gVar = f72372a) == null) {
                        obtain2.readException();
                    } else {
                        gVar.mo53907i(downloadInfo);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30359g
            /* renamed from: a */
            public final void mo53896a(DownloadInfo downloadInfo) {
                AbstractC30359g gVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f72373b.transact(2, obtain, obtain2, 0) || (gVar = f72372a) == null) {
                        obtain2.readException();
                    } else {
                        gVar.mo53896a(downloadInfo);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30359g
            /* renamed from: b */
            public final void mo53899b(DownloadInfo downloadInfo, BaseException baseException) {
                AbstractC30359g gVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
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
                    if (this.f72373b.transact(11, obtain, obtain2, 0) || (gVar = f72372a) == null) {
                        obtain2.readException();
                    } else {
                        gVar.mo53899b(downloadInfo, baseException);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30359g
            /* renamed from: c */
            public final void mo53901c(DownloadInfo downloadInfo, BaseException baseException) {
                AbstractC30359g gVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
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
                    if (this.f72373b.transact(12, obtain, obtain2, 0) || (gVar = f72372a) == null) {
                        obtain2.readException();
                    } else {
                        gVar.mo53901c(downloadInfo, baseException);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30359g
            /* renamed from: a */
            public final void mo53897a(DownloadInfo downloadInfo, BaseException baseException) {
                AbstractC30359g gVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
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
                    if (this.f72373b.transact(7, obtain, obtain2, 0) || (gVar = f72372a) == null) {
                        obtain2.readException();
                    } else {
                        gVar.mo53897a(downloadInfo, baseException);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC30360a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
        }

        /* renamed from: a */
        public static AbstractC30359g m61597a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC30359g)) {
                return new C30361a(iBinder);
            }
            return (AbstractC30359g) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            DownloadInfo downloadInfo;
            DownloadInfo downloadInfo2;
            DownloadInfo downloadInfo3;
            if (i != 1598968902) {
                DownloadInfo downloadInfo4 = null;
                DownloadInfo downloadInfo5 = null;
                BaseException baseException = null;
                BaseException baseException2 = null;
                DownloadInfo downloadInfo6 = null;
                DownloadInfo downloadInfo7 = null;
                DownloadInfo downloadInfo8 = null;
                BaseException baseException3 = null;
                DownloadInfo downloadInfo9 = null;
                DownloadInfo downloadInfo10 = null;
                DownloadInfo downloadInfo11 = null;
                DownloadInfo downloadInfo12 = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                        int a = mo53895a();
                        parcel2.writeNoException();
                        parcel2.writeInt(a);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                        if (parcel.readInt() != 0) {
                            downloadInfo4 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        mo53896a(downloadInfo4);
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                        if (parcel.readInt() != 0) {
                            downloadInfo12 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        mo53898b(downloadInfo12);
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                        if (parcel.readInt() != 0) {
                            downloadInfo11 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        mo53900c(downloadInfo11);
                        parcel2.writeNoException();
                        return true;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                        if (parcel.readInt() != 0) {
                            downloadInfo10 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        mo53902d(downloadInfo10);
                        parcel2.writeNoException();
                        return true;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                        if (parcel.readInt() != 0) {
                            downloadInfo9 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        mo53903e(downloadInfo9);
                        parcel2.writeNoException();
                        return true;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                        if (parcel.readInt() != 0) {
                            downloadInfo = DownloadInfo.CREATOR.createFromParcel(parcel);
                        } else {
                            downloadInfo = null;
                        }
                        if (parcel.readInt() != 0) {
                            baseException3 = BaseException.CREATOR.createFromParcel(parcel);
                        }
                        mo53897a(downloadInfo, baseException3);
                        parcel2.writeNoException();
                        return true;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                        if (parcel.readInt() != 0) {
                            downloadInfo8 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        mo53904f(downloadInfo8);
                        parcel2.writeNoException();
                        return true;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                        if (parcel.readInt() != 0) {
                            downloadInfo7 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        mo53905g(downloadInfo7);
                        parcel2.writeNoException();
                        return true;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                        if (parcel.readInt() != 0) {
                            downloadInfo6 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        mo53906h(downloadInfo6);
                        parcel2.writeNoException();
                        return true;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                        if (parcel.readInt() != 0) {
                            downloadInfo2 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        } else {
                            downloadInfo2 = null;
                        }
                        if (parcel.readInt() != 0) {
                            baseException2 = BaseException.CREATOR.createFromParcel(parcel);
                        }
                        mo53899b(downloadInfo2, baseException2);
                        parcel2.writeNoException();
                        return true;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                        if (parcel.readInt() != 0) {
                            downloadInfo3 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        } else {
                            downloadInfo3 = null;
                        }
                        if (parcel.readInt() != 0) {
                            baseException = BaseException.CREATOR.createFromParcel(parcel);
                        }
                        mo53901c(downloadInfo3, baseException);
                        parcel2.writeNoException();
                        return true;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                        if (parcel.readInt() != 0) {
                            downloadInfo5 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        mo53907i(downloadInfo5);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(36874);
    }

    /* renamed from: a */
    int mo53895a();

    /* renamed from: a */
    void mo53896a(DownloadInfo downloadInfo);

    /* renamed from: a */
    void mo53897a(DownloadInfo downloadInfo, BaseException baseException);

    /* renamed from: b */
    void mo53898b(DownloadInfo downloadInfo);

    /* renamed from: b */
    void mo53899b(DownloadInfo downloadInfo, BaseException baseException);

    /* renamed from: c */
    void mo53900c(DownloadInfo downloadInfo);

    /* renamed from: c */
    void mo53901c(DownloadInfo downloadInfo, BaseException baseException);

    /* renamed from: d */
    void mo53902d(DownloadInfo downloadInfo);

    /* renamed from: e */
    void mo53903e(DownloadInfo downloadInfo);

    /* renamed from: f */
    void mo53904f(DownloadInfo downloadInfo);

    /* renamed from: g */
    void mo53905g(DownloadInfo downloadInfo);

    /* renamed from: h */
    void mo53906h(DownloadInfo downloadInfo);

    /* renamed from: i */
    void mo53907i(DownloadInfo downloadInfo);
}
