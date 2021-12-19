package com.bytedance.android.livesdk.userinfowidget;

import com.bytedance.android.livesdk.chatroom.p488c.C7402s;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.userinfowidget.f */
final /* synthetic */ class C11030f implements AbstractC89172b {

    /* renamed from: a */
    private final LiveRoomUserInfoWidget f26573a;

    static {
        Covode.recordClassIndex(12648);
    }

    C11030f(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f26573a = liveRoomUserInfoWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = this.f26573a;
        if (((C7402s) obj).f18340a) {
            long id = liveRoomUserInfoWidget.f26536q.getOwner().getId();
            if (!(liveRoomUserInfoWidget.f26538s || liveRoomUserInfoWidget.f26545z == null || !liveRoomUserInfoWidget.f26545z.isMicRoomForCurrentRoom() || liveRoomUserInfoWidget.f26536q == null || liveRoomUserInfoWidget.f26536q.officialChannelInfo == null || liveRoomUserInfoWidget.f26536q.officialChannelInfo.f23136a == null)) {
                id = liveRoomUserInfoWidget.f26536q.officialChannelInfo.f23136a.getId();
            }
            C11115u.m19743a().mo17915b().mo13160b(id).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142910a(liveRoomUserInfoWidget.getAutoUnbindTransformer()).mo142915a(new C11036l(liveRoomUserInfoWidget), C11037m.f26580a);
        }
        return C89391z.f203057a;
    }
}
