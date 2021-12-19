package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.live.liveinteract.api.AbstractC4409b;
import com.bytedance.android.live.liveinteract.api.AbstractC4433d;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.p488c.C7398o;
import com.bytedance.android.livesdk.chatroom.widget.AbstractC8170a;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.be */
final /* synthetic */ class C8082be implements AbstractC89172b {

    /* renamed from: a */
    private final DecorationWrapperWidget f20096a;

    static {
        Covode.recordClassIndex(8889);
    }

    C8082be(DecorationWrapperWidget decorationWrapperWidget) {
        this.f20096a = decorationWrapperWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        DecorationWrapperWidget decorationWrapperWidget = this.f20096a;
        C7398o oVar = (C7398o) obj;
        if (oVar.f18328a == 0) {
            AbstractC4433d linkCrossRoomWidget = ((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).linkCrossRoomWidget();
            if (linkCrossRoomWidget != null) {
                decorationWrapperWidget.f19873c[1] = linkCrossRoomWidget.mo10209c() + linkCrossRoomWidget.mo10208b();
            }
        } else {
            if (oVar.f18328a == 1) {
                decorationWrapperWidget.f19873c = decorationWrapperWidget.f19874d;
            }
            return C89391z.f203057a;
        }
        for (AbstractC8170a aVar : decorationWrapperWidget.f19875e) {
            aVar.mo14397a(decorationWrapperWidget.f19873c);
        }
        return C89391z.f203057a;
    }
}
