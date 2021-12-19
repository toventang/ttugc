package com.bytedance.android.livesdk.p642u;

import com.bytedance.android.live.broadcast.widget.SelectDonationStickerWidget;
import com.bytedance.android.live.p209c.AbstractC3807b;
import com.bytedance.android.live.p209c.C3808c;
import com.bytedance.android.live.p209c.C3810e;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.chatroom.p499ui.p501b.C7778a;
import com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.DonationStickerAnchorWidget;
import com.bytedance.android.livesdk.model.C9537au;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.C17848h;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.u.a */
public class C10932a implements AbstractC3807b {
    static {
        Covode.recordClassIndex(12542);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.p209c.AbstractC3807b
    public Class<? extends C17848h<List<C9537au>>> getDonationDecorationsEvent() {
        return C3808c.class;
    }

    @Override // com.bytedance.android.live.p209c.AbstractC3807b
    public Class<? extends LiveRecyclableWidget> getDonationStickerAnchorWidget() {
        return DonationStickerAnchorWidget.class;
    }

    @Override // com.bytedance.android.live.p209c.AbstractC3807b
    public Class<? extends C17848h<C9537au>> getRoomStickersEvent() {
        return C3810e.class;
    }

    @Override // com.bytedance.android.live.p209c.AbstractC3807b
    public LiveWidget getDecorationWidget() {
        return new DecorationWrapperWidget();
    }

    @Override // com.bytedance.android.live.p209c.AbstractC3807b
    public AbstractC11293v getPropsStickerDialog() {
        return new C7778a();
    }

    @Override // com.bytedance.android.live.p209c.AbstractC3807b
    public LiveWidget getSelectDonationStickerWidget() {
        return new SelectDonationStickerWidget();
    }
}
