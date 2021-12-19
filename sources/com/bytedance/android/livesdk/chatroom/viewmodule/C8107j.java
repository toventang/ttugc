package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import org.json.JSONObject;
import p4560f.p4561a.p4567d.AbstractC88434g;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.j */
final /* synthetic */ class C8107j implements AbstractC88434g {

    /* renamed from: a */
    private final BottomRightBannerWidget f20119a;

    static {
        Covode.recordClassIndex(8914);
    }

    C8107j(BottomRightBannerWidget bottomRightBannerWidget) {
        this.f20119a = bottomRightBannerWidget;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88434g
    public final Object apply(Object obj) {
        BottomRightBannerWidget bottomRightBannerWidget = this.f20119a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(StringSet.type, "refresh");
        jSONObject.put("data", obj);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("enter_from_merge", C6544e.m13987a()).put("enter_method", C6544e.m13990d()).put("event_page", bottomRightBannerWidget.f19805c ? "live_take_detail" : "live_detail").put("room_id", String.valueOf(bottomRightBannerWidget.f19804b.getId())).put("anchor_id", String.valueOf(bottomRightBannerWidget.f19804b.getOwnerUserId())).put("request_id", bottomRightBannerWidget.f19804b.getRequestId()).put("log_pb", bottomRightBannerWidget.f19804b.getLog_pb());
        jSONObject.put("log", jSONObject2);
        return jSONObject;
    }
}
