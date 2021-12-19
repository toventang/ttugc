package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.k */
final /* synthetic */ class C8108k implements AbstractC88433f {

    /* renamed from: a */
    private final BottomRightBannerWidget f20120a;

    static {
        Covode.recordClassIndex(8915);
    }

    C8108k(BottomRightBannerWidget bottomRightBannerWidget) {
        this.f20120a = bottomRightBannerWidget;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        BottomRightBannerWidget bottomRightBannerWidget = this.f20120a;
        bottomRightBannerWidget.f19806d.mo13252a(bottomRightBannerWidget.f19803a, "H5_roomStatusChange", (JSONObject) obj);
    }
}
