package com.bytedance.android.livesdk.chatroom.p499ui;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ct */
final /* synthetic */ class C7871ct implements AbstractC89172b {

    /* renamed from: a */
    private final C7822br f19594a;

    static {
        Covode.recordClassIndex(8666);
    }

    C7871ct(C7822br brVar) {
        this.f19594a = brVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        C7822br brVar = this.f19594a;
        if (((Boolean) obj).booleanValue()) {
            brVar.f19422U = System.currentTimeMillis();
        } else if (brVar.f19422U > 0) {
            brVar.f19421T += System.currentTimeMillis() - brVar.f19422U;
            brVar.f19422U = 0;
        }
        return C89391z.f203057a;
    }
}
