package com.bytedance.android.livesdk.dialogv2.p517c;

import android.view.View;
import com.bytedance.android.livesdk.gift.model.p553a.AbstractC8812b;
import com.bytedance.android.livesdk.model.C9543b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.dialogv2.c.b */
public final class C8358b extends C8350a {

    /* renamed from: l */
    private final View f20670l;

    static {
        Covode.recordClassIndex(9196);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8358b(View view) {
        super(view);
        C89219l.m154721d(view, "");
        this.f20670l = view;
    }

    @Override // com.bytedance.android.livesdk.dialogv2.p517c.C8350a
    /* renamed from: a */
    public final void mo14681a(AbstractC8812b<? extends C9543b> bVar, int i, DataChannel dataChannel) {
        this.f20670l.setVisibility(8);
    }
}
