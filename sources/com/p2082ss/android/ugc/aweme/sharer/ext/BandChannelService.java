package com.p2082ss.android.ugc.aweme.sharer.ext;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.C69584d;
import com.p2082ss.android.ugc.aweme.sharer.IChannelApi;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sharer.ext.BandChannelService */
public final class BandChannelService implements IChannelApi {
    static {
        Covode.recordClassIndex(81932);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.IChannelApi
    /* renamed from: a */
    public final String mo109795a() {
        return "band";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.IChannelApi
    /* renamed from: a */
    public final AbstractC69581b mo109794a(C69584d dVar) {
        C69586a aVar = null;
        if (!(dVar == null || dVar.f155419a == null)) {
            String str = dVar.f155419a;
            if (str == null) {
                C89219l.m154715b();
            }
            aVar = new C69586a(str);
        }
        return aVar;
    }
}
