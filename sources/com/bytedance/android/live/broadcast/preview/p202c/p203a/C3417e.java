package com.bytedance.android.live.broadcast.preview.p202c.p203a;

import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.broadcast.preview.p202c.AbstractC3411a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.preview.c.a.e */
public final class C3417e implements AbstractC3411a {
    static {
        Covode.recordClassIndex(3901);
    }

    @Override // com.bytedance.android.live.broadcast.preview.p202c.AbstractC3411a
    /* renamed from: a */
    public final boolean mo8723a(AbstractC3411a.C3412a aVar) {
        C89219l.m154721d(aVar, "");
        AbstractC2953a a = C6193a.m13435a(IHostContext.class);
        C89219l.m154716b(a, "");
        if (!((IHostContext) a).isNeedProtectMinor()) {
            return false;
        }
        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gq9);
        return true;
    }
}
