package com.p2082ss.android.ugc.aweme.account.p2280ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.utils.C80273bt;
import com.p2082ss.android.ugc.aweme.views.DialogC81438i;

/* renamed from: com.ss.android.ugc.aweme.account.ui.d */
final /* synthetic */ class View$OnClickListenerC32991d implements View.OnClickListener {

    /* renamed from: a */
    private final RecoverDeletedAccountActivity f78519a;

    static {
        Covode.recordClassIndex(39795);
    }

    View$OnClickListenerC32991d(RecoverDeletedAccountActivity recoverDeletedAccountActivity) {
        this.f78519a = recoverDeletedAccountActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        RecoverDeletedAccountActivity recoverDeletedAccountActivity = this.f78519a;
        if (!recoverDeletedAccountActivity.f78508i) {
            if (recoverDeletedAccountActivity.f78507h == null) {
                recoverDeletedAccountActivity.f78507h = new DialogC81438i(recoverDeletedAccountActivity);
            }
            C80273bt.m139145a(recoverDeletedAccountActivity.f78507h);
            C31575b.m65859a();
            C31575b.f75524a.mo57064a(new C32993f(recoverDeletedAccountActivity));
            recoverDeletedAccountActivity.f78508i = true;
            C31575b.m65860b().logout("recover_account", "user_logout");
        }
    }
}
