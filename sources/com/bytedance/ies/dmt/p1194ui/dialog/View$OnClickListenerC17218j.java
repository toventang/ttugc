package com.bytedance.ies.dmt.p1194ui.dialog;

import android.os.Handler;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ies.dmt.ui.dialog.j */
public final /* synthetic */ class View$OnClickListenerC17218j implements View.OnClickListener {

    /* renamed from: a */
    private final C17197a f41128a;

    static {
        Covode.recordClassIndex(19679);
    }

    View$OnClickListenerC17218j(C17197a aVar) {
        this.f41128a = aVar;
    }

    public final void onClick(View view) {
        C17197a aVar = this.f41128a;
        if (!aVar.f41044g) {
            C17197a.m31761a(false, aVar.f41014a);
            new Handler().postDelayed(new RunnableC17203d(aVar), 100);
        }
        if (aVar.f41041d != null) {
            aVar.f41041d.onClick(aVar.f41045i, 1);
        }
    }
}
