package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.AbstractC25551l;

/* renamed from: com.google.android.gms.common.internal.a */
public final class BinderC25507a extends AbstractC25551l.AbstractBinderC25552a {
    static {
        Covode.recordClassIndex(30910);
    }

    @Override // com.google.android.gms.common.internal.AbstractC25551l
    /* renamed from: a */
    public final Account mo41748a() {
        throw new NoSuchMethodError();
    }

    public final boolean equals(Object obj) {
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    public static Account m49195a(AbstractC25551l lVar) {
        if (lVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return lVar.mo41748a();
            } catch (RemoteException unused) {
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return null;
    }
}
