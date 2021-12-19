package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.common.api.n */
public final class C25483n extends C25351e {
    static {
        Covode.recordClassIndex(30882);
    }

    public final PendingIntent getResolution() {
        return this.f60116a.f60109i;
    }

    public C25483n(Status status) {
        super(status);
    }

    public final void startResolutionForResult(Activity activity, int i) {
        Status status = this.f60116a;
        if (status.mo41476b()) {
            activity.startIntentSenderForResult(status.f60109i.getIntentSender(), i, null, 0, 0, 0);
        }
    }
}
