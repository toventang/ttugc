package com.bytedance.android.livesdk.widgets;

import android.view.View;
import com.bytedance.android.livesdk.C6889az;
import com.bytedance.android.livesdk.service.p624b.C10700d;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.widgets.b */
final /* synthetic */ class View$OnClickListenerC11437b implements View.OnClickListener {

    /* renamed from: a */
    private final LiveNewSpecialGiftWidget f27429a;

    static {
        Covode.recordClassIndex(13095);
    }

    View$OnClickListenerC11437b(LiveNewSpecialGiftWidget liveNewSpecialGiftWidget) {
        this.f27429a = liveNewSpecialGiftWidget;
    }

    public final void onClick(View view) {
        LiveNewSpecialGiftWidget liveNewSpecialGiftWidget = this.f27429a;
        if (liveNewSpecialGiftWidget.f27425b != null && liveNewSpecialGiftWidget.dataChannel != null) {
            C10700d dVar = new C10700d(liveNewSpecialGiftWidget.f27425b.f25759a, liveNewSpecialGiftWidget.f27425b.f25760b, liveNewSpecialGiftWidget.f27425b.f25766h);
            dVar.f25767i = liveNewSpecialGiftWidget.f27425b.f25767i;
            dVar.f25764f = liveNewSpecialGiftWidget.f27425b.f25764f;
            dVar.f25775q = liveNewSpecialGiftWidget.f27425b.f25775q;
            dVar.f25769k = true;
            liveNewSpecialGiftWidget.dataChannel.mo28320c(C6889az.class, dVar);
            liveNewSpecialGiftWidget.f27424a.mo17591a(new RunnableC11438c(liveNewSpecialGiftWidget));
        }
    }
}
