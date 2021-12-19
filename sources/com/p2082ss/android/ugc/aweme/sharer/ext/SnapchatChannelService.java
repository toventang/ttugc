package com.p2082ss.android.ugc.aweme.sharer.ext;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.C69584d;
import com.p2082ss.android.ugc.aweme.sharer.IChannelApi;
import com.p2082ss.android.ugc.aweme.sharer.p3779a.AbstractC69575a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sharer.ext.SnapchatChannelService */
public final class SnapchatChannelService implements IChannelApi {
    static {
        Covode.recordClassIndex(81949);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.IChannelApi
    /* renamed from: a */
    public final String mo109795a() {
        return "snapchat";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.IChannelApi
    /* renamed from: a */
    public final AbstractC69581b mo109794a(C69584d dVar) {
        C69624r rVar = null;
        if (!(dVar == null || dVar.f155420b == null)) {
            AbstractC69575a aVar = dVar.f155420b;
            if (aVar == null) {
                C89219l.m154715b();
            }
            rVar = new C69624r(aVar);
        }
        return rVar;
    }
}
