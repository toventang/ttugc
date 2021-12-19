package com.bytedance.android.livesdk.chatroom.p499ui;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.av */
final /* synthetic */ class C7772av implements AbstractC89172b {

    /* renamed from: a */
    private final C7770at f19293a;

    static {
        Covode.recordClassIndex(8567);
    }

    C7772av(C7770at atVar) {
        this.f19293a = atVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        C7770at atVar = this.f19293a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (!atVar.f19285I && booleanValue) {
            atVar.f19285I = true;
            atVar.mo14049D();
            atVar.mo14052a(0);
        }
        return C89391z.f203057a;
    }
}
