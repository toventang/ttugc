package com.bytedance.ies.dmt.p1194ui.dialog;

import android.os.Handler;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ies.dmt.ui.dialog.h */
public final /* synthetic */ class View$OnClickListenerC17216h implements View.OnClickListener {

    /* renamed from: a */
    private final C17197a f41126a;

    static {
        Covode.recordClassIndex(19677);
    }

    View$OnClickListenerC17216h(C17197a aVar) {
        this.f41126a = aVar;
    }

    public final void onClick(View view) {
        C17197a aVar = this.f41126a;
        if (!aVar.f41043f) {
            C17197a.m31761a(false, aVar.f41014a);
            new Handler().postDelayed(new RunnableC17214f(aVar), 100);
        }
        if (aVar.f41040c != null) {
            aVar.f41040c.onClick(aVar.f41045i, 0);
        }
    }
}
