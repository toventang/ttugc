package com.bytedance.android.livesdk.chatroom.p499ui;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.ui.cm */
public final /* synthetic */ class C7864cm implements AbstractC89171a {

    /* renamed from: a */
    private final C7822br f19587a;

    static {
        Covode.recordClassIndex(8659);
    }

    C7864cm(C7822br brVar) {
        this.f19587a = brVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89171a
    public final Object invoke() {
        C7822br brVar = this.f19587a;
        if (brVar.getActivity() == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        brVar.getActivity().finishAndRemoveTask();
        return null;
    }
}
