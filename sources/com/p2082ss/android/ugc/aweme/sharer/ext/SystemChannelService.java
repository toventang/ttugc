package com.p2082ss.android.ugc.aweme.sharer.ext;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.C69584d;
import com.p2082ss.android.ugc.aweme.sharer.IChannelApi;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sharer.ext.SystemChannelService */
public final class SystemChannelService implements IChannelApi {
    static {
        Covode.recordClassIndex(81950);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.IChannelApi
    /* renamed from: a */
    public final String mo109795a() {
        return "more";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.IChannelApi
    /* renamed from: a */
    public final AbstractC69581b mo109794a(C69584d dVar) {
        C69626s sVar = null;
        if (!(dVar == null || dVar.f155422d == null)) {
            String str = dVar.f155422d;
            if (str == null) {
                C89219l.m154715b();
            }
            sVar = new C69626s(str);
        }
        return sVar;
    }
}
