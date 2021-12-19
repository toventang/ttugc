package com.bytedance.android.livesdk.browser.p463d;

import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.browser.d.b */
final /* synthetic */ class View$OnClickListenerC6980b implements View.OnClickListener {

    /* renamed from: a */
    private final C6972a f17508a;

    static {
        Covode.recordClassIndex(7719);
    }

    View$OnClickListenerC6980b(C6972a aVar) {
        this.f17508a = aVar;
    }

    public final void onClick(View view) {
        C6972a aVar = this.f17508a;
        if (aVar.f17490p != null && (aVar.f17490p instanceof View$OnClickListenerC6986h)) {
            ((View$OnClickListenerC6986h) aVar.f17490p).mo13296b();
        }
    }
}
