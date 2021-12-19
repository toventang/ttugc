package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.video;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.comment.p2485b.C36294a;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36387c;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.video.c */
final /* synthetic */ class View$OnClickListenerC40019c implements View.OnClickListener {

    /* renamed from: a */
    private final C39986a f94042a;

    static {
        Covode.recordClassIndex(47785);
    }

    View$OnClickListenerC40019c(C39986a aVar) {
        this.f94042a = aVar;
    }

    public final void onClick(View view) {
        String str;
        ClickAgent.onClick(view);
        C39986a aVar = this.f94042a;
        if (C37699a.m76218U(aVar.f93984c)) {
            aVar.mo69174c(R.string.o7);
        }
        aVar.getContext();
        if (!C39986a.m80960e()) {
            aVar.mo69174c(R.string.dcp);
            return;
        }
        String str2 = "";
        if (aVar.f93986e) {
            C39088c cVar = aVar.f93985d;
            Object[] objArr = new Object[3];
            objArr[0] = "item_comment";
            objArr[1] = Integer.valueOf(C36294a.f85805d);
            objArr[2] = aVar.f93984c != null ? aVar.f93984c.getAid() : str2;
            cVar.mo57616a(objArr);
            aVar.f93986e = false;
            str = "off";
        } else {
            C39088c cVar2 = aVar.f93985d;
            Object[] objArr2 = new Object[3];
            objArr2[0] = "item_comment";
            objArr2[1] = Integer.valueOf(C36294a.f85802a);
            objArr2[2] = aVar.f93984c != null ? aVar.f93984c.getAid() : str2;
            cVar2.mo57616a(objArr2);
            aVar.f93986e = true;
            str = "on";
        }
        C39162r.m79460a("disable_video_comment", new C33744d().mo59983a("enter_from", "privacy_settings").mo59983a("group_id", aVar.f93984c != null ? aVar.f93984c.getAid() : str2).mo59983a("story_type", (aVar.f93984c == null || aVar.f93984c.getAwemeType() != 40) ? UGCMonitor.TYPE_POST : "story").mo59983a("to_status", str).f79943a);
        aVar.f93990i.mo70126a(new C40031o(aVar));
        if (aVar.f93984c != null) {
            AwemeService.m70060b().mo60685b(aVar.f93984c, aVar.f93986e ? C36294a.f85802a : C36294a.f85805d);
        }
        if (aVar.f93984c != null) {
            str2 = aVar.f93984c.getAid();
        }
        C36387c cVar3 = new C36387c(8, str2);
        cVar3.f86064d = aVar.f93984c;
        AbstractC81915c.m141874a(cVar3);
    }
}
