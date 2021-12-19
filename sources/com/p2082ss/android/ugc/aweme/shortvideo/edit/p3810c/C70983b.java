package com.p2082ss.android.ugc.aweme.shortvideo.edit.p3810c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.property.C65444e;
import com.p2082ss.android.ugc.aweme.setting.C68065d;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70516a;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoeditv2.C70563d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.c.b */
public final class C70983b {

    /* renamed from: a */
    public static final C70983b f158884a = new C70983b();

    private C70983b() {
    }

    static {
        Covode.recordClassIndex(83477);
    }

    /* renamed from: a */
    public static boolean m125339a() {
        C70005cr a = C70005cr.m123611a();
        C89219l.m154716b(a, "");
        if (a.f156494n.booleanValue() || !C65444e.m117163a()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final void m125338a(AbstractC70516a aVar) {
        C89219l.m154721d(aVar, "");
        aVar.setMaxVideoLength(C70563d.m124624a());
    }

    /* renamed from: a */
    public static final String m125337a(Context context) {
        C89219l.m154721d(context, "");
        String string = context.getResources().getString(R.string.czt, Long.valueOf(C68065d.m120371a() / 60000));
        C89219l.m154716b(string, "");
        return string;
    }
}
