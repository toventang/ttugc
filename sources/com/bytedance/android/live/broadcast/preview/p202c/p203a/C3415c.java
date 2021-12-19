package com.bytedance.android.live.broadcast.preview.p202c.p203a;

import android.content.Context;
import com.bytedance.android.live.broadcast.preview.p202c.AbstractC3411a;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.preview.c.a.c */
public final class C3415c implements AbstractC3411a {
    static {
        Covode.recordClassIndex(3899);
    }

    /* renamed from: a */
    private static boolean m8837a() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.p202c.AbstractC3411a
    /* renamed from: a */
    public final boolean mo8723a(AbstractC3411a.C3412a aVar) {
        C89219l.m154721d(aVar, "");
        Context context = aVar.f9641a;
        if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132253e = m8837a();
        }
        if (C58029j.f132253e) {
            return false;
        }
        C11226ao.m19882a(context, (int) R.string.gj3);
        return true;
    }
}
