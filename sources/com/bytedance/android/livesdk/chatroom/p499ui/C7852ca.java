package com.bytedance.android.livesdk.chatroom.p499ui;

import android.widget.FrameLayout;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePauseLiveSetting;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ca */
final /* synthetic */ class C7852ca implements AbstractC89172b {

    /* renamed from: a */
    private final C7822br f19572a;

    static {
        Covode.recordClassIndex(8647);
    }

    C7852ca(C7822br brVar) {
        this.f19572a = brVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        C7822br brVar = this.f19572a;
        if (brVar.f19500h == EnumC11728i.SCREEN_RECORD && LivePauseLiveSetting.INSTANCE.pauseLiveEnabled()) {
            int measuredWidth = brVar.f19404C.f19173a.getMeasuredWidth();
            int measuredHeight = brVar.f19404C.f19173a.getMeasuredHeight();
            if (measuredWidth != 0 && measuredWidth >= measuredHeight) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) brVar.f19409H.getLayoutParams();
                if (brVar.f19506n == 1) {
                    layoutParams.width = measuredWidth;
                    layoutParams.height = measuredHeight;
                    layoutParams.topMargin = C3966y.m9653a(C7822br.f19401b);
                } else {
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                    layoutParams.topMargin = 0;
                }
                brVar.f19409H.setGravity(17);
                brVar.f19409H.setPadding(0, 0, 0, 0);
                brVar.f19409H.setLayoutParams(layoutParams);
            }
        }
        return C89391z.f203057a;
    }
}
