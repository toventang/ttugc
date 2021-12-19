package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.ci */
public final class RunnableC25428ci implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AbstractDialogInterface$OnCancelListenerC25427ch f60336a;

    /* renamed from: b */
    private final C25429cj f60337b;

    static {
        Covode.recordClassIndex(30827);
    }

    public final void run() {
        if (this.f60336a.f60333d) {
            ConnectionResult connectionResult = this.f60337b.f60339b;
            if (connectionResult.mo41433a()) {
                this.f60336a.f60170a.startActivityForResult(GoogleApiActivity.m48711a(this.f60336a.mo41552a(), connectionResult.f60083c, this.f60337b.f60338a, false), 1);
            } else if (this.f60336a.f60335f.isUserResolvableError(connectionResult.f60082b)) {
                this.f60336a.f60335f.zaa(this.f60336a.mo41552a(), this.f60336a.f60170a, connectionResult.f60082b, 2, this.f60336a);
            } else if (connectionResult.f60082b == 18) {
                Dialog zaa = GoogleApiAvailability.zaa(this.f60336a.mo41552a(), this.f60336a);
                GoogleApiAvailability googleApiAvailability = this.f60336a.f60335f;
                Context applicationContext = this.f60336a.mo41552a().getApplicationContext();
                if (C58003a.f132201c && applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
                googleApiAvailability.zaa(applicationContext, new C25430ck(this, zaa));
            } else {
                this.f60336a.mo41653a(connectionResult, this.f60337b.f60338a);
            }
        }
    }

    RunnableC25428ci(AbstractDialogInterface$OnCancelListenerC25427ch chVar, C25429cj cjVar) {
        this.f60336a = chVar;
        this.f60337b = cjVar;
    }
}
