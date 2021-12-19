package com.google.android.gms.auth.api.credentials;

import android.app.PendingIntent;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.AbstractC25357i;
import com.google.android.gms.common.api.AbstractC25478k;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.auth.api.credentials.c */
public interface AbstractC25267c {
    static {
        Covode.recordClassIndex(30644);
    }

    /* renamed from: a */
    PendingIntent mo41312a(AbstractC25357i iVar, HintRequest hintRequest);

    /* renamed from: a */
    AbstractC25478k<Status> mo41313a(AbstractC25357i iVar, Credential credential);

    /* renamed from: a */
    AbstractC25478k<AbstractC25266b> mo41314a(AbstractC25357i iVar, CredentialRequest credentialRequest);
}
