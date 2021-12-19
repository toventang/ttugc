package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.bpea.basics.C13340a;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.entry.p873a.p874a.C13386a;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.bo */
final /* synthetic */ class View$OnClickListenerC64054bo implements View.OnClickListener {

    /* renamed from: a */
    private final C64048bm f145288a;

    static {
        Covode.recordClassIndex(75498);
    }

    View$OnClickListenerC64054bo(C64048bm bmVar) {
        this.f145288a = bmVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C64048bm bmVar = this.f145288a;
        Context context = bmVar.getContext();
        if (context != null) {
            String h = C64048bm.m115819h(bmVar.f145264V);
            ClipboardManager clipboardManager = (ClipboardManager) C64048bm.m115809a(context, "clipboard");
            ClipData newPlainText = ClipData.newPlainText(h, h);
            if (clipboardManager != null) {
                try {
                    C13386a.C13387a.m24072a(clipboardManager, newPlainText, PrivacyCert.Builder.with("bpea-109").usage("TikTok user can share user name or profile link to others. When username is clicked in user profile page, username is copied. In profile editing page, user's profile link can also be copied.").tag("clickToCopyUserLink").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build());
                    new C79459a(context).mo123052a(bmVar.getResources().getString(R.string.bk6)).mo123053a();
                    C39162r.m79460a("copy_link", new C33744d().mo59983a("enter_from", "edit_profile_page").mo59983a("link_type", "personal_link").f79943a);
                } catch (C13340a e) {
                    C51423a.m95788a("", e);
                }
            }
        }
    }
}
