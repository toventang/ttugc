package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.p1946e.BinderC25728a;
import com.google.android.gms.internal.p1946e.C25730c;

/* renamed from: com.google.android.gms.common.internal.n */
public interface AbstractC25555n extends IInterface {
    static {
        Covode.recordClassIndex(30958);
    }

    /* renamed from: a */
    void mo41770a(int i, Bundle bundle);

    /* renamed from: a */
    void mo41771a(int i, IBinder iBinder, Bundle bundle);

    /* renamed from: a */
    void mo41772a(int i, IBinder iBinder, zza zza);

    /* renamed from: com.google.android.gms.common.internal.n$a */
    public static abstract class AbstractBinderC25556a extends BinderC25728a implements AbstractC25555n {
        static {
            Covode.recordClassIndex(30959);
        }

        public AbstractBinderC25556a() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        @Override // com.google.android.gms.internal.p1946e.BinderC25728a
        /* renamed from: a */
        public final boolean mo41769a(int i, Parcel parcel, Parcel parcel2) {
            if (i == 1) {
                mo41771a(parcel.readInt(), parcel.readStrongBinder(), (Bundle) C25730c.m49682a(parcel, Bundle.CREATOR));
            } else if (i == 2) {
                mo41770a(parcel.readInt(), (Bundle) C25730c.m49682a(parcel, Bundle.CREATOR));
            } else if (i != 3) {
                return false;
            } else {
                mo41772a(parcel.readInt(), parcel.readStrongBinder(), (zza) C25730c.m49682a(parcel, zza.CREATOR));
            }
            parcel2.writeNoException();
            return true;
        }
    }
}
