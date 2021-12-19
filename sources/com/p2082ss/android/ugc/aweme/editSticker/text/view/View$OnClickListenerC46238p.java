package com.p2082ss.android.ugc.aweme.editSticker.text.view;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46109s;
import com.p2082ss.android.ugc.tools.view.C84916a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.editSticker.text.view.p */
public final /* synthetic */ class View$OnClickListenerC46238p implements View.OnClickListener {

    /* renamed from: a */
    private final C46224i f107731a;

    static {
        Covode.recordClassIndex(54800);
    }

    View$OnClickListenerC46238p(C46224i iVar) {
        this.f107731a = iVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C46224i iVar = this.f107731a;
        C46109s a = C46109s.m88954a();
        a.f107369b++;
        if (a.f107369b == a.f107368a.size()) {
            a.f107369b = 0;
        }
        iVar.f107714u.setBackground(C84916a.m145949a(C46109s.m88954a().mo78297b().f107364a, GradientDrawable.Orientation.TR_BL));
    }
}
