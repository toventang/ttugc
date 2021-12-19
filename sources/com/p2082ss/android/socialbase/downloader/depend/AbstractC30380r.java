package com.p2082ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.depend.r */
public interface AbstractC30380r extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.depend.r$a */
    public static abstract class AbstractBinderC30381a extends Binder implements AbstractC30380r {
        static {
            Covode.recordClassIndex(36896);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.ss.android.socialbase.downloader.depend.r$a$a */
        static class C30382a implements AbstractC30380r {

            /* renamed from: a */
            public static AbstractC30380r f72382a;

            /* renamed from: b */
            private IBinder f72383b;

            static {
                Covode.recordClassIndex(36897);
            }

            public final IBinder asBinder() {
                return this.f72383b;
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30380r
            /* renamed from: a */
            public final boolean mo53937a() {
                AbstractC30380r rVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback");
                    boolean z = false;
                    if (!this.f72383b.transact(2, obtain, obtain2, 0) && (rVar = f72382a) != null) {
                        return rVar.mo53937a();
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

            C30382a(IBinder iBinder) {
                this.f72383b = iBinder;
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30380r
            /* renamed from: a */
            public final void mo53936a(List<String> list) {
                AbstractC30380r rVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback");
                    obtain.writeStringList(list);
                    if (this.f72383b.transact(1, obtain, obtain2, 0) || (rVar = f72382a) == null) {
                        obtain2.readException();
                    } else {
                        rVar.mo53936a(list);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC30381a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback");
                mo53936a(parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback");
                boolean a = mo53937a();
                parcel2.writeNoException();
                parcel2.writeInt(a ? 1 : 0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(36895);
    }

    /* renamed from: a */
    void mo53936a(List<String> list);

    /* renamed from: a */
    boolean mo53937a();
}
