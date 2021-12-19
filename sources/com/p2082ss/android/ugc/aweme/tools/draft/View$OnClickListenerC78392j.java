package com.p2082ss.android.ugc.aweme.tools.draft;

import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.tools.draft.p4104e.C78245a;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.j */
final /* synthetic */ class View$OnClickListenerC78392j implements View.OnClickListener {

    /* renamed from: a */
    private final C78386i f176131a;

    /* renamed from: b */
    private final C43223c f176132b;

    static {
        Covode.recordClassIndex(91518);
    }

    View$OnClickListenerC78392j(C78386i iVar, C43223c cVar) {
        this.f176131a = iVar;
        this.f176132b = cVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C78386i iVar = this.f176131a;
        C43223c cVar = this.f176132b;
        if (!C63244g.m114602a().mo73287o().mo104784d()) {
            C70005cr.m123611a();
            if (!C70005cr.m123613a(view.getContext())) {
                return;
            }
        }
        if (C63253l.f143623a.mo73306b().mo101747a(cVar.f100906f, iVar.f176129e, true)) {
            ActivityC0945e eVar = (ActivityC0945e) iVar.itemView.getContext();
            C78178ay.m136667a(eVar, cVar, new C78401l(iVar, eVar, cVar), new C78412m(iVar, C78245a.m136731a(eVar, C78398k.f176141a))).mo122037a();
        }
    }
}
