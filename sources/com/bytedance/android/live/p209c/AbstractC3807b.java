package com.bytedance.android.live.p209c;

import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.model.C9537au;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.C17848h;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import java.util.List;

/* renamed from: com.bytedance.android.live.c.b */
public interface AbstractC3807b extends AbstractC2953a {
    static {
        Covode.recordClassIndex(4333);
    }

    LiveWidget getDecorationWidget();

    Class<? extends C17848h<List<C9537au>>> getDonationDecorationsEvent();

    Class<? extends LiveRecyclableWidget> getDonationStickerAnchorWidget();

    AbstractC11293v getPropsStickerDialog();

    Class<? extends C17848h<C9537au>> getRoomStickersEvent();

    LiveWidget getSelectDonationStickerWidget();
}
