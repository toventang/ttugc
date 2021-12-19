package com.p2082ss.android.ugc.aweme.sharer.ext;

import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.C69584d;
import com.p2082ss.android.ugc.aweme.sharer.IChannelApi;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sharer.ext.WhatsappStatusChannelService */
public final class WhatsappStatusChannelService implements IChannelApi {
    static {
        Covode.recordClassIndex(81956);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.IChannelApi
    /* renamed from: a */
    public final String mo109795a() {
        return "whatsapp_status";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.IChannelApi
    /* renamed from: a */
    public final AbstractC69581b mo109794a(C69584d dVar) {
        C69640y yVar = null;
        if (!(dVar == null || dVar.f155421c == null)) {
            Drawable drawable = dVar.f155421c;
            if (drawable == null) {
                C89219l.m154715b();
            }
            yVar = new C69640y(drawable);
        }
        return yVar;
    }
}
