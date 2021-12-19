package com.google.android.gms.common.api.internal;

import android.os.Build;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C25450f;

/* renamed from: com.google.android.gms.common.api.internal.bn */
public abstract class AbstractC25404bn {

    /* renamed from: a */
    private final int f60278a;

    static {
        Covode.recordClassIndex(30803);
    }

    /* renamed from: a */
    public abstract void mo41621a(Status status);

    /* renamed from: a */
    public abstract void mo41622a(C25441cv cvVar, boolean z);

    /* renamed from: a */
    public abstract void mo41623a(RuntimeException runtimeException);

    /* renamed from: c */
    public abstract void mo41624c(C25450f.C25451a<?> aVar);

    public AbstractC25404bn(int i) {
        this.f60278a = i;
    }

    /* renamed from: a */
    static /* synthetic */ Status m48932a(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        int i = Build.VERSION.SDK_INT;
        if (remoteException instanceof TransactionTooLargeException) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }
}
