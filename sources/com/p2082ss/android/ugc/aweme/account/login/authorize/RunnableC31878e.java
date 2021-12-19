package com.p2082ss.android.ugc.aweme.account.login.authorize;

import android.content.Intent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.account.login.authorize.e */
public final /* synthetic */ class RunnableC31878e implements Runnable {

    /* renamed from: a */
    private final AuthorizeActivity f76172a;

    /* renamed from: b */
    private final int f76173b;

    /* renamed from: c */
    private final Intent f76174c;

    static {
        Covode.recordClassIndex(38622);
    }

    RunnableC31878e(AuthorizeActivity authorizeActivity, int i, Intent intent) {
        this.f76172a = authorizeActivity;
        this.f76173b = i;
        this.f76174c = intent;
    }

    public final void run() {
        AuthorizeActivity authorizeActivity = this.f76172a;
        authorizeActivity.setResult(this.f76173b, this.f76174c);
        authorizeActivity.finish();
    }
}
