package com.bytedance.android.live.liveinteract.cohost.widget;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.live.liveinteract.platform.common.view.C5753b;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.widget.k */
final /* synthetic */ class C4822k implements C5753b.AbstractC5757c {

    /* renamed from: a */
    private final LinkCrossRoomWidget f12673a;

    static {
        Covode.recordClassIndex(5404);
    }

    C4822k(LinkCrossRoomWidget linkCrossRoomWidget) {
        this.f12673a = linkCrossRoomWidget;
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.view.C5753b.AbstractC5757c
    /* renamed from: a */
    public final void mo10557a(View view) {
        ((LinearLayout) view).setOnClickListener(new View$OnClickListenerC4819h(this.f12673a));
    }
}
