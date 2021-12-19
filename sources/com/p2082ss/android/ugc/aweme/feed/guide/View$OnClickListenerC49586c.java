package com.p2082ss.android.ugc.aweme.feed.guide;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51735f;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.guide.c */
public final /* synthetic */ class View$OnClickListenerC49586c implements View.OnClickListener {

    /* renamed from: a */
    private final EmptyGuideV2 f114089a;

    static {
        Covode.recordClassIndex(58432);
    }

    View$OnClickListenerC49586c(EmptyGuideV2 emptyGuideV2) {
        this.f114089a = emptyGuideV2;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        EmptyGuideV2 emptyGuideV2 = this.f114089a;
        if (emptyGuideV2.f114038e != null) {
            C39162r.onEvent(MobClick.obtain().setEventName("phone_number").setLabelName("click"));
            Fragment c = emptyGuideV2.f114041h.mo81378c();
            if (!C51648a.f118980a.mo87309a(emptyGuideV2.f114038e)) {
                new C79459a(emptyGuideV2.f114038e).mo123050a(R.string.sk).mo123053a();
                C51648a.f118980a.mo87305a(emptyGuideV2.f114038e, new AbstractC51735f() {
                    /* class com.p2082ss.android.ugc.aweme.feed.guide.EmptyGuideV2.C495723 */

                    static {
                        Covode.recordClassIndex(58415);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51735f
                    /* renamed from: b */
                    public final void mo79932b() {
                    }

                    @Override // com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51735f
                    /* renamed from: a */
                    public final void mo79931a() {
                        Fragment c = EmptyGuideV2.this.f114041h.mo81378c();
                        if (c != null) {
                            SmartRouter.buildFragmentRoute(c, "//friends/contacts").withParam("just_granted_read_contacts", true).open(1);
                        } else {
                            SmartRouter.buildRoute(EmptyGuideV2.this.f114038e, "//friends/contacts").withParam("just_granted_read_contacts", true).open();
                        }
                    }
                });
            } else if (c != null) {
                SmartRouter.buildFragmentRoute(c, "//friends/contacts").open(1);
            } else {
                SmartRouter.buildRoute(emptyGuideV2.f114038e, "//friends/contacts").open();
            }
        }
    }
}
