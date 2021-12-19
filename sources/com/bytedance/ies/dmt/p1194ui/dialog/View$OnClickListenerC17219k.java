package com.bytedance.ies.dmt.p1194ui.dialog;

import android.os.Handler;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ies.dmt.ui.dialog.k */
public final /* synthetic */ class View$OnClickListenerC17219k implements View.OnClickListener {

    /* renamed from: a */
    private final C17197a f41129a;

    static {
        Covode.recordClassIndex(19680);
    }

    View$OnClickListenerC17219k(C17197a aVar) {
        this.f41129a = aVar;
    }

    public final void onClick(View view) {
        C17197a aVar = this.f41129a;
        C17197a.m31761a(false, aVar.f41014a);
        new Handler().postDelayed(new RunnableC17222n(aVar), 100);
    }
}
