package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.google.android.gms.common.internal.o */
public interface AbstractC25557o extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.o$a */
    public static abstract class AbstractBinderC25558a extends Binder implements AbstractC25557o {
        static {
            Covode.recordClassIndex(30961);
        }

        /* renamed from: com.google.android.gms.common.internal.o$a$a */
        static class C25559a implements AbstractC25557o {

            /* renamed from: a */
            private final IBinder f60632a;

            static {
                Covode.recordClassIndex(30962);
            }

            public final IBinder asBinder() {
                return this.f60632a;
            }

            C25559a(IBinder iBinder) {
                this.f60632a = iBinder;
            }

            @Override // com.google.android.gms.common.internal.AbstractC25557o
            /* renamed from: a */
            public final void mo41824a(AbstractC25555n nVar, GetServiceRequest getServiceRequest) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    if (nVar != null) {
                        iBinder = nVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (getServiceRequest != null) {
                        obtain.writeInt(1);
                        getServiceRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f60632a.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            AbstractC25555n amVar;
            if (i > 16777215) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IBinder readStrongBinder = parcel.readStrongBinder();
            GetServiceRequest getServiceRequest = null;
            if (readStrongBinder == null) {
                amVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
                if (queryLocalInterface instanceof AbstractC25555n) {
                    amVar = (AbstractC25555n) queryLocalInterface;
                } else {
                    amVar = new C25520am(readStrongBinder);
                }
            }
            if (i == 46) {
                if (parcel.readInt() != 0) {
                    getServiceRequest = GetServiceRequest.CREATOR.createFromParcel(parcel);
                }
                mo41824a(amVar, getServiceRequest);
                parcel2.writeNoException();
                return true;
            } else if (i == 47) {
                if (parcel.readInt() != 0) {
                    zzs.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            } else {
                parcel.readInt();
                if (i != 4) {
                    parcel.readString();
                    if (i != 1) {
                        if (!(i == 2 || i == 23 || i == 25 || i == 27)) {
                            if (i != 30) {
                                if (i != 34) {
                                    if (!(i == 41 || i == 43 || i == 37 || i == 38)) {
                                        switch (i) {
                                            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                                                parcel.readString();
                                                parcel.createStringArray();
                                                parcel.readString();
                                                parcel.readStrongBinder();
                                                parcel.readString();
                                                if (parcel.readInt() != 0) {
                                                    Bundle.CREATOR.createFromParcel(parcel);
                                                    break;
                                                }
                                                break;
                                            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                                                parcel.readString();
                                                parcel.createStringArray();
                                                break;
                                            case 19:
                                                parcel.readStrongBinder();
                                                if (parcel.readInt() != 0) {
                                                    Bundle.CREATOR.createFromParcel(parcel);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                } else {
                                    parcel.readString();
                                }
                            }
                            parcel.createStringArray();
                            parcel.readString();
                            if (parcel.readInt() != 0) {
                                Bundle.CREATOR.createFromParcel(parcel);
                            }
                        }
                        if (parcel.readInt() != 0) {
                            Bundle.CREATOR.createFromParcel(parcel);
                        }
                    } else {
                        parcel.readString();
                        parcel.createStringArray();
                        parcel.readString();
                        if (parcel.readInt() != 0) {
                            Bundle.CREATOR.createFromParcel(parcel);
                        }
                    }
                }
                throw new UnsupportedOperationException();
            }
        }
    }

    static {
        Covode.recordClassIndex(30960);
    }

    /* renamed from: a */
    void mo41824a(AbstractC25555n nVar, GetServiceRequest getServiceRequest);
}
