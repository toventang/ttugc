package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.comment.ui.at */
public final /* synthetic */ class View$OnClickListenerC37028at implements View.OnClickListener {

    /* renamed from: a */
    private final C37157k f87213a;

    static {
        Covode.recordClassIndex(44382);
    }

    View$OnClickListenerC37028at(C37157k kVar) {
        this.f87213a = kVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C37157k kVar = this.f87213a;
        int i = 0;
        if (!Keva.getRepo("keva_repo_batch").getBoolean("keva_key_portal" + C31575b.m65865g().getCurUserId(), false)) {
            Keva.getRepo("keva_repo_batch").storeBoolean("keva_key_portal" + C31575b.m65865g().getCurUserId(), true);
            i = 1;
        }
        C39162r.m79460a("comment_batch_management_portal_left_ck", new C33744d().mo59980a("is_first", i).f79943a);
        kVar.mo64728u();
    }
}
