package com.bytedance.android.livesdk.widgets.giftwidget.p662b;

import com.bytedance.android.livesdk.C6903bd;
import com.bytedance.android.livesdk.C6904be;
import com.bytedance.android.livesdk.dialogv2.viewmodel.C8374a;
import com.bytedance.android.livesdk.gift.p548d.C8804h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.k */
final /* synthetic */ class C11494k implements AbstractC88433f {

    /* renamed from: a */
    private final C11483b f27567a;

    static {
        Covode.recordClassIndex(13153);
    }

    C11494k(C11483b bVar) {
        this.f27567a = bVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        String str;
        C11483b bVar = this.f27567a;
        C8804h hVar = (C8804h) obj;
        if (bVar.f27546a != null) {
            DataChannel dataChannel = bVar.f27546a;
            if (hVar.f21684a != null) {
                str = hVar.f21684a;
            } else {
                str = "first_recharge";
            }
            dataChannel.mo28320c(C6904be.class, new C6903bd(str, 0, "other_recharge", C8374a.C8375a.C8376a.f20718a.f20711e));
        }
    }
}
