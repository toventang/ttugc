package com.bytedance.android.livesdk.chatroom.p499ui;

import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.bv */
final /* synthetic */ class C7846bv implements AbstractC89172b {

    /* renamed from: a */
    private final C7822br f19566a;

    static {
        Covode.recordClassIndex(8641);
    }

    C7846bv(C7822br brVar) {
        this.f19566a = brVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        C7822br brVar = this.f19566a;
        Integer num = (Integer) obj;
        if (!(brVar.f19460ag == null || brVar.f19407F == null)) {
            brVar.f19509q = num.intValue();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            if (brVar.f19506n == 1) {
                layoutParams.topMargin = brVar.f19509q;
                layoutParams.gravity = 1;
            } else {
                layoutParams.leftMargin = brVar.f19407F.getWidth() / 2;
                layoutParams.gravity = 16;
            }
            brVar.f19460ag.setLayoutParams(layoutParams);
        }
        return C89391z.f203057a;
    }
}
