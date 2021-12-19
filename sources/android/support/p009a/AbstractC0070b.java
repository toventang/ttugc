package android.support.p009a;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.p009a.AbstractC0067a;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.List;

/* renamed from: android.support.a.b */
public interface AbstractC0070b extends IInterface {

    /* renamed from: android.support.a.b$a */
    public static abstract class AbstractBinderC0071a extends Binder implements AbstractC0070b {
        static {
            Covode.recordClassIndex(74);
        }

        /* renamed from: android.support.a.b$a$a */
        public static class C0072a implements AbstractC0070b {

            /* renamed from: a */
            private IBinder f241a;

            static {
                Covode.recordClassIndex(75);
            }

            public final IBinder asBinder() {
                return this.f241a;
            }

            @Override // android.support.p009a.AbstractC0070b
            /* renamed from: a */
            public final boolean mo60a(AbstractC0067a aVar, Uri uri, Bundle bundle, List<Bundle> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    boolean z = true;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeTypedList(list);
                    this.f241a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.p009a.AbstractC0070b
            /* renamed from: a */
            public final boolean mo61a(AbstractC0067a aVar, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    boolean z = true;
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f241a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C0072a(IBinder iBinder) {
                this.f241a = iBinder;
            }

            @Override // android.support.p009a.AbstractC0070b
            /* renamed from: a */
            public final boolean mo56a(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeLong(j);
                    boolean z = false;
                    this.f241a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.p009a.AbstractC0070b
            /* renamed from: a */
            public final boolean mo57a(AbstractC0067a aVar) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    boolean z = false;
                    this.f241a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.p009a.AbstractC0070b
            /* renamed from: a */
            public final Bundle mo55a(String str, Bundle bundle) {
                Bundle bundle2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f241a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(obtain2);
                    } else {
                        bundle2 = null;
                    }
                    return bundle2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.p009a.AbstractC0070b
            /* renamed from: a */
            public final boolean mo59a(AbstractC0067a aVar, Uri uri) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    boolean z = true;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f241a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.p009a.AbstractC0070b
            /* renamed from: a */
            public final int mo54a(AbstractC0067a aVar, String str, Bundle bundle) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f241a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.p009a.AbstractC0070b
            /* renamed from: a */
            public final boolean mo58a(AbstractC0067a aVar, int i, Uri uri, Bundle bundle) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    boolean z = true;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f241a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            Uri uri;
            Uri uri2;
            if (i != 1598968902) {
                Bundle bundle = null;
                Bundle bundle2 = null;
                Bundle bundle3 = null;
                Uri uri3 = null;
                Bundle bundle4 = null;
                Bundle bundle5 = null;
                switch (i) {
                    case 2:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                        boolean a = mo56a(parcel.readLong());
                        parcel2.writeNoException();
                        parcel2.writeInt(a ? 1 : 0);
                        return true;
                    case 3:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                        boolean a2 = mo57a(AbstractC0067a.AbstractBinderC0068a.m108a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        parcel2.writeInt(a2 ? 1 : 0);
                        return true;
                    case 4:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                        AbstractC0067a a3 = AbstractC0067a.AbstractBinderC0068a.m108a(parcel.readStrongBinder());
                        if (parcel.readInt() != 0) {
                            uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                        } else {
                            uri = null;
                        }
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        boolean a4 = mo60a(a3, uri, bundle, parcel.createTypedArrayList(Bundle.CREATOR));
                        parcel2.writeNoException();
                        parcel2.writeInt(a4 ? 1 : 0);
                        return true;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                        String readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle5 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        Bundle a5 = mo55a(readString, bundle5);
                        parcel2.writeNoException();
                        if (a5 != null) {
                            parcel2.writeInt(1);
                            a5.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                        AbstractC0067a a6 = AbstractC0067a.AbstractBinderC0068a.m108a(parcel.readStrongBinder());
                        if (parcel.readInt() != 0) {
                            bundle4 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        boolean a7 = mo61a(a6, bundle4);
                        parcel2.writeNoException();
                        parcel2.writeInt(a7 ? 1 : 0);
                        return true;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                        AbstractC0067a a8 = AbstractC0067a.AbstractBinderC0068a.m108a(parcel.readStrongBinder());
                        if (parcel.readInt() != 0) {
                            uri3 = (Uri) Uri.CREATOR.createFromParcel(parcel);
                        }
                        boolean a9 = mo59a(a8, uri3);
                        parcel2.writeNoException();
                        parcel2.writeInt(a9 ? 1 : 0);
                        return true;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                        AbstractC0067a a10 = AbstractC0067a.AbstractBinderC0068a.m108a(parcel.readStrongBinder());
                        String readString2 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle3 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        int a11 = mo54a(a10, readString2, bundle3);
                        parcel2.writeNoException();
                        parcel2.writeInt(a11);
                        return true;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                        AbstractC0067a a12 = AbstractC0067a.AbstractBinderC0068a.m108a(parcel.readStrongBinder());
                        int readInt = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            uri2 = (Uri) Uri.CREATOR.createFromParcel(parcel);
                        } else {
                            uri2 = null;
                        }
                        if (parcel.readInt() != 0) {
                            bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        boolean a13 = mo58a(a12, readInt, uri2, bundle2);
                        parcel2.writeNoException();
                        parcel2.writeInt(a13 ? 1 : 0);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("android.support.customtabs.ICustomTabsService");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(73);
    }

    /* renamed from: a */
    int mo54a(AbstractC0067a aVar, String str, Bundle bundle);

    /* renamed from: a */
    Bundle mo55a(String str, Bundle bundle);

    /* renamed from: a */
    boolean mo56a(long j);

    /* renamed from: a */
    boolean mo57a(AbstractC0067a aVar);

    /* renamed from: a */
    boolean mo58a(AbstractC0067a aVar, int i, Uri uri, Bundle bundle);

    /* renamed from: a */
    boolean mo59a(AbstractC0067a aVar, Uri uri);

    /* renamed from: a */
    boolean mo60a(AbstractC0067a aVar, Uri uri, Bundle bundle, List<Bundle> list);

    /* renamed from: a */
    boolean mo61a(AbstractC0067a aVar, Bundle bundle);
}
