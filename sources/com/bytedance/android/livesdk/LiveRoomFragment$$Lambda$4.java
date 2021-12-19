package com.bytedance.android.livesdk;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1192f;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.livesdk.chatroom.backroom.p485d.C7349a;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class LiveRoomFragment$$Lambda$4 implements AbstractC1192f {

    /* renamed from: a */
    private final C6561ab f15993a;

    /* renamed from: b */
    private final ActivityC0945e f15994b;

    static {
        Covode.recordClassIndex(7150);
    }

    LiveRoomFragment$$Lambda$4(C6561ab abVar, ActivityC0945e eVar) {
        this.f15993a = abVar;
        this.f15994b = eVar;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        C6561ab abVar = this.f15993a;
        if (this.f15994b.isFinishing() && aVar.equals(AbstractC1196i.EnumC1198a.ON_DESTROY)) {
            abVar.mo12705f();
            if (abVar.f16406n.mo18714b() == abVar.f16401i) {
                abVar.f16406n.mo18713a();
            }
            C7349a.f18227a = null;
        }
    }
}
