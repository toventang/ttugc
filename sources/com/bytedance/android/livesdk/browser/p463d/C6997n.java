package com.bytedance.android.livesdk.browser.p463d;

import com.bytedance.android.live.uikit.layout.FullscreenVideoFrame;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.browser.d.n */
final /* synthetic */ class C6997n implements FullscreenVideoFrame.AbstractC6231a {

    /* renamed from: a */
    private final View$OnClickListenerC6986h f17581a;

    static {
        Covode.recordClassIndex(7736);
    }

    C6997n(View$OnClickListenerC6986h hVar) {
        this.f17581a = hVar;
    }

    @Override // com.bytedance.android.live.uikit.layout.FullscreenVideoFrame.AbstractC6231a
    /* renamed from: a */
    public final void mo12197a() {
        View$OnClickListenerC6986h hVar = this.f17581a;
        if (hVar.f17556n != null) {
            hVar.f17556n.onHideCustomView();
        }
    }
}
