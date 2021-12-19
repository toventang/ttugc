package com.bytedance.android.live.liveinteract.cohost.widget;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.liveinteract.platform.common.view.C5753b;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.widget.m */
final /* synthetic */ class C4824m implements C5753b.AbstractC5757c {

    /* renamed from: a */
    private final LinkCrossRoomWidget f12675a;

    static {
        Covode.recordClassIndex(5406);
    }

    C4824m(LinkCrossRoomWidget linkCrossRoomWidget) {
        this.f12675a = linkCrossRoomWidget;
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.view.C5753b.AbstractC5757c
    /* renamed from: a */
    public final void mo10557a(View view) {
        ((ImageView) view).setOnClickListener(new View$OnClickListenerC4818g(this.f12675a));
    }
}
