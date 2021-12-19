package com.p2082ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30370l;

/* renamed from: com.ss.android.socialbase.downloader.depend.m */
public interface AbstractC30373m extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.depend.m$a */
    public static abstract class AbstractBinderC30374a extends Binder implements AbstractC30373m {
        static {
            Covode.recordClassIndex(36889);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.ss.android.socialbase.downloader.depend.m$a$a */
        public static class C30375a implements AbstractC30373m {

            /* renamed from: a */
            public static AbstractC30373m f72380a;

            /* renamed from: b */
            private IBinder f72381b;

            static {
                Covode.recordClassIndex(36890);
            }

            public final IBinder asBinder() {
                return this.f72381b;
            }

            public C30375a(IBinder iBinder) {
                this.f72381b = iBinder;
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30373m
            /* renamed from: a */
            public final boolean mo53928a(long j, long j2, AbstractC30370l lVar) {
                IBinder iBinder;
                AbstractC30373m mVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    if (lVar != null) {
                        iBinder = lVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    boolean z = false;
                    if (!this.f72381b.transact(1, obtain, obtain2, 0) && (mVar = f72380a) != null) {
                        return mVar.mo53928a(j, j2, lVar);
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

        public AbstractBinderC30374a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            AbstractC30370l aVar;
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
                long readLong = parcel.readLong();
                long readLong2 = parcel.readLong();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    aVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC30370l)) {
                        aVar = new AbstractC30370l.AbstractBinderC30371a.C30372a(readStrongBinder);
                    } else {
                        aVar = (AbstractC30370l) queryLocalInterface;
                    }
                }
                boolean a = mo53928a(readLong, readLong2, aVar);
                parcel2.writeNoException();
                parcel2.writeInt(a ? 1 : 0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(36888);
    }

    /* renamed from: a */
    boolean mo53928a(long j, long j2, AbstractC30370l lVar);
}
