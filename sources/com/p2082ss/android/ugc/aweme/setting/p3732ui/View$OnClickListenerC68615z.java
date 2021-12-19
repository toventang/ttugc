package com.p2082ss.android.ugc.aweme.setting.p3732ui;

import android.os.Handler;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.share.C68863ah;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.setting.ui.z */
public final /* synthetic */ class View$OnClickListenerC68615z implements View.OnClickListener {

    /* renamed from: a */
    private final AbstractActivityC68607v f153549a;

    static {
        Covode.recordClassIndex(80871);
    }

    View$OnClickListenerC68615z(AbstractActivityC68607v vVar) {
        this.f153549a = vVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        AbstractActivityC68607v vVar = this.f153549a;
        if (!C58001a.m104815a(view, 1200)) {
            C39162r.m79460a("click_share_person", new C33744d().mo59983a("enter_from", "settings_page").f79943a);
            User curUser = C31575b.m65865g().getCurUser();
            if (curUser != null) {
                C68863ah.f154027a.mo109408a((Handler) null, vVar, curUser, vVar.f153513ai);
            }
        }
    }
}
