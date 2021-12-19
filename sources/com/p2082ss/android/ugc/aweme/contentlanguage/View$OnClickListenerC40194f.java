package com.p2082ss.android.ugc.aweme.contentlanguage;

import android.content.DialogInterface;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68343a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.contentlanguage.f */
final /* synthetic */ class View$OnClickListenerC40194f implements View.OnClickListener {

    /* renamed from: a */
    private final C40190d f94370a;

    /* renamed from: b */
    private final C68343a f94371b;

    static {
        Covode.recordClassIndex(47989);
    }

    View$OnClickListenerC40194f(C40190d dVar, C68343a aVar) {
        this.f94370a = dVar;
        this.f94371b = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C40190d dVar = this.f94370a;
        C68343a aVar = this.f94371b;
        if (aVar != null) {
            C17197a.C17200a aVar2 = new C17197a.C17200a(dVar.f94365b);
            aVar2.f41071b = dVar.f94365b.getString(R.string.f_f, new Object[]{aVar.getLocalName()});
            DialogInterface$OnClickListenerC40195g gVar = new DialogInterface$OnClickListenerC40195g(dVar, aVar);
            aVar2.mo27196b(dVar.f94365b.getString(R.string.a8y), (DialogInterface.OnClickListener) gVar, false);
            aVar2.mo27192a(dVar.f94365b.getString(R.string.f_7), (DialogInterface.OnClickListener) gVar, false);
            aVar2.mo27193a().mo27184b().setCancelable(false);
        }
    }
}
