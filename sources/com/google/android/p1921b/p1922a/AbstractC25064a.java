package com.google.android.p1921b.p1922a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.p1920a.BinderC25062b;
import com.google.android.p1920a.C25061a;
import com.google.android.p1920a.C25063c;

/* renamed from: com.google.android.b.a.a */
public interface AbstractC25064a extends IInterface {
    static {
        Covode.recordClassIndex(30428);
    }

    /* renamed from: a */
    Bundle mo40982a(Bundle bundle);

    /* renamed from: com.google.android.b.a.a$a */
    public static abstract class AbstractBinderC25065a extends BinderC25062b implements AbstractC25064a {
        static {
            Covode.recordClassIndex(30429);
        }

        /* renamed from: com.google.android.b.a.a$a$a */
        public static class C25066a extends C25061a implements AbstractC25064a {
            static {
                Covode.recordClassIndex(30430);
            }

            public C25066a(IBinder iBinder) {
                super(iBinder);
                MethodCollector.m26663i(5842);
                MethodCollector.m26664o(5842);
            }

            @Override // com.google.android.p1921b.p1922a.AbstractC25064a
            /* renamed from: a */
            public final Bundle mo40982a(Bundle bundle) {
                MethodCollector.m26663i(5991);
                Parcel a = mo40976a();
                a.writeInt(1);
                bundle.writeToParcel(a, 0);
                Parcel a2 = mo40977a(a);
                Bundle bundle2 = (Bundle) C25063c.m48038a(a2, Bundle.CREATOR);
                a2.recycle();
                MethodCollector.m26664o(5991);
                return bundle2;
            }
        }

        @Override // com.google.android.p1920a.BinderC25062b
        /* renamed from: a */
        public final boolean mo40979a(int i, Parcel parcel, Parcel parcel2) {
            if (i != 1) {
                return false;
            }
            Bundle a = mo40982a((Bundle) C25063c.m48038a(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            if (a == null) {
                parcel2.writeInt(0);
            } else {
                parcel2.writeInt(1);
                a.writeToParcel(parcel2, 1);
            }
            return true;
        }
    }
}
