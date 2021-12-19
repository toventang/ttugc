package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.room.d */
public interface AbstractC1512d extends IInterface {

    /* renamed from: androidx.room.d$a */
    public static abstract class AbstractBinderC1513a extends Binder implements AbstractC1512d {
        static {
            Covode.recordClassIndex(1652);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: androidx.room.d$a$a */
        static class C1514a implements AbstractC1512d {

            /* renamed from: a */
            private IBinder f4985a;

            static {
                Covode.recordClassIndex(1653);
            }

            public final IBinder asBinder() {
                return this.f4985a;
            }

            C1514a(IBinder iBinder) {
                this.f4985a = iBinder;
            }

            @Override // androidx.room.AbstractC1512d
            /* renamed from: a */
            public final void mo5060a(String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    this.f4985a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC1513a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        /* renamed from: a */
        public static AbstractC1512d m5143a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC1512d)) {
                return new C1514a(iBinder);
            }
            return (AbstractC1512d) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
                mo5060a(parcel.createStringArray());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(1651);
    }

    /* renamed from: a */
    void mo5060a(String[] strArr);
}
