package com.bytedance.android.live.broadcast.preview.p202c.p203a;

import android.content.Context;
import com.bytedance.android.live.broadcast.preview.p202c.AbstractC3411a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p456as.C6873g;
import com.bytedance.android.livesdk.p456as.C6876j;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.preview.c.a.b */
public final class C3414b implements AbstractC3411a {
    static {
        Covode.recordClassIndex(3898);
    }

    @Override // com.bytedance.android.live.broadcast.preview.p202c.AbstractC3411a
    /* renamed from: a */
    public final boolean mo8723a(AbstractC3411a.C3412a aVar) {
        C89219l.m154721d(aVar, "");
        Context context = aVar.f9641a;
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        if (b.mo13165e()) {
            return false;
        }
        AbstractC6872f b2 = C11115u.m19743a().mo17915b();
        C6876j.C6877a a = C6876j.m14732a();
        a.f17232a = C3966y.m9657a((int) R.string.gsv);
        a.f17234c = -1;
        a.f17236e = "video_take";
        a.f17237f = "open_live";
        a.f17235d = "bottom_tab";
        b2.mo13149a(context, a.mo13173a()).mo143062b(new C6873g());
        return true;
    }
}
