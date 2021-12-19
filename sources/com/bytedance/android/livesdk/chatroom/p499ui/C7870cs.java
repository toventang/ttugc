package com.bytedance.android.livesdk.chatroom.p499ui;

import com.bytedance.android.livesdk.chatroom.p488c.C7398o;
import com.bytedance.android.livesdk.livesetting.LiveBannerExperiment;
import com.bytedance.android.livesdk.p561j.C9074cm;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.cs */
final /* synthetic */ class C7870cs implements AbstractC89172b {

    /* renamed from: a */
    private final C7822br f19593a;

    static {
        Covode.recordClassIndex(8665);
    }

    C7870cs(C7822br brVar) {
        this.f19593a = brVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        C7822br brVar = this.f19593a;
        C7398o oVar = (C7398o) obj;
        if (brVar.isViewValid() && brVar.f19514v != null) {
            if (oVar.f18328a == 0) {
                brVar.f19514v.setAnchorInteractMode(true);
                brVar.f19507o = true;
            } else if (oVar.f18328a == 1) {
                brVar.f19514v.setAnchorInteractMode(false);
                brVar.f19507o = false;
            }
            if (brVar.f19423V == null || !((Boolean) brVar.f19423V.mo28318b(C9074cm.class)).booleanValue()) {
                int[] iArr = new int[2];
                brVar.f19514v.getVideoSize(iArr);
                if (!(iArr[0] == 0 || iArr[1] == 0)) {
                    brVar.mo14094a(iArr[0], iArr[1], C13628n.m24504a(brVar.getContext()));
                }
                if (oVar.f18328a == 0) {
                    if (LiveBannerExperiment.isNewBannerEnable()) {
                        brVar.mo14093a(oVar.f18331d);
                    }
                } else if (oVar.f18328a == 1) {
                    brVar.mo14093a(0);
                }
            }
        }
        return C89391z.f203057a;
    }
}
