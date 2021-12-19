package com.p2082ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.socialbase.downloader.depend.h */
public interface AbstractC30362h extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.depend.h$a */
    public static abstract class AbstractBinderC30363a extends Binder implements AbstractC30362h {
        static {
            Covode.recordClassIndex(36878);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.ss.android.socialbase.downloader.depend.h$a$a */
        public static class C30364a implements AbstractC30362h {

            /* renamed from: a */
            public static AbstractC30362h f72374a;

            /* renamed from: b */
            private IBinder f72375b;

            static {
                Covode.recordClassIndex(36879);
            }

            public final IBinder asBinder() {
                return this.f72375b;
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30362h
            /* renamed from: a */
            public final String mo53911a() {
                AbstractC30362h hVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                    if (!this.f72375b.transact(2, obtain, obtain2, 0) && (hVar = f72374a) != null) {
                        return hVar.mo53911a();
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

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30362h
            /* renamed from: b */
            public final int[] mo53913b() {
                AbstractC30362h hVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                    if (!this.f72375b.transact(3, obtain, obtain2, 0) && (hVar = f72374a) != null) {
                        return hVar.mo53913b();
                    }
                    obtain2.readException();
                    int[] createIntArray = obtain2.createIntArray();
                    obtain2.recycle();
                    obtain.recycle();
                    return createIntArray;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C30364a(IBinder iBinder) {
                this.f72375b = iBinder;
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30362h
            /* renamed from: a */
            public final void mo53912a(String str) {
                AbstractC30362h hVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                    obtain.writeString(str);
                    if (this.f72375b.transact(1, obtain, obtain2, 0) || (hVar = f72374a) == null) {
                        obtain2.readException();
                    } else {
                        hVar.mo53912a(str);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC30363a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                mo53912a(parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                String a = mo53911a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                int[] b = mo53913b();
                parcel2.writeNoException();
                parcel2.writeIntArray(b);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(36877);
    }

    /* renamed from: a */
    String mo53911a();

    /* renamed from: a */
    void mo53912a(String str);

    /* renamed from: b */
    int[] mo53913b();
}
