package com.p2082ss.android.ugc.aweme.account.p2280ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.account.ui.e */
final /* synthetic */ class View$OnClickListenerC32992e implements View.OnClickListener {

    /* renamed from: a */
    private final RecoverDeletedAccountActivity f78520a;

    static {
        Covode.recordClassIndex(39796);
    }

    View$OnClickListenerC32992e(RecoverDeletedAccountActivity recoverDeletedAccountActivity) {
        this.f78520a = recoverDeletedAccountActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        RecoverDeletedAccountActivity recoverDeletedAccountActivity = this.f78520a;
        recoverDeletedAccountActivity.f78510k.mo60107a(RecoverDeletedAccountActivity.f78500b, new C32994g(recoverDeletedAccountActivity));
    }
}
