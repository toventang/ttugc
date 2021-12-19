package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.i.j */
public final /* synthetic */ class View$OnClickListenerC57312j implements View.OnClickListener {

    /* renamed from: a */
    private final C57310i f130595a;

    static {
        Covode.recordClassIndex(67217);
    }

    View$OnClickListenerC57312j(C57310i iVar) {
        this.f130595a = iVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C57310i iVar = this.f130595a;
        if (!C58001a.m104815a(view, 1200) && iVar.f130582f != null) {
            iVar.f130582f.mo94379a(null, view, null);
        }
    }
}
