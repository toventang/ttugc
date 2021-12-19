package com.bytedance.android.live.p378m;

import android.content.Context;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

/* renamed from: com.bytedance.android.live.m.a */
public interface AbstractC5760a extends AbstractC2953a {
    static {
        Covode.recordClassIndex(6359);
    }

    Class<? extends LiveRecyclableWidget> getQAWidget();

    AbstractView$OnClickListenerC5841f getToolbarBehavior(Context context);
}
