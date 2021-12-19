package com.google.android.gms.internal.p1942authapi;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.C25253a;
import com.google.android.gms.auth.api.credentials.AbstractC25266b;
import com.google.android.gms.auth.api.credentials.AbstractC25267c;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.api.AbstractC25357i;
import com.google.android.gms.common.api.AbstractC25478k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C25565r;

/* renamed from: com.google.android.gms.internal.auth-api.u */
public final class C25699u implements AbstractC25267c {
    static {
        Covode.recordClassIndex(31113);
    }

    @Override // com.google.android.gms.auth.api.credentials.AbstractC25267c
    /* renamed from: a */
    public final AbstractC25478k<Status> mo41313a(AbstractC25357i iVar, Credential credential) {
        C25565r.m49315a(iVar, "client must not be null");
        C25565r.m49315a(credential, "credential must not be null");
        return iVar.mo41526b(new C25700v(iVar, credential));
    }

    @Override // com.google.android.gms.auth.api.credentials.AbstractC25267c
    /* renamed from: a */
    public final AbstractC25478k<AbstractC25266b> mo41314a(AbstractC25357i iVar, CredentialRequest credentialRequest) {
        C25565r.m49315a(iVar, "client must not be null");
        C25565r.m49315a(credentialRequest, "request must not be null");
        return iVar.mo41518a(new C25698t(iVar, credentialRequest));
    }

    @Override // com.google.android.gms.auth.api.credentials.AbstractC25267c
    /* renamed from: a */
    public final PendingIntent mo41312a(AbstractC25357i iVar, HintRequest hintRequest) {
        String str;
        C25565r.m49315a(iVar, "client must not be null");
        C25565r.m49315a(hintRequest, "request must not be null");
        C25253a.C25254a aVar = ((C25704z) iVar.mo41517a(C25253a.f59865a)).f60840a;
        Context b = iVar.mo41525b();
        String str2 = aVar.f59878d;
        C25565r.m49315a(b, "context must not be null");
        C25565r.m49315a(hintRequest, "request must not be null");
        String str3 = aVar.f59876b;
        if (TextUtils.isEmpty(str2)) {
            str = C25692n.m49618a();
        } else {
            str = (String) C25565r.m49314a((Object) str2);
        }
        Intent putExtra = new Intent("com.google.android.gms.auth.api.credentials.PICKER").putExtra("claimedCallingPackage", str3);
        putExtra.putExtra("logSessionId", str);
        Parcel obtain = Parcel.obtain();
        hintRequest.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        putExtra.putExtra("com.google.android.gms.credentials.HintRequest", marshall);
        return PendingIntent.getActivity(b, LiveNetAdaptiveHurryTimeSetting.DEFAULT, putExtra, 134217728);
    }
}
