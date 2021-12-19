package com.bytedance.disk.p956a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.disk.parcel.MigrationItem;

/* renamed from: com.bytedance.disk.a.b */
public interface AbstractC14425b extends IInterface {

    /* renamed from: com.bytedance.disk.a.b$a */
    public static abstract class AbstractBinderC14426a extends Binder implements AbstractC14425b {
        static {
            Covode.recordClassIndex(16504);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.bytedance.disk.a.b$a$a */
        public static class C14427a implements AbstractC14425b {

            /* renamed from: a */
            public static AbstractC14425b f34897a;

            /* renamed from: b */
            private IBinder f34898b;

            static {
                Covode.recordClassIndex(16505);
            }

            public final IBinder asBinder() {
                return this.f34898b;
            }

            public C14427a(IBinder iBinder) {
                this.f34898b = iBinder;
            }

            @Override // com.bytedance.disk.p956a.AbstractC14425b
            /* renamed from: a */
            public final void mo23248a(MigrationItem migrationItem) {
                AbstractC14425b bVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.disk.aidl.IProcessCallback");
                    if (migrationItem != null) {
                        obtain.writeInt(1);
                        migrationItem.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f34898b.transact(1, obtain, obtain2, 0) || (bVar = f34897a) == null) {
                        obtain2.readException();
                    } else {
                        bVar.mo23248a(migrationItem);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC14426a() {
            attachInterface(this, "com.bytedance.disk.aidl.IProcessCallback");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            MigrationItem migrationItem;
            if (i == 1) {
                parcel.enforceInterface("com.bytedance.disk.aidl.IProcessCallback");
                if (parcel.readInt() != 0) {
                    migrationItem = MigrationItem.CREATOR.createFromParcel(parcel);
                } else {
                    migrationItem = null;
                }
                mo23248a(migrationItem);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.bytedance.disk.aidl.IProcessCallback");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(16503);
    }

    /* renamed from: a */
    void mo23248a(MigrationItem migrationItem);
}
