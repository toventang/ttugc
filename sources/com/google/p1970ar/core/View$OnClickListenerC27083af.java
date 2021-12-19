package com.google.p1970ar.core;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.google.p1970ar.core.exceptions.UnavailableUserDeclinedInstallationException;

/* access modifiers changed from: package-private */
/* renamed from: com.google.ar.core.af */
public final class View$OnClickListenerC27083af implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ InstallActivity f64079a;

    /* renamed from: b */
    private final /* synthetic */ int f64080b;

    static {
        Covode.recordClassIndex(32632);
    }

    View$OnClickListenerC27083af(InstallActivity installActivity) {
        this.f64079a = installActivity;
    }

    View$OnClickListenerC27083af(InstallActivity installActivity, byte b) {
        this.f64080b = 1;
        this.f64079a = installActivity;
    }

    public final void onClick(View view) {
        if (this.f64080b != 0) {
            this.f64079a.finishWithFailure(new UnavailableUserDeclinedInstallationException());
            return;
        }
        this.f64079a.animateToSpinner();
        this.f64079a.startInstaller();
    }
}
