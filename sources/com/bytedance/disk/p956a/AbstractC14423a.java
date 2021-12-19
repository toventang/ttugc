package com.bytedance.disk.p956a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.disk.parcel.MigrationItem;
import com.bytedance.disk.parcel.MigrationOpt;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.disk.a.a */
public interface AbstractC14423a extends IInterface {
    static {
        Covode.recordClassIndex(16501);
    }

    /* renamed from: a */
    int mo23240a(MigrationOpt migrationOpt);

    /* renamed from: a */
    int mo23241a(MigrationOpt migrationOpt, int i);

    /* renamed from: a */
    MigrationItem mo23242a(MigrationOpt migrationOpt, boolean z, boolean z2);

    /* renamed from: a */
    void mo23243a(long j);

    /* renamed from: b */
    int mo23244b(MigrationOpt migrationOpt);

    /* renamed from: c */
    int mo23245c(MigrationOpt migrationOpt);

    /* renamed from: com.bytedance.disk.a.a$a */
    public static abstract class AbstractBinderC14424a extends Binder implements AbstractC14423a {
        static {
            Covode.recordClassIndex(16502);
        }

        public IBinder asBinder() {
            return this;
        }

        public AbstractBinderC14424a() {
            attachInterface(this, "com.bytedance.disk.aidl.IMigrationManager");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            boolean z;
            boolean z2;
            if (i != 1598968902) {
                MigrationOpt migrationOpt = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.bytedance.disk.aidl.IMigrationManager");
                        if (parcel.readInt() != 0) {
                            migrationOpt = MigrationOpt.CREATOR.createFromParcel(parcel);
                        }
                        int a = mo23240a(migrationOpt);
                        parcel2.writeNoException();
                        parcel2.writeInt(a);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.bytedance.disk.aidl.IMigrationManager");
                        if (parcel.readInt() != 0) {
                            migrationOpt = MigrationOpt.CREATOR.createFromParcel(parcel);
                        }
                        int b = mo23244b(migrationOpt);
                        parcel2.writeNoException();
                        parcel2.writeInt(b);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.bytedance.disk.aidl.IMigrationManager");
                        if (parcel.readInt() != 0) {
                            migrationOpt = MigrationOpt.CREATOR.createFromParcel(parcel);
                        }
                        int a2 = mo23241a(migrationOpt, parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(a2);
                        return true;
                    case 4:
                        parcel.enforceInterface("com.bytedance.disk.aidl.IMigrationManager");
                        if (parcel.readInt() != 0) {
                            migrationOpt = MigrationOpt.CREATOR.createFromParcel(parcel);
                        }
                        int c = mo23245c(migrationOpt);
                        parcel2.writeNoException();
                        parcel2.writeInt(c);
                        return true;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        parcel.enforceInterface("com.bytedance.disk.aidl.IMigrationManager");
                        if (parcel.readInt() != 0) {
                            migrationOpt = MigrationOpt.CREATOR.createFromParcel(parcel);
                        }
                        if (parcel.readInt() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (parcel.readInt() != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        MigrationItem a3 = mo23242a(migrationOpt, z, z2);
                        parcel2.writeNoException();
                        if (a3 != null) {
                            parcel2.writeInt(1);
                            a3.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        parcel.enforceInterface("com.bytedance.disk.aidl.IMigrationManager");
                        mo23243a(parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.bytedance.disk.aidl.IMigrationManager");
                return true;
            }
        }
    }
}
