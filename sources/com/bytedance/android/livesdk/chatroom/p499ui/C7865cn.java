package com.bytedance.android.livesdk.chatroom.p499ui;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.ui.cn */
public final /* synthetic */ class C7865cn implements AbstractC89171a {

    /* renamed from: a */
    private final C7822br f19588a;

    static {
        Covode.recordClassIndex(8660);
    }

    C7865cn(C7822br brVar) {
        this.f19588a = brVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89171a
    public final Object invoke() {
        C7822br brVar = this.f19588a;
        if (brVar.getActivity() == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        brVar.getActivity().finishAndRemoveTask();
        return null;
    }
}
