package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.profile.p3568b.C63497d;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.profile.ui.bs */
public final /* synthetic */ class View$OnClickListenerC64058bs implements View.OnClickListener {

    /* renamed from: a */
    private final C64048bm f145292a;

    static {
        Covode.recordClassIndex(75502);
    }

    View$OnClickListenerC64058bs(C64048bm bmVar) {
        this.f145292a = bmVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C64048bm bmVar = this.f145292a;
        C39162r.m79460a("edit_change_nonprofit_link", new C31376a().mo57399a("enter_from", "personal_homepage").mo57399a("user_id", C63497d.m115066a()).mo57399a("enter_method", "click_change_ngo_profile").f75156a);
        bmVar.mo103628i();
    }
}
