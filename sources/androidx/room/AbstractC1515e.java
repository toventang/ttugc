package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.room.AbstractC1512d;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.room.e */
public interface AbstractC1515e extends IInterface {

    /* renamed from: androidx.room.e$a */
    public static abstract class AbstractBinderC1516a extends Binder implements AbstractC1515e {
        static {
            Covode.recordClassIndex(1655);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: androidx.room.e$a$a */
        static class C1517a implements AbstractC1515e {

            /* renamed from: a */
            private IBinder f4986a;

            static {
                Covode.recordClassIndex(1656);
            }

            public final IBinder asBinder() {
                return this.f4986a;
            }

            C1517a(IBinder iBinder) {
                this.f4986a = iBinder;
            }

            @Override // androidx.room.AbstractC1515e
            /* renamed from: a */
            public final void mo5040a(int i, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeInt(i);
                    obtain.writeStringArray(strArr);
                    this.f4986a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.room.AbstractC1515e
            /* renamed from: a */
            public final int mo5039a(AbstractC1512d dVar, String str) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    if (dVar != null) {
                        iBinder = dVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    this.f4986a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.room.AbstractC1515e
            /* renamed from: a */
            public final void mo5041a(AbstractC1512d dVar, int i) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    if (dVar != null) {
                        iBinder = dVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    this.f4986a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC1516a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                int a = mo5039a(AbstractC1512d.AbstractBinderC1513a.m5143a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(a);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                mo5041a(AbstractC1512d.AbstractBinderC1513a.m5143a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                mo5040a(parcel.readInt(), parcel.createStringArray());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(1654);
    }

    /* renamed from: a */
    int mo5039a(AbstractC1512d dVar, String str);

    /* renamed from: a */
    void mo5040a(int i, String[] strArr);

    /* renamed from: a */
    void mo5041a(AbstractC1512d dVar, int i);
}
