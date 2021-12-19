package com.bytedance.android.live.share;

import android.content.Context;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.bytedance.android.live.share.c */
public interface AbstractC6109c extends AbstractC2953a {
    static {
        Covode.recordClassIndex(6802);
    }

    AbstractView$OnClickListenerC5841f getShareBehavior(ActivityC0945e eVar, Context context, EnumC11728i iVar, AbstractC1204m mVar);

    LiveWidget getShareWidget();

    AbstractC6108b provideShareCountManager();

    AbstractC88979t<C5832d<ShareReportResult>> sendShare(long j, String str, int i, String str2, String str3);

    AbstractC6107a share();

    boolean shareable(Room room);
}
