package com.bytedance.android.live.liveinteract.cohost.widget;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.platform.common.view.C5753b;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.p430ab.C6581g;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.widget.l */
final /* synthetic */ class C4823l implements C5753b.AbstractC5756b {

    /* renamed from: a */
    private final LinkCrossRoomWidget f12674a;

    static {
        Covode.recordClassIndex(5405);
    }

    C4823l(LinkCrossRoomWidget linkCrossRoomWidget) {
        this.f12674a = linkCrossRoomWidget;
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.view.C5753b.AbstractC5756b
    /* renamed from: a */
    public final void mo10550a(View view, Object obj) {
        LinkCrossRoomWidget linkCrossRoomWidget = this.f12674a;
        LinearLayout linearLayout = (LinearLayout) view;
        User user = (User) obj;
        ((TextView) linearLayout.findViewById(R.id.f02)).setText(C6581g.m14076b(user));
        C7577g.m15570a((ImageView) linearLayout.findViewById(R.id.bdw), user.getAvatarThumb(), 2131234441);
        if (linkCrossRoomWidget.f12641e && !linkCrossRoomWidget.f12646j) {
            linearLayout.setVisibility(8);
        } else if (linkCrossRoomWidget.f12647k != null && linkCrossRoomWidget.f12647k.f13230v) {
            linearLayout.setVisibility(0);
        } else if (linkCrossRoomWidget.f12647k == null) {
            linearLayout.setVisibility(0);
        }
    }
}
