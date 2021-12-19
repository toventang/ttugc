package com.p2082ss.android.ugc.aweme.shortvideo;

import android.content.DialogInterface;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73756j;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.cg */
public final /* synthetic */ class View$OnClickListenerC69925cg implements View.OnClickListener {

    /* renamed from: a */
    private final C69924cf f156265a;

    /* renamed from: b */
    private final AbstractC69923ce f156266b;

    /* renamed from: c */
    private final AbstractC73756j f156267c;

    /* renamed from: d */
    private final boolean f156268d;

    /* renamed from: e */
    private final boolean f156269e;

    /* renamed from: f */
    private final DialogInterface.OnDismissListener f156270f;

    static {
        Covode.recordClassIndex(82334);
    }

    View$OnClickListenerC69925cg(C69924cf cfVar, AbstractC69923ce ceVar, AbstractC73756j jVar, boolean z, boolean z2, DialogInterface.OnDismissListener onDismissListener) {
        this.f156265a = cfVar;
        this.f156266b = ceVar;
        this.f156267c = jVar;
        this.f156268d = z;
        this.f156269e = z2;
        this.f156270f = onDismissListener;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C69924cf cfVar = this.f156265a;
        AbstractC69923ce ceVar = this.f156266b;
        AbstractC73756j jVar = this.f156267c;
        boolean z = this.f156268d;
        boolean z2 = this.f156269e;
        DialogInterface.OnDismissListener onDismissListener = this.f156270f;
        if (cfVar.f156261e != null) {
            cfVar.mo110334a(ceVar, jVar, z, z2);
            cfVar.f156261e.mo110457a(cfVar.f156257a, null, onDismissListener);
        }
    }
}
