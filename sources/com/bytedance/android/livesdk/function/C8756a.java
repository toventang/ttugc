package com.bytedance.android.livesdk.function;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.function.a */
final /* synthetic */ class C8756a implements AbstractC89172b {

    /* renamed from: a */
    private final LiveRoomNotifyWidget f21611a;

    static {
        Covode.recordClassIndex(9633);
    }

    C8756a(LiveRoomNotifyWidget liveRoomNotifyWidget) {
        this.f21611a = liveRoomNotifyWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        LiveRoomNotifyWidget liveRoomNotifyWidget = this.f21611a;
        Boolean bool = (Boolean) obj;
        if (liveRoomNotifyWidget.getView().getVisibility() == 0) {
            if (bool.booleanValue()) {
                liveRoomNotifyWidget.getView().setVisibility(4);
            } else {
                liveRoomNotifyWidget.show();
            }
        }
        return C89391z.f203057a;
    }
}
