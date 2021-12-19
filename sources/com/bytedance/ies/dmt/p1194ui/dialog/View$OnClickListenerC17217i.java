package com.bytedance.ies.dmt.p1194ui.dialog;

import android.os.Handler;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ies.dmt.ui.dialog.i */
public final /* synthetic */ class View$OnClickListenerC17217i implements View.OnClickListener {

    /* renamed from: a */
    private final C17197a f41127a;

    static {
        Covode.recordClassIndex(19678);
    }

    View$OnClickListenerC17217i(C17197a aVar) {
        this.f41127a = aVar;
    }

    public final void onClick(View view) {
        C17197a aVar = this.f41127a;
        if (!aVar.f41042e) {
            C17197a.m31761a(false, aVar.f41014a);
            new Handler().postDelayed(new RunnableC17213e(aVar), 100);
        }
        if (aVar.f41039b != null) {
            aVar.f41039b.onClick(aVar.f41045i, 1);
        }
    }
}
