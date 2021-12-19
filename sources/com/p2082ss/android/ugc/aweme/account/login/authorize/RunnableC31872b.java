package com.p2082ss.android.ugc.aweme.account.login.authorize;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.authorize.b */
final /* synthetic */ class RunnableC31872b implements Runnable {

    /* renamed from: a */
    private final AuthorizeActivity f76167a;

    static {
        Covode.recordClassIndex(38616);
    }

    RunnableC31872b(AuthorizeActivity authorizeActivity) {
        this.f76167a = authorizeActivity;
    }

    public final void run() {
        AuthorizeActivity authorizeActivity = this.f76167a;
        Context applicationContext = authorizeActivity.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        new C79459a(applicationContext).mo123050a(R.string.cyq).mo123053a();
        authorizeActivity.mo57795a(0, new Intent());
        C36085cj.m73555i();
    }
}
