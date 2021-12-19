package com.bytedance.android.live.broadcast.preview.p202c.p203a;

import com.bytedance.android.live.broadcast.C3010ab;
import com.bytedance.android.live.broadcast.C3014af;
import com.bytedance.android.live.broadcast.model.EnumC3268l;
import com.bytedance.android.live.broadcast.preview.p202c.AbstractC3411a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.preview.c.a.a */
public final class C3413a implements AbstractC3411a {
    static {
        Covode.recordClassIndex(3897);
    }

    @Override // com.bytedance.android.live.broadcast.preview.p202c.AbstractC3411a
    /* renamed from: a */
    public final boolean mo8723a(AbstractC3411a.C3412a aVar) {
        C89219l.m154721d(aVar, "");
        DataChannel dataChannel = aVar.f9642b;
        if (dataChannel == null || dataChannel.mo28318b(C3010ab.class) == null) {
            return false;
        }
        aVar.f9642b.mo28320c(C3014af.class, EnumC3268l.NORMAL_BLOCK);
        return true;
    }
}
