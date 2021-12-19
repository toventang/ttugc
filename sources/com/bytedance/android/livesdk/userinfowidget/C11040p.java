package com.bytedance.android.livesdk.userinfowidget;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.covode.number.Covode;
import com.google.gson.C28022o;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.userinfowidget.p */
final /* synthetic */ class C11040p implements AbstractC88433f {

    /* renamed from: a */
    private final LiveRoomUserInfoWidget f26586a;

    static {
        Covode.recordClassIndex(12658);
    }

    C11040p(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f26586a = liveRoomUserInfoWidget;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).xSetStorageItem(this.f26586a.context, "user_subscribe_entry_info", ((C28022o) ((C5832d) obj).data).toString());
    }
}
