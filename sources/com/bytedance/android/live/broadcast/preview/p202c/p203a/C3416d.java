package com.bytedance.android.live.broadcast.preview.p202c.p203a;

import android.content.Context;
import com.bytedance.android.live.broadcast.preview.p202c.AbstractC3411a;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.common.utility.C13624l;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.preview.c.a.d */
public final class C3416d implements AbstractC3411a {
    static {
        Covode.recordClassIndex(3900);
    }

    @Override // com.bytedance.android.live.broadcast.preview.p202c.AbstractC3411a
    /* renamed from: a */
    public final boolean mo8723a(AbstractC3411a.C3412a aVar) {
        C89219l.m154721d(aVar, "");
        Context context = aVar.f9641a;
        if (C58029j.f132251c == C13624l.EnumC13625a.UNKNOWN || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132251c = C13624l.m24488d(context);
        }
        if (C58029j.f132251c != C13624l.EnumC13625a.MOBILE_2G) {
            return false;
        }
        C11226ao.m19882a(context, (int) R.string.gtj);
        return true;
    }
}
