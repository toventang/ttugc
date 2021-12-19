package android.support.p010v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

/* renamed from: android.support.v4.app.a */
public interface AbstractC0073a extends IInterface {

    /* renamed from: android.support.v4.app.a$a */
    public static abstract class AbstractBinderC0074a extends Binder implements AbstractC0073a {
        static {
            Covode.recordClassIndex(78);
        }

        /* renamed from: android.support.v4.app.a$a$a */
        public static class C0075a implements AbstractC0073a {

            /* renamed from: a */
            public static AbstractC0073a f242a;

            /* renamed from: b */
            private IBinder f243b;

            static {
                Covode.recordClassIndex(79);
            }

            public final IBinder asBinder() {
                return this.f243b;
            }

            public C0075a(IBinder iBinder) {
                this.f243b = iBinder;
            }

            @Override // android.support.p010v4.app.AbstractC0073a
            /* renamed from: a */
            public final void mo64a(String str) {
                AbstractC0073a aVar;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    if (this.f243b.transact(3, obtain, null, 1) || (aVar = f242a) == null) {
                        obtain.recycle();
                    } else {
                        aVar.mo64a(str);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.p010v4.app.AbstractC0073a
            /* renamed from: a */
            public final void mo65a(String str, int i, String str2) {
                AbstractC0073a aVar;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (this.f243b.transact(2, obtain, null, 1) || (aVar = f242a) == null) {
                        obtain.recycle();
                    } else {
                        aVar.mo65a(str, i, str2);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.p010v4.app.AbstractC0073a
            /* renamed from: a */
            public final void mo66a(String str, int i, String str2, Notification notification) {
                AbstractC0073a aVar;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f243b.transact(1, obtain, null, 1) || (aVar = f242a) == null) {
                        obtain.recycle();
                    } else {
                        aVar.mo66a(str, i, str2, notification);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            Notification notification;
            if (i == 1) {
                parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                String readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    notification = (Notification) Notification.CREATOR.createFromParcel(parcel);
                } else {
                    notification = null;
                }
                mo66a(readString, readInt, readString2, notification);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
                mo65a(parcel.readString(), parcel.readInt(), parcel.readString());
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
                mo64a(parcel.readString());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("android.support.v4.app.INotificationSideChannel");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(77);
    }

    /* renamed from: a */
    void mo64a(String str);

    /* renamed from: a */
    void mo65a(String str, int i, String str2);

    /* renamed from: a */
    void mo66a(String str, int i, String str2, Notification notification);
}
