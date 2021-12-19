package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.comment.p2485b.C36294a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.trill.R;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.af */
public final /* synthetic */ class View$OnClickListenerC73453af implements View.OnClickListener {

    /* renamed from: a */
    private final C73452ae f165001a;

    static {
        Covode.recordClassIndex(86190);
    }

    View$OnClickListenerC73453af(C73452ae aeVar) {
        this.f165001a = aeVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C73452ae aeVar = this.f165001a;
        if (aeVar.f164999c == null || aeVar.f164999c.f152996r != C36294a.f85805d) {
            aeVar.f164997a.setChecked(!aeVar.f164997a.mo27138d());
            if (aeVar.f164998b != null && aeVar.f164997a != null) {
                aeVar.f164998b.put("to_status", aeVar.f164997a.mo27138d() ? "off" : "on");
                C39162r.m79460a("disable_comment", aeVar.f164998b);
                return;
            }
            return;
        }
        new C23144b(aeVar.f164997a).mo37640e(R.string.sy).mo37637b();
    }
}
