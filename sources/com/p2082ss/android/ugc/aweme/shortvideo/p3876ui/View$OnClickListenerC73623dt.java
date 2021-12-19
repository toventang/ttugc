package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.content.DialogInterface;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.p2082ss.android.ugc.trill.R;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.dt */
public final /* synthetic */ class View$OnClickListenerC73623dt implements View.OnClickListener {

    /* renamed from: a */
    private final C73560cj f165444a;

    static {
        Covode.recordClassIndex(86361);
    }

    View$OnClickListenerC73623dt(C73560cj cjVar) {
        this.f165444a = cjVar;
    }

    public final void onClick(View view) {
        MethodCollector.m26663i(10477);
        ClickAgent.onClick(view);
        C73560cj cjVar = this.f165444a;
        if (cjVar.f165259B.isChecked()) {
            cjVar.f165259B.setChecked(true);
            View inflate = View.inflate(cjVar.getContext(), R.layout.agc, null);
            inflate.findViewById(R.id.cni).setOnClickListener(View$OnClickListenerC73624du.f165445a);
            C17197a.C17200a aVar = new C17197a.C17200a(cjVar.getContext());
            aVar.f41088s = inflate;
            C17197a.C17200a b = aVar.mo27190a(R.string.eqn, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC73625dv(cjVar), false).mo27195b(R.string.eql, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC73626dw(cjVar), false);
            b.f41067M = false;
            b.mo27193a().mo27185c();
            MethodCollector.m26664o(10477);
            return;
        }
        cjVar.f165259B.setChecked(true);
        MethodCollector.m26664o(10477);
    }
}
