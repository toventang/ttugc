package com.bytedance.android.livesdk.function;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.p561j.C9096dh;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.rank.api.AbstractC10339d;
import com.bytedance.android.livesdk.rank.api.EnumC10345i;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.function.d */
final /* synthetic */ class View$OnClickListenerC8759d implements View.OnClickListener {

    /* renamed from: a */
    private final LiveRoomNotifyWidget f21614a;

    static {
        Covode.recordClassIndex(9636);
    }

    View$OnClickListenerC8759d(LiveRoomNotifyWidget liveRoomNotifyWidget) {
        this.f21614a = liveRoomNotifyWidget;
    }

    public final void onClick(View view) {
        LiveRoomNotifyWidget liveRoomNotifyWidget = this.f21614a;
        if (liveRoomNotifyWidget.f21586g != null && liveRoomNotifyWidget.dataChannel != null) {
            String str = liveRoomNotifyWidget.f21586g.f23603h;
            if (!TextUtils.isEmpty(str)) {
                Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                buildUpon.appendQueryParameter("gift_enter_from", "announcements");
                Uri build = buildUpon.build();
                if ("webcast_gift_dialog".equals(build.getHost())) {
                    ((IGiftService) C6193a.m13435a(IGiftService.class)).monitorBroadcastClicked(Long.parseLong(build.getQueryParameter("gift_id")));
                    ((IActionHandlerService) C6193a.m13435a(IActionHandlerService.class)).handle(liveRoomNotifyWidget.context, build);
                } else if (!"webcast_room".equals(build.getHost())) {
                    ((IActionHandlerService) C6193a.m13435a(IActionHandlerService.class)).handle(liveRoomNotifyWidget.context, build);
                } else if (TextUtils.equals(build.getQueryParameter("enter_method"), "weekly_rank_notice")) {
                    String queryParameter = build.getQueryParameter("room_id");
                    if (TextUtils.equals(queryParameter, String.valueOf(liveRoomNotifyWidget.dataChannel.mo28318b(C9096dh.class)))) {
                        return;
                    }
                    if (liveRoomNotifyWidget.dataChannel == null || liveRoomNotifyWidget.dataChannel.mo28318b(C9119ed.class) == null || !((Boolean) liveRoomNotifyWidget.dataChannel.mo28318b(C9119ed.class)).booleanValue()) {
                        String queryParameter2 = build.getQueryParameter("anchor_id");
                        try {
                            ((AbstractC10339d) C6193a.m13435a(AbstractC10339d.class)).getRankRoomIds(Long.parseLong(queryParameter2), Long.parseLong(queryParameter), EnumC10345i.WEEKLY_RANK.getType(), liveRoomNotifyWidget.widgetCallback.getFragment(), liveRoomNotifyWidget.provideDataChannel(), new C8761f(build, queryParameter2, queryParameter));
                        } catch (NumberFormatException e) {
                            C3854a.m9455a(6, "LiveRoomNotifyWidget", e.getStackTrace());
                        }
                    } else {
                        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e6r);
                    }
                }
            }
        }
    }
}
