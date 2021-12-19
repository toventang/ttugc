package com.bytedance.android.livesdk.userinfowidget;

import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.userinfowidget.y */
final /* synthetic */ class C11049y implements AbstractC88433f {

    /* renamed from: a */
    private final LiveRoomUserInfoWidget.C110142 f26595a;

    static {
        Covode.recordClassIndex(12667);
    }

    C11049y(LiveRoomUserInfoWidget.C110142 r1) {
        this.f26595a = r1;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        LiveRoomUserInfoWidget.C110142 r2 = this.f26595a;
        if (LiveRoomUserInfoWidget.this.f26503A == LiveRoomUserInfoWidget.EnumC11022a.FOLLOW_ANIM) {
            LiveRoomUserInfoWidget.this.mo17857a(LiveRoomUserInfoWidget.EnumC11022a.UNSUBSCRIBE);
        }
    }
}
