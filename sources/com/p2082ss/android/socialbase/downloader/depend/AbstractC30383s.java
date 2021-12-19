package com.p2082ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30380r;

/* renamed from: com.ss.android.socialbase.downloader.depend.s */
public interface AbstractC30383s extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.depend.s$a */
    public static abstract class AbstractBinderC30384a extends Binder implements AbstractC30383s {
        static {
            Covode.recordClassIndex(36899);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.ss.android.socialbase.downloader.depend.s$a$a */
        public static class C30385a implements AbstractC30383s {

            /* renamed from: a */
            public static AbstractC30383s f72384a;

            /* renamed from: b */
            private IBinder f72385b;

            static {
                Covode.recordClassIndex(36900);
            }

            public final IBinder asBinder() {
                return this.f72385b;
            }

            public C30385a(IBinder iBinder) {
                this.f72385b = iBinder;
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30383s
            /* renamed from: a */
            public final boolean mo53941a(AbstractC30380r rVar) {
                IBinder iBinder;
                AbstractC30383s sVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
                    if (rVar != null) {
                        iBinder = rVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    boolean z = false;
                    if (!this.f72385b.transact(1, obtain, obtain2, 0) && (sVar = f72384a) != null) {
                        return sVar.mo53941a(rVar);
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
        }

        public AbstractBinderC30384a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            AbstractC30380r aVar;
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    aVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC30380r)) {
                        aVar = new AbstractC30380r.AbstractBinderC30381a.C30382a(readStrongBinder);
                    } else {
                        aVar = (AbstractC30380r) queryLocalInterface;
                    }
                }
                boolean a = mo53941a(aVar);
                parcel2.writeNoException();
                parcel2.writeInt(a ? 1 : 0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(36898);
    }

    /* renamed from: a */
    boolean mo53941a(AbstractC30380r rVar);
}
