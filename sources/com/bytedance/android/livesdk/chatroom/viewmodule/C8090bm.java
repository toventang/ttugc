package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.graphics.Color;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.bm */
final /* synthetic */ class C8090bm implements AbstractC89172b {

    /* renamed from: a */
    private final FullVideoButtonWidget f20104a;

    static {
        Covode.recordClassIndex(8897);
    }

    C8090bm(FullVideoButtonWidget fullVideoButtonWidget) {
        this.f20104a = fullVideoButtonWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        this.f20104a.getView().setBackgroundColor(((Boolean) obj).booleanValue() ? 0 : Color.parseColor("#2B2B2B"));
        return C89391z.f203057a;
    }
}
