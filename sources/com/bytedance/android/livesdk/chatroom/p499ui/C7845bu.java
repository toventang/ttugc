package com.bytedance.android.livesdk.chatroom.p499ui;

import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.design.view.C4087e;
import com.bytedance.android.livesdk.p441ah.C6684c;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.bu */
final /* synthetic */ class C7845bu implements AbstractC89172b {

    /* renamed from: a */
    private final C7822br f19565a;

    static {
        Covode.recordClassIndex(8640);
    }

    C7845bu(C7822br brVar) {
        this.f19565a = brVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        C7822br brVar = this.f19565a;
        Boolean bool = (Boolean) obj;
        C6684c.C6686b.m14211a().f16588f = bool.booleanValue();
        if (bool.booleanValue()) {
            C4087e.C4091c.f11305a.mo9544a(false);
        } else {
            int[] iArr = new int[2];
            if (brVar.f19514v != null) {
                brVar.f19514v.getVideoSize(iArr);
            }
            C3854a.m9453a(4, "picture_in_picture", "{" + iArr[0] + "," + iArr[1] + "}");
            if (!(iArr[0] == 0 || iArr[1] == 0)) {
                brVar.mo14094a(iArr[0], iArr[1], C13628n.m24504a(brVar.getContext()));
            }
            if (brVar.f19496d == null || brVar.f19496d.maskLayer == null) {
                C4087e.C4091c.f11305a.mo9544a(true);
            }
        }
        return C89391z.f203057a;
    }
}
