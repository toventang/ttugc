package com.p2082ss.android.ugc.aweme.choosemusic.viewholder;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.n */
public final /* synthetic */ class View$OnClickListenerC36019n implements View.OnClickListener {

    /* renamed from: a */
    private final C36017m f85070a;

    static {
        Covode.recordClassIndex(43265);
    }

    View$OnClickListenerC36019n(C36017m mVar) {
        this.f85070a = mVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C36017m mVar = this.f85070a;
        if (!C58001a.m104815a(view, 1200) && mVar.f85057f != null) {
            mVar.f85057f.mo62753a(null, view, null, 0);
        }
    }
}
