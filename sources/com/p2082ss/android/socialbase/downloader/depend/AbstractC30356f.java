package com.p2082ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.socialbase.downloader.depend.f */
public interface AbstractC30356f extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.depend.f$a */
    public static abstract class AbstractBinderC30357a extends Binder implements AbstractC30356f {
        static {
            Covode.recordClassIndex(36872);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.ss.android.socialbase.downloader.depend.f$a$a */
        public static class C30358a implements AbstractC30356f {

            /* renamed from: a */
            public static AbstractC30356f f72370a;

            /* renamed from: b */
            private IBinder f72371b;

            static {
                Covode.recordClassIndex(36873);
            }

            public final IBinder asBinder() {
                return this.f72371b;
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30356f
            /* renamed from: a */
            public final boolean mo53891a() {
                AbstractC30356f fVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
                    boolean z = false;
                    if (!this.f72371b.transact(1, obtain, obtain2, 0) && (fVar = f72370a) != null) {
                        return fVar.mo53891a();
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C30358a(IBinder iBinder) {
                this.f72371b = iBinder;
            }
        }

        public AbstractBinderC30357a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
                boolean a = mo53891a();
                parcel2.writeNoException();
                parcel2.writeInt(a ? 1 : 0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(36871);
    }

    /* renamed from: a */
    boolean mo53891a();
}
