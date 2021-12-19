package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.internal.p1946e.BinderC25728a;
import com.google.android.gms.internal.p1946e.C25729b;
import com.google.android.gms.internal.p1946e.C25730c;

/* renamed from: com.google.android.gms.common.internal.l */
public interface AbstractC25551l extends IInterface {
    static {
        Covode.recordClassIndex(30954);
    }

    /* renamed from: a */
    Account mo41748a();

    /* renamed from: com.google.android.gms.common.internal.l$a */
    public static abstract class AbstractBinderC25552a extends BinderC25728a implements AbstractC25551l {
        static {
            Covode.recordClassIndex(30955);
        }

        /* renamed from: com.google.android.gms.common.internal.l$a$a */
        public static class C25553a extends C25729b implements AbstractC25551l {
            static {
                Covode.recordClassIndex(30956);
            }

            @Override // com.google.android.gms.common.internal.AbstractC25551l
            /* renamed from: a */
            public final Account mo41748a() {
                MethodCollector.m26663i(8055);
                Parcel a = mo41960a(2, mo41963c());
                Account account = (Account) C25730c.m49682a(a, Account.CREATOR);
                a.recycle();
                MethodCollector.m26664o(8055);
                return account;
            }

            C25553a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                MethodCollector.m26663i(7906);
                MethodCollector.m26664o(7906);
            }
        }

        /* renamed from: a */
        public static AbstractC25551l m49297a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface instanceof AbstractC25551l) {
                return (AbstractC25551l) queryLocalInterface;
            }
            return new C25553a(iBinder);
        }

        @Override // com.google.android.gms.internal.p1946e.BinderC25728a
        /* renamed from: a */
        public final boolean mo41769a(int i, Parcel parcel, Parcel parcel2) {
            if (i != 2) {
                return false;
            }
            Account a = mo41748a();
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
