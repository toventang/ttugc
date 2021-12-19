package com.p2082ss.android.socialbase.downloader.p2180c;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.ss.android.socialbase.downloader.c.b */
public interface AbstractC30298b extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.c.b$a */
    public static abstract class AbstractBinderC30299a extends Binder implements AbstractC30298b {
        static {
            Covode.recordClassIndex(36811);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.ss.android.socialbase.downloader.c.b$a$a */
        static class C30300a implements AbstractC30298b {

            /* renamed from: a */
            public static AbstractC30298b f72276a;

            /* renamed from: b */
            private IBinder f72277b;

            static {
                Covode.recordClassIndex(36812);
            }

            public final IBinder asBinder() {
                return this.f72277b;
            }

            C30300a(IBinder iBinder) {
                this.f72277b = iBinder;
            }

            @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30298b
            /* renamed from: a */
            public final void mo53760a(Map map, Map map2) {
                AbstractC30298b bVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl");
                    obtain.writeMap(map);
                    obtain.writeMap(map2);
                    if (this.f72277b.transact(1, obtain, obtain2, 0) || (bVar = f72276a) == null) {
                        obtain2.readException();
                    } else {
                        bVar.mo53760a(map, map2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC30299a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl");
                ClassLoader classLoader = getClass().getClassLoader();
                mo53760a(parcel.readHashMap(classLoader), parcel.readHashMap(classLoader));
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(36810);
    }

    /* renamed from: a */
    void mo53760a(Map map, Map map2);
}
