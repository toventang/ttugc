package com.p2082ss.android.socialbase.downloader.depend;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.socialbase.downloader.depend.e */
public interface AbstractC30353e extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.depend.e$a */
    public static abstract class AbstractBinderC30354a extends Binder implements AbstractC30353e {
        static {
            Covode.recordClassIndex(36869);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.ss.android.socialbase.downloader.depend.e$a$a */
        static class C30355a implements AbstractC30353e {

            /* renamed from: a */
            public static AbstractC30353e f72368a;

            /* renamed from: b */
            private IBinder f72369b;

            static {
                Covode.recordClassIndex(36870);
            }

            public final IBinder asBinder() {
                return this.f72369b;
            }

            C30355a(IBinder iBinder) {
                this.f72369b = iBinder;
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30353e
            /* renamed from: a */
            public final Uri mo53887a(String str, String str2) {
                Uri uri;
                AbstractC30353e eVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.f72369b.transact(1, obtain, obtain2, 0) && (eVar = f72368a) != null) {
                        return eVar.mo53887a(str, str2);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        uri = (Uri) Uri.CREATOR.createFromParcel(obtain2);
                    } else {
                        uri = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return uri;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC30354a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider");
        }

        /* renamed from: a */
        public static AbstractC30353e m61580a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC30353e)) {
                return new C30355a(iBinder);
            }
            return (AbstractC30353e) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider");
                Uri a = mo53887a(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                if (a != null) {
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(36868);
    }

    /* renamed from: a */
    Uri mo53887a(String str, String str2);
}
