package com.p2082ss.android.socialbase.downloader.model;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30334ab;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30338ad;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30347c;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30350d;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30353e;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30356f;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30359g;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30362h;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30366j;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30373m;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30383s;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30390x;

/* renamed from: com.ss.android.socialbase.downloader.model.a */
public interface AbstractC30589a extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.model.a$a */
    public static abstract class AbstractBinderC30590a extends Binder implements AbstractC30589a {
        static {
            Covode.recordClassIndex(37122);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.ss.android.socialbase.downloader.model.a$a$a */
        public static class C30591a implements AbstractC30589a {

            /* renamed from: a */
            public static AbstractC30589a f72992a;

            /* renamed from: b */
            private IBinder f72993b;

            static {
                Covode.recordClassIndex(37123);
            }

            public final IBinder asBinder() {
                return this.f72993b;
            }

            @Override // com.p2082ss.android.socialbase.downloader.model.AbstractC30589a
            /* renamed from: c */
            public final AbstractC30390x mo54372c() {
                AbstractC30589a aVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f72993b.transact(6, obtain, obtain2, 0) && (aVar = f72992a) != null) {
                        return aVar.mo54372c();
                    }
                    obtain2.readException();
                    AbstractC30390x a = AbstractC30390x.AbstractBinderC30391a.m61644a(obtain2.readStrongBinder());
                    obtain2.recycle();
                    obtain.recycle();
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.model.AbstractC30589a
            /* renamed from: d */
            public final AbstractC30334ab mo54373d() {
                AbstractC30589a aVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f72993b.transact(7, obtain, obtain2, 0) && (aVar = f72992a) != null) {
                        return aVar.mo54373d();
                    }
                    obtain2.readException();
                    AbstractC30334ab a = AbstractC30334ab.AbstractBinderC30335a.m61560a(obtain2.readStrongBinder());
                    obtain2.recycle();
                    obtain.recycle();
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.model.AbstractC30589a
            /* renamed from: l */
            public final int mo54381l() {
                AbstractC30589a aVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f72993b.transact(15, obtain, obtain2, 0) && (aVar = f72992a) != null) {
                        return aVar.mo54381l();
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

            @Override // com.p2082ss.android.socialbase.downloader.model.AbstractC30589a
            /* renamed from: b */
            public final AbstractC30347c mo54369b() {
                AbstractC30347c cVar;
                AbstractC30589a aVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f72993b.transact(2, obtain, obtain2, 0) && (aVar = f72992a) != null) {
                        return aVar.mo54369b();
                    }
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    if (readStrongBinder == null) {
                        cVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC30347c)) {
                            cVar = new AbstractC30347c.AbstractBinderC30348a.C30349a(readStrongBinder);
                        } else {
                            cVar = (AbstractC30347c) queryLocalInterface;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return cVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.model.AbstractC30589a
            /* renamed from: e */
            public final AbstractC30356f mo54374e() {
                AbstractC30356f fVar;
                AbstractC30589a aVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f72993b.transact(8, obtain, obtain2, 0) && (aVar = f72992a) != null) {
                        return aVar.mo54374e();
                    }
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    if (readStrongBinder == null) {
                        fVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC30356f)) {
                            fVar = new AbstractC30356f.AbstractBinderC30357a.C30358a(readStrongBinder);
                        } else {
                            fVar = (AbstractC30356f) queryLocalInterface;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return fVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.model.AbstractC30589a
            /* renamed from: f */
            public final AbstractC30350d mo54375f() {
                AbstractC30350d dVar;
                AbstractC30589a aVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f72993b.transact(9, obtain, obtain2, 0) && (aVar = f72992a) != null) {
                        return aVar.mo54375f();
                    }
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    if (readStrongBinder == null) {
                        dVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC30350d)) {
                            dVar = new AbstractC30350d.AbstractBinderC30351a.C30352a(readStrongBinder);
                        } else {
                            dVar = (AbstractC30350d) queryLocalInterface;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return dVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.model.AbstractC30589a
            /* renamed from: g */
            public final AbstractC30383s mo54376g() {
                AbstractC30383s sVar;
                AbstractC30589a aVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f72993b.transact(10, obtain, obtain2, 0) && (aVar = f72992a) != null) {
                        return aVar.mo54376g();
                    }
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    if (readStrongBinder == null) {
                        sVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC30383s)) {
                            sVar = new AbstractC30383s.AbstractBinderC30384a.C30385a(readStrongBinder);
                        } else {
                            sVar = (AbstractC30383s) queryLocalInterface;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return sVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.model.AbstractC30589a
            /* renamed from: h */
            public final AbstractC30338ad mo54377h() {
                AbstractC30338ad adVar;
                AbstractC30589a aVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f72993b.transact(11, obtain, obtain2, 0) && (aVar = f72992a) != null) {
                        return aVar.mo54377h();
                    }
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    if (readStrongBinder == null) {
                        adVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC30338ad)) {
                            adVar = new AbstractC30338ad.AbstractBinderC30339a.C30340a(readStrongBinder);
                        } else {
                            adVar = (AbstractC30338ad) queryLocalInterface;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return adVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.model.AbstractC30589a
            /* renamed from: i */
            public final AbstractC30373m mo54378i() {
                AbstractC30373m mVar;
                AbstractC30589a aVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f72993b.transact(12, obtain, obtain2, 0) && (aVar = f72992a) != null) {
                        return aVar.mo54378i();
                    }
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    if (readStrongBinder == null) {
                        mVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC30373m)) {
                            mVar = new AbstractC30373m.AbstractBinderC30374a.C30375a(readStrongBinder);
                        } else {
                            mVar = (AbstractC30373m) queryLocalInterface;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return mVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.model.AbstractC30589a
            /* renamed from: j */
            public final AbstractC30362h mo54379j() {
                AbstractC30362h hVar;
                AbstractC30589a aVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f72993b.transact(13, obtain, obtain2, 0) && (aVar = f72992a) != null) {
                        return aVar.mo54379j();
                    }
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    if (readStrongBinder == null) {
                        hVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC30362h)) {
                            hVar = new AbstractC30362h.AbstractBinderC30363a.C30364a(readStrongBinder);
                        } else {
                            hVar = (AbstractC30362h) queryLocalInterface;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return hVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.model.AbstractC30589a
            /* renamed from: k */
            public final AbstractC30353e mo54380k() {
                AbstractC30589a aVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f72993b.transact(14, obtain, obtain2, 0) && (aVar = f72992a) != null) {
                        return aVar.mo54380k();
                    }
                    obtain2.readException();
                    AbstractC30353e a = AbstractC30353e.AbstractBinderC30354a.m61580a(obtain2.readStrongBinder());
                    obtain2.recycle();
                    obtain.recycle();
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.model.AbstractC30589a
            /* renamed from: a */
            public final DownloadInfo mo54368a() {
                DownloadInfo downloadInfo;
                AbstractC30589a aVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f72993b.transact(1, obtain, obtain2, 0) && (aVar = f72992a) != null) {
                        return aVar.mo54368a();
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        downloadInfo = DownloadInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        downloadInfo = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return downloadInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C30591a(IBinder iBinder) {
                this.f72993b = iBinder;
            }

            @Override // com.p2082ss.android.socialbase.downloader.model.AbstractC30589a
            /* renamed from: a */
            public final int mo54366a(int i) {
                AbstractC30589a aVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    obtain.writeInt(i);
                    if (!this.f72993b.transact(3, obtain, obtain2, 0) && (aVar = f72992a) != null) {
                        return aVar.mo54366a(i);
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

            @Override // com.p2082ss.android.socialbase.downloader.model.AbstractC30589a
            /* renamed from: c */
            public final AbstractC30366j mo54371c(int i) {
                AbstractC30366j jVar;
                AbstractC30589a aVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    obtain.writeInt(i);
                    if (!this.f72993b.transact(16, obtain, obtain2, 0) && (aVar = f72992a) != null) {
                        return aVar.mo54371c(i);
                    }
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    if (readStrongBinder == null) {
                        jVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadCompleteAidlHandler");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC30366j)) {
                            jVar = new AbstractC30366j.AbstractBinderC30367a.C30368a(readStrongBinder);
                        } else {
                            jVar = (AbstractC30366j) queryLocalInterface;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return jVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.model.AbstractC30589a
            /* renamed from: b */
            public final AbstractC30359g mo54370b(int i) {
                AbstractC30589a aVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    obtain.writeInt(i);
                    if (!this.f72993b.transact(5, obtain, obtain2, 0) && (aVar = f72992a) != null) {
                        return aVar.mo54370b(i);
                    }
                    obtain2.readException();
                    AbstractC30359g a = AbstractC30359g.AbstractBinderC30360a.m61597a(obtain2.readStrongBinder());
                    obtain2.recycle();
                    obtain.recycle();
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.model.AbstractC30589a
            /* renamed from: a */
            public final AbstractC30359g mo54367a(int i, int i2) {
                AbstractC30589a aVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (!this.f72993b.transact(4, obtain, obtain2, 0) && (aVar = f72992a) != null) {
                        return aVar.mo54367a(i, i2);
                    }
                    obtain2.readException();
                    AbstractC30359g a = AbstractC30359g.AbstractBinderC30360a.m61597a(obtain2.readStrongBinder());
                    obtain2.recycle();
                    obtain.recycle();
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC30590a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.model.DownloadAidlTask");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                IBinder iBinder = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        DownloadInfo a = mo54368a();
                        parcel2.writeNoException();
                        if (a != null) {
                            parcel2.writeInt(1);
                            a.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 2:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        AbstractC30347c b = mo54369b();
                        parcel2.writeNoException();
                        if (b != null) {
                            iBinder = b.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        int a2 = mo54366a(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(a2);
                        return true;
                    case 4:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        AbstractC30359g a3 = mo54367a(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (a3 != null) {
                            iBinder = a3.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        AbstractC30359g b2 = mo54370b(parcel.readInt());
                        parcel2.writeNoException();
                        if (b2 != null) {
                            iBinder = b2.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        AbstractC30390x c = mo54372c();
                        parcel2.writeNoException();
                        if (c != null) {
                            iBinder = c.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        AbstractC30334ab d = mo54373d();
                        parcel2.writeNoException();
                        if (d != null) {
                            iBinder = d.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        AbstractC30356f e = mo54374e();
                        parcel2.writeNoException();
                        if (e != null) {
                            iBinder = e.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        AbstractC30350d f = mo54375f();
                        parcel2.writeNoException();
                        if (f != null) {
                            iBinder = f.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        AbstractC30383s g = mo54376g();
                        parcel2.writeNoException();
                        if (g != null) {
                            iBinder = g.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        AbstractC30338ad h = mo54377h();
                        parcel2.writeNoException();
                        if (h != null) {
                            iBinder = h.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        AbstractC30373m i3 = mo54378i();
                        parcel2.writeNoException();
                        if (i3 != null) {
                            iBinder = i3.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        AbstractC30362h j = mo54379j();
                        parcel2.writeNoException();
                        if (j != null) {
                            iBinder = j.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case ABRConfig.ABR_SELECT_SCENE:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        AbstractC30353e k = mo54380k();
                        parcel2.writeNoException();
                        if (k != null) {
                            iBinder = k.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 15:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        int l = mo54381l();
                        parcel2.writeNoException();
                        parcel2.writeInt(l);
                        return true;
                    case 16:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        AbstractC30366j c2 = mo54371c(parcel.readInt());
                        parcel2.writeNoException();
                        if (c2 != null) {
                            iBinder = c2.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(37121);
    }

    /* renamed from: a */
    int mo54366a(int i);

    /* renamed from: a */
    AbstractC30359g mo54367a(int i, int i2);

    /* renamed from: a */
    DownloadInfo mo54368a();

    /* renamed from: b */
    AbstractC30347c mo54369b();

    /* renamed from: b */
    AbstractC30359g mo54370b(int i);

    /* renamed from: c */
    AbstractC30366j mo54371c(int i);

    /* renamed from: c */
    AbstractC30390x mo54372c();

    /* renamed from: d */
    AbstractC30334ab mo54373d();

    /* renamed from: e */
    AbstractC30356f mo54374e();

    /* renamed from: f */
    AbstractC30350d mo54375f();

    /* renamed from: g */
    AbstractC30383s mo54376g();

    /* renamed from: h */
    AbstractC30338ad mo54377h();

    /* renamed from: i */
    AbstractC30373m mo54378i();

    /* renamed from: j */
    AbstractC30362h mo54379j();

    /* renamed from: k */
    AbstractC30353e mo54380k();

    /* renamed from: l */
    int mo54381l();
}
